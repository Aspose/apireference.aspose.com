---
title: "Aspose::Page::XPS::XpsMetadata::Feature classe"
linktitle: "Funzionalità"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::XpsMetadata::Feature classe. La classe che incapsula una caratteristica comune del Print Schema. La classe base per tutte le caratteristiche definite dallo schema. Un elemento Feature contiene un elenco completo degli elementi Option e Property che descrivono pienamente un attributo del dispositivo, un'impostazione di formattazione del lavoro o altra caratteristica rilevante.  in C++."
type: docs
weight: 2900
url: /it/cpp/aspose.page.xps.xpsmetadata/feature/
---
## Feature class


La classe che incapsula una caratteristica comune di Print Schema. La classe base per tutte le caratteristiche definite dallo schema. Un elemento **[Feature](./)** contiene un elenco completo degli elementi [Option](../option/) e [Property](../property/) che descrivono pienamente un attributo del dispositivo, un'impostazione di formattazione del lavoro o un'altra caratteristica pertinente. [https://docs.microsoft.com/en-us/windows/win32/printdocs/feature](https://docs.microsoft.com/en-us/windows/win32/printdocs/feature).

```cpp
class Feature : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
                public virtual Aspose::Page::XPS::XpsMetadata::IPrintTicketItem,
                public virtual Aspose::Page::XPS::XpsMetadata::IFeatureItem
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | Aggiunge un elenco di elementi alla fine dell'elenco di elementi di questa caratteristica. Ognuno deve essere un [Feature](./), un [Option](../option/) o un'istanza [Property](../property/). |
| [Feature](./feature/)(System::String, System::SharedPtr\<Option\>, const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | Crea una nuova istanza della caratteristica [PrintTicket](../printticket/). |
| [Feature](./feature/)(System::String, System::SharedPtr\<Feature\>, const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | Crea una nuova istanza della caratteristica [PrintTicket](../printticket/). |
## Vedi anche

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IPrintTicketItem](../iprintticketitem/)
* Class [IFeatureItem](../ifeatureitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
