---
title: Class PathGradientBrush
second_title: Aspose.Drawing untuk Referensi .NET API
description: System.Drawing.Drawing2D.PathGradientBrush kelas. Merangkum aBrush benda yang mengisi interior aGraphicsPath objek dengan gradien. Kelas ini tidak dapat diwariskan.
type: docs
weight: 400
url: /id/net/system.drawing.drawing2d/pathgradientbrush/
---
## PathGradientBrush class

Merangkum aBrush benda yang mengisi interior aGraphicsPath objek dengan gradien. Kelas ini tidak dapat diwariskan.

```csharp
public sealed class PathGradientBrush : Brush
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [PathGradientBrush](pathgradientbrush/#constructor)(GraphicsPath) | Menginisialisasi instance baru dari`PathGradientBrush` kelas dengan jalur yang ditentukan. |
| [PathGradientBrush](pathgradientbrush/#constructor_1)(PointF[]) | Menginisialisasi instance baru dari`PathGradientBrush` kelas dengan poin yang ditentukan. |
| [PathGradientBrush](pathgradientbrush/#constructor_3)(Point[]) | Menginisialisasi instance baru dari`PathGradientBrush` kelas dengan poin yang ditentukan. |
| [PathGradientBrush](pathgradientbrush/#constructor_2)(PointF[], WrapMode) | Menginisialisasi instance baru dari`PathGradientBrush` kelas dengan poin yang ditentukan dan mode bungkus. |
| [PathGradientBrush](pathgradientbrush/#constructor_4)(Point[], WrapMode) | Menginisialisasi instance baru dari`PathGradientBrush` kelas dengan poin yang ditentukan dan mode bungkus. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [Blend](../../system.drawing.drawing2d/pathgradientbrush/blend/) { get; set; } | Mendapat atau menyetel aBlend yang menentukan posisi dan faktor yang menentukan penurunan kustom untuk gradien. |
| [CenterColor](../../system.drawing.drawing2d/pathgradientbrush/centercolor/) { get; set; } | Mendapat atau mengatur warna di tengah gradien jalur. |
| [CenterPoint](../../system.drawing.drawing2d/pathgradientbrush/centerpoint/) { get; set; } | Mendapat atau menetapkan titik tengah gradien jalur. |
| [FocusScales](../../system.drawing.drawing2d/pathgradientbrush/focusscales/) { get; set; } | Mendapat atau menyetel titik fokus untuk penurunan gradien. |
| [InterpolationColors](../../system.drawing.drawing2d/pathgradientbrush/interpolationcolors/) { get; set; } | Mendapat atau menyetel aColorBlendyang mendefinisikan gradien linier multiwarna. |
| [Rectangle](../../system.drawing.drawing2d/pathgradientbrush/rectangle/) { get; } | Mendapat persegi panjang pembatas untuk iniPathGradientBrush . |
| [SurroundColors](../../system.drawing.drawing2d/pathgradientbrush/surroundcolors/) { get; set; } | Mendapat atau menyetel larik warna yang sesuai dengan titik di jalur iniPathGradientBrush isi. |
| [Transform](../../system.drawing.drawing2d/pathgradientbrush/transform/) { get; set; } | Mendapat atau menyetel salinan dariMatrix yang mendefinisikan transform geometris lokal untuk iniPathGradientBrush . |
| [WrapMode](../../system.drawing.drawing2d/pathgradientbrush/wrapmode/) { get; set; } | Mendapat atau menyetel aWrapMode yang menunjukkan mode bungkus untuk iniPathGradientBrush . |

## Metode

| Nama | Keterangan |
| --- | --- |
| override [Clone](../../system.drawing.drawing2d/pathgradientbrush/clone/)() | Membuat salinan persis dari iniPathGradientBrush . |
| [Dispose](../../system.drawing/brush/dispose/)() | Merilis semua resource yang digunakan oleh objek Brush ini. |
| [MultiplyTransform](../../system.drawing.drawing2d/pathgradientbrush/multiplytransform/#multiplytransform)(Matrix) | Memperbarui matriks transformasi kuas dengan produk matriks transformasi kuas dikalikan dengan matriks lain. |
| [MultiplyTransform](../../system.drawing.drawing2d/pathgradientbrush/multiplytransform/#multiplytransform_1)(Matrix, MatrixOrder) | Memperbarui matriks transformasi kuas dengan produk matriks transformasi kuas dikalikan dengan matriks lain. |
| [ResetTransform](../../system.drawing.drawing2d/pathgradientbrush/resettransform/)() | MeresetTransform properti ke identitas. |
| [RotateTransform](../../system.drawing.drawing2d/pathgradientbrush/rotatetransform/#rotatetransform)(float) | Memutar transformasi geometrik lokal dengan jumlah yang ditentukan. Metode ini menambahkan rotasi ke transformasi. |
| [RotateTransform](../../system.drawing.drawing2d/pathgradientbrush/rotatetransform/#rotatetransform_1)(float, MatrixOrder) | Memutar transformasi geometris lokal dengan jumlah yang ditentukan dalam urutan yang ditentukan. |
| [ScaleTransform](../../system.drawing.drawing2d/pathgradientbrush/scaletransform/#scaletransform)(float, float) | Menskalakan transformasi geometris lokal dengan jumlah yang ditentukan. Metode ini menambahkan matriks skala ke transformasi. |
| [ScaleTransform](../../system.drawing.drawing2d/pathgradientbrush/scaletransform/#scaletransform_1)(float, float, MatrixOrder) | Menskalakan transformasi geometris lokal dengan jumlah yang ditentukan dalam urutan yang ditentukan. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/pathgradientbrush/setblendtriangularshape/#setblendtriangularshape)(float) | Membuat gradien dengan warna tengah dan falloff linier ke satu warna di sekitarnya. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/pathgradientbrush/setblendtriangularshape/#setblendtriangularshape_1)(float, float) | Membuat gradien dengan warna tengah dan falloff linier ke setiap warna di sekitarnya. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/pathgradientbrush/setsigmabellshape/#setsigmabellshape)(float) | Membuat kuas gradien yang mengubah warna mulai dari pusat jalur ke luar hingga batas jalur. Transisi dari satu warna ke warna lainnya didasarkan pada kurva berbentuk lonceng. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/pathgradientbrush/setsigmabellshape/#setsigmabellshape_1)(float, float) | Membuat kuas gradien yang mengubah warna mulai dari pusat jalur ke luar hingga batas jalur. Transisi dari satu warna ke warna lainnya didasarkan pada kurva berbentuk lonceng. |
| [TranslateTransform](../../system.drawing.drawing2d/pathgradientbrush/translatetransform/#translatetransform)(float, float) | Menerapkan terjemahan yang ditentukan ke transformasi geometrik lokal. Metode ini menambahkan terjemahan ke transformasi. |
| [TranslateTransform](../../system.drawing.drawing2d/pathgradientbrush/translatetransform/#translatetransform_1)(float, float, MatrixOrder) | Menerapkan terjemahan yang ditentukan ke transformasi geometris lokal dalam urutan yang ditentukan. |

### Lihat juga

* class [Brush](../../system.drawing/brush/)
* ruang nama [System.Drawing.Drawing2D](../../system.drawing.drawing2d/)
* perakitan [Aspose.Drawing](../../)


