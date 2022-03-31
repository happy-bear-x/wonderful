<template>
  <div class="p5">
    <van-field placeholder="用户名/手机号" label="用户名" v-model="loginForm.username"/>
    <van-field type="password" placeholder="密码" label="密码" v-model="loginForm.password"/>
    <van-button type="info" block @click="login">登录</van-button>
  </div>

</template>

<script>
// import Cookies from 'js-cookie'

import { Toast } from 'vant'

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
