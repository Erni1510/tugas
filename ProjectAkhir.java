//nama  : Erni Srihartini
//kelas : MI-1E
//nim   : 1931710003

package projectakhir;
import java.util.Scanner;
public class ProjectAkhir {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int kembali =0, jumlah =0;
        System.out.print("Masukan jumlah  Pegawai = ");
        int jml = sc.nextInt();
        System.out.println("");
        int nama[][] = new int [jml][4];
        //nama[jml][0]=gaji
        //nama[jml][1]=golongan
        //nama[jml][2]=nip pegawai
        //nama[jml][3]=gaji pokok
        String[] nama1= new String[jml];
         for(int a=0; a<jml; a++){
             for(int b=0; b<1; b++){
                System.out.print("Masukkan Nama Pegawai ke-"+(a+1)+" = ");
                nama1[a] = sc.next();
                System.out.print("Masukkan Nip Pegawai = ");
                nama[a][2] = sc.nextInt();
                System.out.println("1. Golongan Ia ");
                 System.out.println("\t(pekerja gudang stasiun, kelasi, pelayan restorasi, pelayan kereta api, pembantu motoris kapal, penjaga perlintasan, pemelihara");
                System.out.println("2. Golongan IIa ");
                 System.out.println("\t(calon pegawai stasiun, motoris, tukang api trem dan malam, pegawai stasiun trem, kondektur trem, juru langsir, tukang mesin kapal, pportir, masinis trem, kepala restorasi");
                System.out.println("3. Golongan IIIa ");
                 System.out.println("\t(pemeriksa restorasi, kasir-kepala, klerk kepala, masinis-kepala, portir-kepala, pemeriksa trem, kasir, masinis, kondektur, klerk-stasiun");
                System.out.println("4. Golongan IVa ");
                 System.out.println("\t(ajun opseter masinis, Ajum komis stasiun, opseter masinis, kepala gudang persediaan, pengawas, opseter masinis kepala, komis kepala, komis stasiun kepala");
                System.out.print("Masukkan golongan pegawai = ");
                nama[a][1]=sc.nextInt();
                System.out.println("");
            }
        }
         do{
            System.out.println();
            System.out.println("======Menu Gaji Pegawai PT KERETA API PERSERO INDONESIA======");
            System.out.println();
            System.out.println("1. Jumlah Gaji Pegawai dengan Laporan ");
            System.out.println("2. Menu Pencarian Pegawai");
            System.out.println("3. Slip Gaji Pegawai");
            System.out.println("4. Perhitungan Jam Lembur Pegawai");
            System.out.print("Masukkan nomer menu = ");
            int menu=sc.nextInt();        
            System.out.println( );
        if (menu==1){
            for(int a=0; a<jml; a++){
                    if (nama[a][1]==1){             
                        nama[a][3]=1455000;
                        int unkam=25000;
                        int tunj=4074378;
                        int pot=861699;
                        nama[a][0] = hitungGaji(nama[a][3],unkam,tunj,pot);
                        System.out.println("==gaji pegawai golongan Ia==");
                        System.out.println("Pegawai dengan nama "+ nama1[a]+ " dengan nomer pegawai "+nama[a][2]+" adalah Rp "+nama[a][0]);
                    }
                else if(nama[a][1]==2){
                        nama[a][3]=1885000;
                        int unkam=25000;
                        int tunj=4074378;
                        int pot=861699;
                        nama[a][0] = hitungGaji(nama[a][3],unkam,tunj,pot);
                        System.out.println("==gaji pegawai golongan IIa==");
                        System.out.println("Pegawai dengan nama "+ nama1[a]+ " dengan nomer pegawai "+nama[a][2]+" adalah "+nama[a][0]);
                    }
                else if(nama[a][1]==3){
                        nama[a][3] = 2405000;
                        int unkam=25000;
                        int tunj=4074378;
                        int pot=861699;
                        nama[a][0] = hitungGaji(nama[a][3],unkam,tunj,pot);
                        System.out.println("==gaji pegawai golongan IIIa==");
                       System.out.println("Pegawai dengan nama "+ nama1[a]+ " dengan nomer pegawai "+nama[a][2]+" adalah Rp "+nama[a][0]);
                    }
                else if(nama[a][1]==4){
                        nama[a][3]=2838000;
                        int unkam=25000;
                        int tunj=4074378;
                        int pot=861699;
                        nama[a][0] = hitungGaji(nama[a][3],unkam,tunj,pot);
                        System.out.println("==gaji pegawai golongan IVa=="); 
                        System.out.println("Pegawai dengan nama "+ nama1[a]+ " dengan nomer pegawai "+nama[a][2]+" adalah Rp "+nama[a][0]);
                    }else{
                        System.out.println("Salah");
                }
                System.out.println( );
            }
             System.out.println("====LAPORAN GAJI PEGAWAI====");
             System.out.println("NAMA        NIP        GOLONGAN PEGAWAI        GAJI POKOK        TUNJANGAN KELUARGA        TUNJANGAN KEBUTUHAN        TUNJANGAN TRANSPORT        TUNJANGAN PAJAK        TUNJANGAN KESEHATAN        UANG MAKAN        POTONGAN        GAJI BERSIH");
             for(int a=0; a<jml; a++){
                    System.out.println( );
                    System.out.println(nama1[a]+"\t"+nama[a][2]+"\t\t"+nama[a][1]+"\t\t"+nama[a][3]+"\t\t\t"+"477300"+"\t\t\t"+"1120552"+"\t\t\t"+"450000"+"\t\t\t"+"378447"+"\t\t\t"+"1673079"+"\t\t\t\t"+"25000"+"\t\t"+"861699"+ "\t\t"+nama[a][0]);
                    jumlah += nama[a][0];
             }System.out.println( );
              System.out.print("JUMLAH PENGELUARAN PERUSAHAAN (GAJI PEGAWAI) ADALAH Rp "+jumlah);      
        }
        else if(menu==2){
            System.out.println("=====MENU PENCARIAN PEGAWAI=====");
            System.out.print("Masukkan golongan pegawai : ");
            int cari=sc.nextInt();
              for(int a=0; a<jml; a++){
                     if (nama[a][1]==cari){
                      System.out.println(nama1[a]+" dengan Nomor Induk Pegawai "+nama[a][2]+" ");
                  }             
                }
             }
        else if(menu==3){
           System.out.println("=====MENU SLIP GAJI PEGAWAI=====");
            System.out.print("Masukkan nama pegawai = ");
            String namapegawai=sc.next();
              for(int a=0; a<jml; a++){
                  if (namapegawai.equals(nama1[a])){
                     if (nama[a][1]==1){             
                        nama[a][3]=1455000;
                        int unkam=25000;
                        int tunj=4074378;
                        int pot=861699;
                        nama[a][0] = hitungGaji(nama[a][3],unkam,tunj,pot);
                    }else if(nama[a][1]==2){
                        nama[a][3]=1885000;
                        int unkam=25000;
                        int tunj=4074378;
                        int pot=861699;
                        nama[a][0] = hitungGaji(nama[a][3],unkam,tunj,pot);
                    }else if(nama[a][1]==3){
                        nama[a][3] = 2405000;
                        int unkam=25000;
                        int tunj=4074378;
                        int pot=861699;
                        nama[a][0] = hitungGaji(nama[a][3],unkam,tunj,pot);
                    }else if(nama[a][1]==4){
                        nama[a][3]=2838000;
                        int unkam=25000;
                        int tunj=4074378;
                        int pot=861699;
                        nama[a][0] = hitungGaji(nama[a][3],unkam,tunj,pot);
                    }else{
                        System.out.println("Salah");
                }System.out.println( );
                        System.out.println("");
                        System.out.println("KERETA API INDONESIA");
                        System.out.println("======PERINCIAN PEMBAYARAN PENGHASILAN PEGAWAI======");
                        System.out.println( );
                        System.out.println("NAMA                : "+nama1[a]);
                        System.out.println("NIP                 : "+nama[a][2]);
                        System.out.println("GOLONGAN PEGAWAI    : "+nama[a][1]);
                        System.out.println("===================================");
                        System.out.println("GAJI POKOK          : Rp "+nama[a][3]);
                        System.out.println("TUNJANGAN KELUARGA  : Rp 477300");
                        System.out.println("TUNJANGAN KEBUTUHAN : Rp 1120552");
                        System.out.println("TUNJANGAN TRANSPORT : Rp 450000");
                        System.out.println("TUNJANGAN PAJAK     : Rp 378447");
                        System.out.println("TUNJANGAN KESEHATAN : Rp 1673079");
                        System.out.println("UANG MAKAN          : Rp 25000");
                        System.out.println("POTONGAN            : Rp 861699");
                        System.out.println("------------------------------------");
                        System.out.println("TAKE HOME PAY        : Rp "+nama[a][0]);
                        System.out.println("");
                        System.out.println("Periksalah slip gaji anda! Jika terjadi kesalahan pembayaran, silahkan hubungi. telp :, toka :, BBM :,");
                    }
                }
            }else if (menu==4){
            System.out.println("=====MENU PERHITUNGAN JAM LEMBUR=====");
            System.out.print("Masukkan nama pegawai = ");
            String namapegawai=sc.next();
            System.out.print("masukkan jam lembur = ");
            int lembur=sc.nextInt();
              for(int a=0; a<jml; a++){
                  if (namapegawai.equals(nama1[a])){
                     if (nama[a][1]==1){             
                        nama[a][3]=1455000;
                        int unkam=25000;
                        int tunj=4074378;
                        int pot=861699;
                        nama[a][0]= hitungGaji(nama[a][3],unkam,tunj,pot);
                        int lm = hitungGaji(nama[a][3],unkam,tunj,pot)+(lembur*19931);
                        System.out.println("Pegawai dengan nama "+nama1[a]+" dengan nomor induk pegawai "+nama[a][2]+(" mendapatkan gaji Rp "+nama[a][0])+(" dengan jam lembur "+lembur+(" jam menjadi Rp "+lm)));
                    }else if(nama[a][1]==2){
                        nama[a][3]=1885000;
                        int unkam=25000;
                        int tunj=4074378;
                        int pot=861699;
                        nama[a][0]= hitungGaji(nama[a][3],unkam,tunj,pot);
                        int lm = hitungGaji(nama[a][3],unkam,tunj,pot)+(lembur*25821);
                        System.out.println("Pegawai dengan nama "+nama1[a]+" dengan nomor induk pegawai "+nama[a][2]+(" mendapatkan gaji Rp "+nama[a][0])+(" dengan jam lembur "+lembur+(" jam menjadi Rp "+lm)));
                    }else if(nama[a][1]==3){
                        nama[a][3] = 2405000;
                        int unkam=25000;
                        int tunj=4074378;
                        int pot=861699;
                        nama[a][0]= hitungGaji(nama[a][3],unkam,tunj,pot);
                        int lm = hitungGaji(nama[a][3],unkam,tunj,pot)+(lembur*32945);
                        System.out.println("Pegawai dengan nama "+nama1[a]+" dengan nomor induk pegawai "+nama[a][2]+(" mendapatkan gaji Rp "+nama[a][0])+(" dengan jam lembur "+lembur+(" jam menjadi Rp "+lm)));
                    }else if(nama[a][1]==4){
                        nama[a][3]=2838000;
                        int unkam=25000;
                        int tunj=4074378;
                        int pot=861699;
                        nama[a][0]= hitungGaji(nama[a][3],unkam,tunj,pot);
                        int lm = hitungGaji(nama[a][3],unkam,tunj,pot)+(lembur*38876);
                        System.out.println("Pegawai dengan nama "+nama1[a]+" dengan nomor induk pegawai "+nama[a][2]+(" mendapatkan gaji Rp "+nama[a][0])+(" dengan jam lembur "+lembur+(" jam menjadi Rp "+lm)));
                    }else{
                        System.out.println("Salah");
                }
                  }
              }
            }else{
                System.out.println("Menu tidak valid");
            }
                System.out.println( );
                System.out.println("Apakah Anda ingin kembali? (y=1/t=0)");
                kembali= sc.nextInt();
        } while(kembali==1);
    }
    static int hitungGaji(int gajiPokok, int unkam, int tunj, int pot){
        int gaji = gajiPokok+unkam+tunj-pot;
        return gaji;
    }
}