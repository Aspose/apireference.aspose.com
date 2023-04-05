---
title: Class DocumentOutputBin
second_title: Aspose.Page για Αναφορά API .NET
description: Aspose.Page.XPS.XpsMetadata.DocumentOutputBin τάξη. Περιγράφει την πλήρη λίστα των υποστηριζόμενων δοχείων για τη συσκευή. Επιτρέπει την προδιαγραφή του output bin σε βάση ανά έγγραφο. οJobOutputBin DocumentOutputBin και PageOutputBin οι λέξειςκλειδιά είναι αμοιβαία αποκλειόμενες μόνο μία πρέπει να προσδιορίζεται σε ένα έγγραφο PrintTicket ή Print Capabilities. https//docs.microsoft.com/enus/windows/win32/printdocs/documentoutputbin
type: docs
weight: 760
url: /el/net/aspose.page.xps.xpsmetadata/documentoutputbin/
---
## DocumentOutputBin class

Περιγράφει την πλήρη λίστα των υποστηριζόμενων δοχείων για τη συσκευή. Επιτρέπει την προδιαγραφή του output bin σε βάση ανά έγγραφο. ο[`JobOutputBin`](../joboutputbin/) ,`DocumentOutputBin` και [`PageOutputBin`](../pageoutputbin/) οι λέξεις-κλειδιά είναι αμοιβαία αποκλειόμενες μόνο μία πρέπει να προσδιορίζεται σε ένα έγγραφο PrintTicket ή Print Capabilities. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentoutputbin

```csharp
public sealed class DocumentOutputBin : OutputBin, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [DocumentOutputBin](documentoutputbin/)(params IOutputBinItem[]) | Δημιουργεί μια νέα παρουσία. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Παίρνει το όνομα του στοιχείου. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Προσθέτει μια λίστα στοιχείων στο τέλος της λίστας στοιχείων αυτής της δυνατότητας. Κάθε ένα πρέπει να είναι α[`Feature`](../feature/) , ένα[`Option`](../option/) ή α[`Property`](../property/) παράδειγμα. |

### Δείτε επίσης

* class [OutputBin](../outputbin/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* χώρος ονομάτων [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* συνέλευση [Aspose.Page](../../)


