---
title: "System::Drawing::Pen class"
linktitle: "Pen"
second_title: "Aspose.Page untuk C++"
description: "System::Drawing::Pen class. Mewakili properti seperti warna, lebar, dll. dari garis dan kurva yang digambar. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1500
url: /id/cpp/system.drawing/pen/
---
## Pen class


Mewakili properti seperti warna, lebar, dll. dari garis dan kurva yang digambar. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class Pen : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Clone](./clone/)() | Mengembalikan salinan objek saat ini. |
| [Dispose](./dispose/)() | Melepaskan semua sumber daya operasional yang diperoleh oleh objek saat ini. |
| [get_Alignment](./get_alignment/)() const | Mengembalikan nilai yang menunjukkan perataan objek [Pen](./) saat ini. |
| [get_Brush](./get_brush/)() | Mengembalikan objek [Brush](../brush/) dari pena ini. |
| [get_Color](./get_color/)() const | Mengembalikan warna pena ini. |
| [get_CompoundArray](./get_compoundarray/)() const | Mengembalikan array nilai yang menentukan pena komposit. |
| [get_DashCap](./get_dashcap/)() const | Mengembalikan nilai yang menunjukkan tutup yang digunakan di kedua ujung garis putus-putus. |
| [get_DashOffset](./get_dashoffset/)() const | Mengembalikan jarak dari awal garis ke permulaan pola putus-putus. |
| [get_DashPattern](./get_dashpattern/)() const | Mengembalikan array yang menunjukkan pola putus-putus khusus dalam garis putus-putus. |
| [get_DashStyle](./get_dashstyle/)() const | Mengembalikan nilai yang menunjukkan gaya putus-putus dari objek [Pen](./) saat ini. |
| [get_EndCap](./get_endcap/)() const | Mengembalikan nilai yang menunjukkan tutup akhir garis dari objek [Pen](./) saat ini. |
| [get_LineJoin](./get_linejoin/)() const | Mengembalikan nilai yang menunjukkan bagaimana garis yang digambar oleh objek [Pen](./) ini digabungkan. |
| [get_MiterLimit](./get_miterlimit/)() const | Mengembalikan batas ketebalan sambungan pada sudut miring. |
| [get_PenType](./get_pentype/)() const | BELUM DIIMPLEMENTASIKAN. |
| [get_StartCap](./get_startcap/)() const | Mengembalikan nilai yang menunjukkan tutup awal garis dari objek [Pen](./) saat ini. |
| [get_Transform](./get_transform/)() | Mengembalikan salinan objek Matrix yang menentukan transformasi geometris untuk pena yang diwakili oleh objek saat ini. |
| [get_Width](./get_width/)() const | Mengembalikan lebar objek [Pen](./) saat ini. |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Drawing2D::Matrix\>\&, Drawing2D::MatrixOrder) | Mengalikan matriks transformasi objek saat ini dengan matriks yang ditentukan. |
| [Pen](./pen/)(const Color\&) | Membuat objek [Pen](./) baru yang mewakili warna yang ditentukan. |
| [Pen](./pen/)(const Color\&, float) | Membuat objek [Pen](./) baru yang mewakili warna dan lebar yang ditentukan. |
| [Pen](./pen/)(const SharedPtr\<Brush\>\&) | Membuat objek [Pen](./) baru dan menginisialisasinya dengan objek [Brush](../brush/) yang ditentukan. |
| [Pen](./pen/)(const SharedPtr\<Brush\>\&, float) | Membuat objek [Pen](./) baru dan menginisialisasinya dengan objek [Brush](../brush/) yang ditentukan. |
| [ResetTransform](./resettransform/)() | Mengatur ulang matriks transformasi objek saat ini sehingga menjadi matriks identitas. |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | Memutar transformasi geometris lokal sebesar sudut yang ditentukan dalam urutan yang ditentukan. |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | Menskalakan transformasi geometris lokal dengan faktor-faktor yang ditentukan dalam urutan yang ditentukan. |
| [set_Alignment](./set_alignment/)(Drawing2D::PenAlignment) | Mengatur perataan objek [Pen](./) saat ini. |
| [set_Brush](./set_brush/)(const SharedPtr\<Brush\>\&) | Mengatur objek [Brush](../brush/) pena ini. |
| [set_Color](./set_color/)(const Color\&) | Mengatur warna pena ini. |
| [set_CompoundArray](./set_compoundarray/)(const System::ArrayPtr\<float\>\&) | Mengatur array nilai yang menentukan pena komposit. |
| [set_CustomEndCap](./set_customendcap/)(const SharedPtr\<Drawing2D::CustomLineCap\>\&) | Mengatur tutup akhir garis khusus. |
| [set_CustomStartCap](./set_customstartcap/)(const SharedPtr\<Drawing2D::CustomLineCap\>\&) | Mengatur tutup awal garis khusus. |
| [set_DashCap](./set_dashcap/)(Drawing2D::DashCap) | Mengatur nilai yang menentukan tutup yang digunakan di kedua ujung garis putus-putus. |
| [set_DashOffset](./set_dashoffset/)(float) | Mengatur jarak dari awal garis ke permulaan pola putus-putus. |
| [set_DashPattern](./set_dashpattern/)(const System::ArrayPtr\<float\>\&) | Mengatur array yang menentukan pola putus-putus khusus dalam garis putus-putus. Array tersebut terdiri dari angka yang menentukan panjang dash dan spasi yang bergantian. |
| [set_DashStyle](./set_dashstyle/)(Drawing2D::DashStyle) | Mengatur nilai yang menentukan gaya putus-putus dari objek [Pen](./) saat ini. |
| [set_EndCap](./set_endcap/)(Drawing2D::LineCap) | Mengatur tutup akhir garis dari objek [Pen](./) saat ini. |
| [set_LineJoin](./set_linejoin/)(Drawing2D::LineJoin) | Mengatur nilai yang menentukan bagaimana garis yang digambar oleh objek [Pen](./) ini digabungkan. |
| [set_MiterLimit](./set_miterlimit/)(float) | Mengatur batas ketebalan sambungan pada sudut miter. |
| [set_StartCap](./set_startcap/)(Drawing2D::LineCap) | Mengatur penutup garis awal dari objek [Pen](./) saat ini. |
| [set_Transform](./set_transform/)(const SharedPtr\<Drawing2D::Matrix\>\&) | Mengatur objek Matrix yang menentukan transformasi geometris untuk pena yang diwakili oleh objek saat ini. |
| [set_Width](./set_width/)(float) | Mengatur lebar objek [Pen](./) saat ini. |
| [SetLineCap](./setlinecap/)(Drawing2D::LineCap, Drawing2D::LineCap, Drawing2D::DashCap) | BELUM DIIMPLEMENTASIKAN. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | Menerjemahkan transformasi geometris lokal dengan dimensi yang ditentukan dalam urutan yang ditentukan. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
