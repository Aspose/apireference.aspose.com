---
title: Dataset.OpenLayer
second_title: Αναφορά Aspose.GIS για .NET API
description: Dataset μέθοδος. Ανοίγει το επίπεδο με καθορισμένο όνομα για ανάγνωση.
type: docs
weight: 110
url: /el/net/aspose.gis/dataset/openlayer/
---
## Dataset.OpenLayer method

Ανοίγει το επίπεδο με καθορισμένο όνομα για ανάγνωση.

```csharp
public abstract VectorLayer OpenLayer(string name, DriverOptions options = null)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| name | String | Όνομα του επιπέδου προς άνοιγμα. |
| options | DriverOptions | Ανοίξτε τις επιλογές. |

### Επιστρεφόμενη Αξία

Το επίπεδο άνοιξε για ανάγνωση.

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
* class [Dataset](../)
* χώρος ονομάτων [Aspose.Gis](../../dataset/)
* συνέλευση [Aspose.GIS](../../../)


