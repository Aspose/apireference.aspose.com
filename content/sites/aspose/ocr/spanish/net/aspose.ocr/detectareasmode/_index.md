---
title: Enum DetectAreasMode
second_title: Referencia de API de Aspose.OCR para .NET
description: Aspose.OCR.DetectAreasMode enumeración. Determina el tipo de red neuronal utilizada para la detección de áreas.
type: docs
weight: 60
url: /es/net/aspose.ocr/detectareasmode/
---
## DetectAreasMode enumeration

Determina el tipo de red neuronal utilizada para la detección de áreas.

```csharp
public enum DetectAreasMode
```

### Valores

| Nombre | Valor | Descripción |
| --- | --- | --- |
| NONE | `0` | No detecta párrafos. Mejor para un documento simple de una columna sin imágenes. |
| DOCUMENT | `1` | Detecta párrafos utiliza modelo NN para documentos. Mejor para documentos de varias columnas, documentos con imágenes o con otros objetos que no sean de texto. |
| PHOTO | `2` | Detecta párrafos utiliza modelo NN para fotos. Mejor para imágenes con muchas imágenes y otros objetos que no sean de texto. |
| COMBINE | `3` | Detecta párrafos con texto y luego usa otro modelo NN para detectar áreas dentro de los párrafos. Mejor para imágenes con estructura compleja. |
| TABLE | `4` | Detecta celdas con texto. Modo preferible para imágenes con estructura de tabla. |
| CURVED_TEXT | `5` | Detecta líneas y reconoce texto en imágenes curvas. Modo preferido para fotografías de páginas de libros y revistas. |

### Observaciones

Usado en el[`RecognitionSettings`](../recognitionsettings/) para especificar qué tipo de imagen desea reconocer.

### Ver también

* espacio de nombres [Aspose.OCR](../../aspose.ocr/)
* asamblea [Aspose.OCR](../../)


