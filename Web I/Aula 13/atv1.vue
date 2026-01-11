<template>
    <ul>
        <li v-for="batatas in itens">{{batatas }}</li>
    </ul>
    </template> 
    
<script setup>
const itens = ['batata frita', 'batata assada', 'purê de batata'];
</script>
