---
title: Interface IGeometryCollection
second_title: Aspose.GIS voor .NET API-referentie
description: Aspose.Gis.Geometries.IGeometryCollection koppel. EENIGeometryCollection is eenIGeometry dat is een verzameling van een of meer geometrieën.
type: docs
weight: 1010
url: /nl/net/aspose.gis.geometries/igeometrycollection/
---
## IGeometryCollection interface

EEN`IGeometryCollection` is een[`IGeometry`](../igeometry/) dat is een verzameling van een of meer geometrieën.

```csharp
public interface IGeometryCollection : IEnumerable<IGeometry>, IEquatable<IGeometryCollection>, 
    IGeometry
```

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [Count](../../aspose.gis.geometries/igeometrycollection/count/) { get; } | Krijgt het aantal geometrieën in deze collectie. |
| [Item](../../aspose.gis.geometries/igeometrycollection/item/) { get; } | Krijgt een[`IGeometry`](../igeometry/) op de opgegeven index. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [GetPointOnSurface](../../aspose.gis.geometries/igeometrycollection/getpointonsurface/)() | Vindt een punt dat zich gegarandeerd op een van de oppervlakken in deze verzameling bevindt. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/igeometrycollection/replacepolygonsbylines/)() | Krijgt polygonen weergegeven als lijnen van deze geometrie. |
| [ToEditable](../../aspose.gis.geometries/igeometrycollection/toeditable/)() | Krijgt een bewerkbare kopie van deze geometrie. |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometrycollection/tolineargeometry/#tolineargeometry)() | Krijgt een geschatte of gelijkwaardige niet-kromme versie van deze geometrie met de standaardwaarde`tolerantie` . |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometrycollection/tolineargeometry/#tolineargeometry_1)(double) | Krijgt geschatte of equivalente niet-kromme versie van deze geometrie met behulp van de gespecificeerde`tolerantie` . |

### Zie ook

* interface [IGeometry](../igeometry/)
* naamruimte [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* montage [Aspose.GIS](../../)


