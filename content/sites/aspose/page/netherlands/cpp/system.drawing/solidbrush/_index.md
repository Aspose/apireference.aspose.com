---
title: "System::Drawing::SolidBrush class"
linktitle: "SolidBrush"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::SolidBrush class. Vertegenwoordigt een penseel met één kleur. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 2400
url: /nl/cpp/system.drawing/solidbrush/
---
## SolidBrush class


Vertegenwoordigt een penseel met één kleur. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class SolidBrush : public System::Drawing::Brush
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Clone](./clone/)() override | Maakt een kopie van het huidige object. |
| [get_Color](./get_color/)() const | Retourneert de kleur van dit penseel. |
| [set_Color](./set_color/)(Color) | Stelt de kleur van dit penseel in. |
| [SolidBrush](./solidbrush/)(const Color\&) | Construeert een nieuw [SolidBrush](./) object en initialiseert het met de opgegeven kleur. |
## Zie ook

* Class [Brush](../brush/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
