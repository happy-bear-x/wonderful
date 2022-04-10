<template>
  <div class="app-container">
    <title-bar v-if="!($route.meta.hideBar||$route.meta.full)"/>
    <div class="layout-content">
      <keep-alive v-if="$route.meta.keepAlive">
        <router-view></router-view>
      </keep-alive>
      <router-view v-else></router-view>
    </div>
    <div class="layout-footer" v-if="!($route.meta.hideTab||$route.meta.full)">
      <TabBar :data="tabbars" @change="handleChange"/>
    </div>
  </div>
</template>

<script>
import TabBar from '@/components/TabBar'
import TitleBar from '@/views/layouts/TitleBar'

export default {
  name: 'AppLayout',
  data() {
    return {
      tabbars: [
        {
          title: '首页',
          to: {
            name: 'Home'
          },
          icon: 'home-o'
        }
      ]
    }
  },
  components: {
    TabBar,
    TitleBar
  },
  methods: {
    handleChange(v) {
      console.log('tab value:', v)
    }
  }
}
</script>
