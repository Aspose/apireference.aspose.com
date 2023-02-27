---
title: AsposeOcr.ImageHasText
second_title: Referencia de API de Aspose.OCR para .NET
description: AsposeOcr método. Compruebe si la imagen contiene el fragmento de texto proporcionado.
type: docs
weight: 80
url: /es/net/aspose.ocr/asposeocr/imagehastext/
---
## ImageHasText(string, string, RecognitionSettings, bool) {#imagehastext}

Compruebe si la imagen contiene el fragmento de texto proporcionado.

```csharp
public bool ImageHasText(string fullPath, string text, RecognitionSettings settings = null, 
    bool ignoreCase = true)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| fullPath | String | Camino a la imagen. |
| text | String | Fragmento de texto para buscar en la imagen. |
| settings | RecognitionSettings | Configuraciones de reconocimiento. |
| ignoreCase | Boolean | Verdadero: significa una búsqueda que no distingue entre mayúsculas y minúsculas. |

### Valor_devuelto

Verdadero si la imagen contiene un fragmento de texto. Falso: la imagen no contiene fragmentos de texto.

### Observaciones

Reconoce la imagen con la capacidad de especificar[`RecognitionSettings`](../../recognitionsettings/) . Compatible con GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Ver también

* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* espacio de nombres [Aspose.OCR](../../asposeocr/)
* asamblea [Aspose.OCR](../../../)

---

## ImageHasText(string, Regex, RecognitionSettings) {#imagehastext_1}

Compruebe si el texto de la imagen coincide con la expresión regular proporcionada.

```csharp
public bool ImageHasText(string fullPath, Regex regex, RecognitionSettings settings = null)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| fullPath | String | Camino a la imagen. |
| regex | Regex | Objeto System.Text.RegularExpressions con el patrón y las opciones proporcionados. |
| settings | RecognitionSettings | Configuraciones de reconocimiento. |

### Valor_devuelto

True si el texto de la imagen coincide con la expresión regular proporcionada.

### Observaciones

Reconoce la imagen con la capacidad de especificar[`RecognitionSettings`](../../recognitionsettings/) . Compatible con GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Ver también

* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* espacio de nombres [Aspose.OCR](../../asposeocr/)
* asamblea [Aspose.OCR](../../../)


