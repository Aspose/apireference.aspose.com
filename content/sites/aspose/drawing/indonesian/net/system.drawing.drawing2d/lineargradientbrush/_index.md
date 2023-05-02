---
title: Class LinearGradientBrush
second_title: Aspose.Drawing untuk Referensi .NET API
description: System.Drawing.Drawing2D.LinearGradientBrush kelas. Merangkum aBrush dengan gradien linier. Kelas ini tidak dapat diwariskan.
type: docs
weight: 340
url: /id/net/system.drawing.drawing2d/lineargradientbrush/
---
## LinearGradientBrush class

Merangkum aBrush dengan gradien linier. Kelas ini tidak dapat diwariskan.

```csharp
public sealed class LinearGradientBrush : Brush
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [LinearGradientBrush](lineargradientbrush/#constructor)(Point, Point, Color, Color) | Menginisialisasi instance baru dari`LinearGradientBrush` kelas dengan titik dan warna yang ditentukan. |
| [LinearGradientBrush](lineargradientbrush/#constructor_1)(PointF, PointF, Color, Color) | Menginisialisasi instance baru dari`LinearGradientBrush` kelas dengan titik dan warna yang ditentukan. |
| [LinearGradientBrush](lineargradientbrush/#constructor_2)(Rectangle, Color, Color, float) | Menginisialisasi instance baru dari`LinearGradientBrush`kelas berdasarkan persegi panjang, warna awal dan akhir, dan sudut orientasi. |
| [LinearGradientBrush](lineargradientbrush/#constructor_4)(Rectangle, Color, Color, LinearGradientMode) | Menginisialisasi instance baru dari`LinearGradientBrush` kelas berdasarkan persegi panjang, warna awal dan akhir, dan orientasi. |
| [LinearGradientBrush](lineargradientbrush/#constructor_5)(RectangleF, Color, Color, float) | Menginisialisasi instance baru dari`LinearGradientBrush`kelas berdasarkan persegi panjang, warna awal dan akhir, dan sudut orientasi. |
| [LinearGradientBrush](lineargradientbrush/#constructor_7)(RectangleF, Color, Color, LinearGradientMode) | Menginisialisasi instance baru dari`LinearGradientBrush` kelas berdasarkan persegi panjang, warna awal dan akhir, dan mode orientasi. |
| [LinearGradientBrush](lineargradientbrush/#constructor_3)(Rectangle, Color, Color, float, bool) | Menginisialisasi instance baru dari`LinearGradientBrush`kelas berdasarkan persegi panjang, warna awal dan akhir, dan sudut orientasi. |
| [LinearGradientBrush](lineargradientbrush/#constructor_6)(RectangleF, Color, Color, float, bool) | Menginisialisasi instance baru dari`LinearGradientBrush`kelas berdasarkan persegi panjang, warna awal dan akhir, dan sudut orientasi. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [Blend](../../system.drawing.drawing2d/lineargradientbrush/blend/) { get; set; } | Mendapat atau menyetel aBlend yang menentukan posisi dan faktor yang menentukan falloff custom untuk gradien. |
| [GammaCorrection](../../system.drawing.drawing2d/lineargradientbrush/gammacorrection/) { get; set; } | Mendapat atau menetapkan nilai yang menunjukkan apakah koreksi gamma diaktifkan untuk iniLinearGradientBrush . |
| [InterpolationColors](../../system.drawing.drawing2d/lineargradientbrush/interpolationcolors/) { get; set; } | Mendapat atau menyetel aColorBlendyang mendefinisikan gradien linier multiwarna. |
| [LinearColors](../../system.drawing.drawing2d/lineargradientbrush/linearcolors/) { get; set; } | Mendapat atau menyetel warna awal dan akhir gradien. |
| [Rectangle](../../system.drawing.drawing2d/lineargradientbrush/rectangle/) { get; } | Mendapat bidang persegi panjang yang menentukan titik awal dan akhir gradien. |
| [Transform](../../system.drawing.drawing2d/lineargradientbrush/transform/) { get; set; } | Mendapat atau menyetel salinanMatrix yang mendefinisikan transform geometris lokal untuk iniLinearGradientBrush . |
| [WrapMode](../../system.drawing.drawing2d/lineargradientbrush/wrapmode/) { get; set; } | Mendapat atau menyetel aWrapMode pencacahan yang menunjukkan bungkus mode untuk iniLinearGradientBrush . |

## Metode

| Nama | Keterangan |
| --- | --- |
| override [Clone](../../system.drawing.drawing2d/lineargradientbrush/clone/)() | Membuat salinan persis dari iniLinearGradientBrush . |
| [Dispose](../../system.drawing/brush/dispose/)() | Merilis semua resource yang digunakan oleh objek Brush ini. |
| [MultiplyTransform](../../system.drawing.drawing2d/lineargradientbrush/multiplytransform/#multiplytransform)(Matrix) | MengalikanMatrix yang mewakili transformasi geometrik lokal iniLinearGradientBrush oleh yang ditentukanMatrix dengan menambahkan yang ditentukanMatrix . |
| [MultiplyTransform](../../system.drawing.drawing2d/lineargradientbrush/multiplytransform/#multiplytransform_1)(Matrix, MatrixOrder) | MengalikanMatrix yang mewakili transformasi geometrik lokal iniLinearGradientBrush oleh yang ditentukanMatrix dalam urutan yang ditentukan. |
| [ResetTransform](../../system.drawing.drawing2d/lineargradientbrush/resettransform/)() | MeresetTransform properti ke identitas. |
| [RotateTransform](../../system.drawing.drawing2d/lineargradientbrush/rotatetransform/#rotatetransform)(float) | Memutar transformasi geometrik lokal dengan jumlah yang ditentukan. Metode ini menambahkan rotasi ke transformasi. |
| [RotateTransform](../../system.drawing.drawing2d/lineargradientbrush/rotatetransform/#rotatetransform_1)(float, MatrixOrder) | Memutar transformasi geometris lokal dengan jumlah yang ditentukan dalam urutan yang ditentukan. |
| [ScaleTransform](../../system.drawing.drawing2d/lineargradientbrush/scaletransform/#scaletransform)(float, float) | Menskalakan transformasi geometris lokal dengan jumlah yang ditentukan. Metode ini menambahkan matriks skala ke transformasi. |
| [ScaleTransform](../../system.drawing.drawing2d/lineargradientbrush/scaletransform/#scaletransform_1)(float, float, MatrixOrder) | Menskalakan transformasi geometris lokal dengan jumlah yang ditentukan dalam urutan yang ditentukan. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/lineargradientbrush/setblendtriangularshape/#setblendtriangularshape)(float) | Membuat gradien linier dengan warna tengah dan penurunan linier ke satu warna di kedua ujungnya. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/lineargradientbrush/setblendtriangularshape/#setblendtriangularshape_1)(float, float) | Membuat gradien linier dengan warna tengah dan penurunan linier ke satu warna di kedua ujungnya. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/lineargradientbrush/setsigmabellshape/#setsigmabellshape)(float) | Membuat penurunan gradien berdasarkan kurva berbentuk lonceng. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/lineargradientbrush/setsigmabellshape/#setsigmabellshape_1)(float, float) | Membuat penurunan gradien berdasarkan kurva berbentuk lonceng. |
| [TranslateTransform](../../system.drawing.drawing2d/lineargradientbrush/translatetransform/#translatetransform)(float, float) | Menerjemahkan transformasi geometris lokal dengan dimensi yang ditentukan. Metode ini menambahkan terjemahan ke transformasi. |
| [TranslateTransform](../../system.drawing.drawing2d/lineargradientbrush/translatetransform/#translatetransform_1)(float, float, MatrixOrder) | Menerjemahkan transformasi geometrik lokal dengan dimensi yang ditentukan dalam urutan yang ditentukan. |

### Lihat juga

* class [Brush](../../system.drawing/brush/)
* ruang nama [System.Drawing.Drawing2D](../../system.drawing.drawing2d/)
* perakitan [Aspose.Drawing](../../)


