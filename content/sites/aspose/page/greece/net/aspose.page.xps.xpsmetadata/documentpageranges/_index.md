---
title: Class DocumentPageRanges
second_title: Aspose.Page για Αναφορά API .NET
description: Aspose.Page.XPS.XpsMetadata.DocumentPageRanges τάξη. Περιγράφει το εύρος εξόδου του εγγράφου σε σελίδες. Η τιμή της παραμέτρου πρέπει να συμμορφώνεται με την ακόλουθη δομή  PageRangeText PageRange ή PageRangePageRange PageRange PageNumber ή PageNumberPageNumber PageNumber όπου ο αριθμός Σελίδας N έως 1 σελίδες στο έγγραφο. Εάν Αριθμός Σελίδας  N τότε το Κενό διάστημα στη συμβολοσειρά θα πρέπει να αγνοηθεί. https//docs.microsoft.com/enus/windows/win32/printdocs/documentpageranges
type: docs
weight: 770
url: /el/net/aspose.page.xps.xpsmetadata/documentpageranges/
---
## DocumentPageRanges class

Περιγράφει το εύρος εξόδου του εγγράφου σε σελίδες. Η τιμή της παραμέτρου πρέπει να συμμορφώνεται με την ακόλουθη δομή: - PageRangeText: "PageRange" ή "PageRange,PageRange" -PageRange: "PageNumber" ή "PageNumber-PageNumber" -PageNumber, όπου ο αριθμός Σελίδας N έως 1: σελίδες στο έγγραφο. Εάν Αριθμός Σελίδας &gt; N, τότε το Κενό διάστημα στη συμβολοσειρά θα πρέπει να αγνοηθεί. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges

```csharp
public sealed class DocumentPageRanges : StringParameterInit, IDocumentPrintTicketItem, 
    IJobPrintTicketItem
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [DocumentPageRanges](documentpageranges/)(string) | Δημιουργεί μια νέα παρουσία. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| virtual [MaxLength](../../aspose.page.xps.xpsmetadata/stringparameterinit/maxlength/) { get; } | Για τιμές συμβολοσειράς, ορίζει τη μεγαλύτερη επιτρεπόμενη συμβολοσειρά. |
| virtual [MinLength](../../aspose.page.xps.xpsmetadata/stringparameterinit/minlength/) { get; } | Για τιμές συμβολοσειράς, ορίζει τη συντομότερη επιτρεπόμενη συμβολοσειρά. |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Παίρνει το όνομα του στοιχείου. |

### Δείτε επίσης

* class [StringParameterInit](../stringparameterinit/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* χώρος ονομάτων [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* συνέλευση [Aspose.Page](../../)


