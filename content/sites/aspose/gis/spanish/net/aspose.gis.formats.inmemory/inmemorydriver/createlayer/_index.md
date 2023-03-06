---
title: InMemoryDriver.CreateLayer
second_title: Referencia de API de Aspose.GIS para .NET
description: InMemoryDriver método. Crea una capa y la abre para agregar nuevas características.
type: docs
weight: 40
url: /es/net/aspose.gis.formats.inmemory/inmemorydriver/createlayer/
---
## CreateLayer(AbstractPath, DriverOptions, SpatialReferenceSystem) {#createlayer_3}

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
* class [InMemoryDriver](../)
* espacio de nombres [Aspose.Gis.Formats.InMemory](../../inmemorydriver/)
* asamblea [Aspose.GIS](../../../)

---

## CreateLayer() {#createlayer}

Crea una capa y la abre para agregar nuevas características.

```csharp
public VectorLayer CreateLayer()
```

### Valor_devuelto

una instancia de[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Ver también

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [InMemoryDriver](../)
* espacio de nombres [Aspose.Gis.Formats.InMemory](../../inmemorydriver/)
* asamblea [Aspose.GIS](../../../)


