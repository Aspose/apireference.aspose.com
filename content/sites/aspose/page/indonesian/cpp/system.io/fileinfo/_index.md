---
title: "kelas System::IO::FileInfo"
linktitle: "FileInfo"
second_title: "Aspose.Page untuk C++"
description: "kelas System::IO::FileInfo. Mewakili jalur ke sebuah file dan file yang dirujuk oleh jalur tersebut serta menyediakan metode untuk memanipulasinya. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1400
url: /id/cpp/system.io/fileinfo/
---
## FileInfo class


Mewakili jalur ke sebuah file dan file yang dirujuk oleh jalur tersebut serta menyediakan metode untuk memanipulasinya. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class FileInfo : public System::IO::FileSystemInfo
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [AppendText](./appendtext/)() | Membuka file yang direpresentasikan oleh objek saat ini untuk menulis teks menggunakan enkoding UTF-8, dalam mode 'Append' tanpa berbagi. |
| [CopyTo](./copyto/)(const String\&) | Menyalin file yang direpresentasikan oleh objek saat ini ke lokasi yang ditentukan. Jika file tujuan sudah ada, penyalinan akan gagal. |
| [CopyTo](./copyto/)(const String\&, bool) | Menyalin file yang direpresentasikan oleh objek saat ini ke lokasi yang ditentukan. Sebuah parameter menentukan apakah file tujuan yang ada harus ditimpa. |
| [Create](./create/)() | Membuat file di lokasi yang ditentukan oleh jalur yang direpresentasikan oleh objek saat ini dan membukanya untuk membaca dan menulis, dalam mode truncate dan tanpa berbagi. |
| [CreateText](./createtext/)() | Membuat file di lokasi yang ditentukan oleh jalur yang direpresentasikan oleh objek saat ini dan membukanya untuk menulis teks menggunakan enkoding UTF-8 tanpa berbagi. |
| [Decrypt](./decrypt/)() | BELUM DIIMPLEMENTASIKAN. |
| [Delete](./delete/)() override | Menghapus file yang direpresentasikan oleh objek saat ini. |
| [Encrypt](./encrypt/)() | BELUM DIIMPLEMENTASIKAN. |
| [FileInfo](./fileinfo/)(const String\&) | Membuat instance baru dari kelas [FileInfo](./) yang mewakili file yang ditentukan. |
| [get_Directory](./get_directory/)() | Mengembalikan sebuah objek [DirectoryInfo](../directoryinfo/) yang mewakili direktori di mana file yang diwakili oleh objek saat ini berada. |
| [get_DirectoryName](./get_directoryname/)() | Mengembalikan nama lengkap direktori di mana file yang diwakili oleh objek saat ini berada. |
| [get_Exists](./get_exists/)() override | Mengembalikan nilai yang menunjukkan apakah file ada. |
| [get_IsReadOnly](./get_isreadonly/)() | Mengembalikan nilai yang menunjukkan apakah atribut ReadOnly sudah diatur. |
| [get_Length](./get_length/)() | Mengembalikan ukuran file dalam byte. |
| [get_Name](./get_name/)() override | Mengembalikan nama file. |
| [MoveTo](./moveto/)(const String\&) | Memindahkan file yang diwakili oleh objek saat ini ke lokasi yang ditentukan. |
| [Open](./open/)(FileMode) | Membuka file yang diwakili oleh objek saat ini dalam mode yang ditentukan untuk membaca dan menulis serta tanpa berbagi. |
| [Open](./open/)(FileMode, FileAccess) | Membuka file yang diwakili oleh objek saat ini dalam mode yang ditentukan, dengan tipe akses yang ditentukan dan tanpa berbagi. |
| [Open](./open/)(FileMode, FileAccess, FileShare) | Membuka file yang diwakili oleh objek saat ini dalam mode yang ditentukan, dengan tipe akses yang ditentukan dan opsi berbagi. |
| [OpenRead](./openread/)() | Membuka file yang diwakili oleh objek saat ini hanya untuk membaca, dalam mode 'Open' dengan akses berbagi untuk membaca. |
| [OpenText](./opentext/)() | Membuka file yang ada pada lokasi yang ditentukan oleh jalur yang diwakili oleh objek saat ini untuk membaca teks menggunakan enkoding UTF-8 tanpa berbagi. |
| [OpenWrite](./openwrite/)() | Membuka file yang diwakili oleh objek saat ini hanya untuk menulis, dalam mode 'OpenOrCreate' tanpa berbagi. |
| [Replace](./replace/)(const String\&, const String\&) | Mengganti isi file tujuan yang ditentukan dengan file yang diwakili oleh objek [FileInfo](./) saat ini dan membuat cadangan file yang diganti. |
| [Replace](./replace/)(const String\&, const String\&, bool) | Mengganti isi file tujuan yang ditentukan dengan file yang diwakili oleh objek [FileInfo](./) saat ini dan membuat cadangan file yang diganti. |
| [set_IsReadOnly](./set_isreadonly/)(bool) | Mengatur atau menghapus atribut ReadOnly pada file. |
| [ToString](./tostring/)() const override | Mengembalikan jalur yang diwakili oleh objek saat ini. |
## Lihat Juga

* Class [FileSystemInfo](../filesysteminfo/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
