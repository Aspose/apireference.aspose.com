---
title: "Aspose::Page::XPS::XpsMetadata::PageOutputBin class"
linktitle: "PageOutputBin"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::XPS::XpsMetadata::PageOutputBin class. Περιγράφει την πλήρη λίστα των υποστηριζόμενων κουβάδων για τη συσκευή. Επιτρέπει τον καθορισμό του κουβά εξόδου ανά σελίδα. Οι λέξεις-κλειδιά JobOutputBin, DocumentOutputBin και PageOutputBin είναι αμοιβαία αποκλειστικές· πρέπει να καθορίζεται μόνο μία σε ένα έγγραφο PrintTicket ή Print Capabilities.  σε C++."
type: docs
weight: 11400
url: /el/cpp/aspose.page.xps.xpsmetadata/pageoutputbin/
---
## PageOutputBin class


Περιγράφει την πλήρη λίστα των υποστηριζόμενων κουβάδων για τη συσκευή. Επιτρέπει τον καθορισμό του κουβά εξόδου ανά σελίδα. Οι λέξεις-κλειδιά [JobOutputBin](../joboutputbin/), [DocumentOutputBin](../documentoutputbin/) και [PageOutputBin](./) είναι αμοιβαία αποκλειστικές· πρέπει να καθορίζεται μόνο μία σε ένα έγγραφο [PrintTicket](../printticket/) ή Print Capabilities. [https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputbin).

```cpp
class PageOutputBin : public Aspose::Page::XPS::XpsMetadata::OutputBin,
                      public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                      public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem,
                      public Aspose::Page::XPS::XpsMetadata::IPagePrintTicketItem
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [PageOutputBin](./pageoutputbin/)(const System::ArrayPtr\<System::SharedPtr\<OutputBin::IOutputBinItem\>\>\&) | Δημιουργεί μια νέα παρουσία. |
## Δείτε επίσης

* Class [OutputBin](../outputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
