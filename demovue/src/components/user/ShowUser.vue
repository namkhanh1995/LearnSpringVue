<template>
  <h1>Danh sách users</h1>
  <table>
    <tr>
      <th>ID</th>
      <th>First Name</th>
      <th>Last Name</th>
      <th>Email</th>
      <th>Action</th>
    </tr>
    <tr v-for="user in users">
      <td>
        {{ user.id }}
      </td>
      <td>
        {{ user.firstName }}
      </td>
      <td>
        {{ user.lastName }}
      </td>
      <td>
        {{ user.emailId }}
      </td>
      <td>
        <button @click="editRow(user.id)">Edit</button>
        <button @click="deleteRow(user.id)">Delete</button>
      </td>
    </tr>
  </table>
</template>

<script>
import axios from 'axios';
export default {
  data() {
    return {
      users: [],
    };
  },
  created() {
    this.getUser();
  },
  methods:{
    async getUser(){
      let data = await axios.get(`http://localhost:8080/api/users`)
          .then(response => {
            this.users = response.data
          }).catch(e => {
            this.errors.push(e)
          })

    },
    deleteRow(userId){
      axios.delete('http://localhost:8080/api/users/' + userId)
          .then((res) => {
            alert("Delete Success");
            this.getUser();
          })
          .catch((error) => {
            // error.response.status Check status code
          }).finally(() => {
        //Perform action in always
      });
    },
    editRow(userId){

    }
  },
  name: "Test"
}

</script>

<style scoped>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
h1{
  text-align: center;
}
button{
  margin-left: 10px;
}
</style>