---
title: SpatialReferenceSystem.CreateProjected
second_title: Aspose.GIS för .NET API Referens
description: SpatialReferenceSystem metod. Skapa projicerad SRS från anpassade parametrar.
type: docs
weight: 380
url: /sv/net/aspose.gis.spatialreferencing/spatialreferencesystem/createprojected/
---
## SpatialReferenceSystem.CreateProjected method

Skapa projicerad SRS från anpassade parametrar.

```csharp
public static ProjectedSpatialReferenceSystem CreateProjected(
    ProjectedSpatialReferenceSystemParameters parameters, Identifier identifier = null)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| parameters | ProjectedSpatialReferenceSystemParameters | Parametrar att skapa från. |
| identifier | Identifier | Identifierare, som kommer att kopplas till SRS. Att bifoga en identifierare kommer inte att ändra andra SRS-parametrar. Det är upp till dig att säkerställa överensstämmelse mellan identifierare och SRS-parametrar. |

### Returvärde

Ny projicerad SRS.

### Undantag

| undantag | skick |
| --- | --- |
| InvalidOperationException | Bas SRS i parametrar är`null` . Projektionsmetod i parametrar är`null` . |

### Se även

* class [ProjectedSpatialReferenceSystem](../../projectedspatialreferencesystem/)
* class [ProjectedSpatialReferenceSystemParameters](../../projectedspatialreferencesystemparameters/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* namnutrymme [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* hopsättning [Aspose.GIS](../../../)


