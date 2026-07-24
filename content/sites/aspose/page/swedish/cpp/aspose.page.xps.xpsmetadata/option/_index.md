---
title: "Aspose::Page::XPS::XpsMetadata::Option klass"
linktitle: "Option"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::XpsMetadata::Option klass. Klassen som implementerar ett vanligt PrintTicketOption. Bas‑klass för alla schema‑definierade alternativ. Ett Option‑element innehåller alla Property‑ och ScoredProperty‑element som är associerade med detta alternativ.  i C++."
type: docs
weight: 7600
url: /sv/cpp/aspose.page.xps.xpsmetadata/option/
---
## Option class


Klassen som implementerar ett vanligt [PrintTicket](../printticket/)**[Option](./)**. Bas‑klass för alla schema‑definierade alternativ. Ett [Option](./)‑element innehåller alla [Property](../property/)‑ och [ScoredProperty](../scoredproperty/)‑element som är associerade med detta alternativ. [https://docs.microsoft.com/en-us/windows/win32/printdocs/option](https://docs.microsoft.com/en-us/windows/win32/printdocs/option).

```cpp
class Option : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
               public virtual Aspose::Page::XPS::XpsMetadata::IFeatureItem
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | Lägger till en lista med objekt i slutet av detta options objektlista. Varje objekt måste vara en [ScoredProperty](../scoredproperty/)‑ eller [Property](../property/)‑instans. |
| [Option](./option/)(System::String, const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | Skapar en ny [PrintTicket](../printticket/)‑alternativinstans. |
| [Option](./option/)(const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | Skapar en ny [PrintTicket](../printticket/)‑alternativinstans. |
| [Option](./option/)(System::SharedPtr\<Option\>) | Skapar en klon‑alternativinstans. |
## Se även

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IFeatureItem](../ifeatureitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
