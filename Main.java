
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
   public Main() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Informe X min: ");
      double var2 = var1.nextDouble();
      System.out.print("Informe X max: ");
      double var4 = var1.nextDouble();
      System.out.print("Informe Y min: ");
      double var6 = var1.nextDouble();
      System.out.print("Informe Y max: ");
      double var8 = var1.nextDouble();
      PlanoProjecao var10 = new PlanoProjecao(var2, var4, var6, var8);
      Recorte var11 = new Recorte(var10);
      ArrayList var12 = new ArrayList();

      while(true) {
         System.out.print("Informe x1 da reta (ou -1 para sair): ");
         double var13 = var1.nextDouble();
         if (var13 == -1.0) {
            Iterator var22 = var12.iterator();

            while(var22.hasNext()) {
               Reta var14 = (Reta)var22.next();
               var11.recortarReta(var14);
            }

            var1.close();
            return;
         }

         System.out.print("Informe y1 da reta: ");
         double var15 = var1.nextDouble();
         System.out.print("Informe x2 da reta: ");
         double var17 = var1.nextDouble();
         System.out.print("Informe y2 da reta: ");
         double var19 = var1.nextDouble();
         Reta var21 = new Reta(new Ponto(var13, var15), new Ponto(var17, var19));
         var12.add(var21);
      }
   }
}
