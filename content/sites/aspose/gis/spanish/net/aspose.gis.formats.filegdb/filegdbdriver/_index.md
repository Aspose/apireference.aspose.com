---
title: FileGdbDriver
second_title: Referencia de API de Aspose.GIS para .NET
description: Un controlador para el formato de la geodatabase de archivos ESRI.
type: docs
weight: 230
url: /es/net/aspose.gis.formats.filegdb/filegdbdriver/
---
## FileGdbDriver class

Un controlador para el formato de la geodatabase de archivos ESRI.

```csharp
public sealed class FileGdbDriver : FileDriver
```

## Propiedades

| Nombre | Descripción |
| --- | --- |
| override [CanCreateDatasets](../../aspose.gis.formats.filegdb/filegdbdriver/cancreatedatasets) { get; } | Obtiene un valor que indica si este controlador puede crear conjuntos de datos. |
| override [CanCreateLayers](../../aspose.gis.formats.filegdb/filegdbdriver/cancreatelayers) { get; } | Obtiene un valor que indica si este controlador puede crear capas vectoriales. |
| override [CanOpenDatasets](../../aspose.gis.formats.filegdb/filegdbdriver/canopendatasets) { get; } | Obtiene un valor que indica si este controlador puede abrir conjuntos de datos. |
| override [CanOpenLayers](../../aspose.gis.formats.filegdb/filegdbdriver/canopenlayers) { get; } | Obtiene un valor que indica si este controlador puede abrir capas vectoriales. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [CreateDataset](../../aspose.gis/filedriver/createdataset)(AbstractPath) | Crea un conjunto de datos. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset)(string) | Crea un conjunto de datos. |
| override [CreateDataset](../../aspose.gis.formats.filegdb/filegdbdriver/createdataset#createdataset_1)(AbstractPath, DriverOptions) | Crea un conjunto de datos. |
| [CreateDataset](../../aspose.gis.formats.filegdb/filegdbdriver/createdataset#createdataset_2)(AbstractPath, FileGdbOptions) | Crea un conjunto de datos. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset)(string, DriverOptions) | Crea un conjunto de datos. |
| [CreateDataset](../../aspose.gis.formats.filegdb/filegdbdriver/createdataset#createdataset_5)(string, FileGdbOptions) | Crea un conjunto de datos. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(AbstractPath) | Crea la capa y la abre para agregarla. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string) | Crea la capa y la abre para agregarla. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(AbstractPath, DriverOptions) | Crea la capa y la abre para agregarla. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(AbstractPath, SpatialReferenceSystem) | Crea la capa y la abre para agregarla. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, DriverOptions) | Crea la capa y la abre para agregarla. |
| [CreateLayer](../../aspose.gis.formats.filegdb/filegdbdriver/createlayer#createlayer_8)(string, FileGdbOptions) | Crea una capa y la abre para agregar nuevas características. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, SpatialReferenceSystem) | Crea la capa y la abre para agregarla. |
| override [CreateLayer](../../aspose.gis.formats.filegdb/filegdbdriver/createlayer#createlayer_2)(AbstractPath, DriverOptions, SpatialReferenceSystem) | Crea una capa y la abre para agregarla. |
| [CreateLayer](../../aspose.gis.formats.filegdb/filegdbdriver/createlayer#createlayer_3)(AbstractPath, FileGdbOptions, SpatialReferenceSystem) | Crea una capa y la abre para agregarla. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, DriverOptions, SpatialReferenceSystem) | Crea la capa y la abre para agregarla. |
| [CreateLayer](../../aspose.gis.formats.filegdb/filegdbdriver/createlayer#createlayer_9)(string, FileGdbOptions, SpatialReferenceSystem) | Crea una capa y la abre para agregarla. |
| virtual [EditLayer](../../aspose.gis/filedriver/editlayer)(AbstractPath, DriverOptions) | Abre una capa para editar. |
| [EditLayer](../../aspose.gis/filedriver/editlayer)(string, DriverOptions) | Abre una capa para editar. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(AbstractPath) | Abre el conjunto de datos. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(string) | Abre el conjunto de datos. |
| override [OpenDataset](../../aspose.gis.formats.filegdb/filegdbdriver/opendataset#opendataset_1)(AbstractPath, DriverOptions) | Abre el conjunto de datos. |
| [OpenDataset](../../aspose.gis.formats.filegdb/filegdbdriver/opendataset#opendataset_2)(AbstractPath, FileGdbOptions) | Abre el conjunto de datos. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(string, DriverOptions) | Abre el conjunto de datos. |
| [OpenDataset](../../aspose.gis.formats.filegdb/filegdbdriver/opendataset#opendataset_5)(string, FileGdbOptions) | Abre el conjunto de datos. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(AbstractPath) | Abre la capa para lectura. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(string) | Abre la capa para lectura. |
| override [OpenLayer](../../aspose.gis.formats.filegdb/filegdbdriver/openlayer#openlayer_1)(AbstractPath, DriverOptions) | Abre una capa para lectura. |
| [OpenLayer](../../aspose.gis.formats.filegdb/filegdbdriver/openlayer#openlayer_2)(AbstractPath, FileGdbOptions) | Abre una capa para lectura. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(string, DriverOptions) | Abre la capa para lectura. |
| [OpenLayer](../../aspose.gis.formats.filegdb/filegdbdriver/openlayer#openlayer_5)(string, FileGdbOptions) | Abre una capa para lectura. |
| override [SupportsSpatialReferenceSystem](../../aspose.gis.formats.filegdb/filegdbdriver/supportsspatialreferencesystem)(SpatialReferenceSystem) | Determina si el sistema de referencia espacial especificado es compatible con el controlador. |

### Ver también

* class [FileDriver](../../aspose.gis/filedriver)
* espacio de nombres [Aspose.Gis.Formats.FileGdb](../../aspose.gis.formats.filegdb)
* asamblea [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
