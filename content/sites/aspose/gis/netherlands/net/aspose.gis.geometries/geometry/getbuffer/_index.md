---
title: Geometry.GetBuffer
second_title: Aspose.GIS voor .NET API-referentie
description: Geometry methode. Berekent een buffergebied rond deze geometrie.
type: docs
weight: 210
url: /nl/net/aspose.gis.geometries/geometry/getbuffer/
---
## Geometry.GetBuffer method

Berekent een buffergebied rond deze geometrie.

```csharp
public IGeometry GetBuffer(double distance, int quadrantSegments = 30)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| distance | Double | De breedte van het buffergebied. |
| quadrantSegments | Int32 | Aantal segmenten dat wordt gebruikt om een kromming van 90 graden te benaderen. Hoe groter dit getal, hoe beter de kromming wordt benaderd. Standaard is 30. |

### Winstwaarde

Een geometrie die alle punten vertegenwoordigt die zich binnen een opgegeven afstand van deze geometrie bevinden. Het type resultaat is ofwel[`Null`](../null/) ,[`IPolygon`](../../ipolygon/) of[`IMultiPolygon`](../../imultipolygon/) .

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| InvalidOperationException | Deze geometrie is zodanig ongeldig dat de bewerking niet kan worden voltooid. |
| ArgumentOutOfRangeException | Kwadrantsegmenten is kleiner of gelijk aan 0. |

### Zie ook

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* naamruimte [Aspose.Gis.Geometries](../../geometry/)
* montage [Aspose.GIS](../../../)


