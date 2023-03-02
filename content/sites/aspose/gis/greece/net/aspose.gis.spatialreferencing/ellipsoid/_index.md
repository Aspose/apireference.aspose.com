---
title: Class Ellipsoid
second_title: Αναφορά Aspose.GIS για .NET API
description: Aspose.Gis.SpatialReferencing.Ellipsoid τάξη. Το ελλειψοειδές αντιπροσωπεύει ένα ελλειψοειδές το οποίο προσεγγίζει τη γη.
type: docs
weight: 2070
url: /el/net/aspose.gis.spatialreferencing/ellipsoid/
---
## Ellipsoid class

Το ελλειψοειδές αντιπροσωπεύει ένα ελλειψοειδές, το οποίο προσεγγίζει τη γη.

```csharp
public class Ellipsoid : IdentifiableObject
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [Ellipsoid](ellipsoid/)(string, double, double, Identifier) | Δημιουργεί νέο Ελλειψοειδές. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| static [Airy](../../aspose.gis.spatialreferencing/ellipsoid/airy/) { get; } | Αέρινο ελλειψοειδές. |
| static [Grs80](../../aspose.gis.spatialreferencing/ellipsoid/grs80/) { get; } | GRS 1980 Ελλειψοειδές. |
| static [Wgs72](../../aspose.gis.spatialreferencing/ellipsoid/wgs72/) { get; } | WGS 72 Ελλειψοειδές. |
| static [Wgs84](../../aspose.gis.spatialreferencing/ellipsoid/wgs84/) { get; } | WGS 84 Ελλειψοειδές. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Εάν αυτό το αναγνωριστικό αντικειμένων είναι αναγνωριστικό EPSG - επιστρέψτε τον κωδικό του. Διαφορετικά - επιστροφή -1. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Αναγνωριστικό αυτού του αναγνωρίσιμου αντικειμένου. |
| [InverseFlattening](../../aspose.gis.spatialreferencing/ellipsoid/inverseflattening/) { get; } | Αντίστροφη ισοπέδωση ελλειψοειδούς. 0 αν πρόκειται για σφαίρα. |
| [IsSphere](../../aspose.gis.spatialreferencing/ellipsoid/issphere/) { get; } | Ανιχνεύει αν αυτό το ελλειψοειδές είναι σφαίρα. |
| [IsValid](../../aspose.gis.spatialreferencing/ellipsoid/isvalid/) { get; } | Ανιχνεύει εάν το ελλειψοειδές είναι έγκυρο: ο ημιμείζων άξονάς του είναι μεγαλύτερος από 0 και η αντίστροφη ισοπέδωση είναι θετική ή ίση με 0. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Όνομα αυτού του αντικειμένου. |
| [SemiMajorAxis](../../aspose.gis.spatialreferencing/ellipsoid/semimajoraxis/) { get; } | Ημικύριος άξονας ελλειψοειδούς. |
| [SemiMinorAxis](../../aspose.gis.spatialreferencing/ellipsoid/semiminoraxis/) { get; } | Ημιμικρός άξονας ελλειψοειδούς. Ισούται με ημιμείζονα άξονα εάν αυτός είναι σφαίρα. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [IsEquivalent](../../aspose.gis.spatialreferencing/ellipsoid/isequivalent/)(Ellipsoid) | Προσδιορίζει εάν δύο ελλειψοειδή είναι ισοδύναμα. Αν το ελλειψοειδές Α είναι ισοδύναμο με το ελλειψοειδές Β, τότε έχουν τον ίδιο ημιμείζονα άξονα και αντίστροφη ισοπέδωση. |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Επιστρέφει μια συμβολοσειρά που αντιπροσωπεύει το τρέχον αντικείμενο. |
| static [IsEquivalent](../../aspose.gis.spatialreferencing/ellipsoid/isequivalent/)(Ellipsoid, Ellipsoid) | Προσδιορίζει εάν δύο ελλειψοειδή είναι ισοδύναμα. Αν το ελλειψοειδές Α είναι ισοδύναμο με το ελλειψοειδές Β, τότε έχουν τον ίδιο ημιμείζονα άξονα και αντίστροφη ισοπέδωση. |

### Δείτε επίσης

* class [IdentifiableObject](../identifiableobject/)
* χώρος ονομάτων [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* συνέλευση [Aspose.GIS](../../)


