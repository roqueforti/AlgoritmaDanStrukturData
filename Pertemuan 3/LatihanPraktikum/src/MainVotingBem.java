import java.util.Scanner;

public class MainVotingBem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("========== VOTING KETUA BEM ==========");
        VotingBem bem = new VotingBem();
        VotingBem [] arrBem = new VotingBem[bem.sumKandidat];
        for (int i = 0; i < bem.sumKandidat; i++) {
            arrBem[i] = new VotingBem();
            System.out.print("Kandidat Ketua BEM ke- " + (i + 1) + " : ");
            arrBem[i].kandidat = input.nextLine();
        }

        System.out.println("-----------------------------------------------------------------");
        for (int i = 0; i < bem.sumKandidat; i++) {
            System.out.print(" Masukkan Jumlah Suara Kandidat Ketua Bem ke" + (i + 1) + " : ");
            arrBem[i].vote = input.nextInt();
            bem.sumVote = bem.sumVote + arrBem[i].vote;
        }

        System.out.println("-----------------------------------------------------------------");
        int hasil = bem.hasilVote(bem.sumVote,arrBem[0].vote, arrBem[1].vote, arrBem[2].vote, arrBem[3].vote);
        System.out.println("Ketua Bem Terpilih yaitu : " + arrBem[hasil].kandidat);
    }
}
