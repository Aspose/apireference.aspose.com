---
title: "Aspose::Page::XPS::Features::EventBasedModifications::BeforeSavingEventArgs klasse"
linktitle: "BeforeSavingEventArgs"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::BeforeSavingEventArgs klasse. Definieert de basisklasse voor argumenten van verschillende vóór-opslag gebeurtenissen in C++."
type: docs
weight: 200
url: /nl/cpp/aspose.page.xps.features.eventbasedmodifications/beforesavingeventargs/
---
## BeforeSavingEventArgs class


Definieert de basisklasse voor argumenten van verschillende vóór-opslag gebeurtenissen.

```cpp
template<typename T>class BeforeSavingEventArgs : public System::Object
```


| Parameter | Beschrijving |
| --- | --- |
| T | Het type wijzigings‑API. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_AbsolutePageNumber](./get_absolutepagenumber/)() const | Het huidige absolute paginanummer over alle documenten binnen het [XPS](../../aspose.page.xps/) pakket. |
| [get_DocumentNumber](./get_documentnumber/)() const | Het huidige documentnummer binnen het [XPS](../../aspose.page.xps/) pakket. |
| [get_ElementAPI](./get_elementapi/)() const | Haalt de wijzigings‑API op van het element dat op het punt staat te worden opgeslagen. |
| [get_OutputPageNumber](./get_outputpagenumber/)() const | Het huidige uitvoernummer. Het verschilt van **AbsolutePageNumber** als de **PageNumbers**‑opslaanoptie is gespecificeerd. |
| [get_RelativePageNumber](./get_relativepagenumber/)() const | Het huidige paginanummer relatief ten opzichte van het huidige document binnen het [XPS](../../aspose.page.xps/) pakket. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Stel het n'th sjabloonargument in op een zwakke pointer (in plaats van gedeeld). Hiermee kun je pointers in containers overschakelen naar zwakke modus. |

## Zie ook

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../)
* Library [Aspose.Page for C++](../../)
