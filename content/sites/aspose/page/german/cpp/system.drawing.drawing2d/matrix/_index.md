---
title: "System::Drawing::Drawing2D::Matrix Klasse"
linktitle: "Matrix"
second_title: "Aspose.Page für C++"
description: "System::Drawing::Drawing2D::Matrix Klasse. Stellt eine 3×3‑Matrix dar, die Transformationsoperationen definiert. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben in C++."
type: docs
weight: 1000
url: /de/cpp/system.drawing.drawing2d/matrix/
---
## Matrix class


Stellt eine 3×3‑Matrix dar, die Transformationsoperationen definiert. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class Matrix : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Clone](./clone/)() const | Erstellt eine Kopie des aktuellen Objekts. |
| [Dispose](./dispose/)() | Gibt alle vom aktuellen Objekt erworbenen Betriebssystemressourcen frei. |
| [Equals](./equals/)(ptr) override | Prüft, ob das angegebene Objekt ein [Matrix](./) ist und mit diesem Objekt identisch ist. |
| [get_Elements](./get_elements/)() const | Gibt ein Array zurück, das die Elemente der Matrix in folgender Reihenfolge enthält: m11, m12, m21, m22, dx, dy. |
| [get_IsIdentity](./get_isidentity/)() const | Bestimmt, ob die von dem aktuellen Objekt dargestellte Matrix eine Einheitsmatrix ist. |
| [get_IsInvertible](./get_isinvertible/)() const | Bestimmt, ob die von dem aktuellen Objekt dargestellte Matrix invertierbar ist. |
| [get_OffsetX](./get_offsetx/)() const | Gibt den X-Translationswert der von dem aktuellen Objekt dargestellten Matrix zurück. |
| [get_OffsetY](./get_offsety/)() const | Gibt den Y-Translationswert der von dem aktuellen Objekt dargestellten Matrix zurück. |
| [Invert](./invert/)() | Invertiert die von dem aktuellen Objekt dargestellte Matrix. |
| [Matrix](./matrix/)() | Konstruiert eine neue Instanz der Klasse [Matrix](./), die eine Einheitsmatrix darstellt. |
| [Matrix](./matrix/)(float, float, float, float, float, float) | Konstruiert eine neue Instanz der Klasse [Matrix](./) und initialisiert sie mit den angegebenen Werten. |
| [Matrix](./matrix/)(const Rectangle\&, const ArrayPtr\<Point\>\&) | Konstruiert eine neue Instanz der Klasse [Matrix](./) für die geometrische Transformation, die durch das angegebene Rechteck und das Array von Punkten definiert ist. |
| [Matrix](./matrix/)(const RectangleF\&, const ArrayPtr\<PointF\>\&) | Konstruiert eine neue Instanz der Klasse [Matrix](./) für die geometrische Transformation, die durch das angegebene Rechteck und das Array von Punkten definiert ist. |
| [Multiply](./multiply/)(const SharedPtr\<Matrix\>\&) | Multipliziert die von dem aktuellen Objekt dargestellte Matrix mit der angegebenen Matrix. |
| [Multiply](./multiply/)(const SharedPtr\<Matrix\>\&, MatrixOrder) | Multipliziert die von dem aktuellen Objekt dargestellte Matrix mit der angegebenen Matrix. |
| [Reset](./reset/)() | Setzt die von dem aktuellen Objekt dargestellte Matrix zurück, sodass sie zu einer Einheitsmatrix wird. |
| [Rotate](./rotate/)(float) | Dreht die von dem aktuellen Objekt dargestellte Matrix im Uhrzeigersinn um den angegebenen Winkel. |
| [Rotate](./rotate/)(float, MatrixOrder) | Dreht die von dem aktuellen Objekt dargestellte Matrix im Uhrzeigersinn um den Ursprung herum um den angegebenen Winkel. |
| [RotateAt](./rotateat/)(float, const PointF\&) | Dreht die von dem aktuellen Objekt dargestellte Matrix im Uhrzeigersinn um den angegebenen Punkt herum um den angegebenen Winkel. |
| [RotateAt](./rotateat/)(float, const PointF\&, MatrixOrder) | Dreht die von dem aktuellen Objekt dargestellte Matrix im Uhrzeigersinn um den angegebenen Punkt herum um den angegebenen Winkel. |
| [Scale](./scale/)(float, float) | Wendet den angegebenen Skalierungsvektor auf die von dem aktuellen Objekt dargestellte Matrix an. |
| [Scale](./scale/)(float, float, MatrixOrder) | Wendet den angegebenen Skalierungsvektor auf die von dem aktuellen Objekt dargestellte Matrix an. |
| [Shear](./shear/)(float, float) | Wendet den angegebenen Scherungsvektor auf die von dem aktuellen Objekt dargestellte Matrix an. |
| [Shear](./shear/)(float, float, MatrixOrder) | Wendet den angegebenen Scherungsvektor auf die von dem aktuellen Objekt dargestellte Matrix an. |
| [TransformPoints](./transformpoints/)(const ArrayPtr\<Point\>\&) | Wendet die von der von dem aktuellen Objekt dargestellten Matrix definierte geometrische Transformation auf die angegebenen Punkte an. |
| [TransformPoints](./transformpoints/)(const System::Details::ArrayView\<Point\>\&) | Wendet die von der von dem aktuellen Objekt dargestellten Matrix definierte geometrische Transformation auf die angegebenen Punkte an. |
| [TransformPoints](./transformpoints/)(const ArrayPtr\<PointF\>\&) | Wendet die von der von dem aktuellen Objekt dargestellten Matrix definierte geometrische Transformation auf die angegebenen Punkte an. |
| [TransformPoints](./transformpoints/)(const System::Details::ArrayView\<PointF\>\&) | Wendet die von der von dem aktuellen Objekt dargestellten Matrix definierte geometrische Transformation auf die angegebenen Punkte an. |
| [TransformVectors](./transformvectors/)(const ArrayPtr\<Point\>\&) | Wendet nur die Skalierungs- und Rotationskomponenten der von dem aktuellen Objekt dargestellten Matrix auf die angegebenen Punkte an. |
| [TransformVectors](./transformvectors/)(const System::Details::ArrayView\<Point\>\&) | Wendet nur die Skalierungs- und Rotationskomponenten der von dem aktuellen Objekt dargestellten Matrix auf die angegebenen Punkte an. |
| [TransformVectors](./transformvectors/)(const ArrayPtr\<PointF\>\&) | Wendet nur die Skalierungs- und Rotationskomponenten der von dem aktuellen Objekt dargestellten Matrix auf die angegebenen Punkte an. |
| [TransformVectors](./transformvectors/)(const System::Details::ArrayView\<PointF\>\&) | Wendet nur die Skalierungs- und Rotationskomponenten der von dem aktuellen Objekt dargestellten Matrix auf die angegebenen Punkte an. |
| [Translate](./translate/)(float, float) | Wendet den angegebenen Translationsvektor auf die von dem aktuellen Objekt dargestellte Matrix an. |
| [Translate](./translate/)(float, float, MatrixOrder) | Wendet den angegebenen Translationsvektor auf die von dem aktuellen Objekt dargestellte Matrix an. |
| [VectorTransformPoints](./vectortransformpoints/)(const ArrayPtr\<Point\>\&) | Multipliziert jeden Vektor in einem Array mit der von dem aktuellen Objekt dargestellten Matrix. |
| [VectorTransformPoints](./vectortransformpoints/)(const System::Details::ArrayView\<Point\>\&) | Multipliziert jeden Vektor in einem Array mit der von dem aktuellen Objekt dargestellten Matrix. |
| virtual [~Matrix](./~matrix/)() | Destruktor. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
