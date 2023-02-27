---
title: AsposeOcr.RecognizeImage
second_title: Aspose.OCR for .NET API Referansı
description: AsposeOcr yöntem. Resimdeki metni tanır.
type: docs
weight: 140
url: /tr/net/aspose.ocr/asposeocr/recognizeimage/
---
## RecognizeImage(string) {#recognizeimage_5}

Resimdeki metni tanır.

```csharp
public string RecognizeImage(string fullPath)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| fullPath | String | Resmin yolu. |

### Geri dönüş değeri

Tanınan metin.

### Notlar

Otomatik görüntü eğim düzeltmesi ve metin alanları algılama kullanır. GIF, PNG, JPEG, BMP, TIFF, JFIF'i destekler.

### Ayrıca bakınız

* class [AsposeOcr](../)
* ad alanı [Aspose.OCR](../../asposeocr/)
* toplantı [Aspose.OCR](../../../)

---

## RecognizeImage(string, RecognitionSettings) {#recognizeimage_3}

Resimdeki metni tanır.

```csharp
public RecognitionResult RecognizeImage(string fullPath, RecognitionSettings settings)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| fullPath | String | Resmin yolu. |
| settings | RecognitionSettings | Tanıma ayarları. |

### Geri dönüş değeri

bu[`RecognitionResult`](../../recognitionresult/) görüntü tanıma sonuçları olan nesne.

### Notlar

Belirtme yeteneği ile görüntüyü tanır[`RecognitionSettings`](../../recognitionsettings/) . GIF, PNG, JPEG, BMP, TIFF, JFIF'i destekler.

### Ayrıca bakınız

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* ad alanı [Aspose.OCR](../../asposeocr/)
* toplantı [Aspose.OCR](../../../)

---

## RecognizeImage(MemoryStream) {#recognizeimage_4}

Resimdeki metni tanır.

```csharp
public string RecognizeImage(MemoryStream stream)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| stream | MemoryStream | Görüntüyü içeren bellek akışı. |

### Geri dönüş değeri

Tanınan metin.

### Notlar

Otomatik görüntü eğim düzeltmesi ve metin alanları algılama kullanır. GIF, PNG, JPEG, BMP, TIFF, JFIF'i destekler.

### Ayrıca bakınız

* class [AsposeOcr](../)
* ad alanı [Aspose.OCR](../../asposeocr/)
* toplantı [Aspose.OCR](../../../)

---

## RecognizeImage(MemoryStream, RecognitionSettings) {#recognizeimage_2}

Resimdeki metni tanır.  Belirtme yeteneği ile görüntüyü tanır[`RecognitionSettings`](../../recognitionsettings/) . GIF, PNG, JPEG, BMP, TIFF, JFIF'i destekler.

```csharp
public RecognitionResult RecognizeImage(MemoryStream stream, RecognitionSettings settings)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| stream | MemoryStream | Görüntüyü içeren bellek akışı. |
| settings | RecognitionSettings | Tanıma ayarları. |

### Geri dönüş değeri

bu[`RecognitionResult`](../../recognitionresult/) görüntü tanıma sonuçları olan nesne.

### Ayrıca bakınız

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* ad alanı [Aspose.OCR](../../asposeocr/)
* toplantı [Aspose.OCR](../../../)

---

## RecognizeImage(byte[], int, int, PixelType, RecognitionSettings) {#recognizeimage_1}

Resimdeki metni tanır.

```csharp
public RecognitionResult RecognizeImage(byte[] imageData, int width, int height, 
    PixelType pixelFormat, RecognitionSettings settings = null)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| imageData | Byte[] | Bayt dizisindeki kodu çözülmüş görüntü. bitsPerPixel &gt; 1 için RGB aydınlatma teknolojisini kullanır. |
| width | Int32 | Resim Genişliği. |
| height | Int32 | Görüntü yüksekliği. |
| pixelFormat | PixelType | Bayt, rgb, bgr, rgba'yı destekler. |
| settings | RecognitionSettings | Tanıma ayarları. |

### Geri dönüş değeri

bu[`RecognitionResult`](../../recognitionresult/) görüntü tanıma sonuçları olan nesne.

### Notlar

Belirtme yeteneği ile görüntüyü tanır[`RecognitionSettings`](../../recognitionsettings/) . Satır kodu çözülmüş bayt verilerini destekler.

### Ayrıca bakınız

* class [RecognitionResult](../../recognitionresult/)
* enum [PixelType](../../pixeltype/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* ad alanı [Aspose.OCR](../../asposeocr/)
* toplantı [Aspose.OCR](../../../)

---

## RecognizeImage(Color[], int, int, RecognitionSettings) {#recognizeimage}

Resimdeki metni tanır.

```csharp
public RecognitionResult RecognizeImage(Color[] imageData, int width, int height, 
    RecognitionSettings settings = null)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| imageData | Color[] | Aspose.Drawing.Color dizisindeki kodu çözülmüş görüntü. |
| width | Int32 | Resim Genişliği. |
| height | Int32 | Görüntü yüksekliği. |
| settings | RecognitionSettings | Tanıma ayarları. |

### Geri dönüş değeri

bu[`RecognitionResult`](../../recognitionresult/) görüntü tanıma sonuçları olan nesne.

### Notlar

Belirtme yeteneği ile görüntüyü tanır[`RecognitionSettings`](../../recognitionsettings/) . Satır kodu çözülmüş bayt verilerini destekler.

### Ayrıca bakınız

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* ad alanı [Aspose.OCR](../../asposeocr/)
* toplantı [Aspose.OCR](../../../)


