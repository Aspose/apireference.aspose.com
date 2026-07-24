---
title: "Aspose::Page::XPS::Features::EventBasedModifications::BeforeSavingEventArgs klass"
linktitle: "BeforeSavingEventArgs"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::BeforeSavingEventArgs klass. Definierar bas-klassen för argument till olika innan-sparande händelser i C++."
type: docs
weight: 200
url: /sv/cpp/aspose.page.xps.features.eventbasedmodifications/beforesavingeventargs/
---
## BeforeSavingEventArgs class


Definierar basklassen för argument till olika före-sparande händelser.

```cpp
template<typename T>class BeforeSavingEventArgs : public System::Object
```


| Parameter | Beskrivning |
| --- | --- |
| T | Modifierings-API-typen. |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [get_AbsolutePageNumber](./get_absolutepagenumber/)() const | Det aktuella absoluta sidnumret över alla dokument i [XPS](../../aspose.page.xps/) paketet. |
| [get_DocumentNumber](./get_documentnumber/)() const | Det aktuella dokumentnumret i [XPS](../../aspose.page.xps/) paketet. |
| [get_ElementAPI](./get_elementapi/)() const | Hämtar modifierings-API:t för elementet som ska sparas. |
| [get_OutputPageNumber](./get_outputpagenumber/)() const | Det aktuella utskriftsnumret. Det skiljer sig från **AbsolutePageNumber** om **PageNumbers** sparalternativet är specificerat. |
| [get_RelativePageNumber](./get_relativepagenumber/)() const | Det aktuella sidnumret relativt det aktuella dokumentet i [XPS](../../aspose.page.xps/) paketet. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Ställ in n:te mallargumentet som en svag pekare (istället för delad). Tillåter att byta pekare i behållare till svagt läge. |

## Se även

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../)
* Library [Aspose.Page for C++](../../)
