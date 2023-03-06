---
title: GmlDriver.CreateLayer
second_title: Referencia de API de Aspose.GIS para .NET
description: GmlDriver método. Crea una capa y la abre para agregar nuevas características.
type: docs
weight: 40
url: /es/net/aspose.gis.formats.gml/gmldriver/createlayer/
---
## CreateLayer(string, GmlOptions) {#createlayer_7}

Crea una capa y la abre para agregar nuevas características.

```csharp
public VectorLayer CreateLayer(string path, GmlOptions options)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| path | String | Ruta al archivo. |
| options | GmlOptions | Opciones específicas del conductor. |

### Valor_devuelto

una instancia de[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Excepciones

| excepción | condición |
| --- | --- |
| InvalidOperationException | La capa ya existe. |

### Ver también

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [GmlOptions](../../gmloptions/)
* class [GmlDriver](../)
* espacio de nombres [Aspose.Gis.Formats.Gml](../../gmldriver/)
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
* class [GmlDriver](../)
* espacio de nombres [Aspose.Gis.Formats.Gml](../../gmldriver/)
* asamblea [Aspose.GIS](../../../)

---

## CreateLayer(string, GmlOptions, SpatialReferenceSystem) {#createlayer_8}

Crea una capa y la abre para agregar nuevas características.

```csharp
public VectorLayer CreateLayer(string path, GmlOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| path | String | Ruta al archivo. |
| options | GmlOptions | Opciones específicas del conductor. |
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
* class [GmlOptions](../../gmloptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [GmlDriver](../)
* espacio de nombres [Aspose.Gis.Formats.Gml](../../gmldriver/)
* asamblea [Aspose.GIS](../../../)


