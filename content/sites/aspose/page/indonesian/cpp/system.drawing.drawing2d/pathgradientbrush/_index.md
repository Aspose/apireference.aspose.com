---
title: "System::Drawing::Drawing2D::PathGradientBrush kelas"
linktitle: "PathGradientBrush"
second_title: "Aspose.Page untuk C++"
description: "System::Drawing::Drawing2D::PathGradientBrush kelas. Mewakili kuas yang mengisi interior objek GraphicsPath dengan gradien. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1200
url: /id/cpp/system.drawing.drawing2d/pathgradientbrush/
---
## PathGradientBrush class


Mewakili kuas yang mengisi interior objek [GraphicsPath](../graphicspath/) dengan gradien. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class PathGradientBrush : public System::Drawing::Brush
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Clone](./clone/)() override | Membuat salinan dari objek saat ini. |
| [get_Blend](./get_blend/)() const | BELUM DIIMPLEMENTASIKAN. |
| [get_CenterColor](./get_centercolor/)() const | Mengembalikan warna yang berada di tengah jalur yang diisi oleh objek saat ini. |
| [get_CenterPoint](./get_centerpoint/)() const | Mendapatkan titik tengah gradien. |
| [get_FocusScales](./get_focusscales/)() const | Mendapatkan titik fokus untuk penurunan gradien. |
| [get_InterpolationColors](./get_interpolationcolors/)() const | Mengembalikan nilai yang mendefinisikan gradien linear multiwarna. |
| [get_Rectangle](./get_rectangle/)() | BELUM DIIMPLEMENTASIKAN. |
| [get_SurroundColors](./get_surroundcolors/)() const | Mengembalikan warna yang sesuai dengan titik-titik pada jalur yang diisi oleh [PathGradientBrush](./) ini. |
| [get_Transform](./get_transform/)() const | Mengembalikan salinan objek [Matrix](../matrix/) yang menentukan transformasi geometris untuk kuas yang diwakili oleh objek saat ini. |
| [get_WrapMode](./get_wrapmode/)() const | Mengembalikan mode pembungkus. |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Matrix\>\&, MatrixOrder) | Mengalikan matriks transformasi objek saat ini dengan matriks yang ditentukan. |
| [PathGradientBrush](./pathgradientbrush/)(const ArrayPtr\<PointF\>\&, WrapMode) | Informasi RTTI. |
| [PathGradientBrush](./pathgradientbrush/)(const ArrayPtr\<Point\>\&, WrapMode) | Membuat instance baru dari kelas [PathGradientBrush](./). |
| [PathGradientBrush](./pathgradientbrush/)(const SharedPtr\<GraphicsPath\>\&) | Membuat instance baru dari kelas [PathGradientBrush](./). |
| [ResetTransform](./resettransform/)() | Mengatur ulang matriks transformasi objek saat ini sehingga menjadi matriks identitas. |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | Memutar transformasi geometris lokal sebesar sudut yang ditentukan dalam urutan yang ditentukan. |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | Menskalakan transformasi geometris lokal dengan faktor-faktor yang ditentukan dalam urutan yang ditentukan. |
| [set_Blend](./set_blend/)(const SharedPtr\<Blend\>\&) | Mengatur blend yang menentukan faktor dan posisi warna dasar untuk kuas ini. |
| [set_CenterColor](./set_centercolor/)(Color) | Menetapkan warna yang berada di tengah jalur yang diisi oleh objek saat ini. |
| [set_CenterPoint](./set_centerpoint/)(const PointF\&) | Menetapkan titik tengah gradien. |
| [set_FocusScales](./set_focusscales/)(const PointF\&) | Menetapkan titik fokus untuk penurunan gradien. |
| [set_InterpolationColors](./set_interpolationcolors/)(const SharedPtr\<ColorBlend\>\&) | Menetapkan nilai yang mendefinisikan gradien linear multiwarna. |
| [set_SurroundColors](./set_surroundcolors/)(const ArrayPtr\<Color\>\&) | Menetapkan warna yang sesuai dengan titik-titik pada jalur yang diisi oleh [PathGradientBrush](./) ini. |
| [set_Transform](./set_transform/)(const SharedPtr\<Matrix\>\&) | Mengatur objek [Matrix](../matrix/) yang menentukan transformasi geometris untuk kuas yang diwakili oleh objek saat ini. |
| [set_WrapMode](./set_wrapmode/)(WrapMode) | Mengatur mode pembungkus. |
| [SetBlendTriangularShape](./setblendtriangularshape/)(float, float) | BELUM DIIMPLEMENTASIKAN. |
| [SetSigmaBellShape](./setsigmabellshape/)(float, float) | BELUM DIIMPLEMENTASIKAN. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | Menerjemahkan transformasi geometris lokal dengan dimensi yang ditentukan dalam urutan yang ditentukan. |
## Lihat Juga

* Class [Brush](../../system.drawing/brush/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
