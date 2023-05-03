---
title: Class Icon
second_title: Aspose.Drawing for .NET API Reference
description: System.Drawing.Icon τάξη. Αντιπροσωπεύει ένα εικονίδιο των Windows το οποίο είναι μια μικρή εικόνα bitmap που χρησιμοποιείται για την αναπαράσταση ενός αντικειμένου. Τα εικονίδια μπορούν να θεωρηθούν ως διαφανή bitmaps αν και το μέγεθός τους καθορίζεται από το σύστημα.
type: docs
weight: 570
url: /el/net/system.drawing/icon/
---
## Icon class

Αντιπροσωπεύει ένα εικονίδιο των Windows, το οποίο είναι μια μικρή εικόνα bitmap που χρησιμοποιείται για την αναπαράσταση ενός αντικειμένου. Τα εικονίδια μπορούν να θεωρηθούν ως διαφανή bitmaps, αν και το μέγεθός τους καθορίζεται από το σύστημα.

```csharp
public sealed class Icon : ICloneable, IDisposable, ISerializable
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [Icon](icon/#constructor_2)(Stream) | Αρχικοποιεί μια νέα παρουσία του`Icon` κλάση από την καθορισμένη ροή δεδομένων. |
| [Icon](icon/#constructor_5)(string) | Αρχικοποιεί μια νέα παρουσία του`Icon` κλάση από το καθορισμένο όνομα αρχείου. |
| [Icon](icon/#constructor_1)(Icon, Size) | Αρχικοποιεί μια νέα παρουσία του`Icon` τάξη και προσπαθεί να βρει μια έκδοση του εικονιδίου που ταιριάζει με το ζητούμενο μέγεθος. |
| [Icon](icon/#constructor_4)(Stream, Size) | Αρχικοποιεί μια νέα παρουσία του`Icon` κλάση του καθορισμένου μεγέθους από την καθορισμένη ροή. |
| [Icon](icon/#constructor_7)(string, Size) | Αρχικοποιεί μια νέα παρουσία του`Icon` κλάση του καθορισμένου μεγέθους από το καθορισμένο αρχείο. |
| [Icon](icon/#constructor_8)(Type, string) | Αρχικοποιεί μια νέα παρουσία του`Icon` κλάση από έναν πόρο στο καθορισμένο συγκρότημα. |
| [Icon](icon/#constructor)(Icon, int, int) | Αρχικοποιεί μια νέα παρουσία του`Icon` τάξη και προσπαθεί να βρει μια έκδοση του εικονιδίου που ταιριάζει με το ζητούμενο μέγεθος.. |
| [Icon](icon/#constructor_3)(Stream, int, int) | Αρχικοποιεί μια νέα παρουσία του`Icon` κλάση από την καθορισμένη ροή δεδομένων και με το καθορισμένο πλάτος και ύψος. |
| [Icon](icon/#constructor_6)(string, int, int) | Αρχικοποιεί μια νέα παρουσία του`Icon` κλάση με το καθορισμένο πλάτος και ύψος από το καθορισμένο αρχείο. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [Handle](../../system.drawing/icon/handle/) { get; } | Παίρνει τη λαβή για αυτόIcon . Αυτό δεν είναι αντίγραφο της λαβής. μην το ελευθερώσεις. |
| [Height](../../system.drawing/icon/height/) { get; } | Παίρνει το ύψος αυτούIcon . |
| [Size](../../system.drawing/icon/size/) { get; } | Παίρνει το μέγεθος αυτούIcon . |
| [Width](../../system.drawing/icon/width/) { get; } | Λαμβάνει το πλάτος αυτούIcon . |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| static [ExtractAssociatedIcon](../../system.drawing/icon/extractassociatedicon/)(string) | Επιστρέφει μια αναπαράσταση εικονιδίου μιας εικόνας που περιέχεται στο καθορισμένο αρχείο. |
| static [FromHandle](../../system.drawing/icon/fromhandle/)(IntPtr) | Δημιουργεί ένα GDI+Icon από την καθορισμένη λαβή των Windows σε ένα εικονίδιο (HICON). |
| [Clone](../../system.drawing/icon/clone/)() | Κλωνοποιεί τοIcon , δημιουργώντας μια διπλή εικόνα. |
| [Dispose](../../system.drawing/icon/dispose/)() | Εκτελεί εργασίες που καθορίζονται από την εφαρμογή που σχετίζονται με την απελευθέρωση, την απελευθέρωση ή την επαναφορά μη διαχειριζόμενων πόρων. |
| [Save](../../system.drawing/icon/save/)(Stream) | Αποθηκεύει αυτόIcon στην καθορισμένη έξοδοStream . |
| [ToBitmap](../../system.drawing/icon/tobitmap/)() | Μετατρέπει αυτόIcon σε ένα GDI+Bitmap . |
| override [ToString](../../system.drawing/icon/tostring/)() | Λαμβάνει μια συμβολοσειρά αναγνώσιμη από τον άνθρωπο που περιγράφει τοIcon . |

### Δείτε επίσης

* χώρος ονομάτων [System.Drawing](../../system.drawing/)
* συνέλευση [Aspose.Drawing](../../)


