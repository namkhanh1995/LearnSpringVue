<template>
  <div>
    <h2> Contact US </h2>
    <form v-on:submit.prevent="submitForm">
      <div class="form-group">
        <label for="id">ID</label>
        <input type="text" class="form-control" id="id" placeholder="1" v-model="form.id">
      </div>
      <div class="form-group">
        <label for="firstName">First Name</label>
        <input type="text" class="form-control" id="firstName" placeholder="Khanh"
               v-model="form.firstName">
      </div>
      <div class="form-group">
        <label for="lastName">Last Name</label>
        <input type="text" class="form-control" id="lastName" placeholder="Nguyen"
               v-model="form.lastName">
      </div>

      <div class="form-group">
        <label for="email">Email</label>
        <input type="email" class="form-control" id="email" placeholder="name@example.com"
               v-model="form.emailId">
      </div>
      <div class="form-group">
        <button class="btn btn-primary">Submit</button>
      </div>
    </form>
  </div>
</template>

<script>
import axios from 'axios';
export default {
  name: "CreateUser",
  data(){
    return{
      form: {
        id: '',
        firstName: '',
        lastName: '',
        emailId: '',
      }
    }
  },
  methods:{
    submitForm(){
      this.$router.push('http://localhost:5173/#/');
      axios.post('http://localhost:8080/api/users', this.form)
          .then((res) => {
            //Perform Success Action


          })
          .catch((error) => {
            // error.response.status Check status code
          }).finally(() => {
        //Perform action in always
      });
    }
  }
}
</script>

<style scoped>

</style>