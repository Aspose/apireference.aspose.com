---
title: "Aspose::Page::XPS::XpsMetadata::DocumentCollate classe"
linktitle: "DocumentCollate"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentCollate class. Descrive le caratteristiche di raggruppamento dell'output. Tutte le pagine in ciascun documento individuale sono raggruppate. DocumentCollate e JobCollateAlldocuments sono mutualmente esclusivi. Il comportamento e l'implementazione di se entrambi o solo uno di queste parole chiave è implementato è lasciato al driver.  in C++."
type: docs
weight: 800
url: /it/cpp/aspose.page.xps.xpsmetadata/documentcollate/
---
## DocumentCollate class


Descrive le caratteristiche di raggruppamento dell'output. Tutte le pagine in ciascun documento individuale sono raggruppate. [DocumentCollate](./) e JobCollateAlldocuments sono mutualmente esclusivi. Il comportamento e l'implementazione di se entrambi o solo uno di queste parole chiave è implementato è lasciato al driver. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcollate](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcollate).

```cpp
class DocumentCollate : public Aspose::Page::XPS::XpsMetadata::Collate,
                        public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                        public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [DocumentCollate](./documentcollate/)(const System::ArrayPtr\<System::SharedPtr\<Collate::CollateOption\>\>\&) | Crea una nuova istanza. |
## Vedi anche

* Class [Collate](../collate/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
