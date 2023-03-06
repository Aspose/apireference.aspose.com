---
title: FileDriver.CreateDataset
second_title: Αναφορά Aspose.GIS για .NET API
description: FileDriver μέθοδος. Δημιουργεί ένα σύνολο δεδομένων.
type: docs
weight: 50
url: /el/net/aspose.gis/filedriver/createdataset/
---
## CreateDataset(string) {#createdataset_2}

Δημιουργεί ένα σύνολο δεδομένων.

```csharp
public Dataset CreateDataset(string path)
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
| [GisException](../../gisexception/) | Σφάλμα κατά τη δημιουργία του συνόλου δεδομένων. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |
| NotSupportedException | Το πρόγραμμα οδήγησης δεν μπορεί να ανοίξει σύνολα δεδομένων (βλ[`CanOpenDatasets`](../canopendatasets/)). |
| InvalidOperationException | Το σύνολο δεδομένων υπάρχει ήδη. |

### Δείτε επίσης

* class [Dataset](../../dataset/)
* class [FileDriver](../)
* χώρος ονομάτων [Aspose.Gis](../../filedriver/)
* συνέλευση [Aspose.GIS](../../../)

---

## CreateDataset(AbstractPath) {#createdataset}

Δημιουργεί ένα σύνολο δεδομένων.

```csharp
public Dataset CreateDataset(AbstractPath path)
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
| [GisException](../../gisexception/) | Σφάλμα κατά τη δημιουργία του συνόλου δεδομένων. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |
| NotSupportedException | Το πρόγραμμα οδήγησης δεν μπορεί να ανοίξει σύνολα δεδομένων (βλ[`CanOpenDatasets`](../canopendatasets/)). |
| InvalidOperationException | Το σύνολο δεδομένων υπάρχει ήδη. |

### Δείτε επίσης

* class [Dataset](../../dataset/)
* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../)
* χώρος ονομάτων [Aspose.Gis](../../filedriver/)
* συνέλευση [Aspose.GIS](../../../)

---

## CreateDataset(string, DriverOptions) {#createdataset_3}

Δημιουργεί ένα σύνολο δεδομένων.

```csharp
public Dataset CreateDataset(string path, DriverOptions options)
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
| [GisException](../../gisexception/) | Σφάλμα κατά τη δημιουργία του συνόλου δεδομένων. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |
| NotSupportedException | Το πρόγραμμα οδήγησης δεν μπορεί να ανοίξει σύνολα δεδομένων (βλ[`CanOpenDatasets`](../canopendatasets/)). |
| InvalidOperationException | Το σύνολο δεδομένων υπάρχει ήδη. |

### Δείτε επίσης

* class [Dataset](../../dataset/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* χώρος ονομάτων [Aspose.Gis](../../filedriver/)
* συνέλευση [Aspose.GIS](../../../)

---

## CreateDataset(AbstractPath, DriverOptions) {#createdataset_1}

Δημιουργεί ένα σύνολο δεδομένων.

```csharp
public virtual Dataset CreateDataset(AbstractPath path, DriverOptions options)
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
| [GisException](../../gisexception/) | Σφάλμα κατά τη δημιουργία του συνόλου δεδομένων. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |
| NotSupportedException | Το πρόγραμμα οδήγησης δεν μπορεί να ανοίξει σύνολα δεδομένων (βλ[`CanOpenDatasets`](../canopendatasets/)). |
| InvalidOperationException | Το σύνολο δεδομένων υπάρχει ήδη. |

### Δείτε επίσης

* class [Dataset](../../dataset/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* χώρος ονομάτων [Aspose.Gis](../../filedriver/)
* συνέλευση [Aspose.GIS](../../../)


