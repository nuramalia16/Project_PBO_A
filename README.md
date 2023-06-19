## com/config
didalam package ini terdapat sebuah file bernama  MyConfig.java yang berisi kode untuk menghubungkan database MySQL menggunakan JDBC.Didalam kelas ini terdapat:Import Statement,Deklarasi Konstanta,Deklarasi Variabel dan metode Connection


## Controllers
didalam package ini terdapat sebuah kelas bernama Dbcontorollers yang dimana dalam kelas ini terdapa :
1.Impor Statement
2.pewarisan kelas(kelas Dbcontroller mewarisi kelas MyConfig)
3.metode getDatabase(mengambil data dari produk,membuat koneksi dan metode connection dalm kelas MyConfig,menjalankan querySelect menggunakan preparedStatement untuk mendapatkan hasil query dalam resultSet,Mengambil setiap baris hasil query menggunakan resultSet.next() dan mencetak informasi produk,Menutup statement (preparedStatement) setelah selesai)
4.Metode getProdukByNama(String nama)
Metode ini bertujuan untuk mendapatkan informasi produk berdasarkan nama produk.
5.Metode insertData(String nama, long harga, int jumlah):
Metode ini  bertujuan untuk memasukkan data produk baru ke dalam tabel produk.
6.Metode updateNama(int id, String nama), updateHarga(int id, long harga), dan updateStok(int id, int jumlah):
Metode-metode ini bertujuan untuk mengubah data nama, harga, dan jumlah stok produk berdasarkan ID produk yang diberikan.
7.Metode deleteData(int id):
Metode ini bertujuan untuk menghapus data produk berdasarkan ID produk yang diberikan.

## Layout
didalam package ini terdapat beberapa file :
1.Delete.java
class Delete.java berfungsi untuk menampilkan menu penghapusan data dari produk data database.Yang diman dalam kelas tersebut terdapat: Import Statement,Metode showDeleteData()
2.Edit.java
clas Edit.java berfungsi untuk menampilkan menu pengeditan data produk dari database.Dimana dalam kelas ini terdapat Import Statement,Metode showEditData(String nama).
3.Insert.java
class Insert.java berfungsi menampilkan menu penambahan data produk ke dalam database.Dimana dalam kelas tersebut terdapat Import Statement,Metode showInsertData().
4.Menu.java
class Menu.java berfungsi untuk menampilkan menu utama aplikasi dan memproses pilihan menu yang dipilih .Dimana dalam kelas ini terdapat Metode showMenu(),Metode selectMenu().
5.Read.Java
class Read.java berfungsi untuk menampilkan data produk dari database.Dimana dalam kelas ini terdapat Metode showReadData() dimana Metode ini digunakan untuk menampilkan data produk dari database.
## models 
didalam package ini terdapat kelas Produk.java.dimana kelas Produk ini  merepresentasikan model atau entitas untuk objek produk
## src 
didalam package src ini terdapat kelas App.java,dimana kelas App ini bertindak sebagai penghubung antara entitas utama program dan memulai jalannya program dengan memanggil metode showMenu() dari kelas Menu. Dengan menjalankan kelas App, program akan memulai tampilan menu dan pengguna dapat memilih opsi yang tersedia.



 

