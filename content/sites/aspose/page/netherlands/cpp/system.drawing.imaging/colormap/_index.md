---
title: "System::Drawing::Imaging::ColorMap class"
linktitle: "ColorMap"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::Imaging::ColorMap class. Vertegenwoordigt een kaart voor het converteren van kleuren. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr-pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 200
url: /nl/cpp/system.drawing.imaging/colormap/
---
## ColorMap class


Vertegenwoordigt een kaart voor het converteren van kleuren. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class ColorMap : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_NewColor](./get_newcolor/)() const | Retourneert het nieuwe [Color](../../system.drawing/color/) object dat de kleur vertegenwoordigt waarnaar geconverteerd moet worden. |
| [get_OldColor](./get_oldcolor/)() const | Retourneert het oude [Color](../../system.drawing/color/) object dat de te converteren kleur vertegenwoordigt. |
| [set_NewColor](./set_newcolor/)(const Color\&) | Stelt het nieuwe [Color](../../system.drawing/color/) object in dat de kleur vertegenwoordigt waarnaar geconverteerd moet worden. |
| [set_OldColor](./set_oldcolor/)(const Color\&) | Stelt het oude [Color](../../system.drawing/color/) object in dat de te converteren kleur vertegenwoordigt. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
