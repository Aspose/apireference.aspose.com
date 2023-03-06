---
title: Extent.Contains
second_title: Αναφορά Aspose.GIS για .NET API
description: Extent μέθοδος. Καθορίζει εάν αυτή η έκταση περιέχει μια συντεταγμένη που ορίζεται από τα ορίσματα.
type: docs
weight: 120
url: /el/net/aspose.gis/extent/contains/
---
## Contains(double, double) {#contains_2}

Καθορίζει εάν αυτή η έκταση περιέχει μια συντεταγμένη που ορίζεται από τα ορίσματα.

```csharp
public bool Contains(double x, double y)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| x | Double | Χ της συντεταγμένης. |
| y | Double | Υ της συντεταγμένης. |

### Επιστρεφόμενη Αξία

Τιμή, που υποδεικνύει εάν η συντεταγμένη βρίσκεται μέσα στο πλαίσιο οριοθέτησης.

### Παρατηρήσεις

Συντεταγμένες που βρίσκονται στα όρια αυτού[`Extent`](../) are θεωρείται ότι περιέχεται από αυτό[`Extent`](../) .

### Δείτε επίσης

* class [Extent](../)
* χώρος ονομάτων [Aspose.Gis](../../extent/)
* συνέλευση [Aspose.GIS](../../../)

---

## Contains(Extent) {#contains}

Καθορίζει εάν αυτή η έκταση περιέχει το όρισμα.

```csharp
public bool Contains(Extent extent)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| extent | Extent | Άλλη έκταση. |

### Επιστρεφόμενη Αξία

Τιμή, που υποδεικνύει εάν αυτή η έκταση περιέχει το όρισμα.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Επιχείρημα είναι`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) αυτού του βαθμού και το επιχείρημα δεν είναι και τα δύο`null` και όχι ίσα μεταξύ τους. |

### Παρατηρήσεις

Συντεταγμένες που βρίσκονται στα όρια αυτού[`Extent`](../) are θεωρείται ότι περιέχεται από αυτό[`Extent`](../) . Για το λόγο αυτό, ίσες εκτάσεις θεωρούνται ότι περιέχουν η μία την άλλη.

### Δείτε επίσης

* class [Extent](../)
* χώρος ονομάτων [Aspose.Gis](../../extent/)
* συνέλευση [Aspose.GIS](../../../)

---

## Contains(IGeometry) {#contains_1}

Καθορίζει εάν αυτή η έκταση περιέχει το όρισμα.

```csharp
public bool Contains(IGeometry geometry)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| geometry | IGeometry | Μια γεωμετρία προς δοκιμή για περιορισμό. |

### Επιστρεφόμενη Αξία

Τιμή, που υποδεικνύει εάν αυτή η έκταση περιέχει το όρισμα.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Επιχείρημα είναι`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) αυτού του βαθμού και το επιχείρημα δεν είναι και τα δύο`null` και όχι ίσα μεταξύ τους. |

### Παρατηρήσεις

Συντεταγμένες που βρίσκονται στα όρια αυτού[`Extent`](../) are θεωρείται ότι περιέχεται από αυτό[`Extent`](../) .

### Δείτε επίσης

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [Extent](../)
* χώρος ονομάτων [Aspose.Gis](../../extent/)
* συνέλευση [Aspose.GIS](../../../)


