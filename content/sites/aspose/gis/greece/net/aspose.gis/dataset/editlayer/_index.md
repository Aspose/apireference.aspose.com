---
title: Dataset.EditLayer
second_title: Αναφορά Aspose.GIS για .NET API
description: Dataset μέθοδος. Ανοίγει το επίπεδο με καθορισμένο όνομα για επεξεργασία.
type: docs
weight: 90
url: /el/net/aspose.gis/dataset/editlayer/
---
## Dataset.EditLayer method

Ανοίγει το επίπεδο με καθορισμένο όνομα για επεξεργασία.

```csharp
public abstract VectorLayer EditLayer(string name, DriverOptions options = null, 
    SpatialReferenceSystem spatialReferenceSystem = null)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| name | String | Όνομα του επιπέδου προς επεξεργασία. |
| options | DriverOptions | Ανοίξτε τις επιλογές. |
| spatialReferenceSystem | SpatialReferenceSystem | Χωρικό σύστημα αναφοράς για νέες γεωμετρίες. |

### Επιστρεφόμενη Αξία

Το επίπεδο άνοιξε για επεξεργασία.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentException | Δεν υπάρχει επίπεδο με καθορισμένο όνομα. Το αντικείμενο Options έχει λανθασμένο τύπο για αυτό το σύνολο δεδομένων. |
| ArgumentException | Το αντικείμενο Options έχει λανθασμένο τύπο για αυτό το σύνολο δεδομένων. |
| ArgumentNullException | Το όνομα είναι`null`. |
| [GisException](../../gisexception/) | Σφάλμα κατά την ανάγνωση της δυνατότητας από το επίπεδο. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |

### Δείτε επίσης

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Dataset](../)
* χώρος ονομάτων [Aspose.Gis](../../dataset/)
* συνέλευση [Aspose.GIS](../../../)


