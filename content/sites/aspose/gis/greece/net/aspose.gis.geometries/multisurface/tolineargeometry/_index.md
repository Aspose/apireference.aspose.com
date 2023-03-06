---
title: MultiSurface.ToLinearGeometry
second_title: Αναφορά Aspose.GIS για .NET API
description: MultiSurface μέθοδος. Λαμβάνει κατά προσέγγιση ή ισοδύναμη μη καμπύλη έκδοση αυτής της γεωμετρίας χρησιμοποιώντας την προεπιλογήανοχή .
type: docs
weight: 60
url: /el/net/aspose.gis.geometries/multisurface/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry_4}

Λαμβάνει κατά προσέγγιση ή ισοδύναμη μη καμπύλη έκδοση αυτής της γεωμετρίας χρησιμοποιώντας την προεπιλογή`ανοχή` .

```csharp
public IMultiPolygon ToLinearGeometry()
```

### Επιστρεφόμενη Αξία

Α[`IMultiPolygon`](../../imultipolygon/) που προσεγγίζει ή ισοδυναμεί με αυτό[`IMultiSurface`](../../imultisurface/). Αυτό είναι το ισοδύναμο του[`ToLinearGeometry`](../../imultisurface/tolineargeometry/) με προεπιλογή`ανοχή` . Προκαθορισμένο`ανοχή` Η τιμή του εξαρτάται από[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) αυτής της γεωμετρίας:  Για την προβλεπόμενη ανοχή SRS είναι 0,001 μέτρα (σε μονάδες SRS) Για γεωγραφική ανοχή SRS είναι`1ε-5` βαθμούς (σε μονάδες SRS) Για άγνωστο SRS ανοχή είναι`1ε-5` Για περισσότερες λεπτομέρειες σχετικά με τους μετασχηματισμούς που εφαρμόζονται, ανατρέξτε στο[`ToLinearGeometry`](../../imultisurface/tolineargeometry/) προδιαγραφή.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| InvalidOperationException | Αυτή η γεωμετρία δεν είναι έγκυρη με τέτοιο τρόπο, ώστε η λειτουργία να μην μπορεί να ολοκληρωθεί. |

### Δείτε επίσης

* interface [IMultiPolygon](../../imultipolygon/)
* class [MultiSurface](../)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../multisurface/)
* συνέλευση [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_5}

Λαμβάνει κατά προσέγγιση ή ισοδύναμη μη καμπύλη έκδοση αυτής της γεωμετρίας χρησιμοποιώντας την καθορισμένη`ανοχή` .

```csharp
public IMultiPolygon ToLinearGeometry(double tolerance)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| tolerance | Double | Το`ανοχή`χρησιμοποιώ. Το αποτέλεσμα είναι εγγυημένα μικρότερο από`ανοχή` μακριά από την καμπύλη γεωμετρία, εκτός εάν ο αριθμός των σημείων που απαιτούνται για τη γραμμικοποίηση της γεωμετρίας υπερβαίνει το μέγιστο ανά τεταρτημόριο, επί του παρόντος ίσο με 10000 σημεία. |

### Επιστρεφόμενη Αξία

Α[`IMultiPolygon`](../../imultipolygon/) που προσεγγίζει ή ισοδυναμεί με αυτό[`IMultiSurface`](../../imultisurface/) :  Αν αυτό το αντικείμενο είναι[`IMultiPolygon`](../../imultipolygon/) το ίδιο το αποτέλεσμα είναι ισοδύναμο με αυτό το αντικείμενο Εάν αυτό το αντικείμενο δεν είναι[`IMultiPolygon`](../../imultipolygon/) - όλες οι επιφάνειες είναι γραμμικές και καινούριες`IMΠολύγωνο` δημιουργείται

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentOutOfRangeException | `ανοχή` είναι μικρότερο ή ίσο με`0` . |
| InvalidOperationException | Αυτή η γεωμετρία δεν είναι έγκυρη με τέτοιο τρόπο, ώστε η λειτουργία να μην μπορεί να ολοκληρωθεί. |

### Δείτε επίσης

* interface [IMultiPolygon](../../imultipolygon/)
* class [MultiSurface](../)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../multisurface/)
* συνέλευση [Aspose.GIS](../../../)


