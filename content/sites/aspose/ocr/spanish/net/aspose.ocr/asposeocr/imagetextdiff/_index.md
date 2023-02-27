---
title: AsposeOcr.ImageTextDiff
second_title: Referencia de API de Aspose.OCR para .NET
description: AsposeOcr método. Compara los textos de las dos imágenes y devuelve un número que representa cuán similares son 0 a 1.
type: docs
weight: 90
url: /es/net/aspose.ocr/asposeocr/imagetextdiff/
---
## AsposeOcr.ImageTextDiff method

Compara los textos de las dos imágenes y devuelve un número que representa cuán similares son (0 a 1).

```csharp
public float ImageTextDiff(string fullPath1, string fullPath2, RecognitionSettings settings = null, 
    bool ignoreCase = true)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| fullPath1 | String | Camino a la primera imagen. |
| fullPath2 | String | Camino a la segunda imagen. |
| settings | RecognitionSettings | Configuraciones de reconocimiento. |
| ignoreCase | Boolean | Verdadero: significa una búsqueda que no distingue entre mayúsculas y minúsculas. |

### Valor_devuelto

0 significa que los textos son completamente diferentes; 1 significa que los textos son idénticos.

### Ver también

* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* espacio de nombres [Aspose.OCR](../../asposeocr/)
* asamblea [Aspose.OCR](../../../)


