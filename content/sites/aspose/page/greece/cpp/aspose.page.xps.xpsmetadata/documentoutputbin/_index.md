---
title: "Aspose::Page::XPS::XpsMetadata::DocumentOutputBin class"
linktitle: "DocumentOutputBin"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentOutputBin class. Περιγράφει τη πλήρη λίστα των υποστηριζόμενων θάλαμων για τη συσκευή. Επιτρέπει τον καθορισμό της θάλαμης εξόδου ανά έγγραφο. Οι λέξεις-κλειδιά JobOutputBin, DocumentOutputBin και PageOutputBin είναι αμοιβαία αποκλειστικές· πρέπει να καθορίζεται μόνο μία σε ένα έγγραφο PrintTicket ή Print Capabilities.  σε C++."
type: docs
weight: 2100
url: /el/cpp/aspose.page.xps.xpsmetadata/documentoutputbin/
---
## DocumentOutputBin class


Περιγράφει τη πλήρη λίστα των υποστηριζόμενων θάλαμων για τη συσκευή. Επιτρέπει τον καθορισμό της θάλαμης εξόδου ανά έγγραφο. Οι λέξεις-κλειδιά [JobOutputBin](../joboutputbin/), [DocumentOutputBin](./) και [PageOutputBin](../pageoutputbin/) είναι αμοιβαία αποκλειστικές· πρέπει να καθορίζεται μόνο μία σε ένα έγγραφο [PrintTicket](../printticket/) ή Print Capabilities. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentoutputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentoutputbin).

```cpp
class DocumentOutputBin : public Aspose::Page::XPS::XpsMetadata::OutputBin,
                          public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                          public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [DocumentOutputBin](./documentoutputbin/)(const System::ArrayPtr\<System::SharedPtr\<OutputBin::IOutputBinItem\>\>\&) | Δημιουργεί μια νέα παρουσία. |
## Δείτε επίσης

* Class [OutputBin](../outputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
