---
title: FileDriver.OpenLayer
second_title: Αναφορά Aspose.GIS για .NET API
description: FileDriver μέθοδος. Ανοίγει το επίπεδο για ανάγνωση.
type: docs
weight: 90
url: /el/net/aspose.gis/filedriver/openlayer/
---
## OpenLayer(string) {#openlayer_2}

Ανοίγει το επίπεδο για ανάγνωση.

```csharp
public VectorLayer OpenLayer(string path)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| path | String | Διαδρομή προς το αρχείο. |

### Επιστρεφόμενη Αξία

Ένα παράδειγμα του[`VectorLayer`](../../vectorlayer/).

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Το μονοπάτι είναι`null`. |
| [GisException](../../gisexception/) | Σφάλμα κατά την ανάγνωση της δυνατότητας από το αρχείο. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |
| NotSupportedException | Το πρόγραμμα οδήγησης δεν μπορεί να ανοίξει διανυσματικά επίπεδα (βλ[`CanOpenLayers`](../canopenlayers/)). |

### Δείτε επίσης

* class [VectorLayer](../../vectorlayer/)
* class [FileDriver](../)
* χώρος ονομάτων [Aspose.Gis](../../filedriver/)
* συνέλευση [Aspose.GIS](../../../)

---

## OpenLayer(AbstractPath) {#openlayer}

Ανοίγει το επίπεδο για ανάγνωση.

```csharp
public VectorLayer OpenLayer(AbstractPath path)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| path | AbstractPath | Διαδρομή προς το αρχείο. |

### Επιστρεφόμενη Αξία

Ένα παράδειγμα του[`VectorLayer`](../../vectorlayer/).

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Το μονοπάτι είναι`null`. |
| [GisException](../../gisexception/) | Σφάλμα κατά την ανάγνωση της δυνατότητας από το αρχείο. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |
| NotSupportedException | Το πρόγραμμα οδήγησης δεν μπορεί να ανοίξει διανυσματικά επίπεδα (βλ[`CanOpenLayers`](../canopenlayers/)). |

### Δείτε επίσης

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../)
* χώρος ονομάτων [Aspose.Gis](../../filedriver/)
* συνέλευση [Aspose.GIS](../../../)

---

## OpenLayer(string, DriverOptions) {#openlayer_3}

Ανοίγει το επίπεδο για ανάγνωση.

```csharp
public VectorLayer OpenLayer(string path, DriverOptions options)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| path | String | Διαδρομή προς το αρχείο. |
| options | DriverOptions | Επιλογές για συγκεκριμένα προγράμματα οδήγησης. |

### Επιστρεφόμενη Αξία

Ένα παράδειγμα του[`VectorLayer`](../../vectorlayer/).

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentException | Το αντικείμενο Options έχει λανθασμένο τύπο για αυτό το πρόγραμμα οδήγησης. |
| ArgumentNullException | Το μονοπάτι είναι`null`. |
| [GisException](../../gisexception/) | Σφάλμα κατά την ανάγνωση της δυνατότητας από το αρχείο. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |
| NotSupportedException | Το πρόγραμμα οδήγησης δεν μπορεί να ανοίξει διανυσματικά επίπεδα (βλ[`CanOpenLayers`](../canopenlayers/)). |

### Δείτε επίσης

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* χώρος ονομάτων [Aspose.Gis](../../filedriver/)
* συνέλευση [Aspose.GIS](../../../)

---

## OpenLayer(AbstractPath, DriverOptions) {#openlayer_1}

Ανοίγει το επίπεδο για ανάγνωση.

```csharp
public abstract VectorLayer OpenLayer(AbstractPath path, DriverOptions options)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| path | AbstractPath | Διαδρομή προς το αρχείο. |
| options | DriverOptions | Επιλογές για συγκεκριμένα προγράμματα οδήγησης. |

### Επιστρεφόμενη Αξία

Ένα παράδειγμα του[`VectorLayer`](../../vectorlayer/).

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentException | Το αντικείμενο Options έχει λανθασμένο τύπο για αυτό το πρόγραμμα οδήγησης. |
| ArgumentNullException | Το μονοπάτι είναι`null`. |
| [GisException](../../gisexception/) | Σφάλμα κατά την ανάγνωση της δυνατότητας από το αρχείο. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |
| NotSupportedException | Το πρόγραμμα οδήγησης δεν μπορεί να ανοίξει διανυσματικά επίπεδα (βλ[`CanOpenLayers`](../canopenlayers/)). |

### Δείτε επίσης

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* χώρος ονομάτων [Aspose.Gis](../../filedriver/)
* συνέλευση [Aspose.GIS](../../../)


