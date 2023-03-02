---
title: Class PrecisionModel
second_title: Αναφορά Aspose.GIS για .NET API
description: Aspose.Gis.PrecisionModel τάξη. PrecisionModel καθορίζει έναν αριθμό σημαντικών ψηφίων σε μια συντεταγμένη.
type: docs
weight: 1310
url: /el/net/aspose.gis/precisionmodel/
---
## PrecisionModel class

`PrecisionModel` καθορίζει έναν αριθμό σημαντικών ψηφίων σε μια συντεταγμένη.

```csharp
public abstract class PrecisionModel : IEquatable<PrecisionModel>
```

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| static [Exact](../../aspose.gis/precisionmodel/exact/) { get; } | Επιστρέφει ένα μοντέλο ακριβούς ακρίβειας. Σύμφωνα με το μοντέλο ακριβείας, όλα τα ψηφία σε διπλή τιμή είναι σημαντικά. |
| [IsExact](../../aspose.gis/precisionmodel/isexact/) { get; } | Λαμβάνει μια τιμή που υποδεικνύει εάν αυτό το μοντέλο ακριβείας είναι ακριβές. |
| [IsRounding](../../aspose.gis/precisionmodel/isrounding/) { get; } | Λαμβάνει μια τιμή που υποδεικνύει εάν αυτό το μοντέλο ακριβείας είναι στρογγυλοποιημένο. |
| abstract [SignificantDigits](../../aspose.gis/precisionmodel/significantdigits/) { get; } | Λαμβάνει έναν αριθμό σημαντικών ψηφίων σε ένα μοντέλο ακριβείας εάν είναι στρογγυλοποιημένο. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| static [Rounding](../../aspose.gis/precisionmodel/rounding/)(int) | Επιστρέφει ένα μοντέλο ακριβείας στρογγυλοποίησης. Σύμφωνα με το μοντέλο ακριβείας στρογγυλοποίησης, μόνο ένας περιορισμένος αριθμός ψηφίων είναι σημαντικός. |
| override [Equals](../../aspose.gis/precisionmodel/equals/#equals_1)(object) | Υποδεικνύει εάν το τρέχον αντικείμενο είναι ίσο με άλλο αντικείμενο του ίδιου τύπου. |
| [Equals](../../aspose.gis/precisionmodel/equals/#equals)(PrecisionModel) | Υποδεικνύει εάν το τρέχον αντικείμενο είναι ίσο με άλλο αντικείμενο του ίδιου τύπου. |
| override [GetHashCode](../../aspose.gis/precisionmodel/gethashcode/)() | Λειτουργεί ως η προεπιλεγμένη συνάρτηση κατακερματισμού. |
| [operator ==](../../aspose.gis/precisionmodel/op_equality/) | Υλοποιεί τον τελεστή ==. |
| [operator !=](../../aspose.gis/precisionmodel/op_inequality/) | Υλοποιεί τον τελεστή !=. |

### Παρατηρήσεις

Υπάρχουν δύο τύποι PrecisionModel:  Ακριβής`PrecisionModel` (όλα τα ψηφία είναι σημαντικά). Στρογγυλεμένο`PrecisionModel` (ορισμένος αριθμός ψηφίων είναι σημαντικός). Α`PrecisionModel` μπορεί να ρυθμιστεί σε[`VectorLayer`](../vectorlayer/) μέσω[`DriverOptions`](../driveroptions/) για στρογγυλοποίηση συντεταγμένων κατά τη σύνταξη ή την ανάγνωση γεωμετριών.

### Δείτε επίσης

* property [XYPrecisionModel](../driveroptions/xyprecisionmodel/)
* property [ZPrecisionModel](../driveroptions/zprecisionmodel/)
* property [MPrecisionModel](../driveroptions/mprecisionmodel/)
* χώρος ονομάτων [Aspose.Gis](../../aspose.gis/)
* συνέλευση [Aspose.GIS](../../)


