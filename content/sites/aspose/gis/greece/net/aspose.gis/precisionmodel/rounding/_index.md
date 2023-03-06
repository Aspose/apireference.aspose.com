---
title: PrecisionModel.Rounding
second_title: Αναφορά Aspose.GIS για .NET API
description: PrecisionModel μέθοδος. Επιστρέφει ένα μοντέλο ακριβείας στρογγυλοποίησης. Σύμφωνα με το μοντέλο ακριβείας στρογγυλοποίησης μόνο ένας περιορισμένος αριθμός ψηφίων είναι σημαντικός.
type: docs
weight: 20
url: /el/net/aspose.gis/precisionmodel/rounding/
---
## PrecisionModel.Rounding method

Επιστρέφει ένα μοντέλο ακριβείας στρογγυλοποίησης. Σύμφωνα με το μοντέλο ακριβείας στρογγυλοποίησης, μόνο ένας περιορισμένος αριθμός ψηφίων είναι σημαντικός.

```csharp
public static PrecisionModel Rounding(int significantDigits)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| significantDigits | Int32 | Αριθμός σημαντικών ψηφίων. |

### Επιστρεφόμενη Αξία

Μοντέλο στρογγυλοποίησης ακριβείας.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentOutOfRangeException | Ο αριθμός των σημαντικών ψηφίων είναι μικρότερος από 0 ή μεγαλύτερος από 15. |

### Παρατηρήσεις

Όταν εφαρμόζεται σε μια συντεταγμένη, ο ακόλουθος κώδικας χρησιμοποιείται για τη μείωση της ακρίβειας:

```csharp
double rounded = Math.Round(value, significantDigits);
```

### Δείτε επίσης

* class [PrecisionModel](../)
* χώρος ονομάτων [Aspose.Gis](../../precisionmodel/)
* συνέλευση [Aspose.GIS](../../../)


