---
title: AsposeOcr.RecognizeImage
second_title: Referencia de API de Aspose.OCR para .NET
description: AsposeOcr método. Reconoce texto en imagen.
type: docs
weight: 140
url: /es/net/aspose.ocr/asposeocr/recognizeimage/
---
## RecognizeImage(string) {#recognizeimage_5}

Reconoce texto en imagen.

```csharp
public string RecognizeImage(string fullPath)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| fullPath | String | Camino a la imagen. |

### Valor_devuelto

Texto reconocido.

### Observaciones

Utiliza la corrección automática de la inclinación de la imagen y la detección de áreas de texto. Admite GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Ver también

* class [AsposeOcr](../)
* espacio de nombres [Aspose.OCR](../../asposeocr/)
* asamblea [Aspose.OCR](../../../)

---

## RecognizeImage(string, RecognitionSettings) {#recognizeimage_3}

Reconoce texto en imagen.

```csharp
public RecognitionResult RecognizeImage(string fullPath, RecognitionSettings settings)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| fullPath | String | Camino a la imagen. |
| settings | RecognitionSettings | Configuraciones de reconocimiento. |

### Valor_devuelto

El[`RecognitionResult`](../../recognitionresult/) objeto con resultados de reconocimiento de imagen.

### Observaciones

Reconoce la imagen con la capacidad de especificar[`RecognitionSettings`](../../recognitionsettings/) . Compatible con GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Ver también

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* espacio de nombres [Aspose.OCR](../../asposeocr/)
* asamblea [Aspose.OCR](../../../)

---

## RecognizeImage(MemoryStream) {#recognizeimage_4}

Reconoce texto en imagen.

```csharp
public string RecognizeImage(MemoryStream stream)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| stream | MemoryStream | Flujo de memoria que contiene la imagen. |

### Valor_devuelto

Texto reconocido.

### Observaciones

Utiliza la corrección automática de la inclinación de la imagen y la detección de áreas de texto. Admite GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Ver también

* class [AsposeOcr](../)
* espacio de nombres [Aspose.OCR](../../asposeocr/)
* asamblea [Aspose.OCR](../../../)

---

## RecognizeImage(MemoryStream, RecognitionSettings) {#recognizeimage_2}

Reconoce texto en imagen.  Reconoce la imagen con la capacidad de especificar[`RecognitionSettings`](../../recognitionsettings/) . Compatible con GIF, PNG, JPEG, BMP, TIFF, JFIF.

```csharp
public RecognitionResult RecognizeImage(MemoryStream stream, RecognitionSettings settings)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| stream | MemoryStream | Flujo de memoria que contiene la imagen. |
| settings | RecognitionSettings | Configuraciones de reconocimiento. |

### Valor_devuelto

El[`RecognitionResult`](../../recognitionresult/) objeto con resultados de reconocimiento de imagen.

### Ver también

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* espacio de nombres [Aspose.OCR](../../asposeocr/)
* asamblea [Aspose.OCR](../../../)

---

## RecognizeImage(byte[], int, int, PixelType, RecognitionSettings) {#recognizeimage_1}

Reconoce texto en imagen.

```csharp
public RecognitionResult RecognizeImage(byte[] imageData, int width, int height, 
    PixelType pixelFormat, RecognitionSettings settings = null)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| imageData | Byte[] | Imagen decodificada en matriz de bytes. Utiliza tecnología de iluminación RGB para bitsPerPixel &gt; 1. |
| width | Int32 | Ancho de la imagen. |
| height | Int32 | Altura de imagen. |
| pixelFormat | PixelType | Soporta byte, rgb, bgr, rgba. |
| settings | RecognitionSettings | Configuraciones de reconocimiento. |

### Valor_devuelto

El[`RecognitionResult`](../../recognitionresult/) objeto con resultados de reconocimiento de imagen.

### Observaciones

Reconoce la imagen con la capacidad de especificar[`RecognitionSettings`](../../recognitionsettings/) . Admite datos de bytes decodificados de fila.

### Ver también

* class [RecognitionResult](../../recognitionresult/)
* enum [PixelType](../../pixeltype/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* espacio de nombres [Aspose.OCR](../../asposeocr/)
* asamblea [Aspose.OCR](../../../)

---

## RecognizeImage(Color[], int, int, RecognitionSettings) {#recognizeimage}

Reconoce texto en imagen.

```csharp
public RecognitionResult RecognizeImage(Color[] imageData, int width, int height, 
    RecognitionSettings settings = null)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| imageData | Color[] | Imagen decodificada en la matriz Aspose.Drawing.Color. |
| width | Int32 | Ancho de la imagen. |
| height | Int32 | Altura de imagen. |
| settings | RecognitionSettings | Configuraciones de reconocimiento. |

### Valor_devuelto

El[`RecognitionResult`](../../recognitionresult/) objeto con resultados de reconocimiento de imagen.

### Observaciones

Reconoce la imagen con la capacidad de especificar[`RecognitionSettings`](../../recognitionsettings/) . Admite datos de bytes decodificados de fila.

### Ver también

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* espacio de nombres [Aspose.OCR](../../asposeocr/)
* asamblea [Aspose.OCR](../../../)


