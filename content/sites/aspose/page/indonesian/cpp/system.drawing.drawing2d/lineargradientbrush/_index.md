---
title: "kelas System::Drawing::Drawing2D::LinearGradientBrush"
linktitle: "LinearGradientBrush"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Drawing::Drawing2D::LinearGradientBrush. Mewakili kuas gradien linier. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini pada stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk melewatkannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 900
url: /id/cpp/system.drawing.drawing2d/lineargradientbrush/
---
## LinearGradientBrush class


Mewakili kuas gradien linier. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini pada stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk melewatkannya ke fungsi sebagai argumen.

```cpp
class LinearGradientBrush : public System::Drawing::Brush
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Clone](./clone/)() override | Membuat salinan dari objek saat ini. |
| [get_Blend](./get_blend/)() const | Mengembalikan blend yang menentukan faktor dan posisi warna dasar untuk kuas ini. |
| [get_GammaCorrection](./get_gammacorrection/)() const | Mengembalikan nilai yang menunjukkan bahwa koreksi gamma diaktifkan untuk kuas ini. |
| [get_InterpolationColors](./get_interpolationcolors/)() const | Mengembalikan objek [ColorBlend](../colorblend/) yang mendefinisikan gradien linier multiwarna. |
| [get_LinearColors](./get_linearcolors/)() const | Mengembalikan warna awal dan akhir dari gradien ini. |
| [get_Rectangle](./get_rectangle/)() | Mengembalikan persegi panjang pembatas. |
| [get_Transform](./get_transform/)() const | Mengembalikan salinan objek [Matrix](../matrix/) yang menentukan transformasi geometris untuk kuas yang diwakili oleh objek saat ini. |
| [get_WrapMode](./get_wrapmode/)() const | Mengembalikan mode pembungkus. |
| [LinearGradientBrush](./lineargradientbrush/)(const PointF\&, const PointF\&, const Color\&, const Color\&) | Informasi RTTI. |
| [LinearGradientBrush](./lineargradientbrush/)(const Point\&, const Point\&, const Color\&, const Color\&) | Membuat instance baru dari [LinearGradientBrush](./). |
| [LinearGradientBrush](./lineargradientbrush/)(const RectangleF\&, const Color\&, const Color\&, LinearGradientMode) | Membuat instance baru dari [LinearGradientBrush](./). |
| [LinearGradientBrush](./lineargradientbrush/)(const Rectangle\&, const Color\&, const Color\&, LinearGradientMode) | Membuat instance baru dari [LinearGradientBrush](./). |
| [LinearGradientBrush](./lineargradientbrush/)(const RectangleF\&, const Color\&, const Color\&, float, bool) | Membuat instance baru dari [LinearGradientBrush](./). |
| [LinearGradientBrush](./lineargradientbrush/)(const Rectangle\&, const Color\&, const Color\&, float, bool) | Membuat instance baru dari [LinearGradientBrush](./). |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Matrix\>\&, MatrixOrder) | Mengalikan matriks transformasi objek saat ini dengan matriks yang ditentukan. |
| [ResetTransform](./resettransform/)() | Mengatur ulang matriks transformasi objek saat ini. |
| [RotateTransform](./rotatetransform/)(float, MatrixOrder) | Memutar matriks transformasi objek saat ini. |
| [ScaleTransform](./scaletransform/)(float, float, MatrixOrder) | Menskalakan matriks transformasi objek saat ini. |
| [set_Blend](./set_blend/)(const SharedPtr\<Blend\>\&) | Mengatur blend yang menentukan faktor dan posisi warna dasar untuk kuas ini. |
| [set_GammaCorrection](./set_gammacorrection/)(bool) | Mengatur status koreksi gamma untuk kuas ini. |
| [set_InterpolationColors](./set_interpolationcolors/)(const SharedPtr\<ColorBlend\>\&) | Mengatur objek [ColorBlend](../colorblend/) yang mendefinisikan gradien linier multiwarna. |
| [set_LinearColors](./set_linearcolors/)(const ArrayPtr\<Color\>\&) | Mengatur warna awal dan akhir dari gradien ini. |
| [set_Transform](./set_transform/)(const SharedPtr\<Matrix\>\&) | Mengatur objek [Matrix](../matrix/) yang menentukan transformasi geometris untuk kuas yang diwakili oleh objek saat ini. |
| [set_WrapMode](./set_wrapmode/)(WrapMode) | Mengatur mode pembungkus. |
| [SetBlendTriangularShape](./setblendtriangularshape/)(float, float) | BELUM DIIMPLEMENTASIKAN. |
| [SetSigmaBellShape](./setsigmabellshape/)(float, float) | BELUM DIIMPLEMENTASIKAN. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | Menerjemahkan matriks transformasi objek saat ini. |
## Lihat Juga

* Class [Brush](../../system.drawing/brush/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
