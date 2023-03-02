---
title: FileGdbCoordinatePrecisionGrid.XYScale
second_title: Referencia de API de Aspose.GIS para .NET
description: FileGdbCoordinatePrecisionGrid propiedad. Obtiene o establece la escala de las coordenadas X e Y. Si se establece ennull se usa el predeterminado.
type: docs
weight: 60
url: /es/net/aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/xyscale/
---
## FileGdbCoordinatePrecisionGrid.XYScale property

Obtiene o establece la escala de las coordenadas X e Y. Si se establece en`null` se usa el predeterminado.

```csharp
public double? XYScale { get; set; }
```

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentOutOfRangeException | El argumento no es positivo. |

### Observaciones

El valor predeterminado es`1e9` para[`VectorLayer`](../../../aspose.gis/vectorlayer/)con geográfica[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) y`Escala XY = 1 / Tolerancia XY * 10` para[`VectorLayer`](../../../aspose.gis/vectorlayer/) with proyectado[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) .

### Ver también

* class [FileGdbCoordinatePrecisionGrid](../)
* espacio de nombres [Aspose.Gis.Formats.FileGdb](../../filegdbcoordinateprecisiongrid/)
* asamblea [Aspose.GIS](../../../)


