---
title: Interface IGeometryCollection
second_title: Αναφορά Aspose.GIS για .NET API
description: Aspose.Gis.Geometries.IGeometryCollection διεπαφή. ΑIGeometryCollection είναι έναIGeometry που είναι μια συλλογή από μία ή περισσότερες γεωμετρίες.
type: docs
weight: 1010
url: /el/net/aspose.gis.geometries/igeometrycollection/
---
## IGeometryCollection interface

Α`IGeometryCollection` είναι ένα[`IGeometry`](../igeometry/) που είναι μια συλλογή από μία ή περισσότερες γεωμετρίες.

```csharp
public interface IGeometryCollection : IEnumerable<IGeometry>, IEquatable<IGeometryCollection>, 
    IGeometry
```

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [Count](../../aspose.gis.geometries/igeometrycollection/count/) { get; } | Λαμβάνει τον αριθμό των γεωμετριών σε αυτήν τη συλλογή. |
| [Item](../../aspose.gis.geometries/igeometrycollection/item/) { get; } | Παίρνει ένα[`IGeometry`](../igeometry/) στον καθορισμένο δείκτη. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [GetPointOnSurface](../../aspose.gis.geometries/igeometrycollection/getpointonsurface/)() | Βρίσκει ένα σημείο που είναι εγγυημένο ότι βρίσκεται σε μία από τις επιφάνειες αυτής της συλλογής. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/igeometrycollection/replacepolygonsbylines/)() | Λαμβάνει τα πολύγωνα που αντιπροσωπεύονται ως γραμμές αυτής της γεωμετρίας. |
| [ToEditable](../../aspose.gis.geometries/igeometrycollection/toeditable/)() | Λαμβάνει ένα επεξεργάσιμο αντίγραφο αυτής της γεωμετρίας. |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometrycollection/tolineargeometry/#tolineargeometry)() | Λαμβάνει κατά προσέγγιση ή ισοδύναμη μη καμπύλη έκδοση αυτής της γεωμετρίας χρησιμοποιώντας την προεπιλογή`ανοχή` . |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometrycollection/tolineargeometry/#tolineargeometry_1)(double) | Λαμβάνει κατά προσέγγιση ή ισοδύναμη μη καμπύλη έκδοση αυτής της γεωμετρίας χρησιμοποιώντας την καθορισμένη`ανοχή` . |

### Δείτε επίσης

* interface [IGeometry](../igeometry/)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* συνέλευση [Aspose.GIS](../../)


