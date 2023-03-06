---
title: IGeometry.AsImage
second_title: Αναφορά Aspose.GIS για .NET API
description: IGeometry μέθοδος. Εξαγωγή αυτής της γεωμετρίας σε μια αναπαράσταση εικόνας.
type: docs
weight: 110
url: /el/net/aspose.gis.geometries/igeometry/asimage/
---
## AsImage(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) {#asimage_1}

Εξαγωγή αυτής της γεωμετρίας σε μια αναπαράσταση εικόνας.

```csharp
public void AsImage(AbstractPath outputPath, Measurement width, Measurement height, 
    Renderer renderer, VectorSymbolizer symbolizer = null)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| outputPath | AbstractPath | Διαδρομή προς την εικόνα εξόδου. |
| width | Measurement | Το πλάτος του χάρτη. |
| height | Measurement | Ύψος χάρτη. |
| renderer | Renderer | Renderer προς χρήση. |
| symbolizer | VectorSymbolizer | Ένας συμβολισμός που χρησιμοποιείται για απόδοση. Αν`null`, χρησιμοποιείται ο προεπιλεγμένος συμβολιστής. |

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Οποιοδήποτε επιχείρημα`null`. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |
| [GisException](../../../aspose.gis/gisexception/) | Σφάλμα κατά την επεξεργασία ή την ανάγνωση δεδομένων GIS. |
| ArgumentException | Μονάδα πλάτους ή ύψους είναι!:SpatialReferencing.Unit.MapUnits . |
| ArgumentOutOfRangeException | Το πλάτος ή το ύψος είναι αρνητικό ή μηδέν. |

### Δείτε επίσης

* class [AbstractPath](../../../aspose.gis/abstractpath/)
* struct [Measurement](../../../aspose.gis.rendering/measurement/)
* class [Renderer](../../../aspose.gis.rendering/renderer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* interface [IGeometry](../)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../igeometry/)
* συνέλευση [Aspose.GIS](../../../)

---

## AsImage(string, Measurement, Measurement, Renderer, VectorSymbolizer) {#asimage_2}

Εξαγωγή αυτής της γεωμετρίας σε μια αναπαράσταση εικόνας.

```csharp
public void AsImage(string outputPath, Measurement width, Measurement height, Renderer renderer, 
    VectorSymbolizer symbolizer = null)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| outputPath | String | Διαδρομή προς την εικόνα εξόδου. |
| width | Measurement | Το πλάτος του χάρτη. |
| height | Measurement | Ύψος χάρτη. |
| renderer | Renderer | Renderer προς χρήση. |
| symbolizer | VectorSymbolizer | Ένας συμβολισμός που χρησιμοποιείται για απόδοση. Αν`null`, χρησιμοποιείται ο προεπιλεγμένος συμβολιστής. |

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Οποιοδήποτε επιχείρημα`null`. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |
| [GisException](../../../aspose.gis/gisexception/) | Σφάλμα κατά την επεξεργασία ή την ανάγνωση δεδομένων GIS. |
| ArgumentException | Μονάδα πλάτους ή ύψους είναι!:SpatialReferencing.Unit.MapUnits . |
| ArgumentOutOfRangeException | Το πλάτος ή το ύψος είναι αρνητικό ή μηδέν. |

### Δείτε επίσης

* struct [Measurement](../../../aspose.gis.rendering/measurement/)
* class [Renderer](../../../aspose.gis.rendering/renderer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* interface [IGeometry](../)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../igeometry/)
* συνέλευση [Aspose.GIS](../../../)

---

## AsImage(Measurement, Measurement, Renderer, VectorSymbolizer) {#asimage}

Εξαγωγή αυτής της γεωμετρίας σε μια αναπαράσταση εικόνας.

```csharp
public Stream AsImage(Measurement width, Measurement height, Renderer renderer, 
    VectorSymbolizer symbolizer = null)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| width | Measurement | Το πλάτος του χάρτη. |
| height | Measurement | Ύψος χάρτη. |
| renderer | Renderer | Renderer προς χρήση. |
| symbolizer | VectorSymbolizer | Ένας συμβολισμός που χρησιμοποιείται για απόδοση. Αν`null`, χρησιμοποιείται ο προεπιλεγμένος συμβολιστής. |

### Επιστρεφόμενη Αξία

Η εικόνα ως ροή

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Οποιοδήποτε επιχείρημα`null`. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |
| [GisException](../../../aspose.gis/gisexception/) | Σφάλμα κατά την επεξεργασία ή την ανάγνωση δεδομένων GIS. |
| ArgumentException | Μονάδα πλάτους ή ύψους είναι!:SpatialReferencing.Unit.MapUnits . |
| ArgumentOutOfRangeException | Το πλάτος ή το ύψος είναι αρνητικό ή μηδέν. |

### Δείτε επίσης

* struct [Measurement](../../../aspose.gis.rendering/measurement/)
* class [Renderer](../../../aspose.gis.rendering/renderer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* interface [IGeometry](../)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../igeometry/)
* συνέλευση [Aspose.GIS](../../../)


