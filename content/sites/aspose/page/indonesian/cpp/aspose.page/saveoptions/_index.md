---
title: "Kelas Aspose::Page::SaveOptions"
linktitle: "SaveOptions"
second_title: "Aspose.Page untuk C++"
description: "Kelas Aspose::Page::SaveOptions. Kelas ini berisi opsi yang diperlukan untuk mengelola proses konversi dalam C++."
type: docs
weight: 1500
url: /id/cpp/aspose.page/saveoptions/
---
## SaveOptions class


Kelas ini berisi opsi yang diperlukan untuk mengelola proses konversi.

```cpp
class SaveOptions : public virtual System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_AdditionalFontsFolders](./get_additionalfontsfolders/)() const | Menentukan folder tambahan tempat konverter harus menemukan font untuk dokumen masukan. Folder default adalah folder font standar tempat OS menemukan font untuk kebutuhan internal. |
| virtual [get_ConvertFontsToTTF](./get_convertfontstottf/)() | Menentukan apakah akan menyimpan font non-TrueType ke TTF. Hal ini secara signifikan mengurangi volume dokumen yang dihasilkan dalam konversi PS ke PDF dan meningkatkan kecepatan konversi file PS dengan sejumlah besar teks dalam font non-TrueType ke format output apa pun. Namun terdapat sedikit pergeseran vertikal teks saat mengonversi file PostSctipt ke gambar. |
| virtual [get_Debug](./get_debug/)() | Menentukan apakah informasi debug harus dicetak ke aliran output standar atau tidak. |
| virtual [get_Exceptions](./get_exceptions/)() | Mengembalikan daftar kesalahan konversi yang ditekan jika [SuppressErrors](../) bernilai true. |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | Kategori Quality menentukan tingkat kompresi untuk sebuah gambar. Nilai yang tersedia adalah 0 hingga 100. Semakin rendah angka yang ditentukan, semakin tinggi kompresi dan oleh karena itu kualitas gambar semakin rendah. Nilai 0 menghasilkan gambar dengan kualitas terendah, sedangkan 100 menghasilkan kualitas tertinggi. |
| [get_Size](./get_size/)() const | Mendapatkan/mengatur ukuran gambar. |
| virtual [get_SupressErrors](./get_supresserrors/)() | Menentukan apakah kesalahan harus ditekan atau tidak. Jika true, kesalahan yang ditekan akan ditambahkan ke daftar [Exceptions](../). Jika false, kesalahan pertama akan menghentikan program. |
| [SaveOptions](./saveoptions/)() | Menginisialisasi instance baru dari kelas [SaveOptions](./) dengan nilai default untuk flag [SuppressErrors](../) (true) dan [Debug](../) (false). |
| [SaveOptions](./saveoptions/)(bool) | Menginisialisasi instance baru dari kelas [SaveOptions](./) dengan nilai default untuk flag [Debug](../) (false). |
| [SaveOptions](./saveoptions/)(Aspose::Page::Drawing::Size) | Menginisialisasi instance baru dari [SaveOptions](./) dengan ukuran halaman yang ditentukan. |
| [SaveOptions](./saveoptions/)(bool, Aspose::Page::Drawing::Size) | Menginisialisasi instance baru dari kelas [SaveOptions](./) dengan nilai default untuk flag [Debug](../) (false) dan dengan ukuran halaman yang ditentukan. |
| [set_AdditionalFontsFolders](./set_additionalfontsfolders/)(System::ArrayPtr\<System::String\>) | Menentukan folder tambahan tempat konverter harus menemukan font untuk dokumen masukan. Folder default adalah folder font standar tempat OS menemukan font untuk kebutuhan internal. |
| virtual [set_ConvertFontsToTTF](./set_convertfontstottf/)(bool) | Menentukan apakah akan menyimpan font non-TrueType ke TTF. Hal ini secara signifikan mengurangi volume dokumen yang dihasilkan dalam konversi PS ke PDF dan meningkatkan kecepatan konversi file PS dengan sejumlah besar teks dalam font non-TrueType ke format output apa pun. Namun terdapat sedikit pergeseran vertikal teks saat mengonversi file PostSctipt ke gambar. |
| virtual [set_Debug](./set_debug/)(bool) | Menentukan apakah informasi debug harus dicetak ke aliran output standar atau tidak. |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | Kategori Quality menentukan tingkat kompresi untuk sebuah gambar. Nilai yang tersedia adalah 0 hingga 100. Semakin rendah angka yang ditentukan, semakin tinggi kompresi dan oleh karena itu kualitas gambar semakin rendah. Nilai 0 menghasilkan gambar dengan kualitas terendah, sedangkan 100 menghasilkan kualitas tertinggi. |
| [set_Size](./set_size/)(Aspose::Page::Drawing::Size) | Mendapatkan/mengatur ukuran gambar. |
| virtual [set_SupressErrors](./set_supresserrors/)(bool) | Menentukan apakah kesalahan harus ditekan atau tidak. Jika true, kesalahan yang ditekan akan ditambahkan ke daftar [Exceptions](../). Jika false, kesalahan pertama akan menghentikan program. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
