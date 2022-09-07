---
title: TopoJsonDriver
second_title: Riferimento API Aspose.GIS per .NET
description: Un driver per il formato TopoJSON.
type: docs
weight: 630
url: /it/net/aspose.gis.formats.topojson/topojsondriver/
---
## TopoJsonDriver class

Un driver per il formato TopoJSON.

```csharp
public class TopoJsonDriver : FileDriver
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| override [CanCreateDatasets](../../aspose.gis.formats.topojson/topojsondriver/cancreatedatasets) { get; } | Ottiene un valore che indica se questo driver può creare set di dati. |
| override [CanCreateLayers](../../aspose.gis.formats.topojson/topojsondriver/cancreatelayers) { get; } | Ottiene un valore che indica se questo driver può creare livelli vettoriali. |
| virtual [CanOpenDatasets](../../aspose.gis/filedriver/canopendatasets) { get; } | Ottiene un valore che indica se questo driver può aprire set di dati. |
| override [CanOpenLayers](../../aspose.gis.formats.topojson/topojsondriver/canopenlayers) { get; } | Ottiene un valore che indica se questo driver può aprire livelli vettoriali. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [CreateDataset](../../aspose.gis/filedriver/createdataset)(AbstractPath) | Crea un set di dati. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset)(string) | Crea un set di dati. |
| virtual [CreateDataset](../../aspose.gis/filedriver/createdataset)(AbstractPath, DriverOptions) | Crea un set di dati. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset)(string, DriverOptions) | Crea un set di dati. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(AbstractPath) | Crea il livello e lo apre per aggiungerlo. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string) | Crea il livello e lo apre per aggiungerlo. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(AbstractPath, DriverOptions) | Crea il livello e lo apre per aggiungerlo. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(AbstractPath, SpatialReferenceSystem) | Crea il livello e lo apre per aggiungerlo. |
| [CreateLayer](../../aspose.gis.formats.topojson/topojsondriver/createlayer#createlayer_3)(AbstractPath, TopoJsonOptions) | Crea un livello e lo apre per aggiungere nuove funzionalità. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, DriverOptions) | Crea il livello e lo apre per aggiungerlo. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, SpatialReferenceSystem) | Crea il livello e lo apre per aggiungerlo. |
| [CreateLayer](../../aspose.gis.formats.topojson/topojsondriver/createlayer#createlayer_9)(string, TopoJsonOptions) | Crea un livello e lo apre per aggiungere nuove funzionalità. |
| override [CreateLayer](../../aspose.gis.formats.topojson/topojsondriver/createlayer#createlayer_2)(AbstractPath, DriverOptions, SpatialReferenceSystem) | Crea un livello e lo apre per aggiungere nuove funzionalità. |
| [CreateLayer](../../aspose.gis.formats.topojson/topojsondriver/createlayer#createlayer_4)(AbstractPath, TopoJsonOptions, SpatialReferenceSystem) | Crea un livello e lo apre per aggiungere nuove funzionalità. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, DriverOptions, SpatialReferenceSystem) | Crea il livello e lo apre per aggiungerlo. |
| virtual [EditLayer](../../aspose.gis/filedriver/editlayer)(AbstractPath, DriverOptions) | Apre un livello per la modifica. |
| [EditLayer](../../aspose.gis/filedriver/editlayer)(string, DriverOptions) | Apre un livello per la modifica. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(AbstractPath) | Apre il set di dati. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(string) | Apre il set di dati. |
| virtual [OpenDataset](../../aspose.gis/filedriver/opendataset)(AbstractPath, DriverOptions) | Apre il set di dati. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(string, DriverOptions) | Apre il set di dati. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(AbstractPath) | Apre il livello per la lettura. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(string) | Apre il livello per la lettura. |
| override [OpenLayer](../../aspose.gis.formats.topojson/topojsondriver/openlayer#openlayer_1)(AbstractPath, DriverOptions) | Apre un livello per la lettura. |
| [OpenLayer](../../aspose.gis.formats.topojson/topojsondriver/openlayer#openlayer_2)(AbstractPath, TopoJsonOptions) | Apre un livello per la lettura. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(string, DriverOptions) | Apre il livello per la lettura. |
| [OpenLayer](../../aspose.gis.formats.topojson/topojsondriver/openlayer#openlayer_5)(string, TopoJsonOptions) | Apre un livello per la lettura. |
| override [SupportsSpatialReferenceSystem](../../aspose.gis.formats.topojson/topojsondriver/supportsspatialreferencesystem)(SpatialReferenceSystem) | Determina se il sistema di riferimento spaziale specificato è supportato dal driver. |

### Guarda anche

* class [FileDriver](../../aspose.gis/filedriver)
* spazio dei nomi [Aspose.Gis.Formats.TopoJson](../../aspose.gis.formats.topojson)
* assemblea [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
