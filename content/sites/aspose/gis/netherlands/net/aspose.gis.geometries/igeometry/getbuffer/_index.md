---
title: IGeometry.GetBuffer
second_title: Aspose.GIS voor .NET API-referentie
description: IGeometry methode. Berekent een buffergebied rond deze geometrie.
type: docs
weight: 200
url: /nl/net/aspose.gis.geometries/igeometry/getbuffer/
---
## IGeometry.GetBuffer method

Berekent een buffergebied rond deze geometrie.

```csharp
public IGeometry GetBuffer(double distance, int quadrantSegments = 30)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| distance | Double | De breedte van het buffergebied (in ruimtelijke referentie-eenheden). |
| quadrantSegments | Int32 | Aantal segmenten dat wordt gebruikt om een kromming van 90 graden te benaderen. Hoe groter dit getal, hoe beter de kromming wordt benaderd. Standaard is 30. |

### Winstwaarde

Een geometrie die alle punten vertegenwoordigt die zich binnen een opgegeven afstand van deze geometrie bevinden. Het type resultaat is ofwel[`Null`](../../geometry/null/) ,[`IPolygon`](../../ipolygon/) of[`IMultiPolygon`](../../imultipolygon/) .

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| InvalidOperationException | Deze geometrie is zodanig ongeldig dat de bewerking niet kan worden voltooid. |
| ArgumentOutOfRangeException | Kwadrantsegmenten is kleiner of gelijk aan 0. |

### Zie ook

* interface [IGeometry](../)
* naamruimte [Aspose.Gis.Geometries](../../igeometry/)
* montage [Aspose.GIS](../../../)


