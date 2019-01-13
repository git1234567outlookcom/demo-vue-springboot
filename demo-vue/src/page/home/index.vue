<template>
    <div class="main">
        <div class="page">
            <div class="top">

            </div>

            <div class="content">
                home
            </div>

            <div class="bottom">

            </div>

        </div>
    </div>

</template>

<script>
  export default {
    components: {},
    props: [
      // 接受父组件传的数据
    ],
    data() {
      return {};
    },
    watch: {},
    created() {
    },
    mounted() {
    },
    methods: {}
  }
</script>

<style lang="scss" scoped>


    .main {
        height: 100vh;
        margin: 0;
        padding: 0;
        display: flex;

        .page {
            width: 1300px;
            height: 700px;
            min-width: 1300px;
            min-height: 700px;
            background-color: #CCE8CF;
            margin: auto auto;

            .top {

            }

            .content {

            }

            .bottom {

            }
        }
    }
</style>