---
title: IGeometry.ToLinearGeometry
second_title: Αναφορά Aspose.GIS για .NET API
description: IGeometry μέθοδος. Λαμβάνει κατά προσέγγιση ή ισοδύναμη μη καμπύλη έκδοση αυτής της γεωμετρίας χρησιμοποιώντας την προεπιλογήανοχή .
type: docs
weight: 350
url: /el/net/aspose.gis.geometries/igeometry/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry}

Λαμβάνει κατά προσέγγιση ή ισοδύναμη μη καμπύλη έκδοση αυτής της γεωμετρίας χρησιμοποιώντας την προεπιλογή`ανοχή` .

```csharp
public IGeometry ToLinearGeometry()
```

### Επιστρεφόμενη Αξία

Μια γεωμετρία που δεν έχει γεωμετρίες καμπύλης. Αυτό είναι το ισοδύναμο του`ToLinearGeometry` με προεπιλογή`ανοχή` . Προκαθορισμένο`ανοχή` ορίζεται από[`SpatialReferenceSystem`](../spatialreferencesystem/) αυτής της γεωμετρίας:  Για την προβλεπόμενη ανοχή SRS είναι 0,001 μέτρα (σε μονάδες SRS) Για γεωγραφική ανοχή SRS είναι`1ε-5` βαθμούς (σε μονάδες SRS) Για άγνωστο SRS ανοχή είναι`1ε-5` Για περισσότερες λεπτομέρειες σχετικά με τους μετασχηματισμούς που εφαρμόζονται, ανατρέξτε στο`ToLinearGeometry` προδιαγραφή.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| InvalidOperationException | Αυτή η γεωμετρία δεν είναι έγκυρη με τέτοιο τρόπο, ώστε η λειτουργία να μην μπορεί να ολοκληρωθεί. |

### Δείτε επίσης

* interface [IGeometry](../)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../igeometry/)
* συνέλευση [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_1}

Λαμβάνει κατά προσέγγιση ή ισοδύναμη μη καμπύλη έκδοση αυτής της γεωμετρίας χρησιμοποιώντας την καθορισμένη`ανοχή` .

```csharp
public IGeometry ToLinearGeometry(double tolerance)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| tolerance | Double | Το`ανοχή`χρησιμοποιώ. Το αποτέλεσμα είναι εγγυημένα μικρότερο από`ανοχή` μακριά από την καμπύλη γεωμετρία, εκτός εάν ο αριθμός των σημείων που απαιτούνται για τη γραμμικοποίηση της γεωμετρίας υπερβαίνει το μέγιστο ανά τεταρτημόριο που ισούται προς το παρόν με 10000 σημεία. |

### Επιστρεφόμενη Αξία

Μια γεωμετρία, που δεν έχει γεωμετρίες καμπύλης. Εφαρμόζονται οι ακόλουθοι μετασχηματισμοί: CircularString Τα s είναι γραμμικά (μετασχηματίζονται σεLineString s με καθορισμένο*tolerance* )CompoundCurve s ενώνονται σε`LineString` μικρόCurvePolygon s μετατρέπονται σεPolygon μικρόMultiCurve s μετατρέπονται σεMultiLineString μικρόMultiSurface s μετατρέπονται σεMultiPolygon μικρό Ως αποτέλεσμα,[`HasCurveGeometry`](../hascurvegeometry/) της γεωμετρίας εξόδου είναι`false` .

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentOutOfRangeException | `ανοχή` είναι μικρότερο ή ίσο με`0` . |
| InvalidOperationException | Αυτή η γεωμετρία δεν είναι έγκυρη με τέτοιο τρόπο, ώστε η λειτουργία να μην μπορεί να ολοκληρωθεί. |

### Δείτε επίσης

* interface [IGeometry](../)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../igeometry/)
* συνέλευση [Aspose.GIS](../../../)


