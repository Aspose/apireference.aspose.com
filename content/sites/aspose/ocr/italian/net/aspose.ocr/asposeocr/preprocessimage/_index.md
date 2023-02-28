---
title: AsposeOcr.PreprocessImage
second_title: Aspose.OCR per Riferimento API .NET
description: AsposeOcr metodo. Utilizza la preelaborazione dellimmagine per migliorare la precisione dellOCR. Crea un elenco di filtri che verranno applicati allimmagine di input nellordine specificato. esempio per creare filtri PreprocessingFilter filter  new PreprocessingFilter  PreprocessingFilter.Invert  PreprocessingFilter.Threshold150 PreprocessingFilter.Binarize PreprocessingFilter.Rotate180 PreprocessingFilter.Resize30003000 Aspose.OCR.Filters.InterpolationFilterType.Box PreprocessingFilter.Scale6f  PreprocessingFilter.Dilate  Non ti servono tutti. Imposta solo ciò di cui hai bisogno.
type: docs
weight: 100
url: /it/net/aspose.ocr/asposeocr/preprocessimage/
---
## PreprocessImage(string, PreprocessingFilter) {#preprocessimage_1}

Utilizza la preelaborazione dell'immagine per migliorare la precisione dell'OCR. Crea un elenco di filtri che verranno applicati all'immagine di input nell'ordine specificato. esempio per creare filtri: PreprocessingFilter filter = new PreprocessingFilter { PreprocessingFilter.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), PreprocessingFilter.Scale(6f ), PreprocessingFilter.Dilate() }; Non ti servono tutti. Imposta solo ciò di cui hai bisogno.

```csharp
public MemoryStream PreprocessImage(string fullPath, PreprocessingFilter filters)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fullPath | String | Percorso completo dell'immagine. |
| filters | PreprocessingFilter | Filtri di ottimizzazione delle immagini[`PreprocessingFilter`](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/). |

### Valore di ritorno

Streaming con immagine modificata in modo da poterla salvare o riconoscere.

### Guarda anche

* class [PreprocessingFilter](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/)
* class [AsposeOcr](../)
* spazio dei nomi [Aspose.OCR](../../asposeocr/)
* assemblea [Aspose.OCR](../../../)

---

## PreprocessImage(MemoryStream, PreprocessingFilter) {#preprocessimage}

Utilizza la preelaborazione dell'immagine per migliorare la precisione dell'OCR. Crea un elenco di filtri che verranno applicati all'immagine di input nell'ordine specificato. esempio per creare filtri: PreprocessingFilter filter = new PreprocessingFilter { PreprocessingFilter.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), PreprocessingFilter.Scale(6f ), PreprocessingFilter.Dilate() }; Non ti servono tutti. Imposta solo ciò di cui hai bisogno.

```csharp
public MemoryStream PreprocessImage(MemoryStream stream, PreprocessingFilter filters)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stream | MemoryStream | Flusso di memoria contenente l'immagine. |
| filters | PreprocessingFilter | Filtri di ottimizzazione delle immagini[`PreprocessingFilter`](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/). |

### Valore di ritorno

Streaming con immagine modificata in modo da poterla salvare o riconoscere.

### Guarda anche

* class [PreprocessingFilter](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/)
* class [AsposeOcr](../)
* spazio dei nomi [Aspose.OCR](../../asposeocr/)
* assemblea [Aspose.OCR](../../../)


