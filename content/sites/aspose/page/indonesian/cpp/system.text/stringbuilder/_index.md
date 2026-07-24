---
title: "System::Text::StringBuilder kelas"
linktitle: "StringBuilder"
second_title: "Aspose.Page untuk C++"
description: "System::Text::StringBuilder kelas. Buffer untuk mengakumulasi string bagian demi bagian. Tipe ini dapat dialokasikan baik di stack sebagai tipe nilai maupun di heap menggunakan fungsi System::MakeObject(). Setelah objek dialokasikan, jangan pernah mencampur kedua penggunaan ini: memiliki pointer SmartPtr ke objek yang dialokasikan di stack secara tegas dilarang dalam C++."
type: docs
weight: 2400
url: /id/cpp/system.text/stringbuilder/
---
## StringBuilder class


[Buffer](../../system/buffer/) to accumulate string part by part. This type can be allocated either in stack as value type or in heap using [System::MakeObject()](../../system/makeobject/) function. Once the object is allocated, never mix up these two usecases: having [SmartPtr](../../system/smartptr/) pointers onto stack-allocated objects is strictly prohibited.

```cpp
class StringBuilder : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Append](./append/)(char_t) | Menambahkan karakter ke builder. |
| [Append](./append/)(char_t, int) | Menambahkan karakter ke builder. |
| [Append](./append/)(const ArrayPtr\<char_t\>\&) | Menambahkan array karakter ke builder. |
| [Append](./append/)(const ArrayPtr\<char_t\>\&, int, int) | Menambahkan potongan array karakter ke builder. |
| [Append](./append/)(const String\&) | Menambahkan string ke builder. |
| [Append](./append/)(const String\&, int, int) | Menambahkan potongan string ke builder. |
| [Append](./append/)(const SharedPtr\<T\>\&) | Menambahkan representasi string objek ke builder. |
| [Append](./append/)(const SharedPtr\<StringBuilder\>\&) | Menambahkan konten builder ke builder. |
| [Append](./append/)(float) | Menambahkan nilai floating point ke builder. |
| [Append](./append/)(double) | Menambahkan nilai floating point ke builder. |
| [Append](./append/)(int) | Menambahkan nilai integer ke builder. |
| [Append](./append/)(T) | Menambahkan nilai aritmetika ke builder. |
| [Append](./append/)(E) | Menambahkan representasi string nilai enum ke builder. |
| [AppendFormat](./appendformat/)(const String\&, const TArgs\&...) | Menambahkan string yang diformat ke builder. |
| [AppendFormat](./appendformat/)(const SharedPtr\<IFormatProvider\>\&, const String\&, const TArgs\&...) | Menambahkan string yang diformat ke builder. |
| [AppendLine](./appendline/)() | Menambahkan karakter baris baru ke builder. |
| [AppendLine](./appendline/)(const String\&) | Menambahkan string diikuti karakter baris baru ke builder. |
| [Clear](./clear/)() | Menghapus semua karakter dari builder. |
| [CopyTo](./copyto/)(int, System::ArrayPtr\<char_t\> const\&, int, int) | Menyalin data builder ke posisi array yang ada. |
| [get_Capacity](./get_capacity/)() const | Mendapatkan kapasitas saat ini dari string builder. |
| [get_Length](./get_length/)() const | Mendapatkan panjang string yang saat ini ada di builder. |
| [idx_get](./idx_get/)(int) const | Mendapatkan karakter pada posisi yang ditentukan. |
| [idx_set](./idx_set/)(int, char_t) | Mengatur karakter pada posisi yang ditentukan. |
| [Insert](./insert/)(int, const String\&) | Menyisipkan string ke posisi tetap builder. |
| [Insert](./insert/)(int32_t, const String\&, int32_t) | Menyisipkan string berulang ke posisi tetap builder. |
| [Insert](./insert/)(int, char_t) | Menyisipkan karakter ke posisi tetap builder. |
| [Insert](./insert/)(int, const System::ArrayPtr\<char_t\>\&, int, int) | Menyisipkan karakter ke posisi tetap builder. |
| [Insert](./insert/)(int, T) | Menyisipkan nilai ke posisi tetap builder. |
| [operator[]](./operator[]/)(int) const | Mendapatkan karakter pada posisi yang ditentukan. |
| [Remove](./remove/)(int, int) | Menghapus fragmen dari builder. |
| [Replace](./replace/)(const String\&, const String\&) | Mengganti substring melalui builder. |
| [Replace](./replace/)(const String\&, const String\&, int, int) | Mengganti substring melalui rentang builder. |
| [Replace](./replace/)(char_t, char_t) | Mengganti karakter melalui builder. |
| [Replace](./replace/)(char_t, char_t, int, int) | Mengganti karakter melalui rentang builder. |
| [set_Capacity](./set_capacity/)(int) | Mengatur kapasitas saat ini dari string builder. |
| [set_Length](./set_length/)(int) | Memotong atau memperluas string builder ke panjang yang ditentukan. |
| [StringBuilder](./stringbuilder/)() | Konstruktor. |
| [StringBuilder](./stringbuilder/)(int) | Konstruktor. |
| [StringBuilder](./stringbuilder/)(const String\&) | Konstruktor. |
| [StringBuilder](./stringbuilder/)(const String\&, int) | Konstruktor. |
| [StringBuilder](./stringbuilder/)(const String\&, int, int, int) | Konstruktor. |
| [ToString](./tostring/)() const override | Mendapatkan string yang saat ini terdapat dalam builder. |
| [ToString](./tostring/)(int, int) const | Mendapatkan substring yang saat ini terdapat dalam builder. |
| [~StringBuilder](./~stringbuilder/)() | Destruktor. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
