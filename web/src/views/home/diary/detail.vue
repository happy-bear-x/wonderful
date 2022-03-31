<template>
  <div v-text="diary.content"></div>
</template>

<script>
import { getDiary } from '@/api/diary'

export default {
  name: 'Detail',
  data() {
    return {
      diary: {}
    }
  },
  created() {
    this.getDiary()
  },
  methods: {
    getDiary() {
      getDiary().then(r => {
        this.diary = r
      })
    }
  }
}
</script>

<style scoped>

</style>
