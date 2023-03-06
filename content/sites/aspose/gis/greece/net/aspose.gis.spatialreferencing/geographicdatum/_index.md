---
title: Class GeographicDatum
second_title: Αναφορά Aspose.GIS για .NET API
description: Aspose.Gis.SpatialReferencing.GeographicDatum τάξη. Το γεωγραφικό δεδομένο συσχετίζει το γεωγραφικό μήκος και γεωγραφικό πλάτος με συγκεκριμένο σημείο στη γη.
type: docs
weight: 2120
url: /el/net/aspose.gis.spatialreferencing/geographicdatum/
---
## GeographicDatum class

Το γεωγραφικό δεδομένο συσχετίζει το γεωγραφικό μήκος και γεωγραφικό πλάτος με συγκεκριμένο σημείο στη γη.

```csharp
public class GeographicDatum : IdentifiableObject
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [GeographicDatum](geographicdatum/)(string, Ellipsoid, BursaWolfParameters, Identifier) | Δημιουργεί νέα παρουσία. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| static [Etrs89](../../aspose.gis.spatialreferencing/geographicdatum/etrs89/) { get; } | ETRS 89 δεδομένο. |
| static [Nad83](../../aspose.gis.spatialreferencing/geographicdatum/nad83/) { get; } | NAD 83 δεδομένο. |
| static [Osgb36](../../aspose.gis.spatialreferencing/geographicdatum/osgb36/) { get; } | OSGB 1936 δεδομένο. |
| static [Wgs72](../../aspose.gis.spatialreferencing/geographicdatum/wgs72/) { get; } | WGS 72 δεδομένο. |
| static [Wgs84](../../aspose.gis.spatialreferencing/geographicdatum/wgs84/) { get; } | WGS 84 δεδομένο. |
| [Ellipsoid](../../aspose.gis.spatialreferencing/geographicdatum/ellipsoid/) { get; } | Ελλειψοειδές, που χρησιμοποιείται σε αυτό το δεδομένο για την προσέγγιση της Γης. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Εάν αυτό το αναγνωριστικό αντικειμένων είναι αναγνωριστικό EPSG - επιστρέψτε τον κωδικό του. Διαφορετικά - επιστροφή -1. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Αναγνωριστικό αυτού του αναγνωρίσιμου αντικειμένου. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Όνομα αυτού του αντικειμένου. |
| [ToWgs84Parameters](../../aspose.gis.spatialreferencing/geographicdatum/towgs84parameters/) { get; } | BursaWolfParamters που μπορούν να χρησιμοποιηθούν για τη μετατροπή συντεταγμένων σε αυτό το δεδομένο σε συντεταγμένες στο σημείο αναφοράς WGS84. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [IsEquivalent](../../aspose.gis.spatialreferencing/geographicdatum/isequivalent/)(GeographicDatum) | Καθορίζει εάν δύο δεδομένα είναι ισοδύναμα. Ίδιες συντεταγμένες ισοδύναμων δεδομένων ταιριάζουν με το ίδιο σημείο στη Γη. Ορισμένες παράμετροι ισοδύναμων σημείων μπορεί να είναι διαφορετικές, για παράδειγμα[`Name`](../identifiableobject/name/) . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Επιστρέφει μια συμβολοσειρά που αντιπροσωπεύει το τρέχον αντικείμενο. |
| static [IsEquivalent](../../aspose.gis.spatialreferencing/geographicdatum/isequivalent/)(GeographicDatum, GeographicDatum) | Καθορίζει εάν δύο δεδομένα είναι ισοδύναμα. Ίδιες συντεταγμένες ισοδύναμων δεδομένων ταιριάζουν με το ίδιο σημείο στη Γη. Ορισμένες παράμετροι ισοδύναμων σημείων μπορεί να είναι διαφορετικές, για παράδειγμα[`Name`](../identifiableobject/name/) . |

### Δείτε επίσης

* class [IdentifiableObject](../identifiableobject/)
* χώρος ονομάτων [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* συνέλευση [Aspose.GIS](../../)


