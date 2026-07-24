---
title: "System::Drawing::Drawing2D::LinearGradientBrush class"
linktitle: "LinearGradientBrush"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::Drawing2D::LinearGradientBrush class. Vertegenwoordigt een lineaire gradientkwast. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 900
url: /nl/cpp/system.drawing.drawing2d/lineargradientbrush/
---
## LinearGradientBrush class


Vertegenwoordigt een lineaire gradientkwast. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class LinearGradientBrush : public System::Drawing::Brush
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Clone](./clone/)() override | Maakt een kopie van het huidige object. |
| [get_Blend](./get_blend/)() const | Retourneert een blend die factoren en posities van basiskleuren voor deze kwast specificeert. |
| [get_GammaCorrection](./get_gammacorrection/)() const | Retourneert een waarde die aangeeft dat gamma‑correctie is ingeschakeld voor deze kwast. |
| [get_InterpolationColors](./get_interpolationcolors/)() const | Retourneert een [ColorBlend](../colorblend/) object dat een meerkleurige lineaire gradient definieert. |
| [get_LinearColors](./get_linearcolors/)() const | Retourneert de begin- en eindkleuren van deze gradient. |
| [get_Rectangle](./get_rectangle/)() | Retourneert een begrenzende rechthoek. |
| [get_Transform](./get_transform/)() const | Retourneert een kopie van een [Matrix](../matrix/) object dat de geometrische transformaties specificeert voor de kwast die door het huidige object wordt vertegenwoordigd. |
| [get_WrapMode](./get_wrapmode/)() const | Retourneert de wrap mode. |
| [LinearGradientBrush](./lineargradientbrush/)(const PointF\&, const PointF\&, const Color\&, const Color\&) | RTTI-informatie. |
| [LinearGradientBrush](./lineargradientbrush/)(const Point\&, const Point\&, const Color\&, const Color\&) | Construeert een nieuw exemplaar van [LinearGradientBrush](./). |
| [LinearGradientBrush](./lineargradientbrush/)(const RectangleF\&, const Color\&, const Color\&, LinearGradientMode) | Construeert een nieuw exemplaar van [LinearGradientBrush](./). |
| [LinearGradientBrush](./lineargradientbrush/)(const Rectangle\&, const Color\&, const Color\&, LinearGradientMode) | Construeert een nieuw exemplaar van [LinearGradientBrush](./). |
| [LinearGradientBrush](./lineargradientbrush/)(const RectangleF\&, const Color\&, const Color\&, float, bool) | Construeert een nieuw exemplaar van [LinearGradientBrush](./). |
| [LinearGradientBrush](./lineargradientbrush/)(const Rectangle\&, const Color\&, const Color\&, float, bool) | Construeert een nieuw exemplaar van [LinearGradientBrush](./). |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Matrix\>\&, MatrixOrder) | Vermenigvuldigt de transformatiematrix van het huidige object met de opgegeven matrix. |
| [ResetTransform](./resettransform/)() | Reset de transformatie-matrix van het huidige object. |
| [RotateTransform](./rotatetransform/)(float, MatrixOrder) | Roteert de transform matrix van het huidige object. |
| [ScaleTransform](./scaletransform/)(float, float, MatrixOrder) | Schaalt de transform matrix van het huidige object. |
| [set_Blend](./set_blend/)(const SharedPtr\<Blend\>\&) | Stelt een blend in die factoren en posities van basiskleuren voor deze brush specificeert. |
| [set_GammaCorrection](./set_gammacorrection/)(bool) | Stelt de gamma-correctiestatus in voor deze brush. |
| [set_InterpolationColors](./set_interpolationcolors/)(const SharedPtr\<ColorBlend\>\&) | Stelt een [ColorBlend](../colorblend/) object in dat een meerkleurige lineaire gradient definieert. |
| [set_LinearColors](./set_linearcolors/)(const ArrayPtr\<Color\>\&) | Stelt de begin- en eindkleuren van deze gradient in. |
| [set_Transform](./set_transform/)(const SharedPtr\<Matrix\>\&) | Stelt een [Matrix](../matrix/) object in dat de geometrische transformaties specificeert voor de brush die wordt vertegenwoordigd door het huidige object. |
| [set_WrapMode](./set_wrapmode/)(WrapMode) | Stelt de wrap mode in. |
| [SetBlendTriangularShape](./setblendtriangularshape/)(float, float) | NOG NIET GEÏMPLENTEERD. |
| [SetSigmaBellShape](./setsigmabellshape/)(float, float) | NOG NIET GEÏMPLENTEERD. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | Verschuift de transform matrix van het huidige object. |
## Zie ook

* Class [Brush](../../system.drawing/brush/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
