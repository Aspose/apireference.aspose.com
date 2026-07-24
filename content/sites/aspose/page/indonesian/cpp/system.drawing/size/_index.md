---
title: "Kelas System::Drawing::Size"
linktitle: "Size"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Drawing::Size. Mewakili sepasang nilai integer yang mewakili lebar dan tinggi sebuah gambar. Tipe ini harus dialokasikan pada stack dan diteruskan ke fungsi dengan nilai atau referensi. Jangan pernah menggunakan kelas System::SmartPtr untuk mengelola objek tipe ini dalam C++."
type: docs
weight: 2200
url: /id/cpp/system.drawing/size/
---
## Size class


Mewakili sepasang nilai integer yang mewakili lebar dan tinggi sebuah gambar. Tipe ini harus dialokasikan pada stack dan diteruskan ke fungsi dengan nilai atau referensi. Jangan pernah menggunakan kelas [System::SmartPtr](../../system/smartptr/) untuk mengelola objek tipe ini.

```cpp
class Size
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| static [Add](./add/)(const Size\&, const Size\&) | Mengembalikan objek [Size](./) baru yang merupakan jumlah dari objek [Size](./) yang ditentukan, yaitu yang nilai lebarnya sama dengan jumlah nilai lebar dari objek-objek yang ditentukan dan nilai tingginya sama dengan jumlah nilai tinggi dari objek-objek yang ditentukan. |
| static [Ceiling](./ceiling/)(const SizeF\&) | Membuat objek [Size](./) dari objek [SizeF](../sizef/) yang ditentukan dengan membulatkan nilai lebar dan tinggi objek [SizeF](../sizef/) ke nilai integer berikutnya yang lebih tinggi. |
| [Equals](./equals/)(const Size\&) const | Menentukan apakah objek saat ini dan objek yang ditentukan sama, yaitu mewakili sepasang nilai lebar dan tinggi yang sama. |
| [get_Height](./get_height/)() const | Mengembalikan nilai tinggi yang direpresentasikan oleh objek saat ini. |
| [get_IsEmpty](./get_isempty/)() const | Menentukan apakah kedua nilai lebar dan tinggi sama dengan 0. |
| [get_Width](./get_width/)() const | Mengembalikan nilai lebar yang direpresentasikan oleh objek saat ini. |
| [GetHashCode](./gethashcode/)() const | Mengembalikan kode hash untuk objek saat ini. |
| [operator Point](./operatorpoint/)() const | Membuat sebuah instance objek [Point](../point/) dan menginisialisasi koordinat X dan Y-nya dengan nilai lebar dan tinggi objek saat ini secara berkorespondensi. |
| [operator SizeF](./operatorsizef/)() const | Membuat sebuah instance objek [SizeF](../sizef/) dan menginisialisasinya dengan nilai lebar dan tinggi dari objek [Size](./) saat ini. |
| static [Round](./round/)(const SizeF\&) | Membuat objek [Size](./) dari objek [SizeF](../sizef/) yang ditentukan dengan membulatkan nilai lebar dan tinggi objek [SizeF](../sizef/) ke nilai integer terdekat. |
| [set_Height](./set_height/)(int) | Mengatur nilai tinggi yang direpresentasikan oleh objek saat ini. |
| [set_Width](./set_width/)(int) | Mengatur nilai lebar yang direpresentasikan oleh objek saat ini. |
| [Size](./size/)() | Membuat objek [Size](./) baru dan menginisialisasi nilai lebar dan tingginya dengan 0. |
| [Size](./size/)(const Point\&) | Membuat objek [Size](./) baru dan menginisialisasi nilai lebar dan tingginya dengan nilai koordinat X dan Y dari titik yang ditentukan secara berkorespondensi. |
| [Size](./size/)(int, int) | Membuat objek [Size](./) baru dan menginisialisasinya dengan nilai yang ditentukan. |
| static [Subtract](./subtract/)(const Size\&, const Size\&) | Mengembalikan objek [Size](./) baru yang merupakan hasil pengurangan **size2** dari **size1**, yaitu nilai lebar yang merupakan hasil pengurangan nilai lebar **size2**'s dari nilai lebar **size1**'s dan nilai tinggi yang merupakan hasil pengurangan nilai tinggi **size2**'s dari nilai tinggi **size1**'s. |
| [ToString](./tostring/)() const | Mengembalikan representasi string dari pasangan nilai lebar dan tinggi yang direpresentasikan oleh objek saat ini. |
| static [Truncate](./truncate/)(const SizeF\&) | Membuat objek [Size](./) dari objek [SizeF](../sizef/) yang ditentukan dengan memotong nilai lebar dan tinggi objek [SizeF](../sizef/) ke nilai integer terdekat yang lebih rendah. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [Empty](./empty/) | Sebuah instance kosong dari kelas [Size](./) yang nilai lebar dan tingginya adalah 0. |
## Lihat Juga

* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
