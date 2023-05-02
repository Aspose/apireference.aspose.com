---
title: StringFormat.SetDigitSubstitution
second_title: Aspose.Drawing for .NET API Reference
description: StringFormat μέθοδος. Καθορίζει τη γλώσσα και τη μέθοδο που θα χρησιμοποιηθεί όταν τα δυτικά ψηφία αντικαθιστούν τα τοπικά ψηφία.
type: docs
weight: 140
url: /el/net/system.drawing/stringformat/setdigitsubstitution/
---
## StringFormat.SetDigitSubstitution method

Καθορίζει τη γλώσσα και τη μέθοδο που θα χρησιμοποιηθεί όταν τα δυτικά ψηφία αντικαθιστούν τα τοπικά ψηφία.

```csharp
public void SetDigitSubstitution(int language, StringDigitSubstitute substitute)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| language | Int32 | Ένα αναγνωριστικό γλώσσας National Language Support (NLS) που προσδιορίζει τη γλώσσα που θα χρησιμοποιηθεί όταν τα δυτικά ψηφία αντικαθιστούν τα τοπικά ψηφία. Μπορείτε να περάσετε τοLCID ιδιοκτησία του a CultureInfo αντικείμενο ως αναγνωριστικό γλώσσας NLS. Για παράδειγμα, ας υποθέσουμε ότι δημιουργήσατε έναCultureInfo αντικείμενο by περνώντας τη συμβολοσειρά`"ar-EG"` σε αCultureInfo κατασκευαστής. Αν περάσετε τοLCID ιδιότητα του that CultureInfo αντικείμενο μαζί με Traditional στο Int32,StringDigitSubstitute) μέθοδος, τότε τα δυτικά ψηφία θα αντικατασταθούν με τα δυτικά ψηφία κατά την εμφάνιση. |
| substitute | StringDigitSubstitute | Ένα στοιχείο τουStringDigitSubstitute απαρίθμηση που καθορίζει πώς εμφανίζονται τα ψηφία. |

### Δείτε επίσης

* enum [StringDigitSubstitute](../../stringdigitsubstitute/)
* class [StringFormat](../)
* χώρος ονομάτων [System.Drawing](../../stringformat/)
* συνέλευση [Aspose.Drawing](../../../)


