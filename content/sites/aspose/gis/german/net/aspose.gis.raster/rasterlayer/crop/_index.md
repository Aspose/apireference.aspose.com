---
title: RasterLayer.Crop
second_title: Aspose.GIS für .NET-API-Referenz
description: RasterLayer methode. Beschneidet die Rasterebene mithilfe einer Form und einer Bandmaske.
type: docs
weight: 110
url: /de/net/aspose.gis.raster/rasterlayer/crop/
---
## Crop(IGeometry, double[]) {#crop}

Beschneidet die Rasterebene mithilfe einer Form (und einer Bandmaske).

```csharp
public RasterLayer Crop(IGeometry geometry, double[] masks = null)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| geometry | IGeometry | Geometrie stellte die Formform dar. |
| masks | Double[] | Maske für Ernteebene |

### Rückgabewert

Die zugeschnittene Rasterebene. Wenn keine Schnittpunkte gefunden werden, kehrt zurück`null`.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Das Argument darf nicht null sein. Parametername: Geometrie. |
| NotSupportedException | Das Argument darf sich nicht von Polygon oder Oberfläche unterscheiden. Parametername: Geometrie. |
| InvalidOperationException | Die ursprüngliche Ebene kann keine andere CropRasterLayer sein. |
| [GisException](../../../aspose.gis/gisexception/) | Fehler beim Zuschneiden der Ebene. |

### Siehe auch

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [RasterLayer](../)
* namensraum [Aspose.Gis.Raster](../../rasterlayer/)
* Montage [Aspose.GIS](../../../)

---

## Crop(double[]) {#crop_1}

Beschneidet die Rasterebene mit einer Bandmaske).

```csharp
public RasterLayer Crop(double[] masks)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| masks | Double[] | Maske für Ernteebene |

### Rückgabewert

Die zugeschnittene Rasterebene. Wenn keine Schnittpunkte gefunden werden, kehrt zurück`null`.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| InvalidOperationException |  |

### Siehe auch

* class [RasterLayer](../)
* namensraum [Aspose.Gis.Raster](../../rasterlayer/)
* Montage [Aspose.GIS](../../../)


