---
title: AsposeOcr.RecognizeInvoice
second_title: Referencia de API de Aspose.OCR para .NET
description: AsposeOcr método. Reconoce texto en imagen de factura.
type: docs
weight: 180
url: /es/net/aspose.ocr/asposeocr/recognizeinvoice/
---
## RecognizeInvoice(string, InvoiceRecognitionSettings) {#recognizeinvoice_1}

Reconoce texto en imagen de factura.

```csharp
public RecognitionResult RecognizeInvoice(string fullPath, 
    InvoiceRecognitionSettings settings = null)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| fullPath | String | Camino a la imagen. |
| settings | InvoiceRecognitionSettings | Configuración de reconocimiento[`InvoiceRecognitionSettings`](../../invoicerecognitionsettings/). |

### Valor_devuelto

El[`RecognitionResult`](../../recognitionresult/) objeto con resultados de reconocimiento de imagen.

### Observaciones

Reconoce la imagen con la capacidad de especificar[`InvoiceRecognitionSettings`](../../invoicerecognitionsettings/) . Compatible con GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Ver también

* class [RecognitionResult](../../recognitionresult/)
* class [InvoiceRecognitionSettings](../../invoicerecognitionsettings/)
* class [AsposeOcr](../)
* espacio de nombres [Aspose.OCR](../../asposeocr/)
* asamblea [Aspose.OCR](../../../)

---

## RecognizeInvoice(MemoryStream, InvoiceRecognitionSettings) {#recognizeinvoice}

Reconoce texto en imagen de factura.

```csharp
public RecognitionResult RecognizeInvoice(MemoryStream stream, 
    InvoiceRecognitionSettings settings = null)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| stream | MemoryStream | Flujo de memoria que contiene la imagen del recibo. |
| settings | InvoiceRecognitionSettings | Configuración de reconocimiento[`InvoiceRecognitionSettings`](../../invoicerecognitionsettings/). |

### Valor_devuelto

El[`RecognitionResult`](../../recognitionresult/) objeto con resultados de reconocimiento de imagen.

### Observaciones

Reconoce la imagen con la capacidad de especificar[`InvoiceRecognitionSettings`](../../invoicerecognitionsettings/) . Compatible con GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Ver también

* class [RecognitionResult](../../recognitionresult/)
* class [InvoiceRecognitionSettings](../../invoicerecognitionsettings/)
* class [AsposeOcr](../)
* espacio de nombres [Aspose.OCR](../../asposeocr/)
* asamblea [Aspose.OCR](../../../)


