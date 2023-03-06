---
title: SpatialReferenceSystem.TryCreateFromEpsg
second_title: Aspose.GIS für .NET-API-Referenz
description: SpatialReferenceSystem methode. Erstellen Sie ein räumliches Bezugssystem basierend auf dem angegebenen EPSGCode.
type: docs
weight: 400
url: /de/net/aspose.gis.spatialreferencing/spatialreferencesystem/trycreatefromepsg/
---
## SpatialReferenceSystem.TryCreateFromEpsg method

Erstellen Sie ein räumliches Bezugssystem basierend auf dem angegebenen EPSG-Code.

```csharp
public static bool TryCreateFromEpsg(int epsg, out SpatialReferenceSystem value)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| epsg | Int32 | EPSG-Code des Raumbezugssystems. |
| value | SpatialReferenceSystem& | Wenn diese Methode zurückkehrt`true` , enthält eine SRS mit dem angegebenen EPSG-Code; andernfalls enthält `null` . |

### Rückgabewert

`true` wenn angegebener EPSG-Code bekannt ist und SRS erstellt wurde;`false` ansonsten.

### Siehe auch

* method [CreateFromEpsg](../createfromepsg/)
* class [SpatialReferenceSystem](../)
* namensraum [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* Montage [Aspose.GIS](../../../)


