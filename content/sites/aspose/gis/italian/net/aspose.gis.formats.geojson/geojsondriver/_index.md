---
title: GeoJsonDriver
second_title: Riferimento API Aspose.GIS per .NET
description: Un driver per il formato GeoJSON.
type: docs
weight: 250
url: /it/net/aspose.gis.formats.geojson/geojsondriver/
---
## GeoJsonDriver class

Un driver per il formato GeoJSON.

```csharp
public sealed class GeoJsonDriver : FileDriver
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| override [CanCreateDatasets](../../aspose.gis.formats.geojson/geojsondriver/cancreatedatasets) { get; } | Ottiene un valore che indica se questo driver può creare set di dati. |
| override [CanCreateLayers](../../aspose.gis.formats.geojson/geojsondriver/cancreatelayers) { get; } | Ottiene un valore che indica se questo driver può creare livelli vettoriali. |
| virtual [CanOpenDatasets](../../aspose.gis/filedriver/canopendatasets) { get; } | Ottiene un valore che indica se questo driver può aprire set di dati. |
| override [CanOpenLayers](../../aspose.gis.formats.geojson/geojsondriver/canopenlayers) { get; } | Ottiene un valore che indica se questo driver può aprire livelli vettoriali. |

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
| [CreateLayer](../../aspose.gis.formats.geojson/geojsondriver/createlayer#createlayer_3)(AbstractPath, GeoJsonOptions) | Crea un livello e lo apre per aggiungere nuove funzionalità. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(AbstractPath, SpatialReferenceSystem) | Crea il livello e lo apre per aggiungerlo. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, DriverOptions) | Crea il livello e lo apre per aggiungerlo. |
| [CreateLayer](../../aspose.gis.formats.geojson/geojsondriver/createlayer#createlayer_9)(string, GeoJsonOptions) | Crea un livello e lo apre per aggiungere nuove funzionalità. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, SpatialReferenceSystem) | Crea il livello e lo apre per aggiungerlo. |
| override [CreateLayer](../../aspose.gis.formats.geojson/geojsondriver/createlayer#createlayer_2)(AbstractPath, DriverOptions, SpatialReferenceSystem) | Crea un livello e lo apre per aggiungere nuove funzionalità. |
| [CreateLayer](../../aspose.gis.formats.geojson/geojsondriver/createlayer#createlayer_4)(AbstractPath, GeoJsonOptions, SpatialReferenceSystem) | Crea un livello e lo apre per aggiungere nuove funzionalità. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, DriverOptions, SpatialReferenceSystem) | Crea il livello e lo apre per aggiungerlo. |
| virtual [EditLayer](../../aspose.gis/filedriver/editlayer)(AbstractPath, DriverOptions) | Apre un livello per la modifica. |
| [EditLayer](../../aspose.gis/filedriver/editlayer)(string, DriverOptions) | Apre un livello per la modifica. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(AbstractPath) | Apre il set di dati. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(string) | Apre il set di dati. |
| virtual [OpenDataset](../../aspose.gis/filedriver/opendataset)(AbstractPath, DriverOptions) | Apre il set di dati. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(string, DriverOptions) | Apre il set di dati. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(AbstractPath) | Apre il livello per la lettura. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(string) | Apre il livello per la lettura. |
| override [OpenLayer](../../aspose.gis.formats.geojson/geojsondriver/openlayer#openlayer_1)(AbstractPath, DriverOptions) | Apre un livello per la lettura. |
| [OpenLayer](../../aspose.gis.formats.geojson/geojsondriver/openlayer#openlayer_2)(AbstractPath, GeoJsonOptions) | Apre un livello per la lettura. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(string, DriverOptions) | Apre il livello per la lettura. |
| [OpenLayer](../../aspose.gis.formats.geojson/geojsondriver/openlayer#openlayer_5)(string, GeoJsonOptions) | Apre un livello per la lettura. |
| override [SupportsSpatialReferenceSystem](../../aspose.gis.formats.geojson/geojsondriver/supportsspatialreferencesystem)(SpatialReferenceSystem) | Determina se il sistema di riferimento spaziale specificato è supportato dal driver. |

### Guarda anche

* class [FileDriver](../../aspose.gis/filedriver)
* spazio dei nomi [Aspose.Gis.Formats.GeoJson](../../aspose.gis.formats.geojson)
* assemblea [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
