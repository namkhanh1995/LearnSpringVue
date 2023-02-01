<template>
  <table>
    <tr>
      <th>ID</th>
      <th>First Name</th>
      <th>Last Name</th>
      <th>Email</th>
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
    axios.get(`http://localhost:8080/api/users`)
        .then(response => {
          this.users = response.data
        }).catch(e => {
      this.errors.push(e)
    })
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
</style>