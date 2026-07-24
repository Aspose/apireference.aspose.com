---
title: "Aspose::Page::XPS::XpsModel::XpsCanvas क्लास"
linktitle: "XpsCanvas"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::XPS::XpsModel::XpsCanvas क्लास। Canvas तत्व सुविधाओं को समाहित करने वाली क्लास। यह तत्व तत्वों को एक साथ समूहित करता है। उदाहरण के लिए, Glyphs और Path तत्वों को एक कैनवास में समूहित किया जा सकता है ताकि उन्हें एक इकाई (हाइपरलिंक गंतव्य के रूप में) के रूप में पहचाना जा सके या C++ में प्रत्येक चाइल्ड और पूर्वज तत्व पर सम्मिलित प्रॉपर्टी मान लागू किया जा सके।"
type: docs
weight: 500
url: /hi/cpp/aspose.page.xps.xpsmodel/xpscanvas/
---
## XpsCanvas class


Canvas तत्व की विशेषताओं को समाहित करने वाली क्लास। यह तत्व तत्वों को एक साथ समूहित करता है। उदाहरण के लिए, Glyphs और Path तत्वों को एक कैनवास में समूहित किया जा सकता है ताकि उन्हें एक इकाई (हाइपरलिंक गंतव्य) के रूप में पहचाना जा सके या प्रत्येक चाइल्ड और पूर्वज तत्व पर एक संयुक्त प्रॉपर्टी मान लागू किया जा सके।

```cpp
class XpsCanvas : public Aspose::Page::XPS::XpsModel::XpsContentElement
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Add](./add/)(T) | इस कैनवास की चाइल्ड सूची में एक तत्व जोड़ता है। |
| [AddCanvas](./addcanvas/)() | इस कैनवास की चाइल्ड सूची में एक नया कैनवास जोड़ता है। |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | इस कैनवास की चाइल्ड सूची में नए glyphs जोड़ता है। |
| [AddPath](./addpath/)(System::SharedPtr\<XpsPathGeometry\>) | इस कैनवास की चाइल्ड सूची में एक नया path जोड़ता है। |
| [Clone](./clone/)() | इस कैनवास की प्रतिलिपि बनाता है। |
| [get_EdgeMode](./get_edgemode/)() const | कैनवास के भीतर पाथ के किनारों को कैसे रेंडर किया जाता है, इसे नियंत्रित करने वाले मान को लौटाता/सेट करता है। |
| [Insert](./insert/)(int32_t, T) | इस कैनवास की चाइल्ड सूची में *index*  स्थिति पर एक तत्व सम्मिलित करता है। |
| [InsertCanvas](./insertcanvas/)(int32_t) | इस कैनवास की चाइल्ड सूची में *index*  स्थिति पर एक नया कैनवास सम्मिलित करता है। |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | इस कैनवास की चाइल्ड सूची में *index*  स्थिति पर नए glyphs सम्मिलित करता है। |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsPathGeometry\>) | इस कैनवास की चाइल्ड सूची में *index*  स्थिति पर एक नया path सम्मिलित करता है। |
| [set_EdgeMode](./set_edgemode/)(XpsEdgeMode) | कैनवास के भीतर पाथ के किनारों को कैसे रेंडर किया जाता है, इसे नियंत्रित करने वाले मान को लौटाता/सेट करता है। |
## संबंधित देखें

* Class [XpsContentElement](../xpscontentelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
