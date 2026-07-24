---
title: "Kelas System::Drawing::SizeF"
linktitle: "SizeF"
second_title: "Aspose.Page untuk C++"
description: "System::Drawing::SizeF class. Mewakili sepasang nilai floating point presisi tunggal yang mewakili lebar dan tinggi gambar. Tipe ini harus dialokasikan pada stack dan diteruskan ke fungsi dengan nilai atau referensi. Jangan pernah menggunakan kelas System::SmartPtr untuk mengelola objek tipe ini di C++."
type: docs
weight: 2300
url: /id/cpp/system.drawing/sizef/
---
## SizeF class


Mewakili sepasang nilai floating point presisi tunggal yang mewakili lebar dan tinggi gambar. Tipe ini harus dialokasikan pada stack dan diteruskan ke fungsi dengan nilai atau referensi. Jangan pernah menggunakan kelas [System::SmartPtr](../../system/smartptr/) untuk mengelola objek tipe ini.

```cpp
class SizeF
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| static [Add](./add/)(const SizeF\&, const SizeF\&) | Mengembalikan objek [SizeF](./) baru yang merupakan jumlah dari objek [SizeF](./) yang ditentukan, yaitu nilai lebar yang sama dengan jumlah nilai lebar objek yang ditentukan dan nilai tinggi yang sama dengan jumlah nilai tinggi objek yang ditentukan. |
| [Equals](./equals/)(const SizeF\&) const | Menentukan apakah objek saat ini dan objek yang ditentukan sama, yaitu mewakili sepasang nilai lebar dan tinggi yang sama. |
| [get_Height](./get_height/)() const | Mengembalikan nilai tinggi yang diwakili oleh objek saat ini. |
| [get_IsEmpty](./get_isempty/)() const | Menentukan apakah kedua nilai lebar dan tinggi sama dengan 0. |
| [get_Width](./get_width/)() const | Mengembalikan nilai lebar yang direpresentasikan oleh objek saat ini. |
| [GetHashCode](./gethashcode/)() const | Mengembalikan kode hash untuk objek saat ini. |
| [operator PointF](./operatorpointf/)() const | Mengonversi objek saat ini menjadi instance objek [Point](../point/) dengan menginisialisasi koordinat X dan Y-nya dengan nilai lebar dan tinggi objek saat ini secara berurutan. |
| [operator+=](./operator+=/)(const SizeF\&) | Menambahkan nilai lebar dan tinggi objek [SizeF](./) yang ditentukan ke nilai lebar dan tinggi objek [SizeF](./) saat ini secara berurutan. |
| [set_Height](./set_height/)(float) | Mengatur nilai tinggi yang direpresentasikan oleh objek saat ini. |
| [set_Width](./set_width/)(float) | Mengatur nilai lebar yang direpresentasikan oleh objek saat ini. |
| [SizeF](./sizef/)() | Membuat objek [SizeF](./) baru dan menginisialisasi nilai lebar serta tinggi dengan 0. |
| [SizeF](./sizef/)(const PointF\&) | Membuat objek [SizeF](./) baru dan menginisialisasi nilai lebar dan tinggi dengan nilai koordinat X dan Y dari titik yang ditentukan secara berurutan. |
| [SizeF](./sizef/)(float, float) | Membuat objek [SizeF](./) baru dan menginisialisasinya dengan nilai yang ditentukan. |
| static [Subtract](./subtract/)(const SizeF\&, const SizeF\&) | Mengembalikan objek [SizeF](./) baru yang merupakan hasil pengurangan **size2** dari **size1**, yaitu nilai lebar yang merupakan hasil pengurangan nilai lebar **size2** dari nilai lebar **size1** dan nilai tinggi yang merupakan hasil pengurangan nilai tinggi **size2** dari nilai tinggi **size1**. |
| [ToPointF](./topointf/)() const | Mengonversi objek saat ini menjadi instance objek [Point](../point/) dengan menginisialisasi koordinat X dan Y-nya dengan nilai lebar dan tinggi objek saat ini secara berurutan. |
| [ToSize](./tosize/)() const | Membuat objek [Size](../size/) dari objek [SizeF](./) saat ini dengan memotong nilai lebar dan tinggi objek [SizeF](./) ke nilai integer terdekat yang lebih rendah. |
| [ToString](./tostring/)() const | Mengembalikan representasi string dari pasangan nilai lebar dan tinggi yang direpresentasikan oleh objek saat ini. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [Empty](./empty/) | Sebuah instance kosong dari kelas [SizeF](./) yang nilai lebar dan tingginya adalah 0. |
## Lihat Juga

* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
