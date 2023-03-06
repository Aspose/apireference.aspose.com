---
title: SpatialReferenceSystem.CreateFromWkt
second_title: Αναφορά Aspose.GIS για .NET API
description: SpatialReferenceSystem μέθοδος. Δημιουργεί ένα νέοSpatialReferenceSystem με βάση τη συμβολοσειρά WKT Γνωστό Κείμενο.
type: docs
weight: 20
url: /el/net/aspose.gis.spatialreferencing/spatialreferencesystem/createfromwkt/
---
## SpatialReferenceSystem.CreateFromWkt method

Δημιουργεί ένα νέο`SpatialReferenceSystem` με βάση τη συμβολοσειρά WKT (Γνωστό Κείμενο).

```csharp
public static SpatialReferenceSystem CreateFromWkt(string wkt)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| wkt | String | Χορδή WKT. |

### Επιστρεφόμενη Αξία

Νέος`SpatialReferenceSystem` .

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Επιχείρημα είναι`null` . |
| FormatException | Η ιεραρχία των τιμών wkt, η σειρά ή οι τύποι τους, είναι λάθος. |
| NotSupportedException | Το ριζικό στοιχείο WKT δεν υποστηρίζεται (για παράδειγμα είναι FITTED_CS). |

### Δείτε επίσης

* method [TryCreateFromWkt](../trycreatefromwkt/)
* class [SpatialReferenceSystem](../)
* χώρος ονομάτων [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* συνέλευση [Aspose.GIS](../../../)


