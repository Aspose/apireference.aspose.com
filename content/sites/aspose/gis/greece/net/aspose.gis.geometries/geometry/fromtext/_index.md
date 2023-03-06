---
title: Geometry.FromText
second_title: Αναφορά Aspose.GIS για .NET API
description: Geometry μέθοδος. Δημιουργεί μια γεωμετρία από τη γνωστή αναπαράσταση κειμένου.
type: docs
weight: 470
url: /el/net/aspose.gis.geometries/geometry/fromtext/
---
## FromText(string) {#fromtext}

Δημιουργεί μια γεωμετρία από τη γνωστή αναπαράσταση κειμένου.

```csharp
public static IGeometry FromText(string wkt)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| wkt | String | Γνωστή Αναπαράσταση κειμένου μιας γεωμετρίας. |

### Επιστρεφόμενη Αξία

Μια γεωμετρία που αντιπροσωπεύεται από το όρισμα.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Το επιχείρημα είναι μηδενικό. |
| NotSupportedException | Το όρισμα αντιπροσωπεύει μια γεωμετρία μη υποστηριζόμενου τύπου. |
| FormatException | Το επιχείρημα δεν είναι έγκυρο Γνωστό Κείμενο. |

### Δείτε επίσης

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../geometry/)
* συνέλευση [Aspose.GIS](../../../)

---

## FromText(string, SpatialReferenceSystem) {#fromtext_1}

Δημιουργεί μια γεωμετρία από τη γνωστή αναπαράσταση κειμένου.

```csharp
public static IGeometry FromText(string wkt, SpatialReferenceSystem spatialReferenceSystem)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| wkt | String | Γνωστή Αναπαράσταση κειμένου μιας γεωμετρίας. |
| spatialReferenceSystem | SpatialReferenceSystem | Χωρικό Σύστημα Αναφοράς που θα εκχωρηθεί στη γεωμετρία. |

### Επιστρεφόμενη Αξία

Μια γεωμετρία που αντιπροσωπεύεται από το όρισμα.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Το επιχείρημα είναι μηδενικό. |
| NotSupportedException | Το όρισμα αντιπροσωπεύει μια γεωμετρία μη υποστηριζόμενου τύπου. |
| FormatException | Το επιχείρημα δεν είναι έγκυρο Γνωστό Κείμενο. |

### Δείτε επίσης

* interface [IGeometry](../../igeometry/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Geometry](../)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../geometry/)
* συνέλευση [Aspose.GIS](../../../)


