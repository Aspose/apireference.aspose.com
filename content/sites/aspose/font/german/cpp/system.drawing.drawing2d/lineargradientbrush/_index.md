---
title: "System::Drawing::Drawing2D::LinearGradientBrush class"
linktitle: "LinearGradientBrush"
second_title: "Aspose.Font für C++"
description: "System::Drawing::Drawing2D::LinearGradientBrush class. Stellt einen linearen Farbverlauf-Pinsel dar. Objekte dieser Klasse sollten ausschließlich mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 900
url: /de/cpp/system.drawing.drawing2d/lineargradientbrush/
---
## LinearGradientBrush class


Stellt einen linearen Farbverlauf-Pinsel dar. Objekte dieser Klasse sollten ausschließlich mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class LinearGradientBrush : public System::Drawing::Brush
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Clone](./clone/)() override | Erstellt eine Kopie des aktuellen Objekts. |
| [get_Blend](./get_blend/)() const | Gibt eine Mischung zurück, die Faktoren und Positionen der Grundfarben für diesen Pinsel angibt. |
| [get_GammaCorrection](./get_gammacorrection/)() const | Gibt einen Wert zurück, der anzeigt, dass die Gammakorrektur für diesen Pinsel aktiviert ist. |
| [get_InterpolationColors](./get_interpolationcolors/)() const | Gibt ein [ColorBlend](../colorblend/)-Objekt zurück, das einen mehrfarbigen linearen Farbverlauf definiert. |
| [get_LinearColors](./get_linearcolors/)() const | Gibt die Start- und Endfarben dieses Farbverlaufs zurück. |
| [get_Rectangle](./get_rectangle/)() | Gibt ein begrenzendes Rechteck zurück. |
| [get_Transform](./get_transform/)() const | Gibt eine Kopie eines [Matrix](../matrix/)-Objekts zurück, das die geometrischen Transformationen für den vom aktuellen Objekt dargestellten Pinsel spezifiziert. |
| [get_WrapMode](./get_wrapmode/)() const | Gibt den Wrap-Modus zurück. |
| [LinearGradientBrush](./lineargradientbrush/)(const PointF\&, const PointF\&, const Color\&, const Color\&) | RTTI-Informationen. |
| [LinearGradientBrush](./lineargradientbrush/)(const Point\&, const Point\&, const Color\&, const Color\&) | Konstruiert eine neue Instanz von [LinearGradientBrush](./). |
| [LinearGradientBrush](./lineargradientbrush/)(const RectangleF\&, const Color\&, const Color\&, LinearGradientMode) | Konstruiert eine neue Instanz von [LinearGradientBrush](./). |
| [LinearGradientBrush](./lineargradientbrush/)(const Rectangle\&, const Color\&, const Color\&, LinearGradientMode) | Konstruiert eine neue Instanz von [LinearGradientBrush](./). |
| [LinearGradientBrush](./lineargradientbrush/)(const RectangleF\&, const Color\&, const Color\&, float, bool) | Konstruiert eine neue Instanz von [LinearGradientBrush](./). |
| [LinearGradientBrush](./lineargradientbrush/)(const Rectangle\&, const Color\&, const Color\&, float, bool) | Konstruiert eine neue Instanz von [LinearGradientBrush](./). |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Matrix\>\&, MatrixOrder) | Multipliziert die Transformationsmatrix des aktuellen Objekts mit der angegebenen Matrix. |
| [ResetTransform](./resettransform/)() | Setzt die Transformationsmatrix des aktuellen Objekts zurück. |
| [RotateTransform](./rotatetransform/)(float, MatrixOrder) | Dreht die Transformationsmatrix des aktuellen Objekts. |
| [ScaleTransform](./scaletransform/)(float, float, MatrixOrder) | Skaliert die Transformationsmatrix des aktuellen Objekts. |
| [set_Blend](./set_blend/)(const SharedPtr\<Blend\>\&) | Legt eine Mischung fest, die Faktoren und Positionen der Grundfarben für diesen Pinsel angibt. |
| [set_GammaCorrection](./set_gammacorrection/)(bool) | Legt den Gamma-Korrekturstatus für diesen Pinsel fest. |
| [set_InterpolationColors](./set_interpolationcolors/)(const SharedPtr\<ColorBlend\>\&) | Legt ein [ColorBlend](../colorblend/)-Objekt fest, das einen mehrfarbigen linearen Verlauf definiert. |
| [set_LinearColors](./set_linearcolors/)(const ArrayPtr\<Color\>\&) | Legt die Start- und Endfarben dieses Verlaufs fest. |
| [set_Transform](./set_transform/)(const SharedPtr\<Matrix\>\&) | Legt ein [Matrix](../matrix/)-Objekt fest, das die geometrischen Transformationen für den vom aktuellen Objekt dargestellten Pinsel angibt. |
| [set_WrapMode](./set_wrapmode/)(WrapMode) | Legt den Wrap-Modus fest. |
| [SetBlendTriangularShape](./setblendtriangularshape/)(float, float) | NICHT IMPLEMENTIERT. |
| [SetSigmaBellShape](./setsigmabellshape/)(float, float) | NICHT IMPLEMENTIERT. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | Verschiebt die Transformationsmatrix des aktuellen Objekts. |
## Siehe auch

* Class [Brush](../../system.drawing/brush/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
