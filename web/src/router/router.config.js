/**
 * 基础路由
 * @type { *[] }
 */
export const constantRouterMap = [
  {
    path: '/',
    component: () => import('@/views/layouts/index'),
    redirect: '/home',
    meta: {
      title: '首页',
      keepAlive: false
    },
    children: [
      {
        path: '/home',
        name: 'Home',
        component: () => import('@/views/home/index'),
        meta: { title: '首页', keepAlive: false }
      },
      {
        path: '/about',
        name: 'About',
        component: () => import('@/views/home/about'),
        meta: { title: '关于', keepAlive: false }
      },
      {
        path: '/rose',
        name: 'rose',
        component: () => import('@/views/home/rose'),
        meta: { title: '玫瑰', keepAlive: false }
      },
      {
        name: 'howLong',
        path: '/howLong',
        component: () => import('@/views/home/howLongToKnow'),
        meta: { title: '相识时间', keepAlive: false, full: true }
      },
      {
        name: 'diary',
        path: '/diary',
        component: () => import('@/views/home/diary/index'),
        meta: { title: '朝夕与共', keepAlive: false, full: true }
      },
      {
        path: '/diary/detail',
        component: () => import('@/views/home/diary/detail'),
        meta: { title: '详情', keepAlive: false }
      },
      {
        name: 'login',
        path: '/login',
        component: () => import('@/views/home/login'),
        meta: { title: '登录', keepAlive: false, full: true }
      },
      {
        name: 'msgBox',
        path: '/msgBox',
        component: () => import('@/views/home/msgBox'),
        meta: { title: '登录', keepAlive: false }
      },
      {
        name: 'unhappy',
        path: '/unhappy',
        component: () => import('@/views/home/sad'),
        meta: { title: '登录', keepAlive: false }
      },
      {
        name: 'happy',
        path: '/sentence',
        component: () => import('@/views/home/sad'),
        meta: { title: '登录', keepAlive: false }
      }]
  }
]
