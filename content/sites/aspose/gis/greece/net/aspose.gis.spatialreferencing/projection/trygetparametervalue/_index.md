---
title: Projection.TryGetParameterValue
second_title: Αναφορά Aspose.GIS για .NET API
description: Projection μέθοδος. Λαμβάνει την παράμετρο με το καθορισμένο όνομα αυτής της προβολής. Εάν δεν υπάρχει τέτοια παράμετρος  επιστρέφειnull .
type: docs
weight: 60
url: /el/net/aspose.gis.spatialreferencing/projection/trygetparametervalue/
---
## Projection.TryGetParameterValue method

Λαμβάνει την παράμετρο με το καθορισμένο όνομα αυτής της προβολής. Εάν δεν υπάρχει τέτοια παράμετρος - επιστρέφει`null` .

```csharp
public double? TryGetParameterValue(string name, ParameterType type = ParameterType.Other)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| name | String | Όνομα παραμέτρου. |
| type | ParameterType | Τύπος παραμέτρου. Καθορίζει τον συντελεστή μονάδας που θα εφαρμοστεί: εάν ο τύπος είναιLinear έπειτα[`LinearParametersUnit`](../linearparametersunit/) θα μη εφαρμοστεί και το αποτέλεσμα θα είναι σε μέτρα. εάν ο τύπος είναιAngular έπειτα[`AngularParametersUnit`](../angularparametersunit/) θα εφαρμοστεί και το αποτέλεσμα θα είναι σε ακτίνια. εάν ο τύπος είναιOtherΗ τιμή της παραμέτρου θα επιστραφεί "ως έχει". |

### Επιστρεφόμενη Αξία

Παράμετρος με καθορισμένο όνομα ή`null` αν δεν υπάρχει.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Το επιχείρημα είναι μηδενικό. |

### Δείτε επίσης

* enum [ParameterType](../../parametertype/)
* class [Projection](../)
* χώρος ονομάτων [Aspose.Gis.SpatialReferencing](../../projection/)
* συνέλευση [Aspose.GIS](../../../)


