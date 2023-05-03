---
title: Class GraphicsPathIterator
second_title: .NET API संदर्भ के लिए Aspose.Drawing
description: System.Drawing.Drawing2D.GraphicsPathIterator कक्ष. में उपपथ के मध्यम से पुनरवृत करने क क्षमत प्रदन करत हैGraphicsPath और प्रत्येक उपपथ में नहत आकृतयं के प्रकरं क परक्षण करें यह वर्ग इनहेरट नहं कय ज सकत है
type: docs
weight: 270
url: /hi/net/system.drawing.drawing2d/graphicspathiterator/
---
## GraphicsPathIterator class

में उपपथ के माध्यम से पुनरावृति करने की क्षमता प्रदान करता हैGraphicsPath और प्रत्येक उपपथ में निहित आकृतियों के प्रकारों का परीक्षण करें। यह वर्ग इनहेरिट नहीं किया जा सकता है।

```csharp
public sealed class GraphicsPathIterator : IDisposable
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [GraphicsPathIterator](graphicspathiterator/)(GraphicsPath) | का एक नया उदाहरण प्रारंभ करता है`GraphicsPathIterator` वर्ग. |

## गुण

| नाम | विवरण |
| --- | --- |
| [Count](../../system.drawing.drawing2d/graphicspathiterator/count/) { get; } | पथ में बिंदुओं की संख्या प्राप्त करता है। |
| [SubpathCount](../../system.drawing.drawing2d/graphicspathiterator/subpathcount/) { get; } | पथ में उपपथों की संख्या प्राप्त करता है। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [CopyData](../../system.drawing.drawing2d/graphicspathiterator/copydata/)(ref PointF[], ref byte[], int, int) | संबंधित के ग्राफ़िक्सपाथ.पाथपॉइंट्स गुण और ग्राफ़िक्सपाथ.पाथटाइप्स गुण arrays की प्रतिलिपि बनाता है[`GraphicsPath`](../graphicspath/) दो निर्दिष्ट सरणियों में। |
| [Dispose](../../system.drawing.drawing2d/graphicspathiterator/dispose/)() | अप्रबंधित संसाधनों को मुक्त करने, जारी करने या रीसेट करने से संबंधित एप्लिकेशन-परिभाषित कार्य करता है। |
| [Enumerate](../../system.drawing.drawing2d/graphicspathiterator/enumerate/)(ref PointF[], ref byte[]) | संबंधित के ग्राफ़िक्सपाथ.पाथपॉइंट्स गुण और ग्राफ़िक्सपाथ.पाथटाइप्स गुण arrays की प्रतिलिपि बनाता है[`GraphicsPath`](../graphicspath/) दो निर्दिष्ट सरणियों में। |
| [HasCurve](../../system.drawing.drawing2d/graphicspathiterator/hascurve/)() | इंगित करता है कि इससे जुड़ा पथ है या नहीं`GraphicsPathIterator` एक वक्र है. |
| [NextMarker](../../system.drawing.drawing2d/graphicspathiterator/nextmarker/#nextmarker_1)(GraphicsPath) | यह`GraphicsPathIterator` वस्तु में एक है[`GraphicsPath`](../graphicspath/) इससे जुड़ी वस्तु। यह विधि संबद्ध को बढ़ाती है[`GraphicsPath`](../graphicspath/) अपने पथ में अगले मार्कर पर और वर्तमान मार्कर और अगले मार्कर (या पथ के अंत) के बीच निहित सभी बिंदुओं को एक सेकंड में कॉपी करता है[`GraphicsPath`](../graphicspath/) ऑब्जेक्ट पैरामीटर में पारित किया गया। |
| [NextMarker](../../system.drawing.drawing2d/graphicspathiterator/nextmarker/#nextmarker)(out int, out int) | बढ़ाता है`GraphicsPathIterator`पथ में अगले मार्कर के लिए और [आउट] पैरामीटर के माध्यम से इंडेक्स प्रारंभ करें और इंडेक्स को रोकें। |
| [NextPathType](../../system.drawing.drawing2d/graphicspathiterator/nextpathtype/)(out byte, out int, out int) | डेटा बिंदुओं के अगले समूह का आरंभिक सूचकांक और अंतिम सूचकांक प्राप्त करता है जो सभी एक ही प्रकार के होते हैं। |
| [NextSubpath](../../system.drawing.drawing2d/graphicspathiterator/nextsubpath/#nextsubpath_1)(GraphicsPath, out bool) | इसके संबंधित पथ से अगला आंकड़ा (उपपथ) प्राप्त करता है`GraphicsPathIterator` . |
| [NextSubpath](../../system.drawing.drawing2d/graphicspathiterator/nextsubpath/#nextsubpath)(out int, out int, out bool) | चलता है`GraphicsPathIterator` पथ में अगले उपपथ के लिए। अगले उपपथ का प्रारंभ अनुक्रमणिका और अंत अनुक्रमणिका [आउट] पैरामीटर में समाहित हैं। |
| [Rewind](../../system.drawing.drawing2d/graphicspathiterator/rewind/)() | इसे रिवाइंड करता है`GraphicsPathIterator` इसके संबद्ध पथ की शुरुआत के लिए। |

### यह सभी देखें

* नाम स्थान [System.Drawing.Drawing2D](../../system.drawing.drawing2d/)
* सभा [Aspose.Drawing](../../)


