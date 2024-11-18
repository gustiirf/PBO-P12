public class Main {
    static final int Harga_Awal = 150000;
    public static void main(String[] args) {
        Ticket economy = new EconomyTicket(Harga_Awal);
        Ticket business = new BusinessTicket(Harga_Awal);
        Ticket firstClass = new FirstClassTicket(Harga_Awal);

        System.out.println("\n");

        System.out.println("List Price Tiket, Jika Price Awal adalah : " + Harga_Awal + "\n");

        System.out.println("Economy Class Ticket:");
        economy.printTicketDetail();

        System.out.println("Business Class Ticket:");
        business.printTicketDetail();

        System.out.println("First Class Ticket:");
        firstClass.printTicketDetail();
    }
}