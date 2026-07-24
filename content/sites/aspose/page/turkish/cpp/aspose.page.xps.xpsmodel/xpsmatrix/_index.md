---
title: "Aspose::Page::XPS::XpsModel::XpsMatrix sınıfı"
linktitle: "XpsMatrix"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::XpsModel::XpsMatrix sınıfı. MatrixTransform özelliği öğe özelliklerini kapsayan sınıf. Bu öğe, C++'ta öğelerin koordinat sistemlerini manipüle etmek için kullanılan rastgele bir afin matris dönüşümünü tanımlar."
type: docs
weight: 2600
url: /tr/cpp/aspose.page.xps.xpsmodel/xpsmatrix/
---
## XpsMatrix class


MatrixTransform özellik öğesi özelliklerini kapsayan sınıf. Bu öğe, öğelerin koordinat sistemlerini manipüle etmek için kullanılan rastgele bir affine matris dönüşümünü tanımlar.

```cpp
class XpsMatrix : public Aspose::Page::XPS::XpsModel::XpsObject
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Clone](./clone/)() | Bu dönüşüm matrisini kopyalar. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Belirtilen [System::Object](../../system/object/) öğesinin bu örnek ile eşit olup olmadığını belirler. |
| static [Equals](./equals/)(System::SharedPtr\<XpsMatrix\>, System::SharedPtr\<XpsMatrix\>) | Gerçek uygulama. |
| [get_IsIdentity](./get_isidentity/)() | Bu örneğin birim matris olup olmadığını gösteren bir değer alır. |
| [get_M11](./get_m11/)() | M11 öğesini alır. |
| [get_M12](./get_m12/)() | M12 öğesini alır. |
| [get_M21](./get_m21/)() | M21 öğesini alır. |
| [get_M22](./get_m22/)() | M22 öğesini alır. |
| [get_M31](./get_m31/)() | M31 öğesini alır. |
| [get_M32](./get_m32/)() | M32 öğesini alır. |
| [GetHashCode](./gethashcode/)() const override | Bu örnek için bir karma kod döndürür. |
| [Multiply](./multiply/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Drawing2D::MatrixOrder) | Bu matrisi, *matrix* tarafından belirtilen matrisle, *matrixOrder* tarafından belirtilen sırada çarpar. |
| [Multiply](./multiply/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Bu matrisi, *matrix* tarafından belirtilen matrisle varsayılan (Prepend) sırada çarpar. |
| [Multiply](./multiply/)(System::SharedPtr\<XpsMatrix\>, System::Drawing::Drawing2D::MatrixOrder) | Bu matrisi, *matrix* tarafından belirtilen matrisle, *matrixOrder* tarafından belirtilen sırada çarpar. |
| [Multiply](./multiply/)(System::SharedPtr\<XpsMatrix\>) | Bu matrisi, *matrix* tarafından belirtilen matrisle varsayılan (Prepend) sırada çarpar. |
| [Reset](./reset/)() | Bu Matrisi birim matrise sıfırlar. |
| [Rotate](./rotate/)(float, System::Drawing::Drawing2D::MatrixOrder) | *matrixOrder* tarafından belirtilen sırada bu Matrise *angle* kadar saat yönünde döndürme uygular. |
| [Rotate](./rotate/)(float) | Bu Matrise *angle* kadar saat yönünde döndürme uygular, varsayılan (Prepend) sırada. |
| [RotateAround](./rotatearound/)(float, System::Drawing::PointF, System::Drawing::Drawing2D::MatrixOrder) | *matrixOrder* tarafından belirtilen sırada bu Matrise *pivot* etrafında *angle* kadar saat yönünde döndürme uygular. |
| [RotateAround](./rotatearound/)(float, System::Drawing::PointF) | Bu Matrise *pivot* etrafında *angle* kadar saat yönünde döndürme uygular, varsayılan (Prepend) sırada. |
| [Scale](./scale/)(float, float, System::Drawing::Drawing2D::MatrixOrder) | *matrixOrder* tarafından belirtilen sırada bu Matrise belirtilen ölçek vektörünü (scaleX ve scaleY) uygular. |
| [Scale](./scale/)(float, float) | Bu Matrise belirtilen ölçek vektörünü (scaleX ve scaleY) varsayılan (Prepend) sırada uygular. |
| [Skew](./skew/)(double, double) | Bu Matrise belirtilen eğim dönüşümünü uygular. |
| [ToString](./tostring/)() const override | Bu [XpsMatrix](./) örneğinin dize temsilini döndürür. |
| [Transform](./transform/)(System::Drawing::RectangleF) | Bu Matrisin temsil ettiği afin dönüşümü belirtilen bir dikdörtgene uygular. |
| [TransformPoint](./transformpoint/)(System::Drawing::PointF) | Bu Matrisin temsil ettiği afin dönüşümü belirtilen bir noktaya uygular. |
| [TransformPoints](./transformpoints/)(System::ArrayPtr\<System::Drawing::PointF\>, int32_t, int32_t) | Bu Matrisin temsil ettiği afin dönüşümü belirtilen nokta dizisinin bir kısmına uygular. |
| [TransformPoints](./transformpoints/)(System::ArrayPtr\<System::Drawing::PointF\>) | Bu Matrisin temsil ettiği afin dönüşümü belirtilen nokta dizisine uygular. |
| [Translate](./translate/)(float, float, System::Drawing::Drawing2D::MatrixOrder) | *matrixOrder* tarafından belirtilen sırada bu Matrise belirtilen çeviri vektörünü uygular. |
| [Translate](./translate/)(float, float) | Bu Matrise belirtilen çeviri vektörünü uygular. |
## Ayrıca Bakınız

* Class [XpsObject](../xpsobject/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
