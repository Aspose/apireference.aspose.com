---
title: TextureBrush.TextureBrush
second_title: .NET API संदर्भ के लिए Aspose.Drawing
description: TextureBrush नर्मत. क एक नय उदहरण प्ररंभ करत हैTextureBrush वर्ग ज नर्दष्ट छव क उपयग करत है
type: docs
weight: 10
url: /hi/net/system.drawing/texturebrush/texturebrush/
---
## TextureBrush(Image) {#constructor}

का एक नया उदाहरण प्रारंभ करता है[`TextureBrush`](../) वर्ग जो निर्दिष्ट छवि का उपयोग करता है।

```csharp
public TextureBrush(Image bitmap)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| bitmap | Image | Image वस्तु जिसके साथ यहTextureBrush वस्तु अंदरूनी भरती है। |

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | *bitmap* शून्य है। |

### यह सभी देखें

* class [Image](../../image/)
* class [TextureBrush](../)
* नाम स्थान [System.Drawing](../../texturebrush/)
* सभा [Aspose.Drawing](../../../)

---

## TextureBrush(Image, WrapMode) {#constructor_1}

का एक नया उदाहरण प्रारंभ करता है[`TextureBrush`](../) वर्ग जो निर्दिष्ट छवि और रैप मोड का उपयोग करता है।

```csharp
public TextureBrush(Image image, WrapMode wrapMode)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| image | Image | छवि। |
| wrapMode | WrapMode | एWrapMode गणना जो निर्दिष्ट करती है कि यह कैसेTextureBrush वस्तु टाइल की गई है। |

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | *image* शून्य है। |

### यह सभी देखें

* class [Image](../../image/)
* enum [WrapMode](../../../system.drawing.drawing2d/wrapmode/)
* class [TextureBrush](../)
* नाम स्थान [System.Drawing](../../texturebrush/)
* सभा [Aspose.Drawing](../../../)

---

## TextureBrush(Image, WrapMode, RectangleF) {#constructor_2}

का एक नया उदाहरण प्रारंभ करता है[`TextureBrush`](../) वर्ग जो निर्दिष्ट छवि, रैप मोड और बाउंडिंग आयत का उपयोग करता है।

```csharp
public TextureBrush(Image image, WrapMode wrapMode, RectangleF dstRect)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| image | Image | छवि। |
| wrapMode | WrapMode | एWrapMode गणना जो निर्दिष्ट करती है कि यह कैसेTextureBrush वस्तु टाइल की गई है। |
| dstRect | RectangleF | एRectangleF संरचना जो इसके लिए बाउंडिंग आयत का प्रतिनिधित्व करती हैTextureBrush वस्तु। |

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | *image* शून्य है। |

### यह सभी देखें

* class [Image](../../image/)
* enum [WrapMode](../../../system.drawing.drawing2d/wrapmode/)
* struct [RectangleF](../../rectanglef/)
* class [TextureBrush](../)
* नाम स्थान [System.Drawing](../../texturebrush/)
* सभा [Aspose.Drawing](../../../)

---

## TextureBrush(Image, RectangleF) {#constructor_3}

का एक नया उदाहरण प्रारंभ करता है[`TextureBrush`](../) वह वर्ग जो निर्दिष्ट छवि और बाउंडिंग आयत का उपयोग करता है।

```csharp
public TextureBrush(Image image, RectangleF dstRect)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| image | Image | Image वस्तु जिसके साथ यहTextureBrush वस्तु अंदरूनी भरती है। |
| dstRect | RectangleF | एRectangleF संरचना जो इसके लिए बाउंडिंग आयत का प्रतिनिधित्व करती हैTextureBrush वस्तु। |

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | *image* शून्य है। |

### यह सभी देखें

* class [Image](../../image/)
* struct [RectangleF](../../rectanglef/)
* class [TextureBrush](../)
* नाम स्थान [System.Drawing](../../texturebrush/)
* सभा [Aspose.Drawing](../../../)

---

## TextureBrush(Image, RectangleF, ImageAttributes) {#constructor_4}

का एक नया उदाहरण प्रारंभ करता है[`TextureBrush`](../) वर्ग जो निर्दिष्ट छवि, बाउंडिंग आयत और छवि विशेषताओं का उपयोग करता है।

```csharp
public TextureBrush(Image image, RectangleF dstRect, ImageAttributes imageAttr)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| image | Image | इमेज ऑब्जेक्ट जिससे यह टेक्सचरब्रश ऑब्जेक्ट इंटीरियर भरता है। |
| dstRect | RectangleF | एक आयतएफ संरचना जो इस टेक्सचरब्रश ऑब्जेक्ट के लिए बाउंडिंग आयत का प्रतिनिधित्व करती है। |
| imageAttr | ImageAttributes | एक ImageAttributes ऑब्जेक्ट जिसमें इस TextureBrush ऑब्जेक्ट द्वारा उपयोग की गई image के बारे में अतिरिक्त जानकारी शामिल है। |

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| ArgumentNullException | *image* शून्य है। |

### यह सभी देखें

* class [Image](../../image/)
* struct [RectangleF](../../rectanglef/)
* class [ImageAttributes](../../../system.drawing.imaging/imageattributes/)
* class [TextureBrush](../)
* नाम स्थान [System.Drawing](../../texturebrush/)
* सभा [Aspose.Drawing](../../../)


