---
title: Class EsriJsonDriver
second_title: Riferimento API Aspose.GIS per .NET
description: Aspose.Gis.Formats.EsriJson.EsriJsonDriver classe. Un driver per il formato EsriJson.
type: docs
weight: 230
url: /it/net/aspose.gis.formats.esrijson/esrijsondriver/
---
## EsriJsonDriver class

Un driver per il formato EsriJson.

```csharp
public sealed class EsriJsonDriver : FileDriver
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| override [CanCreateDatasets](../../aspose.gis.formats.esrijson/esrijsondriver/cancreatedatasets/) { get; } | Ottiene un valore che indica se questo driver può creare set di dati. |
| override [CanCreateLayers](../../aspose.gis.formats.esrijson/esrijsondriver/cancreatelayers/) { get; } | Ottiene un valore che indica se questo driver può creare layer vettoriali. |
| virtual [CanOpenDatasets](../../aspose.gis/filedriver/canopendatasets/) { get; } | Ottiene un valore che indica se questo driver può aprire set di dati. |
| override [CanOpenLayers](../../aspose.gis.formats.esrijson/esrijsondriver/canopenlayers/) { get; } | Ottiene un valore che indica se questo driver può aprire layer vettoriali. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(AbstractPath) | Crea un set di dati. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(string) | Crea un set di dati. |
| virtual [CreateDataset](../../aspose.gis/filedriver/createdataset/)(AbstractPath, DriverOptions) | Crea un set di dati. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(string, DriverOptions) | Crea un set di dati. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath) | Crea il livello e lo apre per l'aggiunta. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string) | Crea il livello e lo apre per l'aggiunta. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath, DriverOptions) | Crea il livello e lo apre per l'aggiunta. |
| [CreateLayer](../../aspose.gis.formats.esrijson/esrijsondriver/createlayer/#createlayer_3)(AbstractPath, EsriJsonOptions) | Crea un livello e lo apre per l'aggiunta di nuove funzionalità. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath, SpatialReferenceSystem) | Crea il livello e lo apre per l'aggiunta. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions) | Crea il livello e lo apre per l'aggiunta. |
| [CreateLayer](../../aspose.gis.formats.esrijson/esrijsondriver/createlayer/#createlayer_9)(string, EsriJsonOptions) | Crea un livello e lo apre per l'aggiunta di nuove funzionalità. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, SpatialReferenceSystem) | Crea il livello e lo apre per l'aggiunta. |
| override [CreateLayer](../../aspose.gis.formats.esrijson/esrijsondriver/createlayer/#createlayer_2)(AbstractPath, DriverOptions, SpatialReferenceSystem) | Crea un livello e lo apre per l'aggiunta di nuove funzionalità. |
| [CreateLayer](../../aspose.gis.formats.esrijson/esrijsondriver/createlayer/#createlayer_4)(AbstractPath, EsriJsonOptions, SpatialReferenceSystem) | Crea un livello e lo apre per l'aggiunta di nuove funzionalità. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions, SpatialReferenceSystem) | Crea il livello e lo apre per l'aggiunta. |
| virtual [EditLayer](../../aspose.gis/filedriver/editlayer/)(AbstractPath, DriverOptions) | Apre un livello per la modifica. |
| [EditLayer](../../aspose.gis/filedriver/editlayer/)(string, DriverOptions) | Apre un livello per la modifica. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(AbstractPath) | Apre il set di dati. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string) | Apre il set di dati. |
| virtual [OpenDataset](../../aspose.gis/filedriver/opendataset/)(AbstractPath, DriverOptions) | Apre il set di dati. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string, DriverOptions) | Apre il set di dati. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(AbstractPath) | Apre il livello per la lettura. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string) | Apre il livello per la lettura. |
| override [OpenLayer](../../aspose.gis.formats.esrijson/esrijsondriver/openlayer/#openlayer_1)(AbstractPath, DriverOptions) | Apre un livello per la lettura. |
| [OpenLayer](../../aspose.gis.formats.esrijson/esrijsondriver/openlayer/#openlayer_2)(AbstractPath, EsriJsonOptions) | Apre un livello per la lettura. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string, DriverOptions) | Apre il livello per la lettura. |
| [OpenLayer](../../aspose.gis.formats.esrijson/esrijsondriver/openlayer/#openlayer_5)(string, EsriJsonOptions) | Apre un livello per la lettura. |
| override [SupportsSpatialReferenceSystem](../../aspose.gis.formats.esrijson/esrijsondriver/supportsspatialreferencesystem/)(SpatialReferenceSystem) | Determina se il sistema di riferimento spaziale specificato è supportato dal driver. |

### Guarda anche

* class [FileDriver](../../aspose.gis/filedriver/)
* spazio dei nomi [Aspose.Gis.Formats.EsriJson](../../aspose.gis.formats.esrijson/)
* assemblea [Aspose.GIS](../../)


