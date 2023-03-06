---
title: Class CsvDriver
second_title: Referencia de API de Aspose.GIS para .NET
description: Aspose.Gis.Formats.Csv.CsvDriver clase. Un controlador para el formato CSV.
type: docs
weight: 190
url: /es/net/aspose.gis.formats.csv/csvdriver/
---
## CsvDriver class

Un controlador para el formato CSV.

```csharp
public class CsvDriver : FileDriver
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [CsvDriver](csvdriver/)() | Constructor predeterminado |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| override [CanCreateDatasets](../../aspose.gis.formats.csv/csvdriver/cancreatedatasets/) { get; } | Obtiene un valor que indica si este controlador puede crear conjuntos de datos. |
| override [CanCreateLayers](../../aspose.gis.formats.csv/csvdriver/cancreatelayers/) { get; } | Obtiene un valor que indica si este controlador puede crear capas vectoriales. |
| virtual [CanOpenDatasets](../../aspose.gis/filedriver/canopendatasets/) { get; } | Obtiene un valor que indica si este controlador puede abrir conjuntos de datos. |
| override [CanOpenLayers](../../aspose.gis.formats.csv/csvdriver/canopenlayers/) { get; } | Obtiene un valor que indica si este controlador puede abrir capas vectoriales. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(AbstractPath) | Crea un conjunto de datos. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(string) | Crea un conjunto de datos. |
| virtual [CreateDataset](../../aspose.gis/filedriver/createdataset/)(AbstractPath, DriverOptions) | Crea un conjunto de datos. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(string, DriverOptions) | Crea un conjunto de datos. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath) | Crea la capa y la abre para agregarla. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string) | Crea la capa y la abre para agregarla. |
| [CreateLayer](../../aspose.gis.formats.csv/csvdriver/createlayer/#createlayer_3)(AbstractPath, CsvOptions) | Crea una capa y la abre para agregar nuevas características. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath, DriverOptions) | Crea la capa y la abre para agregarla. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath, SpatialReferenceSystem) | Crea la capa y la abre para agregarla. |
| [CreateLayer](../../aspose.gis.formats.csv/csvdriver/createlayer/#createlayer_9)(string, CsvOptions) | Crea una capa y la abre para agregar nuevas características. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions) | Crea la capa y la abre para agregarla. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, SpatialReferenceSystem) | Crea la capa y la abre para agregarla. |
| [CreateLayer](../../aspose.gis.formats.csv/csvdriver/createlayer/#createlayer_4)(AbstractPath, CsvOptions, SpatialReferenceSystem) | Crea una capa y la abre para agregar nuevas características. |
| override [CreateLayer](../../aspose.gis.formats.csv/csvdriver/createlayer/#createlayer_2)(AbstractPath, DriverOptions, SpatialReferenceSystem) | Crea una capa y la abre para agregar nuevas características. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions, SpatialReferenceSystem) | Crea la capa y la abre para agregarla. |
| virtual [EditLayer](../../aspose.gis/filedriver/editlayer/)(AbstractPath, DriverOptions) | Abre una capa para editar. |
| [EditLayer](../../aspose.gis/filedriver/editlayer/)(string, DriverOptions) | Abre una capa para editar. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(AbstractPath) | Abre el conjunto de datos. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string) | Abre el conjunto de datos. |
| virtual [OpenDataset](../../aspose.gis/filedriver/opendataset/)(AbstractPath, DriverOptions) | Abre el conjunto de datos. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string, DriverOptions) | Abre el conjunto de datos. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(AbstractPath) | Abre la capa para lectura. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string) | Abre la capa para lectura. |
| [OpenLayer](../../aspose.gis.formats.csv/csvdriver/openlayer/#openlayer_2)(AbstractPath, CsvOptions) | Abre una capa para lectura. |
| override [OpenLayer](../../aspose.gis.formats.csv/csvdriver/openlayer/#openlayer_1)(AbstractPath, DriverOptions) | Abre una capa para lectura. |
| [OpenLayer](../../aspose.gis.formats.csv/csvdriver/openlayer/#openlayer_5)(string, CsvOptions) | Abre una capa para lectura. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string, DriverOptions) | Abre la capa para lectura. |
| override [SupportsSpatialReferenceSystem](../../aspose.gis.formats.csv/csvdriver/supportsspatialreferencesystem/)(SpatialReferenceSystem) | Determina si el sistema de referencia espacial especificado es compatible con el controlador. |

### Ver también

* class [FileDriver](../../aspose.gis/filedriver/)
* espacio de nombres [Aspose.Gis.Formats.Csv](../../aspose.gis.formats.csv/)
* asamblea [Aspose.GIS](../../)


