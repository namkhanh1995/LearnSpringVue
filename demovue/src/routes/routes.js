import { createWebHistory, createRouter } from "vue-router";
import ShowUser from "@/components/user/ShowUser.vue";
import CreateUser from "@/components/user/CreateUser.vue";


const routes = [
    {
        path: "/",
        name: "ShowUser",
        component: ShowUser,
    },
    {
        path: "/create",
        name: "CreateUser",
        component: CreateUser,
    },
];

const router = createRouter({
    history: createWebHistory(),
    routes,
});

export default router;