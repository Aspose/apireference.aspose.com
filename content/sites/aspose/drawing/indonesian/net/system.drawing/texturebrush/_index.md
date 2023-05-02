---
title: Class TextureBrush
second_title: Aspose.Drawing untuk Referensi .NET API
description: System.Drawing.TextureBrush kelas. Setiap properti kelas TextureBrush adalah objek Brush yang menggunakan gambar untuk mengisi bagian dalam bentuk. Kelas ini tidak dapat diwariskan.
type: docs
weight: 1260
url: /id/net/system.drawing/texturebrush/
---
## TextureBrush class

Setiap properti kelas TextureBrush adalah objek Brush yang menggunakan gambar untuk mengisi bagian dalam bentuk. Kelas ini tidak dapat diwariskan.

```csharp
public sealed class TextureBrush : Brush
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [TextureBrush](texturebrush/#constructor)(Image) | Menginisialisasi instance baru dari`TextureBrush` kelas yang menggunakan image. yang ditentukan |
| [TextureBrush](texturebrush/#constructor_3)(Image, RectangleF) | Menginisialisasi instance baru dari`TextureBrush` kelas yang menggunakan gambar yang ditentukan, dan persegi panjang pembatas. |
| [TextureBrush](texturebrush/#constructor_1)(Image, WrapMode) | Menginisialisasi instance baru dari`TextureBrush` kelas yang menggunakan gambar yang ditentukan dan mode bungkus. |
| [TextureBrush](texturebrush/#constructor_4)(Image, RectangleF, ImageAttributes) | Menginisialisasi instance baru dari`TextureBrush` kelas yang menggunakan gambar tertentu, persegi panjang pembatas, dan atribut gambar. |
| [TextureBrush](texturebrush/#constructor_2)(Image, WrapMode, RectangleF) | Menginisialisasi instance baru dari`TextureBrush` kelas yang menggunakan gambar yang ditentukan, mode bungkus, dan persegi panjang pembatas. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [Image](../../system.drawing/texturebrush/image/) { get; } | Mendapatkan objek Image yang diasosiasikan dengan objek TextureBrush ini. |
| [Transform](../../system.drawing/texturebrush/transform/) { get; set; } | Mendapatkan atau menyetel salinan objek Matrix yang mendefinisikan transformasi geometris lokal untuk image yang terkait dengan objek TextureBrush ini. |
| [WrapMode](../../system.drawing/texturebrush/wrapmode/) { get; set; } | Mendapat atau menyetel enumerasi WrapMode yang menunjukkan mode bungkus untuk objek TextureBrush ini. |

## Metode

| Nama | Keterangan |
| --- | --- |
| override [Clone](../../system.drawing/texturebrush/clone/)() | Membuat salinan persis dari iniTextureBrush objek. |
| [Dispose](../../system.drawing/brush/dispose/)() | Merilis semua resource yang digunakan oleh objek Brush ini. |
| [MultiplyTransform](../../system.drawing/texturebrush/multiplytransform/#multiplytransform)(Matrix) | MengalikanMatrix objek yang mewakili transformasi geometris lokal iniTextureBrush objek dengan yang ditentukanMatrix objek dengan menambahkan yang ditentukanMatrix objek. |
| [MultiplyTransform](../../system.drawing/texturebrush/multiplytransform/#multiplytransform_1)(Matrix, MatrixOrder) | MengalikanMatrix objek yang mewakili transformasi geometris lokal iniTextureBrush objek dengan yang ditentukanMatrix objek dalam urutan yang ditentukan. |
| [ResetTransform](../../system.drawing/texturebrush/resettransform/)() | Mereset properti Transform iniTextureBrush menolak identitas. |
| [RotateTransform](../../system.drawing/texturebrush/rotatetransform/#rotatetransform)(float) | Memutar transformasi geometris lokal iniTextureBrush objek dengan jumlah yang ditentukan. Metode ini menambahkan rotasi ke transformasi. |
| [RotateTransform](../../system.drawing/texturebrush/rotatetransform/#rotatetransform_1)(float, MatrixOrder) | Memutar transformasi geometris lokal iniTextureBrush objek dengan jumlah yang ditentukan dalam urutan yang ditentukan. |
| [ScaleTransform](../../system.drawing/texturebrush/scaletransform/#scaletransform)(float, float) | Menskalakan transformasi geometrik lokal iniTextureBrush objek dengan jumlah yang ditentukan. Metode ini menambahkan matriks penskalaan ke transformasi. |
| [ScaleTransform](../../system.drawing/texturebrush/scaletransform/#scaletransform_1)(float, float, MatrixOrder) | Menskalakan transformasi geometrik lokal iniTextureBrush object dengan jumlah yang ditentukan dalam urutan yang ditentukan. |
| [TranslateTransform](../../system.drawing/texturebrush/translatetransform/#translatetransform)(float, float) | Menerjemahkan transformasi geometrik lokal iniTextureBrushobjek dengan dimensi yang ditentukan. Metode ini menambahkan terjemahan ke transformasi. |
| [TranslateTransform](../../system.drawing/texturebrush/translatetransform/#translatetransform_1)(float, float, MatrixOrder) | Menerjemahkan transformasi geometrik lokal iniTextureBrush objek dengan dimensi yang ditentukan dalam urutan yang ditentukan. |

### Lihat juga

* class [Brush](../brush/)
* ruang nama [System.Drawing](../../system.drawing/)
* perakitan [Aspose.Drawing](../../)


