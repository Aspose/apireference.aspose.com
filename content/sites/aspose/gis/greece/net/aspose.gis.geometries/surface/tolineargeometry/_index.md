---
title: Surface.ToLinearGeometry
second_title: Αναφορά Aspose.GIS για .NET API
description: Surface μέθοδος. Λαμβάνει κατά προσέγγιση ή ισοδύναμη μη καμπύλη έκδοση αυτής της γεωμετρίας χρησιμοποιώντας την προεπιλογήανοχή .
type: docs
weight: 40
url: /el/net/aspose.gis.geometries/surface/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry_2}

Λαμβάνει κατά προσέγγιση ή ισοδύναμη μη καμπύλη έκδοση αυτής της γεωμετρίας χρησιμοποιώντας την προεπιλογή`ανοχή` .

```csharp
public IPolygon ToLinearGeometry()
```

### Επιστρεφόμενη Αξία

Α[`IPolygon`](../../ipolygon/) που προσεγγίζει ή ισοδυναμεί με αυτό`ISεπιφάνεια`. Αυτό είναι το ισοδύναμο του[`ToLinearGeometry`](../../isurface/tolineargeometry/) με προεπιλογή`ανοχή` . Προκαθορισμένο`ανοχή` Η τιμή του εξαρτάται από[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) αυτής της γεωμετρίας:  Για την προβλεπόμενη ανοχή SRS είναι 0,001 μέτρα (σε μονάδες SRS) Για γεωγραφική ανοχή SRS είναι`1ε-5` βαθμούς (σε μονάδες SRS) Για άγνωστο SRS ανοχή είναι`1ε-5` Για περισσότερες λεπτομέρειες σχετικά με τους μετασχηματισμούς που εφαρμόζονται, ανατρέξτε στο[`ToLinearGeometry`](../../isurface/tolineargeometry/) προδιαγραφή.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| InvalidOperationException | Αυτή η γεωμετρία δεν είναι έγκυρη με τέτοιο τρόπο, ώστε η λειτουργία να μην μπορεί να ολοκληρωθεί. |

### Δείτε επίσης

* interface [IPolygon](../../ipolygon/)
* class [Surface](../)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../surface/)
* συνέλευση [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_3}

Λαμβάνει κατά προσέγγιση ή ισοδύναμη μη καμπύλη έκδοση αυτής της γεωμετρίας χρησιμοποιώντας την καθορισμένη`ανοχή` .

```csharp
public IPolygon ToLinearGeometry(double tolerance)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| tolerance | Double | Το`ανοχή`χρησιμοποιώ. Το αποτέλεσμα είναι εγγυημένα μικρότερο από`ανοχή` μακριά από την καμπύλη γεωμετρία, εκτός εάν ο αριθμός των σημείων που απαιτούνται για τη γραμμικοποίηση της γεωμετρίας υπερβαίνει το μέγιστο ανά τεταρτημόριο, επί του παρόντος ίσο με 10000 σημεία. |

### Επιστρεφόμενη Αξία

Α[`IPolygon`](../../ipolygon/) που προσεγγίζει ή ισοδυναμεί με αυτό`ISεπιφάνεια` :  Αν αυτό το αντικείμενο είναι[`IPolygon`](../../ipolygon/) το ίδιο το αποτέλεσμα είναι ισοδύναμο με αυτό το αντικείμενο Εάν αυτό το αντικείμενο δεν είναι[`IPolygon`](../../ipolygon/) είναι γραμμικοποιημένο και[`IPolygon`](../../ipolygon/) δημιουργείται

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentOutOfRangeException | `ανοχή` είναι μικρότερο ή ίσο με`0` . |
| InvalidOperationException | Αυτή η γεωμετρία δεν είναι έγκυρη με τέτοιο τρόπο, ώστε η λειτουργία να μην μπορεί να ολοκληρωθεί. |

### Δείτε επίσης

* interface [IPolygon](../../ipolygon/)
* class [Surface](../)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../surface/)
* συνέλευση [Aspose.GIS](../../../)


