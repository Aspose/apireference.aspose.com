---
title: Geometry.FromBinary
second_title: Αναφορά Aspose.GIS για .NET API
description: Geometry μέθοδος. Δημιουργεί μια γεωμετρία από τη γνωστή δυαδική αναπαράστασή του.
type: docs
weight: 460
url: /el/net/aspose.gis.geometries/geometry/frombinary/
---
## FromBinary(byte[]) {#frombinary}

Δημιουργεί μια γεωμετρία από τη γνωστή δυαδική αναπαράστασή του.

```csharp
public static IGeometry FromBinary(byte[] wkb)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| wkb | Byte[] | Γνωστή δυαδική αναπαράσταση μιας γεωμετρίας. |

### Επιστρεφόμενη Αξία

Μια γεωμετρία που αντιπροσωπεύεται από το όρισμα.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Το επιχείρημα είναι μηδενικό. |
| NotSupportedException | Το όρισμα αντιπροσωπεύει μια γεωμετρία μη υποστηριζόμενου τύπου. |
| FormatException | Το όρισμα δεν είναι έγκυρο Γνωστό Δυαδικό. |

### Δείτε επίσης

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../geometry/)
* συνέλευση [Aspose.GIS](../../../)

---

## FromBinary(byte[], SpatialReferenceSystem) {#frombinary_1}

Δημιουργεί μια γεωμετρία από τη γνωστή δυαδική αναπαράστασή του.

```csharp
public static IGeometry FromBinary(byte[] wkb, SpatialReferenceSystem spatialReferenceSystem)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| wkb | Byte[] | Γνωστή δυαδική αναπαράσταση μιας γεωμετρίας. |
| spatialReferenceSystem | SpatialReferenceSystem | Χωρικό Σύστημα Αναφοράς που θα εκχωρηθεί στη γεωμετρία. |

### Επιστρεφόμενη Αξία

Μια γεωμετρία που αντιπροσωπεύεται από το όρισμα.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Το επιχείρημα είναι μηδενικό. |
| NotSupportedException | Το όρισμα αντιπροσωπεύει μια γεωμετρία μη υποστηριζόμενου τύπου. |
| FormatException | Το όρισμα δεν είναι έγκυρο Γνωστό Δυαδικό. |

### Παρατηρήσεις

Εάν υπάρχουν επιπλέον byte μετά τη γεωμετρία αFormatException απορρίπτεται.

### Δείτε επίσης

* interface [IGeometry](../../igeometry/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Geometry](../)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../geometry/)
* συνέλευση [Aspose.GIS](../../../)


