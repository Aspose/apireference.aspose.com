---
title: MultiCurve.ToLinearGeometry
second_title: Αναφορά Aspose.GIS για .NET API
description: MultiCurve μέθοδος. Λαμβάνει κατά προσέγγιση ή ισοδύναμη μη καμπύλη έκδοση αυτής της γεωμετρίας χρησιμοποιώντας την καθορισμένηανοχή .
type: docs
weight: 70
url: /el/net/aspose.gis.geometries/multicurve/tolineargeometry/
---
## ToLinearGeometry(double) {#tolineargeometry_5}

Λαμβάνει κατά προσέγγιση ή ισοδύναμη μη καμπύλη έκδοση αυτής της γεωμετρίας χρησιμοποιώντας την καθορισμένη`ανοχή` .

```csharp
public IMultiLineString ToLinearGeometry(double tolerance)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| tolerance | Double | Το`ανοχή`χρησιμοποιώ. Το αποτέλεσμα είναι εγγυημένα μικρότερο από`ανοχή` μακριά από την καμπύλη γεωμετρία, εκτός εάν ο αριθμός των σημείων που απαιτούνται για τη γραμμικοποίηση της γεωμετρίας υπερβαίνει το μέγιστο ανά τεταρτημόριο, επί του παρόντος ίσο με 10000 σημεία. |

### Επιστρεφόμενη Αξία

Α[`IMultiLineString`](../../imultilinestring/) που προσεγγίζει ή ισοδυναμεί με αυτό[`IMultiCurve`](../../imulticurve/) :  Αν αυτό το αντικείμενο είναι[`IMultiLineString`](../../imultilinestring/) το ίδιο το αποτέλεσμα είναι ισοδύναμο με αυτό το αντικείμενο Εάν αυτό το αντικείμενο δεν είναι[`IMultiLineString`](../../imultilinestring/) - όλες οι καμπύλες είναι γραμμικές και νέες`IMultiLineString` δημιουργείται

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentOutOfRangeException | `ανοχή` είναι μικρότερο ή ίσο με`0` . |
| InvalidOperationException | Αυτή η γεωμετρία δεν είναι έγκυρη με τέτοιο τρόπο, ώστε η λειτουργία να μην μπορεί να ολοκληρωθεί. |

### Δείτε επίσης

* interface [IMultiLineString](../../imultilinestring/)
* class [MultiCurve](../)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../multicurve/)
* συνέλευση [Aspose.GIS](../../../)

---

## ToLinearGeometry() {#tolineargeometry_4}

Λαμβάνει κατά προσέγγιση ή ισοδύναμη μη καμπύλη έκδοση αυτής της γεωμετρίας χρησιμοποιώντας την προεπιλογή`ανοχή` .

```csharp
public IMultiLineString ToLinearGeometry()
```

### Επιστρεφόμενη Αξία

Α[`IMultiLineString`](../../imultilinestring/) που προσεγγίζει ή ισοδυναμεί με αυτό[`IMultiCurve`](../../imulticurve/). Αυτό είναι το ισοδύναμο του[`ToLinearGeometry`](../../imulticurve/tolineargeometry/) με προεπιλογή`ανοχή` . Προκαθορισμένο`ανοχή` Η τιμή του εξαρτάται από[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) αυτής της γεωμετρίας:  Για την προβλεπόμενη ανοχή SRS είναι 0,001 μέτρα (σε μονάδες SRS) Για γεωγραφική ανοχή SRS είναι`1ε-5` βαθμούς (σε μονάδες SRS) Για άγνωστο SRS ανοχή είναι`1ε-5` Για περισσότερες λεπτομέρειες σχετικά με τους μετασχηματισμούς που εφαρμόζονται, ανατρέξτε στο[`ToLinearGeometry`](../../imulticurve/tolineargeometry/) προδιαγραφή.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| InvalidOperationException | Αυτή η γεωμετρία δεν είναι έγκυρη με τέτοιο τρόπο, ώστε η λειτουργία να μην μπορεί να ολοκληρωθεί. |

### Δείτε επίσης

* interface [IMultiLineString](../../imultilinestring/)
* class [MultiCurve](../)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../multicurve/)
* συνέλευση [Aspose.GIS](../../../)


