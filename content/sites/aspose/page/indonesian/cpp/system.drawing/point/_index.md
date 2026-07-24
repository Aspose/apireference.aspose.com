---
title: "System::Drawing::Point kelas"
linktitle: "Point"
second_title: "Aspose.Page untuk C++"
description: "System::Drawing::Point kelas. Mewakili sepasang koordinat integer X dan Y dari sebuah titik pada bidang dua dimensi. Tipe ini harus dialokasikan pada stack dan diteruskan ke fungsi dengan nilai atau referensi. Jangan pernah menggunakan kelas System::SmartPtr untuk mengelola objek tipe ini dalam C++."
type: docs
weight: 1700
url: /id/cpp/system.drawing/point/
---
## Point class


Mewakili sepasang koordinat integer X dan Y dari sebuah titik pada bidang dua dimensi. Tipe ini harus dialokasikan pada stack dan diteruskan ke fungsi dengan nilai atau referensi. Jangan pernah menggunakan kelas [System::SmartPtr](../../system/smartptr/) untuk mengelola objek tipe ini.

```cpp
class Point
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| static [Add](./add/)(const Point\&, const Size\&) | Menambahkan nilai lebar dan tinggi dari objek [Size](../size/) yang ditentukan ke nilai koordinat X dan Y dari objek [Point](./) yang ditentukan secara berkorespondensi. |
| static [Ceiling](./ceiling/)(const PointF\&) | Membuat objek [Point](./) dari objek [PointF](../pointf/) yang ditentukan dengan membulatkan nilai koordinat X dan Y objek [PointF](../pointf/) ke nilai integer berikutnya yang lebih tinggi. |
| [Equals](./equals/)(const Point\&) const | Menentukan apakah objek saat ini dan objek yang ditentukan sama, yaitu mewakili pasangan nilai koordinat X dan Y yang sama. |
| [get_IsEmpty](./get_isempty/)() const | Menentukan apakah kedua nilai koordinat X dan Y sama dengan 0. |
| [get_X](./get_x/)() const | Mengembalikan nilai koordinat X yang diwakili oleh objek saat ini. |
| [get_Y](./get_y/)() const | Mengembalikan nilai koordinat Y yang diwakili oleh objek saat ini. |
| [GetHashCode](./gethashcode/)() const | Mengembalikan kode hash untuk objek saat ini. |
| [getStdHash](./getstdhash/)() const | Mengembalikan nilai hash untuk objek saat ini. |
| [IsNull](./isnull/)() const | Selalu mengembalikan false. |
| [Offset](./offset/)(int, int) | Menggeser nilai koordinat X dan Y yang diwakili oleh objek saat ini dengan nilai yang ditentukan. |
| [Offset](./offset/)(Point) | Menggeser koordinat X dan Y yang diwakili oleh objek saat ini dengan nilai koordinat X dan Y yang diwakili oleh objek [Point](./) yang ditentukan secara berkorespondensi. |
| [operator PointF](./operatorpointf/)() const | Membuat instance objek [PointF](../pointf/) dan menginisialisasinya dengan nilai koordinat X dan Y dari objek [Point](./) saat ini. |
| [operator Size](./operatorsize/)() const | Membuat instance objek [Size](../size/) dan menginisialisasi nilai lebar dan tingginya dengan nilai koordinat X dan Y yang diwakili oleh objek saat ini secara berkorespondensi. |
| [Point](./point/)() | Membuat objek [Point](./) baru dan menginisialisasi nilai koordinat X dan Y-nya dengan 0. |
| [Point](./point/)(int, int) | Membuat objek [Point](./) baru dan menginisialisasinya dengan nilai yang ditentukan. |
| [Point](./point/)(const Size\&) | Membuat objek [Point](./) baru dan menginisialisasi nilai koordinat X dan Y-nya dengan nilai lebar dan tinggi dari objek [SizeF](../sizef/) yang ditentukan secara berkorespondensi. |
| [Point](./point/)(int) | Membuat objek [Point](./) baru dan menginisialisasi nilai koordinat X-nya dengan nilai yang dibentuk dari 16 bit tinggi dari integer 32-bit yang ditentukan, dan nilai koordinat Y-nya dengan nilai yang dibentuk dari 16 bit rendah dari nilai integer 32-bit yang ditentukan. |
| static [Round](./round/)(const PointF\&) | Membuat objek [Point](./) dari objek [PointF](../pointf/) yang ditentukan dengan membulatkan nilai koordinat X dan Y objek [PointF](../pointf/) ke nilai integer terdekat. |
| [set_X](./set_x/)(int) | Mengatur nilai koordinat X yang diwakili oleh objek saat ini. |
| [set_Y](./set_y/)(int) | Mengatur nilai koordinat Y yang diwakili oleh objek saat ini. |
| static [Subtract](./subtract/)(const Point\&, const Size\&) | Mengurangi nilai lebar dan tinggi dari objek [Size](../size/) yang ditentukan dari nilai koordinat X dan Y objek [Point](./) yang bersangkutan. |
| [ToString](./tostring/)() const | Mengembalikan representasi string dari pasangan nilai koordinat X dan Y yang diwakili oleh objek saat ini. |
| static [Truncate](./truncate/)(const PointF\&) | Membuat objek [Point](./) dari objek [PointF](../pointf/) yang ditentukan dengan memotong nilai koordinat X dan Y objek [PointF](../pointf/) ke nilai integer terdekat ke bawah. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [Empty](./empty/) | Sebuah instance kosong dari kelas [Point](./) yang nilai koordinat X dan Y‑nya adalah 0. |
## Lihat Juga

* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
