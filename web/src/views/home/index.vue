<!-- home -->
<template>
  <div class="index-container">
    <van-icon v-for="item in list" :key="item.name" :name="item.name" size="4em"/>
  </div>
</template>

<script>
export default {
  data() {
    return {
      list: [
        { name: 'todo-list-o' }
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
