---
title: "Aspose::Page::XPS::XpsMetadata::PageWatermark Klasse"
linktitle: "PageWatermark"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::XpsMetadata::PageWatermark class. Beschreibt die Wasserzeichen-Einstellung der Ausgabe und die Eigenschaften des Wasserzeichens. Wasserzeichen gelten für die logische Seite, nicht für die physische Seite. Zum Beispiel, wenn DocumentDuplex aktiviert ist, erscheint ein Wasserzeichen auf jeder NUp-Seite jedes Blattes. Wenn DocumentDuplex, PagesPerSheet=2, dann hat jedes Blatt 2 Wasserzeichen.  in C++."
type: docs
weight: 13100
url: /de/cpp/aspose.page.xps.xpsmetadata/pagewatermark/
---
## PageWatermark class


Beschreibt die Wasserzeichen-Einstellung der Ausgabe und die Eigenschaften des Wasserzeichens. Wasserzeichen gelten für die logische Seite, nicht für die physische Seite. Zum Beispiel, wenn [DocumentDuplex](../documentduplex/) aktiviert ist, erscheint ein Wasserzeichen auf jeder **[NUp](../nup/)**-Seite jedes Blattes. Wenn [DocumentDuplex](../documentduplex/), **PagesPerSheet**=2, dann hat jedes Blatt 2 Wasserzeichen. [https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark](https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark).

```cpp
class PageWatermark : public Aspose::Page::XPS::XpsMetadata::Feature,
                      public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                      public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem,
                      public Aspose::Page::XPS::XpsMetadata::IPagePrintTicketItem
```

## Nested classes

* Class [IPageWatermarkItem](./ipagewatermarkitem/)
* Class [IPageWatermarkOptionItem](./ipagewatermarkoptionitem/)
* Class [Layering](./layering/)
* Class [LayeringOption](./layeringoption/)
* Class [PageWatermarkOption](./pagewatermarkoption/)
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [PageWatermark](./pagewatermark/)(const System::ArrayPtr\<System::SharedPtr\<PageWatermark::IPageWatermarkItem\>\>\&) | Erstellt eine neue Instanz. |
## Siehe auch

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
