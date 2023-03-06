---
title: FileDriver.CreateLayer
second_title: Αναφορά Aspose.GIS για .NET API
description: FileDriver μέθοδος. Δημιουργεί το επίπεδο και το ανοίγει για προσάρτηση.
type: docs
weight: 60
url: /el/net/aspose.gis/filedriver/createlayer/
---
## CreateLayer(string) {#createlayer_4}

Δημιουργεί το επίπεδο και το ανοίγει για προσάρτηση.

```csharp
public VectorLayer CreateLayer(string path)
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
| [GisException](../../gisexception/) | Σφάλμα κατά την εγγραφή της δυνατότητας στο αρχείο. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |
| NotSupportedException | Το πρόγραμμα οδήγησης δεν μπορεί να δημιουργήσει διανυσματικά επίπεδα (βλ[`CanCreateLayers`](../cancreatelayers/)). |

### Δείτε επίσης

* class [VectorLayer](../../vectorlayer/)
* class [FileDriver](../)
* χώρος ονομάτων [Aspose.Gis](../../filedriver/)
* συνέλευση [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath) {#createlayer}

Δημιουργεί το επίπεδο και το ανοίγει για προσάρτηση.

```csharp
public VectorLayer CreateLayer(AbstractPath path)
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
| [GisException](../../gisexception/) | Σφάλμα κατά την εγγραφή της δυνατότητας στο αρχείο. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |
| NotSupportedException | Το πρόγραμμα οδήγησης δεν μπορεί να δημιουργήσει διανυσματικά επίπεδα (βλ[`CanCreateLayers`](../cancreatelayers/)). |

### Δείτε επίσης

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../)
* χώρος ονομάτων [Aspose.Gis](../../filedriver/)
* συνέλευση [Aspose.GIS](../../../)

---

## CreateLayer(string, DriverOptions) {#createlayer_5}

Δημιουργεί το επίπεδο και το ανοίγει για προσάρτηση.

```csharp
public VectorLayer CreateLayer(string path, DriverOptions options)
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
| ArgumentNullException | Το μονοπάτι είναι`null`. |
| ArgumentException | Το αντικείμενο Options έχει λανθασμένο τύπο για αυτό το πρόγραμμα οδήγησης. |
| [GisException](../../gisexception/) | Σφάλμα κατά την εγγραφή της δυνατότητας στο αρχείο. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |
| NotSupportedException | Το πρόγραμμα οδήγησης δεν μπορεί να δημιουργήσει διανυσματικά επίπεδα (βλ[`CanCreateLayers`](../cancreatelayers/)). |

### Δείτε επίσης

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* χώρος ονομάτων [Aspose.Gis](../../filedriver/)
* συνέλευση [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, DriverOptions) {#createlayer_1}

Δημιουργεί το επίπεδο και το ανοίγει για προσάρτηση.

```csharp
public VectorLayer CreateLayer(AbstractPath path, DriverOptions options)
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
| ArgumentNullException | Το μονοπάτι είναι`null`. |
| ArgumentException | Το αντικείμενο Options έχει λανθασμένο τύπο για αυτό το πρόγραμμα οδήγησης. |
| [GisException](../../gisexception/) | Σφάλμα κατά την εγγραφή της δυνατότητας στο αρχείο. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |
| NotSupportedException | Το πρόγραμμα οδήγησης δεν μπορεί να δημιουργήσει διανυσματικά επίπεδα (βλ[`CanCreateLayers`](../cancreatelayers/)). |

### Δείτε επίσης

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* χώρος ονομάτων [Aspose.Gis](../../filedriver/)
* συνέλευση [Aspose.GIS](../../../)

---

## CreateLayer(string, SpatialReferenceSystem) {#createlayer_7}

Δημιουργεί το επίπεδο και το ανοίγει για προσάρτηση.

```csharp
public VectorLayer CreateLayer(string path, SpatialReferenceSystem spatialReferenceSystem)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| path | String | Διαδρομή προς το αρχείο. |
| spatialReferenceSystem | SpatialReferenceSystem | Χωρικό σύστημα αναφοράς. |

### Επιστρεφόμενη Αξία

Ένα παράδειγμα του[`VectorLayer`](../../vectorlayer/).

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Το μονοπάτι είναι`null`. |
| [GisException](../../gisexception/) | Σφάλμα κατά την εγγραφή της δυνατότητας στο αρχείο. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |
| NotSupportedException | Το σύστημα χωρικής αναφοράς δεν υποστηρίζεται από το πρόγραμμα οδήγησης. Χρήση[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem/) για να ελέγξετε εάν υποστηρίζεται σύστημα χωρικής αναφοράς. |

### Δείτε επίσης

* class [VectorLayer](../../vectorlayer/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* χώρος ονομάτων [Aspose.Gis](../../filedriver/)
* συνέλευση [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, SpatialReferenceSystem) {#createlayer_3}

Δημιουργεί το επίπεδο και το ανοίγει για προσάρτηση.

```csharp
public VectorLayer CreateLayer(AbstractPath path, SpatialReferenceSystem spatialReferenceSystem)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| path | AbstractPath | Διαδρομή προς το αρχείο. |
| spatialReferenceSystem | SpatialReferenceSystem | Χωρικό σύστημα αναφοράς. |

### Επιστρεφόμενη Αξία

Ένα παράδειγμα του[`VectorLayer`](../../vectorlayer/).

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Το μονοπάτι είναι`null`. |
| [GisException](../../gisexception/) | Σφάλμα κατά την εγγραφή της δυνατότητας στο αρχείο. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |
| NotSupportedException | Το σύστημα χωρικής αναφοράς δεν υποστηρίζεται από το πρόγραμμα οδήγησης. Χρήση[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem/) για να ελέγξετε εάν υποστηρίζεται σύστημα χωρικής αναφοράς. |

### Δείτε επίσης

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* χώρος ονομάτων [Aspose.Gis](../../filedriver/)
* συνέλευση [Aspose.GIS](../../../)

---

## CreateLayer(string, DriverOptions, SpatialReferenceSystem) {#createlayer_6}

Δημιουργεί το επίπεδο και το ανοίγει για προσάρτηση.

```csharp
public VectorLayer CreateLayer(string path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| path | String | Διαδρομή προς το αρχείο. |
| options | DriverOptions | Επιλογές για συγκεκριμένα προγράμματα οδήγησης. |
| spatialReferenceSystem | SpatialReferenceSystem | Χωρικό σύστημα αναφοράς. |

### Επιστρεφόμενη Αξία

Ένα παράδειγμα του[`VectorLayer`](../../vectorlayer/).

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Το μονοπάτι είναι`null`. |
| ArgumentException | Το αντικείμενο Options έχει λανθασμένο τύπο για αυτό το πρόγραμμα οδήγησης. |
| [GisException](../../gisexception/) | Σφάλμα κατά την εγγραφή της δυνατότητας στο αρχείο. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |
| NotSupportedException | Το σύστημα χωρικής αναφοράς δεν υποστηρίζεται από το πρόγραμμα οδήγησης. Χρήση[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem/) για να ελέγξετε εάν υποστηρίζεται σύστημα χωρικής αναφοράς. |
| NotSupportedException | Το πρόγραμμα οδήγησης δεν μπορεί να δημιουργήσει διανυσματικά επίπεδα (βλ[`CanCreateLayers`](../cancreatelayers/)). |

### Δείτε επίσης

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* χώρος ονομάτων [Aspose.Gis](../../filedriver/)
* συνέλευση [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, DriverOptions, SpatialReferenceSystem) {#createlayer_2}

Δημιουργεί το επίπεδο και το ανοίγει για προσάρτηση.

```csharp
public abstract VectorLayer CreateLayer(AbstractPath path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| path | AbstractPath | Διαδρομή προς το αρχείο. |
| options | DriverOptions | Επιλογές για συγκεκριμένα προγράμματα οδήγησης. |
| spatialReferenceSystem | SpatialReferenceSystem | Χωρικό σύστημα αναφοράς. |

### Επιστρεφόμενη Αξία

Ένα παράδειγμα του[`VectorLayer`](../../vectorlayer/).

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Το μονοπάτι είναι`null`. |
| ArgumentException | Το αντικείμενο Options έχει λανθασμένο τύπο για αυτό το πρόγραμμα οδήγησης. |
| [GisException](../../gisexception/) | Σφάλμα κατά την εγγραφή της δυνατότητας στο αρχείο. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |
| NotSupportedException | Το σύστημα χωρικής αναφοράς δεν υποστηρίζεται από το πρόγραμμα οδήγησης. Χρήση[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem/) για να ελέγξετε εάν υποστηρίζεται σύστημα χωρικής αναφοράς. |
| NotSupportedException | Το πρόγραμμα οδήγησης δεν μπορεί να δημιουργήσει διανυσματικά επίπεδα (βλ[`CanCreateLayers`](../cancreatelayers/)). |

### Δείτε επίσης

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* χώρος ονομάτων [Aspose.Gis](../../filedriver/)
* συνέλευση [Aspose.GIS](../../../)


