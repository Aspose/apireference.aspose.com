---
title: ShapefileDriver.EditLayer
second_title: Referencia de API de Aspose.GIS para .NET
description: ShapefileDriver método. Abre una capa para editar.
type: docs
weight: 50
url: /es/net/aspose.gis.formats.shapefile/shapefiledriver/editlayer/
---
## EditLayer(AbstractPath, DriverOptions) {#editlayer}

Abre una capa para editar.

```csharp
public override VectorLayer EditLayer(AbstractPath path, DriverOptions options = null)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| path | AbstractPath | Ruta al archivo. |
| options | DriverOptions | Opciones específicas del conductor. |

### Valor_devuelto

una instancia de[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentException | El objeto de opciones tiene un tipo incorrecto para este controlador. |
| ArgumentNullException | el camino es`null`. |
| [GisException](../../../aspose.gis/gisexception/) | Error al leer la característica del archivo. |
| IOException | Se produjo un error de E/S. |

### Ver también

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [DriverOptions](../../../aspose.gis/driveroptions/)
* class [ShapefileDriver](../)
* espacio de nombres [Aspose.Gis.Formats.Shapefile](../../shapefiledriver/)
* asamblea [Aspose.GIS](../../../)

---

## EditLayer(string, ShapefileOptions) {#editlayer_3}

Abre una capa para editar.

```csharp
public VectorLayer EditLayer(string path, ShapefileOptions options = null)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| path | String | Ruta al archivo. |
| options | ShapefileOptions | Opciones específicas del conductor. |

### Valor_devuelto

una instancia de[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Ver también

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [ShapefileOptions](../../shapefileoptions/)
* class [ShapefileDriver](../)
* espacio de nombres [Aspose.Gis.Formats.Shapefile](../../shapefiledriver/)
* asamblea [Aspose.GIS](../../../)

---

## EditLayer(AbstractPath, ShapefileOptions) {#editlayer_1}

Abre una capa para editar.

```csharp
public VectorLayer EditLayer(AbstractPath path, ShapefileOptions options = null)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| path | AbstractPath | Ruta al archivo. |
| options | ShapefileOptions | Opciones específicas del conductor. |

### Valor_devuelto

una instancia de[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Ver también

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [ShapefileOptions](../../shapefileoptions/)
* class [ShapefileDriver](../)
* espacio de nombres [Aspose.Gis.Formats.Shapefile](../../shapefiledriver/)
* asamblea [Aspose.GIS](../../../)


