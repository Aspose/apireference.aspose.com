---
title: GdalDriver.CreateLayer
second_title: Αναφορά Aspose.GIS για .NET API
description: GdalDriver μέθοδος. Δημιουργεί ένα επίπεδο και το ανοίγει για την προσθήκη νέων χαρακτηριστικών.
type: docs
weight: 40
url: /el/net/aspose.gis.formats.gdal/gdaldriver/createlayer/
---
## GdalDriver.CreateLayer method

Δημιουργεί ένα επίπεδο και το ανοίγει για την προσθήκη νέων χαρακτηριστικών.

```csharp
public override VectorLayer CreateLayer(AbstractPath path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| path | AbstractPath | Διαδρομή προς το αρχείο. |
| options | DriverOptions | Επιλογές για συγκεκριμένα προγράμματα οδήγησης. |
| spatialReferenceSystem | SpatialReferenceSystem | Χωρικό σύστημα αναφοράς. |

### Επιστρεφόμενη Αξία

Ένα παράδειγμα του[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| InvalidOperationException | Το επίπεδο υπάρχει ήδη. |
| NotSupportedException | Το σύστημα χωρικής αναφοράς δεν υποστηρίζεται από το πρόγραμμα οδήγησης. |

### Δείτε επίσης

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [DriverOptions](../../../aspose.gis/driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [GdalDriver](../)
* χώρος ονομάτων [Aspose.Gis.Formats.GDAL](../../gdaldriver/)
* συνέλευση [Aspose.GIS](../../../)


