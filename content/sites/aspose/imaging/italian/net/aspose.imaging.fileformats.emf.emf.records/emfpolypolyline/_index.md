---
title: EmfPolyPolyline
second_title: Riferimento all'API di Aspose.Imaging per .NET
description: Il record EMR_POLYPOLYLINE specifica più serie di segmenti di linea collegati.
type: docs
weight: 4040
url: /it/net/aspose.imaging.fileformats.emf.emf.records/emfpolypolyline/
---
## EmfPolyPolyline class

Il record EMR_POLYPOLYLINE specifica più serie di segmenti di linea collegati.

```csharp
public sealed class EmfPolyPolyline : EmfDrawingRecordType
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [EmfPolyPolyline](emfpolypolyline#constructor)() | Inizializza una nuova istanza di[`EmfPolyPolyline`](../emfpolypolyline) classe. |
| [EmfPolyPolyline](emfpolypolyline#constructor_1)(EmfRecord) | Inizializza una nuova istanza di[`EmfPolyPolyline`](../emfpolypolyline) classe. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [APoints](../../aspose.imaging.fileformats.emf.emf.records/emfpolypolyline/apoints) { get; set; } | Ottiene o imposta una matrice Count-length di oggetti WMF PointL ([MS-WMF] sezione 2.2.2.15) che specificano i dati del punto, in unità logiche. |
| [Bounds](../../aspose.imaging.fileformats.emf.emf.records/emfpolypolyline/bounds) { get; set; } | Ottiene o imposta un oggetto RectL WMF a 128 bit ([MS-WMF] sezione 2.2.2.19) che specifica il rettangolo di delimitazione in unità di dispositivo. |
| [Size](../../aspose.imaging.fileformats.emf.emf.records/emfrecord/size) { get; set; } | Ottiene o imposta la dimensione del record |
| [Type](../../aspose.imaging.fileformats.emf.emf.records/emfrecord/type) { get; set; } | Ottiene o imposta il tipo. |

### Osservazioni

I segmenti di linea DOVREBBE essere disegnati utilizzando la penna corrente. Le figure formate dai segmenti NON DEVONO essere riempite. La posizione attuale non DOVREBBE essere né utilizzata né aggiornata da questo record.

### Guarda anche

* class [EmfDrawingRecordType](../emfdrawingrecordtype)
* spazio dei nomi [Aspose.Imaging.FileFormats.Emf.Emf.Records](../../aspose.imaging.fileformats.emf.emf.records)
* assemblea [Aspose.Imaging](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Imaging.dll -->
