---
title: Class PreprocessingFilter
second_title: Referencia de API de Aspose.OCR para .NET
description: Aspose.OCR.Models.PreprocessingFilters.PreprocessingFilter clase. Clase base para comandos de procesamiento de imágenes.
type: docs
weight: 170
url: /es/net/aspose.ocr.models.preprocessingfilters/preprocessingfilter/
---
## PreprocessingFilter class

Clase base para comandos de procesamiento de imágenes.

Clase base para comandos de procesamiento de imágenes.

```csharp
public class PreprocessingFilter : IEnumerable
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [PreprocessingFilter](preprocessingfilter/)() | Constructor predeterminado |

## Métodos

| Nombre | Descripción |
| --- | --- |
| static [AutoDenoising](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodenoising/#autodenoising)() | Permite el uso de una red neuronal adicional para mejorar la imagen: reduce el ruido. Útil para imágenes con artefactos de escaneo, distorsión, puntos, destellos, degradados, elementos extraños. |
| static [AutoDenoising](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodenoising/#autodenoising_1)(Rectangle) | Permite el uso de una red neuronal adicional para mejorar la parte de la imagen: reduce el ruido. Útil para imágenes con artefactos de escaneo, distorsión, manchas, destellos, degradados, elementos extraños. |
| static [AutoDewarping](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodewarping/)() | Corrige automáticamente las distorsiones geométricas en la imagen. ¡Muy intensivo en recursos! |
| static [AutoSkew](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autoskew/#autoskew)() | Habilita la corrección automática de la inclinación de la imagen. |
| static [AutoSkew](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autoskew/#autoskew_1)(Rectangle) | Habilita la corrección automática del sesgo de parte de la imagen. |
| static [Binarize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/binarize/#binarize)() | Convierte una imagen en una imagen en blanco y negro. Las imágenes binarias son imágenes cuyos píxeles tienen solo dos valores de intensidad posibles. Normalmente se muestran en blanco y negro. Numéricamente, los dos valores son a menudo 0 para el negro y 255 para el blanco. Las imágenes binarias se producen mediante el umbral automático de una imagen. |
| static [Binarize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/binarize/#binarize_1)(Rectangle) | Convierte una parte de la imagen en una imagen en blanco y negro. Las imágenes binarias son imágenes cuyos píxeles tienen solo dos valores de intensidad posibles. Normalmente se muestran en blanco y negro. Numéricamente, los dos valores son a menudo 0 para el negro y 255 para el blanco. Las imágenes binarias se producen mediante el umbral automático de una imagen. |
| static [ContrastCorrectionFilter](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/contrastcorrectionfilter/#contrastcorrectionfilter)() | Filtro de corrección de contraste. |
| static [ContrastCorrectionFilter](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/contrastcorrectionfilter/#contrastcorrectionfilter_1)(Rectangle) | Filtro de corrección de contraste para la parte de la imagen. |
| static [Dilate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/dilate/#dilate)() | La dilatación agrega píxeles a los límites de los objetos en una imagen. |
| static [Dilate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/dilate/#dilate_1)(Rectangle) | La dilatación agrega píxeles a los límites de los objetos en una parte de la imagen. |
| static [Invert](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/invert/#invert)() | Invierte automáticamente los colores en una imagen de documento. |
| static [Invert](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/invert/#invert_1)(Rectangle) | Invierte automáticamente los colores en una parte de la imagen. |
| static [Median](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/median/#median)() | El filtro de mediana se ejecuta a través de cada elemento de la imagen y reemplaza cada píxel con la mediana de sus píxeles vecinos. |
| static [Median](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/median/#median_1)(Rectangle) | El filtro de la mediana se ejecuta a través de cada elemento de la parte de la imagen y reemplaza cada píxel con la mediana de sus píxeles vecinos. |
| static [Resize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/resize/#resize)(int, int) | Cambiar escala de imagen: resolución de imagen de escala superior o inferior. InterpolationFilterType = Lanczos8 |
| static [Resize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/resize/#resize_1)(int, int, InterpolationFilterType) | Cambiar escala de imagen: resolución de imagen de escala superior o inferior. |
| static [Rotate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/rotate/#rotate)(float) | Girar imagen original. |
| static [Rotate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/rotate/#rotate_1)(float, Rectangle) | Gira una parte de la imagen. |
| static [Scale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/scale/#scale)(float) | Cambiar escala de imagen: resolución de imagen de escala superior o inferior. InterpolationFilterType = Lanczos8 |
| static [Scale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/scale/#scale_1)(float, InterpolationFilterType) | Cambiar escala de imagen: resolución de imagen de escala superior o inferior. |
| static [Threshold](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/threshold/#threshold)(int) | Cree una imagen binaria basada en establecer un valor de umbral en la intensidad de píxeles de la imagen original. |
| static [Threshold](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/threshold/#threshold_1)(int, Rectangle) | Cree una parte binaria de la imagen basada en establecer un valor de umbral en la intensidad de píxeles de la parte de la imagen original. |
| static [ToGrayscale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/tograyscale/)() | Convierte una imagen a imagen en escala de grises. La imagen en escala de grises tiene 256 niveles de luz en la imagen (0 a 255). |
| [Add](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/add/)(PreprocessingFilter) | Agregue el nuevo filtro a la colección para seguir ejecutando todas las operaciones. La coherencia en la colección es importante. |
| [GetEnumerator](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/getenumerator/)() | Para realización de interfaz IEnumerable. |

### Ver también

* espacio de nombres [Aspose.OCR.Models.PreprocessingFilters](../../aspose.ocr.models.preprocessingfilters/)
* asamblea [Aspose.OCR](../../)


