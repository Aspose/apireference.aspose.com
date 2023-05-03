---
title: Class StringFormat
second_title: Aspose.Drawing for .NET API Reference
description: System.Drawing.StringFormat τάξη. Ενθυλακώνει πληροφορίες διάταξης κειμένου όπως ευθυγράμμιση προσανατολισμός και στάσεις καρτελών χειρισμούς εμφάνισης όπως εισαγωγή έλλειψης και αντικατάσταση εθνικών ψηφίων και λειτουργίες OpenType. Αυτή η κλάση δεν μπορεί να κληρονομηθεί.
type: docs
weight: 1130
url: /el/net/system.drawing/stringformat/
---
## StringFormat class

Ενθυλακώνει πληροφορίες διάταξης κειμένου (όπως ευθυγράμμιση, προσανατολισμός και στάσεις καρτελών) χειρισμούς εμφάνισης (όπως εισαγωγή έλλειψης και αντικατάσταση εθνικών ψηφίων) και λειτουργίες OpenType. Αυτή η κλάση δεν μπορεί να κληρονομηθεί.

```csharp
public sealed class StringFormat : IDisposable
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [StringFormat](stringformat/#constructor)() | Αρχικοποιεί μια νέα παρουσία του`StringFormat` τάξη. |
| [StringFormat](stringformat/#constructor_1)(StringFormat) | Αρχικοποιεί μια νέα παρουσία του`StringFormat` class από το καθορισμένο υπάρχονStringFormat αντικείμενο. |
| [StringFormat](stringformat/#constructor_2)(StringFormatFlags) | Αρχικοποιεί μια νέα παρουσία του`StringFormat`κλάση με το specified StringFormatFlags απαρίθμηση. |
| [StringFormat](stringformat/#constructor_3)(StringFormatFlags, int) | Αρχικοποιεί μια νέα παρουσία του`StringFormat` τάξη με τα καθορισμένα[`StringFormatFlags`](../stringformatflags/) απαρίθμηση και γλώσσα. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| static [GenericDefault](../../system.drawing/stringformat/genericdefault/) { get; } | Λαμβάνει μια γενική προεπιλογήStringFormat αντικείμενο. |
| static [GenericTypographic](../../system.drawing/stringformat/generictypographic/) { get; } | Λαμβάνει ένα γενικό τυπογραφικόStringFormat αντικείμενο. |
| [Alignment](../../system.drawing/stringformat/alignment/) { get; set; } | Λαμβάνει ή ορίζει πληροφορίες στοίχισης κειμένου στο κατακόρυφο επίπεδο. |
| [DigitSubstitutionLanguage](../../system.drawing/stringformat/digitsubstitutionlanguage/) { get; } | Λαμβάνει τη γλώσσα που χρησιμοποιείται όταν τα δυτικά ψηφία αντικαθιστούν τα τοπικά ψηφία. |
| [DigitSubstitutionMethod](../../system.drawing/stringformat/digitsubstitutionmethod/) { get; } | Λαμβάνει τη μέθοδο που θα χρησιμοποιηθεί για την αντικατάσταση ψηφίου. |
| [FormatFlags](../../system.drawing/stringformat/formatflags/) { get; set; } | Λαμβάνει ή ορίζει αStringFormatFlags απαρίθμηση που περιέχει πληροφορίες μορφοποίησης. |
| [HotkeyPrefix](../../system.drawing/stringformat/hotkeyprefix/) { get; set; } | Λαμβάνει ή ορίζει τοHotkeyPrefixαντικείμενο για αυτόStringFormat αντικείμενο. |
| [LineAlignment](../../system.drawing/stringformat/linealignment/) { get; set; } | Λαμβάνει ή ορίζει τη στοίχιση γραμμής στο οριζόντιο επίπεδο. |
| [Trimming](../../system.drawing/stringformat/trimming/) { get; set; } | Λαμβάνει ή ορίζει τοStringTrimming απαρίθμηση για αυτόStringFormat αντικείμενο. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [Clone](../../system.drawing/stringformat/clone/)() | Δημιουργεί ένα ακριβές αντίγραφο αυτού`StringFormat` αντικείμενο. |
| [Dispose](../../system.drawing/stringformat/dispose/)() | Απελευθερώνει όλους τους πόρους που χρησιμοποιούνται από αυτόStringFormat αντικείμενο. |
| [GetTabStops](../../system.drawing/stringformat/gettabstops/)(out float) | Παίρνει τις καρτέλες για αυτόStringFormat αντικείμενο. |
| [SetDigitSubstitution](../../system.drawing/stringformat/setdigitsubstitution/)(int, StringDigitSubstitute) | Καθορίζει τη γλώσσα και τη μέθοδο που θα χρησιμοποιηθεί όταν τα δυτικά ψηφία αντικαθιστούν τα τοπικά ψηφία. |
| [SetMeasurableCharacterRanges](../../system.drawing/stringformat/setmeasurablecharacterranges/)(CharacterRange[]) | Καθορίζει έναν πίνακα απόCharacterRange δομές που αντιπροσωπεύουν το εύρος των χαρακτήρων που μετρώνται με μια κλήση στοMeasureCharacterRanges μέθοδος. |
| [SetTabStops](../../system.drawing/stringformat/settabstops/)(float, float[]) | Ορίζει θέσεις καρτελών για αυτόStringFormat αντικείμενο. |

### Δείτε επίσης

* χώρος ονομάτων [System.Drawing](../../system.drawing/)
* συνέλευση [Aspose.Drawing](../../)


