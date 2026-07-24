---
title: "Kelas System::Drawing::Rectangle"
linktitle: "Persegi panjang"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Drawing::Rectangle. Mewakili area persegi panjang dari sebuah gambar yang didefinisikan sebagai koordinat X dan Y integer dari sudut kiri atasnya serta lebar dan tingginya. Tipe ini harus dialokasikan pada stack dan diteruskan ke fungsi dengan nilai atau referensi. Jangan pernah menggunakan kelas System::SmartPtr untuk mengelola objek tipe ini dalam C++."
type: docs
weight: 1900
url: /id/cpp/system.drawing/rectangle/
---
## Rectangle class


Mewakili area persegi panjang dari sebuah gambar yang didefinisikan sebagai koordinat X dan Y integer dari sudut kiri atasnya serta lebar dan tingginya. Tipe ini harus dialokasikan pada stack dan diteruskan ke fungsi dengan nilai atau referensi. Jangan pernah menggunakan kelas [System::SmartPtr](../../system/smartptr/) untuk mengelola objek tipe ini.

```cpp
class Rectangle
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| static [Ceiling](./ceiling/)(const RectangleF\&) | Membuat objek [Rectangle](./) dari objek [RectangleF](../rectanglef/) yang ditentukan dengan membulatkan nilai lokasi dan ukuran objek [RectangleF](../rectanglef/) ke nilai integer berikutnya yang lebih tinggi. |
| [Contains](./contains/)(int, int) const | Menentukan apakah titik yang ditentukan berada di dalam persegi panjang yang diwakili oleh objek saat ini. |
| [Contains](./contains/)(const Point\&) const | Menentukan apakah titik yang ditentukan berada di dalam persegi panjang yang diwakili oleh objek saat ini. |
| [Contains](./contains/)(const Rectangle\&) const | Menentukan apakah persegi panjang yang ditentukan berada di dalam persegi panjang yang diwakili oleh objek saat ini. |
| [Equals](./equals/)(const Rectangle\&) const | Menentukan apakah persegi panjang yang diwakili oleh objek saat ini dan objek yang ditentukan identik. |
| static [FromLTRB](./fromltrb/)(int, int, int, int) | Membuat objek [Rectangle](./) baru yang mewakili persegi panjang dengan lokasi tepi yang ditentukan. |
| [get_Bottom](./get_bottom/)() const | Mengembalikan koordinat y dari tepi bawah persegi panjang yang diwakili oleh objek saat ini. |
| [get_Height](./get_height/)() const | Mengembalikan tinggi persegi panjang yang diwakili oleh objek saat ini. |
| [get_IsEmpty](./get_isempty/)() const | Menentukan apakah koordinat X dan Y dari sudut kiri atas persegi panjang yang diwakili oleh objek saat ini serta lebar dan tingginya memiliki nilai 0. |
| [get_Left](./get_left/)() const | Mengembalikan koordinat X dari tepi kiri persegi panjang yang diwakili oleh objek saat ini. |
| [get_Location](./get_location/)() const | Mengembalikan sebuah instansi dari kelas [Point](../point/) yang menentukan lokasi sudut kiri atas persegi panjang yang diwakili oleh objek saat ini. |
| [get_Right](./get_right/)() const | Mengembalikan koordinat X dari tepi kanan persegi panjang yang diwakili oleh objek saat ini. |
| [get_Size](./get_size/)() const | Mengembalikan sebuah instansi dari kelas [Size](../size/) yang menentukan lebar dan tinggi persegi panjang yang diwakili oleh objek saat ini. |
| [get_Top](./get_top/)() const | Mengembalikan koordinat Y dari tepi atas persegi panjang yang diwakili oleh objek saat ini. |
| [get_Width](./get_width/)() const | Mengembalikan lebar persegi panjang yang diwakili oleh objek saat ini. |
| [get_X](./get_x/)() const | Mengembalikan koordinat X dari sudut kiri atas persegi panjang yang diwakili oleh objek saat ini. |
| [get_Y](./get_y/)() const | Mengembalikan koordinat Y dari sudut kiri atas persegi panjang yang diwakili oleh objek saat ini. |
| [GetHashCode](./gethashcode/)() const | Mengembalikan kode hash dari objek saat ini. |
| [Inflate](./inflate/)(int, int) | Meningkatkan lebar dan tinggi persegi panjang yang diwakili oleh objek saat ini, sambil mempertahankan lokasi pusat geometris persegi panjang. Lebar dan tinggi ditingkatkan ke kedua arah sebesar jumlah yang ditentukan. |
| [Inflate](./inflate/)(const Size\&) | Meningkatkan lebar dan tinggi persegi panjang yang diwakili oleh objek saat ini, sambil mempertahankan lokasi pusat geometris persegi panjang. Lebar dan tinggi ditingkatkan ke kedua arah sebesar nilai lebar dan tinggi yang ditentukan oleh objek ukuran yang ditentukan secara bersamaan. |
| static [Inflate](./inflate/)(const Rectangle\&, int, int) | Meningkatkan lebar dan tinggi persegi panjang yang diwakili oleh objek yang ditentukan, sambil mempertahankan lokasi pusat geometris persegi panjang. Lebar dan tinggi ditingkatkan ke kedua arah sebesar jumlah yang ditentukan. |
| [Intersect](./intersect/)(const Rectangle\&) | Mengganti persegi panjang yang diwakili oleh objek saat ini dengan persegi panjang yang merupakan hasil dari interseksinya dengan persegi panjang yang diwakili oleh objek yang ditentukan. |
| static [Intersect](./intersect/)(const Rectangle\&, const Rectangle\&) | Mengembalikan persegi panjang yang merupakan hasil interseksi dari persegi panjang yang ditentukan. |
| [IntersectsWith](./intersectswith/)(const Rectangle\&) | Menentukan apakah persegi panjang yang diwakili oleh objek saat ini dan objek yang ditentukan berpotongan. |
| [Offset](./offset/)(const Point\&) | Menggeser posisi persegi panjang yang diwakili oleh objek saat ini sebesar jumlah yang ditentukan. |
| [Offset](./offset/)(int, int) | Menggeser posisi persegi panjang yang diwakili oleh objek saat ini sebesar jumlah yang ditentukan. |
| [operator RectangleF](./operatorrectanglef/)() const | Mengembalikan objek [RectangleF](../rectanglef/) yang mewakili persegi panjang yang setara dengan persegi panjang yang diwakili oleh objek saat ini. |
| [operator!=](./operator!=/)(std::nullptr_t) const | Selalu mengembalikan true. |
| [operator==](./operator==/)(std::nullptr_t) const | Selalu mengembalikan false. |
| [Rectangle](./rectangle/)() | Membuat sebuah instansi baru dari objek [Rectangle](./) yang mewakili persegi panjang dengan koordinat X dan Y serta nilai lebar dan tinggi yang diatur ke 0. |
| [Rectangle](./rectangle/)(int, int, int, int) | Membuat sebuah instansi baru dari objek [Rectangle](./) yang mewakili persegi panjang dengan koordinat yang ditentukan dari sudut kiri atasnya serta lebar dan tinggi. |
| [Rectangle](./rectangle/)(const Point\&, const Size\&) | Membuat sebuah instansi baru dari objek [Rectangle](./) yang mewakili persegi panjang dengan koordinat sudut kiri atas yang ditentukan sebagai sebuah instansi dari kelas [Point](../point/) dan lebar serta tinggi sebagai sebuah instansi dari kelas [Size](../size/). |
| [Rectangle](./rectangle/)(const System::Windows::Forms::Screen::Rectangle_\&) | Membuat sebuah instansi baru dari objek [Rectangle](./) yang mewakili persegi panjang yang setara dengan yang ditentukan. |
| static [Round](./round/)(const RectangleF\&) | Membuat objek [Rectangle](./) dari objek [RectangleF](../rectanglef/) yang ditentukan dengan membulatkan nilai lokasi dan ukuran objek [RectangleF](../rectanglef/) ke nilai integer terdekat. |
| [set_Height](./set_height/)(int) | Mengatur tinggi persegi panjang yang diwakili oleh objek saat ini. |
| [set_Location](./set_location/)(Point) | Mengatur lokasi sudut kiri atas persegi panjang yang diwakili oleh objek saat ini. |
| [set_Size](./set_size/)(Size) | Mengatur lebar dan tinggi persegi panjang yang diwakili oleh objek saat ini. |
| [set_Width](./set_width/)(int) | Mengatur lebar persegi panjang yang diwakili oleh objek saat ini. |
| [set_X](./set_x/)(int) | Mengatur koordinat X sudut kiri atas persegi panjang yang diwakili oleh objek saat ini. |
| [set_Y](./set_y/)(int) | Mengatur koordinat Y sudut kiri atas persegi panjang yang diwakili oleh objek saat ini. |
| [ToString](./tostring/)() const | Mengembalikan representasi string dari objek saat ini. |
| static [Truncate](./truncate/)(const RectangleF\&) | Membuat objek [Rectangle](./) dari objek [RectangleF](../rectanglef/) yang ditentukan dengan memotong nilai lokasi dan ukuran objek [RectangleF](../rectanglef/) ke nilai integer berikutnya yang lebih rendah. |
| static [Union](./union/)(const Rectangle\&, const Rectangle\&) | Mengembalikan sebuah persegi panjang yang merupakan hasil gabungan dari persegi panjang yang ditentukan. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [Empty](./empty/) | Persegi panjang kosong, yaitu persegi panjang yang nilai lokasi dan ukurannya nol. |
## Lihat Juga

* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
