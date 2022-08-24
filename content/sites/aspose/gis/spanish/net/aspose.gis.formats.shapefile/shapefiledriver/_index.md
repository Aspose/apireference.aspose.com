---
title: ShapefileDriver
second_title: Referencia de API de Aspose.GIS para .NET
description: Un controlador para el formato Shapefile.
type: docs
weight: 590
url: /es/net/aspose.gis.formats.shapefile/shapefiledriver/
---
## ShapefileDriver class

Un controlador para el formato Shapefile.

```csharp
public class ShapefileDriver : FileDriver
```

## Propiedades

| Nombre | Descripción |
| --- | --- |
| override [CanCreateDatasets](../../aspose.gis.formats.shapefile/shapefiledriver/cancreatedatasets) { get; } | Obtiene un valor que indica si este controlador puede crear conjuntos de datos. |
| override [CanCreateLayers](../../aspose.gis.formats.shapefile/shapefiledriver/cancreatelayers) { get; } | Obtiene un valor que indica si este controlador puede crear capas vectoriales. |
| virtual [CanOpenDatasets](../../aspose.gis/filedriver/canopendatasets) { get; } | Obtiene un valor que indica si este controlador puede abrir conjuntos de datos. |
| override [CanOpenLayers](../../aspose.gis.formats.shapefile/shapefiledriver/canopenlayers) { get; } | Obtiene un valor que indica si este controlador puede abrir capas vectoriales. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [CreateDataset](../../aspose.gis/filedriver/createdataset)(AbstractPath) | Crea un conjunto de datos. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset)(string) | Crea un conjunto de datos. |
| virtual [CreateDataset](../../aspose.gis/filedriver/createdataset)(AbstractPath, DriverOptions) | Crea un conjunto de datos. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset)(string, DriverOptions) | Crea un conjunto de datos. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(AbstractPath) | Crea la capa y la abre para agregarla. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string) | Crea la capa y la abre para agregarla. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(AbstractPath, DriverOptions) | Crea la capa y la abre para agregarla. |
| [CreateLayer](../../aspose.gis.formats.shapefile/shapefiledriver/createlayer#createlayer_3)(AbstractPath, ShapefileOptions) | Crea una capa y la abre para agregar nuevas características. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(AbstractPath, SpatialReferenceSystem) | Crea la capa y la abre para agregarla. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, DriverOptions) | Crea la capa y la abre para agregarla. |
| [CreateLayer](../../aspose.gis.formats.shapefile/shapefiledriver/createlayer#createlayer_9)(string, ShapefileOptions) | Crea una capa y la abre para agregar nuevas características. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, SpatialReferenceSystem) | Crea la capa y la abre para agregarla. |
| override [CreateLayer](../../aspose.gis.formats.shapefile/shapefiledriver/createlayer#createlayer_2)(AbstractPath, DriverOptions, SpatialReferenceSystem) | Crea una capa y la abre para agregar nuevas características. |
| [CreateLayer](../../aspose.gis.formats.shapefile/shapefiledriver/createlayer#createlayer_4)(AbstractPath, ShapefileOptions, SpatialReferenceSystem) | Crea una capa y la abre para agregar nuevas características. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, DriverOptions, SpatialReferenceSystem) | Crea la capa y la abre para agregarla. |
| override [EditLayer](../../aspose.gis.formats.shapefile/shapefiledriver/editlayer#editlayer)(AbstractPath, DriverOptions) | Abre una capa para editar. |
| [EditLayer](../../aspose.gis.formats.shapefile/shapefiledriver/editlayer#editlayer_1)(AbstractPath, ShapefileOptions) | Abre una capa para editar. |
| [EditLayer](../../aspose.gis/filedriver/editlayer)(string, DriverOptions) | Abre una capa para editar. |
| [EditLayer](../../aspose.gis.formats.shapefile/shapefiledriver/editlayer#editlayer_3)(string, ShapefileOptions) | Abre una capa para editar. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(AbstractPath) | Abre el conjunto de datos. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(string) | Abre el conjunto de datos. |
| virtual [OpenDataset](../../aspose.gis/filedriver/opendataset)(AbstractPath, DriverOptions) | Abre el conjunto de datos. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(string, DriverOptions) | Abre el conjunto de datos. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(AbstractPath) | Abre la capa para lectura. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(string) | Abre la capa para lectura. |
| override [OpenLayer](../../aspose.gis.formats.shapefile/shapefiledriver/openlayer#openlayer_1)(AbstractPath, DriverOptions) | Abre una capa para lectura. |
| [OpenLayer](../../aspose.gis.formats.shapefile/shapefiledriver/openlayer#openlayer_2)(AbstractPath, ShapefileOptions) | Abre una capa para lectura. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(string, DriverOptions) | Abre la capa para lectura. |
| [OpenLayer](../../aspose.gis.formats.shapefile/shapefiledriver/openlayer#openlayer_5)(string, ShapefileOptions) | Abre una capa para lectura. |
| override [SupportsSpatialReferenceSystem](../../aspose.gis.formats.shapefile/shapefiledriver/supportsspatialreferencesystem)(SpatialReferenceSystem) | Determina si el sistema de referencia espacial especificado es compatible con el controlador. |

### Ver también

* class [FileDriver](../../aspose.gis/filedriver)
* espacio de nombres [Aspose.Gis.Formats.Shapefile](../../aspose.gis.formats.shapefile)
* asamblea [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
