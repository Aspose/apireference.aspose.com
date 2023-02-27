---
title: AsposeOcr.RecognizePdf
second_title: Referencia de API de Aspose.OCR para .NET
description: AsposeOcr método. Reconocer texto de pdf escaneado extraer imágenes.  Reconoce el archivo pdf con la capacidad de especificarDocumentRecognitionSettings . Solo admite PDF escaneados. No es compatible con PDF que admite búsquedas.
type: docs
weight: 220
url: /es/net/aspose.ocr/asposeocr/recognizepdf/
---
## RecognizePdf(string, DocumentRecognitionSettings) {#recognizepdf_1}

Reconocer texto de pdf escaneado (extraer imágenes).  Reconoce el archivo pdf con la capacidad de especificar[`DocumentRecognitionSettings`](../../documentrecognitionsettings/) . Solo admite PDF escaneados. No es compatible con PDF que admite búsquedas.

```csharp
public List<RecognitionResult> RecognizePdf(string fullPath, DocumentRecognitionSettings settings)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| fullPath | String | Ruta completa a la imagen. |
| settings | DocumentRecognitionSettings | Configuraciones de reconocimiento. |

### Valor_devuelto

El[`RecognitionResult`](../../recognitionresult/) objeto con resultados de reconocimiento de imagen.

### Ver también

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* espacio de nombres [Aspose.OCR](../../asposeocr/)
* asamblea [Aspose.OCR](../../../)

---

## RecognizePdf(MemoryStream, DocumentRecognitionSettings) {#recognizepdf}

Reconocer texto de pdf escaneado (extraer imágenes).  Reconoce el archivo pdf con la capacidad de especificar[`RecognitionSettings`](../../recognitionsettings/) . Solo admite PDF escaneados. No es compatible con PDF que admite búsquedas.

```csharp
public List<RecognitionResult> RecognizePdf(MemoryStream stream, 
    DocumentRecognitionSettings settings)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| stream | MemoryStream | Flujo de memoria con el archivo pdf. |
| settings | DocumentRecognitionSettings | Configuraciones de reconocimiento. |

### Valor_devuelto

El[`RecognitionResult`](../../recognitionresult/) objeto con resultados de reconocimiento de imagen.

### Ver también

* class [RecognitionResult](../../recognitionresult/)
* class [DocumentRecognitionSettings](../../documentrecognitionsettings/)
* class [AsposeOcr](../)
* espacio de nombres [Aspose.OCR](../../asposeocr/)
* asamblea [Aspose.OCR](../../../)


