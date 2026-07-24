---
title: "Aspose::Page::XPS::XpsMetadata::DocumentBinding κλάση"
linktitle: "DocumentBinding"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentBinding κλάση. Περιγράφει τη μέθοδο δέσμευσης. Κάθε έγγραφο δεσμεύεται ξεχωριστά. Τα DocumentBinding και JobBindAllDocuments είναι αμοιβαία αποκλειστικά. Εξαρτάται από τον οδηγό να καθορίσει τον χειρισμό περιορισμών μεταξύ των λέξεων-κλειδιών. σε C++."
type: docs
weight: 600
url: /el/cpp/aspose.page.xps.xpsmetadata/documentbinding/
---
## DocumentBinding class


Περιγράφει τη μέθοδο δέσμευσης. Κάθε έγγραφο δεσμεύεται ξεχωριστά. [DocumentBinding](./) και [JobBindAllDocuments](../jobbindalldocuments/) είναι αμοιβαία αποκλειστικά. Εξαρτάται από τον οδηγό να καθορίσει τον χειρισμό περιορισμών μεταξύ των λέξεων-κλειδιών. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbinding](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbinding).

```cpp
class DocumentBinding : public Aspose::Page::XPS::XpsMetadata::Feature,
                        public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                        public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Nested classes

* Class [BindingGutter](./bindinggutter/)
* Class [BindingOption](./bindingoption/)
* Class [IBindingOptionItem](./ibindingoptionitem/)
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [DocumentBinding](./documentbinding/)(const System::ArrayPtr\<System::SharedPtr\<DocumentBinding::BindingOption\>\>\&) | Δημιουργεί μια νέα παρουσία. |
## Δείτε επίσης

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
