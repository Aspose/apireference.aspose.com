---
title: "Aspose::Page::XPS::XpsModel::XpsPathFigure क्लास"
linktitle: "XpsPathFigure"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::XPS::XpsModel::XpsPathFigure क्लास। PathFigure तत्व की विशेषताओं को समाहित करने वाली क्लास। यह तत्व C++ में एक या अधिक रेखा या वक्र खंडों के सेट से बना होता है।"
type: docs
weight: 3100
url: /hi/cpp/aspose.page.xps.xpsmodel/xpspathfigure/
---
## XpsPathFigure class


PathFigure तत्व की विशेषताओं को समाहित करने वाली क्लास। यह तत्व एक या अधिक रेखा या वक्र खंडों के सेट से बना होता है।

```cpp
class XpsPathFigure : public Aspose::Page::XPS::XpsModel::XpsArray<System::SharedPtr<XpsPathSegment>>
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Clone](./clone/)() | इस पाथ फ़िगर को क्लोन करता है। |
| [get_IsClosed](./get_isclosed/)() const | पाथ फ़िगर बंद है या नहीं दर्शाने वाला मान लौटाता/सेट करता है। |
| [get_IsFilled](./get_isfilled/)() const | पाथ फ़िगर को समाहित पाथ ज्योमेट्री के क्षेत्रफल की गणना में उपयोग किया जाता है या नहीं दर्शाने वाला मान लौटाता/सेट करता है। |
| [get_Segments](./get_segments/)() | चाइल्ड पाथ सेगमेंट्स की सूची लौटाएँ। |
| [get_StartPoint](./get_startpoint/)() const | पाथ फ़िगर के पहले सेगमेंट के प्रारंभ बिंदु को लौटाता/सेट करता है। |
| [set_IsClosed](./set_isclosed/)(bool) | पाथ फ़िगर बंद है या नहीं दर्शाने वाला मान लौटाता/सेट करता है। |
| [set_IsFilled](./set_isfilled/)(bool) | पाथ फ़िगर को समाहित पाथ ज्योमेट्री के क्षेत्रफल की गणना में उपयोग किया जाता है या नहीं दर्शाने वाला मान लौटाता/सेट करता है। |
| [set_StartPoint](./set_startpoint/)(System::Drawing::PointF) | पाथ फ़िगर के पहले सेगमेंट के प्रारंभ बिंदु को लौटाता/सेट करता है। |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override |  n'th टेम्पलेट आर्ग्युमेंट को एक weak पॉइंटर सेट करें (shared के बजाय)। कंटेनरों में पॉइंटर्स को weak मोड में स्विच करने की अनुमति देता है। |
## संबंधित देखें

* Class [XpsArray](../xpsarray/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
