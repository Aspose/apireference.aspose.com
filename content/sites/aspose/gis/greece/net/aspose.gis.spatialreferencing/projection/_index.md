---
title: Class Projection
second_title: Αναφορά Aspose.GIS για .NET API
description: Aspose.Gis.SpatialReferencing.Projection τάξη. Αντιπροσωπεύει μια μέθοδο προβολής με παραμέτρους που μετατρέπει γεωγραφικό μήκος γεωγραφικό πλάτος σε x y.
type: docs
weight: 2240
url: /el/net/aspose.gis.spatialreferencing/projection/
---
## Projection class

Αντιπροσωπεύει μια μέθοδο προβολής με παραμέτρους, που μετατρέπει (γεωγραφικό μήκος, γεωγραφικό πλάτος) σε (x, y).

```csharp
public class Projection : IdentifiableObject
```

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [AngularParametersUnit](../../aspose.gis.spatialreferencing/projection/angularparametersunit/) { get; } | Μονάδα που χρησιμοποιείται για γωνιακές παραμέτρους. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Εάν αυτό το αναγνωριστικό αντικειμένων είναι αναγνωριστικό EPSG - επιστρέψτε τον κωδικό του. Διαφορετικά - επιστροφή -1. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Αναγνωριστικό αυτού του αναγνωρίσιμου αντικειμένου. |
| [LinearParametersUnit](../../aspose.gis.spatialreferencing/projection/linearparametersunit/) { get; } | Μονάδα που χρησιμοποιείται για γραμμικές παραμέτρους. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Όνομα αυτού του αντικειμένου. |
| [ParametersNames](../../aspose.gis.spatialreferencing/projection/parametersnames/) { get; } | Λαμβάνει μια αναρίθμητη συλλογή ονομάτων παραμέτρων που δίνονται σε αυτήν την προβολή |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [GetParameterValue](../../aspose.gis.spatialreferencing/projection/getparametervalue/)(string, ParameterType) | Λαμβάνει την παράμετρο με το καθορισμένο όνομα αυτής της προβολής. |
| [IsEquivalent](../../aspose.gis.spatialreferencing/projection/isequivalent/)(Projection) | Καθορίζει ότι δύο προβολές είναι ισοδύναμες. Ισοδύναμες προβολές χάρτη (γεωγραφικό μήκος, γεωγραφικό πλάτος) με (x, y) με τον ίδιο τρόπο. |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Επιστρέφει μια συμβολοσειρά που αντιπροσωπεύει το τρέχον αντικείμενο. |
| [TryGetParameterValue](../../aspose.gis.spatialreferencing/projection/trygetparametervalue/)(string, ParameterType) | Λαμβάνει την παράμετρο με το καθορισμένο όνομα αυτής της προβολής. Εάν δεν υπάρχει τέτοια παράμετρος - επιστρέφει`null` . |

### Δείτε επίσης

* class [IdentifiableObject](../identifiableobject/)
* χώρος ονομάτων [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* συνέλευση [Aspose.GIS](../../)


