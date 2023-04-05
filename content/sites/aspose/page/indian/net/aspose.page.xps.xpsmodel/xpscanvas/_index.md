---
title: Class XpsCanvas
second_title: .NET API संदर्भ के लिए Aspose.Page
description: Aspose.Page.XPS.XpsModel.XpsCanvas कक्ष. कैनवस तत्व सुवधओं क समहत करने वल वर्ग यह तत्व तत्वं क एक सथ समूहत करत है उदहरण के लए ग्लफ़ और पथ तत्व क एक इकई हइपरलंक गंतव्य के रूप में के रूप में पहचने जने के लए एक कैनवस में समूहकृत कय ज सकत है य प्रत्येक बच्चे और पूर्वज तत्व के लए एक रचत गुण मन लगू करने के लए
type: docs
weight: 2970
url: /hi/net/aspose.page.xps.xpsmodel/xpscanvas/
---
## XpsCanvas class

कैनवस तत्व सुविधाओं को समाहित करने वाला वर्ग। यह तत्व तत्वों को एक साथ समूहित करता है। उदाहरण के लिए, ग्लिफ़ और पथ तत्व को एक इकाई (हाइपरलिंक गंतव्य के रूप में) के रूप में पहचाने जाने के लिए एक कैनवास में समूहीकृत किया जा सकता है या प्रत्येक बच्चे और पूर्वज तत्व के लिए एक रचित गुण मान लागू करने के लिए।

```csharp
public sealed class XpsCanvas : XpsContentElement
```

## गुण

| नाम | विवरण |
| --- | --- |
| [Clip](../../aspose.page.xps.xpsmodel/xpscontentelement/clip/) { get; set; } | तत्व के प्रदान किए गए क्षेत्र को सीमित करने वाले पथ ज्यामिति उदाहरण को लौटाता/सेट करता है। |
| [Count](../../aspose.page.xps.xpsmodel/xpselement/count/) { get; } | बाल तत्वों की संख्या लौटाता है। |
| [EdgeMode](../../aspose.page.xps.xpsmodel/xpscanvas/edgemode/) { get; set; } | वह मान लौटाता/सेट करता है जो नियंत्रित करता है कि कैनवस के भीतर पथ के किनारों को कैसे रेंडर किया जाता है. |
| [HyperlinkTarget](../../aspose.page.xps.xpsmodel/xpshyperlinkelement/hyperlinktarget/) { get; set; } | हाइपरलिंक लक्ष्य वस्तु लौटाता/सेट करता है। |
| [Item](../../aspose.page.xps.xpsmodel/xpselement/item/) { get; } | इंडेक्स द्वारा एलिमेंट के चिल्ड्रन तक पहुंच प्रदान करता है*i* . |
| [Opacity](../../aspose.page.xps.xpsmodel/xpscontentelement/opacity/) { get; set; } | तत्व की एक समान पारदर्शिता को परिभाषित करने वाला मान लौटाता/सेट करता है। |
| [OpacityMask](../../aspose.page.xps.xpsmodel/xpscontentelement/opacitymask/) { get; set; } | अल्फा वैल्यू के मास्क को निर्दिष्ट करने वाले ब्रश को लौटाता/सेट करता है, जो एलिमेंट पर अपारदर्शिता विशेषता के समान ही लागू होता है, लेकिन एलिमेंट के विभिन्न क्षेत्रों के लिए अलग-अलग अल्फा वैल्यू की अनुमति देता है। |
| [RenderTransform](../../aspose.page.xps.xpsmodel/xpscontentelement/rendertransform/) { get; set; } | तत्व के सभी गुणों और सभी बाल तत्वों (यदि कोई हो) के लिए एक नया समन्वय फ्रेम स्थापित करने वाले affine परिवर्तन मैट्रिक्स को वापस / सेट करता है। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [Add&lt;T&gt;](../../aspose.page.xps.xpsmodel/xpscanvas/add/)(T) | इस कैनवास की चाइल्ड सूची में एक तत्व जोड़ता है. |
| [AddCanvas](../../aspose.page.xps.xpsmodel/xpscanvas/addcanvas/)() | इस कैनवास की चाइल्ड सूची में एक नया कैनवास जोड़ता है. |
| [AddGlyphs](../../aspose.page.xps.xpsmodel/xpscanvas/addglyphs/)(string, float, FontStyle, float, float, string) | इस कैनवास की चाइल्ड सूची में नए ग्लिफ़ जोड़ता है. |
| [AddPath](../../aspose.page.xps.xpsmodel/xpscanvas/addpath/)(XpsPathGeometry) | इस कैनवास की चाइल्ड सूची में एक नया पथ जोड़ता है. |
| [Clone](../../aspose.page.xps.xpsmodel/xpscanvas/clone/)() | इस कैनवास को क्लोन करता है। |
| [GetEnumerator](../../aspose.page.xps.xpsmodel/xpselement/getenumerator/)() | का कार्यान्वयनIEnumerable इंटरफ़ेस. |
| [Insert&lt;T&gt;](../../aspose.page.xps.xpsmodel/xpscanvas/insert/)(int, T) | इस कैनवास की चाइल्ड सूची में एक तत्व सम्मिलित करता है*index* स्थिति. |
| [InsertCanvas](../../aspose.page.xps.xpsmodel/xpscanvas/insertcanvas/)(int) | इस कैनवास की चाइल्ड सूची में एक नया कैनवास सम्मिलित करता है*index* स्थिति. |
| [InsertGlyphs](../../aspose.page.xps.xpsmodel/xpscanvas/insertglyphs/)(int, string, float, FontStyle, float, float, string) | पर इस कैनवास की चाइल्ड सूची में नए ग्लिफ सम्मिलित करता है*index* स्थिति. |
| [InsertPath](../../aspose.page.xps.xpsmodel/xpscanvas/insertpath/)(int, XpsPathGeometry) | इस कैनवास की चाइल्ड सूची में एक नया पथ सम्मिलित करता है*index* स्थिति. |

### यह सभी देखें

* class [XpsContentElement](../xpscontentelement/)
* नाम स्थान [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* सभा [Aspose.Page](../../)


