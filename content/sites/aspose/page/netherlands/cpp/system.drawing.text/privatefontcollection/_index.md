---
title: "System::Drawing::Text::PrivateFontCollection class"
linktitle: "PrivateFontCollection"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::Text::PrivateFontCollection class. Vertegenwoordigt een verzameling van lettertypefamilies die door de clientapplicatie worden geleverd. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 300
url: /nl/cpp/system.drawing.text/privatefontcollection/
---
## PrivateFontCollection class


Vertegenwoordigt een verzameling van lettertypefamilies die door de clientapplicatie worden geleverd. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class PrivateFontCollection : public System::Drawing::Text::FontCollection
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [AddFont](./addfont/)(const System::ArrayPtr\<uint8_t\>\&, int) | Voegt het opgegeven lettertype toe aan de collectie. |
| [AddFontFile](./addfontfile/)(const String\&) | Voegt een lettertype uit het opgegeven bestand toe aan de collectie. |
| [get_Families](./get_families/)() override | Retourneert een array van [FontFamily](../../system.drawing/fontfamily/) objecten die geassocieerd zijn met de lettertypecollectie die wordt vertegenwoordigd door het huidige object. |
## Zie ook

* Class [FontCollection](../fontcollection/)
* Namespace [System::Drawing::Text](../)
* Library [Aspose.Page for C++](../../)
