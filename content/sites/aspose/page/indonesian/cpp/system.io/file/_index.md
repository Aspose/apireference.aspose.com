---
title: "Kelas System::IO::File"
linktitle: "File"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::IO::File. Menyediakan metode untuk memanipulasi file. Ini adalah tipe statis tanpa layanan instance. Anda tidak pernah boleh membuat instance darinya dengan cara apapun dalam C++."
type: docs
weight: 1300
url: /id/cpp/system.io/file/
---
## File class


Menyediakan metode untuk memanipulasi berkas. Ini adalah tipe statis tanpa layanan instance. Anda tidak boleh membuat instance darinya dengan cara apapun.

```cpp
class File
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| static [AppendAllLines](./appendalllines/)(const String\&, const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&, const EncodingPtr\&) | Menambahkan string dari koleksi string yang ditentukan ke file yang ditentukan menggunakan enkoding yang ditentukan dengan menulis setiap string pada baris baru. Jika file yang ditentukan tidak ada, file tersebut akan dibuat. File ditutup setelah menulis semua string. |
| static [AppendAllText](./appendalltext/)(const String\&, const String\&, const EncodingPtr\&) | Menambahkan string yang ditentukan ke file yang ditentukan menggunakan enkoding yang ditentukan. |
| static [AppendText](./appendtext/)(const String\&) | Membuat objek [StreamWriter](../streamwriter/) yang menambahkan teks ke file yang ditentukan menggunakan enkoding UTF-8. Jika file yang ditentukan tidak ada, file tersebut akan dibuat. |
| static [Copy](./copy/)(const String\&, const String\&, bool) | Menyalin file yang ditentukan ke lokasi yang ditentukan. Jika file tujuan sudah ada, sebuah parameter menentukan apakah harus ditimpa. |
| static [Create](./create/)(const String\&, int32_t, FileOptions) | Membuat file baru (atau menimpa yang ada) dan membukanya untuk akses baca dan tulis menggunakan ukuran buffer dan opsi yang ditentukan. |
| static [CreateText](./createtext/)(const String\&) | Membuat file baru atau membuka file yang ada untuk menulis teks berenkoding UTF-8. |
| static [Decrypt](./decrypt/)(const String\&) | BELUM DIIMPLEMENTASIKAN. |
| static [Delete](./delete/)(const String\&) | Menghapus file atau direktori yang ditentukan. |
| static [Encrypt](./encrypt/)(const String\&) | BELUM DIIMPLEMENTASIKAN. |
| static [Exists](./exists/)(const String\&) | Menentukan apakah jalur yang ditentukan merujuk pada file yang ada. |
| static [GetAttributes](./getattributes/)(const String\&) | Mengembalikan atribut dari entitas yang ditentukan. |
| static [GetCreationTime](./getcreationtime/)(const String\&) | Mengembalikan waktu pembuatan entitas yang ditentukan sebagai waktu lokal. |
| static [GetCreationTimeUtc](./getcreationtimeutc/)(const String\&) | Mengembalikan waktu pembuatan entitas yang ditentukan sebagai waktu UTC. |
| static [GetLastAccessTime](./getlastaccesstime/)(const String\&) | Mengembalikan waktu akses terakhir entitas yang ditentukan sebagai waktu lokal. |
| static [GetLastAccessTimeUtc](./getlastaccesstimeutc/)(const String\&) | Mengembalikan waktu akses terakhir entitas yang ditentukan sebagai waktu UTC. |
| static [GetLastWriteTime](./getlastwritetime/)(const String\&) | Mengembalikan waktu penulisan terakhir entitas yang ditentukan sebagai waktu lokal. |
| static [GetLastWriteTimeUtc](./getlastwritetimeutc/)(const String\&) | Mengembalikan waktu penulisan terakhir entitas yang ditentukan sebagai waktu UTC. |
| static [Move](./move/)(const String\&, const String\&) | Memindahkan file yang ditentukan ke lokasi baru. |
| static [Open](./open/)(const String\&, FileMode) | Membuka file yang ditentukan dalam mode yang ditentukan untuk membaca dan menulis serta tanpa berbagi. |
| static [Open](./open/)(const String\&, FileMode, FileAccess, FileShare) | Membuka file yang ditentukan dalam mode yang ditentukan, dengan tipe akses yang ditentukan dan opsi berbagi. |
| static [OpenRead](./openread/)(const String\&) | Membuka file yang ditentukan hanya untuk membaca, dalam mode 'Open' dengan akses berbagi untuk membaca. |
| static [OpenText](./opentext/)(const String\&, const EncodingPtr\&) | Membuka file yang ada yang ditentukan untuk membaca teks menggunakan enkoding UTF-8 tanpa berbagi. |
| static [OpenWrite](./openwrite/)(const String\&) | Membuka file yang ditentukan hanya untuk menulis, dalam mode 'OpenOrCreate' tanpa berbagi. |
| static [ReadAllBytes](./readallbytes/)(const String\&) | Membaca konten file biner yang ditentukan ke dalam array byte. |
| static [ReadAllLines](./readalllines/)(const String\&, const EncodingPtr\&) | Membaca konten file teks yang ditentukan baris demi baris ke dalam array string menggunakan enkoding karakter yang ditentukan. |
| static [ReadAllText](./readalltext/)(const String\&, const EncodingPtr\&) | Membaca konten file teks yang ditentukan ke sebuah objek [String](../../system/string/) tunggal menggunakan enkoding karakter yang ditentukan. |
| static [ReadLines](./readlines/)(const String\&, const EncodingPtr\&) | Membaca konten file teks yang ditentukan baris demi baris menggunakan enkoding karakter yang ditentukan dan mengembalikan koleksi enumerable string yang masing-masing mewakili satu baris dari konten file. |
| static [Replace](./replace/)(const String\&, const String\&, const String\&, bool) | Mengganti isi satu file dengan file lain dan membuat cadangan file yang diganti. |
| static [SetAttributes](./setattributes/)(const String\&, FileAttributes) | Menetapkan atribut yang ditentukan pada file yang ditentukan. |
| static [SetCreationTime](./setcreationtime/)(const String\&, DateTime) | BELUM DIIMPLEMENTASIKAN. |
| static [SetCreationTimeUtc](./setcreationtimeutc/)(const String\&, DateTime) | BELUM DIIMPLEMENTASIKAN. |
| static [SetLastAccessTime](./setlastaccesstime/)(const String\&, DateTime) | BELUM DIIMPLEMENTASIKAN. |
| static [SetLastAccessTimeUtc](./setlastaccesstimeutc/)(const String\&, DateTime) | BELUM DIIMPLEMENTASIKAN. |
| static [SetLastWriteTime](./setlastwritetime/)(const String\&, DateTime) | Menetapkan waktu penulisan terakhir entitas yang ditentukan sebagai waktu lokal. |
| static [SetLastWriteTimeUtc](./setlastwritetimeutc/)(const String\&, DateTime) | Menetapkan waktu penulisan terakhir entitas yang ditentukan sebagai waktu UTC. |
| static [WriteAllBytes](./writeallbytes/)(const String\&, const ArrayPtr\<uint8_t\>\&) | Menimpa file biner yang ditentukan dan menulis byte yang ditentukan ke dalamnya. |
| static [WriteAllLines](./writealllines/)(const String\&, const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&, const EncodingPtr\&) | Membuat file teks baru atau menimpa yang sudah ada dan menulis semua string dari koleksi enumerable string yang ditentukan ke dalamnya, setiap string pada baris baru, menggunakan enkoding yang ditentukan. |
| static [WriteAllLines](./writealllines/)(const String\&, const ArrayPtr\<String\>\&, const EncodingPtr\&) | Membuat file teks baru atau menimpa yang sudah ada dan menulis semua string dari array string yang ditentukan ke dalamnya, setiap string pada baris baru, menggunakan enkoding yang ditentukan. |
| static [WriteAllText](./writealltext/)(const String\&, const String\&, const EncodingPtr\&) | Membuat file teks baru atau menimpa yang sudah ada dan menulis konten string yang ditentukan ke dalamnya menggunakan enkoding yang ditentukan. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [DefaultBufferSize](./defaultbuffersize/) | Nilai default dari jumlah byte yang di-buffer selama membaca dari dan menulis ke sebuah file. |
## Lihat Juga

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
