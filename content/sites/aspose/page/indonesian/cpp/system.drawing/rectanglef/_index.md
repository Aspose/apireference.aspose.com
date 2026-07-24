---
title: "kelas System::Drawing::RectangleF"
linktitle: "RectangleF"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Drawing::RectangleF. Mewakili area persegi panjang dari sebuah gambar yang didefinisikan sebagai koordinat X dan Y titik sudut kiri atas dengan presisi floating point tunggal serta lebar dan tingginya. Tipe ini harus dialokasikan pada stack dan diteruskan ke fungsi dengan nilai atau referensi. Jangan pernah menggunakan kelas System::SmartPtr untuk mengelola objek tipe ini dalam C++."
type: docs
weight: 2000
url: /id/cpp/system.drawing/rectanglef/
---
## RectangleF class


Mewakili area persegi panjang dari sebuah gambar yang didefinisikan sebagai koordinat X dan Y titik sudut kiri atas dengan presisi floating point tunggal serta lebar dan tingginya. Tipe ini harus dialokasikan pada stack dan diteruskan ke fungsi dengan nilai atau referensi. Jangan pernah menggunakan kelas [System::SmartPtr](../../system/smartptr/) untuk mengelola objek tipe ini.

```cpp
class RectangleF
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Contains](./contains/)(float, float) | Menentukan apakah titik yang ditentukan berada di dalam persegi panjang yang diwakili oleh objek saat ini. |
| [Contains](./contains/)(const PointF\&) | Menentukan apakah titik yang ditentukan berada di dalam persegi panjang yang diwakili oleh objek saat ini. |
| [Contains](./contains/)(const RectangleF\&) | Menentukan apakah persegi panjang yang ditentukan berada di dalam persegi panjang yang diwakili oleh objek saat ini. |
| [Equals](./equals/)(const RectangleF\&) const | Menentukan apakah persegi panjang yang diwakili oleh objek saat ini dan objek yang ditentukan identik. |
| static [FromLTRB](./fromltrb/)(float, float, float, float) | Membuat objek [RectangleF](./) baru yang mewakili persegi panjang dengan lokasi tepi yang ditentukan. |
| [get_Bottom](./get_bottom/)() const | Mengembalikan koordinat y dari tepi bawah persegi panjang yang diwakili oleh objek saat ini. |
| [get_Height](./get_height/)() const | Mengembalikan tinggi persegi panjang yang diwakili oleh objek saat ini. |
| [get_IsEmpty](./get_isempty/)() const | Menentukan apakah koordinat X dan Y dari sudut kiri atas persegi panjang yang diwakili oleh objek saat ini serta lebar dan tingginya memiliki nilai 0. |
| [get_Left](./get_left/)() const | Mengembalikan koordinat X dari tepi kiri persegi panjang yang diwakili oleh objek saat ini. |
| [get_Location](./get_location/)() const | Mengembalikan sebuah instance dari kelas [PointF](../pointf/) yang menentukan lokasi sudut kiri atas persegi panjang yang diwakili oleh objek saat ini. |
| [get_Right](./get_right/)() const | Mengembalikan koordinat X dari tepi kanan persegi panjang yang diwakili oleh objek saat ini. |
| [get_Size](./get_size/)() const | Mengembalikan sebuah instance dari kelas [SizeF](../sizef/) yang menentukan lebar dan tinggi persegi panjang yang diwakili oleh objek saat ini. |
| [get_Top](./get_top/)() const | Mengembalikan koordinat Y dari tepi atas persegi panjang yang diwakili oleh objek saat ini. |
| [get_Width](./get_width/)() const | Mengembalikan lebar persegi panjang yang diwakili oleh objek saat ini. |
| [get_X](./get_x/)() const | Mengembalikan koordinat X dari sudut kiri atas persegi panjang yang diwakili oleh objek saat ini. |
| [get_Y](./get_y/)() const | Mengembalikan koordinat Y dari sudut kiri atas persegi panjang yang diwakili oleh objek saat ini. |
| [GetHashCode](./gethashcode/)() const | Mengembalikan kode hash dari objek saat ini. |
| [Inflate](./inflate/)(float, float) | Meningkatkan lebar dan tinggi persegi panjang yang diwakili oleh objek saat ini, sambil mempertahankan lokasi pusat geometris persegi panjang. Lebar dan tinggi ditingkatkan ke kedua arah sebesar jumlah yang ditentukan. |
| [Inflate](./inflate/)(const SizeF\&) | Meningkatkan lebar dan tinggi persegi panjang yang diwakili oleh objek saat ini, sambil mempertahankan lokasi pusat geometris persegi panjang. Lebar dan tinggi ditingkatkan ke kedua arah sebesar nilai lebar dan tinggi yang ditentukan oleh objek ukuran yang ditentukan secara bersamaan. |
| static [Inflate](./inflate/)(const RectangleF\&, float, float) | Meningkatkan lebar dan tinggi persegi panjang yang diwakili oleh objek yang ditentukan, sambil mempertahankan lokasi pusat geometris persegi panjang. Lebar dan tinggi ditingkatkan ke kedua arah sebesar jumlah yang ditentukan. |
| [Intersect](./intersect/)(const RectangleF\&) | Mengganti persegi panjang yang diwakili oleh objek saat ini dengan persegi panjang yang merupakan hasil dari interseksinya dengan persegi panjang yang diwakili oleh objek yang ditentukan. |
| static [Intersect](./intersect/)(const RectangleF\&, const RectangleF\&) | Mengembalikan persegi panjang yang merupakan hasil interseksi dari persegi panjang yang ditentukan. |
| [IntersectsWith](./intersectswith/)(const RectangleF\&) | Menentukan apakah persegi panjang yang diwakili oleh objek saat ini dan objek yang ditentukan berpotongan. |
| [Offset](./offset/)(const PointF\&) | Menggeser posisi persegi panjang yang diwakili oleh objek saat ini sebesar jumlah yang ditentukan. |
| [Offset](./offset/)(float, float) | Menggeser posisi persegi panjang yang diwakili oleh objek saat ini sebesar jumlah yang ditentukan. |
| [operator!=](./operator!=/)(std::nullptr_t) const | Selalu mengembalikan true. |
| [operator==](./operator==/)(std::nullptr_t) const | Selalu mengembalikan false. |
| [RectangleF](./rectanglef/)() | Membuat instance baru dari objek [RectangleF](./) yang mewakili persegi panjang dengan koordinat X dan Y serta nilai lebar dan tinggi diatur ke 0. |
| [RectangleF](./rectanglef/)(float, float, float, float) | Membuat instance baru dari objek [RectangleF](./) yang mewakili persegi panjang dengan koordinat yang ditentukan dari sudut kiri atasnya serta lebar dan tinggi. |
| [RectangleF](./rectanglef/)(const PointF\&, const SizeF\&) | Membuat instance baru dari objek [RectangleF](./) yang mewakili sebuah persegi panjang dengan koordinat sudut kiri atasnya ditentukan sebagai instance dari kelas [PointF](../pointf/) dan lebar serta tingginya sebagai instance dari kelas [SizeF](../sizef/). |
| explicit [RectangleF](./rectanglef/)(const Rectangle\&) | Membuat instance baru dari objek [RectangleF](./) yang mewakili persegi panjang yang setara dengan yang ditentukan. |
| [set_Height](./set_height/)(float) | Mengatur tinggi persegi panjang yang diwakili oleh objek saat ini. |
| [set_Location](./set_location/)(PointF) | Mengatur lokasi sudut kiri atas persegi panjang yang diwakili oleh objek saat ini. |
| [set_Size](./set_size/)(SizeF) | Mengatur lebar dan tinggi persegi panjang yang diwakili oleh objek saat ini. |
| [set_Width](./set_width/)(float) | Mengatur lebar persegi panjang yang diwakili oleh objek saat ini. |
| [set_X](./set_x/)(float) | Mengatur koordinat X sudut kiri atas persegi panjang yang diwakili oleh objek saat ini. |
| [set_Y](./set_y/)(float) | Mengatur koordinat Y sudut kiri atas persegi panjang yang diwakili oleh objek saat ini. |
| [ToString](./tostring/)() const | Mengembalikan representasi string dari objek saat ini. |
| static [Union](./union/)(const RectangleF\&, const RectangleF\&) | Mengembalikan sebuah persegi panjang yang merupakan hasil gabungan dari persegi panjang yang ditentukan. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [Empty](./empty/) | Persegi panjang kosong, yaitu persegi panjang yang nilai lokasi dan ukurannya nol. |
## Lihat Juga

* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
