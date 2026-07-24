---
title: "Aspose::Page::XPS::XpsModel::XpsMatrix klasse"
linktitle: "XpsMatrix"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::XPS::XpsModel::XpsMatrix klasse. Klasse die de eigenschappen van het MatrixTransform‑element omvat. Dit element definieert een willekeurige affiene matrixtransformatie die wordt gebruikt om de coördinatensystemen van elementen in C++ te manipuleren."
type: docs
weight: 2600
url: /nl/cpp/aspose.page.xps.xpsmodel/xpsmatrix/
---
## XpsMatrix class


Klasse die MatrixTransform-eigenschapselementeigenschappen incapsuleert. Dit element definieert een willekeurige affiene matrixtransformatie die wordt gebruikt om de coördinatensystemen van elementen te manipuleren.

```cpp
class XpsMatrix : public Aspose::Page::XPS::XpsModel::XpsObject
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Clone](./clone/)() | Kloont deze transformatie‑matrix. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Bepaalt of het opgegeven [System::Object](../../system/object/) gelijk is aan deze instantie. |
| static [Equals](./equals/)(System::SharedPtr\<XpsMatrix\>, System::SharedPtr\<XpsMatrix\>) | De daadwerkelijke implementatie. |
| [get_IsIdentity](./get_isidentity/)() | Haalt een waarde op die aangeeft of deze instantie een identiteitsmatrix is. |
| [get_M11](./get_m11/)() | Haalt het M11‑element op. |
| [get_M12](./get_m12/)() | Haalt het M12‑element op. |
| [get_M21](./get_m21/)() | Haalt het M21‑element op. |
| [get_M22](./get_m22/)() | Haalt het M22‑element op. |
| [get_M31](./get_m31/)() | Haalt het M31-element op. |
| [get_M32](./get_m32/)() | Haalt het M32-element op. |
| [GetHashCode](./gethashcode/)() const override | Retourneert een hashcode voor deze instantie. |
| [Multiply](./multiply/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Drawing2D::MatrixOrder) | Vermenigvuldigt deze matrix met de matrix gespecificeerd door de *matrix* in de volgorde gespecificeerd door *matrixOrder*. |
| [Multiply](./multiply/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Vermenigvuldigt deze matrix met de matrix gespecificeerd door de *matrix* in de standaard (Prepend) volgorde. |
| [Multiply](./multiply/)(System::SharedPtr\<XpsMatrix\>, System::Drawing::Drawing2D::MatrixOrder) | Vermenigvuldigt deze matrix met de matrix gespecificeerd door de *matrix* in de volgorde gespecificeerd door *matrixOrder*. |
| [Multiply](./multiply/)(System::SharedPtr\<XpsMatrix\>) | Vermenigvuldigt deze matrix met de matrix gespecificeerd door de *matrix* in de standaard (Prepend) volgorde. |
| [Reset](./reset/)() | Reset deze Matrix naar de identiteitsmatrix. |
| [Rotate](./rotate/)(float, System::Drawing::Drawing2D::MatrixOrder) | Past een klokwijzerige rotatie van *angle* toe op deze Matrix in de volgorde gespecificeerd door *matrixOrder*. |
| [Rotate](./rotate/)(float) | Past een klokwijzerige rotatie van *angle* toe op deze Matrix in de standaard (Prepend) volgorde. |
| [RotateAround](./rotatearound/)(float, System::Drawing::PointF, System::Drawing::Drawing2D::MatrixOrder) | Past een klokwijzerige rotatie van *angle* rond de *pivot* toe op deze Matrix in de volgorde gespecificeerd door *matrixOrder*. |
| [RotateAround](./rotatearound/)(float, System::Drawing::PointF) | Past een klokwijzerige rotatie van *angle* rond de *pivot* toe op deze Matrix in de standaard (Prepend) volgorde. |
| [Scale](./scale/)(float, float, System::Drawing::Drawing2D::MatrixOrder) | Past de opgegeven schaalvector (scaleX en scaleY) toe op deze Matrix in de volgorde gespecificeerd door *matrixOrder*. |
| [Scale](./scale/)(float, float) | Past de opgegeven schaalvector (scaleX en scaleY) toe op deze Matrix in de standaard (Prepend) volgorde. |
| [Skew](./skew/)(double, double) | Past de opgegeven scheeftransformatie toe op deze Matrix. |
| [ToString](./tostring/)() const override | Retourneert de tekenreeksrepresentatie van deze [XpsMatrix](./) instantie. |
| [Transform](./transform/)(System::Drawing::RectangleF) | Past de affine transformatie die door deze Matrix wordt gerepresenteerd toe op een opgegeven rechthoek. |
| [TransformPoint](./transformpoint/)(System::Drawing::PointF) | Past de affine transformatie die door deze Matrix wordt gerepresenteerd toe op een opgegeven punt. |
| [TransformPoints](./transformpoints/)(System::ArrayPtr\<System::Drawing::PointF\>, int32_t, int32_t) | Past de affine transformatie die door deze Matrix wordt gerepresenteerd toe op een opgegeven deel van een array van punten. |
| [TransformPoints](./transformpoints/)(System::ArrayPtr\<System::Drawing::PointF\>) | Past de affine transformatie die door deze Matrix wordt gerepresenteerd toe op een opgegeven array van punten. |
| [Translate](./translate/)(float, float, System::Drawing::Drawing2D::MatrixOrder) | Past de opgegeven translatievector toe op deze Matrix in de volgorde gespecificeerd door *matrixOrder*. |
| [Translate](./translate/)(float, float) | Past de opgegeven translatievector toe op deze Matrix. |
## Zie ook

* Class [XpsObject](../xpsobject/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
