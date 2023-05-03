---
title: Struct Size
second_title: Aspose.Drawing for .NET API Reference
description: System.Drawing.Size struct. Αποθηκεύει ένα ταξινομημένο ζεύγος ακεραίων συνήθως το πλάτος και το ύψος ενός ορθογωνίου.
type: docs
weight: 1080
url: /el/net/system.drawing/size/
---
## Size structure

Αποθηκεύει ένα ταξινομημένο ζεύγος ακεραίων, συνήθως το πλάτος και το ύψος ενός ορθογωνίου.

```csharp
public struct Size : IEquatable<Size>
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [Size](size/#constructor_1)(Point) | Αρχικοποιεί μια νέα παρουσία του`Size` struct από το καθορισμένοPoint . |
| [Size](size/#constructor)(int, int) | Αρχικοποιεί μια νέα παρουσία του`Size` κατασκευή από τις καθορισμένες διαστάσεις. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [Height](../../system.drawing/size/height/) { get; set; } | Λαμβάνει ή ορίζει το κατακόρυφο στοιχείο αυτούSize . |
| [IsEmpty](../../system.drawing/size/isempty/) { get; } | Λαμβάνει μια τιμή που υποδεικνύει αν αυτόSize έχει πλάτος και ύψος 0. |
| [Width](../../system.drawing/size/width/) { get; set; } | Λαμβάνει ή ορίζει το οριζόντιο στοιχείο αυτούSize . |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| static [Add](../../system.drawing/size/add/)(Size, Size) | Προσθέτει το πλάτος και το ύψος του ενόςSize δομή σε πλάτος και ύψος άλλουSize δομή. |
| static [Ceiling](../../system.drawing/size/ceiling/)(SizeF) | Μετατρέπει το καθορισμένοSizeF δομή σε αSize δομή στρογγυλοποιώντας τις τιμές τουSize δομή στις επόμενες υψηλότερες ακέραιες τιμές. |
| static [Round](../../system.drawing/size/round/)(SizeF) | Μετατρέπει το καθορισμένοSizeF δομή σε αSizeδομή στρογγυλοποιώντας τις τιμές τουSizeF δομή στις πλησιέστερες ακέραιες τιμές. |
| static [Subtract](../../system.drawing/size/subtract/)(Size, Size) | Αφαιρεί το πλάτος και το ύψος του ενόςSize δομή από το πλάτος και το ύψος του άλλουSize δομή. |
| static [Truncate](../../system.drawing/size/truncate/)(SizeF) | Μετατρέπει το καθορισμένοSizeF δομή σε αSize δομή περικόπτοντας τις τιμές τουSizeF δομή στις επόμενες χαμηλότερες ακέραιες τιμές. |
| override [Equals](../../system.drawing/size/equals/#equals_1)(object) | Ελέγχει εάν το καθορισμένο αντικείμενο είναι αSize με τις ίδιες διαστάσεις με αυτόSize . |
| [Equals](../../system.drawing/size/equals/#equals)(Size) | Ελέγχει εάν άλλο`Size` η δομή έχει το ίδιο μέγεθος αυτού`Size` δομή. |
| override [GetHashCode](../../system.drawing/size/gethashcode/)() | Επιστρέφει έναν κωδικό κατακερματισμού για αυτόSize δομή. |
| override [ToString](../../system.drawing/size/tostring/)() | Μετατρέπει τα χαρακτηριστικά αυτού`Size` σε μια συμβολοσειρά αναγνώσιμη από τον άνθρωπο. |
| [operator +](../../system.drawing/size/op_addition/) | Προσθέτει το πλάτος και το ύψος του ενόςSize δομή σε πλάτος και ύψος άλλουSize δομή. |
| [operator /](../../system.drawing/size/op_division/#op_division) | Διαιρεί`Size` από ένανInt32 που παράγουν`Size` . (2 operators) |
| [operator ==](../../system.drawing/size/op_equality/) | Ελέγχει εάν δύοSize οι δομές είναι ίσες. |
| [explicit operator](../../system.drawing/size/op_explicit/) | Μετατρέπει το καθορισμένοSize σε αPoint . |
| [implicit operator](../../system.drawing/size/op_implicit/) | Μετατρέπει το καθορισμένοSize σε αSizeF . |
| [operator !=](../../system.drawing/size/op_inequality/) | Ελέγχει εάν δύοSize οι δομές είναι διαφορετικές. |
| [operator *](../../system.drawing/size/op_multiply/#op_multiply) | Πολλαπλασιάζει α`Size` από ένανInt32 που παράγουν`Size` . (4 operators) |
| [operator -](../../system.drawing/size/op_subtraction/) | Αφαιρεί το πλάτος και το ύψος του ενόςSize δομή από το πλάτος και το ύψος του άλλουSize δομή. |

## Πεδία

| Ονομα | Περιγραφή |
| --- | --- |
| static readonly [Empty](../../system.drawing/size/empty/) | Παίρνει έναSize δομή που έχει αHeight καιWidth τιμή 0. |

### Δείτε επίσης

* χώρος ονομάτων [System.Drawing](../../system.drawing/)
* συνέλευση [Aspose.Drawing](../../)


