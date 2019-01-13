import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import Login from '../page/login/index'
import Error from '../page/login/404'
import Home from '../page/home/index'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      component: Login,
      // component: () => import('../page/login/index'),
      // hidden: true
    },
    {
      path: '/home',
      name: 'Home',
      component: Home
    },
    {
      path: '/404',
      component: Error
    },
    {
      path: '/hello',
      name: 'HelloWorld',
      component: HelloWorld
    }
  ],


})


