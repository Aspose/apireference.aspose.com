---
title: "System::Drawing::Drawing2D::PathGradientBrush class"
linktitle: "PathGradientBrush"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::Drawing2D::PathGradientBrush class. Vertegenwoordigt een penseel dat het binnenste van een GraphicsPath-object vult met een kleurverloop. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject() . Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 1200
url: /nl/cpp/system.drawing.drawing2d/pathgradientbrush/
---
## PathGradientBrush class


Vertegenwoordigt een penseel dat het binnenste van een [GraphicsPath](../graphicspath/) object vult met een kleurverloop. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class PathGradientBrush : public System::Drawing::Brush
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Clone](./clone/)() override | Maakt een kopie van het huidige object. |
| [get_Blend](./get_blend/)() const | NOG NIET GEÏMPLENTEERD. |
| [get_CenterColor](./get_centercolor/)() const | Retourneert een kleur die zich in het midden van het pad bevindt dat door het huidige object is gevuld. |
| [get_CenterPoint](./get_centerpoint/)() const | Haalt het middelpunt van het kleurverloop op. |
| [get_FocusScales](./get_focusscales/)() const | Haalt het focuspunt voor de afname van het kleurverloop op. |
| [get_InterpolationColors](./get_interpolationcolors/)() const | Retourneert een waarde die een meerkleurig lineair kleurverloop definieert. |
| [get_Rectangle](./get_rectangle/)() | NOG NIET GEÏMPLENTEERD. |
| [get_SurroundColors](./get_surroundcolors/)() const | Retourneert kleuren die overeenkomen met de punten in het pad dat deze [PathGradientBrush](./) vult. |
| [get_Transform](./get_transform/)() const | Retourneert een kopie van een [Matrix](../matrix/) object dat de geometrische transformaties specificeert voor de kwast die door het huidige object wordt vertegenwoordigd. |
| [get_WrapMode](./get_wrapmode/)() const | Retourneert de wrap mode. |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Matrix\>\&, MatrixOrder) | Vermenigvuldigt de transformatiematrix van het huidige object met de opgegeven matrix. |
| [PathGradientBrush](./pathgradientbrush/)(const ArrayPtr\<PointF\>\&, WrapMode) | RTTI-informatie. |
| [PathGradientBrush](./pathgradientbrush/)(const ArrayPtr\<Point\>\&, WrapMode) | Construeert een nieuwe instantie van de [PathGradientBrush](./) klasse. |
| [PathGradientBrush](./pathgradientbrush/)(const SharedPtr\<GraphicsPath\>\&) | Construeert een nieuwe instantie van de [PathGradientBrush](./) klasse. |
| [ResetTransform](./resettransform/)() | Reset de transformatiematrix van het huidige object zodat deze een identiteitsmatrix wordt. |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | Roteert de lokale geometrische transformatie met de opgegeven hoek in de opgegeven volgorde. |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | Schaalt de lokale geometrische transformatie met de opgegeven factoren in de opgegeven volgorde. |
| [set_Blend](./set_blend/)(const SharedPtr\<Blend\>\&) | Stelt een blend in die factoren en posities van basiskleuren voor deze brush specificeert. |
| [set_CenterColor](./set_centercolor/)(Color) | Stelt een kleur in die zich in het midden van het pad bevindt dat door het huidige object is gevuld. |
| [set_CenterPoint](./set_centerpoint/)(const PointF\&) | Stelt het middelpunt van het kleurverloop in. |
| [set_FocusScales](./set_focusscales/)(const PointF\&) | Stelt het focuspunt voor de afname van het kleurverloop in. |
| [set_InterpolationColors](./set_interpolationcolors/)(const SharedPtr\<ColorBlend\>\&) | Stelt een waarde in die een meerkleurig lineair kleurverloop definieert. |
| [set_SurroundColors](./set_surroundcolors/)(const ArrayPtr\<Color\>\&) | Stelt kleuren in die overeenkomen met de punten in het pad dat deze [PathGradientBrush](./) vult. |
| [set_Transform](./set_transform/)(const SharedPtr\<Matrix\>\&) | Stelt een [Matrix](../matrix/) object in dat de geometrische transformaties specificeert voor de brush die wordt vertegenwoordigd door het huidige object. |
| [set_WrapMode](./set_wrapmode/)(WrapMode) | Stelt de wrap mode in. |
| [SetBlendTriangularShape](./setblendtriangularshape/)(float, float) | NOG NIET GEÏMPLENTEERD. |
| [SetSigmaBellShape](./setsigmabellshape/)(float, float) | NOG NIET GEÏMPLENTEERD. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | Vertaalt de lokale geometrische transformatie met de opgegeven afmetingen in de opgegeven volgorde. |
## Zie ook

* Class [Brush](../../system.drawing/brush/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
