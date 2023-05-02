---
title: Bitmap.Bitmap
second_title: .NET API संदर्भ के लिए Aspose.Drawing
description: Bitmap नर्मत. क एक नय उदहरण प्ररंभ करत हैBitmap नर्दष्ट आकर के सथ वर्ग
type: docs
weight: 10
url: /hi/net/system.drawing/bitmap/bitmap/
---
## Bitmap(int, int) {#constructor}

का एक नया उदाहरण प्रारंभ करता है[`Bitmap`](../) निर्दिष्ट आकार के साथ वर्ग।

```csharp
public Bitmap(int width, int height)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| width | Int32 | नए बिटमैप की चौड़ाई, पिक्सल में। |
| height | Int32 | नए बिटमैप की ऊँचाई, पिक्सेल में। |

### टिप्पणियों

इस समय केवल समर्थित आंतरिक बिटमैप प्रारूप इसके समतुल्य है`PixelFormat.Format32bppPArgb` .

### यह सभी देखें

* class [Bitmap](../)
* नाम स्थान [System.Drawing](../../bitmap/)
* सभा [Aspose.Drawing](../../../)

---

## Bitmap(string) {#constructor_8}

का एक नया उदाहरण प्रारंभ करता है[`Bitmap`](../) वर्ग निर्दिष्ट फ़ाइल से.

```csharp
public Bitmap(string filename)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| filename | String | बिटमैप फ़ाइल का नाम। |

### यह सभी देखें

* class [Bitmap](../)
* नाम स्थान [System.Drawing](../../bitmap/)
* सभा [Aspose.Drawing](../../../)

---

## Bitmap(string, bool) {#constructor_9}

का एक नया उदाहरण प्रारंभ करता है[`Bitmap`](../) वर्ग निर्दिष्ट फ़ाइल से.

```csharp
public Bitmap(string filename, bool useIcm)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| filename | String | बिटमैप फ़ाइल का नाम। |
| useIcm | Boolean | इसके लिए कलर करेक्शन का इस्तेमाल सही हैBitmap; अन्यथा झूठा। |

### यह सभी देखें

* class [Bitmap](../)
* नाम स्थान [System.Drawing](../../bitmap/)
* सभा [Aspose.Drawing](../../../)

---

## Bitmap(Stream) {#constructor_6}

का एक नया उदाहरण प्रारंभ करता है[`Bitmap`](../) निर्दिष्ट डेटा स्ट्रीम से वर्ग।

```csharp
public Bitmap(Stream stream)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| stream | Stream | छवि लोड करने के लिए उपयोग की जाने वाली डेटा स्ट्रीम। |

### यह सभी देखें

* class [Bitmap](../)
* नाम स्थान [System.Drawing](../../bitmap/)
* सभा [Aspose.Drawing](../../../)

---

## Bitmap(Stream, bool) {#constructor_7}

का एक नया उदाहरण प्रारंभ करता है[`Bitmap`](../) निर्दिष्ट डेटा स्ट्रीम से वर्ग।

```csharp
public Bitmap(Stream stream, bool useIcm)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| stream | Stream | छवि लोड करने के लिए उपयोग की जाने वाली डेटा स्ट्रीम। |
| useIcm | Boolean | `सत्य` इसके लिए कलर करेक्शन का इस्तेमाल करेंBitmap ; अन्यथा,`असत्य`. |

### यह सभी देखें

* class [Bitmap](../)
* नाम स्थान [System.Drawing](../../bitmap/)
* सभा [Aspose.Drawing](../../../)

---

## Bitmap(int, int, PixelFormat) {#constructor_2}

का एक नया उदाहरण प्रारंभ करता है[`Bitmap`](../) वर्ग निर्दिष्ट आकार और प्रारूप के साथ।

```csharp
public Bitmap(int width, int height, PixelFormat format)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| width | Int32 | नए की चौड़ाई, पिक्सल मेंBitmap. |
| height | Int32 | नए की ऊँचाई, पिक्सेल मेंBitmap. |
| format | PixelFormat | PixelFormat नए के लिए गणनाBitmap. |

### यह सभी देखें

* enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* class [Bitmap](../)
* नाम स्थान [System.Drawing](../../bitmap/)
* सभा [Aspose.Drawing](../../../)

---

## Bitmap(int, int, int, PixelFormat, int[]) {#constructor_1}

का एक नया उदाहरण प्रारंभ करता है[`Bitmap`](../) वर्ग निर्दिष्ट आकार और पिक्सेल डेटा के साथ।

```csharp
public Bitmap(int width, int height, int stride, PixelFormat format, int[] data)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| width | Int32 | नए की चौड़ाई, पिक्सल मेंBitmap. |
| height | Int32 | नए की ऊँचाई, पिक्सेल मेंBitmap. |
| stride | Int32 | एक स्कैन लाइन की शुरुआत और अगली के बीच बाइट ऑफ़सेट, चार का गुणक होना चाहिए। |
| format | PixelFormat | PixelFormat नए के लिए गणनाBitmap. |
| data | Int32[] | पिक्सेल डेटा। |

### यह सभी देखें

* enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* class [Bitmap](../)
* नाम स्थान [System.Drawing](../../bitmap/)
* सभा [Aspose.Drawing](../../../)

---

## Bitmap(Image) {#constructor_3}

का एक नया उदाहरण प्रारंभ करता है[`Bitmap`](../) वर्ग निर्दिष्ट मौजूदा छवि से.

```csharp
public Bitmap(Image original)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| original | Image | Image जिससे नया बनाना हैBitmap. |

### यह सभी देखें

* class [Image](../../image/)
* class [Bitmap](../)
* नाम स्थान [System.Drawing](../../bitmap/)
* सभा [Aspose.Drawing](../../../)

---

## Bitmap(Image, Size) {#constructor_5}

का एक नया उदाहरण प्रारंभ करता है[`Bitmap`](../)निर्दिष्ट मौजूदा छवि से वर्ग, निर्दिष्ट आकार तक बढ़ाया गया।

```csharp
public Bitmap(Image original, Size newSize)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| original | Image | Image जिससे नया बनाना हैBitmap |
| newSize | Size | Size संरचना जो नए के आकार का प्रतिनिधित्व करती हैBitmap. |

### यह सभी देखें

* class [Image](../../image/)
* struct [Size](../../size/)
* class [Bitmap](../)
* नाम स्थान [System.Drawing](../../bitmap/)
* सभा [Aspose.Drawing](../../../)

---

## Bitmap(Image, int, int) {#constructor_4}

का एक नया उदाहरण प्रारंभ करता है[`Bitmap`](../) निर्दिष्ट मौजूदा छवि से वर्ग, निर्दिष्ट आकार तक बढ़ाया गया।

```csharp
public Bitmap(Image original, int width, int height)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| original | Image | Image जिससे नया बनाना हैBitmap. |
| width | Int32 | नए की चौड़ाई, पिक्सल मेंBitmap. |
| height | Int32 | नए की ऊँचाई, पिक्सेल मेंBitmap. |

### यह सभी देखें

* class [Image](../../image/)
* class [Bitmap](../)
* नाम स्थान [System.Drawing](../../bitmap/)
* सभा [Aspose.Drawing](../../../)


