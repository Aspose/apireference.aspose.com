---
title: FileDriver.OpenDataset
second_title: Αναφορά Aspose.GIS για .NET API
description: FileDriver μέθοδος. Ανοίγει το σύνολο δεδομένων.
type: docs
weight: 80
url: /el/net/aspose.gis/filedriver/opendataset/
---
## OpenDataset(string) {#opendataset_2}

Ανοίγει το σύνολο δεδομένων.

```csharp
public Dataset OpenDataset(string path)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| path | String | Διαδρομή προς το σύνολο δεδομένων. |

### Επιστρεφόμενη Αξία

Ένα παράδειγμα του[`Dataset`](../../dataset/).

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Το μονοπάτι είναι`null`. |
| [GisException](../../gisexception/) | Σφάλμα κατά την ανάγνωση του συνόλου δεδομένων. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |
| NotSupportedException | Το πρόγραμμα οδήγησης δεν μπορεί να ανοίξει σύνολα δεδομένων (βλ[`CanOpenDatasets`](../canopendatasets/)). |

### Δείτε επίσης

* class [Dataset](../../dataset/)
* class [FileDriver](../)
* χώρος ονομάτων [Aspose.Gis](../../filedriver/)
* συνέλευση [Aspose.GIS](../../../)

---

## OpenDataset(AbstractPath) {#opendataset}

Ανοίγει το σύνολο δεδομένων.

```csharp
public Dataset OpenDataset(AbstractPath path)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| path | AbstractPath | Διαδρομή προς το σύνολο δεδομένων. |

### Επιστρεφόμενη Αξία

Ένα παράδειγμα του[`Dataset`](../../dataset/).

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Το μονοπάτι είναι`null`. |
| [GisException](../../gisexception/) | Σφάλμα κατά την ανάγνωση του συνόλου δεδομένων. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |
| NotSupportedException | Το πρόγραμμα οδήγησης δεν μπορεί να ανοίξει σύνολα δεδομένων (βλ[`CanOpenDatasets`](../canopendatasets/)). |

### Δείτε επίσης

* class [Dataset](../../dataset/)
* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../)
* χώρος ονομάτων [Aspose.Gis](../../filedriver/)
* συνέλευση [Aspose.GIS](../../../)

---

## OpenDataset(string, DriverOptions) {#opendataset_3}

Ανοίγει το σύνολο δεδομένων.

```csharp
public Dataset OpenDataset(string path, DriverOptions options)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| path | String | Διαδρομή προς το σύνολο δεδομένων. |
| options | DriverOptions | Επιλογές για συγκεκριμένα προγράμματα οδήγησης. |

### Επιστρεφόμενη Αξία

Ένα παράδειγμα του[`Dataset`](../../dataset/).

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentException | Το αντικείμενο Options έχει λανθασμένο τύπο για αυτό το πρόγραμμα οδήγησης. |
| ArgumentNullException | Το μονοπάτι είναι`null`. |
| [GisException](../../gisexception/) | Σφάλμα κατά την ανάγνωση του συνόλου δεδομένων. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |
| NotSupportedException | Το πρόγραμμα οδήγησης δεν μπορεί να ανοίξει σύνολα δεδομένων (βλ[`CanOpenDatasets`](../canopendatasets/)). |

### Δείτε επίσης

* class [Dataset](../../dataset/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* χώρος ονομάτων [Aspose.Gis](../../filedriver/)
* συνέλευση [Aspose.GIS](../../../)

---

## OpenDataset(AbstractPath, DriverOptions) {#opendataset_1}

Ανοίγει το σύνολο δεδομένων.

```csharp
public virtual Dataset OpenDataset(AbstractPath path, DriverOptions options)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| path | AbstractPath | Διαδρομή προς το σύνολο δεδομένων. |
| options | DriverOptions | Επιλογές για συγκεκριμένα προγράμματα οδήγησης. |

### Επιστρεφόμενη Αξία

Ένα παράδειγμα του[`Dataset`](../../dataset/).

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentException | Το αντικείμενο Options έχει λανθασμένο τύπο για αυτό το πρόγραμμα οδήγησης. |
| ArgumentNullException | Το μονοπάτι είναι`null`. |
| [GisException](../../gisexception/) | Σφάλμα κατά την ανάγνωση του συνόλου δεδομένων. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |
| NotSupportedException | Το πρόγραμμα οδήγησης δεν μπορεί να ανοίξει σύνολα δεδομένων (βλ[`CanOpenDatasets`](../canopendatasets/)). |

### Δείτε επίσης

* class [Dataset](../../dataset/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* χώρος ονομάτων [Aspose.Gis](../../filedriver/)
* συνέλευση [Aspose.GIS](../../../)


