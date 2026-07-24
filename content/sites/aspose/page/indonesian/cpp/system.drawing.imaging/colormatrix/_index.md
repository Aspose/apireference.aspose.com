---
title: "System::Drawing::Imaging::ColorMatrix class"
linktitle: "ColorMatrix"
second_title: "Aspose.Page untuk C++"
description: "System::Drawing::Imaging::ColorMatrix class. Mewakili matriks 5x5 yang berisi koordinat untuk ruang warna RGBAW. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 300
url: /id/cpp/system.drawing.imaging/colormatrix/
---
## ColorMatrix class


Mewakili matriks 5x5 yang berisi koordinat untuk ruang warna RGBAW. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen.

```cpp
class ColorMatrix : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [ColorMatrix](./colormatrix/)() | Membuat instance baru dari kelas [ColorMatrix](./) dan menginisialisasinya dengan nilai-nilai matriks identitas. |
| [ColorMatrix](./colormatrix/)(const System::ArrayPtr\<System::ArrayPtr\<float\>\>\&) | Membuat instance baru dari kelas [ColorMatrix](./) dan menginisialisasinya dengan nilai-nilai yang ditentukan. |
| [get_Matrix00](./get_matrix00/)() const | Mengembalikan nilai pada baris ke-0 dan kolom ke-0. |
| [get_Matrix01](./get_matrix01/)() const | Mengembalikan nilai pada baris ke-0 dan kolom ke-1. |
| [get_Matrix02](./get_matrix02/)() const | Mengembalikan nilai pada baris ke-0 dan kolom ke-2. |
| [get_Matrix03](./get_matrix03/)() const | Mengembalikan nilai pada baris ke-0 dan kolom ke-3. |
| [get_Matrix04](./get_matrix04/)() const | Mengembalikan nilai pada baris ke-0 dan kolom ke-4. |
| [get_Matrix10](./get_matrix10/)() const | Mengembalikan nilai pada baris ke-1 dan kolom ke-0. |
| [get_Matrix11](./get_matrix11/)() const | Mengembalikan nilai pada baris ke-1 dan kolom ke-1. |
| [get_Matrix12](./get_matrix12/)() const | Mengembalikan nilai pada baris ke-1 dan kolom ke-2. |
| [get_Matrix13](./get_matrix13/)() const | Mengembalikan nilai di baris ke-1 dan kolom ke-3. |
| [get_Matrix14](./get_matrix14/)() const | Mengembalikan nilai di baris ke-1 dan kolom ke-4. |
| [get_Matrix20](./get_matrix20/)() const | Mengembalikan nilai di baris ke-2 dan kolom ke-0. |
| [get_Matrix21](./get_matrix21/)() const | Mengembalikan nilai di baris ke-2 dan kolom ke-1. |
| [get_Matrix22](./get_matrix22/)() const | Mengembalikan nilai di baris ke-2 dan kolom ke-2. |
| [get_Matrix23](./get_matrix23/)() const | Mengembalikan nilai di baris ke-2 dan kolom ke-3. |
| [get_Matrix24](./get_matrix24/)() const | Mengembalikan nilai di baris ke-2 dan kolom ke-4. |
| [get_Matrix30](./get_matrix30/)() const | Mengembalikan nilai di baris ke-3 dan kolom ke-0. |
| [get_Matrix31](./get_matrix31/)() const | Mengembalikan nilai di baris ke-3 dan kolom ke-1. |
| [get_Matrix32](./get_matrix32/)() const | Mengembalikan nilai di baris ke-3 dan kolom ke-2. |
| [get_Matrix33](./get_matrix33/)() const | Mengembalikan nilai di baris ke-3 dan kolom ke-3. |
| [get_Matrix34](./get_matrix34/)() const | Mengembalikan nilai di baris ke-3 dan kolom ke-4. |
| [get_Matrix40](./get_matrix40/)() const | Mengembalikan nilai di baris ke-4 dan kolom ke-0. |
| [get_Matrix41](./get_matrix41/)() const | Mengembalikan nilai di baris ke-4 dan kolom ke-1. |
| [get_Matrix42](./get_matrix42/)() const | Mengembalikan nilai di baris ke-4 dan kolom ke-2. |
| [get_Matrix43](./get_matrix43/)() const | Mengembalikan nilai di baris ke-4 dan kolom ke-3. |
| [get_Matrix44](./get_matrix44/)() const | Mengembalikan nilai di baris ke-4 dan kolom ke-4. |
| [idx_get](./idx_get/)(int, int) | Mengembalikan nilai pada baris dan kolom yang ditentukan. |
| [idx_set](./idx_set/)(int, int, float) | Menetapkan nilai yang ditentukan pada lokasi yang ditentukan dalam matriks. |
| [set_Matrix00](./set_matrix00/)(float) | Menetapkan nilai di baris ke-0 dan kolom ke-0. |
| [set_Matrix01](./set_matrix01/)(float) | Menetapkan nilai di baris ke-0 dan kolom ke-1. |
| [set_Matrix02](./set_matrix02/)(float) | Menetapkan nilai di baris ke-0 dan kolom ke-2. |
| [set_Matrix03](./set_matrix03/)(float) | Menetapkan nilai di baris ke-0 dan kolom ke-3. |
| [set_Matrix04](./set_matrix04/)(float) | Menetapkan nilai di baris ke-0 dan kolom ke-4. |
| [set_Matrix10](./set_matrix10/)(float) | Menetapkan nilai di baris ke-1 dan kolom ke-0. |
| [set_Matrix11](./set_matrix11/)(float) | Mengatur nilai pada baris ke-1 dan kolom ke-1. |
| [set_Matrix12](./set_matrix12/)(float) | Mengatur nilai pada baris ke-1 dan kolom ke-2. |
| [set_Matrix13](./set_matrix13/)(float) | Mengatur nilai pada baris ke-1 dan kolom ke-3. |
| [set_Matrix14](./set_matrix14/)(float) | Mengatur nilai pada baris ke-1 dan kolom ke-4. |
| [set_Matrix20](./set_matrix20/)(float) | Mengatur nilai pada baris ke-2 dan kolom ke-0. |
| [set_Matrix21](./set_matrix21/)(float) | Mengatur nilai pada baris ke-2 dan kolom ke-1. |
| [set_Matrix22](./set_matrix22/)(float) | Mengatur nilai pada baris ke-2 dan kolom ke-2. |
| [set_Matrix23](./set_matrix23/)(float) | Mengatur nilai pada baris ke-2 dan kolom ke-3. |
| [set_Matrix24](./set_matrix24/)(float) | Mengatur nilai pada baris ke-2 dan kolom ke-4. |
| [set_Matrix30](./set_matrix30/)(float) | Mengatur nilai pada baris ke-3 dan kolom ke-0. |
| [set_Matrix31](./set_matrix31/)(float) | Mengatur nilai pada baris ke-3 dan kolom ke-1. |
| [set_Matrix32](./set_matrix32/)(float) | Mengatur nilai pada baris ke-3 dan kolom ke-2. |
| [set_Matrix33](./set_matrix33/)(float) | Mengatur nilai pada baris ke-3 dan kolom ke-3. |
| [set_Matrix34](./set_matrix34/)(float) | Mengatur nilai pada baris ke-3 dan kolom ke-4. |
| [set_Matrix40](./set_matrix40/)(float) | Mengatur nilai pada baris ke-4 dan kolom ke-0. |
| [set_Matrix41](./set_matrix41/)(float) | Mengatur nilai pada baris ke-4 dan kolom ke-1. |
| [set_Matrix42](./set_matrix42/)(float) | Mengatur nilai pada baris ke-4 dan kolom ke-2. |
| [set_Matrix43](./set_matrix43/)(float) | Mengatur nilai pada baris ke-4 dan kolom ke-3. |
| [set_Matrix44](./set_matrix44/)(float) | Mengatur nilai pada baris ke-4 dan kolom ke-4. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
