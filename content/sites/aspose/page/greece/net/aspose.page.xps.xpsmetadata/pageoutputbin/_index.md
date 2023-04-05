---
title: Class PageOutputBin
second_title: Aspose.Page για Αναφορά API .NET
description: Aspose.Page.XPS.XpsMetadata.PageOutputBin τάξη. Περιγράφει την πλήρη λίστα των υποστηριζόμενων δοχείων για τη συσκευή. Επιτρέπει την προδιαγραφή του δίσκου εξόδου ανά σελίδα. ΤοJobOutputBin DocumentOutputBin καιPageOutputBin οι λέξειςκλειδιά are αλληλοαποκλείονται μόνο μία πρέπει να προσδιορίζεται σε ένα έγγραφο PrintTicket ή Print Capabilities. https//docs.microsoft.com/enus/windows/win32/printdocs/pageoutputbin
type: docs
weight: 2320
url: /el/net/aspose.page.xps.xpsmetadata/pageoutputbin/
---
## PageOutputBin class

Περιγράφει την πλήρη λίστα των υποστηριζόμενων δοχείων για τη συσκευή. Επιτρέπει την προδιαγραφή του δίσκου εξόδου ανά σελίδα. Το[`JobOutputBin`](../joboutputbin/) ,[`DocumentOutputBin`](../documentoutputbin/) και`PageOutputBin` οι λέξεις-κλειδιά are αλληλοαποκλείονται μόνο μία πρέπει να προσδιορίζεται σε ένα έγγραφο PrintTicket ή Print Capabilities. https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputbin

```csharp
public sealed class PageOutputBin : OutputBin, IDocumentPrintTicketItem, IJobPrintTicketItem, 
    IPagePrintTicketItem
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [PageOutputBin](pageoutputbin/)(params IOutputBinItem[]) | Δημιουργεί μια νέα παρουσία. |

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
* interface [IPagePrintTicketItem](../ipageprintticketitem/)
* χώρος ονομάτων [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* συνέλευση [Aspose.Page](../../)


