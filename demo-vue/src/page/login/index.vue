<template>
    <div class="main">
        <div class="page">
            <div class="top">

            </div>

            <div class="content">
                <div class="r1" v-show="loginFlag">
                    <div class="title">登录</div>

                    <el-form :model="loginInfo" :rules="rules" ref="loginInfo">
                        <el-form-item prop="name">
                            <el-input v-model="loginInfo.name" placeholder="请输入账号"></el-input>
                        </el-form-item>
                        <el-form-item prop="password">
                            <el-input type="password" v-model="loginInfo.password" placeholder="请输入密码"></el-input>
                        </el-form-item>
                    </el-form>

                    <div class="r1-c3">
                        <el-button @click="registerShow" type="text">注册</el-button>
                        <el-button type="primary" @click="submitForm('loginInfo')">登录</el-button>
                    </div>
                </div>

                <div class="r1" v-show="registerFlag">
                    <div class="title">注册</div>
                    <el-form :model="registerInfo" :rules="rules" ref="registerInfo">
                        <el-form-item prop="name">
                            <el-input v-model="registerInfo.name" placeholder="请输入账号"></el-input>
                        </el-form-item>
                        <el-form-item prop="password">
                            <el-input type="password" v-model="registerInfo.password" placeholder="请输入密码"></el-input>
                        </el-form-item>
                    </el-form>
                    <div class="r1-c3">
                        <el-button @click="loginShow" type="text">返回</el-button>
                        <el-button type="primary" @click="submitForm('registerInfo')">完成</el-button>
                    </div>
                </div>
            </div>

            <div class="bottom">

            </div>

        </div>
    </div>

</template>

<script>
  import {md5} from '@/utils/md5'

  export default {
    components: {},
    props: [
      // 接受父组件传的数据
    ],
    data() {
      return {

        loginInfo: {
          name: '',
          password: '',
        },
        registerInfo: {
          name: '',
          password: '',
        },
        loginFlag: true,
        registerFlag: false,
        rules: {
          name: [
            {required: true, message: '请输入帐号', trigger: 'blur'},
            {min: 5, max: 8, message: '长度在 5 到 8 个字符', trigger: 'blur'}
          ],
          password: [
            {required: true, message: '请输入密码', trigger: 'blur'},
            {min: 5, max: 8, message: '长度在 5 到 8 个字符', trigger: 'blur'}
          ],
        }
      };
    },
    watch: {},
    created() {
    },
    mounted() {
    },
    methods: {
      registerShow() {
        this.loginFlag = false
        this.registerFlag = true;
      },
      loginShow() {
        this.loginFlag = true
        this.registerFlag = false;
      },
      submitForm(formName) {
        this.$refs[formName].validate((valid) => {
          if (valid) {
            if (this.loginFlag) {
              let req = this.loginInfo
              this.$post('/userLogin', {req}).then((data) => {
                console.log(data)
              });
            } else {
              let req = {name: this.registerInfo.name, password: md5(this.registerInfo.password)}
              this.$service.post('/userAdd', req).then((data) => {
                console.log(data)
              });
            }


          } else {
            // console.log('error submit!!');
            return false;
          }
        });
      },

    }
  }
</script>

<style lang="scss" scoped>
    .main {
        height: 100vh;
        margin: 0;
        padding: 0;
        display: flex;

        .page {
            /*width: 1300px;*/
            /*height: 700px;*/
            /*min-width: 1300px;*/
            /*min-height: 700px;*/
            margin: auto auto;

            .top {

            }

            .content {
                height: 320px;
                width: 400px;
                display: flex;
                justify-content: center;
                border-radius: 11px;
                border: 1px solid #409EFF;
                box-shadow: 9px 9px 9px rgba(64, 158, 255, 0.31);

                .r1 {
                    margin-top: 20px;
                    width: 60%;
                    color: #409EFF;

                    div {
                        margin-top: 10px;
                        text-align: center;
                    }

                    .title {
                        font-size: 28px;
                    }

                    .r1-c3 {
                        margin-top: 30px;
                        display: flex;
                        justify-content: space-between;
                    }

                }


            }

            .bottom {

            }
        }
    }
</style>