---
title: "System::Drawing::Drawing2D::CustomLineCap kelas"
linktitle: "CustomLineCap"
second_title: "Aspose.Page untuk C++"
description: "System::Drawing::Drawing2D::CustomLineCap kelas. Mewakili cap garis yang didefinisikan pengguna. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini pada stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 400
url: /id/cpp/system.drawing.drawing2d/customlinecap/
---
## CustomLineCap class


Mewakili cap garis yang didefinisikan pengguna. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini pada stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class CustomLineCap : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [Clone](./clone/)() | Mengembalikan salinan objek saat ini. |
| [CustomLineCap](./customlinecap/)(const SharedPtr\<GraphicsPath\>\&, const SharedPtr\<GraphicsPath\>\&, LineCap, float) | Membuat instance baru dari kelas [CustomLineCap](./) yang merepresentasikan cap garis yang didefinisikan pengguna dengan properti yang ditentukan. |
| [Dispose](./dispose/)() | Melepaskan semua sumber daya sistem operasi yang diperoleh oleh objek saat ini. |
| [get_BaseCap](./get_basecap/)() const | Mengembalikan cap garis dasar dari mana cap khusus ini dibuat. |
| [get_BaseInset](./get_baseinset/)() const | Mengembalikan jarak antara garis dan cap. |
| [get_StrokeJoin](./get_strokejoin/)() const | Mengembalikan nilai [LineJoin](../linejoin/) yang menentukan bagaimana garis-garis pada cap khusus ini digabungkan. |
| [get_WidthScale](./get_widthscale/)() const | Mengembalikan skala cap khusus ini. |
| [GetStrokeCaps](./getstrokecaps/)(LineCap\&, LineCap\&) | Mengambil cap garis awal dan akhir dari cap khusus yang diwakili oleh objek saat ini. |
| [set_BaseCap](./set_basecap/)(LineCap) | Mengatur nilai cap garis dasar untuk cap khusus ini. |
| [set_BaseInset](./set_baseinset/)(float) | Mengatur jarak antara garis dan cap. |
| [set_StrokeJoin](./set_strokejoin/)(LineJoin) | Mengatur nilai [LineJoin](../linejoin/) yang menentukan bagaimana garis-garis pada cap khusus ini digabungkan. |
| [set_WidthScale](./set_widthscale/)(float) | Mengatur nilai skala cap khusus ini. |
| [SetStrokeCaps](./setstrokecaps/)(LineCap, LineCap) | Mengatur cap garis awal dan akhir dari cap khusus yang diwakili oleh objek saat ini. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
