---
title: Class Matrix
second_title: Aspose.Drawing untuk Referensi .NET API
description: System.Drawing.Drawing2D.Matrix kelas. Merangkum matriks affine 3kali3 yang mewakili transformasi geometris. Kelas ini tidak dapat diwariskan.
type: docs
weight: 360
url: /id/net/system.drawing.drawing2d/matrix/
---
## Matrix class

Merangkum matriks affine 3-kali-3 yang mewakili transformasi geometris. Kelas ini tidak dapat diwariskan.

```csharp
public sealed class Matrix : IDisposable
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [Matrix](matrix/#constructor)() | Menginisialisasi instance baru dari kelas Matrix sebagai matriks identitas. |
| [Matrix](matrix/#constructor_2)(Rectangle, Point[]) | Menginisialisasi instance baru dari`Matrix` kelas ke transformasi geometris yang ditentukan oleh persegi panjang dan susunan titik yang ditentukan. |
| [Matrix](matrix/#constructor_3)(RectangleF, PointF[]) | Menginisialisasi instance baru dari`Matrix` kelas ke transformasi geometris yang ditentukan oleh persegi panjang dan susunan titik yang ditentukan. |
| [Matrix](matrix/#constructor_1)(float, float, float, float, float, float) | Menginisialisasi instance baru dari kelas Matrix dengan elemen yang ditentukan. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [Elements](../../system.drawing.drawing2d/matrix/elements/) { get; } | Mendapat larik nilai titik-mengambang yang mewakili elemen Matriks ini. |
| [IsIdentity](../../system.drawing.drawing2d/matrix/isidentity/) { get; } | Mendapat nilai yang menunjukkan apakah Matriks ini adalah matriks identitas. |
| [IsInvertible](../../system.drawing.drawing2d/matrix/isinvertible/) { get; } | Mendapat nilai yang menunjukkan apakah Matriks ini dapat dibalik. |
| [OffsetX](../../system.drawing.drawing2d/matrix/offsetx/) { get; } | Mendapat nilai terjemahan x (nilai dx, atau elemen pada baris ketiga dan kolom pertama) dari Matriks ini. |
| [OffsetY](../../system.drawing.drawing2d/matrix/offsety/) { get; } | Mendapat nilai terjemahan y (`dy` nilai, atau elemen pada baris ketiga dan kolom kedua) Matriks ini. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [Clone](../../system.drawing.drawing2d/matrix/clone/)() | Membuat salinan persis dari Matriks ini. |
| [Dispose](../../system.drawing.drawing2d/matrix/dispose/)() | Merilis semua resource yang digunakan oleh Matrix ini. |
| [Invert](../../system.drawing.drawing2d/matrix/invert/)() | Membalikkan Matriks ini, jika dapat dibalik. |
| [Multiply](../../system.drawing.drawing2d/matrix/multiply/#multiply)(Matrix) | Kalikan iniMatrix dengan matriks yang ditentukan dalam*matrix* parameter, dengan menambahkan yang ditentukanMatrix . |
| [Multiply](../../system.drawing.drawing2d/matrix/multiply/#multiply_1)(Matrix, MatrixOrder) | Kalikan iniMatrix dengan matriks yang ditentukan dalam*matrix* parameter, dan dalam urutan yang ditentukan dalam*order* parameter. |
| [Reset](../../system.drawing.drawing2d/matrix/reset/)() | Mereset iniMatrix untuk memiliki elemen matriks identitas. |
| [Rotate](../../system.drawing.drawing2d/matrix/rotate/#rotate)(float) | Tambahkan ke iniMatrix rotasi searah jarum jam, di sekitar titik asal dan dengan sudut yang ditentukan. |
| [Rotate](../../system.drawing.drawing2d/matrix/rotate/#rotate_1)(float, MatrixOrder) | Menerapkan rotasi searah jarum jam dari jumlah yang ditentukan dalam parameter sudut, di sekitar titik asal (koordinat nol x dan y) untuk iniMatrix . |
| [RotateAt](../../system.drawing.drawing2d/matrix/rotateat/#rotateat)(float, PointF) | Menerapkan rotasi searah jarum jam ke Matriks ini di sekitar titik yang ditentukan dalam parameter titik, dan dengan mengawali rotasi. |
| [RotateAt](../../system.drawing.drawing2d/matrix/rotateat/#rotateat_1)(float, PointF, MatrixOrder) | Menerapkan rotasi searah jarum jam di sekitar titik yang ditentukan ke Matriks ini dalam urutan yang ditentukan. |
| [Scale](../../system.drawing.drawing2d/matrix/scale/#scale)(float, float) | Menerapkan vektor skala yang ditentukan ke Matriks ini dengan menambahkan vektor skala. |
| [Scale](../../system.drawing.drawing2d/matrix/scale/#scale_1)(float, float, MatrixOrder) | Menerapkan vektor skala yang ditentukan (scaleX dan scaleY) ke Matriks ini menggunakan urutan yang ditentukan. |
| [Shear](../../system.drawing.drawing2d/matrix/shear/#shear)(float, float) | Menerapkan vektor geser yang ditentukan ke Matriks ini dengan menambahkan transformasi geser. |
| [Shear](../../system.drawing.drawing2d/matrix/shear/#shear_1)(float, float, MatrixOrder) | Menerapkan vektor geser yang ditentukan ke Matriks ini dalam urutan yang ditentukan. |
| [TransformPoints](../../system.drawing.drawing2d/matrix/transformpoints/#transformpoints)(PointF[]) | Menerapkan transformasi geometris yang diwakili oleh iniMatrix ke array poin tertentu. |
| [TransformPoints](../../system.drawing.drawing2d/matrix/transformpoints/#transformpoints_1)(Point[]) | Menerapkan transformasi geometris yang diwakili oleh iniMatrix ke array poin tertentu. |
| [TransformVectors](../../system.drawing.drawing2d/matrix/transformvectors/)(PointF[]) | Mengalikan setiap vektor dalam larik dengan matriks. Elemen terjemahan dari matriks ini (baris ketiga) diabaikan. |
| [Translate](../../system.drawing.drawing2d/matrix/translate/#translate)(float, float) | Menerapkan vektor terjemahan yang ditentukan (offsetX dan offsetY) ke Matriks ini dengan menambahkan vektor terjemahan. |
| [Translate](../../system.drawing.drawing2d/matrix/translate/#translate_1)(float, float, MatrixOrder) | Menerapkan vektor terjemahan yang ditentukan ke Matriks ini dalam urutan yang ditentukan. |

### Lihat juga

* ruang nama [System.Drawing.Drawing2D](../../system.drawing.drawing2d/)
* perakitan [Aspose.Drawing](../../)


