<template>
  <div>
    <button @click="isShow = !isShow">显示/隐藏</button>
    <transition name="hello" appear>
      <h1 v-show="isShow" class="go">你好</h1>
    </transition>
  </div>
</template>

<script>
export default {
  name: "Test1",
  data() {
    return {
      isShow: true,
    };
  },
};
</script>

<style scoped>
h1 {
  background-color: orange;
}
.hello-enter-active {
  animation: demo 1.25s linear;
}
.hello-leave-active {
  animation: demo 1.25s linear reverse;
}
@keyframes demo {
  from {
    transform: translateX(-100%);
  }
  to {
    transform: translateX(0px);
  }
}
</style>