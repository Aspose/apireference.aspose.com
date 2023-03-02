---
title: Enum SpatialReferenceSystemType
second_title: Αναφορά Aspose.GIS για .NET API
description: Aspose.Gis.SpatialReferencing.SpatialReferenceSystemType αρίθμηση. Αντιπροσωπεύει τύπο χωρικού συστήματος αναφοράς.
type: docs
weight: 2270
url: /el/net/aspose.gis.spatialreferencing/spatialreferencesystemtype/
---
## SpatialReferenceSystemType enumeration

Αντιπροσωπεύει τύπο χωρικού συστήματος αναφοράς.

```csharp
public enum SpatialReferenceSystemType
```

### Αξίες

| Ονομα | αξία | Περιγραφή |
| --- | --- | --- |
| Unknown | `0` | Προεπιλεγμένη τιμή. Μπορεί να επιστραφεί από[`Type`](../spatialreferencesystem/type/) εάν πρόκειται για σύνθετο SRS με μη έγκυρο συνδυασμό υποκείμενων SRS. Βλέπω[`IsCompound`](../spatialreferencesystem/iscompound/) . |
| Geographic | `1` | Το Το γεωγραφικό SRS βασίζεται στο γωνιακό γεωγραφικό μήκος και το γωνιακό γεωγραφικό πλάτος. Το γεωγραφικό SRS μπορεί να μετατραπεί σε[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/) μέσω[`AsGeographic`](../spatialreferencesystem/asgeographic/) μέθοδος. |
| Geocentric | `2` | Το Geocentric SRS είναι τρισδιάστατο καρτεσιανό SRS με αρχή στο κέντρο της Γης. Το Geocentric SRS μπορεί να μετατραπεί σε[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) μέσω[`AsGeocentric`](../spatialreferencesystem/asgeocentric/) μέθοδος. |
| Projected | `3` | Το προβαλλόμενο SRS βασίζεται στη γραμμική Χ και στη γραμμική Υ. Είναι το αποτέλεσμα εφαρμογής μιας προβολής σεGeographic SRS. Το προβαλλόμενο SRS μπορεί να μετατραπεί σε[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/) μέσω[`AsProjected`](../spatialreferencesystem/asprojected/) μέθοδος. |
| Vertical | `4` | Το Το κάθετο SRS περιγράφει τη γραμμική συντεταγμένη ύψους. Το κατακόρυφο SRS μπορεί να μετατραπεί σε[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) μέσω[`AsVertical`](../spatialreferencesystem/asvertical/) μέθοδος. |
| Local | `5` | Το Το τοπικό SRS συσχετίζει τις συντεταγμένες με κάποιο αντικείμενο, άλλο το Γη. Το τοπικό SRS μπορεί να μετατραπεί σε[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) μέσω[`AsLocal`](../spatialreferencesystem/aslocal/) μέθοδος. |

### Δείτε επίσης

* χώρος ονομάτων [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* συνέλευση [Aspose.GIS](../../)


