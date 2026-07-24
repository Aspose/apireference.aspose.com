---
title: "System::Drawing::Printing::PrintPageEventArgs klasse"
linktitle: "PrintPageEventArgs"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::Printing::PrintPageEventArgs klasse. Biedt gegevens voor het PrintPage‑event. Objecten van deze klasse mogen alleen worden toegewezen met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument door te geven aan functies in C++."
type: docs
weight: 900
url: /nl/cpp/system.drawing.printing/printpageeventargs/
---
## PrintPageEventArgs class


Biedt gegevens voor het PrintPage‑event. Objecten van deze klasse mogen alleen worden toegewezen met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument door te geven aan functies.

```cpp
class PrintPageEventArgs : public System::EventArgs
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Graphics](./get_graphics/)() | NOG NIET GEÏMPLENTEERD. |
| [get_HasMorePages](./get_hasmorepages/)() | NOG NIET GEÏMPLENTEERD. |
| [get_PageSettings](./get_pagesettings/)() | NOG NIET GEÏMPLENTEERD. |
| [PrintPageEventArgs](./printpageeventargs/)(const SharedPtr\<Graphics\>\&, const SharedPtr\<Rectangle\>\&, const SharedPtr\<Rectangle\>\&, const SharedPtr\<PageSettings\>\&) | Construeert een nieuwe instantie van de [PrintPageEventArgs](./) klasse. |
| [set_HasMorePages](./set_hasmorepages/)(bool) | NOG NIET GEÏMPLENTEERD. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Een statisch lid dat een "lege" [EventArgs](../../system/eventargs/) gedeelde pointer (null-pointer) vertegenwoordigt. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [ptr](./ptr/) | Een alias voor een gedeelde pointer naar een instantie van deze klasse. |
## Zie ook

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::Drawing::Printing](../)
* Library [Aspose.Page for C++](../../)
