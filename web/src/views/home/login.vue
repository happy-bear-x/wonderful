<template>
  <div>
    <van-cell placeholder="用户名/手机号"/>
    <van-cell type="password" placeholder="密码"/>
  </div>

</template>

<script>
// import Cookies from 'js-cookie'

import {Toast} from "vant";

export default {
  name: 'Login',
  data() {
    return {
      loginForm: {}
    }
  },
  methods: {
    login() {
      // if (this.loginForm.rememberMe) {
      //   Cookies.set('username', this.loginForm.username, { expires: 30 })
      //   Cookies.set('password', this.loginForm.password, { expires: 30 })
      //   // Cookies.set('rememberMe', this.loginForm.rememberMe, { expires: 30 })
      // } else {
      //   Cookies.remove('username')
      //   Cookies.remove('password')
      //   // Cookies.remove('rememberMe')
      // }
      this.$store.dispatch('Login', this.loginForm).then(() => {
        // this.$router.push({ path: this.redirect || '/' }).catch(() => {})
        Toast.success('登录成功')
      }).catch(() => {
        /* if (this.captchaOnOff) {
          this.getCode()
        }*/
      })
    }
  }
}
</script>

<style scoped>

</style>
