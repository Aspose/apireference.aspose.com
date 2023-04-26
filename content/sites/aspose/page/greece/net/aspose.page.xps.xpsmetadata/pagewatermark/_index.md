---
title: Class PageWatermark
second_title: Aspose.Page για Αναφορά API .NET
description: Aspose.Page.XPS.XpsMetadata.PageWatermark τάξη. Περιγράφει τη ρύθμιση υδατογραφήματος της εξόδου και τα χαρακτηριστικά του υδατογραφήματος. Τα υδατογραφήματα apply στη λογική σελίδα όχι στη φυσική σελίδα. Για παράδειγμα εάνDocumentDuplex είναι ενεργοποιημένο θα εμφανιστεί ένα υδατογράφημα σε καθένα σελίδα σε κάθε φύλλο. ΑνDocumentDuplex  2 τότε κάθε φύλλο θα έχει 2 υδατογραφήματα. https//docs.microsoft.com/enus/windows/win32/printdocs/pagewatermark
type: docs
weight: 2650
url: /el/net/aspose.page.xps.xpsmetadata/pagewatermark/
---
## PageWatermark class

Περιγράφει τη ρύθμιση υδατογραφήματος της εξόδου και τα χαρακτηριστικά του υδατογραφήματος. Τα υδατογραφήματα apply στη λογική σελίδα, όχι στη φυσική σελίδα. Για παράδειγμα, εάν[`DocumentDuplex`](../documentduplex/) είναι ενεργοποιημένο, θα εμφανιστεί ένα υδατογράφημα σε καθένα σελίδα σε κάθε φύλλο. Αν[`DocumentDuplex`](../documentduplex/) , =2, τότε κάθε φύλλο θα έχει 2 υδατογραφήματα. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark

```csharp
NUp
```

```csharp
PagesPerSheet
```

```csharp
public sealed class PageWatermark : Feature, IDocumentPrintTicketItem, IJobPrintTicketItem, 
    IPagePrintTicketItem
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [PageWatermark](pagewatermark/)(params IPageWatermarkItem[]) | Δημιουργεί μια νέα παρουσία. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Παίρνει το όνομα του στοιχείου. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Προσθέτει μια λίστα στοιχείων στο τέλος της λίστας στοιχείων αυτής της δυνατότητας. Κάθε ένα πρέπει να είναι α[`Feature`](../feature/) , ένα[`Option`](../option/) ή α[`Property`](../property/) παράδειγμα. |

## Άλλα Μέλη

| Ονομα | Περιγραφή |
| --- | --- |
| interface [IPageWatermarkItem](pagewatermark.ipagewatermarkitem/) | Η διεπαφή οποιουδήποτε`PageWatermark` χαρακτηριστικό στοιχείο. |
| interface [IPageWatermarkOptionItem](pagewatermark.ipagewatermarkoptionitem/) | Η διεπαφή οποιουδήποτε[`PageWatermarkOption`](../pagewatermark.pagewatermarkoption/) στοιχείο. |
| class [Layering](pagewatermark.layering/) | Περιγράφει το εσωτερικό χαρακτηριστικό. Καθορίζει τη συμπεριφορά στρώσης του υδατογραφήματος. |
| class [LayeringOption](pagewatermark.layeringoption/) | Περιγράφει το[`Layering`](../pagewatermark.layering/) επιλογές χαρακτηριστικών. |
| class [PageWatermarkOption](pagewatermark.pagewatermarkoption/) | Περιγράφει το`PageWatermark` δυνατότητες επιλογές. |

### Δείτε επίσης

* class [Feature](../feature/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* interface [IPagePrintTicketItem](../ipageprintticketitem/)
* χώρος ονομάτων [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* συνέλευση [Aspose.Page](../../)


