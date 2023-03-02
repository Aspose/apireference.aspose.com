---
title: Dataset.CreateLayer
second_title: Αναφορά Aspose.GIS για .NET API
description: Dataset μέθοδος. Δημιουργεί ένα νέο διανυσματικό επίπεδο και το ανοίγει για προσάρτηση.
type: docs
weight: 70
url: /el/net/aspose.gis/dataset/createlayer/
---
## CreateLayer() {#createlayer}

Δημιουργεί ένα νέο διανυσματικό επίπεδο και το ανοίγει για προσάρτηση.

```csharp
public virtual VectorLayer CreateLayer()
```

### Επιστρεφόμενη Αξία

ΕΝΑ[`VectorLayer`](../../vectorlayer/) άνοιξε για γραφή.

### Δείτε επίσης

* class [VectorLayer](../../vectorlayer/)
* class [Dataset](../)
* χώρος ονομάτων [Aspose.Gis](../../dataset/)
* συνέλευση [Aspose.GIS](../../../)

---

## CreateLayer(SpatialReferenceSystem) {#createlayer_2}

Δημιουργεί ένα νέο διανυσματικό επίπεδο και το ανοίγει για προσάρτηση.

```csharp
public virtual VectorLayer CreateLayer(SpatialReferenceSystem spatialReferenceSystem)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| spatialReferenceSystem | SpatialReferenceSystem | Χωρικό σύστημα αναφοράς του νέου στρώματος. |

### Επιστρεφόμενη Αξία

ΕΝΑ[`VectorLayer`](../../vectorlayer/) άνοιξε για γραφή.

### Δείτε επίσης

* class [VectorLayer](../../vectorlayer/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Dataset](../)
* χώρος ονομάτων [Aspose.Gis](../../dataset/)
* συνέλευση [Aspose.GIS](../../../)

---

## CreateLayer(DriverOptions, SpatialReferenceSystem) {#createlayer_1}

Δημιουργεί ένα νέο διανυσματικό επίπεδο και το ανοίγει για προσάρτηση.

```csharp
public virtual VectorLayer CreateLayer(DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem = null)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| options | DriverOptions | Ανοίξτε τις επιλογές. |
| spatialReferenceSystem | SpatialReferenceSystem | Χωρικό σύστημα αναφοράς του νέου στρώματος. |

### Επιστρεφόμενη Αξία

ΕΝΑ[`VectorLayer`](../../vectorlayer/) άνοιξε για γραφή.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| NotSupportedException | Η δημιουργία επιπέδου δεν υποστηρίζεται για αυτό το σύνολο δεδομένων. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |
| [GisException](../../gisexception/) | Σφάλμα κατά τη δημιουργία του επιπέδου. |

### Δείτε επίσης

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Dataset](../)
* χώρος ονομάτων [Aspose.Gis](../../dataset/)
* συνέλευση [Aspose.GIS](../../../)

---

## CreateLayer(string, SpatialReferenceSystem) {#createlayer_4}

Δημιουργεί ένα νέο διανυσματικό επίπεδο με καθορισμένο όνομα και το ανοίγει για προσάρτηση.

```csharp
public virtual VectorLayer CreateLayer(string name, 
    SpatialReferenceSystem spatialReferenceSystem = null)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| name | String | Όνομα του στρώματος. |
| spatialReferenceSystem | SpatialReferenceSystem | Χωρικό σύστημα αναφοράς του νέου στρώματος. |

### Επιστρεφόμενη Αξία

ΕΝΑ[`VectorLayer`](../../vectorlayer/) άνοιξε για γραφή.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| NotSupportedException | Η δημιουργία επιπέδου δεν υποστηρίζεται για αυτό το σύνολο δεδομένων. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |
| [GisException](../../gisexception/) | Σφάλμα κατά τη δημιουργία του επιπέδου. |

### Δείτε επίσης

* class [VectorLayer](../../vectorlayer/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Dataset](../)
* χώρος ονομάτων [Aspose.Gis](../../dataset/)
* συνέλευση [Aspose.GIS](../../../)

---

## CreateLayer(string, DriverOptions, SpatialReferenceSystem) {#createlayer_3}

Δημιουργεί ένα νέο διανυσματικό επίπεδο με καθορισμένο όνομα και το ανοίγει για προσάρτηση.

```csharp
public virtual VectorLayer CreateLayer(string name, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem = null)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| name | String | Όνομα του στρώματος. |
| options | DriverOptions | Ανοίξτε τις επιλογές. |
| spatialReferenceSystem | SpatialReferenceSystem | Χωρικό σύστημα αναφοράς του νέου στρώματος. |

### Επιστρεφόμενη Αξία

ΕΝΑ[`VectorLayer`](../../vectorlayer/) άνοιξε για γραφή.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| NotSupportedException | Η δημιουργία επιπέδου δεν υποστηρίζεται για αυτό το σύνολο δεδομένων. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |
| [GisException](../../gisexception/) | Σφάλμα κατά τη δημιουργία του επιπέδου. |

### Δείτε επίσης

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Dataset](../)
* χώρος ονομάτων [Aspose.Gis](../../dataset/)
* συνέλευση [Aspose.GIS](../../../)


