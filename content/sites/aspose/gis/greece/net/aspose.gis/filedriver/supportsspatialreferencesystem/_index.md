---
title: FileDriver.SupportsSpatialReferenceSystem
second_title: Αναφορά Aspose.GIS για .NET API
description: FileDriver μέθοδος. Καθορίζει εάν το καθορισμένο χωρικό σύστημα αναφοράς υποστηρίζεται από το πρόγραμμα οδήγησης.
type: docs
weight: 100
url: /el/net/aspose.gis/filedriver/supportsspatialreferencesystem/
---
## FileDriver.SupportsSpatialReferenceSystem method

Καθορίζει εάν το καθορισμένο χωρικό σύστημα αναφοράς υποστηρίζεται από το πρόγραμμα οδήγησης.

```csharp
public abstract bool SupportsSpatialReferenceSystem(SpatialReferenceSystem spatialReferenceSystem)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| spatialReferenceSystem | SpatialReferenceSystem | Χωρικό σύστημα αναφοράς. |

### Επιστρεφόμενη Αξία

Τιμή Boole, που υποδεικνύει εάν το καθορισμένο χωρικό σύστημα αναφοράς υποστηρίζεται από το πρόγραμμα οδήγησης. `null` θεωρείται ότι υποστηρίζεται από οποιοδήποτε πρόγραμμα οδήγησης.

### Παρατηρήσεις

Εάν το σύστημα χωρικής αναφοράς δεν υποστηρίζεται, και το μεταβιβάσετε σε[`CreateLayer`](../createlayer/) μέθοδος, αNotSupportedException θα πεταχτεί.

### Δείτε επίσης

* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* χώρος ονομάτων [Aspose.Gis](../../filedriver/)
* συνέλευση [Aspose.GIS](../../../)


