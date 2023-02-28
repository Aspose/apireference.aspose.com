---
title: Class PreprocessingFilter
second_title: Aspose.OCR per Riferimento API .NET
description: Aspose.OCR.Models.PreprocessingFilters.PreprocessingFilter classe. Classe base per i comandi di elaborazione delle immagini.
type: docs
weight: 170
url: /it/net/aspose.ocr.models.preprocessingfilters/preprocessingfilter/
---
## PreprocessingFilter class

Classe base per i comandi di elaborazione delle immagini.

Classe base per i comandi di elaborazione delle immagini.

```csharp
public class PreprocessingFilter : IEnumerable
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [PreprocessingFilter](preprocessingfilter/)() | Default_Costruttore |

## Metodi

| Nome | Descrizione |
| --- | --- |
| static [AutoDenoising](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodenoising/#autodenoising)() | Consente l'uso di una rete neurale aggiuntiva per migliorare l'immagine - ridurre il rumore. Utile per immagini con artefatti di scansione, distorsioni, macchie, bagliori, gradienti, elementi estranei. |
| static [AutoDenoising](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodenoising/#autodenoising_1)(Rectangle) | Consente l'uso di una rete neurale aggiuntiva per migliorare la parte dell'immagine - ridurre il rumore. Utile per immagini con artefatti di scansione, distorsioni, macchie, bagliori, gradienti, elementi estranei. |
| static [AutoDewarping](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodewarping/)() | Corregge automaticamente le distorsioni geometriche nell'immagine. Estremamente dispendioso in termini di risorse! |
| static [AutoSkew](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autoskew/#autoskew)() | Abilita la correzione automatica dell'inclinazione dell'immagine. |
| static [AutoSkew](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autoskew/#autoskew_1)(Rectangle) | Abilita la correzione automatica dell'inclinazione della parte dell'immagine. |
| static [Binarize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/binarize/#binarize)() | Converte un'immagine in un'immagine in bianco e nero. Le immagini binarie sono immagini i cui pixel hanno solo due possibili valori di intensità. Normalmente vengono visualizzati in bianco e nero. Numericamente, i due valori sono spesso 0 per il nero e 255 per il bianco. Le immagini binarie vengono prodotte applicando la soglia automatica a un'immagine. |
| static [Binarize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/binarize/#binarize_1)(Rectangle) | Converte una parte dell'immagine in un'immagine in bianco e nero. Le immagini binarie sono immagini i cui pixel hanno solo due possibili valori di intensità. Normalmente vengono visualizzati in bianco e nero. Numericamente, i due valori sono spesso 0 per il nero e 255 per il bianco. Le immagini binarie vengono prodotte applicando la soglia automatica a un'immagine. |
| static [ContrastCorrectionFilter](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/contrastcorrectionfilter/#contrastcorrectionfilter)() | Filtro correzione contrasto. |
| static [ContrastCorrectionFilter](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/contrastcorrectionfilter/#contrastcorrectionfilter_1)(Rectangle) | Filtro di correzione del contrasto per la parte dell'immagine. |
| static [Dilate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/dilate/#dilate)() | La dilatazione aggiunge pixel ai contorni degli oggetti in un'immagine. |
| static [Dilate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/dilate/#dilate_1)(Rectangle) | La dilatazione aggiunge pixel ai contorni degli oggetti in una parte dell'immagine. |
| static [Invert](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/invert/#invert)() | Inverte automaticamente i colori nell'immagine di un documento. |
| static [Invert](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/invert/#invert_1)(Rectangle) | Inverte automaticamente i colori in una parte dell'immagine. |
| static [Median](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/median/#median)() | Il filtro mediano attraversa ogni elemento dell'immagine e sostituisce ogni pixel con la mediana dei pixel vicini. |
| static [Median](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/median/#median_1)(Rectangle) | Il filtro mediano attraversa ogni elemento della parte dell'immagine e sostituisce ogni pixel con la mediana dei pixel vicini. |
| static [Resize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/resize/#resize)(int, int) | Ridimensiona l'immagine: aumenta o riduce la risoluzione dell'immagine. InterpolationFilterType = Lanczos8 |
| static [Resize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/resize/#resize_1)(int, int, InterpolationFilterType) | Ridimensiona immagine: risoluzione dell'immagine ingrandita o ridotta. |
| static [Rotate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/rotate/#rotate)(float) | Ruota l'immagine originale. |
| static [Rotate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/rotate/#rotate_1)(float, Rectangle) | Ruota una parte dell'immagine. |
| static [Scale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/scale/#scale)(float) | Ridimensiona l'immagine: aumenta o riduce la risoluzione dell'immagine. InterpolationFilterType = Lanczos8 |
| static [Scale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/scale/#scale_1)(float, InterpolationFilterType) | Ridimensiona immagine: risoluzione dell'immagine ingrandita o ridotta. |
| static [Threshold](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/threshold/#threshold)(int) | Crea un'immagine binaria basata sull'impostazione di un valore di soglia sull'intensità dei pixel dell'immagine originale. |
| static [Threshold](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/threshold/#threshold_1)(int, Rectangle) | Crea una parte binaria dell'immagine in base all'impostazione di un valore di soglia sull'intensità dei pixel della parte dell'immagine originale. |
| static [ToGrayscale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/tograyscale/)() | Converte un'immagine in un'immagine in scala di grigi. L'immagine in scala di grigi ha 256 livelli di luce nell'immagine (da 0 a 255). |
| [Add](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/add/)(PreprocessingFilter) | Aggiungi il nuovo filtro alla raccolta per eseguire ulteriormente tutte le operazioni. La coerenza nella raccolta è importante. |
| [GetEnumerator](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/getenumerator/)() | Per la realizzazione dell'interfaccia IEnumarable. |

### Guarda anche

* spazio dei nomi [Aspose.OCR.Models.PreprocessingFilters](../../aspose.ocr.models.preprocessingfilters/)
* assemblea [Aspose.OCR](../../)


