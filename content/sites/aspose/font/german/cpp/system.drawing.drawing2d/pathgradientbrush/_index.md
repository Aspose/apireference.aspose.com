---
title: "System::Drawing::Drawing2D::PathGradientBrush Klasse"
linktitle: "PathGradientBrush"
second_title: "Aspose.Font für C++"
description: "System::Drawing::Drawing2D::PathGradientBrush Klasse. Stellt einen Pinsel dar, der das Innere eines GraphicsPath-Objekts mit einem Farbverlauf füllt. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1200
url: /de/cpp/system.drawing.drawing2d/pathgradientbrush/
---
## PathGradientBrush class


Stellt einen Pinsel dar, der das Innere eines [GraphicsPath](../graphicspath/) Objekts mit einem Farbverlauf füllt. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class PathGradientBrush : public System::Drawing::Brush
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Clone](./clone/)() override | Erstellt eine Kopie des aktuellen Objekts. |
| [get_Blend](./get_blend/)() const | NICHT IMPLEMENTIERT. |
| [get_CenterColor](./get_centercolor/)() const | Gibt eine Farbe zurück, die sich im Zentrum des von dem aktuellen Objekt gefüllten Pfads befindet. |
| [get_CenterPoint](./get_centerpoint/)() const | Liefert den Mittelpunkt des Farbverlaufs. |
| [get_FocusScales](./get_focusscales/)() const | Liefert den Fokuspunkt für das Abfallen des Farbverlaufs. |
| [get_InterpolationColors](./get_interpolationcolors/)() const | Gibt einen Wert zurück, der einen mehrfarbigen linearen Farbverlauf definiert. |
| [get_Rectangle](./get_rectangle/)() | NICHT IMPLEMENTIERT. |
| [get_SurroundColors](./get_surroundcolors/)() const | Gibt Farben zurück, die den Punkten im Pfad entsprechen, den dieser [PathGradientBrush](./) füllt. |
| [get_Transform](./get_transform/)() const | Gibt eine Kopie eines [Matrix](../matrix/)-Objekts zurück, das die geometrischen Transformationen für den vom aktuellen Objekt dargestellten Pinsel spezifiziert. |
| [get_WrapMode](./get_wrapmode/)() const | Gibt den Wrap-Modus zurück. |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Matrix\>\&, MatrixOrder) | Multipliziert die Transformationsmatrix des aktuellen Objekts mit der angegebenen Matrix. |
| [PathGradientBrush](./pathgradientbrush/)(const ArrayPtr\<PointF\>\&, WrapMode) | RTTI-Informationen. |
| [PathGradientBrush](./pathgradientbrush/)(const ArrayPtr\<Point\>\&, WrapMode) | Konstruiert eine neue Instanz der [PathGradientBrush](./) Klasse. |
| [PathGradientBrush](./pathgradientbrush/)(const SharedPtr\<GraphicsPath\>\&) | Konstruiert eine neue Instanz der [PathGradientBrush](./) Klasse. |
| [ResetTransform](./resettransform/)() | Setzt die Transformationsmatrix des aktuellen Objekts zurück, sodass sie zur Einheitsmatrix wird. |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | Dreht die lokale geometrische Transformation um den angegebenen Winkel in der angegebenen Reihenfolge. |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | Skaliert die lokale geometrische Transformation um die angegebenen Faktoren in der angegebenen Reihenfolge. |
| [set_Blend](./set_blend/)(const SharedPtr\<Blend\>\&) | Legt eine Mischung fest, die Faktoren und Positionen der Grundfarben für diesen Pinsel angibt. |
| [set_CenterColor](./set_centercolor/)(Color) | Setzt eine Farbe, die sich im Zentrum des von dem aktuellen Objekt gefüllten Pfads befindet. |
| [set_CenterPoint](./set_centerpoint/)(const PointF\&) | Setzt den Mittelpunkt des Farbverlaufs. |
| [set_FocusScales](./set_focusscales/)(const PointF\&) | Setzt den Fokuspunkt für das Abfallen des Farbverlaufs. |
| [set_InterpolationColors](./set_interpolationcolors/)(const SharedPtr\<ColorBlend\>\&) | Setzt einen Wert, der einen mehrfarbigen linearen Farbverlauf definiert. |
| [set_SurroundColors](./set_surroundcolors/)(const ArrayPtr\<Color\>\&) | Legt Farben fest, die den Punkten im Pfad entsprechen, den dieser [PathGradientBrush](./) füllt. |
| [set_Transform](./set_transform/)(const SharedPtr\<Matrix\>\&) | Legt ein [Matrix](../matrix/)-Objekt fest, das die geometrischen Transformationen für den vom aktuellen Objekt dargestellten Pinsel angibt. |
| [set_WrapMode](./set_wrapmode/)(WrapMode) | Legt den Wrap-Modus fest. |
| [SetBlendTriangularShape](./setblendtriangularshape/)(float, float) | NICHT IMPLEMENTIERT. |
| [SetSigmaBellShape](./setsigmabellshape/)(float, float) | NICHT IMPLEMENTIERT. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | Verschiebt die lokale geometrische Transformation um die angegebenen Abmessungen in der angegebenen Reihenfolge. |
## Siehe auch

* Class [Brush](../../system.drawing/brush/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
