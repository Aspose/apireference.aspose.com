---
title: Identifier.Epsg
second_title: Αναφορά Aspose.GIS για .NET API
description: Identifier μέθοδος. Δημιουργεί νέο αναγνωριστικό που αντιπροσωπεύει το αναγνωριστικό EPSG με κωδικόepsgCode .
type: docs
weight: 20
url: /el/net/aspose.gis.spatialreferencing/identifier/epsg/
---
## Identifier.Epsg method

Δημιουργεί νέο αναγνωριστικό που αντιπροσωπεύει το αναγνωριστικό EPSG με κωδικό*epsgCode* .

```csharp
public static Identifier Epsg(int epsgCode)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| epsgCode | Int32 | Κωδικός Epsg. |

### Επιστρεφόμενη Αξία

Νέο αναγνωριστικό με[`AuthorityName`](../authorityname/) «ΕΠΣΓ» και[`AuthorityUniqueIdentifier`](../authorityuniqueidentifier/)*epsgCode* . Αν*epsgCode* είναι μικρότερο από 0 - επιστροφή`null` ;

### Δείτε επίσης

* class [Identifier](../)
* χώρος ονομάτων [Aspose.Gis.SpatialReferencing](../../identifier/)
* συνέλευση [Aspose.GIS](../../../)


