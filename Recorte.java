class Recorte {
   PlanoProjecao plano;

   public Recorte(PlanoProjecao var1) {
      this.plano = var1;
   }

   public void recortarReta(Reta var1) {
      int var2 = this.plano.calcularCodigo(var1.p1);
      int var3 = this.plano.calcularCodigo(var1.p2);
      if ((var2 | var3) == 0) {
         System.out.println("Reta completamente dentro do plano: " + var1.p1.x + "," + var1.p1.y + " - " + var1.p2.x + "," + var1.p2.y);
      } else if ((var2 & var3) != 0) {
         System.out.println("Reta completamente fora do plano: " + var1.p1.x + "," + var1.p1.y + " - " + var1.p2.x + "," + var1.p2.y);
      } else {
         System.out.println("Reta parcialmente dentro do plano: " + var1.p1.x + "," + var1.p1.y + " - " + var1.p2.x + "," + var1.p2.y);
         double var4 = (this.plano.xmin - var1.p1.x) / (var1.p2.x - var1.p1.x);
         double var6 = var1.p1.x + var4 * (var1.p2.x - var1.p1.x);
         double var8 = var1.p1.y + var4 * (var1.p2.y - var1.p1.y);
         if (var2 == 0) {
            if (var3 == 1) {
               var6 = this.plano.xmin;
               var8 = var1.p1.y + (this.plano.xmin - var1.p1.x) * (var1.p2.y - var1.p1.y) / (var1.p2.x - var1.p1.x);
            } else if (var3 == 2) {
               var6 = this.plano.xmax;
               var8 = var1.p1.y + (this.plano.xmax - var1.p1.x) * (var1.p2.y - var1.p1.y) / (var1.p2.x - var1.p1.x);
            } else if (var3 == 4) {
               var8 = this.plano.ymin;
               var6 = var1.p1.x + (this.plano.ymin - var1.p1.y) * (var1.p2.x - var1.p1.x) / (var1.p2.y - var1.p1.y);
            } else if (var3 == 8) {
               var8 = this.plano.ymax;
               var6 = var1.p1.x + (this.plano.ymax - var1.p1.y) * (var1.p2.x - var1.p1.x) / (var1.p2.y - var1.p1.y);
            }
         } else if (var2 == 1) {
            var6 = this.plano.xmin;
            var8 = var1.p2.y + (this.plano.xmin - var1.p2.x) * (var1.p1.y - var1.p2.y) / (var1.p1.x - var1.p2.x);
         } else if (var2 == 2) {
            var6 = this.plano.xmax;
            var8 = var1.p2.y + (this.plano.xmax - var1.p2.x) * (var1.p1.y - var1.p2.y) / (var1.p1.x - var1.p2.x);
         } else if (var2 == 4) {
            var8 = this.plano.ymin;
            var6 = var1.p2.x + (this.plano.ymin - var1.p2.y) * (var1.p1.x - var1.p2.x) / (var1.p1.y - var1.p2.y);
         } else if (var2 == 8) {
            var8 = this.plano.ymax;
            var6 = var1.p2.x + (this.plano.ymax - var1.p2.y) * (var1.p1.x - var1.p2.x) / (var1.p1.y - var1.p2.y);
         }

         System.out.println("Novo ponto de interse\u00e7\u00e3o: " + var6 + "," + var8);
      }

   }
}
