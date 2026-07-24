---
title: "Aspose::Page::XPS::XpsMetadata::PageWatermark κλάση"
linktitle: "PageWatermark"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::XPS::XpsMetadata::PageWatermark class. Περιγράφει τη ρύθμιση υδατογραφήματος της εξόδου και τα χαρακτηριστικά του υδατογραφήματος. Τα υδατογραφήματα εφαρμόζονται στη λογική σελίδα, όχι στη φυσική σελίδα. Για παράδειγμα, εάν το DocumentDuplex είναι ενεργοποιημένο, ένα υδατογράφημα θα εμφανίζεται σε κάθε NUp σελίδα σε κάθε φύλλο. Εάν DocumentDuplex, PagesPerSheet=2, τότε κάθε φύλλο θα έχει 2 υδατογραφήματα.  in C++."
type: docs
weight: 13100
url: /el/cpp/aspose.page.xps.xpsmetadata/pagewatermark/
---
## PageWatermark class


Περιγράφει τη ρύθμιση υδατογραφήματος της εξόδου και τα χαρακτηριστικά του υδατογραφήματος. Τα υδατογραφήματα εφαρμόζονται στη λογική σελίδα, όχι στη φυσική σελίδα. Για παράδειγμα, εάν το [DocumentDuplex](../documentduplex/) είναι ενεργοποιημένο, ένα υδατογράφημα θα εμφανίζεται σε κάθε **[NUp](../nup/)** σελίδα σε κάθε φύλλο. Εάν το [DocumentDuplex](../documentduplex/), **PagesPerSheet**=2, τότε κάθε φύλλο θα έχει 2 υδατογραφήματα. [https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark](https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark).

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
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [PageWatermark](./pagewatermark/)(const System::ArrayPtr\<System::SharedPtr\<PageWatermark::IPageWatermarkItem\>\>\&) | Δημιουργεί μια νέα παρουσία. |
## Δείτε επίσης

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
