---
title: AsposeOcr.PreprocessImage
second_title: Referencia de API de Aspose.OCR para .NET
description: AsposeOcr método. Use el preprocesamiento de imágenes para mejorar la precisión de OCR. Cree una lista de filtros que se aplicarán a la imagen de entrada en el orden que especifique. ejemplo para crear filtros PreprocessingFilter filtros  new PreprocessingFilter  PreprocessingFilter.Invert  PreprocessingFilter.Threshold150 PreprocessingFilter.Binarize PreprocessingFilter.Rotate180 PreprocessingFilter.Resize30003000 Aspose.OCR.Filters.InterpolationFilterType.Box PreprocessingFilter.Scale6f  PreprocessingFilter.Dilate  No los necesita todos. Establece solo lo que necesitas.
type: docs
weight: 100
url: /es/net/aspose.ocr/asposeocr/preprocessimage/
---
## PreprocessImage(string, PreprocessingFilter) {#preprocessimage_1}

Use el preprocesamiento de imágenes para mejorar la precisión de OCR. Cree una lista de filtros que se aplicarán a la imagen de entrada en el orden que especifique. ejemplo para crear filtros: PreprocessingFilter filtros = new PreprocessingFilter { PreprocessingFilter.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), PreprocessingFilter.Scale(6f) ), PreprocessingFilter.Dilate() }; No los necesita todos. Establece solo lo que necesitas.

```csharp
public MemoryStream PreprocessImage(string fullPath, PreprocessingFilter filters)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| fullPath | String | Ruta completa a la imagen. |
| filters | PreprocessingFilter | Filtros de optimización de imagen[`PreprocessingFilter`](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/). |

### Valor_devuelto

Transmite con imagen modificada para que puedas guardarla o reconocerla.

### Ver también

* class [PreprocessingFilter](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/)
* class [AsposeOcr](../)
* espacio de nombres [Aspose.OCR](../../asposeocr/)
* asamblea [Aspose.OCR](../../../)

---

## PreprocessImage(MemoryStream, PreprocessingFilter) {#preprocessimage}

Use el preprocesamiento de imágenes para mejorar la precisión de OCR. Cree una lista de filtros que se aplicarán a la imagen de entrada en el orden que especifique. ejemplo para crear filtros: PreprocessingFilter filtros = new PreprocessingFilter { PreprocessingFilter.Invert() , PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), PreprocessingFilter.Scale(6f) ), PreprocessingFilter.Dilate() }; No los necesita todos. Establece solo lo que necesitas.

```csharp
public MemoryStream PreprocessImage(MemoryStream stream, PreprocessingFilter filters)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| stream | MemoryStream | Flujo de memoria que contiene la imagen. |
| filters | PreprocessingFilter | Filtros de optimización de imagen[`PreprocessingFilter`](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/). |

### Valor_devuelto

Transmite con imagen modificada para que puedas guardarla o reconocerla.

### Ver también

* class [PreprocessingFilter](../../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/)
* class [AsposeOcr](../)
* espacio de nombres [Aspose.OCR](../../asposeocr/)
* asamblea [Aspose.OCR](../../../)


