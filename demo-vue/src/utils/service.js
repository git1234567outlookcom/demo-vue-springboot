import axios from 'axios'

// 创建axios实例
const service = axios.create({
  // baseURL: process.env.BASE_API, // api 的 base_url
  baseURL: '/demo',
  // responseType: 'json',
  withCredentials: true, // 是否允许带cookie这些
  headers: {
    'content-type': 'application/json;'
  },
})


// 封装成一个插件的形式
export default {
  install: function (Vue, Option) {
    Object.defineProperty(Vue.prototype, '$service', {
      value: service
    });
  }
};