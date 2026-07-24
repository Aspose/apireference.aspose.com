---
title: "Aspose::Page::XPS::XpsModel::XpsMatrix Klasse"
linktitle: "XpsMatrix"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::XpsModel::XpsMatrix Klasse. Klasse, die Eigenschaften des MatrixTransform-Elementes kapselt. Dieses Element definiert eine beliebige affine Matrixtransformation, die verwendet wird, um die Koordinatensysteme von Elementen in C++ zu manipulieren."
type: docs
weight: 2600
url: /de/cpp/aspose.page.xps.xpsmodel/xpsmatrix/
---
## XpsMatrix class


Klasse, die MatrixTransform-Eigenschaftselementeigenschaften kapselt. Dieses Element definiert eine beliebige affine Matrixtransformation, die zur Manipulation der Koordinatensysteme von Elementen verwendet wird.

```cpp
class XpsMatrix : public Aspose::Page::XPS::XpsModel::XpsObject
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Clone](./clone/)() | Klont diese Transformationsmatrix. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Bestimmt, ob das angegebene [System::Object](../../system/object/) gleich dieser Instanz ist. |
| static [Equals](./equals/)(System::SharedPtr\<XpsMatrix\>, System::SharedPtr\<XpsMatrix\>) | Die tatsächliche Implementierung. |
| [get_IsIdentity](./get_isidentity/)() | Gibt einen Wert zurück, der angibt, ob diese Instanz die Einheitsmatrix ist. |
| [get_M11](./get_m11/)() | Gibt das M11-Element zurück. |
| [get_M12](./get_m12/)() | Gibt das M12-Element zurück. |
| [get_M21](./get_m21/)() | Gibt das M21-Element zurück. |
| [get_M22](./get_m22/)() | Gibt das M22-Element zurück. |
| [get_M31](./get_m31/)() | Gibt das M31-Element zurück. |
| [get_M32](./get_m32/)() | Gibt das M32-Element zurück. |
| [GetHashCode](./gethashcode/)() const override | Gibt einen Hashcode für diese Instanz zurück. |
| [Multiply](./multiply/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Drawing2D::MatrixOrder) | Multipliziert diese Matrix mit der durch *matrix* angegebenen Matrix in der durch *matrixOrder* festgelegten Reihenfolge. |
| [Multiply](./multiply/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Multipliziert diese Matrix mit der durch *matrix* angegebenen Matrix in der Standard (Prepend) Reihenfolge. |
| [Multiply](./multiply/)(System::SharedPtr\<XpsMatrix\>, System::Drawing::Drawing2D::MatrixOrder) | Multipliziert diese Matrix mit der durch *matrix* angegebenen Matrix in der durch *matrixOrder* festgelegten Reihenfolge. |
| [Multiply](./multiply/)(System::SharedPtr\<XpsMatrix\>) | Multipliziert diese Matrix mit der durch *matrix* angegebenen Matrix in der Standard (Prepend) Reihenfolge. |
| [Reset](./reset/)() | Setzt diese Matrix auf die Einheitsmatrix zurück. |
| [Rotate](./rotate/)(float, System::Drawing::Drawing2D::MatrixOrder) | Wendet eine Drehung im Uhrzeigersinn um *angle* auf diese Matrix in der durch *matrixOrder* angegebenen Reihenfolge an. |
| [Rotate](./rotate/)(float) | Wendet eine Drehung im Uhrzeigersinn um *angle* auf diese Matrix in der Standard (Prepend) Reihenfolge an. |
| [RotateAround](./rotatearound/)(float, System::Drawing::PointF, System::Drawing::Drawing2D::MatrixOrder) | Wendet eine Drehung im Uhrzeigersinn um *angle* um den *pivot* auf diese Matrix in der durch *matrixOrder* angegebenen Reihenfolge an. |
| [RotateAround](./rotatearound/)(float, System::Drawing::PointF) | Wendet eine Drehung im Uhrzeigersinn um *angle* um den *pivot* auf diese Matrix in der Standard (Prepend) Reihenfolge an. |
| [Scale](./scale/)(float, float, System::Drawing::Drawing2D::MatrixOrder) | Wendet den angegebenen Skalierungsvektor (scaleX und scaleY) auf diese Matrix in der durch *matrixOrder* angegebenen Reihenfolge an. |
| [Scale](./scale/)(float, float) | Wendet den angegebenen Skalierungsvektor (scaleX und scaleY) auf diese Matrix in der Standard (Prepend) Reihenfolge an. |
| [Skew](./skew/)(double, double) | Wendet die angegebene Schrägstellungstransformation auf diese Matrix an. |
| [ToString](./tostring/)() const override | Gibt die Zeichenkettenrepräsentation dieser [XpsMatrix](./)-Instanz zurück. |
| [Transform](./transform/)(System::Drawing::RectangleF) | Wendet die durch diese Matrix dargestellte affine Transformation auf ein angegebenes Rechteck an. |
| [TransformPoint](./transformpoint/)(System::Drawing::PointF) | Wendet die durch diese Matrix dargestellte affine Transformation auf einen angegebenen Punkt an. |
| [TransformPoints](./transformpoints/)(System::ArrayPtr\<System::Drawing::PointF\>, int32_t, int32_t) | Wendet die durch diese Matrix dargestellte affine Transformation auf einen angegebenen Teil eines Punktarrays an. |
| [TransformPoints](./transformpoints/)(System::ArrayPtr\<System::Drawing::PointF\>) | Wendet die durch diese Matrix dargestellte affine Transformation auf ein angegebenes Punktarray an. |
| [Translate](./translate/)(float, float, System::Drawing::Drawing2D::MatrixOrder) | Wendet den angegebenen Translationsvektor auf diese Matrix in der durch *matrixOrder* angegebenen Reihenfolge an. |
| [Translate](./translate/)(float, float) | Wendet den angegebenen Translationsvektor auf diese Matrix an. |
## Siehe auch

* Class [XpsObject](../xpsobject/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
