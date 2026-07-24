---
title: "System::Drawing::FontFamily-klasse"
linktitle: "FontFamily"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::FontFamily-klasse. Vertegenwoordigt een groep lettertypen die een vergelijkbaar basisonwerp delen. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten kan veroorzaken. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 900
url: /nl/cpp/system.drawing/fontfamily/
---
## FontFamily class


Vertegenwoordigt een groep lettertypen die een vergelijkbaar basisonwerp delen. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten kan veroorzaken. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)-pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class FontFamily : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Clone](./clone/)() | Retourneert een kopie van het huidige [FontFamily](./)-object. |
| [Dispose](./dispose/)() | Geeft alle door het huidige object verworven besturingssysteembronnen vrij. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Bepaalt of het huidige en het opgegeven object identiek zijn. |
| [FontFamily](./fontfamily/)(const String\&) | Construeert een nieuw exemplaar van de klasse [FontFamily](./) die een lettertypefamilie met de opgegeven naam vertegenwoordigt. |
| [FontFamily](./fontfamily/)(const String\&, const SharedPtr\<Text::FontCollection\>\&) | Construeert een nieuw exemplaar van [FontFamily](./) in de opgegeven FontCollection met de opgegeven naam. |
| [FontFamily](./fontfamily/)(Text::GenericFontFamilies) | Construeert een nieuw exemplaar van [FontFamily](./) vanuit de opgegeven generieke lettertypefamilie. |
| static [get_Families](./get_families/)() | Retourneert een array die alle [FontFamily](./)-objecten bevat die geassocieerd zijn met de huidige grafische context. |
| static [get_GenericMonospace](./get_genericmonospace/)() | Retourneert een [FontFamily](./)-object dat een generieke monospace-lettertypefamilie vertegenwoordigt. |
| static [get_GenericSansSerif](./get_genericsansserif/)() | Retourneert een [FontFamily](./)-object dat een generieke sans-serif-lettertypefamilie vertegenwoordigt. |
| static [get_GenericSerif](./get_genericserif/)() | Retourneert een [FontFamily](./)-object dat een generieke serif-lettertypefamilie vertegenwoordigt. |
| [get_Name](./get_name/)() const | Retourneert de naam van de lettertypefamilie die door het huidige object wordt vertegenwoordigd. |
| [GetCellAscent](./getcellascent/)(FontStyle) | Retourneert de celstijging van de lettertypefamilie die door het huidige object wordt vertegenwoordigd voor de opgegeven lettertype‑stijl. |
| [GetCellDescent](./getcelldescent/)(FontStyle) | Retourneert de celafdaling van de lettertypefamilie die door het huidige object wordt vertegenwoordigd voor de opgegeven lettertype‑stijl. |
| [GetEmHeight](./getemheight/)(FontStyle) | Retourneert de hoogte van het em‑vierkant in lettertype‑ontwerpeenheden voor de opgegeven stijl. |
| [GetLineSpacing](./getlinespacing/)(FontStyle) | Retourneert de regelafstand van de lettertypefamilie die door het huidige object wordt vertegenwoordigd voor de opgegeven lettertype‑stijl. |
| [GetName](./getname/)(int) const | Retourneert de naam van de lettertypefamilie die door het huidige object wordt vertegenwoordigd. |
| [IsStyleAvailable](./isstyleavailable/)(FontStyle) | Bepaalt of de opgegeven lettertype‑stijl beschikbaar is. |
| virtual [~FontFamily](./~fontfamily/)() | Destructor. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
