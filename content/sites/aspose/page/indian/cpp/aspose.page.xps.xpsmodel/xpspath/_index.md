---
title: "Aspose::Page::XPS::XpsModel::XpsPath class"
linktitle: "XpsPath"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::XPS::XpsModel::XpsPath class. C++ में पथ तत्व की विशेषताओं को समाहित करने वाला वर्ग। यह तत्व स्थिर पृष्ठ में वेक्टर ग्राफिक्स और छवियों को जोड़ने का एकमात्र साधन है। यह पृष्ठ पर रेंडर किए जाने वाले एकल वेक्टर ग्राफिक को परिभाषित करता है।"
type: docs
weight: 3000
url: /hi/cpp/aspose.page.xps.xpsmodel/xpspath/
---
## XpsPath class


Path तत्व की विशेषताओं को समाहित करने वाली क्लास। यह तत्व स्थिर पृष्ठ में वेक्टर ग्राफ़िक्स और इमेज जोड़ने का एकमात्र साधन है। यह एकल वेक्टर ग्राफ़िक को परिभाषित करता है जिसे पृष्ठ पर रेंडर किया जाएगा।

```cpp
class XpsPath : public Aspose::Page::XPS::XpsModel::XpsContentElement
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Clone](./clone/)() | इस पथ की प्रतिलिपि बनाता है। |
| [get_Data](./get_data/)() | पथ की ज्यामिति लौटाता/सेट करता है। |
| [get_Fill](./get_fill/)() | पथ के Data गुण द्वारा निर्दिष्ट ज्यामिति को रंगने के लिए उपयोग किए जाने वाले ब्रश को लौटाता/सेट करता है। |
| [get_Stroke](./get_stroke/)() | स्ट्रोक को खींचने के लिए उपयोग किए जाने वाले ब्रश को लौटाता/सेट करता है। |
| [get_StrokeDashArray](./get_strokedasharray/)() const | आउटलाइन स्ट्रोक के डैश और गैप की लंबाई निर्दिष्ट करने वाले सरणी को लौटाता/सेट करता है। |
| [get_StrokeDashCap](./get_strokedashcap/)() const | प्रत्येक डैश के अंत कैसे खींचे जाते हैं, यह निर्दिष्ट करने वाला मान लौटाता/सेट करता है। |
| [get_StrokeDashOffset](./get_strokedashoffset/)() const | डैश सरणी पैटर्न को दोहराने के लिए प्रारंभ बिंदु लौटाता/सेट करता है। यदि यह मान छोड़ा गया है, तो डैश सरणी स्ट्रोक की मूल बिंदु के साथ संरेखित होती है। |
| [get_StrokeEndLineCap](./get_strokeendlinecap/)() const | स्ट्रोक में अंतिम डैश के अंत के आकार को परिभाषित करने वाला मान लौटाता/सेट करता है। |
| [get_StrokeLineJoin](./get_strokelinejoin/)() const | स्ट्रोक में पहले डैश की शुरुआत के आकार को परिभाषित करने वाला मान लौटाता/सेट करता है। |
| [get_StrokeMiterLimit](./get_strokemiterlimit/)() const | स्ट्रोक की अधिकतम मिटर लंबाई और स्ट्रोक मोटाई के आधे के बीच अनुपात लौटाता/सेट करता है। यह मान केवल तभी महत्वपूर्ण होता है जब **StrokeLineJoin** विशेषता **Miter** निर्दिष्ट करती है। |
| [get_StrokeStartLineCap](./get_strokestartlinecap/)() const | स्ट्रोक में पहले डैश की शुरुआत के आकार को परिभाषित करने वाला मान लौटाता/सेट करता है। |
| [get_StrokeThickness](./get_strokethickness/)() const | स्ट्रोक की मोटाई, प्रभावी निर्देशांक स्थान की इकाइयों में (पथ के रेंडर ट्रांसफ़ॉर्म को शामिल करता है), लौटाता/सेट करता है। स्ट्रोक Path तत्व के Data गुण द्वारा निर्दिष्ट ज्यामिति की सीमा के ऊपर खींचा जाता है। StrokeThickness का आधा भाग Data गुण द्वारा निर्दिष्ट ज्यामिति के बाहर विस्तारित होता है और दूसरा आधा भाग ज्यामिति के अंदर रहता है। |
| [set_Data](./set_data/)(System::SharedPtr\<XpsPathGeometry\>) | पथ की ज्यामिति लौटाता/सेट करता है। |
| [set_Fill](./set_fill/)(System::SharedPtr\<XpsBrush\>) | पथ के Data गुण द्वारा निर्दिष्ट ज्यामिति को रंगने के लिए उपयोग किए जाने वाले ब्रश को लौटाता/सेट करता है। |
| [set_Stroke](./set_stroke/)(System::SharedPtr\<XpsBrush\>) | स्ट्रोक को खींचने के लिए उपयोग किए जाने वाले ब्रश को लौटाता/सेट करता है। |
| [set_StrokeDashArray](./set_strokedasharray/)(System::ArrayPtr\<float\>) | आउटलाइन स्ट्रोक के डैश और गैप की लंबाई निर्दिष्ट करने वाले सरणी को लौटाता/सेट करता है। |
| [set_StrokeDashCap](./set_strokedashcap/)(XpsDashCap) | प्रत्येक डैश के अंत कैसे खींचे जाते हैं, यह निर्दिष्ट करने वाला मान लौटाता/सेट करता है। |
| [set_StrokeDashOffset](./set_strokedashoffset/)(float) | डैश सरणी पैटर्न को दोहराने के लिए प्रारंभ बिंदु लौटाता/सेट करता है। यदि यह मान छोड़ा गया है, तो डैश सरणी स्ट्रोक की मूल बिंदु के साथ संरेखित होती है। |
| [set_StrokeEndLineCap](./set_strokeendlinecap/)(XpsLineCap) | स्ट्रोक में अंतिम डैश के अंत के आकार को परिभाषित करने वाला मान लौटाता/सेट करता है। |
| [set_StrokeLineJoin](./set_strokelinejoin/)(XpsLineJoin) | स्ट्रोक में पहले डैश की शुरुआत के आकार को परिभाषित करने वाला मान लौटाता/सेट करता है। |
| [set_StrokeMiterLimit](./set_strokemiterlimit/)(float) | स्ट्रोक की अधिकतम मिटर लंबाई और स्ट्रोक मोटाई के आधे के बीच अनुपात लौटाता/सेट करता है। यह मान केवल तभी महत्वपूर्ण होता है जब **StrokeLineJoin** विशेषता **Miter** निर्दिष्ट करती है। |
| [set_StrokeStartLineCap](./set_strokestartlinecap/)(XpsLineCap) | स्ट्रोक में पहले डैश की शुरुआत के आकार को परिभाषित करने वाला मान लौटाता/सेट करता है। |
| [set_StrokeThickness](./set_strokethickness/)(float) | स्ट्रोक की मोटाई, प्रभावी निर्देशांक स्थान की इकाइयों में (पथ के रेंडर ट्रांसफ़ॉर्म को शामिल करता है), लौटाता/सेट करता है। स्ट्रोक Path तत्व के Data गुण द्वारा निर्दिष्ट ज्यामिति की सीमा के ऊपर खींचा जाता है। StrokeThickness का आधा भाग Data गुण द्वारा निर्दिष्ट ज्यामिति के बाहर विस्तारित होता है और दूसरा आधा भाग ज्यामिति के अंदर रहता है। |
## संबंधित देखें

* Class [XpsContentElement](../xpscontentelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
