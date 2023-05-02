---
title: GraphicsPath.Warp
second_title: .NET API संदर्भ के लिए Aspose.Drawing
description: GraphicsPath तरक. इसके लए एक आयत और एक समंतर चतुर्भुज द्वर परभषत एक तन परवर्तन लगू करत हैGraphicsPath .
type: docs
weight: 350
url: /hi/net/system.drawing.drawing2d/graphicspath/warp/
---
## Warp(PointF[], RectangleF) {#warp}

इसके लिए एक आयत और एक समांतर चतुर्भुज द्वारा परिभाषित एक ताना परिवर्तन लागू करता है[`GraphicsPath`](../) .

```csharp
public void Warp(PointF[] destPoints, RectangleF srcRect)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| destPoints | PointF[] | की एक सरणीPointF संरचनाएं जो समांतर चतुर्भुज को परिभाषित करती हैं जिससे आयत परिभाषित होता है*srcRect* रूपांतरित हो गया है। सरणी में तीन या चार तत्व हो सकते हैं। यदि सरणी में तीन तत्व हैं, तो समांतर चतुर्भुज के निचले-दाएं कोने को पहले तीन बिंदुओं द्वारा निहित किया जाता है। |
| srcRect | RectangleF | एRectangleF जो उस आयत का प्रतिनिधित्व करता है जिसे परिभाषित समांतर चतुर्भुज में बदल दिया जाता है*destPoints* . |

### यह सभी देखें

* struct [PointF](../../../system.drawing/pointf/)
* struct [RectangleF](../../../system.drawing/rectanglef/)
* class [GraphicsPath](../)
* नाम स्थान [System.Drawing.Drawing2D](../../graphicspath/)
* सभा [Aspose.Drawing](../../../)

---

## Warp(PointF[], RectangleF, Matrix) {#warp_1}

इसमें एक आयत और एक समांतर चतुर्भुज द्वारा परिभाषित एक ताना परिवर्तन लागू होता है[`GraphicsPath`](../).

```csharp
public void Warp(PointF[] destPoints, RectangleF srcRect, Matrix matrix)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| destPoints | PointF[] | की एक सरणीPointF संरचनाएं जो समांतर चतुर्भुज को परिभाषित करती हैं जिससे आयत परिभाषित होता है*srcRect* रूपांतरित हो गया है। सरणी में तीन या चार तत्व हो सकते हैं। यदि सरणी में तीन तत्व हैं, तो समांतर चतुर्भुज के निचले-दाएं कोने को पहले तीन बिंदुओं द्वारा निहित किया जाता है। |
| srcRect | RectangleF | एRectangleF जो उस आयत का प्रतिनिधित्व करता है जिसे परिभाषित समांतर चतुर्भुज में बदल दिया जाता है*destPoints* . |
| matrix | Matrix | ए[`Matrix`](../../matrix/) जो पथ पर लागू करने के लिए एक ज्यामितीय परिवर्तन निर्दिष्ट करता है। |

### यह सभी देखें

* struct [PointF](../../../system.drawing/pointf/)
* struct [RectangleF](../../../system.drawing/rectanglef/)
* class [Matrix](../../matrix/)
* class [GraphicsPath](../)
* नाम स्थान [System.Drawing.Drawing2D](../../graphicspath/)
* सभा [Aspose.Drawing](../../../)

---

## Warp(PointF[], RectangleF, Matrix, WarpMode) {#warp_2}

इसमें एक आयत और एक समांतर चतुर्भुज द्वारा परिभाषित एक ताना परिवर्तन लागू होता है[`GraphicsPath`](../).

```csharp
public void Warp(PointF[] destPoints, RectangleF srcRect, Matrix matrix, WarpMode warpMode)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| destPoints | PointF[] | की एक सरणीPointF संरचनाएं जो समांतर चतुर्भुज को परिभाषित करती हैं जिससे आयत परिभाषित होता है*srcRect* रूपांतरित हो गया है। सरणी में या तो तीन या चार तत्व हो सकते हैं। |
| srcRect | RectangleF | एRectangleF जो उस आयत का प्रतिनिधित्व करता है जिसे परिभाषित समांतर चतुर्भुज में बदल दिया जाता है*destPoints* . |
| matrix | Matrix | ए[`Matrix`](../../matrix/) जो पथ पर लागू करने के लिए एक ज्यामितीय परिवर्तन निर्दिष्ट करता है। |
| warpMode | WarpMode | ए[`WarpMode`](../../warpmode/) गणना जो निर्दिष्ट करती है कि यह वार्प ऑपरेशन परिप्रेक्ष्य या बिलिनियर मोड का उपयोग करता है या नहीं। |

### यह सभी देखें

* struct [PointF](../../../system.drawing/pointf/)
* struct [RectangleF](../../../system.drawing/rectanglef/)
* class [Matrix](../../matrix/)
* enum [WarpMode](../../warpmode/)
* class [GraphicsPath](../)
* नाम स्थान [System.Drawing.Drawing2D](../../graphicspath/)
* सभा [Aspose.Drawing](../../../)

---

## Warp(PointF[], RectangleF, Matrix, WarpMode, float) {#warp_3}

इसमें एक आयत और एक समांतर चतुर्भुज द्वारा परिभाषित एक ताना परिवर्तन लागू होता है[`GraphicsPath`](../).

```csharp
public void Warp(PointF[] destPoints, RectangleF srcRect, Matrix matrix, WarpMode warpMode, 
    float flatness)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| destPoints | PointF[] | की एक सरणीPointF संरचनाएं जो समांतर चतुर्भुज को परिभाषित करती हैं जिससे आयत परिभाषित होता है*srcRect* रूपांतरित हो गया है। सरणी में या तो तीन या चार तत्व हो सकते हैं। |
| srcRect | RectangleF | एRectangleF जो उस आयत का प्रतिनिधित्व करता है जिसे परिभाषित समांतर चतुर्भुज में बदल दिया जाता है*destPoints* . |
| matrix | Matrix | ए[`Matrix`](../../matrix/) जो पथ पर लागू करने के लिए एक ज्यामितीय परिवर्तन निर्दिष्ट करता है। |
| warpMode | WarpMode | ए[`WarpMode`](../../warpmode/) गणना जो निर्दिष्ट करती है कि यह वार्प ऑपरेशन परिप्रेक्ष्य या बिलिनियर मोड का उपयोग करता है या नहीं। |
| flatness | Single | 0 से 1 तक का मान जो निर्दिष्ट करता है कि परिणामी पथ कितना सपाट है। अधिक जानकारी के लिए, देखें[`Flatten`](../flatten/) तरीके। |

### यह सभी देखें

* struct [PointF](../../../system.drawing/pointf/)
* struct [RectangleF](../../../system.drawing/rectanglef/)
* class [Matrix](../../matrix/)
* enum [WarpMode](../../warpmode/)
* class [GraphicsPath](../)
* नाम स्थान [System.Drawing.Drawing2D](../../graphicspath/)
* सभा [Aspose.Drawing](../../../)


