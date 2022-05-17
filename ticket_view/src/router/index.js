import Vue from 'vue'
import VueRouter from 'vue-router'
import homePage from "@/view/homePage";


Vue.use(VueRouter)

const routes = [
    {
        path: '/',
        name: 'Home',
        component: homePage
    },
    // {
    //     path: '/home',
    //     name: 'Home',
    //     component: () => import('../views/Home')
    // },
    // {
    //     path: '/admin',
    //     name: 'Admin',
    //     component: () => import('../views/Admin.vue')
    // }
]

const router = new VueRouter({
    routes
})

export default router
