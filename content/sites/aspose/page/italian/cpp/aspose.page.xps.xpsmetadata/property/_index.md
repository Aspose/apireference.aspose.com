---
title: "Aspose::Page::XPS::XpsMetadata::Property class"
linktitle: "Property"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::XpsMetadata::Property class. La classe che implementa una comune PrintTicketProperty. La classe base per tutte le proprietà definite dallo schema. Un elemento Property dichiara un dispositivo, una formattazione del lavoro o un'altra proprietà rilevante il cui nome è fornito dall'attributo name. Un elemento Value viene usato per assegnare un valore al Property. Un Property può essere complesso, contenendo possibilmente più sotto‑proprietà. Le sotto‑proprietà sono anch'esse rappresentate da elementi Property.  in C++."
type: docs
weight: 14300
url: /it/cpp/aspose.page.xps.xpsmetadata/property/
---
## Property class


La classe che implementa una comune [PrintTicket](../printticket/)**[Property](./)**. La classe base per tutte le proprietà definite dallo schema. Un elemento **[Property](./)** dichiara un dispositivo, una formattazione del lavoro o un'altra proprietà rilevante il cui nome è fornito dall'attributo name. Un elemento [Value](../value/) viene usato per assegnare un valore al **[Property](./)**. Un **[Property](./)** può essere complesso, contenendo possibilmente più sotto‑proprietà. Le sotto‑proprietà sono anche rappresentate da elementi **[Property](./)**. [https://docs.microsoft.com/en-us/windows/win32/printdocs/property](https://docs.microsoft.com/en-us/windows/win32/printdocs/property).

```cpp
class Property : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
                 public virtual Aspose::Page::XPS::XpsMetadata::IPrintTicketItem,
                 public Aspose::Page::XPS::XpsMetadata::IFeatureItem,
                 public virtual Aspose::Page::XPS::XpsMetadata::IOptionItem,
                 public Aspose::Page::XPS::XpsMetadata::IScoredPropertyItem,
                 public Aspose::Page::XPS::XpsMetadata::IPropertyItem
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Property](./property/)(System::String, System::SharedPtr\<Property\>, const System::ArrayPtr\<System::SharedPtr\<IPropertyItem\>\>\&) | Crea una nuova istanza. |
| [Property](./property/)(System::String, System::SharedPtr\<Value\>, const System::ArrayPtr\<System::SharedPtr\<IPropertyItem\>\>\&) | Crea una nuova istanza. |
## Vedi anche

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IPrintTicketItem](../iprintticketitem/)
* Class [IFeatureItem](../ifeatureitem/)
* Class [IOptionItem](../ioptionitem/)
* Class [IScoredPropertyItem](../iscoredpropertyitem/)
* Class [IPropertyItem](../ipropertyitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
