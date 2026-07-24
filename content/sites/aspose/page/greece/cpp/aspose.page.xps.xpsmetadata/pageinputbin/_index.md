---
title: "Aspose::Page::XPS::XpsMetadata::PageInputBin κλάση"
linktitle: "PageInputBin"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::XPS::XpsMetadata::PageInputBin κλάση. Περιγράφει το εγκατεστημένο input bin σε μια συσκευή ή τη πλήρη λίστα των υποστηριζόμενων bins για μια συσκευή. Επιτρέπει τον καθορισμό του input bin ανά σελίδα. Οι λέξεις-κλειδιά JobInputBin, DocumentInputBin και PageInputBin είναι αμοιβαία αποκλειστικές. Δεν πρέπει να καθορίζονται ταυτόχρονα σε ένα [PrintTicket](../printticket/) ή σε έγγραφο Print Capabilities.  σε C++."
type: docs
weight: 10000
url: /el/cpp/aspose.page.xps.xpsmetadata/pageinputbin/
---
## PageInputBin class


Περιγράφει το εγκατεστημένο input bin σε μια συσκευή ή τη πλήρη λίστα των υποστηριζόμενων bins για μια συσκευή. Επιτρέπει τον καθορισμό του input bin ανά σελίδα. Οι λέξεις-κλειδιά [JobInputBin](../jobinputbin/), [DocumentInputBin](../documentinputbin/) και [PageInputBin](./) είναι αμοιβαία αποκλειστικές. Δεν πρέπει να καθορίζονται ταυτόχρονα σε ένα [PrintTicket](../printticket/) ή σε έγγραφο Print Capabilities. [https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin).

```cpp
class PageInputBin : public Aspose::Page::XPS::XpsMetadata::InputBin,
                     public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                     public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem,
                     public Aspose::Page::XPS::XpsMetadata::IPagePrintTicketItem
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [PageInputBin](./pageinputbin/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinItem\>\>\&) | Δημιουργεί μια νέα παρουσία. |
## Δείτε επίσης

* Class [InputBin](../inputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
