---
title: Class InMemoryDriver
second_title: Referencia de API de Aspose.GIS para .NET
description: Aspose.Gis.Formats.InMemory.InMemoryDriver clase. Un controlador para trabajar con datos en memoria.
type: docs
weight: 380
url: /es/net/aspose.gis.formats.inmemory/inmemorydriver/
---
## InMemoryDriver class

Un controlador para trabajar con datos en memoria.

```csharp
public sealed class InMemoryDriver : FileDriver
```

## Propiedades

| Nombre | Descripción |
| --- | --- |
| override [CanCreateDatasets](../../aspose.gis.formats.inmemory/inmemorydriver/cancreatedatasets/) { get; } | Obtiene un valor que indica si este controlador puede crear conjuntos de datos. |
| override [CanCreateLayers](../../aspose.gis.formats.inmemory/inmemorydriver/cancreatelayers/) { get; } | Obtiene un valor que indica si este controlador puede crear capas vectoriales. |
| virtual [CanOpenDatasets](../../aspose.gis/filedriver/canopendatasets/) { get; } | Obtiene un valor que indica si este controlador puede abrir conjuntos de datos. |
| override [CanOpenLayers](../../aspose.gis.formats.inmemory/inmemorydriver/canopenlayers/) { get; } | Obtiene un valor que indica si este controlador puede abrir capas vectoriales. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(AbstractPath) | Crea un conjunto de datos. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(string) | Crea un conjunto de datos. |
| virtual [CreateDataset](../../aspose.gis/filedriver/createdataset/)(AbstractPath, DriverOptions) | Crea un conjunto de datos. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(string, DriverOptions) | Crea un conjunto de datos. |
| [CreateLayer](../../aspose.gis.formats.inmemory/inmemorydriver/createlayer/#createlayer)() | Crea una capa y la abre para agregar nuevas características. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath) | Crea la capa y la abre para agregarla. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string) | Crea la capa y la abre para agregarla. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath, DriverOptions) | Crea la capa y la abre para agregarla. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath, SpatialReferenceSystem) | Crea la capa y la abre para agregarla. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions) | Crea la capa y la abre para agregarla. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, SpatialReferenceSystem) | Crea la capa y la abre para agregarla. |
| override [CreateLayer](../../aspose.gis.formats.inmemory/inmemorydriver/createlayer/#createlayer_3)(AbstractPath, DriverOptions, SpatialReferenceSystem) | Crea una capa y la abre para agregar nuevas características. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions, SpatialReferenceSystem) | Crea la capa y la abre para agregarla. |
| virtual [EditLayer](../../aspose.gis/filedriver/editlayer/)(AbstractPath, DriverOptions) | Abre una capa para editar. |
| [EditLayer](../../aspose.gis/filedriver/editlayer/)(string, DriverOptions) | Abre una capa para editar. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(AbstractPath) | Abre el conjunto de datos. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string) | Abre el conjunto de datos. |
| virtual [OpenDataset](../../aspose.gis/filedriver/opendataset/)(AbstractPath, DriverOptions) | Abre el conjunto de datos. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string, DriverOptions) | Abre el conjunto de datos. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(AbstractPath) | Abre la capa para lectura. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string) | Abre la capa para lectura. |
| override [OpenLayer](../../aspose.gis.formats.inmemory/inmemorydriver/openlayer/#openlayer_1)(AbstractPath, DriverOptions) | Abre una capa para lectura. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string, DriverOptions) | Abre la capa para lectura. |
| override [SupportsSpatialReferenceSystem](../../aspose.gis.formats.inmemory/inmemorydriver/supportsspatialreferencesystem/)(SpatialReferenceSystem) | Determina si el sistema de referencia espacial especificado es compatible con el controlador. |

### Ver también

* class [FileDriver](../../aspose.gis/filedriver/)
* espacio de nombres [Aspose.Gis.Formats.InMemory](../../aspose.gis.formats.inmemory/)
* asamblea [Aspose.GIS](../../)


