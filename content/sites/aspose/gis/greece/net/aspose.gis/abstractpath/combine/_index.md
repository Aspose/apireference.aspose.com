---
title: AbstractPath.Combine
second_title: Αναφορά Aspose.GIS για .NET API
description: AbstractPath μέθοδος. Συνδυάζει αυτόAbstractPath με καθορισμένα στοιχεία διαδρομής.
type: docs
weight: 50
url: /el/net/aspose.gis/abstractpath/combine/
---
## AbstractPath.Combine method

Συνδυάζει αυτό[`AbstractPath`](../) με καθορισμένα στοιχεία διαδρομής.

```csharp
public virtual AbstractPath Combine(string location)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| location | String | Ένα στοιχείο διαδρομής που πρέπει να προσαρτηθεί σε αυτό[`AbstractPath`](../). |

### Επιστρεφόμενη Αξία

Ένα νέο[`AbstractPath`](../) δείχνοντας σε α[`Location`](../location/) που είναι ένας συνδυασμός τοποθεσιών αυτού[`AbstractPath`](../)και το όρισμα.

### Παρατηρήσεις

Συνήθως αυτή η μέθοδος δεν πρέπει να παρακαμφθεί από κάποιον κληρονόμο. Η προεπιλεγμένη υλοποίηση το συνδυάζει[`Location`](../location/) με το επιχείρημα και καλεί το[`WithLocation`](../withlocation/) Η μέθοδος με τη συνενωμένη συμβολοσειρά ως όρισμα. Το αποτέλεσμα συνδυασμού ορίζεται με τον ακόλουθο τρόπο:  Αν το επιχείρημα ξεκινά με το[`Separator`](../separator/), το αποτέλεσμα του συνδυασμού ισούται με το όρισμα. Διαφορετικά, εάν[`Location`](../location/) τελειώνει με το[`Separator`](../separator/) , το αποτέλεσμα του συνδυασμού ισούται με` +`; Διαφορετικά, το αποτέλεσμα είναι ίσο με` + +`

### Δείτε επίσης

* class [AbstractPath](../)
* χώρος ονομάτων [Aspose.Gis](../../abstractpath/)
* συνέλευση [Aspose.GIS](../../../)


