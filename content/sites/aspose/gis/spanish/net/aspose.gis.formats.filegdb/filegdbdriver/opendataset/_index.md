---
title: FileGdbDriver.OpenDataset
second_title: Referencia de API de Aspose.GIS para .NET
description: FileGdbDriver método. Abre el conjunto de datos.
type: docs
weight: 70
url: /es/net/aspose.gis.formats.filegdb/filegdbdriver/opendataset/
---
## OpenDataset(string, FileGdbOptions) {#opendataset_5}

Abre el conjunto de datos.

```csharp
public Dataset OpenDataset(string path, FileGdbOptions options)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| path | String | Ruta al conjunto de datos. |
| options | FileGdbOptions | Opciones específicas del conductor. |

### Valor_devuelto

una instancia de[`Dataset`](../../../aspose.gis/dataset/).

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentException | El objeto de opciones tiene un tipo incorrecto para este controlador. |
| ArgumentNullException | el camino es`null`. |
| [GisException](../../../aspose.gis/gisexception/) | Error al leer la capa del conjunto de datos. |
| IOException | Se produjo un error de E/S. |
| NotSupportedException | El controlador no puede abrir conjuntos de datos (ver[`CanOpenDatasets`](../canopendatasets/)). |

### Ver también

* class [Dataset](../../../aspose.gis/dataset/)
* class [FileGdbOptions](../../filegdboptions/)
* class [FileGdbDriver](../)
* espacio de nombres [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* asamblea [Aspose.GIS](../../../)

---

## OpenDataset(AbstractPath, DriverOptions) {#opendataset_1}

Abre el conjunto de datos.

```csharp
public override Dataset OpenDataset(AbstractPath path, DriverOptions options)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| path | AbstractPath | Ruta al conjunto de datos. |
| options | DriverOptions | Opciones específicas del conductor. |

### Valor_devuelto

una instancia de[`Dataset`](../../../aspose.gis/dataset/).

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentException | El objeto de opciones tiene un tipo incorrecto para este controlador. |
| ArgumentNullException | el camino es`null`. |
| [GisException](../../../aspose.gis/gisexception/) | Error al leer la capa del conjunto de datos. |
| IOException | Se produjo un error de E/S. |
| NotSupportedException | El controlador no puede abrir conjuntos de datos (ver[`CanOpenDatasets`](../canopendatasets/)). |

### Ver también

* class [Dataset](../../../aspose.gis/dataset/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [DriverOptions](../../../aspose.gis/driveroptions/)
* class [FileGdbDriver](../)
* espacio de nombres [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* asamblea [Aspose.GIS](../../../)

---

## OpenDataset(AbstractPath, FileGdbOptions) {#opendataset_2}

Abre el conjunto de datos.

```csharp
public Dataset OpenDataset(AbstractPath path, FileGdbOptions options)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| path | AbstractPath | Ruta al conjunto de datos. |
| options | FileGdbOptions | Opciones específicas del conductor. |

### Valor_devuelto

una instancia de[`Dataset`](../../../aspose.gis/dataset/).

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentException | El objeto de opciones tiene un tipo incorrecto para este controlador. |
| ArgumentNullException | el camino es`null`. |
| [GisException](../../../aspose.gis/gisexception/) | Error al leer la capa del conjunto de datos. |
| IOException | Se produjo un error de E/S. |
| NotSupportedException | El controlador no puede abrir conjuntos de datos (ver[`CanOpenDatasets`](../canopendatasets/)). |

### Ver también

* class [Dataset](../../../aspose.gis/dataset/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [FileGdbOptions](../../filegdboptions/)
* class [FileGdbDriver](../)
* espacio de nombres [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* asamblea [Aspose.GIS](../../../)


