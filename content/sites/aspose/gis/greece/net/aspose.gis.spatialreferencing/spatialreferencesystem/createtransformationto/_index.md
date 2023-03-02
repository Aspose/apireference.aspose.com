---
title: SpatialReferenceSystem.CreateTransformationTo
second_title: Αναφορά Aspose.GIS για .NET API
description: SpatialReferenceSystem μέθοδος. Δημιουργεί μετασχηματισμό από αυτόSpatialReferenceSystem σε άλλοSpatialReferenceSystem .
type: docs
weight: 180
url: /el/net/aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/
---
## SpatialReferenceSystem.CreateTransformationTo method

Δημιουργεί μετασχηματισμό από αυτό`SpatialReferenceSystem` σε άλλο`SpatialReferenceSystem` .

```csharp
public SpatialReferenceSystemTransformation CreateTransformationTo(SpatialReferenceSystem targetSrs)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| targetSrs | SpatialReferenceSystem | Αλλο`SpatialReferenceSystem`. |

### Επιστρεφόμενη Αξία

Μεταμόρφωση από αυτό`SpatialReferenceSystem` σε άλλο`SpatialReferenceSystem`.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| NotSupportedException | Μετασχηματισμός μεταξύ αυτού`SpatialReferenceSystem` και το όρισμα δεν υποστηρίζεται. Αυτό μπορεί να συμβεί, επειδή μια από τις προβολές δεν υποστηρίζεται ή ένα από τα συστήματα είναι[`VerticalSpatialReferenceSystem`](../../verticalspatialreferencesystem/) ή [`LocalSpatialReferenceSystem`](../../localspatialreferencesystem/) . |
| [TransformationException](../../transformationexception/) | Ο μετασχηματισμός απέτυχε να δημιουργηθεί λόγω εσφαλμένων παραμέτρων στο εσωτερικό`SpatialReferenceSystem` . |

### Δείτε επίσης

* method [TryCreateTransformationTo](../trycreatetransformationto/)
* class [SpatialReferenceSystemTransformation](../../spatialreferencesystemtransformation/)
* class [SpatialReferenceSystem](../)
* χώρος ονομάτων [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* συνέλευση [Aspose.GIS](../../../)


