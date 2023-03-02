---
title: Dataset.OpenLayerAt
second_title: Αναφορά Aspose.GIS για .NET API
description: Dataset μέθοδος. Ανοίγει το επίπεδο σε καθορισμένο ευρετήριο για ανάγνωση.
type: docs
weight: 120
url: /el/net/aspose.gis/dataset/openlayerat/
---
## Dataset.OpenLayerAt method

Ανοίγει το επίπεδο σε καθορισμένο ευρετήριο για ανάγνωση.

```csharp
public abstract VectorLayer OpenLayerAt(int index, DriverOptions options = null)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| index | Int32 | Ευρετήριο του επιπέδου προς άνοιγμα. |
| options | DriverOptions | Ανοίξτε τις επιλογές. |

### Επιστρεφόμενη Αξία

Το επίπεδο άνοιξε για ανάγνωση.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentException | Το αντικείμενο Options έχει λανθασμένο τύπο για αυτό το σύνολο δεδομένων. |
| ArgumentOutOfRangeException | Ο δείκτης είναι εκτός εύρους |
| ArgumentException | Το αντικείμενο Options έχει λανθασμένο τύπο για αυτό το σύνολο δεδομένων. |
| [GisException](../../gisexception/) | Σφάλμα κατά την ανάγνωση της δυνατότητας από το επίπεδο. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |

### Δείτε επίσης

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [Dataset](../)
* χώρος ονομάτων [Aspose.Gis](../../dataset/)
* συνέλευση [Aspose.GIS](../../../)


