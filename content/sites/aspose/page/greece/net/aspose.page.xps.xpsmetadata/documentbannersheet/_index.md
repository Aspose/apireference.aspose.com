---
title: Class DocumentBannerSheet
second_title: Aspose.Page για Αναφορά API .NET
description: Aspose.Page.XPS.XpsMetadata.DocumentBannerSheet τάξη. Περιγράφει το φύλλο banner που θα εξάγεται για ένα συγκεκριμένο έγγραφο. Το φύλλο banner θα πρέπει να βγαίνει στο default PageMediaSize και χρησιμοποιώντας την προεπιλογήPageMediaType . Το φύλλο banner θα πρέπει να είναι επίσης απομονωμένο από το υπόλοιπο της εργασίας. Αυτό σημαίνει ότι τυχόν επιλογές φινιρίσματος ή επεξεργασίας όπως DocumentDuplex DocumentStaple  ήDocumentBinding δεν πρέπει να περιλαμβάνει το φύλλο banner. Το φύλλο banner μπορεί να είναι ή να μην είναι απομονωμένο από την υπόλοιπη εργασία. Αυτό σημαίνει ότι οποιαδήποτε επιλογή ολοκλήρωσης ή επεξεργασίας εργασίας μπορεί να περιλαμβάνει το φύλλο banner εγγράφου. Το φύλλο banner πρέπει να εμφανίζεται ως το πρώτο φύλλο του εγγράφου. https //docs.microsoft.com/enus/windows/win32/printdocs/documentbannersheet
type: docs
weight: 540
url: /el/net/aspose.page.xps.xpsmetadata/documentbannersheet/
---
## DocumentBannerSheet class

Περιγράφει το φύλλο banner που θα εξάγεται για ένα συγκεκριμένο έγγραφο. Το φύλλο banner θα πρέπει να βγαίνει στο default [`PageMediaSize`](../pagemediasize/) και χρησιμοποιώντας την προεπιλογή[`PageMediaType`](../pagemediatype/) . Το φύλλο banner θα πρέπει να είναι επίσης απομονωμένο από το υπόλοιπο της εργασίας. Αυτό σημαίνει ότι τυχόν επιλογές φινιρίσματος ή επεξεργασίας (όπως [`DocumentDuplex`](../documentduplex/) ,[`DocumentStaple`](../documentstaple/) , ή[`DocumentBinding`](../documentbinding/)) δεν πρέπει να περιλαμβάνει το φύλλο banner. Το φύλλο banner μπορεί να είναι ή να μην είναι απομονωμένο από την υπόλοιπη εργασία. Αυτό σημαίνει ότι οποιαδήποτε επιλογή ολοκλήρωσης ή επεξεργασίας εργασίας μπορεί να περιλαμβάνει το φύλλο banner εγγράφου. Το φύλλο banner πρέπει να εμφανίζεται ως το πρώτο φύλλο του εγγράφου. https ://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet

```csharp
public sealed class DocumentBannerSheet : Feature, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [DocumentBannerSheet](documentbannersheet/)(params BannerSheetOption[]) | Δημιουργεί μια νέα παρουσία. |

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
| class [BannerSheetOption](documentbannersheet.bannersheetoption/) | Αντιπροσωπεύει επιλογές του`DocumentBannerSheet` χαρακτηριστικό. |

### Δείτε επίσης

* class [Feature](../feature/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* χώρος ονομάτων [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* συνέλευση [Aspose.Page](../../)


