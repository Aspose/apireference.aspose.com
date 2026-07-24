---
title: "kelas System::Drawing::Imaging::ImageAttributes"
linktitle: "ImageAttributes"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Drawing::Imaging::ImageAttributes. Menyajikan informasi tentang bagaimana warna gambar dimanipulasi selama rendering. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 900
url: /id/cpp/system.drawing.imaging/imageattributes/
---
## ImageAttributes class


Menyajikan informasi tentang bagaimana warna gambar dimanipulasi selama rendering. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen.

```cpp
class ImageAttributes : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [ClearBrushRemapTable](./clearbrushremaptable/)() | BELUM DIIMPLEMENTASIKAN. |
| [ClearColorKey](./clearcolorkey/)(ColorAdjustType) | BELUM DIIMPLEMENTASIKAN. |
| [ClearColorMatrix](./clearcolormatrix/)(ColorAdjustType) | BELUM DIIMPLEMENTASIKAN. |
| [ClearGamma](./cleargamma/)(ColorAdjustType) | BELUM DIIMPLEMENTASIKAN. |
| [ClearNoOp](./clearnoop/)(ColorAdjustType) | BELUM DIIMPLEMENTASIKAN. |
| [ClearOutputChannel](./clearoutputchannel/)(ColorAdjustType) | BELUM DIIMPLEMENTASIKAN. |
| [ClearOutputChannelColorProfile](./clearoutputchannelcolorprofile/)(ColorAdjustType) | BELUM DIIMPLEMENTASIKAN. |
| [ClearRemapTable](./clearremaptable/)(ColorAdjustType) | BELUM DIIMPLEMENTASIKAN. |
| [ClearThreshold](./clearthreshold/)(ColorAdjustType) | BELUM DIIMPLEMENTASIKAN. |
| [Clone](./clone/)() | Membuat salinan dari objek saat ini. |
| [Dispose](./dispose/)() | Melepaskan semua sumber daya sistem operasi yang diperoleh oleh objek saat ini. |
| [GetAdjustedPalette](./getadjustedpalette/)(const SharedPtr\<ColorPalette\>\&, ColorAdjustType) | BELUM DIIMPLEMENTASIKAN. |
| [ImageAttributes](./imageattributes/)() | Konstruktor default. |
| [SetBrushRemapTable](./setbrushremaptable/)(const ArrayPtr\<SharedPtr\<ColorMap\>\>\&) | BELUM DIIMPLEMENTASIKAN. |
| [SetColorKey](./setcolorkey/)(Color, Color, ColorAdjustType) | BELUM DIIMPLEMENTASIKAN. |
| [SetColorMatrices](./setcolormatrices/)(const SharedPtr\<ColorMatrix\>\&, const SharedPtr\<ColorMatrix\>\&, ColorMatrixFlag, ColorAdjustType) | BELUM DIIMPLEMENTASIKAN. |
| [SetColorMatrix](./setcolormatrix/)(const SharedPtr\<ColorMatrix\>\&, ColorMatrixFlag, ColorAdjustType) | Mengatur matriks penyesuaian warna. |
| [SetGamma](./setgamma/)(float, ColorAdjustType) | BELUM DIIMPLEMENTASIKAN. |
| [SetNoOp](./setnoop/)(ColorAdjustType) | BELUM DIIMPLEMENTASIKAN. |
| [SetOutputChannel](./setoutputchannel/)(ColorChannelFlag, ColorAdjustType) | BELUM DIIMPLEMENTASIKAN. |
| [SetOutputChannelColorProfile](./setoutputchannelcolorprofile/)(const String\&, ColorAdjustType) | BELUM DIIMPLEMENTASIKAN. |
| [SetRemapTable](./setremaptable/)(const ArrayPtr\<SharedPtr\<ColorMap\>\>\&, ColorAdjustType) | BELUM DIIMPLEMENTASIKAN. |
| [SetThreshold](./setthreshold/)(float, ColorAdjustType) | BELUM DIIMPLEMENTASIKAN. |
| [SetWrapMode](./setwrapmode/)(Drawing2D::WrapMode, Color, bool) | Mengatur mode pembungkus dan warna yang digunakan untuk menentukan cara menata tekstur di seluruh bentuk, atau pada batas-batas bentuk. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
