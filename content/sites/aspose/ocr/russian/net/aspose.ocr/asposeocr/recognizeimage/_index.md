---
title: AsposeOcr.RecognizeImage
second_title: Справочник по Aspose.OCR для .NET API
description: AsposeOcr метод. Распознает текст на изображении.
type: docs
weight: 140
url: /ru/net/aspose.ocr/asposeocr/recognizeimage/
---
## RecognizeImage(string) {#recognizeimage_5}

Распознает текст на изображении.

```csharp
public string RecognizeImage(string fullPath)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| fullPath | String | Путь к изображению. |

### Возвращаемое значение

Распознанный текст.

### Примечания

Использует автоматическую коррекцию перекоса изображения и обнаружение текстовых областей. Поддерживает GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Смотрите также

* class [AsposeOcr](../)
* пространство имен [Aspose.OCR](../../asposeocr/)
* сборка [Aspose.OCR](../../../)

---

## RecognizeImage(string, RecognitionSettings) {#recognizeimage_3}

Распознает текст на изображении.

```csharp
public RecognitionResult RecognizeImage(string fullPath, RecognitionSettings settings)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| fullPath | String | Путь к изображению. |
| settings | RecognitionSettings | Настройки распознавания. |

### Возвращаемое значение

[`RecognitionResult`](../../recognitionresult/) объект с результатами распознавания изображений.

### Примечания

Распознает изображение с возможностью указать[`RecognitionSettings`](../../recognitionsettings/) . Поддерживает GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Смотрите также

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* пространство имен [Aspose.OCR](../../asposeocr/)
* сборка [Aspose.OCR](../../../)

---

## RecognizeImage(MemoryStream) {#recognizeimage_4}

Распознает текст на изображении.

```csharp
public string RecognizeImage(MemoryStream stream)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| stream | MemoryStream | Поток памяти, содержащий изображение. |

### Возвращаемое значение

Распознанный текст.

### Примечания

Использует автоматическую коррекцию перекоса изображения и обнаружение текстовых областей. Поддерживает GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Смотрите также

* class [AsposeOcr](../)
* пространство имен [Aspose.OCR](../../asposeocr/)
* сборка [Aspose.OCR](../../../)

---

## RecognizeImage(MemoryStream, RecognitionSettings) {#recognizeimage_2}

Распознает текст на изображении.  Распознает изображение с возможностью указать[`RecognitionSettings`](../../recognitionsettings/) . Поддерживает GIF, PNG, JPEG, BMP, TIFF, JFIF.

```csharp
public RecognitionResult RecognizeImage(MemoryStream stream, RecognitionSettings settings)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| stream | MemoryStream | Поток памяти, содержащий изображение. |
| settings | RecognitionSettings | Настройки распознавания. |

### Возвращаемое значение

[`RecognitionResult`](../../recognitionresult/) объект с результатами распознавания изображений.

### Смотрите также

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* пространство имен [Aspose.OCR](../../asposeocr/)
* сборка [Aspose.OCR](../../../)

---

## RecognizeImage(byte[], int, int, PixelType, RecognitionSettings) {#recognizeimage_1}

Распознает текст на изображении.

```csharp
public RecognitionResult RecognizeImage(byte[] imageData, int width, int height, 
    PixelType pixelFormat, RecognitionSettings settings = null)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| imageData | Byte[] | Декодированное изображение в массиве байтов. Использует технологию освещения RGB для bitsPerPixel &gt; 1. |
| width | Int32 | Ширина изображения. |
| height | Int32 | Высота изображения. |
| pixelFormat | PixelType | Поддерживает байт, rgb, bgr, rgba. |
| settings | RecognitionSettings | Настройки распознавания. |

### Возвращаемое значение

[`RecognitionResult`](../../recognitionresult/) объект с результатами распознавания изображений.

### Примечания

Распознает изображение с возможностью указать[`RecognitionSettings`](../../recognitionsettings/) . Поддерживает декодированные байтовые данные строки.

### Смотрите также

* class [RecognitionResult](../../recognitionresult/)
* enum [PixelType](../../pixeltype/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* пространство имен [Aspose.OCR](../../asposeocr/)
* сборка [Aspose.OCR](../../../)

---

## RecognizeImage(Color[], int, int, RecognitionSettings) {#recognizeimage}

Распознает текст на изображении.

```csharp
public RecognitionResult RecognizeImage(Color[] imageData, int width, int height, 
    RecognitionSettings settings = null)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| imageData | Color[] | Декодированное изображение в массиве Aspose.Drawing.Color. |
| width | Int32 | Ширина изображения. |
| height | Int32 | Высота изображения. |
| settings | RecognitionSettings | Настройки распознавания. |

### Возвращаемое значение

[`RecognitionResult`](../../recognitionresult/) объект с результатами распознавания изображений.

### Примечания

Распознает изображение с возможностью указать[`RecognitionSettings`](../../recognitionsettings/) . Поддерживает декодированные байтовые данные строки.

### Смотрите также

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* пространство имен [Aspose.OCR](../../asposeocr/)
* сборка [Aspose.OCR](../../../)


