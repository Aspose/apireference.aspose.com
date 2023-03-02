---
title: Class Extent
second_title: Αναφορά Aspose.GIS για .NET API
description: Aspose.Gis.Extent τάξη. Ένα δισδιάστατο χωρικό πλαίσιο οριοθέτησης.
type: docs
weight: 120
url: /el/net/aspose.gis/extent/
---
## Extent class

Ένα δισδιάστατο χωρικό πλαίσιο οριοθέτησης.

```csharp
public class Extent : IEquatable<Extent>
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [Extent](extent/#constructor)() | Δημιουργεί νέα παρουσία. |
| [Extent](extent/#constructor_1)(SpatialReferenceSystem) | Δημιουργεί νέα παρουσία. |
| [Extent](extent/#constructor_2)(double, double, double, double, SpatialReferenceSystem) | Δημιουργεί νέα παρουσία. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [Center](../../aspose.gis/extent/center/) { get; } | Κέντρο της έκτασης. |
| [Height](../../aspose.gis/extent/height/) { get; } | Ύψος της έκτασης. |
| [IsValid](../../aspose.gis/extent/isvalid/) { get; } | Καθορίζει εάν αυτό`Extent` ισχύει. |
| [SpatialReferenceSystem](../../aspose.gis/extent/spatialreferencesystem/) { get; set; } | [`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) σχετίζεται με αυτήν την έκταση. Μπορεί να είναι`null` αν[`SpatialReferenceSystem`](./spatialreferencesystem/) είναι άγνωστο. Χρήση[`GetTransformed`](./gettransformed/) προκειμένου να μετασχηματιστεί η έκταση μεταξύ διαφορετικών χωρικών συστημάτων αναφοράς. |
| [Width](../../aspose.gis/extent/width/) { get; } | Πλάτος της έκτασης. |
| [XMax](../../aspose.gis/extent/xmax/) { get; set; } | Μέγιστη τιμή της συντεταγμένης Χ. |
| [XMin](../../aspose.gis/extent/xmin/) { get; set; } | Ελάχιστη τιμή της συντεταγμένης Χ. |
| [YMax](../../aspose.gis/extent/ymax/) { get; set; } | Μέγιστη τιμή της συντεταγμένης Υ. |
| [YMin](../../aspose.gis/extent/ymin/) { get; set; } | Ελάχιστη τιμή της συντεταγμένης Υ. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [Clone](../../aspose.gis/extent/clone/)() | Κλωνοποιεί αυτήν την παρουσία. |
| [Contains](../../aspose.gis/extent/contains/#contains)(Extent) | Καθορίζει εάν αυτή η έκταση περιέχει το όρισμα. |
| [Contains](../../aspose.gis/extent/contains/#contains_1)(IGeometry) | Καθορίζει εάν αυτή η έκταση περιέχει το όρισμα. |
| [Contains](../../aspose.gis/extent/contains/#contains_2)(double, double) | Καθορίζει εάν αυτή η έκταση περιέχει μια συντεταγμένη που ορίζεται από τα ορίσματα. |
| [Equals](../../aspose.gis/extent/equals/#equals)(Extent) | Υποδεικνύει εάν το τρέχον αντικείμενο είναι ίσο με άλλο αντικείμενο του ίδιου τύπου. |
| override [Equals](../../aspose.gis/extent/equals/#equals_1)(object) | Καθορίζει εάν το καθορισμένο αντικείμενο είναι ίσο με το τρέχον αντικείμενο. |
| override [GetHashCode](../../aspose.gis/extent/gethashcode/)() | Λειτουργεί ως η προεπιλεγμένη συνάρτηση κατακερματισμού. |
| [GetTransformed](../../aspose.gis/extent/gettransformed/)(SpatialReferenceSystem) | Επιστρέφει νέα έκταση σε καθορισμένο[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) που περιέχει αυτή την έκταση. |
| [Grow](../../aspose.gis/extent/grow/#grow)(Extent) | Αυξάνει αυτήν την έκταση, ώστε να περιλαμβάνει το όρισμα. |
| [Grow](../../aspose.gis/extent/grow/#grow_1)(double, double) | Αυξάνεται σε αυτόν τον βαθμό, ώστε να περιλαμβάνει το καθορισμένο σημείο. |
| [GrowX](../../aspose.gis/extent/growx/)(double) | Αναπτύσσεται αυτή η έκταση κατά μήκος του άξονα Χ, ώστε να περιλαμβάνει την καθορισμένη τιμή. |
| [GrowY](../../aspose.gis/extent/growy/)(double) | Αναπτύσσεται αυτή η έκταση κατά μήκος του άξονα Y, ώστε να περιλαμβάνει την καθορισμένη τιμή. |
| [Intersects](../../aspose.gis/extent/intersects/#intersects)(Extent) | Καθορίζει εάν αυτή η έκταση τέμνεται με το όρισμα. |
| [Intersects](../../aspose.gis/extent/intersects/#intersects_1)(IGeometry) | Καθορίζει εάν αυτή η έκταση τέμνεται με το όρισμα. |
| [Normalize](../../aspose.gis/extent/normalize/)() | Ανταλλαγή[`XMin`](./xmin/) με[`XMax`](./xmax/) αν[`Width`](./width/) είναι αρνητικό και [`YMin`](./ymin/) με[`YMax`](./ymax/) αν[`Height`](./height/) είναι αρνητικό. |
| [ToPolygon](../../aspose.gis/extent/topolygon/)() | Μετατρέπει αυτήν την έκταση σε ορθογώνιο πολύγωνο που την αντιπροσωπεύει. |
| override [ToString](../../aspose.gis/extent/tostring/)() | Επιστρέφει μια συμβολοσειρά που αντιπροσωπεύει το τρέχον αντικείμενο. |
| [operator ==](../../aspose.gis/extent/op_equality/) | Υλοποιεί τον τελεστή '=='. |
| [operator !=](../../aspose.gis/extent/op_inequality/) | Υλοποιεί τον τελεστή '!='. |

### Δείτε επίσης

* χώρος ονομάτων [Aspose.Gis](../../aspose.gis/)
* συνέλευση [Aspose.GIS](../../)


