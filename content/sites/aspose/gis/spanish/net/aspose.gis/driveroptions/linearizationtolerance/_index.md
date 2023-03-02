---
title: DriverOptions.LinearizationTolerance
second_title: Referencia de API de Aspose.GIS para .NET
description: DriverOptions propiedad. Una tolerancia que se utilizará para linealizar geometrías de curvas.
type: docs
weight: 50
url: /es/net/aspose.gis/driveroptions/linearizationtolerance/
---
## DriverOptions.LinearizationTolerance property

Una tolerancia que se utilizará para linealizar geometrías de curvas.

```csharp
public double LinearizationTolerance { get; set; }
```

### El valor de la propiedad

La tolerancia para pasar a[`ToLinearGeometry`](../../../aspose.gis.geometries/geometry/tolineargeometry/) antes de agregar geometrías.

### Observaciones

Esta es una opción de creación: no afecta la apertura. Si el controlador no admite geometrías no lineales, se linealizan automáticamente. Esta propiedad especifica un argumento para la[`ToLinearGeometry`](../../../aspose.gis.geometries/geometry/tolineargeometry/) método que se usa para la linealización.

### Ver también

* class [DriverOptions](../)
* espacio de nombres [Aspose.Gis](../../driveroptions/)
* asamblea [Aspose.GIS](../../../)


