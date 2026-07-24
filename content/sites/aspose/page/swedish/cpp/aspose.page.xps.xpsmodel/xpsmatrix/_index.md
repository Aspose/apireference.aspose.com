---
title: "Aspose::Page::XPS::XpsModel::XpsMatrix klass"
linktitle: "XpsMatrix"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::XpsModel::XpsMatrix klass. Klass som kapslar in egenskaper för MatrixTransform‑elementet. Detta element definierar en godtycklig affinsk matristransformation som används för att manipulera koordinatsystemen för element i C++."
type: docs
weight: 2600
url: /sv/cpp/aspose.page.xps.xpsmodel/xpsmatrix/
---
## XpsMatrix class


Klass som kapslar in MatrixTransform-egenskapselementfunktioner. Detta element definierar en godtycklig affinsk matristransformering som används för att manipulera elementens koordinatsystem.

```cpp
class XpsMatrix : public Aspose::Page::XPS::XpsModel::XpsObject
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Clone](./clone/)() | Klonar denna transformationsmatris. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Bestämmer om det angivna [System::Object](../../system/object/) är lika med denna instans. |
| static [Equals](./equals/)(System::SharedPtr\<XpsMatrix\>, System::SharedPtr\<XpsMatrix\>) | Den faktiska implementationen. |
| [get_IsIdentity](./get_isidentity/)() | Hämtar ett värde som indikerar om denna instans är en identitetsmatris. |
| [get_M11](./get_m11/)() | Hämtar M11‑elementet. |
| [get_M12](./get_m12/)() | Hämtar M12‑elementet. |
| [get_M21](./get_m21/)() | Hämtar M21‑elementet. |
| [get_M22](./get_m22/)() | Hämtar M22‑elementet. |
| [get_M31](./get_m31/)() | Hämtar M31‑elementet. |
| [get_M32](./get_m32/)() | Hämtar M32‑elementet. |
| [GetHashCode](./gethashcode/)() const override | Returnerar en hash‑kod för denna instans. |
| [Multiply](./multiply/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Drawing2D::MatrixOrder) | Multiplicerar denna matris med matrisen som anges av *matrix* i den ordning som anges av *matrixOrder*. |
| [Multiply](./multiply/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Multiplicerar denna matris med matrisen som anges av *matrix* i standard (Prepend) ordning. |
| [Multiply](./multiply/)(System::SharedPtr\<XpsMatrix\>, System::Drawing::Drawing2D::MatrixOrder) | Multiplicerar denna matris med matrisen som anges av *matrix* i den ordning som anges av *matrixOrder*. |
| [Multiply](./multiply/)(System::SharedPtr\<XpsMatrix\>) | Multiplicerar denna matris med matrisen som anges av *matrix* i standard (Prepend) ordning. |
| [Reset](./reset/)() | Återställer denna matris till identitetsmatris. |
| [Rotate](./rotate/)(float, System::Drawing::Drawing2D::MatrixOrder) | Tillämpar medursrotation med *angle* på denna matris i den ordning som anges av *matrixOrder*. |
| [Rotate](./rotate/)(float) | Tillämpar medursrotation med *angle* på denna matris i standard (Prepend) ordning. |
| [RotateAround](./rotatearound/)(float, System::Drawing::PointF, System::Drawing::Drawing2D::MatrixOrder) | Tillämpar medursrotation med *angle* kring *pivot* på denna matris i den ordning som anges av *matrixOrder*. |
| [RotateAround](./rotatearound/)(float, System::Drawing::PointF) | Tillämpar medursrotation med *angle* kring *pivot* på denna matris i standard (Prepend) ordning. |
| [Scale](./scale/)(float, float, System::Drawing::Drawing2D::MatrixOrder) | Tillämpar den angivna skalningsvektorn (scaleX och scaleY) på denna matris i den ordning som anges av *matrixOrder*. |
| [Scale](./scale/)(float, float) | Tillämpar den angivna skalningsvektorn (scaleX och scaleY) på denna matris i standard (Prepend) ordning. |
| [Skew](./skew/)(double, double) | Tillämpar angiven skevningstransformation på denna matris. |
| [ToString](./tostring/)() const override | Returnerar strängrepresentationen av detta [XpsMatrix](./)-objekt. |
| [Transform](./transform/)(System::Drawing::RectangleF) | Tillämpar den affina transformationen som representeras av denna matris på en angiven rektangel. |
| [TransformPoint](./transformpoint/)(System::Drawing::PointF) | Tillämpar den affina transformationen som representeras av denna matris på en angiven punkt. |
| [TransformPoints](./transformpoints/)(System::ArrayPtr\<System::Drawing::PointF\>, int32_t, int32_t) | Tillämpar den affina transformationen som representeras av denna matris på en angiven del av en punktarray. |
| [TransformPoints](./transformpoints/)(System::ArrayPtr\<System::Drawing::PointF\>) | Tillämpar den affina transformationen som representeras av denna matris på en angiven punktarray. |
| [Translate](./translate/)(float, float, System::Drawing::Drawing2D::MatrixOrder) | Tillämpar den angivna transvektorn på denna matris i den ordning som anges av *matrixOrder*. |
| [Translate](./translate/)(float, float) | Tillämpar den angivna transvektorn på denna matris. |
## Se även

* Class [XpsObject](../xpsobject/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
