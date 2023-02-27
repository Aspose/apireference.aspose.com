---
title: AsposeOcr.RecognizeMultipleImages
second_title: Referencia de API de Aspose.OCR para .NET
description: AsposeOcr método. Reconoce varias imágenes de la lista.  No se admiten archivos ni carpetas. La cantidad máxima de imágenes procesadas es 20. Admite GIF PNG JPEG BMP TIFF JFIF.
type: docs
weight: 200
url: /es/net/aspose.ocr/asposeocr/recognizemultipleimages/
---
## RecognizeMultipleImages(List&lt;string&gt;, RecognitionSettings) {#recognizemultipleimages_1}

Reconoce varias imágenes de la lista.  No se admiten archivos ni carpetas. La cantidad máxima de imágenes procesadas es 20. Admite GIF, PNG, JPEG, BMP, TIFF, JFIF.

```csharp
public List<RecognitionResult> RecognizeMultipleImages(List<string> files, 
    RecognitionSettings settings)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| files | List`1 | Rutas completas a las imágenes. |
| settings | RecognitionSettings | Configuraciones de reconocimiento. |

### Valor_devuelto

Gama de[`RecognitionResult`](../../recognitionresult/) objetos con resultados de reconocimiento para cada imagen procesada.

### Ver también

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* espacio de nombres [Aspose.OCR](../../asposeocr/)
* asamblea [Aspose.OCR](../../../)

---

## RecognizeMultipleImages(List&lt;string&gt;) {#recognizemultipleimages}

Reconoce varias imágenes de la lista con la configuración predeterminada.  No se admiten archivos ni carpetas. La cantidad máxima de imágenes procesadas es 20. Admite GIF, PNG, JPEG, BMP, TIFF, JFIF.

```csharp
public List<RecognitionResult> RecognizeMultipleImages(List<string> files)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| files | List`1 | Rutas completas a las imágenes. |

### Valor_devuelto

Gama de[`RecognitionResult`](../../recognitionresult/) objetos con resultados de reconocimiento para cada imagen procesada.

### Ver también

* class [RecognitionResult](../../recognitionresult/)
* class [AsposeOcr](../)
* espacio de nombres [Aspose.OCR](../../asposeocr/)
* asamblea [Aspose.OCR](../../../)

---

## RecognizeMultipleImages(string, RecognitionSettings) {#recognizemultipleimages_3}

Reconoce varias imágenes empaquetadas en un archivo ZIP o desde una carpeta.  Los archivos y carpetas anidados no son compatibles. La cantidad máxima de imágenes procesadas es 20. Admite GIF, PNG, JPEG, BMP, TIFF, JFIF.

```csharp
public List<RecognitionResult> RecognizeMultipleImages(string path, RecognitionSettings settings)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| path | String | Ruta completa al archivo zip (incluida la extensión .zip) o a la carpeta con las imágenes. |
| settings | RecognitionSettings | Configuraciones de reconocimiento. |

### Valor_devuelto

Gama de[`RecognitionResult`](../../recognitionresult/) objetos con resultados de reconocimiento para cada imagen procesada.

### Ver también

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* espacio de nombres [Aspose.OCR](../../asposeocr/)
* asamblea [Aspose.OCR](../../../)

---

## RecognizeMultipleImages(string) {#recognizemultipleimages_2}

Reconoce varias imágenes empaquetadas en un archivo ZIP o desde una carpeta con la configuración predeterminada.  Los archivos y carpetas anidados no son compatibles. La cantidad máxima de imágenes procesadas es 20. Admite GIF, PNG, JPEG, BMP, TIFF, JFIF.

```csharp
public List<RecognitionResult> RecognizeMultipleImages(string path)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| path | String | Ruta completa al archivo zip (incluida la extensión .zip) o a la carpeta con las imágenes. |

### Valor_devuelto

Gama de[`RecognitionResult`](../../recognitionresult/) objetos con resultados de reconocimiento para cada imagen procesada.

### Ver también

* class [RecognitionResult](../../recognitionresult/)
* class [AsposeOcr](../)
* espacio de nombres [Aspose.OCR](../../asposeocr/)
* asamblea [Aspose.OCR](../../../)


