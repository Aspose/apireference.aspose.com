---
title: "System::Drawing::Drawing2D::Matrix class"
linktitle: "Matrix"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::Drawing2D::Matrix class. Vertegenwoordigt een 3x3 matrix die transformatie‑operaties definieert. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject()‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 1000
url: /nl/cpp/system.drawing.drawing2d/matrix/
---
## Matrix class


Vertegenwoordigt een 3x3 matrix die transformatie‑operaties definieert. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/)‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class Matrix : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Clone](./clone/)() const | Maakt een kopie van het huidige object. |
| [Dispose](./dispose/)() | Geeft alle door het huidige object verworven besturingssysteembronnen vrij. |
| [Equals](./equals/)(ptr) override | Test of het opgegeven object een [Matrix](./) is en identiek is aan dit object. |
| [get_Elements](./get_elements/)() const | Retourneert een array met de elementen van de matrix in de volgende volgorde: m11, m12, m21, m22, dx, dy. |
| [get_IsIdentity](./get_isidentity/)() const | Bepaalt of de matrix die wordt vertegenwoordigd door het huidige object een identiteitsmatrix is. |
| [get_IsInvertible](./get_isinvertible/)() const | Bepaalt of de matrix die wordt vertegenwoordigd door het huidige object inverteerbaar is. |
| [get_OffsetX](./get_offsetx/)() const | Retourneert de X‑translatiewaarde van de matrix die wordt vertegenwoordigd door het huidige object. |
| [get_OffsetY](./get_offsety/)() const | Retourneert de Y‑translatiewaarde van de matrix die wordt vertegenwoordigd door het huidige object. |
| [Invert](./invert/)() | Inverteert de matrix die wordt vertegenwoordigd door het huidige object. |
| [Matrix](./matrix/)() | Construeert een nieuwe instantie van de [Matrix](./)‑klasse die een identiteitsmatrix vertegenwoordigt. |
| [Matrix](./matrix/)(float, float, float, float, float, float) | Construeert een nieuwe instantie van de [Matrix](./)‑klasse en initialiseert deze met de opgegeven waarden. |
| [Matrix](./matrix/)(const Rectangle\&, const ArrayPtr\<Point\>\&) | Construeert een nieuwe instantie van de [Matrix](./)‑klasse voor de geometrische transformatie gedefinieerd door het opgegeven rechthoek en de array van punten. |
| [Matrix](./matrix/)(const RectangleF\&, const ArrayPtr\<PointF\>\&) | Construeert een nieuwe instantie van de [Matrix](./)‑klasse voor de geometrische transformatie gedefinieerd door het opgegeven rechthoek en de array van punten. |
| [Multiply](./multiply/)(const SharedPtr\<Matrix\>\&) | Vermenigvuldigt de matrix die wordt vertegenwoordigd door het huidige object met de opgegeven matrix. |
| [Multiply](./multiply/)(const SharedPtr\<Matrix\>\&, MatrixOrder) | Vermenigvuldigt de matrix die wordt vertegenwoordigd door het huidige object met de opgegeven matrix. |
| [Reset](./reset/)() | Reset de matrix die wordt vertegenwoordigd door het huidige object zodat deze een identiteitsmatrix wordt. |
| [Rotate](./rotate/)(float) | Roteert de matrix die wordt vertegenwoordigd door het huidige object met de klok mee over de opgegeven hoek. |
| [Rotate](./rotate/)(float, MatrixOrder) | Roteert de matrix die wordt vertegenwoordigd door het huidige object met de klok mee rond de oorsprong over de opgegeven hoek. |
| [RotateAt](./rotateat/)(float, const PointF\&) | Roteert de matrix die wordt vertegenwoordigd door het huidige object met de klok mee rond het opgegeven punt over de opgegeven hoek. |
| [RotateAt](./rotateat/)(float, const PointF\&, MatrixOrder) | Roteert de matrix die wordt vertegenwoordigd door het huidige object met de klok mee rond het opgegeven punt over de opgegeven hoek. |
| [Scale](./scale/)(float, float) | Past de opgegeven schaalvector toe op de matrix die wordt vertegenwoordigd door het huidige object. |
| [Scale](./scale/)(float, float, MatrixOrder) | Past de opgegeven schaalvector toe op de matrix die wordt vertegenwoordigd door het huidige object. |
| [Shear](./shear/)(float, float) | Past de opgegeven schuifvector toe op de matrix die wordt vertegenwoordigd door het huidige object. |
| [Shear](./shear/)(float, float, MatrixOrder) | Past de opgegeven schuifvector toe op de matrix die wordt vertegenwoordigd door het huidige object. |
| [TransformPoints](./transformpoints/)(const ArrayPtr\<Point\>\&) | Past de geometrische transformatie toe die wordt gedefinieerd door de matrix die wordt vertegenwoordigd door het huidige object op de opgegeven punten. |
| [TransformPoints](./transformpoints/)(const System::Details::ArrayView\<Point\>\&) | Past de geometrische transformatie toe die wordt gedefinieerd door de matrix die wordt vertegenwoordigd door het huidige object op de opgegeven punten. |
| [TransformPoints](./transformpoints/)(const ArrayPtr\<PointF\>\&) | Past de geometrische transformatie toe die wordt gedefinieerd door de matrix die wordt vertegenwoordigd door het huidige object op de opgegeven punten. |
| [TransformPoints](./transformpoints/)(const System::Details::ArrayView\<PointF\>\&) | Past de geometrische transformatie toe die wordt gedefinieerd door de matrix die wordt vertegenwoordigd door het huidige object op de opgegeven punten. |
| [TransformVectors](./transformvectors/)(const ArrayPtr\<Point\>\&) | Past alleen de schaal- en rotatiecomponenten van de matrix die door het huidige object wordt vertegenwoordigd toe op de opgegeven punten. |
| [TransformVectors](./transformvectors/)(const System::Details::ArrayView\<Point\>\&) | Past alleen de schaal- en rotatiecomponenten van de matrix die door het huidige object wordt vertegenwoordigd toe op de opgegeven punten. |
| [TransformVectors](./transformvectors/)(const ArrayPtr\<PointF\>\&) | Past alleen de schaal- en rotatiecomponenten van de matrix die door het huidige object wordt vertegenwoordigd toe op de opgegeven punten. |
| [TransformVectors](./transformvectors/)(const System::Details::ArrayView\<PointF\>\&) | Past alleen de schaal- en rotatiecomponenten van de matrix die door het huidige object wordt vertegenwoordigd toe op de opgegeven punten. |
| [Translate](./translate/)(float, float) | Past de opgegeven translatievector toe op de matrix die door het huidige object wordt vertegenwoordigd. |
| [Translate](./translate/)(float, float, MatrixOrder) | Past de opgegeven translatievector toe op de matrix die door het huidige object wordt vertegenwoordigd. |
| [VectorTransformPoints](./vectortransformpoints/)(const ArrayPtr\<Point\>\&) | Vermenigvuldigt elke vector in een array met de matrix die door het huidige object wordt vertegenwoordigd. |
| [VectorTransformPoints](./vectortransformpoints/)(const System::Details::ArrayView\<Point\>\&) | Vermenigvuldigt elke vector in een array met de matrix die door het huidige object wordt vertegenwoordigd. |
| virtual [~Matrix](./~matrix/)() | Destructor. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
