---
title: Class XpsPathGeometry
second_title: .NET API संदर्भ के लिए Aspose.Page
description: Aspose.Page.XPS.XpsModel.XpsPathGeometry कक्ष. वर्ग incapsulating PathGeometry संपत्त तत्व वशेषतएं इस तत्व में आंकड़े वशेषत के सथ नर्दष्ट पथ आंकड़ं क एक सेट हत है य एक चइल्ड पथफगर तत्व के सथ
type: docs
weight: 3270
url: /hi/net/aspose.page.xps.xpsmodel/xpspathgeometry/
---
## XpsPathGeometry class

वर्ग incapsulating PathGeometry संपत्ति तत्व विशेषताएं। इस तत्व में आंकड़े विशेषता के साथ निर्दिष्ट पथ आंकड़ों का एक सेट होता है या एक चाइल्ड पाथफिगर तत्व के साथ।

```csharp
public sealed class XpsPathGeometry : XpsArray<XpsPathFigure>
```

## गुण

| नाम | विवरण |
| --- | --- |
| [Count](../../aspose.page.xps.xpsmodel/xpsarray-1/count/) { get; } |  |
| [FillRule](../../aspose.page.xps.xpsmodel/xpspathgeometry/fillrule/) { get; set; } | यह निर्दिष्ट करते हुए मान लौटाता/सेट करता है कि ज्यामितीय आकृतियों के प्रतिच्छेदी क्षेत्रों को एक क्षेत्र बनाने के लिए कैसे जोड़ा जाता है। |
| [Item](../../aspose.page.xps.xpsmodel/xpsarray-1/item/) { get; } |  |
| [PathFigures](../../aspose.page.xps.xpsmodel/xpspathgeometry/pathfigures/) { get; } | चाइल्ड पाथ फिगर्स की सूची लौटाता है। |
| [Transform](../../aspose.page.xps.xpsmodel/xpspathgeometry/transform/) { get; set; } | स्थानीय मैट्रिक्स ट्रांसफ़ॉर्मेशन की स्थापना करने वाले एफाइन ट्रांसफ़ॉर्मेशन मैट्रिक्स को लौटाता / सेट करता है जो पथ ज्यामिति के सभी चाइल्ड और वंशज तत्वों पर लागू होता है, इससे पहले इसे भरने, क्लिपिंग या स्ट्रोकिंग के लिए का उपयोग किया जाता है। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmodel/xpsarray-1/add/)(XpsPathFigure) |  |
| [AddSegment](../../aspose.page.xps.xpsmodel/xpspathgeometry/addsegment/)(XpsPathSegment) | अंतिम पीएएच आंकड़े के बाल खंडों की सूची में एक पथ खंड जोड़ता है। |
| [Clone](../../aspose.page.xps.xpsmodel/xpspathgeometry/clone/)() | इस पथ ज्यामिति को क्लोन करता है। |
| [Insert](../../aspose.page.xps.xpsmodel/xpsarray-1/insert/)(int, XpsPathFigure) |  |
| [InsertSegment](../../aspose.page.xps.xpsmodel/xpspathgeometry/insertsegment/)(int, XpsPathSegment) | अंतिम पथ आकृति के चाइल्ड सेगमेंट की सूची में एक पथ खंड सम्मिलित करता है*index* स्थिति. |
| [Remove](../../aspose.page.xps.xpsmodel/xpsarray-1/remove/)(XpsPathFigure) |  |
| [RemoveAt](../../aspose.page.xps.xpsmodel/xpsarray-1/removeat/)(int) |  |
| [RemoveSegment](../../aspose.page.xps.xpsmodel/xpspathgeometry/removesegment/)(XpsPathSegment) | पिछले पाथ फिगर के चाइल्ड सेगमेंट की सूची से एक पाथ सेगमेंट निकालता है. |
| [RemoveSegmentAt](../../aspose.page.xps.xpsmodel/xpspathgeometry/removesegmentat/)(int) | के चाइल्ड सेगमेंट की सूची से एक पाथ सेगमेंट हटाता है, जो कि अंतिम पाथ फिगर है*index* स्थिति. |

### यह सभी देखें

* class [XpsArray&lt;T&gt;](../xpsarray-1/)
* class [XpsPathFigure](../xpspathfigure/)
* नाम स्थान [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* सभा [Aspose.Page](../../)


