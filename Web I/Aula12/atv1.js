public class atv1 {
    <template> <!-- Componente Filho -->
        <div>
            <h2>Olá, {{ nome }}!</h2>
        </div>
    </template>

    <script setup>
    defineProps({
     nome: String
    })
    </script>
    <template> 
        <div>
            <ComponenteFilho nome="João" />
        </div>
            </template>

        <script setup>
        import ComponenteFilho from '@/components/ComponenteFilho.vue'
        </script>
        }
