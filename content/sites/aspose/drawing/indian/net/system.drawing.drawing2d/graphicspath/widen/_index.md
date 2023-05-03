---
title: GraphicsPath.Widen
second_title: .NET API संदर्भ के लिए Aspose.Drawing
description: GraphicsPath तरक. पथ में एक अतरक्त रूपरेख जड़त है
type: docs
weight: 360
url: /hi/net/system.drawing.drawing2d/graphicspath/widen/
---
## Widen(Pen) {#widen}

पथ में एक अतिरिक्त रूपरेखा जोड़ता है।

```csharp
public void Widen(Pen pen)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| pen | Pen | एPen यह पथ की मूल रूपरेखा और इस पद्धति द्वारा बनाई गई नई रूपरेखा के बीच की चौड़ाई को निर्दिष्ट करता है। |

### अपवाद

| अपवाद | स्थिति |
| --- | --- |
| NotImplementedException | तरीका लागू नहीं किया। |

### यह सभी देखें

* class [Pen](../../../system.drawing/pen/)
* class [GraphicsPath](../)
* नाम स्थान [System.Drawing.Drawing2D](../../graphicspath/)
* सभा [Aspose.Drawing](../../../)

---

## Widen(Pen, Matrix) {#widen_1}

में एक अतिरिक्त रूपरेखा जोड़ता हैGraphicsPath .

```csharp
public void Widen(Pen pen, Matrix matrix)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| pen | Pen | एPen यह पथ की मूल रूपरेखा और इस पद्धति द्वारा बनाई गई नई रूपरेखा के बीच की चौड़ाई को निर्दिष्ट करता है। |
| matrix | Matrix | एMatrix जो विस्तार करने से पहले पथ पर लागू करने के लिए परिवर्तन निर्दिष्ट करता है। |

### यह सभी देखें

* class [Pen](../../../system.drawing/pen/)
* class [Matrix](../../matrix/)
* class [GraphicsPath](../)
* नाम स्थान [System.Drawing.Drawing2D](../../graphicspath/)
* सभा [Aspose.Drawing](../../../)

---

## Widen(Pen, Matrix, float) {#widen_2}

इसे बदलता हैGraphicsPath वक्र के साथ जो उस क्षेत्र को घेरता है जो निर्दिष्ट पेन द्वारा इस पथ को खींचे जाने पर भर जाता है।

```csharp
public void Widen(Pen pen, Matrix matrix, float flatness)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| pen | Pen | एPen यह पथ की मूल रूपरेखा और इस पद्धति द्वारा बनाई गई नई रूपरेखा के बीच की चौड़ाई को निर्दिष्ट करता है। |
| matrix | Matrix | एMatrix जो विस्तार करने से पहले पथ पर लागू करने के लिए परिवर्तन निर्दिष्ट करता है। |
| flatness | Single | एक मान जो वक्रों के लिए समतलता निर्दिष्ट करता है। |

### टिप्पणियों

एमएस सिस्टम। ड्राइंग कार्यान्वयन कॉल फ्लैटन () को वाइडन () के अंदर कॉल करता है या समान एल्गोरिथ्म का उपयोग करता है। यह उपेक्षा करता है`समतलता` पैरामीटर.

### यह सभी देखें

* class [Pen](../../../system.drawing/pen/)
* class [Matrix](../../matrix/)
* class [GraphicsPath](../)
* नाम स्थान [System.Drawing.Drawing2D](../../graphicspath/)
* सभा [Aspose.Drawing](../../../)


