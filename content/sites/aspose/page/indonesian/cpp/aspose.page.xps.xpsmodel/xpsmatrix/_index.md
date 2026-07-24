---
title: "Kelas Aspose::Page::XPS::XpsModel::XpsMatrix"
linktitle: "XpsMatrix"
second_title: "Aspose.Page untuk C++"
description: "Kelas Aspose::Page::XPS::XpsModel::XpsMatrix. Kelas yang mengenkapsulasi fitur elemen properti MatrixTransform. Elemen ini mendefinisikan transformasi matriks afine arbitrer yang digunakan untuk memanipulasi sistem koordinat elemen dalam C++."
type: docs
weight: 2600
url: /id/cpp/aspose.page.xps.xpsmodel/xpsmatrix/
---
## XpsMatrix class


Kelas yang mengenkapsulasi fitur elemen properti MatrixTransform. Elemen ini mendefinisikan transformasi matriks afine sewenang-wenang yang digunakan untuk memanipulasi sistem koordinat elemen.

```cpp
class XpsMatrix : public Aspose::Page::XPS::XpsModel::XpsObject
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Clone](./clone/)() | Mengkloning matriks transformasi ini. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Menentukan apakah [System::Object](../../system/object/) yang ditentukan sama dengan instance ini. |
| static [Equals](./equals/)(System::SharedPtr\<XpsMatrix\>, System::SharedPtr\<XpsMatrix\>) | Implementasi sebenarnya. |
| [get_IsIdentity](./get_isidentity/)() | Mendapatkan nilai yang menunjukkan apakah instance ini adalah matriks identitas. |
| [get_M11](./get_m11/)() | Mendapatkan elemen M11. |
| [get_M12](./get_m12/)() | Mendapatkan elemen M12. |
| [get_M21](./get_m21/)() | Mendapatkan elemen M21. |
| [get_M22](./get_m22/)() | Mendapatkan elemen M22. |
| [get_M31](./get_m31/)() | Mendapatkan elemen M31. |
| [get_M32](./get_m32/)() | Mendapatkan elemen M32. |
| [GetHashCode](./gethashcode/)() const override | Mengembalikan kode hash untuk instance ini. |
| [Multiply](./multiply/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Drawing2D::MatrixOrder) | Mengalikan matriks ini dengan matriks yang ditentukan oleh *matrix* dalam urutan yang ditentukan oleh *matrixOrder*. |
| [Multiply](./multiply/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Mengalikan matriks ini dengan matriks yang ditentukan oleh *matrix* dalam urutan default (Prepend). |
| [Multiply](./multiply/)(System::SharedPtr\<XpsMatrix\>, System::Drawing::Drawing2D::MatrixOrder) | Mengalikan matriks ini dengan matriks yang ditentukan oleh *matrix* dalam urutan yang ditentukan oleh *matrixOrder*. |
| [Multiply](./multiply/)(System::SharedPtr\<XpsMatrix\>) | Mengalikan matriks ini dengan matriks yang ditentukan oleh *matrix* dalam urutan default (Prepend). |
| [Reset](./reset/)() | Mengatur ulang Matrix ini ke matriks identitas. |
| [Rotate](./rotate/)(float, System::Drawing::Drawing2D::MatrixOrder) | Menerapkan rotasi searah jarum jam sebesar *angle* ke Matrix ini dalam urutan yang ditentukan oleh *matrixOrder*. |
| [Rotate](./rotate/)(float) | Menerapkan rotasi searah jarum jam sebesar *angle* ke Matrix ini dalam urutan default (Prepend). |
| [RotateAround](./rotatearound/)(float, System::Drawing::PointF, System::Drawing::Drawing2D::MatrixOrder) | Menerapkan rotasi searah jarum jam sebesar *angle* sekitar *pivot* ke Matrix ini dalam urutan yang ditentukan oleh *matrixOrder*. |
| [RotateAround](./rotatearound/)(float, System::Drawing::PointF) | Menerapkan rotasi searah jarum jam sebesar *angle* sekitar *pivot* ke Matrix ini dalam urutan default (Prepend). |
| [Scale](./scale/)(float, float, System::Drawing::Drawing2D::MatrixOrder) | Menerapkan vektor skala yang ditentukan (scaleX dan scaleY) ke Matrix ini dalam urutan yang ditentukan oleh *matrixOrder*. |
| [Scale](./scale/)(float, float) | Menerapkan vektor skala yang ditentukan (scaleX dan scaleY) ke Matrix ini dalam urutan default (Prepend). |
| [Skew](./skew/)(double, double) | Menerapkan transformasi skew yang ditentukan ke Matrix ini. |
| [ToString](./tostring/)() const override | Mengembalikan representasi string dari instance [XpsMatrix](./) ini. |
| [Transform](./transform/)(System::Drawing::RectangleF) | Menerapkan transformasi afine yang diwakili oleh Matrix ini ke persegi panjang yang ditentukan. |
| [TransformPoint](./transformpoint/)(System::Drawing::PointF) | Menerapkan transformasi afine yang diwakili oleh Matrix ini ke titik yang ditentukan. |
| [TransformPoints](./transformpoints/)(System::ArrayPtr\<System::Drawing::PointF\>, int32_t, int32_t) | Menerapkan transformasi afine yang diwakili oleh Matrix ini ke bagian tertentu dari array titik. |
| [TransformPoints](./transformpoints/)(System::ArrayPtr\<System::Drawing::PointF\>) | Menerapkan transformasi afine yang diwakili oleh Matrix ini ke array titik yang ditentukan. |
| [Translate](./translate/)(float, float, System::Drawing::Drawing2D::MatrixOrder) | Menerapkan vektor translasi yang ditentukan ke Matrix ini dalam urutan yang ditentukan oleh *matrixOrder*. |
| [Translate](./translate/)(float, float) | Menerapkan vektor translasi yang ditentukan ke Matrix ini. |
## Lihat Juga

* Class [XpsObject](../xpsobject/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
