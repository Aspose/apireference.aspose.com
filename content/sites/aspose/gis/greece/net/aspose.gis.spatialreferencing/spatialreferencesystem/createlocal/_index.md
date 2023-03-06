---
title: SpatialReferenceSystem.CreateLocal
second_title: Αναφορά Aspose.GIS για .NET API
description: SpatialReferenceSystem μέθοδος. Δημιουργία τοπικού SRS.
type: docs
weight: 370
url: /el/net/aspose.gis.spatialreferencing/spatialreferencesystem/createlocal/
---
## SpatialReferenceSystem.CreateLocal method

Δημιουργία τοπικού SRS.

```csharp
public static LocalSpatialReferenceSystem CreateLocal(string name, LocalDatum datum, Unit unit, 
    ICollection<Axis> axises, Identifier identifier = null)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| name | String | Όνομα SRS. |
| datum | LocalDatum | Το δεδομένο που θα χρησιμοποιηθεί στο SRS. |
| unit | Unit | Μονάδα που θα χρησιμοποιηθεί σε SRS. |
| axises | ICollection`1 | Άξονες που θα χρησιμοποιηθούν στο SRS. Δεν πρέπει να είναι κενό |
| identifier | Identifier | Αναγνωριστικό, που θα προσαρτηθεί στο SRS. Η επισύναψη ενός αναγνωριστικού δεν θα τροποποιήσει άλλες παραμέτρους SRS. Εναπόκειται σε εσάς να διασφαλίσετε τη συνοχή του αναγνωριστικού και των παραμέτρων SRS. |

### Επιστρεφόμενη Αξία

Νέο Τοπικό SRS.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| InvalidOperationException | *axises* είναι άδειο. |
| ArgumentNullException | Οποιοδήποτε επιχείρημα, εκτός*identifier* είναι μηδενικό. |

### Δείτε επίσης

* class [LocalSpatialReferenceSystem](../../localspatialreferencesystem/)
* class [LocalDatum](../../localdatum/)
* class [Unit](../../unit/)
* class [Axis](../../axis/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* χώρος ονομάτων [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* συνέλευση [Aspose.GIS](../../../)


