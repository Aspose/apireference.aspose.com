---
title: GdalDriver.CreateLayer
second_title: Referencia de API de Aspose.GIS para .NET
description: GdalDriver método. Crea una capa y la abre para agregar nuevas características.
type: docs
weight: 40
url: /es/net/aspose.gis.formats.gdal/gdaldriver/createlayer/
---
## GdalDriver.CreateLayer method

Crea una capa y la abre para agregar nuevas características.

```csharp
public override VectorLayer CreateLayer(AbstractPath path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| path | AbstractPath | Ruta al archivo. |
| options | DriverOptions | Opciones específicas del conductor. |
| spatialReferenceSystem | SpatialReferenceSystem | Sistema de referencia espacial. |

### Valor_devuelto

una instancia de[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Excepciones

| excepción | condición |
| --- | --- |
| InvalidOperationException | La capa ya existe. |
| NotSupportedException | El controlador no admite el sistema de referencia espacial. |

### Ver también

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [DriverOptions](../../../aspose.gis/driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [GdalDriver](../)
* espacio de nombres [Aspose.Gis.Formats.GDAL](../../gdaldriver/)
* asamblea [Aspose.GIS](../../../)


