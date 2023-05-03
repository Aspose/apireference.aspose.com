---
title: Graphics.EnumerateMetafile
second_title: .NET API संदर्भ के लिए Aspose.Drawing
description: Graphics तरक. नर्दष्ट में रकर्ड भेजत हैMetafile नर्दष्ट छव वशेषतओं क उपयग करके नर्दष्ट बंदु पर प्रदर्शत करने के लए कलबैक वध पर एक समय में एक
type: docs
weight: 460
url: /hi/net/system.drawing/graphics/enumeratemetafile/
---
## EnumerateMetafile(Metafile, PointF, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_8}

निर्दिष्ट में रिकॉर्ड भेजता है[`Metafile`](../../../system.drawing.imaging/metafile/) निर्दिष्ट छवि विशेषताओं का उपयोग करके निर्दिष्ट बिंदु पर प्रदर्शित करने के लिए कॉलबैक विधि पर एक समय में एक।

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData, ImageAttributes imageAttr)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) गणना करना। |
| destPoint | PointF | [`PointF`](../../pointf/) संरचना जो आरेखित मेटाफ़ाइल के ऊपरी-बाएँ कोने के स्थान को निर्दिष्ट करती है। |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) प्रतिनिधि जो उस विधि को निर्दिष्ट करता है जिसमें मेटाफ़ाइल रिकॉर्ड भेजे जाते हैं। |
| callbackData | IntPtr | आंतरिक सूचक जो आवश्यक है, लेकिन अनदेखा किया गया। तुम पास हो सकते होZero इस पैरामीटर के लिए। |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) जो खींची गई छवि के लिए छवि विशेषता जानकारी निर्दिष्ट करता है। |

### यह सभी देखें

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* नाम स्थान [System.Drawing](../../graphics/)
* सभा [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_7}

निर्दिष्ट में रिकॉर्ड भेजता है[`Metafile`](../../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट बिंदु पर प्रदर्शन के लिए एक कॉलबैक विधि के लिए।

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) गणना करना। |
| destPoint | PointF | [`PointF`](../../pointf/) संरचना जो आरेखित मेटाफ़ाइल के ऊपरी-बाएँ कोने के स्थान को निर्दिष्ट करती है। |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) प्रतिनिधि जो उस विधि को निर्दिष्ट करता है जिसमें मेटाफ़ाइल रिकॉर्ड भेजे जाते हैं। |
| callbackData | IntPtr | आंतरिक सूचक जो आवश्यक है, लेकिन अनदेखा किया गया। तुम पास हो सकते होZero इस पैरामीटर के लिए। |

### यह सभी देखें

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* नाम स्थान [System.Drawing](../../graphics/)
* सभा [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], EnumerateMetafileProc) {#enumeratemetafile_12}

निर्दिष्ट में रिकॉर्ड भेजता है[`Metafile`](../../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट समांतर चतुर्भुज में प्रदर्शन के लिए कॉलबैक विधि के लिए।

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) गणना करना। |
| destPoints | PointF[] | तीन का ऐरे[`PointF`](../../pointf/) संरचनाएँ जो एक समांतर चतुर्भुज को परिभाषित करती हैं जो आरेखित मेटाफ़ाइल के आकार और स्थान को निर्धारित करता है। |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) प्रतिनिधि जो उस विधि को निर्दिष्ट करता है जिसमें मेटाफ़ाइल रिकॉर्ड भेजे जाते हैं। |

### यह सभी देखें

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* नाम स्थान [System.Drawing](../../graphics/)
* सभा [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, EnumerateMetafileProc) {#enumeratemetafile}

निर्दिष्ट में रिकॉर्ड भेजता है[`Metafile`](../../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट बिंदु पर प्रदर्शन के लिए एक कॉलबैक विधि के लिए।

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) गणना करना। |
| destPoint | Point | [`Point`](../../point/) संरचना जो आरेखित मेटाफ़ाइल के ऊपरी-बाएँ कोने के स्थान को निर्दिष्ट करती है। |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) प्रतिनिधि जो उस विधि को निर्दिष्ट करता है जिसमें मेटाफ़ाइल रिकॉर्ड भेजे जाते हैं। |

### यह सभी देखें

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* नाम स्थान [System.Drawing](../../graphics/)
* सभा [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_1}

निर्दिष्ट में रिकॉर्ड भेजता है[`Metafile`](../../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट बिंदु पर प्रदर्शन के लिए एक कॉलबैक विधि के लिए।

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) गणना करना। |
| destPoint | Point | [`Point`](../../point/) संरचना जो आरेखित मेटाफ़ाइल के ऊपरी-बाएँ कोने के स्थान को निर्दिष्ट करती है। |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) प्रतिनिधि जो उस विधि को निर्दिष्ट करता है जिसमें मेटाफ़ाइल रिकॉर्ड भेजे जाते हैं। |
| callbackData | IntPtr | आंतरिक सूचक जो आवश्यक है, लेकिन अनदेखा किया गया। तुम पास हो सकते होZero इस पैरामीटर के लिए। |

### यह सभी देखें

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* नाम स्थान [System.Drawing](../../graphics/)
* सभा [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_2}

निर्दिष्ट में रिकॉर्ड भेजता है[`Metafile`](../../../system.drawing.imaging/metafile/) निर्दिष्ट छवि विशेषताओं का उपयोग करके निर्दिष्ट बिंदु पर प्रदर्शन के लिए कॉलबैक विधि के लिए एक समय में एक।

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, EnumerateMetafileProc callback, 
    IntPtr callbackData, ImageAttributes imageAttr)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) गणना करना। |
| destPoint | Point | [`Point`](../../point/) संरचना जो आरेखित मेटाफ़ाइल के ऊपरी-बाएँ कोने के स्थान को निर्दिष्ट करती है। |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) प्रतिनिधि जो उस विधि को निर्दिष्ट करता है जिसमें मेटाफ़ाइल रिकॉर्ड भेजे जाते हैं। |
| callbackData | IntPtr | आंतरिक सूचक जो आवश्यक है, लेकिन अनदेखा किया गया। तुम पास हो सकते होZero इस पैरामीटर के लिए। |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) जो खींची गई छवि के लिए छवि विशेषता जानकारी निर्दिष्ट करता है। |

### यह सभी देखें

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* नाम स्थान [System.Drawing](../../graphics/)
* सभा [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, EnumerateMetafileProc) {#enumeratemetafile_30}

निर्दिष्ट के रिकॉर्ड भेजता है[`Metafile`](../../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट आयत में प्रदर्शित करने के लिए एक कॉलबैक विधि के लिए।

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) गणना करना। |
| destRect | RectangleF | [`RectangleF`](../../rectanglef/) संरचना जो खींची गई मेटाफ़ाइल के स्थान और आकार को निर्दिष्ट करती है। |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) प्रतिनिधि जो उस विधि को निर्दिष्ट करता है जिसमें मेटाफ़ाइल रिकॉर्ड भेजे जाते हैं। |

### यह सभी देखें

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [RectangleF](../../rectanglef/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* नाम स्थान [System.Drawing](../../graphics/)
* सभा [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_31}

निर्दिष्ट के रिकॉर्ड भेजता है[`Metafile`](../../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट आयत में प्रदर्शित करने के लिए एक कॉलबैक विधि के लिए।

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) गणना करना। |
| destRect | RectangleF | [`RectangleF`](../../rectanglef/) संरचना जो खींची गई मेटाफ़ाइल के स्थान और आकार को निर्दिष्ट करती है। |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) प्रतिनिधि जो उस विधि को निर्दिष्ट करता है जिसमें मेटाफ़ाइल रिकॉर्ड भेजे जाते हैं। |
| callbackData | IntPtr | आंतरिक सूचक जो आवश्यक है, लेकिन अनदेखा किया गया। तुम पास हो सकते होZero इस पैरामीटर के लिए। |

### यह सभी देखें

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [RectangleF](../../rectanglef/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* नाम स्थान [System.Drawing](../../graphics/)
* सभा [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_32}

निर्दिष्ट के रिकॉर्ड भेजता है[`Metafile`](../../../system.drawing.imaging/metafile/) निर्दिष्ट छवि विशेषताओं का उपयोग करके एक निर्दिष्ट आयत में प्रदर्शन के लिए कॉलबैक विधि के लिए एक समय में एक।

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) गणना करना। |
| destRect | RectangleF | [`RectangleF`](../../rectanglef/) संरचना जो खींची गई मेटाफ़ाइल के स्थान और आकार को निर्दिष्ट करती है। |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) प्रतिनिधि जो उस विधि को निर्दिष्ट करता है जिसमें मेटाफ़ाइल रिकॉर्ड भेजे जाते हैं। |
| callbackData | IntPtr | आंतरिक सूचक जो आवश्यक है, लेकिन अनदेखा किया गया। तुम पास हो सकते होZero इस पैरामीटर के लिए। |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) जो खींची गई छवि के लिए छवि विशेषता जानकारी निर्दिष्ट करता है। |

### यह सभी देखें

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [RectangleF](../../rectanglef/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* नाम स्थान [System.Drawing](../../graphics/)
* सभा [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, EnumerateMetafileProc) {#enumeratemetafile_24}

निर्दिष्ट के रिकॉर्ड भेजता है[`Metafile`](../../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट आयत में प्रदर्शित करने के लिए एक कॉलबैक विधि के लिए।

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, EnumerateMetafileProc callback)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) गणना करना। |
| destRect | Rectangle | [`Rectangle`](../../rectangle/) संरचना जो खींची गई मेटाफ़ाइल के स्थान और आकार को निर्दिष्ट करती है। |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) प्रतिनिधि जो उस विधि को निर्दिष्ट करता है जिसमें मेटाफ़ाइल रिकॉर्ड भेजे जाते हैं। |

### यह सभी देखें

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Rectangle](../../rectangle/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* नाम स्थान [System.Drawing](../../graphics/)
* सभा [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, EnumerateMetafileProc) {#enumeratemetafile_6}

निर्दिष्ट में रिकॉर्ड भेजता है[`Metafile`](../../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट बिंदु पर प्रदर्शन के लिए एक कॉलबैक विधि के लिए।

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, EnumerateMetafileProc callback)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) गणना करना। |
| destPoint | PointF | [`PointF`](../../pointf/) संरचना जो आरेखित मेटाफ़ाइल के ऊपरी-बाएँ कोने के स्थान को निर्दिष्ट करती है। |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) प्रतिनिधि जो उस विधि को निर्दिष्ट करता है जिसमें मेटाफ़ाइल रिकॉर्ड भेजे जाते हैं। |

### यह सभी देखें

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* नाम स्थान [System.Drawing](../../graphics/)
* सभा [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], EnumerateMetafileProc, IntPtr) {#enumeratemetafile_13}

निर्दिष्ट में रिकॉर्ड भेजता है[`Metafile`](../../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट समांतर चतुर्भुज में प्रदर्शन के लिए कॉलबैक विधि के लिए।

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) गणना करना। |
| destPoints | PointF[] | तीन का ऐरे[`PointF`](../../pointf/) संरचनाएँ जो एक समांतर चतुर्भुज को परिभाषित करती हैं जो आरेखित मेटाफ़ाइल के आकार और स्थान को निर्धारित करता है। |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) प्रतिनिधि जो उस विधि को निर्दिष्ट करता है जिसमें मेटाफ़ाइल रिकॉर्ड भेजे जाते हैं। |
| callbackData | IntPtr | आंतरिक सूचक जो आवश्यक है, लेकिन अनदेखा किया गया। तुम पास हो सकते होZero इस पैरामीटर के लिए। |

### यह सभी देखें

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* नाम स्थान [System.Drawing](../../graphics/)
* सभा [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], EnumerateMetafileProc, IntPtr) {#enumeratemetafile_19}

निर्दिष्ट में रिकॉर्ड भेजता है[`Metafile`](../../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट समांतर चतुर्भुज में प्रदर्शन के लिए कॉलबैक विधि के लिए।

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) गणना करना। |
| destPoints | Point[] | तीन का ऐरे[`Point`](../../point/) संरचनाएँ जो एक समांतर चतुर्भुज को परिभाषित करती हैं जो आरेखित मेटाफ़ाइल के आकार और स्थान को निर्धारित करता है। |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) प्रतिनिधि जो उस विधि को निर्दिष्ट करता है जिसमें मेटाफ़ाइल रिकॉर्ड भेजे जाते हैं। |
| callbackData | IntPtr | आंतरिक सूचक जो आवश्यक है, लेकिन अनदेखा किया गया। तुम पास हो सकते होZero इस पैरामीटर के लिए। |

### यह सभी देखें

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* नाम स्थान [System.Drawing](../../graphics/)
* सभा [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], EnumerateMetafileProc) {#enumeratemetafile_18}

निर्दिष्ट में रिकॉर्ड भेजता है[`Metafile`](../../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट समांतर चतुर्भुज में प्रदर्शन के लिए कॉलबैक विधि के लिए।

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, EnumerateMetafileProc callback)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) गणना करना। |
| destPoints | Point[] | तीन का ऐरे[`Point`](../../point/) संरचनाएँ जो एक समांतर चतुर्भुज को परिभाषित करती हैं जो आरेखित मेटाफ़ाइल के आकार और स्थान को निर्धारित करता है। |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) प्रतिनिधि जो उस विधि को निर्दिष्ट करता है जिसमें मेटाफ़ाइल रिकॉर्ड भेजे जाते हैं। |

### यह सभी देखें

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* नाम स्थान [System.Drawing](../../graphics/)
* सभा [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_23}

से चयनित आयत में रिकॉर्ड भेजता है[`Metafile`](../../../system.drawing.imaging/metafile/) , निर्दिष्ट छवि विशेषताओं का उपयोग करके निर्दिष्ट समांतर चतुर्भुज में प्रदर्शन के लिए कॉलबैक विधि के लिए एक समय में एक।

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) गणना करना। |
| destPoints | Point[] | तीन का ऐरे[`Point`](../../point/) संरचनाएँ जो एक समांतर चतुर्भुज को परिभाषित करती हैं जो आरेखित मेटाफ़ाइल के आकार और स्थान को निर्धारित करता है। |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/) संरचना जो आकर्षित करने के लिए, इसके ऊपरी-बाएँ कोने के सापेक्ष मेटाफ़ाइल के हिस्से को निर्दिष्ट करती है। |
| unit | GraphicsUnit | के सदस्य[`GraphicsUnit`](../../graphicsunit/) गणना जो माप की इकाई को निर्दिष्ट करती है जिसका उपयोग मेटाफ़ाइल के उस भाग को निर्धारित करने के लिए किया जाता है जिसे आयत द्वारा निर्दिष्ट किया गया है*srcRect* पैरामीटर शामिल है। |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) प्रतिनिधि जो उस विधि को निर्दिष्ट करता है जिसमें मेटाफ़ाइल रिकॉर्ड भेजे जाते हैं। |
| callbackData | IntPtr | आंतरिक सूचक जो आवश्यक है, लेकिन अनदेखा किया गया। तुम पास हो सकते होZero इस पैरामीटर के लिए। |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) जो खींची गई छवि के लिए छवि विशेषता जानकारी निर्दिष्ट करता है। |

### यह सभी देखें

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* नाम स्थान [System.Drawing](../../graphics/)
* सभा [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_22}

से चयनित आयत में रिकॉर्ड भेजता है[`Metafile`](../../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट समांतर चतुर्भुज में प्रदर्शन के लिए कॉलबैक विधि के लिए।

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) गणना करना। |
| destPoints | Point[] | तीन का ऐरे[`Point`](../../point/) संरचनाएँ जो एक समांतर चतुर्भुज को परिभाषित करती हैं जो आरेखित मेटाफ़ाइल के आकार और स्थान को निर्धारित करता है। |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/) संरचना जो आकर्षित करने के लिए, इसके ऊपरी-बाएँ कोने के सापेक्ष मेटाफ़ाइल के हिस्से को निर्दिष्ट करती है। |
| srcUnit | GraphicsUnit | के सदस्य[`GraphicsUnit`](../../graphicsunit/) गणना जो माप की इकाई को निर्दिष्ट करती है जिसका उपयोग मेटाफ़ाइल के उस भाग को निर्धारित करने के लिए किया जाता है जिसे आयत द्वारा निर्दिष्ट किया गया है*srcRect* पैरामीटर शामिल है। |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) प्रतिनिधि जो उस विधि को निर्दिष्ट करता है जिसमें मेटाफ़ाइल रिकॉर्ड भेजे जाते हैं। |
| callbackData | IntPtr | आंतरिक सूचक जो आवश्यक है, लेकिन अनदेखा किया गया। तुम पास हो सकते होZero इस पैरामीटर के लिए। |

### यह सभी देखें

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* नाम स्थान [System.Drawing](../../graphics/)
* सभा [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_21}

से चयनित आयत में रिकॉर्ड भेजता है[`Metafile`](../../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट समांतर चतुर्भुज में प्रदर्शन के लिए कॉलबैक विधि के लिए।

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) गणना करना। |
| destPoints | Point[] | तीन का ऐरे[`Point`](../../point/) संरचनाएँ जो एक समांतर चतुर्भुज को परिभाषित करती हैं जो आरेखित मेटाफ़ाइल के आकार और स्थान को निर्धारित करता है। |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/) संरचना जो आकर्षित करने के लिए, इसके ऊपरी-बाएँ कोने के सापेक्ष मेटाफ़ाइल के हिस्से को निर्दिष्ट करती है। |
| srcUnit | GraphicsUnit | के सदस्य[`GraphicsUnit`](../../graphicsunit/) गणना जो माप की इकाई को निर्दिष्ट करती है जिसका उपयोग मेटाफ़ाइल के उस भाग को निर्धारित करने के लिए किया जाता है जिसे आयत द्वारा निर्दिष्ट किया गया है*srcRect* पैरामीटर शामिल है। |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) प्रतिनिधि जो उस विधि को निर्दिष्ट करता है जिसमें मेटाफ़ाइल रिकॉर्ड भेजे जाते हैं। |

### यह सभी देखें

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* नाम स्थान [System.Drawing](../../graphics/)
* सभा [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_17}

से चयनित आयत में रिकॉर्ड भेजता है[`Metafile`](../../../system.drawing.imaging/metafile/) , निर्दिष्ट छवि विशेषताओं का उपयोग करके निर्दिष्ट समांतर चतुर्भुज में प्रदर्शन के लिए कॉलबैक विधि के लिए एक समय में एक।

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) गणना करना। |
| destPoints | PointF[] | तीन का ऐरे[`PointF`](../../pointf/) संरचनाएँ जो एक समांतर चतुर्भुज को परिभाषित करती हैं जो आरेखित मेटाफ़ाइल के आकार और स्थान को निर्धारित करता है। |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/) संरचना जो आकर्षित करने के लिए, इसके ऊपरी-बाएँ कोने के सापेक्ष मेटाफ़ाइल के हिस्से को निर्दिष्ट करती है। |
| unit | GraphicsUnit | के सदस्य[`GraphicsUnit`](../../graphicsunit/) गणना जो माप की इकाई को निर्दिष्ट करती है जिसका उपयोग मेटाफ़ाइल के उस भाग को निर्धारित करने के लिए किया जाता है जिसे आयत द्वारा निर्दिष्ट किया गया है*srcRect* पैरामीटर शामिल है। |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) प्रतिनिधि जो उस विधि को निर्दिष्ट करता है जिसमें मेटाफ़ाइल रिकॉर्ड भेजे जाते हैं। |
| callbackData | IntPtr | आंतरिक सूचक जो आवश्यक है, लेकिन अनदेखा किया गया। तुम पास हो सकते होZero इस पैरामीटर के लिए। |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) जो खींची गई छवि के लिए छवि विशेषता जानकारी निर्दिष्ट करता है। |

### यह सभी देखें

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* नाम स्थान [System.Drawing](../../graphics/)
* सभा [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_16}

से चयनित आयत में रिकॉर्ड भेजता है[`Metafile`](../../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट समांतर चतुर्भुज में प्रदर्शन के लिए कॉलबैक विधि के लिए।

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) गणना करना। |
| destPoints | PointF[] | तीन का ऐरे[`PointF`](../../pointf/) संरचनाएँ जो एक समांतर चतुर्भुज को परिभाषित करती हैं जो आरेखित मेटाफ़ाइल के आकार और स्थान को निर्धारित करता है। |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/) संरचना जो आकर्षित करने के लिए, इसके ऊपरी-बाएँ कोने के सापेक्ष मेटाफ़ाइल के हिस्से को निर्दिष्ट करती है। |
| srcUnit | GraphicsUnit | के सदस्य[`GraphicsUnit`](../../graphicsunit/) गणना जो माप की इकाई को निर्दिष्ट करती है जिसका उपयोग मेटाफ़ाइल के उस भाग को निर्धारित करने के लिए किया जाता है जिसे आयत द्वारा निर्दिष्ट किया गया है*srcRect* पैरामीटर शामिल है। |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) प्रतिनिधि जो उस विधि को निर्दिष्ट करता है जिसमें मेटाफ़ाइल रिकॉर्ड भेजे जाते हैं। |
| callbackData | IntPtr | आंतरिक सूचक जो आवश्यक है, लेकिन अनदेखा किया गया। तुम पास हो सकते होZero इस पैरामीटर के लिए। |

### यह सभी देखें

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* नाम स्थान [System.Drawing](../../graphics/)
* सभा [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_15}

एस से चयनित आयत में रिकॉर्ड भेजता है[`Metafile`](../../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट समांतर चतुर्भुज में प्रदर्शन के लिए कॉलबैक विधि के लिए।

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) गणना करना। |
| destPoints | PointF[] | तीन का ऐरे[`PointF`](../../pointf/) संरचनाएँ जो एक समांतर चतुर्भुज को परिभाषित करती हैं जो आरेखित मेटाफ़ाइल के आकार और स्थान को निर्धारित करता है। |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/) संरचना जो आकर्षित करने के लिए, इसके ऊपरी-बाएँ कोने के सापेक्ष मेटाफ़ाइल के हिस्से को निर्दिष्ट करती है। |
| srcUnit | GraphicsUnit | के सदस्य[`GraphicsUnit`](../../graphicsunit/) गणना जो माप की इकाई को निर्दिष्ट करती है जिसका उपयोग मेटाफ़ाइल के उस भाग को निर्धारित करने के लिए किया जाता है जिसे आयत द्वारा निर्दिष्ट किया गया है*srcRect* पैरामीटर शामिल है। |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) प्रतिनिधि जो उस विधि को निर्दिष्ट करता है जिसमें मेटाफ़ाइल रिकॉर्ड भेजे जाते हैं। |

### यह सभी देखें

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* नाम स्थान [System.Drawing](../../graphics/)
* सभा [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_29}

से चयनित आयत के रिकॉर्ड भेजता है[`Metafile`](../../../system.drawing.imaging/metafile/) निर्दिष्ट छवि विशेषताओं का उपयोग करके एक निर्दिष्ट आयत में प्रदर्शन के लिए कॉलबैक विधि के लिए एक समय में एक।

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) गणना करना। |
| destRect | Rectangle | [`Rectangle`](../../rectangle/) संरचना जो खींची गई मेटाफ़ाइल के स्थान और आकार को निर्दिष्ट करती है। |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/) संरचना जो आकर्षित करने के लिए, इसके ऊपरी-बाएँ कोने के सापेक्ष मेटाफ़ाइल के हिस्से को निर्दिष्ट करती है। |
| unit | GraphicsUnit | के सदस्य[`GraphicsUnit`](../../graphicsunit/) गणना जो माप की इकाई को निर्दिष्ट करती है जिसका उपयोग मेटाफ़ाइल के उस भाग को निर्धारित करने के लिए किया जाता है जिसे आयत द्वारा निर्दिष्ट किया गया है*srcRect* पैरामीटर शामिल है। |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) प्रतिनिधि जो उस विधि को निर्दिष्ट करता है जिसमें मेटाफ़ाइल रिकॉर्ड भेजे जाते हैं। |
| callbackData | IntPtr | आंतरिक सूचक जो आवश्यक है, लेकिन अनदेखा किया गया। तुम पास हो सकते होZero इस पैरामीटर के लिए। |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) जो खींची गई छवि के लिए छवि विशेषता जानकारी निर्दिष्ट करता है। |

### यह सभी देखें

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* नाम स्थान [System.Drawing](../../graphics/)
* सभा [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_28}

से चयनित आयत के रिकॉर्ड भेजता है[`Metafile`](../../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट आयत में प्रदर्शित करने के लिए एक कॉलबैक विधि के लिए।

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) गणना करना। |
| destRect | Rectangle | [`Rectangle`](../../rectangle/) संरचना जो खींची गई मेटाफ़ाइल के स्थान और आकार को निर्दिष्ट करती है। |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/) संरचना जो आकर्षित करने के लिए, इसके ऊपरी-बाएँ कोने के सापेक्ष मेटाफ़ाइल के हिस्से को निर्दिष्ट करती है। |
| srcUnit | GraphicsUnit | के सदस्य[`GraphicsUnit`](../../graphicsunit/) गणना जो माप की इकाई को निर्दिष्ट करती है जिसका उपयोग मेटाफ़ाइल के उस भाग को निर्धारित करने के लिए किया जाता है जिसे आयत द्वारा निर्दिष्ट किया गया है*srcRect* पैरामीटर शामिल है। |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) प्रतिनिधि जो उस विधि को निर्दिष्ट करता है जिसमें मेटाफ़ाइल रिकॉर्ड भेजे जाते हैं। |
| callbackData | IntPtr | आंतरिक सूचक जो आवश्यक है, लेकिन अनदेखा किया गया। तुम पास हो सकते होZero इस पैरामीटर के लिए। |

### यह सभी देखें

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* नाम स्थान [System.Drawing](../../graphics/)
* सभा [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_27}

से चयनित आयत के रिकॉर्ड भेजता है[`Metafile`](../../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट आयत में प्रदर्शित करने के लिए एक कॉलबैक विधि के लिए।

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) गणना करना। |
| destRect | Rectangle | [`Rectangle`](../../rectangle/) संरचना जो खींची गई मेटाफ़ाइल के स्थान और आकार को निर्दिष्ट करती है। |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/) संरचना जो आकर्षित करने के लिए, इसके ऊपरी-बाएँ कोने के सापेक्ष मेटाफ़ाइल के हिस्से को निर्दिष्ट करती है। |
| srcUnit | GraphicsUnit | के सदस्य[`GraphicsUnit`](../../graphicsunit/) गणना जो माप की इकाई को निर्दिष्ट करती है जिसका उपयोग मेटाफ़ाइल के उस भाग को निर्धारित करने के लिए किया जाता है जिसे आयत द्वारा निर्दिष्ट किया गया है*srcRect* पैरामीटर शामिल है। |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) प्रतिनिधि जो उस विधि को निर्दिष्ट करता है जिसमें मेटाफ़ाइल रिकॉर्ड भेजे जाते हैं। |

### यह सभी देखें

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* नाम स्थान [System.Drawing](../../graphics/)
* सभा [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF[], EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_14}

निर्दिष्ट में रिकॉर्ड भेजता है[`Metafile`](../../../system.drawing.imaging/metafile/) , निर्दिष्ट छवि विशेषताओं का उपयोग करके निर्दिष्ट समांतर चतुर्भुज में प्रदर्शन के लिए कॉलबैक विधि के लिए एक समय में एक।

```csharp
public void EnumerateMetafile(Metafile metafile, PointF[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) गणना करना। |
| destPoints | PointF[] | तीन का ऐरे[`PointF`](../../pointf/) संरचनाएँ जो एक समांतर चतुर्भुज को परिभाषित करती हैं जो आरेखित मेटाफ़ाइल के आकार और स्थान को निर्धारित करता है। |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) प्रतिनिधि जो उस विधि को निर्दिष्ट करता है जिसमें मेटाफ़ाइल रिकॉर्ड भेजे जाते हैं। |
| callbackData | IntPtr | आंतरिक सूचक जो आवश्यक है, लेकिन अनदेखा किया गया। तुम पास हो सकते होZero इस पैरामीटर के लिए। |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) जो खींची गई छवि के लिए छवि विशेषता जानकारी निर्दिष्ट करता है। |

### यह सभी देखें

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* नाम स्थान [System.Drawing](../../graphics/)
* सभा [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_35}

से चयनित आयत के रिकॉर्ड भेजता है[`Metafile`](../../../system.drawing.imaging/metafile/) निर्दिष्ट छवि विशेषताओं का उपयोग करके एक निर्दिष्ट आयत में प्रदर्शन के लिए कॉलबैक विधि के लिए एक समय में एक।

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) गणना करना। |
| destRect | RectangleF | [`RectangleF`](../../rectanglef/) संरचना जो खींची गई मेटाफ़ाइल के स्थान और आकार को निर्दिष्ट करती है। |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/) संरचना जो आकर्षित करने के लिए, इसके ऊपरी-बाएँ कोने के सापेक्ष मेटाफ़ाइल के हिस्से को निर्दिष्ट करती है। |
| unit | GraphicsUnit | के सदस्य[`GraphicsUnit`](../../graphicsunit/) गणना जो माप की इकाई को निर्दिष्ट करती है जिसका उपयोग मेटाफ़ाइल के उस भाग को निर्धारित करने के लिए किया जाता है जिसे आयत द्वारा निर्दिष्ट किया गया है*srcRect* पैरामीटर शामिल है। |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) प्रतिनिधि जो उस विधि को निर्दिष्ट करता है जिसमें मेटाफ़ाइल रिकॉर्ड भेजे जाते हैं। |
| callbackData | IntPtr | आंतरिक सूचक जो आवश्यक है, लेकिन अनदेखा किया गया। तुम पास हो सकते होZero इस पैरामीटर के लिए। |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) जो खींची गई छवि के लिए छवि विशेषता जानकारी निर्दिष्ट करता है। |

### यह सभी देखें

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* नाम स्थान [System.Drawing](../../graphics/)
* सभा [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_33}

से चयनित आयत के रिकॉर्ड भेजता है[`Metafile`](../../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट आयत में प्रदर्शित करने के लिए एक कॉलबैक विधि के लिए।

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) गणना करना। |
| destRect | RectangleF | [`RectangleF`](../../rectanglef/) संरचना जो खींची गई मेटाफ़ाइल के स्थान और आकार को निर्दिष्ट करती है। |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/) संरचना जो आकर्षित करने के लिए, इसके ऊपरी-बाएँ कोने के सापेक्ष मेटाफ़ाइल के हिस्से को निर्दिष्ट करती है। |
| srcUnit | GraphicsUnit | के सदस्य[`GraphicsUnit`](../../graphicsunit/) गणना जो माप की इकाई को निर्दिष्ट करती है जिसका उपयोग मेटाफ़ाइल के उस भाग को निर्धारित करने के लिए किया जाता है जिसे आयत द्वारा निर्दिष्ट किया गया है*srcRect* पैरामीटर शामिल है। |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) प्रतिनिधि जो उस विधि को निर्दिष्ट करता है जिसमें मेटाफ़ाइल रिकॉर्ड भेजे जाते हैं। |

### यह सभी देखें

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* नाम स्थान [System.Drawing](../../graphics/)
* सभा [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_5}

से चयनित आयत में रिकॉर्ड भेजता है[`Metafile`](../../../system.drawing.imaging/metafile/) निर्दिष्ट छवि विशेषताओं का उपयोग करके निर्दिष्ट बिंदु पर प्रदर्शन के लिए कॉलबैक विधि के लिए एक समय में एक।

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) गणना करना। |
| destPoint | Point | [`Point`](../../point/) संरचना जो आरेखित मेटाफ़ाइल के ऊपरी-बाएँ कोने के स्थान को निर्दिष्ट करती है। |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/) संरचना जो आकर्षित करने के लिए, इसके ऊपरी-बाएँ कोने के सापेक्ष मेटाफ़ाइल के हिस्से को निर्दिष्ट करती है। |
| unit | GraphicsUnit | के सदस्य[`GraphicsUnit`](../../graphicsunit/) गणना जो माप की इकाई को निर्दिष्ट करती है जिसका उपयोग मेटाफ़ाइल के उस भाग को निर्धारित करने के लिए किया जाता है जिसे आयत द्वारा निर्दिष्ट किया गया है*srcRect* पैरामीटर शामिल है। |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) प्रतिनिधि जो उस विधि को निर्दिष्ट करता है जिसमें मेटाफ़ाइल रिकॉर्ड भेजे जाते हैं। |
| callbackData | IntPtr | आंतरिक सूचक जो आवश्यक है, लेकिन अनदेखा किया गया। तुम पास हो सकते होZero इस पैरामीटर के लिए। |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) जो खींची गई छवि के लिए छवि विशेषता जानकारी निर्दिष्ट करता है। |

### यह सभी देखें

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* नाम स्थान [System.Drawing](../../graphics/)
* सभा [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_4}

से चयनित आयत में रिकॉर्ड भेजता है[`Metafile`](../../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट बिंदु पर प्रदर्शन के लिए एक कॉलबैक विधि के लिए।

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) गणना करना। |
| destPoint | Point | [`Point`](../../point/) संरचना जो आरेखित मेटाफ़ाइल के ऊपरी-बाएँ कोने के स्थान को निर्दिष्ट करती है। |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/) संरचना जो आकर्षित करने के लिए, इसके ऊपरी-बाएँ कोने के सापेक्ष मेटाफ़ाइल के हिस्से को निर्दिष्ट करती है। |
| srcUnit | GraphicsUnit | के सदस्य[`GraphicsUnit`](../../graphicsunit/) गणना जो माप की इकाई को निर्दिष्ट करती है जिसका उपयोग मेटाफ़ाइल के उस भाग को निर्धारित करने के लिए किया जाता है जिसे आयत द्वारा निर्दिष्ट किया गया है*srcRect* पैरामीटर शामिल है। |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) प्रतिनिधि जो उस विधि को निर्दिष्ट करता है जिसमें मेटाफ़ाइल रिकॉर्ड भेजे जाते हैं। |
| callbackData | IntPtr | आंतरिक सूचक जो आवश्यक है, लेकिन अनदेखा किया गया। तुम पास हो सकते होZero इस पैरामीटर के लिए। |

### यह सभी देखें

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* नाम स्थान [System.Drawing](../../graphics/)
* सभा [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_3}

से चयनित आयत में रिकॉर्ड भेजता है[`Metafile`](../../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट बिंदु पर प्रदर्शन के लिए एक कॉलबैक विधि के लिए।

```csharp
public void EnumerateMetafile(Metafile metafile, Point destPoint, Rectangle srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) गणना करना। |
| destPoint | Point | [`Point`](../../point/) संरचना जो आरेखित मेटाफ़ाइल के ऊपरी-बाएँ कोने के स्थान को निर्दिष्ट करती है। |
| srcRect | Rectangle | [`Rectangle`](../../rectangle/) संरचना जो आकर्षित करने के लिए, इसके ऊपरी-बाएँ कोने के सापेक्ष मेटाफ़ाइल के हिस्से को निर्दिष्ट करती है। |
| srcUnit | GraphicsUnit | के सदस्य[`GraphicsUnit`](../../graphicsunit/) गणना जो माप की इकाई को निर्दिष्ट करती है जिसका उपयोग मेटाफ़ाइल के उस भाग को निर्धारित करने के लिए किया जाता है जिसे आयत द्वारा निर्दिष्ट किया गया है*srcRect* पैरामीटर शामिल है। |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) प्रतिनिधि जो उस विधि को निर्दिष्ट करता है जिसमें मेटाफ़ाइल रिकॉर्ड भेजे जाते हैं। |

### यह सभी देखें

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* struct [Rectangle](../../rectangle/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* नाम स्थान [System.Drawing](../../graphics/)
* सभा [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_25}

निर्दिष्ट के रिकॉर्ड भेजता है[`Metafile`](../../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट आयत में प्रदर्शित करने के लिए एक कॉलबैक विधि के लिए।

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) गणना करना। |
| destRect | Rectangle | [`RectangleF`](../../rectanglef/) संरचना जो खींची गई मेटाफ़ाइल के स्थान और आकार को निर्दिष्ट करती है। |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) प्रतिनिधि जो उस विधि को निर्दिष्ट करता है जिसमें मेटाफ़ाइल रिकॉर्ड भेजे जाते हैं। |
| callbackData | IntPtr | आंतरिक सूचक जो आवश्यक है, लेकिन अनदेखा किया गया। तुम पास हो सकते होZero इस पैरामीटर के लिए। |

### यह सभी देखें

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Rectangle](../../rectangle/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* नाम स्थान [System.Drawing](../../graphics/)
* सभा [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_11}

से चयनित आयत में रिकॉर्ड भेजता है[`Metafile`](../../../system.drawing.imaging/metafile/) निर्दिष्ट छवि विशेषताओं का उपयोग करके निर्दिष्ट बिंदु पर प्रदर्शन के लिए कॉलबैक विधि के लिए एक समय में एक।

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit unit, EnumerateMetafileProc callback, IntPtr callbackData, 
    ImageAttributes imageAttr)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) गणना करना। |
| destPoint | PointF | [`PointF`](../../pointf/) संरचना जो आरेखित मेटाफ़ाइल के ऊपरी-बाएँ कोने के स्थान को निर्दिष्ट करती है। |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/) संरचना जो आकर्षित करने के लिए, इसके ऊपरी-बाएँ कोने के सापेक्ष मेटाफ़ाइल के हिस्से को निर्दिष्ट करती है। |
| unit | GraphicsUnit | के सदस्य[`GraphicsUnit`](../../graphicsunit/) गणना जो माप की इकाई को निर्दिष्ट करती है जिसका उपयोग मेटाफ़ाइल के उस भाग को निर्धारित करने के लिए किया जाता है जिसे आयत द्वारा निर्दिष्ट किया गया है*srcRect* पैरामीटर शामिल है। |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) प्रतिनिधि जो उस विधि को निर्दिष्ट करता है जिसमें मेटाफ़ाइल रिकॉर्ड भेजे जाते हैं। |
| callbackData | IntPtr | आंतरिक सूचक जो आवश्यक है, लेकिन अनदेखा किया गया। तुम पास हो सकते होZero इस पैरामीटर के लिए। |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) जो खींची गई छवि के लिए छवि विशेषता जानकारी निर्दिष्ट करता है। |

### यह सभी देखें

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* नाम स्थान [System.Drawing](../../graphics/)
* सभा [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_10}

से चयनित आयत में रिकॉर्ड भेजता है[`Metafile`](../../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट बिंदु पर प्रदर्शन के लिए एक कॉलबैक विधि के लिए।

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) गणना करना। |
| destPoint | PointF | [`PointF`](../../pointf/) संरचना जो आरेखित मेटाफ़ाइल के ऊपरी-बाएँ कोने के स्थान को निर्दिष्ट करती है। |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/) संरचना जो आकर्षित करने के लिए, इसके ऊपरी-बाएँ कोने के सापेक्ष मेटाफ़ाइल के हिस्से को निर्दिष्ट करती है। |
| srcUnit | GraphicsUnit | के सदस्य[`GraphicsUnit`](../../graphicsunit/) गणना जो माप की इकाई को निर्दिष्ट करती है जिसका उपयोग मेटाफ़ाइल के उस भाग को निर्धारित करने के लिए किया जाता है जिसे आयत द्वारा निर्दिष्ट किया गया है*srcRect* पैरामीटर शामिल है। |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) प्रतिनिधि जो उस विधि को निर्दिष्ट करता है जिसमें मेटाफ़ाइल रिकॉर्ड भेजे जाते हैं। |
| callbackData | IntPtr | आंतरिक सूचक जो आवश्यक है, लेकिन अनदेखा किया गया। तुम पास हो सकते होZero इस पैरामीटर के लिए। |

### यह सभी देखें

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* नाम स्थान [System.Drawing](../../graphics/)
* सभा [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc) {#enumeratemetafile_9}

से चयनित आयत में रिकॉर्ड भेजता है[`Metafile`](../../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट बिंदु पर प्रदर्शन के लिए एक कॉलबैक विधि के लिए।

```csharp
public void EnumerateMetafile(Metafile metafile, PointF destPoint, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) गणना करना। |
| destPoint | PointF | [`PointF`](../../pointf/) संरचना जो आरेखित मेटाफ़ाइल के ऊपरी-बाएँ कोने के स्थान को निर्दिष्ट करती है। |
| srcRect | RectangleF | System.Drawing.RectangleF संरचना जो आकर्षित करने के लिए, उसके ऊपरी-बाएँ कोने के सापेक्ष मेटाफ़ाइल के भाग को निर्दिष्ट करती है। |
| srcUnit | GraphicsUnit | के सदस्य[`GraphicsUnit`](../../graphicsunit/) गणना जो माप की इकाई को निर्दिष्ट करती है जिसका उपयोग मेटाफ़ाइल के उस भाग को निर्धारित करने के लिए किया जाता है जिसे आयत द्वारा निर्दिष्ट किया गया है*srcRect* पैरामीटर शामिल है। |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) प्रतिनिधि जो उस विधि को निर्दिष्ट करता है जिसमें मेटाफ़ाइल रिकॉर्ड भेजे जाते हैं। |

### यह सभी देखें

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [PointF](../../pointf/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* नाम स्थान [System.Drawing](../../graphics/)
* सभा [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Point[], EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_20}

निर्दिष्ट में रिकॉर्ड भेजता है[`Metafile`](../../../system.drawing.imaging/metafile/) , निर्दिष्ट छवि विशेषताओं का उपयोग करके निर्दिष्ट समांतर चतुर्भुज में प्रदर्शन के लिए कॉलबैक विधि के लिए एक समय में एक।

```csharp
public void EnumerateMetafile(Metafile metafile, Point[] destPoints, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) गणना करना। |
| destPoints | Point[] | तीन का ऐरे[`Point`](../../point/) संरचनाएँ जो एक समांतर चतुर्भुज को परिभाषित करती हैं जो आरेखित मेटाफ़ाइल के आकार और स्थान को निर्धारित करता है। |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) प्रतिनिधि जो उस विधि को निर्दिष्ट करता है जिसमें मेटाफ़ाइल रिकॉर्ड भेजे जाते हैं। |
| callbackData | IntPtr | आंतरिक सूचक जो आवश्यक है, लेकिन अनदेखा किया गया। तुम पास हो सकते होZero इस पैरामीटर के लिए। |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) जो खींची गई छवि के लिए छवि विशेषता जानकारी निर्दिष्ट करता है। |

### यह सभी देखें

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Point](../../point/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* नाम स्थान [System.Drawing](../../graphics/)
* सभा [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) {#enumeratemetafile_34}

से चयनित आयत के रिकॉर्ड भेजता है[`Metafile`](../../../system.drawing.imaging/metafile/) , एक समय में एक निर्दिष्ट आयत में प्रदर्शित करने के लिए एक कॉलबैक विधि के लिए।

```csharp
public void EnumerateMetafile(Metafile metafile, RectangleF destRect, RectangleF srcRect, 
    GraphicsUnit srcUnit, EnumerateMetafileProc callback, IntPtr callbackData)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) गणना करना। |
| destRect | RectangleF | [`RectangleF`](../../rectanglef/) संरचना जो खींची गई मेटाफ़ाइल के स्थान और आकार को निर्दिष्ट करती है। |
| srcRect | RectangleF | [`RectangleF`](../../rectanglef/) संरचना जो आकर्षित करने के लिए, इसके ऊपरी-बाएँ कोने के सापेक्ष मेटाफ़ाइल के हिस्से को निर्दिष्ट करती है। |
| srcUnit | GraphicsUnit | के सदस्य[`GraphicsUnit`](../../graphicsunit/) गणना जो माप की इकाई को निर्दिष्ट करती है जिसका उपयोग मेटाफ़ाइल के उस भाग को निर्धारित करने के लिए किया जाता है जिसे आयत द्वारा निर्दिष्ट किया गया है*srcRect* पैरामीटर शामिल है। |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) प्रतिनिधि जो उस विधि को निर्दिष्ट करता है जिसमें मेटाफ़ाइल रिकॉर्ड भेजे जाते हैं। |
| callbackData | IntPtr | आंतरिक सूचक जो आवश्यक है, लेकिन अनदेखा किया गया। तुम पास हो सकते होZero इस पैरामीटर के लिए। |

### यह सभी देखें

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [RectangleF](../../rectanglef/)
* enum [GraphicsUnit](../../graphicsunit/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [Graphics](../)
* नाम स्थान [System.Drawing](../../graphics/)
* सभा [Aspose.Drawing](../../../)

---

## EnumerateMetafile(Metafile, Rectangle, EnumerateMetafileProc, IntPtr, ImageAttributes) {#enumeratemetafile_26}

निर्दिष्ट के रिकॉर्ड भेजता है[`Metafile`](../../../system.drawing.imaging/metafile/) निर्दिष्ट छवि विशेषताओं का उपयोग करके एक निर्दिष्ट आयत में प्रदर्शन के लिए कॉलबैक विधि के लिए एक समय में एक।

```csharp
public void EnumerateMetafile(Metafile metafile, Rectangle destRect, 
    EnumerateMetafileProc callback, IntPtr callbackData, ImageAttributes imageAttr)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| metafile | Metafile | [`Metafile`](../../../system.drawing.imaging/metafile/) गणना करना। |
| destRect | Rectangle | [`Rectangle`](../../rectangle/) संरचना जो खींची गई मेटाफ़ाइल के स्थान और आकार को निर्दिष्ट करती है। |
| callback | EnumerateMetafileProc | [`EnumerateMetafileProc`](../../graphics.enumeratemetafileproc/) प्रतिनिधि जो उस विधि को निर्दिष्ट करता है जिसमें मेटाफ़ाइल रिकॉर्ड भेजे जाते हैं। |
| callbackData | IntPtr | आंतरिक सूचक जो आवश्यक है, लेकिन अनदेखा किया गया। तुम पास हो सकते होZero इस पैरामीटर के लिए। |
| imageAttr | ImageAttributes | [`ImageAttributes`](../../../system.drawing.imaging/imageattributes/) जो खींची गई छवि के लिए छवि विशेषता जानकारी निर्दिष्ट करता है। |

### यह सभी देखें

* class [Metafile](../../../system.drawing.imaging/metafile/)
* struct [Rectangle](../../rectangle/)
* delegate [EnumerateMetafileProc](../../graphics.enumeratemetafileproc/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [Graphics](../)
* नाम स्थान [System.Drawing](../../graphics/)
* सभा [Aspose.Drawing](../../../)


