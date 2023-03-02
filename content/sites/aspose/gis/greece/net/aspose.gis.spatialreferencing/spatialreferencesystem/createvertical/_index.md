---
title: SpatialReferenceSystem.CreateVertical
second_title: Αναφορά Aspose.GIS για .NET API
description: SpatialReferenceSystem μέθοδος. Δημιουργία κάθετου SRS.
type: docs
weight: 390
url: /el/net/aspose.gis.spatialreferencing/spatialreferencesystem/createvertical/
---
## SpatialReferenceSystem.CreateVertical method

Δημιουργία κάθετου SRS.

```csharp
public static VerticalSpatialReferenceSystem CreateVertical(string name, 
    VerticalDatum verticalDatum, Unit verticalUnit = null, Axis verticalAxis = null, 
    Identifier identifier = null)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| name | String | Όνομα SRS. Αν`null` . |
| verticalDatum | VerticalDatum | Το δεδομένο που θα χρησιμοποιηθεί στο SRS. |
| verticalUnit | Unit | Μονάδα που θα χρησιμοποιηθεί στο SRS. Αν`null` ,[`Meter`](../../unit/meter/) θα χρησιμοποιηθεί. |
| verticalAxis | Axis | Άξονας με κατεύθυνση "πάνω" ή "κάτω", για χρήση σε SRS. Αν`null` , θα χρησιμοποιηθεί άξονας με κατεύθυνση προς τα πάνω. |
| identifier | Identifier | Αναγνωριστικό, που θα προσαρτηθεί στο SRS. Η επισύναψη ενός αναγνωριστικού δεν θα τροποποιήσει άλλες παραμέτρους SRS. Εναπόκειται σε εσάς να διασφαλίσετε τη συνοχή του αναγνωριστικού και των παραμέτρων SRS. |

### Επιστρεφόμενη Αξία

Νέο κάθετο SRS.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| InvalidOperationException | *verticalAxis* η κατεύθυνση δεν είναι πάνω ή κάτω. |
| ArgumentNullException | Ορισμένες από τις απαιτούμενες παραμέτρους είναι μηδενικές. |

### Δείτε επίσης

* class [VerticalSpatialReferenceSystem](../../verticalspatialreferencesystem/)
* class [VerticalDatum](../../verticaldatum/)
* class [Unit](../../unit/)
* class [Axis](../../axis/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* χώρος ονομάτων [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* συνέλευση [Aspose.GIS](../../../)


