---
title: FileDriver.SupportsSpatialReferenceSystem
second_title: Aspose.GIS für .NET-API-Referenz
description: FileDriver methode. Bestimmt ob das angegebene Raumbezugssystem vom Treiber unterstützt wird.
type: docs
weight: 100
url: /de/net/aspose.gis/filedriver/supportsspatialreferencesystem/
---
## FileDriver.SupportsSpatialReferenceSystem method

Bestimmt, ob das angegebene Raumbezugssystem vom Treiber unterstützt wird.

```csharp
public abstract bool SupportsSpatialReferenceSystem(SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| spatialReferenceSystem | SpatialReferenceSystem | Räumliches Bezugssystem. |

### Rückgabewert

Boolescher Wert, der angibt, ob das angegebene räumliche Bezugssystem vom Treiber unterstützt wird. `null` wird von jedem Treiber als unterstützt betrachtet.

### Bemerkungen

Wenn das räumliche Bezugssystem nicht unterstützt wird und Sie es weitergeben[`CreateLayer`](../createlayer/) Methode, aNotSupportedException wird geworfen.

### Siehe auch

* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* namensraum [Aspose.Gis](../../filedriver/)
* Montage [Aspose.GIS](../../../)


