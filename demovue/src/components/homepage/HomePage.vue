<template>

  <header>
    <div class="wrapper">
      <a href="#/">User</a> |
      <a href="#/create">CreateUser</a> |
    </div>
  </header>

  <main>
    <component :is="currentView" />
  </main>
</template>

<script>
import CreateUser from "@/components/user/CreateUser.vue";
import ShowUser from "@/components/user/ShowUser.vue";
const routes = {
  '/': ShowUser,
  '/create': CreateUser
}

export default {
  data() {
    return {
      currentPath: window.location.hash
    }
  },
  computed: {
    currentView() {
      return routes[this.currentPath.slice(1) || '/'] || NotFound
    }
  },
  mounted() {
    window.addEventListener('hashchange', () => {
      this.currentPath = window.location.hash
    })
  },
  name: "HomePage",
  components: {CreateUser,ShowUser}
}
</script>

<style scoped>

</style>