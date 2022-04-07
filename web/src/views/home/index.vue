<!-- home -->
<template>
  <div class="index-container">
    <!--<div class="app" v-for=" item of list" :key="item.name">
      <van-icon :name="item.icon" size="4em"/>
      <div>{{item.name}}</div>
    </div>-->
    <van-grid clickable gutter="2px">
      <van-grid-item v-for=" item of list" :key="item.name" :icon="item.icon" :text="item.name" :to="item.to"/>
    </van-grid>
  </div>
</template>

<script>
import {getHttpDom} from "@/utils/catch";

export default {
  data() {
    return {
      list: [
        { name: '朝夕与共', icon: 'todo-list-o', to: { name: 'diary' }},
        { name: '相逢之时', icon: 'underway-o', to: { name: 'howLong' }}
      ]
    }
  },

  computed: {},

  mounted() {
    window.getHtml=getHttpDom
  },

  methods: {}
}
</script>
<style lang="scss" scoped>
</style>
