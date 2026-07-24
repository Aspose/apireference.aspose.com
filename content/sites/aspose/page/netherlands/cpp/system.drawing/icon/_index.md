---
title: "System::Drawing::Icon klasse"
linktitle: "Icon"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::Icon klasse. Vertegenwoordigt een Windows-pictogram. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 1100
url: /nl/cpp/system.drawing/icon/
---
## Icon class


Vertegenwoordigt een [Windows](../../system.windows/) pictogram. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class Icon : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Height](./get_height/)() const | Retourneert de hoogte van het pictogram. |
| [get_Width](./get_width/)() const | Retourneert de breedte van het pictogram. |
| [Icon](./icon/)(const String\&) | Construeert een nieuwe instantie van de [Icon](./) klasse die een pictogram uit het opgegeven bestand vertegenwoordigt. |
| [ToBitmap](./tobitmap/)() | Converteert het huidige object naar een [Bitmap](../bitmap/) object. |
| virtual [~Icon](./~icon/)() | Destructor. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
