---
title: Interface ITrueTypeFont
second_title: Aspose.SVG για Αναφορά API .NET
description: Aspose.Svg.Drawing.ITrueTypeFont διεπαφή. Δηλώνει μεθόδους εργασίας με γραμματοσειρά TrueType.
type: docs
weight: 1510
url: /el/net/aspose.svg.drawing/itruetypefont/
---
## ITrueTypeFont interface

Δηλώνει μεθόδους εργασίας με γραμματοσειρά TrueType.

```csharp
public interface ITrueTypeFont
```

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [DataSize](../../aspose.svg.drawing/itruetypefont/datasize/) { get; } | Επιστρέφει το μέγεθος των δεδομένων γραμματοσειράς σε bytes |
| [FamilyName](../../aspose.svg.drawing/itruetypefont/familyname/) { get; } | Λάβετε το όνομα της οικογένειας γραμματοσειρών. |
| [FullFontName](../../aspose.svg.drawing/itruetypefont/fullfontname/) { get; } | Αυτό θα πρέπει να είναι ένας συνδυασμός του "FamilyName" και του "SubFamilyName". Εξαίρεση: εάν η γραμματοσειρά είναι "Κανονική" όπως υποδεικνύεται στο "SubFamilyName", τότε χρησιμοποιήστε μόνο το οικογενειακό όνομα που περιέχεται στο "FamilyName". Μια εξαίρεση στον παραπάνω ορισμό του ονόματος πλήρους γραμματοσειράς είναι για τις συμβολοσειρές πλατφόρμας Microsoft για γραμματοσειρές CFF OpenType: σε αυτήν την περίπτωση, η συμβολοσειρά ονόματος πλήρους γραμματοσειράς πρέπει να είναι πανομοιότυπη με τη συμβολοσειρά ονόματος γραμματοσειράς PostScript στο Όνομα CFF INDEX. |
| [SubFamilyName](../../aspose.svg.drawing/itruetypefont/subfamilyname/) { get; } | Το όνομα της υποοικογένειας γραμματοσειράς διακρίνει τη γραμματοσειρά σε μια ομάδα με το ίδιο όνομα οικογένειας γραμματοσειράς. Υποτίθεται ότι αφορά το στυλ (πλάγια, πλάγια) και το βάρος (ανοιχτό, τολμηρό, μαύρο, κ.λπ.). Μια γραμματοσειρά χωρίς ιδιαίτερες διαφορές στο βάρος ή το στυλ (π.χ. μεσαίο βάρος, όχι πλάγιο και σύνολο fsSelection bit 6) θα πρέπει να έχει αποθηκευμένη τη συμβολοσειρά "Regular" σε αυτή τη θέση. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [GetAscent](../../aspose.svg.drawing/itruetypefont/getascent/)(float) | Επιστρέφει την ανάβαση, σε πόντους. |
| [GetData](../../aspose.svg.drawing/itruetypefont/getdata/)() | Ανοίξτε τη ροή με δεδομένα γραμματοσειράς. Ο καλών είναι υπεύθυνος για την απόρριψη της ροής. |
| [GetDescent](../../aspose.svg.drawing/itruetypefont/getdescent/)(float) | Επιστρέφει την κάθοδο, σε πόντους. |

### Δείτε επίσης

* χώρος ονομάτων [Aspose.Svg.Drawing](../../aspose.svg.drawing/)
* συνέλευση [Aspose.SVG](../../)


