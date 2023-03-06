---
title: GeographicDatum.GeographicDatum
second_title: Αναφορά Aspose.GIS για .NET API
description: GeographicDatum κατασκευαστής. Δημιουργεί νέα παρουσία.
type: docs
weight: 10
url: /el/net/aspose.gis.spatialreferencing/geographicdatum/geographicdatum/
---
## GeographicDatum constructor

Δημιουργεί νέα παρουσία.

```csharp
public GeographicDatum(string name, Ellipsoid ellipsoid, 
    BursaWolfParameters toWgs84Parameters = null, Identifier identifier = null)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| name | String | Όνομα αυτού του δεδομένου. |
| ellipsoid | Ellipsoid | Ελλειψοειδές αυτού του δεδομένου. Δεν μπορεί να είναι μηδενικό. |
| toWgs84Parameters | BursaWolfParameters | Παράμετροι, που μπορούν να δοθούν στον τύπο λύκου bursa, για μετατροπή συντεταγμένων σε αυτό το δεδομένο σε συντεταγμένες στο σημείο αναφοράς WGS84. Εάν αυτό το δεδομένο είναι κοντά στο WGS84 και δεν χρειάζεται μετασχηματισμός, περάστε τις παραμέτρους του λύκου bursa με όλες τις τιμές ρυθμισμένες σε 0. null, το ToWgs84 θα οριστεί σε[`IsNull`](../../bursawolfparameters/isnull/) παράμετροι. |
| identifier | Identifier | Αναγνωριστικό αυτού του δεδομένου. |

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | ellipsoid είναι μηδενικό. |

### Δείτε επίσης

* class [Ellipsoid](../../ellipsoid/)
* class [BursaWolfParameters](../../bursawolfparameters/)
* class [Identifier](../../identifier/)
* class [GeographicDatum](../)
* χώρος ονομάτων [Aspose.Gis.SpatialReferencing](../../geographicdatum/)
* συνέλευση [Aspose.GIS](../../../)


