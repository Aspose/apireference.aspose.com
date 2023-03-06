---
title: KmlDriver.CreateLayer
second_title: Referencia de API de Aspose.GIS para .NET
description: KmlDriver método. Crea una capa y la abre para agregar nuevas características.
type: docs
weight: 40
url: /es/net/aspose.gis.formats.kml/kmldriver/createlayer/
---
## CreateLayer(string, KmlOptions) {#createlayer_9}

Crea una capa y la abre para agregar nuevas características.

```csharp
public VectorLayer CreateLayer(string path, KmlOptions options)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| path | String | Ruta al archivo. |
| options | KmlOptions | Opciones específicas del conductor. |

### Valor_devuelto

una instancia de[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Excepciones

| excepción | condición |
| --- | --- |
| InvalidOperationException | La capa ya existe. |

### Ver también

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [KmlOptions](../../kmloptions/)
* class [KmlDriver](../)
* espacio de nombres [Aspose.Gis.Formats.Kml](../../kmldriver/)
* asamblea [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, KmlOptions) {#createlayer_3}

Crea una capa y la abre para agregar nuevas características.

```csharp
public VectorLayer CreateLayer(AbstractPath path, KmlOptions options)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| path | AbstractPath | Ruta al archivo. |
| options | KmlOptions | Opciones específicas del conductor. |

### Valor_devuelto

una instancia de[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Excepciones

| excepción | condición |
| --- | --- |
| InvalidOperationException | La capa ya existe. |

### Ver también

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [KmlOptions](../../kmloptions/)
* class [KmlDriver](../)
* espacio de nombres [Aspose.Gis.Formats.Kml](../../kmldriver/)
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
* class [KmlDriver](../)
* espacio de nombres [Aspose.Gis.Formats.Kml](../../kmldriver/)
* asamblea [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, KmlOptions, SpatialReferenceSystem) {#createlayer_4}

Crea una capa y la abre para agregar nuevas características.

```csharp
public VectorLayer CreateLayer(AbstractPath path, KmlOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| path | AbstractPath | Ruta al archivo. |
| options | KmlOptions | Opciones específicas del conductor. |
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
* class [KmlOptions](../../kmloptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [KmlDriver](../)
* espacio de nombres [Aspose.Gis.Formats.Kml](../../kmldriver/)
* asamblea [Aspose.GIS](../../../)


