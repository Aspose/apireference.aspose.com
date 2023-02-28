---
title: AsposeOcr.RecognizeImage
second_title: Aspose.OCR για Αναφορά API .NET
description: AsposeOcr μέθοδος. Αναγνωρίζει κείμενο στην εικόνα.
type: docs
weight: 140
url: /el/net/aspose.ocr/asposeocr/recognizeimage/
---
## RecognizeImage(string) {#recognizeimage_5}

Αναγνωρίζει κείμενο στην εικόνα.

```csharp
public string RecognizeImage(string fullPath)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| fullPath | String | Πορεία προς την εικόνα. |

### Επιστρεφόμενη Αξία

Αναγνωρισμένο κείμενο.

### Παρατηρήσεις

Χρησιμοποιεί αυτόματη διόρθωση λοξής εικόνας και ανίχνευση περιοχών κειμένου. Υποστηρίζει GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Δείτε επίσης

* class [AsposeOcr](../)
* χώρος ονομάτων [Aspose.OCR](../../asposeocr/)
* συνέλευση [Aspose.OCR](../../../)

---

## RecognizeImage(string, RecognitionSettings) {#recognizeimage_3}

Αναγνωρίζει κείμενο στην εικόνα.

```csharp
public RecognitionResult RecognizeImage(string fullPath, RecognitionSettings settings)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| fullPath | String | Πορεία προς την εικόνα. |
| settings | RecognitionSettings | Ρυθμίσεις αναγνώρισης. |

### Επιστρεφόμενη Αξία

ο[`RecognitionResult`](../../recognitionresult/) αντικείμενο με αποτελέσματα αναγνώρισης εικόνας.

### Παρατηρήσεις

Αναγνωρίζει εικόνα με δυνατότητα καθορισμού[`RecognitionSettings`](../../recognitionsettings/) . Υποστηρίζει GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Δείτε επίσης

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* χώρος ονομάτων [Aspose.OCR](../../asposeocr/)
* συνέλευση [Aspose.OCR](../../../)

---

## RecognizeImage(MemoryStream) {#recognizeimage_4}

Αναγνωρίζει κείμενο στην εικόνα.

```csharp
public string RecognizeImage(MemoryStream stream)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| stream | MemoryStream | Ροή μνήμης που περιέχει την εικόνα. |

### Επιστρεφόμενη Αξία

Αναγνωρισμένο κείμενο.

### Παρατηρήσεις

Χρησιμοποιεί αυτόματη διόρθωση λοξής εικόνας και ανίχνευση περιοχών κειμένου. Υποστηρίζει GIF, PNG, JPEG, BMP, TIFF, JFIF.

### Δείτε επίσης

* class [AsposeOcr](../)
* χώρος ονομάτων [Aspose.OCR](../../asposeocr/)
* συνέλευση [Aspose.OCR](../../../)

---

## RecognizeImage(MemoryStream, RecognitionSettings) {#recognizeimage_2}

Αναγνωρίζει κείμενο στην εικόνα.  Αναγνωρίζει εικόνα με δυνατότητα καθορισμού[`RecognitionSettings`](../../recognitionsettings/) . Υποστηρίζει GIF, PNG, JPEG, BMP, TIFF, JFIF.

```csharp
public RecognitionResult RecognizeImage(MemoryStream stream, RecognitionSettings settings)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| stream | MemoryStream | Ροή μνήμης που περιέχει την εικόνα. |
| settings | RecognitionSettings | Ρυθμίσεις αναγνώρισης. |

### Επιστρεφόμενη Αξία

ο[`RecognitionResult`](../../recognitionresult/) αντικείμενο με αποτελέσματα αναγνώρισης εικόνας.

### Δείτε επίσης

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* χώρος ονομάτων [Aspose.OCR](../../asposeocr/)
* συνέλευση [Aspose.OCR](../../../)

---

## RecognizeImage(byte[], int, int, PixelType, RecognitionSettings) {#recognizeimage_1}

Αναγνωρίζει κείμενο στην εικόνα.

```csharp
public RecognitionResult RecognizeImage(byte[] imageData, int width, int height, 
    PixelType pixelFormat, RecognitionSettings settings = null)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| imageData | Byte[] | Αποκωδικοποιημένη εικόνα σε πίνακα bytes. Χρησιμοποιεί τεχνολογία φωτισμού RGB για bitsPerPixel &gt; 1. |
| width | Int32 | Πλάτος εικόνας. |
| height | Int32 | Ύψος εικόνας. |
| pixelFormat | PixelType | Υποστηρίζει byte, rgb, bgr, rgba. |
| settings | RecognitionSettings | Ρυθμίσεις αναγνώρισης. |

### Επιστρεφόμενη Αξία

ο[`RecognitionResult`](../../recognitionresult/) αντικείμενο με αποτελέσματα αναγνώρισης εικόνας.

### Παρατηρήσεις

Αναγνωρίζει εικόνα με δυνατότητα καθορισμού[`RecognitionSettings`](../../recognitionsettings/) . Υποστηρίζει δεδομένα byte αποκωδικοποιημένων σειρών.

### Δείτε επίσης

* class [RecognitionResult](../../recognitionresult/)
* enum [PixelType](../../pixeltype/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* χώρος ονομάτων [Aspose.OCR](../../asposeocr/)
* συνέλευση [Aspose.OCR](../../../)

---

## RecognizeImage(Color[], int, int, RecognitionSettings) {#recognizeimage}

Αναγνωρίζει κείμενο στην εικόνα.

```csharp
public RecognitionResult RecognizeImage(Color[] imageData, int width, int height, 
    RecognitionSettings settings = null)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| imageData | Color[] | Αποκωδικοποιημένη εικόνα σε Aspose.Drawing.Color array. |
| width | Int32 | Πλάτος εικόνας. |
| height | Int32 | Ύψος εικόνας. |
| settings | RecognitionSettings | Ρυθμίσεις αναγνώρισης. |

### Επιστρεφόμενη Αξία

ο[`RecognitionResult`](../../recognitionresult/) αντικείμενο με αποτελέσματα αναγνώρισης εικόνας.

### Παρατηρήσεις

Αναγνωρίζει εικόνα με δυνατότητα καθορισμού[`RecognitionSettings`](../../recognitionsettings/) . Υποστηρίζει δεδομένα byte αποκωδικοποιημένων σειρών.

### Δείτε επίσης

* class [RecognitionResult](../../recognitionresult/)
* class [RecognitionSettings](../../recognitionsettings/)
* class [AsposeOcr](../)
* χώρος ονομάτων [Aspose.OCR](../../asposeocr/)
* συνέλευση [Aspose.OCR](../../../)


