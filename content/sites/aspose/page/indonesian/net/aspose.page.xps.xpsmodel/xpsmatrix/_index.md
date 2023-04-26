---
title: Class XpsMatrix
second_title: Aspose.Page untuk Referensi .NET API
description: Aspose.Page.XPS.XpsModel.XpsMatrix kelas. Kelas yang merangkum fitur elemen properti MatrixTransform. Elemen ini mendefinisikan transformasi matriks afin arbitrer yang digunakan untuk memanipulasi sistem koordinat elemen.
type: docs
weight: 3220
url: /id/net/aspose.page.xps.xpsmodel/xpsmatrix/
---
## XpsMatrix class

Kelas yang merangkum fitur elemen properti MatrixTransform. Elemen ini mendefinisikan transformasi matriks afin arbitrer yang digunakan untuk memanipulasi sistem koordinat elemen.

```csharp
public sealed class XpsMatrix : XpsObject
```

## Properti

| Nama | Keterangan |
| --- | --- |
| [IsIdentity](../../aspose.page.xps.xpsmodel/xpsmatrix/isidentity/) { get; } | Mendapat nilai yang menunjukkan apakah instance ini matriks identitas. |
| [M11](../../aspose.page.xps.xpsmodel/xpsmatrix/m11/) { get; } | Mendapat elemen M11. |
| [M12](../../aspose.page.xps.xpsmodel/xpsmatrix/m12/) { get; } | Mendapat elemen M12. |
| [M21](../../aspose.page.xps.xpsmodel/xpsmatrix/m21/) { get; } | Mendapat elemen M21. |
| [M22](../../aspose.page.xps.xpsmodel/xpsmatrix/m22/) { get; } | Mendapat elemen M22. |
| [M31](../../aspose.page.xps.xpsmodel/xpsmatrix/m31/) { get; } | Mendapat elemen M31. |
| [M32](../../aspose.page.xps.xpsmodel/xpsmatrix/m32/) { get; } | Mendapat elemen M32. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [Clone](../../aspose.page.xps.xpsmodel/xpsmatrix/clone/)() | Mengkloning matriks transformasi ini. |
| override [Equals](../../aspose.page.xps.xpsmodel/xpsmatrix/equals/)(object) | Menentukan apakah yang ditentukanObject sama dengan instance ini. |
| override [GetHashCode](../../aspose.page.xps.xpsmodel/xpsmatrix/gethashcode/)() | Mengembalikan kode hash untuk instance ini. |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply/#multiply_2)(Matrix) | Mengalikan matriks ini dengan matriks yang ditentukan oleh*matrix* dalam urutan default (Awali). |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply/#multiply)(XpsMatrix) | Mengalikan matriks ini dengan matriks yang ditentukan oleh*matrix* dalam urutan default (Awali). |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply/#multiply_3)(Matrix, MatrixOrder) | Mengalikan matriks ini dengan matriks yang ditentukan oleh*matrix* dalam urutan yang ditentukan oleh*matrixOrder* . |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply/#multiply_1)(XpsMatrix, MatrixOrder) | Mengalikan matriks ini dengan matriks yang ditentukan oleh*matrix* dalam urutan yang ditentukan oleh*matrixOrder* . |
| [Reset](../../aspose.page.xps.xpsmodel/xpsmatrix/reset/)() | Mereset Matriks ini ke matriks identitas. |
| [Rotate](../../aspose.page.xps.xpsmodel/xpsmatrix/rotate/#rotate)(float) | Berlaku rotasi searah jarum jam oleh*angle* ke Matriks ini dalam urutan default (Awali). |
| [Rotate](../../aspose.page.xps.xpsmodel/xpsmatrix/rotate/#rotate_1)(float, MatrixOrder) | Berlaku rotasi searah jarum jam oleh*angle* ke Matrix ini di order ditentukan oleh*matrixOrder* . |
| [RotateAround](../../aspose.page.xps.xpsmodel/xpsmatrix/rotatearound/#rotatearound)(float, PointF) | Berlaku rotasi searah jarum jam oleh*angle* sekitar*pivot* ke Matriks ini dalam urutan default (Awali). |
| [RotateAround](../../aspose.page.xps.xpsmodel/xpsmatrix/rotatearound/#rotatearound_1)(float, PointF, MatrixOrder) | Berlaku rotasi searah jarum jam oleh*angle* sekitar*pivot* ke Matriks ini dalam urutan yang ditentukan oleh*matrixOrder* . |
| [Scale](../../aspose.page.xps.xpsmodel/xpsmatrix/scale/#scale)(float, float) | Menerapkan vektor skala yang ditentukan (scaleX dan scaleY) ke Matrix ini dalam urutan default (Awalan). |
| [Scale](../../aspose.page.xps.xpsmodel/xpsmatrix/scale/#scale_1)(float, float, MatrixOrder) | Menerapkan vektor skala yang ditentukan (scaleX dan scaleY) ke Matriks ini dalam urutan yang ditentukan oleh*matrixOrder* . |
| [Skew](../../aspose.page.xps.xpsmodel/xpsmatrix/skew/)(double, double) | Menerapkan transformasi miring yang ditentukan ke Matriks ini. |
| override [ToString](../../aspose.page.xps.xpsmodel/xpsmatrix/tostring/)() | Mengembalikan representasi string ini`XpsMatrix` contoh. |
| [Transform](../../aspose.page.xps.xpsmodel/xpsmatrix/transform/)(RectangleF) | Menerapkan transformasi affine yang diwakili oleh Matrix ini ke persegi panjang tertentu. |
| [TransformPoint](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoint/)(PointF) | Menerapkan transformasi afin yang diwakili oleh Matriks ini ke titik tertentu. |
| [TransformPoints](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoints/#transformpoints)(PointF[]) | Menerapkan transformasi afin yang diwakili oleh Matriks ini ke array titik tertentu. |
| [TransformPoints](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoints/#transformpoints_1)(PointF[], int, int) | Menerapkan transformasi afin yang diwakili oleh Matriks ini ke bagian tertentu dari susunan titik. |
| [Translate](../../aspose.page.xps.xpsmodel/xpsmatrix/translate/#translate)(float, float) | Menerapkan vektor terjemahan yang ditentukan ke Matriks ini. |
| [Translate](../../aspose.page.xps.xpsmodel/xpsmatrix/translate/#translate_1)(float, float, MatrixOrder) | Menerapkan vektor terjemahan yang ditentukan ke Matriks ini dalam urutan yang ditentukan oleh*matrixOrder* . |
| static [Equals](../../aspose.page.xps.xpsmodel/xpsmatrix/equals/)(XpsMatrix, XpsMatrix) | Implementasi sebenarnya. |
| [operator ==](../../aspose.page.xps.xpsmodel/xpsmatrix/op_equality/) | Menerapkan operator ==. |
| [operator !=](../../aspose.page.xps.xpsmodel/xpsmatrix/op_inequality/) | Menerapkan operator !=. |

### Lihat juga

* class [XpsObject](../xpsobject/)
* ruang nama [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* perakitan [Aspose.Page](../../)


