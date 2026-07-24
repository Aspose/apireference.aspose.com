---
title: "Aspose::Page::XPS::XpsModel::XpsPathGeometry क्लास"
linktitle: "XpsPathGeometry"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::XPS::XpsModel::XpsPathGeometry क्लास। क्लास PathGeometry प्रॉपर्टी तत्व विशेषताओं को समेटे हुए है। यह तत्व C++ में Figures एट्रिब्यूट या एक चाइल्ड PathFigure तत्व के साथ निर्दिष्ट पाथ फ़िगर्स का सेट रखता है।"
type: docs
weight: 3200
url: /hi/cpp/aspose.page.xps.xpsmodel/xpspathgeometry/
---
## XpsPathGeometry class


PathGeometry प्रॉपर्टी तत्व की विशेषताओं को समाहित करने वाली क्लास। यह तत्व Figures एट्रिब्यूट या एक चाइल्ड PathFigure तत्व के साथ निर्दिष्ट किए गए पाथ फ़िगर्स के सेट को सम्मिलित करता है।

```cpp
class XpsPathGeometry : public Aspose::Page::XPS::XpsModel::XpsArray<System::SharedPtr<XpsPathFigure>>,
                        public Aspose::Page::XPS::XpsModel::ITransformableProperty
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [AddSegment](./addsegment/)(System::SharedPtr\<XpsPathSegment\>) | अंतिम पाथ फ़िगर के चाइल्ड सेगमेंट्स की सूची में एक पाथ सेगमेंट जोड़ता है। |
| [Clone](./clone/)() | इस पाथ जियोमेट्री की प्रतिलिपि बनाता है। |
| [get_FillRule](./get_fillrule/)() const | ज्यामितीय आकारों के प्रतिच्छेदित क्षेत्रों को एक क्षेत्र बनाने के लिए कैसे संयोजित किया जाता है, यह मान लौटाता/सेट करता है। |
| [get_PathFigures](./get_pathfigures/)() | चाइल्ड पाथ फ़िगर्स की सूची लौटाता है। |
| [get_Transform](./get_transform/)() override | पाथ जियोमेट्री पर भरने, क्लिपिंग या स्ट्रोकिंग से पहले सभी चाइल्ड और वंशज तत्वों पर लागू होने वाले स्थानीय मैट्रिक्स रूपांतरण को स्थापित करने वाला अफाइन ट्रांसफ़ॉर्मेशन मैट्रिक्स लौटाता/सेट करता है। |
| [InsertSegment](./insertsegment/)(int32_t, System::SharedPtr\<XpsPathSegment\>) | अंतिम पाथ फ़िगर के चाइल्ड सेगमेंट्स की सूची में *index* स्थिति पर एक पाथ सेगमेंट सम्मिलित करता है। |
| [RemoveSegment](./removesegment/)(System::SharedPtr\<XpsPathSegment\>) | अंतिम पाथ फ़िगर के चाइल्ड सेगमेंट्स की सूची से एक पाथ सेगमेंट हटाता है। |
| [RemoveSegmentAt](./removesegmentat/)(int32_t) | अंतिम पाथ फ़िगर के चाइल्ड सेगमेंट्स की सूची से *index* स्थिति पर एक पाथ सेगमेंट हटाता है। |
| [set_FillRule](./set_fillrule/)(XpsFillRule) | ज्यामितीय आकारों के प्रतिच्छेदित क्षेत्रों को एक क्षेत्र बनाने के लिए कैसे संयोजित किया जाता है, यह मान लौटाता/सेट करता है। |
| [set_Transform](./set_transform/)(System::SharedPtr\<XpsMatrix\>) override | पाथ जियोमेट्री पर भरने, क्लिपिंग या स्ट्रोकिंग से पहले सभी चाइल्ड और वंशज तत्वों पर लागू होने वाले स्थानीय मैट्रिक्स रूपांतरण को स्थापित करने वाला अफाइन ट्रांसफ़ॉर्मेशन मैट्रिक्स लौटाता/सेट करता है। |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override |  n'th टेम्पलेट आर्ग्युमेंट को एक weak पॉइंटर सेट करें (shared के बजाय)। कंटेनरों में पॉइंटर्स को weak मोड में स्विच करने की अनुमति देता है। |
## संबंधित देखें

* Class [XpsArray](../xpsarray/)
* Class [ITransformableProperty](../itransformableproperty/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
