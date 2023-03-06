---
title: MapInfoInterchangeDriver.CreateLayer
second_title: Referencia de API de Aspose.GIS para .NET
description: MapInfoInterchangeDriver método. Crea una capa y la abre para agregar nuevas características.
type: docs
weight: 40
url: /es/net/aspose.gis.formats.mapinfointerchange/mapinfointerchangedriver/createlayer/
---
## CreateLayer(string, MapInfoInterchangeOptions) {#createlayer_7}

Crea una capa y la abre para agregar nuevas características.

```csharp
public VectorLayer CreateLayer(string path, MapInfoInterchangeOptions options)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| path | String | Ruta al archivo. |
| options | MapInfoInterchangeOptions | Opciones específicas del conductor. |

### Valor_devuelto

una instancia de[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Excepciones

| excepción | condición |
| --- | --- |
| InvalidOperationException | La capa ya existe. |

### Ver también

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [MapInfoInterchangeOptions](../../mapinfointerchangeoptions/)
* class [MapInfoInterchangeDriver](../)
* espacio de nombres [Aspose.Gis.Formats.MapInfoInterchange](../../mapinfointerchangedriver/)
* asamblea [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, DriverOptions, SpatialReferenceSystem) {#createlayer_2}

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

### Ver también

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [DriverOptions](../../../aspose.gis/driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [MapInfoInterchangeDriver](../)
* espacio de nombres [Aspose.Gis.Formats.MapInfoInterchange](../../mapinfointerchangedriver/)
* asamblea [Aspose.GIS](../../../)

---

## CreateLayer(string, MapInfoInterchangeOptions, SpatialReferenceSystem) {#createlayer_8}

Crea una capa y la abre para agregar nuevas características.

```csharp
public VectorLayer CreateLayer(string path, MapInfoInterchangeOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| path | String | Ruta al archivo. |
| options | MapInfoInterchangeOptions | Opciones específicas del conductor. |
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
* class [MapInfoInterchangeOptions](../../mapinfointerchangeoptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [MapInfoInterchangeDriver](../)
* espacio de nombres [Aspose.Gis.Formats.MapInfoInterchange](../../mapinfointerchangedriver/)
* asamblea [Aspose.GIS](../../../)


