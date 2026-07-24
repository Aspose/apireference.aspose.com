---
title: "Aspose::Page::XPS::XpsMetadata::DocumentCollate class"
linktitle: "DocumentCollate"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentCollate class. Beschreibt die Sortiereigenschaften der Ausgabe. Alle Seiten in jedem einzelnen Dokument werden sortiert. DocumentCollate und JobCollateAlldocuments schließen sich gegenseitig aus. Das Verhalten und die Implementierung, ob beide oder nur eines dieser Schlüsselwörter implementiert werden, liegt beim Treiber.  in C++."
type: docs
weight: 800
url: /de/cpp/aspose.page.xps.xpsmetadata/documentcollate/
---
## DocumentCollate class


Beschreibt die Sortiereigenschaften der Ausgabe. Alle Seiten in jedem einzelnen Dokument werden sortiert. [DocumentCollate](./) und JobCollateAlldocuments schließen sich gegenseitig aus. Das Verhalten und die Implementierung, ob beide oder nur eines dieser Schlüsselwörter implementiert werden, liegt beim Treiber. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcollate](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcollate).

```cpp
class DocumentCollate : public Aspose::Page::XPS::XpsMetadata::Collate,
                        public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                        public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [DocumentCollate](./documentcollate/)(const System::ArrayPtr\<System::SharedPtr\<Collate::CollateOption\>\>\&) | Erstellt eine neue Instanz. |
## Siehe auch

* Class [Collate](../collate/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
