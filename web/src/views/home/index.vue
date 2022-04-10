<!-- home -->
<template>
  <div class="index-container">
    <!--<div class="app" v-for=" item of list" :key="item.name">
      <van-icon :name="item.icon" size="4em"/>
      <div>{{item.name}}</div>
    </div>-->
    <van-grid clickable gutter="2px" column-num="3" icon-size="1rem">
      <van-grid-item v-for=" item of list" :key="item.name" :icon="item.icon" :text="item.name" :to="item.to"/>
    </van-grid>
  </div>
</template>

<script>

export default {
  data() {
    return {
      list: [
        { name: '朝夕与共', icon: require('@/assets/icon/loveRecord.svg'), to: { name: 'diary' }},
        { name: '相逢之时', icon: require('@/assets/icon/keyRecordDay.svg'), to: { name: 'howLong' }},
        { name: '小小伤害', icon: require('@/assets/icon/emo-sad.svg'), to: { name: 'sad' }},
        { name: '每日一笑', icon: require('@/assets/icon/emo-happy.svg'), to: { name: 'happy' }},
        { name: '舔狗日记', icon: require('@/assets/icon/emo-g-smile.svg'), to: { name: 'happy' }}
      ]
    }
  },

  computed: {},

  mounted() {
  },

  methods: {}
}
</script>
<style lang="scss" scoped>
</style>
