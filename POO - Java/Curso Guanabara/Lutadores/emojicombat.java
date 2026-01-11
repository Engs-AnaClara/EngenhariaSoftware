public class emojicombat {
        public static void main(String[] args) {
        Lutadores l[] = new Lutadores[6];

                l[0] = new Lutadores("Pretty Boy", "França", 31, 68.9f, "11", 1,1,1);
                l[1] = new Lutadores("Putzcript", "Brasil", 29, 57.8f, "14", 11, 3,4);
                l[2] = new Lutadores("Snapshot", "França", 31, 68.9f,"12", 11, 11, 1);
                l[3] = new Lutadores("DEad Code", "França", 31, 68.9f,"12", 11,3, 1);
                l[4] = new Lutadores("Formula 1", "França", 31, 68.9f,"14", 11,3, 1);
                Luta UEC01 = new Luta();
                UEC01.marcarLuta(l[2], l[3]);
                UEC01.lutar();


        }


}