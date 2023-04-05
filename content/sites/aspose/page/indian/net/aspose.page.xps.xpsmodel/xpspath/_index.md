---
title: Class XpsPath
second_title: .NET API संदर्भ के लिए Aspose.Page
description: Aspose.Page.XPS.XpsModel.XpsPath कक्ष. क्लस इनकैप्सुलेटंग पथ एलमेंट फ़चर्स यह एलमेंट वेक्टर ग्रफक्स और छवयं क एक नश्चत पृष्ठ पर जड़ने क एकमत्र सधन है यह एक पेज पर प्रस्तुत कए जने वले एकल वेक्टर ग्रफ़क क परभषत करत है
type: docs
weight: 3250
url: /hi/net/aspose.page.xps.xpsmodel/xpspath/
---
## XpsPath class

क्लास इनकैप्सुलेटिंग पाथ एलिमेंट फ़ीचर्स। यह एलिमेंट वेक्टर ग्राफिक्स और छवियों को एक निश्चित पृष्ठ पर जोड़ने का एकमात्र साधन है। यह एक पेज पर प्रस्तुत किए जाने वाले एकल वेक्टर ग्राफ़िक को परिभाषित करता है।

```csharp
public sealed class XpsPath : XpsContentElement
```

## गुण

| नाम | विवरण |
| --- | --- |
| [Clip](../../aspose.page.xps.xpsmodel/xpscontentelement/clip/) { get; set; } | तत्व के प्रदान किए गए क्षेत्र को सीमित करने वाले पथ ज्यामिति उदाहरण को लौटाता/सेट करता है। |
| [Count](../../aspose.page.xps.xpsmodel/xpselement/count/) { get; } | बाल तत्वों की संख्या लौटाता है। |
| [Data](../../aspose.page.xps.xpsmodel/xpspath/data/) { get; set; } | पथ की ज्यामिति देता/सेट करता है. |
| [Fill](../../aspose.page.xps.xpsmodel/xpspath/fill/) { get; set; } | पथ के डेटा गुण द्वारा निर्दिष्ट ज्यामिति को पेंट करने के लिए उपयोग किए गए ब्रश को लौटाता/सेट करता है. |
| [HyperlinkTarget](../../aspose.page.xps.xpsmodel/xpshyperlinkelement/hyperlinktarget/) { get; set; } | हाइपरलिंक लक्ष्य वस्तु लौटाता/सेट करता है। |
| [Item](../../aspose.page.xps.xpsmodel/xpselement/item/) { get; } | इंडेक्स द्वारा एलिमेंट के चिल्ड्रन तक पहुंच प्रदान करता है*i* . |
| [Opacity](../../aspose.page.xps.xpsmodel/xpscontentelement/opacity/) { get; set; } | तत्व की एक समान पारदर्शिता को परिभाषित करने वाला मान लौटाता/सेट करता है। |
| [OpacityMask](../../aspose.page.xps.xpsmodel/xpscontentelement/opacitymask/) { get; set; } | अल्फा वैल्यू के मास्क को निर्दिष्ट करने वाले ब्रश को लौटाता/सेट करता है, जो एलिमेंट पर अपारदर्शिता विशेषता के समान ही लागू होता है, लेकिन एलिमेंट के विभिन्न क्षेत्रों के लिए अलग-अलग अल्फा वैल्यू की अनुमति देता है। |
| [RenderTransform](../../aspose.page.xps.xpsmodel/xpscontentelement/rendertransform/) { get; set; } | तत्व के सभी गुणों और सभी बाल तत्वों (यदि कोई हो) के लिए एक नया समन्वय फ्रेम स्थापित करने वाले affine परिवर्तन मैट्रिक्स को वापस / सेट करता है। |
| [Stroke](../../aspose.page.xps.xpsmodel/xpspath/stroke/) { get; set; } | स्ट्रोक आरेखित करने के लिए उपयोग किए गए ब्रश को लौटाता/सेट करता है. |
| [StrokeDashArray](../../aspose.page.xps.xpsmodel/xpspath/strokedasharray/) { get; set; } | आउटलाइन स्ट्रोक की डैश और गैप की लंबाई निर्दिष्ट करते हुए एरे को रिटर्न/सेट करता है। |
| [StrokeDashCap](../../aspose.page.xps.xpsmodel/xpspath/strokedashcap/) { get; set; } | यह निर्दिष्ट करते हुए मान लौटाता/सेट करता है कि प्रत्येक डैश के सिरे कैसे बनाए जाते हैं। |
| [StrokeDashOffset](../../aspose.page.xps.xpsmodel/xpspath/strokedashoffset/) { get; set; } | डैश सरणी पैटर्न को दोहराने के लिए प्रारंभ बिंदु लौटाता/सेट करता है. यदि यह मान छोड़ा जाता है, तो डैश सरणी स्ट्रोक के मूल के साथ संरेखित होती है. |
| [StrokeEndLineCap](../../aspose.page.xps.xpsmodel/xpspath/strokeendlinecap/) { get; set; } | एक स्ट्रोक में अंतिम डैश के अंत के आकार को परिभाषित करने वाला मान लौटाता/सेट करता है। |
| [StrokeLineJoin](../../aspose.page.xps.xpsmodel/xpspath/strokelinejoin/) { get; set; } | एक स्ट्रोक में पहले डैश की शुरुआत के आकार को परिभाषित करने वाला मान लौटाता/सेट करता है। |
| [StrokeMiterLimit](../../aspose.page.xps.xpsmodel/xpspath/strokemiterlimit/) { get; set; } | अधिकतम मैटर लंबाई और स्ट्रोक की मोटाई के आधे के बीच का अनुपात लौटाता/सेट करता है। यह मान केवल तभी महत्वपूर्ण होता है जब`स्ट्रोकलाइनजॉइन` गुण निर्दिष्ट करता है`मिटर` . |
| [StrokeStartLineCap](../../aspose.page.xps.xpsmodel/xpspath/strokestartlinecap/) { get; set; } | एक स्ट्रोक में पहले डैश की शुरुआत के आकार को परिभाषित करने वाला मान लौटाता/सेट करता है। |
| [StrokeThickness](../../aspose.page.xps.xpsmodel/xpspath/strokethickness/) { get; set; } | प्रभावी समन्वय स्थान (पथ के रेंडर ट्रांसफ़ॉर्म सहित) की इकाइयों में, एक स्ट्रोक की मोटाई लौटाता है/सेट करता है। StrokeThickness का आधा डेटा गुण द्वारा निर्दिष्ट ज्यामिति के बाहर का विस्तार करता है और अन्य आधा ज्यामिति के अंदर का विस्तार करता है. |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [Clone](../../aspose.page.xps.xpsmodel/xpspath/clone/)() | इस पथ को क्लोन करता है। |
| [GetEnumerator](../../aspose.page.xps.xpsmodel/xpselement/getenumerator/)() | का कार्यान्वयनIEnumerable इंटरफ़ेस. |

### यह सभी देखें

* class [XpsContentElement](../xpscontentelement/)
* नाम स्थान [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* सभा [Aspose.Page](../../)


