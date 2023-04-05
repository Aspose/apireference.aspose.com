---
title: Class JobErrorSheet
second_title: Aspose.Page για Αναφορά API .NET
description: Aspose.Page.XPS.XpsMetadata.JobErrorSheet τάξη. Περιγράφει την έξοδο του φύλλου σφάλματος. Ολόκληρη η εργασία θα έχει ένα μόνο φύλλο σφαλμάτων. Το φύλλο σφάλματος θα πρέπει να βγαίνει στην προεπιλογήPageMediaSize και χρησιμοποιώντας την προεπιλογήPageMediaType . Το φύλλο σφάλματος πρέπει να απομονωθεί από την υπόλοιπη εργασία. Αυτό σημαίνει ότι τυχόν επιλογές επεξεργασίας φινιρίσματος ή όπως   ή  δεν πρέπει να περιλαμβάνει το φύλλο σφαλμάτων. Το φύλλο σφάλματος θα πρέπει να εμφανίζεται ως το τελικό φύλλο της εργασίας. https//docs.microsoft.com/enus/windows/win32/printdocs/joberrorsheet
type: docs
weight: 1290
url: /el/net/aspose.page.xps.xpsmetadata/joberrorsheet/
---
## JobErrorSheet class

Περιγράφει την έξοδο του φύλλου σφάλματος. Ολόκληρη η εργασία θα έχει ένα μόνο φύλλο σφαλμάτων. Το φύλλο σφάλματος θα πρέπει να βγαίνει στην προεπιλογή[`PageMediaSize`](../pagemediasize/) και χρησιμοποιώντας την προεπιλογή[`PageMediaType`](../pagemediatype/) . Το φύλλο σφάλματος πρέπει να απομονωθεί από την υπόλοιπη εργασία. Αυτό σημαίνει ότι τυχόν επιλογές επεξεργασίας φινιρίσματος ή (όπως , , ή ) δεν πρέπει να περιλαμβάνει το φύλλο σφαλμάτων. Το φύλλο σφάλματος θα πρέπει να εμφανίζεται ως το τελικό φύλλο της εργασίας. https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet

```csharp
JobDuplex
```

```csharp
JobStaple
```

```csharp
JobBinding
```

```csharp
public sealed class JobErrorSheet : Feature, IJobPrintTicketItem
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [JobErrorSheet](joberrorsheet/)(params IJobErrorSheetItem[]) | Δημιουργεί μια νέα παρουσία. |

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
| class [ErrorSheetOption](joberrorsheet.errorsheetoption/) | Περιγράφει το`JobErrorSheet` επιλογές χαρακτηριστικών. |
| class [ErrorSheetWhen](joberrorsheet.errorsheetwhen/) | Περιγράφει το εσωτερικό χαρακτηριστικό. |
| interface [IJobErrorSheetItem](joberrorsheet.ijoberrorsheetitem/) | Η διεπαφή οποιουδήποτε`JobErrorSheet` χαρακτηριστικό στοιχείο. |

### Δείτε επίσης

* class [Feature](../feature/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* χώρος ονομάτων [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* συνέλευση [Aspose.Page](../../)


