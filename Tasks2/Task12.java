package Tasks2;

public class Task12 {
    public static void main(String[] args) {
        int firstGradesCount = 37;
        double packetVolume = 0.9;
        double glassVolume = 0.2;
        //общий объем
        double allV = firstGradesCount*glassVolume;
        //общее кол-во упаковок
        double allpackets = allV/packetVolume;
        //если в частном есть остаток, то "покупаем" еще 1 пакет
        if (allV%packetVolume != 0) {
            allpackets = (int)(allpackets+1);
        }
        System.out.println(allpackets);
    }
}
