---
title: Class PageInputBin
second_title: Aspose.Page για Αναφορά API .NET
description: Aspose.Page.XPS.XpsMetadata.PageInputBin τάξη. Περιγράφει την εγκατεστημένη θήκη εισόδου σε μια συσκευή ή την πλήρη λίστα των υποστηριζόμενων δοχείων για μια συσκευή. Επιτρέπει την προδιαγραφή της θήκης εισόδου ανά σελίδα. οJobInputBin DocumentInputBin και PageInputBin οι λέξειςκλειδιά είναι αμοιβαία αποκλειόμενες. Και τα δύο δεν θα πρέπει να καθορίζονται ταυτόχρονα σε ένα έγγραφο PrintTicket ή Print Capabilities. https//docs.microsoft.com/enus/windows/win32/printdocs/pageinputbin
type: docs
weight: 2020
url: /el/net/aspose.page.xps.xpsmetadata/pageinputbin/
---
## PageInputBin class

Περιγράφει την εγκατεστημένη θήκη εισόδου σε μια συσκευή ή την πλήρη λίστα των υποστηριζόμενων δοχείων για μια συσκευή. Επιτρέπει την προδιαγραφή της θήκης εισόδου ανά σελίδα. ο[`JobInputBin`](../jobinputbin/) ,[`DocumentInputBin`](../documentinputbin/) και `PageInputBin` οι λέξεις-κλειδιά είναι αμοιβαία αποκλειόμενες. Και τα δύο δεν θα πρέπει να καθορίζονται ταυτόχρονα σε ένα έγγραφο PrintTicket ή Print Capabilities. https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin

```csharp
public sealed class PageInputBin : InputBin, IDocumentPrintTicketItem, IJobPrintTicketItem, 
    IPagePrintTicketItem
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [PageInputBin](pageinputbin/)(params IInputBinItem[]) | Δημιουργεί μια νέα παρουσία. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Παίρνει το όνομα του στοιχείου. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Προσθέτει μια λίστα στοιχείων στο τέλος της λίστας στοιχείων αυτής της δυνατότητας. Κάθε ένα πρέπει να είναι α[`Feature`](../feature/) , ένα[`Option`](../option/) ή α[`Property`](../property/) παράδειγμα. |

### Δείτε επίσης

* class [InputBin](../inputbin/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* interface [IPagePrintTicketItem](../ipageprintticketitem/)
* χώρος ονομάτων [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* συνέλευση [Aspose.Page](../../)


