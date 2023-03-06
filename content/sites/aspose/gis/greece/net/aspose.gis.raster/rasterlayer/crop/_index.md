---
title: RasterLayer.Crop
second_title: Αναφορά Aspose.GIS για .NET API
description: RasterLayer μέθοδος. Περικόπτει το επίπεδο ράστερ χρησιμοποιώντας μια φόρμα σχήματος και μάσκα ζώνης.
type: docs
weight: 110
url: /el/net/aspose.gis.raster/rasterlayer/crop/
---
## Crop(IGeometry, double[]) {#crop}

Περικόπτει το επίπεδο ράστερ χρησιμοποιώντας μια φόρμα σχήματος (και μάσκα ζώνης).

```csharp
public RasterLayer Crop(IGeometry geometry, double[] masks = null)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| geometry | IGeometry | Η γεωμετρία αντιπροσώπευε τη μορφή σχήματος. |
| masks | Double[] | Μάσκα για στρώμα καλλιέργειας |

### Επιστρεφόμενη Αξία

Το κομμένο στρώμα ράστερ. Εάν δεν βρέθηκαν διασταυρώσεις επιστρέφει`null`.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Το επιχείρημα δεν μπορεί να είναι μηδενικό. Όνομα παραμέτρου: γεωμετρία. |
| NotSupportedException | Το όρισμα δεν μπορεί να είναι διαφορετικό από το πολύγωνο ή την επιφάνεια. Όνομα παραμέτρου: γεωμετρία. |
| InvalidOperationException | Το αρχικό επίπεδο δεν μπορεί να είναι άλλο CropRasterLayer. |
| [GisException](../../../aspose.gis/gisexception/) | Σφάλμα κατά την περικοπή του επιπέδου. |

### Δείτε επίσης

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [RasterLayer](../)
* χώρος ονομάτων [Aspose.Gis.Raster](../../rasterlayer/)
* συνέλευση [Aspose.GIS](../../../)

---

## Crop(double[]) {#crop_1}

Περικόπτει το επίπεδο ράστερ χρησιμοποιώντας μια μάσκα ζώνης).

```csharp
public RasterLayer Crop(double[] masks)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| masks | Double[] | Μάσκα για στρώμα καλλιέργειας |

### Επιστρεφόμενη Αξία

Το κομμένο στρώμα ράστερ. Εάν δεν βρέθηκαν διασταυρώσεις επιστρέφει`null`.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| InvalidOperationException |  |

### Δείτε επίσης

* class [RasterLayer](../)
* χώρος ονομάτων [Aspose.Gis.Raster](../../rasterlayer/)
* συνέλευση [Aspose.GIS](../../../)


