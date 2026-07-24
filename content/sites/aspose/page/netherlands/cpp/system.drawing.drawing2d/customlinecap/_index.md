---
title: "System::Drawing::Drawing2D::CustomLineCap klasse"
linktitle: "CustomLineCap"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::Drawing2D::CustomLineCap klasse. Vertegenwoordigt een door de gebruiker gedefinieerde lijnkap. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 400
url: /nl/cpp/system.drawing.drawing2d/customlinecap/
---
## CustomLineCap class


Vertegenwoordigt een door de gebruiker gedefinieerde lijnkap. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in de [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class CustomLineCap : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [Clone](./clone/)() | Retourneert een kopie van het huidige object. |
| [CustomLineCap](./customlinecap/)(const SharedPtr\<GraphicsPath\>\&, const SharedPtr\<GraphicsPath\>\&, LineCap, float) | Construeert een nieuwe instantie van de [CustomLineCap](./) klasse die een door de gebruiker gedefinieerde lijnkap met de opgegeven eigenschappen vertegenwoordigt. |
| [Dispose](./dispose/)() | Geeft alle door het huidige object verworven besturingssysteembronnen vrij. |
| [get_BaseCap](./get_basecap/)() const | Retourneert de basislijnkap waaruit deze aangepaste kap is gemaakt. |
| [get_BaseInset](./get_baseinset/)() const | Retourneert de afstand tussen de lijn en de kap. |
| [get_StrokeJoin](./get_strokejoin/)() const | Retourneert de [LineJoin](../linejoin/) waarde die bepaalt hoe lijnen van deze aangepaste kap worden samengevoegd. |
| [get_WidthScale](./get_widthscale/)() const | Retourneert de schaal van deze aangepaste kap. |
| [GetStrokeCaps](./getstrokecaps/)(LineCap\&, LineCap\&) | Haalt de begin- en eindlijnkappen op van de aangepaste kap die door het huidige object wordt vertegenwoordigd. |
| [set_BaseCap](./set_basecap/)(LineCap) | Stelt de basislijnkapwaarde in voor deze aangepaste kap. |
| [set_BaseInset](./set_baseinset/)(float) | Stelt de afstand tussen de lijn en de kap in. |
| [set_StrokeJoin](./set_strokejoin/)(LineJoin) | Stelt de [LineJoin](../linejoin/) waarde in die bepaalt hoe lijnen van deze aangepaste kap worden samengevoegd. |
| [set_WidthScale](./set_widthscale/)(float) | Stelt de schaalwaarde van deze aangepaste kap in. |
| [SetStrokeCaps](./setstrokecaps/)(LineCap, LineCap) | Stelt de begin- en eindlijnkappen in van de aangepaste kap die door het huidige object wordt vertegenwoordigd. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
