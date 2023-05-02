---
title: Struct Point
second_title: Aspose.Drawing for .NET API Reference
description: System.Drawing.Point struct. Αντιπροσωπεύει ένα διατεταγμένο ζεύγος ακεραίων x και yσυντεταγμένων που ορίζει ένα σημείο σε ένα δισδιάστατο επίπεδο.
type: docs
weight: 930
url: /el/net/system.drawing/point/
---
## Point structure

Αντιπροσωπεύει ένα διατεταγμένο ζεύγος ακεραίων x- και y-συντεταγμένων που ορίζει ένα σημείο σε ένα δισδιάστατο επίπεδο.

```csharp
public struct Point : IEquatable<Point>
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [Point](point/#constructor)(int) | Αρχικοποιεί μια νέα παρουσία του`Point` δομή χρησιμοποιώντας συντεταγμένες που καθορίζονται από μια ακέραια τιμή. |
| [Point](point/#constructor_2)(Size) | Αρχικοποιεί μια νέα παρουσία του`Point` κατασκευάζω από α[`Size`](../size/) . |
| [Point](point/#constructor_1)(int, int) | Αρχικοποιεί μια νέα παρουσία του`Point` κατασκευή με τις καθορισμένες συντεταγμένες. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [IsEmpty](../../system.drawing/point/isempty/) { get; } | Λαμβάνει μια τιμή που υποδεικνύει αν αυτό είναιPoint είναι κενό. |
| [X](../../system.drawing/point/x/) { get; set; } | Λαμβάνει ή ορίζει τη συντεταγμένη x αυτού του Σημείου. |
| [Y](../../system.drawing/point/y/) { get; set; } | Λαμβάνει ή ορίζει τη συντεταγμένη y αυτού του Σημείου. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| static [Add](../../system.drawing/point/add/)(Point, Size) | Προσθέτει το καθορισμένοSize στο καθορισμένοPoint . |
| static [Ceiling](../../system.drawing/point/ceiling/)(PointF) | Μετατρέπει α[`PointF`](../pointf/) σε α`Point` εκτελώντας μια λειτουργία οροφής σε όλες τις συντεταγμένες. |
| static [Round](../../system.drawing/point/round/)(PointF) | Μετατρέπει το καθορισμένοPointF σε ένα σημείο σημείο στρογγυλοποιώντας τοPoint τιμές στον πλησιέστερο ακέραιο. |
| static [Subtract](../../system.drawing/point/subtract/)(Point, Size) | Μεταφράζει α`Point` από το αρνητικό ενός δεδομένου[`Size`](../size/) . |
| static [Truncate](../../system.drawing/point/truncate/)(PointF) | Μετατρέπει ένα PointF σε ένα σημείο εκτελώντας μια λειτουργία περικοπής σε όλες τις συντεταγμένες. |
| override [Equals](../../system.drawing/point/equals/#equals_1)(object) | Καθορίζει εάν αυτόPoint περιέχει τις ίδιες συντεταγμένες με τις καθορισμένεςObject . |
| [Equals](../../system.drawing/point/equals/#equals)(Point) | Ελέγχει εάν άλλο`Point` δομή έχει την ίδια θέση αυτού`Point` δομή. |
| override [GetHashCode](../../system.drawing/point/gethashcode/)() | Επιστρέφει έναν κωδικό κατακερματισμού για αυτόPoint . |
| [Offset](../../system.drawing/point/offset/#offset_1)(Point) | Μεταφράζει αυτόPoint από τα καθορισμέναPoint . |
| [Offset](../../system.drawing/point/offset/#offset)(int, int) | Μεταφράζει αυτόPoint κατά το καθορισμένο ποσό. |
| override [ToString](../../system.drawing/point/tostring/)() | Μετατρέπει τα χαρακτηριστικά αυτού`Point` σε μια συμβολοσειρά αναγνώσιμη από τον άνθρωπο. |
| [operator +](../../system.drawing/point/op_addition/) | Μεταφράζει α`Point` από ένα δεδομένο[`Size`](../size/) . |
| [operator ==](../../system.drawing/point/op_equality/) | Συγκρίνει δύοPoint αντικείμενα. Το αποτέλεσμα καθορίζει εάν οι τιμές τουX καιY ιδιότητες των δύοPoint τα αντικείμενα είναι ίσα. |
| [explicit operator](../../system.drawing/point/op_explicit/) | Δημιουργεί ένα[`Size`](../size/)με τις συντεταγμένες του καθορισμένου`Point` . |
| [implicit operator](../../system.drawing/point/op_implicit/) | Μετατρέπει το καθορισμένοPoint δομή σε αPointF δομή. |
| [operator !=](../../system.drawing/point/op_inequality/) | Συγκρίνει δύοPoint αντικείμενα. Το αποτέλεσμα καθορίζει εάν οι τιμές τουX ήY ιδιότητες των δύοPoint τα αντικείμενα είναι άνισα. |
| [operator -](../../system.drawing/point/op_subtraction/) | Μεταφράζει α`Point` από το αρνητικό ενός δεδομένου[`Size`](../size/) . |

## Πεδία

| Ονομα | Περιγραφή |
| --- | --- |
| static readonly [Empty](../../system.drawing/point/empty/) | Αντιπροσωπεύει αPoint που έχειX καιY τιμές ορίστηκαν στο μηδέν. |

### Δείτε επίσης

* χώρος ονομάτων [System.Drawing](../../system.drawing/)
* συνέλευση [Aspose.Drawing](../../)


