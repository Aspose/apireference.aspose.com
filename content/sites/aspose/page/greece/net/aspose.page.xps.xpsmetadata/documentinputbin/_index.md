---
title: Class DocumentInputBin
second_title: Aspose.Page για Αναφορά API .NET
description: Aspose.Page.XPS.XpsMetadata.DocumentInputBin τάξη. Περιγράφει τον εγκατεστημένο κάδο εισόδου σε μια συσκευή ή την πλήρη λίστα των υποστηριζόμενων δοχείων για μια συσκευή. ΤοJobInputBin DocumentInputBin  καιPageInputBin Οι λέξειςκλειδιά είναι αμοιβαία αποκλειόμενες. Και τα δύο δεν πρέπει να καθορίζονται ταυτόχρονα σε ένα έγγραφο PrintTicket ή Print Capabilities. https//docs.microsoft.com/enus/windows/win32/printdocs/documentinputbin
type: docs
weight: 740
url: /el/net/aspose.page.xps.xpsmetadata/documentinputbin/
---
## DocumentInputBin class

Περιγράφει τον εγκατεστημένο κάδο εισόδου σε μια συσκευή ή την πλήρη λίστα των υποστηριζόμενων δοχείων για μια συσκευή. Το[`JobInputBin`](../jobinputbin/) ,`DocumentInputBin` , και[`PageInputBin`](../pageinputbin/) Οι λέξεις-κλειδιά είναι αμοιβαία αποκλειόμενες. Και τα δύο δεν πρέπει να καθορίζονται ταυτόχρονα σε ένα έγγραφο PrintTicket ή Print Capabilities. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentinputbin

```csharp
public sealed class DocumentInputBin : InputBin, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [DocumentInputBin](documentinputbin/)(params IInputBinItem[]) | Δημιουργεί μια νέα παρουσία. |

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
* χώρος ονομάτων [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* συνέλευση [Aspose.Page](../../)


