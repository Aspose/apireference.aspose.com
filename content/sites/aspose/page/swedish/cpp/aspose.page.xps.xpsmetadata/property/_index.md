---
title: "Aspose::Page::XPS::XpsMetadata::Property-klass"
linktitle: "Property"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::XpsMetadata::Property-klass. Klassen som implementerar en gemensam PrintTicketProperty. Basklassen för alla schema‑definierade egenskaper. Ett Property‑element deklarerar en enhet, jobbformattering eller annan relevant egenskap vars namn ges av dess name‑attribut. Ett Value‑element används för att tilldela ett värde till Property. Ett Property kan vara komplext och eventuellt innehålla flera underegenskaper. Underegenskaper representeras också av Property‑element.  i C++."
type: docs
weight: 14300
url: /sv/cpp/aspose.page.xps.xpsmetadata/property/
---
## Property class


Klassen som implementerar en gemensam [PrintTicket](../printticket/)**[Property](./)**. Basklassen för alla schema‑definierade egenskaper. Ett **[Property](./)**‑element deklarerar en enhet, jobbformattering eller annan relevant egenskap vars namn ges av dess name‑attribut. Ett [Value](../value/)‑element används för att tilldela ett värde till **[Property](./)**. Ett **[Property](./)** kan vara komplext och eventuellt innehålla flera underegenskaper. Underegenskaper representeras också av **[Property](./)**‑element. [https://docs.microsoft.com/en-us/windows/win32/printdocs/property](https://docs.microsoft.com/en-us/windows/win32/printdocs/property).

```cpp
class Property : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
                 public virtual Aspose::Page::XPS::XpsMetadata::IPrintTicketItem,
                 public Aspose::Page::XPS::XpsMetadata::IFeatureItem,
                 public virtual Aspose::Page::XPS::XpsMetadata::IOptionItem,
                 public Aspose::Page::XPS::XpsMetadata::IScoredPropertyItem,
                 public Aspose::Page::XPS::XpsMetadata::IPropertyItem
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Property](./property/)(System::String, System::SharedPtr\<Property\>, const System::ArrayPtr\<System::SharedPtr\<IPropertyItem\>\>\&) | Skapar en ny instans. |
| [Property](./property/)(System::String, System::SharedPtr\<Value\>, const System::ArrayPtr\<System::SharedPtr\<IPropertyItem\>\>\&) | Skapar en ny instans. |
## Se även

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IPrintTicketItem](../iprintticketitem/)
* Class [IFeatureItem](../ifeatureitem/)
* Class [IOptionItem](../ioptionitem/)
* Class [IScoredPropertyItem](../iscoredpropertyitem/)
* Class [IPropertyItem](../ipropertyitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
