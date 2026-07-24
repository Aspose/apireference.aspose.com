---
title: "Aspose::Page::XPS::XpsMetadata::ScoredProperty classe"
linktitle: "ScoredProperty"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::XpsMetadata::ScoredProperty classe. La classe che implementa un PrintTicketScoredProperty comune. La classe base per tutte le proprietà valutate definite dallo schema. Un elemento ScoredProperty dichiara una proprietà intrinseca a una definizione di Opzione. Tali proprietà dovrebbero essere confrontate quando si valuta quanto una Opzione richiesta corrisponda a una Opzione supportata dal dispositivo.  in C++."
type: docs
weight: 14600
url: /it/cpp/aspose.page.xps.xpsmetadata/scoredproperty/
---
## ScoredProperty class


La classe che implementa un comune [PrintTicket](../printticket/)**[ScoredProperty](./)**. La classe base per tutte le proprietà valutate definite dallo schema. Un elemento **[ScoredProperty](./)** dichiara una proprietà intrinseca a una definizione di [Option](../option/). Tali proprietà dovrebbero essere confrontate quando si valuta quanto una [Option](../option/) richiesta corrisponda a una [Option](../option/) supportata dal dispositivo. [https://docs.microsoft.com/en-us/windows/win32/printdocs/scoredproperty](https://docs.microsoft.com/en-us/windows/win32/printdocs/scoredproperty).

```cpp
class ScoredProperty : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
                       public virtual Aspose::Page::XPS::XpsMetadata::IOptionItem,
                       public Aspose::Page::XPS::XpsMetadata::IScoredPropertyItem
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [ScoredProperty](./scoredproperty/)(System::String, System::SharedPtr\<ParameterRef\>) | Crea una nuova istanza. |
| [ScoredProperty](./scoredproperty/)(System::String, System::SharedPtr\<Value\>, const System::ArrayPtr\<System::SharedPtr\<IScoredPropertyItem\>\>\&) | Crea una nuova istanza. |
## Vedi anche

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IOptionItem](../ioptionitem/)
* Class [IScoredPropertyItem](../iscoredpropertyitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
