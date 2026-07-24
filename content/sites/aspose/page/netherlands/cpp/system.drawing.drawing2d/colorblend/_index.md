---
title: "System::Drawing::Drawing2D::ColorBlend class"
linktitle: "ColorBlend"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::Drawing2D::ColorBlend class. Bevat arrays van kleuren en posities die worden gebruikt voor het interpoleren van kleurvervaging in een meerkleurige gradiënt. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 300
url: /nl/cpp/system.drawing.drawing2d/colorblend/
---
## ColorBlend class


Bevat arrays van kleuren en posities die worden gebruikt voor het interpoleren van kleurvervaging in een meerkleurige gradiënt. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in de [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class ColorBlend : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [ColorBlend](./colorblend/)() | Construeert een nieuw exemplaar van de [ColorBlend](./) klasse. |
| [ColorBlend](./colorblend/)(int) | Construeert een nieuw exemplaar van de [Blend](../blend/) klasse. |
| [get_Colors](./get_colors/)() | Retourneert een array van kleuren die gebruikt worden op de overeenkomstige posities langs een gradiënt. |
| [get_Positions](./get_positions/)() | Retourneert de array van mengposities langs een gradiënt. |
| [set_Colors](./set_colors/)(const ArrayPtr\<Color\>\&) | Stelt een array van kleuren in die gebruikt worden op de overeenkomstige posities langs een gradiënt. |
| [set_Positions](./set_positions/)(const ArrayPtr\<float\>\&) | Stelt de array van mengposities langs een gradiënt in. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
