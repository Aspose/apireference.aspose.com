---
title: "Aspose::Page::XPS::XpsMetadata::Option classe"
linktitle: "Option"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::XpsMetadata::Option classe. La classe che implementa una comune PrintTicketOption. La classe base per tutte le opzioni definite dallo schema. Un elemento Option contiene tutti gli elementi Property e ScoredProperty associati a questa opzione. in C++."
type: docs
weight: 7600
url: /it/cpp/aspose.page.xps.xpsmetadata/option/
---
## Option class


La classe che implementa una comune [PrintTicket](../printticket/)**[Option](./)**. La classe base per tutte le opzioni definite dallo schema. Un elemento [Option](./) contiene tutti gli elementi [Property](../property/) e [ScoredProperty](../scoredproperty/) associati a questa opzione. [https://docs.microsoft.com/en-us/windows/win32/printdocs/option](https://docs.microsoft.com/en-us/windows/win32/printdocs/option).

```cpp
class Option : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
               public virtual Aspose::Page::XPS::XpsMetadata::IFeatureItem
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | Aggiunge un elenco di elementi alla fine dell'elenco di elementi di questa opzione. Ognuno deve essere un'istanza di [ScoredProperty](../scoredproperty/) o [Property](../property/). |
| [Option](./option/)(System::String, const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | Crea una nuova istanza di opzione [PrintTicket](../printticket/). |
| [Option](./option/)(const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | Crea una nuova istanza di opzione [PrintTicket](../printticket/). |
| [Option](./option/)(System::SharedPtr\<Option\>) | Crea un'istanza di opzione clone. |
## Vedi anche

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IFeatureItem](../ifeatureitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
