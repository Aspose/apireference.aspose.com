---
title: Extent.Grow
second_title: Αναφορά Aspose.GIS για .NET API
description: Extent μέθοδος. Αυξάνει αυτήν την έκταση ώστε να περιλαμβάνει το όρισμα.
type: docs
weight: 160
url: /el/net/aspose.gis/extent/grow/
---
## Grow(Extent) {#grow}

Αυξάνει αυτήν την έκταση, ώστε να περιλαμβάνει το όρισμα.

```csharp
public void Grow(Extent extent)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| extent | Extent | Άλλη έκταση. |

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Επιχείρημα είναι`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) αυτού του βαθμού και το επιχείρημα δεν είναι και τα δύο`null` και όχι ίσα μεταξύ τους. |

### Παρατηρήσεις

Αν[`SpatialReferenceSystem`](../spatialreferencesystem/) αυτού του SRS είναι`null` στη συνέχεια ενημερώνεται με SRS του ορίσματος.

### Δείτε επίσης

* class [Extent](../)
* χώρος ονομάτων [Aspose.Gis](../../extent/)
* συνέλευση [Aspose.GIS](../../../)

---

## Grow(double, double) {#grow_1}

Αυξάνεται σε αυτόν τον βαθμό, ώστε να περιλαμβάνει το καθορισμένο σημείο.

```csharp
public void Grow(double x, double y)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| x | Double | X συντεταγμένη για συμπερίληψη. |
| y | Double | Y συντονίζει για να συμπεριλάβει. |

### Δείτε επίσης

* class [Extent](../)
* χώρος ονομάτων [Aspose.Gis](../../extent/)
* συνέλευση [Aspose.GIS](../../../)


