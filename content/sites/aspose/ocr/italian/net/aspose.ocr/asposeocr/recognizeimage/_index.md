---
title: AsposeOcr.RecognizeImage
second_title: Aspose.OCR per Riferimento API .NET
description: AsposeOcr metodo. Riconosce il testo sullimmagine.
type: docs
weight: 140
url: /it/net/aspose.ocr/asposeocr/recognizeimage/
---
## RecognizeImage(string) {#recognizeimage_5}

Riconosce il testo sull'immagine.

```csharp
public string RecognizeImage(string fullPath)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fullPath | String | Percorso per l'immagine. |

### Valore di ritorno

Testo riconosciuto.

### Osservazioni

Utilizza la correzione automatica dell'inclinazione dell'immagine e il rilevamento delle aree di testo. Supporta GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Guarda anche

* class [AsposeOcr](../)
* spazio dei nomi [Aspose.OCR](../../asposeocr/)
* assemblea [Aspose.OCR](../../../)

---

## RecognizeImage(string, RecognitionSettings) {#recognizeimage_3}

Riconosce il testo sull'immagine.

```csharp
public RecognitionResult RecognizeImage(string fullPath, RecognitionSettings settings)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fullPath | String | Percorso per l'immagine. |
| settings | RecognitionSettings | Impostazioni di riconoscimento. |

### Valore di ritorno

IL[`RecognitionResult`](../../recognitionresult/) oggetto con risultati di riconoscimento dell'immagine.

### Osservazioni

Riconosce l'immagine con la possibilità di specificare[`RecognitionSettings`](../../recognitionsettings/) . Supporta GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Guarda anche

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* spazio dei nomi [Aspose.OCR](../../asposeocr/)
* assemblea [Aspose.OCR](../../../)

---

## RecognizeImage(MemoryStream) {#recognizeimage_4}

Riconosce il testo sull'immagine.

```csharp
public string RecognizeImage(MemoryStream stream)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stream | MemoryStream | Flusso di memoria contenente l'immagine. |

### Valore di ritorno

Testo riconosciuto.

### Osservazioni

Utilizza la correzione automatica dell'inclinazione dell'immagine e il rilevamento delle aree di testo. Supporta GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Guarda anche

* class [AsposeOcr](../)
* spazio dei nomi [Aspose.OCR](../../asposeocr/)
* assemblea [Aspose.OCR](../../../)

---

## RecognizeImage(MemoryStream, RecognitionSettings) {#recognizeimage_2}

Riconosce il testo sull'immagine.  Riconosce l'immagine con la possibilità di specificare[`RecognitionSettings`](../../recognitionsettings/) . Supporta GIF, PNG, JPEG, BMP, TIFF, JFIF.

```csharp
public RecognitionResult RecognizeImage(MemoryStream stream, RecognitionSettings settings)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stream | MemoryStream | Flusso di memoria contenente l'immagine. |
| settings | RecognitionSettings | Impostazioni di riconoscimento. |

### Valore di ritorno

IL[`RecognitionResult`](../../recognitionresult/) oggetto con risultati di riconoscimento dell'immagine.

### Guarda anche

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* spazio dei nomi [Aspose.OCR](../../asposeocr/)
* assemblea [Aspose.OCR](../../../)

---

## RecognizeImage(byte[], int, int, PixelType, RecognitionSettings) {#recognizeimage_1}

Riconosce il testo sull'immagine.

```csharp
public RecognitionResult RecognizeImage(byte[] imageData, int width, int height, 
    PixelType pixelFormat, RecognitionSettings settings = null)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| imageData | Byte[] | Immagine decodificata nell'array di byte. Utilizza la tecnologia di illuminazione RGB per bitsPerPixel &gt; 1. |
| width | Int32 | Larghezza dell'immagine. |
| height | Int32 | Altezza dell'immagine. |
| pixelFormat | PixelType | Supporta byte, rgb, bgr, rgba. |
| settings | RecognitionSettings | Impostazioni di riconoscimento. |

### Valore di ritorno

IL[`RecognitionResult`](../../recognitionresult/) oggetto con risultati di riconoscimento dell'immagine.

### Osservazioni

Riconosce l'immagine con la possibilità di specificare[`RecognitionSettings`](../../recognitionsettings/) . Supporta dati in byte decodificati per riga.

### Guarda anche

* class [RecognitionResult](../../recognitionresult/)
* enum [PixelType](../../pixeltype/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* spazio dei nomi [Aspose.OCR](../../asposeocr/)
* assemblea [Aspose.OCR](../../../)

---

## RecognizeImage(Color[], int, int, RecognitionSettings) {#recognizeimage}

Riconosce il testo sull'immagine.

```csharp
public RecognitionResult RecognizeImage(Color[] imageData, int width, int height, 
    RecognitionSettings settings = null)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| imageData | Color[] | Immagine decodificata nell'array Aspose.Drawing.Color. |
| width | Int32 | Larghezza dell'immagine. |
| height | Int32 | Altezza dell'immagine. |
| settings | RecognitionSettings | Impostazioni di riconoscimento. |

### Valore di ritorno

IL[`RecognitionResult`](../../recognitionresult/) oggetto con risultati di riconoscimento dell'immagine.

### Osservazioni

Riconosce l'immagine con la possibilità di specificare[`RecognitionSettings`](../../recognitionsettings/) . Supporta dati in byte decodificati per riga.

### Guarda anche

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* spazio dei nomi [Aspose.OCR](../../asposeocr/)
* assemblea [Aspose.OCR](../../../)


