---
title: Curve.ToLinearGeometry
second_title: Αναφορά Aspose.GIS για .NET API
description: Curve μέθοδος. Λαμβάνει κατά προσέγγιση ή ισοδύναμη μη καμπύλη έκδοση αυτής της γεωμετρίας χρησιμοποιώντας την προεπιλογήανοχή .
type: docs
weight: 70
url: /el/net/aspose.gis.geometries/curve/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry_2}

Λαμβάνει κατά προσέγγιση ή ισοδύναμη μη καμπύλη έκδοση αυτής της γεωμετρίας χρησιμοποιώντας την προεπιλογή`ανοχή` .

```csharp
public ILineString ToLinearGeometry()
```

### Επιστρεφόμενη Αξία

Α[`ILineString`](../../ilinestring/) που προσεγγίζει ή ισοδυναμεί με αυτήν την καμπύλη. Αυτό είναι το ισοδύναμο του[`ToLinearGeometry`](../../icurve/tolineargeometry/) με προεπιλογή`ανοχή` . Προκαθορισμένο`ανοχή` Η τιμή του εξαρτάται από[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) αυτής της γεωμετρίας:  Για την προβλεπόμενη ανοχή SRS είναι 0,001 μέτρα (σε μονάδες SRS) Για γεωγραφική ανοχή SRS είναι`1ε-5` βαθμούς (σε μονάδες SRS) Για άγνωστο SRS ανοχή είναι`1ε-5` Για περισσότερες λεπτομέρειες σχετικά με τους μετασχηματισμούς που εφαρμόζονται, ανατρέξτε στο[`ToLinearGeometry`](../../icurve/tolineargeometry/) προδιαγραφή.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| InvalidOperationException | Αυτή η γεωμετρία δεν είναι έγκυρη με τέτοιο τρόπο, ώστε η λειτουργία να μην μπορεί να ολοκληρωθεί. |

### Δείτε επίσης

* interface [ILineString](../../ilinestring/)
* class [Curve](../)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../curve/)
* συνέλευση [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_3}

Λαμβάνει κατά προσέγγιση ή ισοδύναμη μη καμπύλη έκδοση αυτής της γεωμετρίας χρησιμοποιώντας την καθορισμένη`ανοχή` .

```csharp
public ILineString ToLinearGeometry(double tolerance)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| tolerance | Double | Το`ανοχή`χρησιμοποιώ. Το αποτέλεσμα είναι εγγυημένα μικρότερο από`ανοχή` μακριά από την καμπύλη γεωμετρία, εκτός εάν ο αριθμός των σημείων που απαιτούνται για τη γραμμικοποίηση της γεωμετρίας υπερβαίνει το μέγιστο ανά τεταρτημόριο, επί του παρόντος ίσο με 10000 σημεία. |

### Επιστρεφόμενη Αξία

Α[`ILineString`](../../ilinestring/) που προσεγγίζει ή ισοδυναμεί με αυτήν την καμπύλη:  Αν αυτό το αντικείμενο είναι[`ILineString`](../../ilinestring/) το ίδιο το αποτέλεσμα είναι ισοδύναμο με αυτό το αντικείμενο Αν αυτό το αντικείμενο είναι[`ICircularString`](../../icircularstring/) Το αποτέλεσμα είναι η κυκλική συμβολοσειρά γραμμική με το καθορισμένο*tolerance* Αν αυτό το αντικείμενο είναι[`ICompoundCurve`](../../icompoundcurve/) - όλες οι καμπύλες από αυτό είναι γραμμικές και στη συνέχεια ενώνονται[`ILineString`](../../ilinestring/)

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentOutOfRangeException | `ανοχή` είναι μικρότερο ή ίσο με`0` . |
| InvalidOperationException | Αυτή η γεωμετρία δεν είναι έγκυρη με τέτοιο τρόπο, ώστε η λειτουργία να μην μπορεί να ολοκληρωθεί. |

### Δείτε επίσης

* interface [ILineString](../../ilinestring/)
* class [Curve](../)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../curve/)
* συνέλευση [Aspose.GIS](../../../)


