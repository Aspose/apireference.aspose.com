---
title: Bitmap.Clone
second_title: .NET API संदर्भ के लिए Aspose.Drawing
description: Bitmap तरक. इसके सेक्शन क कप बनत हैBitmap द्वर परभषतRectangle structure और एक नर्दष्ट के सथPixelFormat गणन.
type: docs
weight: 100
url: /hi/net/system.drawing/bitmap/clone/
---
## Clone(Rectangle, PixelFormat) {#clone}

इसके सेक्शन की कॉपी बनाता हैBitmap द्वारा परिभाषितRectangle structure और एक निर्दिष्ट के साथPixelFormat गणना.

```csharp
public Bitmap Clone(Rectangle rect, PixelFormat format)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| rect | Rectangle | इसके हिस्से को परिभाषित करता हैBitmap कॉपी करने के लिए. निर्देशांक इसके सापेक्ष हैंBitmap. |
| format | PixelFormat | निर्दिष्ट करता हैPixelFormat the गंतव्य के लिए गणनाBitmap. |

### प्रतिलाभ की मात्रा

नईBitmap कि यह विधि बनाती है।

### यह सभी देखें

* struct [Rectangle](../../rectangle/)
* enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* class [Bitmap](../)
* नाम स्थान [System.Drawing](../../bitmap/)
* सभा [Aspose.Drawing](../../../)

---

## Clone(RectangleF, PixelFormat) {#clone_1}

इसके सेक्शन की कॉपी बनाता हैBitmap एक निर्दिष्ट के साथ परिभाषितPixelFormat गणना.

```csharp
public Bitmap Clone(RectangleF rect, PixelFormat format)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| rect | RectangleF | इसके हिस्से को परिभाषित करता हैBitmap प्रतिलिपि बनाने के लिए। |
| format | PixelFormat | निर्दिष्ट करता हैPixelFormat गंतव्य के लिए गणनाBitmap. |

### प्रतिलाभ की मात्रा

Bitmap कि यह विधि बनाती है।

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| OutOfMemoryException | *rect* स्रोत बिटमैप सीमा के बाहर है। |
| ArgumentException | की ऊँचाई या चौड़ाई*rect* 0 है। |

### यह सभी देखें

* struct [RectangleF](../../rectanglef/)
* enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* class [Bitmap](../)
* नाम स्थान [System.Drawing](../../bitmap/)
* सभा [Aspose.Drawing](../../../)


