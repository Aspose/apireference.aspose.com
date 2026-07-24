---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI क्लास"
linktitle: "PageAPI"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI क्लास। C++ में Page तत्व संशोधन API।"
type: docs
weight: 500
url: /hi/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/
---
## PageAPI class


यह **[Page](../../aspose.page/)** तत्व संशोधन API।

```cpp
class PageAPI : public Aspose::Page::XPS::Features::EventBasedModifications::IModificationAPI
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Add](./add/)(T) | एक सामग्री तत्व (Canvas, Path, या Glyphs) जोड़ता है। |
| [AddCanvas](./addcanvas/)() | पृष्ठ में एक नया कैनवास जोड़ता है। |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | पृष्ठ में नए Glyphs जोड़ता है। |
| [AddGlyphs](./addglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | पृष्ठ में नए Glyphs जोड़ता है। |
| [AddOutlineEntry](./addoutlineentry/)(System::String, int32_t, int32_t) | दस्तावेज़ में एक रूपरेखा प्रविष्टि जोड़ता है। |
| [AddPath](./addpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | पृष्ठ में एक नया Path जोड़ता है। |
| [CreateArcSegment](./createarcsegment/)(System::Drawing::PointF, System::Drawing::SizeF, float, bool, XpsModel::XpsSweepDirection, bool) | एक नया दीर्घवृत्तीय चाप खंड बनाता है। |
| [CreateCanvas](./createcanvas/)() | एक नया कैनवास बनाता है। |
| [CreateColor](./createcolor/)(System::Drawing::Color) | एक नया रंग बनाता है। |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t, int32_t) | sRGB रंग स्थान में एक नया रंग बनाता है। |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t) | sRGB रंग स्थान में एक नया रंग बनाता है। |
| [CreateColor](./createcolor/)(float, float, float, float) | scRGB रंग स्थान में एक नया रंग बनाता है। |
| [CreateColor](./createcolor/)(float, float, float) | scRGB रंग स्थान में एक नया रंग बनाता है। |
| [CreateColor](./createcolor/)(System::String, const System::ArrayPtr\<float\>\&) | ICC-आधारित रंग स्थान में एक नया रंग बनाता है। |
| [CreateColor](./createcolor/)(System::SharedPtr\<XpsModel::XpsIccProfile\>, const System::ArrayPtr\<float\>\&) | ICC-आधारित रंग स्थान में एक नया रंग बनाता है। |
| [CreateGlyphs](./createglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | नए Glyphs बनाता है। |
| [CreateGlyphs](./createglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | नए Glyphs बनाता है। |
| [CreateGradientStop](./creategradientstop/)(System::SharedPtr\<XpsModel::XpsColor\>, float) | एक नया ग्रेडिएंट स्टॉप बनाता है। |
| [CreateGradientStop](./creategradientstop/)(System::Drawing::Color, float) | एक नया ग्रेडिएंट स्टॉप बनाता है। |
| [CreateImageBrush](./createimagebrush/)(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | एक नया इमेज ब्रश बनाता है। |
| [CreateImageBrush](./createimagebrush/)(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) | एक नया इमेज ब्रश बनाता है। |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF) | एक नया लीनियर ग्रेडिएंट ब्रश बनाता है। |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::Drawing::PointF, System::Drawing::PointF) | एक नया लीनियर ग्रेडिएंट ब्रश बनाता है। |
| [CreateMatrix](./creatematrix/)(float, float, float, float, float, float) | एक नया अफ़ाइन ट्रांसफ़ॉर्मेशन मैट्रिक्स बनाता है। |
| [CreatePath](./createpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | एक नया पाथ बनाता है। |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, bool) | एक नया पाथ फ़िगर बनाता है। |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\>, bool) | एक नया पाथ फ़िगर बनाता है। |
| [CreatePathGeometry](./createpathgeometry/)(System::String) | संक्षिप्त रूप में निर्दिष्ट एक नया पाथ जियोमेट्री बनाता है। |
| [CreatePathGeometry](./createpathgeometry/)() | एक नया पाथ जियोमेट्री बनाता है। |
| [CreatePathGeometry](./createpathgeometry/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathFigure\>\>\>) | निर्दिष्ट पाथ फ़िगर्स की सूची के साथ एक नया पाथ जियोमेट्री बनाता है। |
| [CreatePolyBezierSegment](./createpolybeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | क्यूबिक बीज़ियर कर्व्स का एक नया सेट बनाता है। |
| [CreatePolyLineSegment](./createpolylinesegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | व्यक्तिगत वर्टिसेज़ की मनमानी संख्या वाले एक नया पॉलीगॉनल ड्राइंग बनाता है। |
| [CreatePolyQuadraticBezierSegment](./createpolyquadraticbeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | पाथ फ़िगर में पिछले बिंदु से वर्टिसेज़ के सेट के माध्यम से, निर्दिष्ट कंट्रोल पॉइंट्स का उपयोग करके, क्वाड्रेटिक बीज़ियर कर्व्स का एक नया सेट बनाता है। |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF, float, float) | एक नया रेडियल ग्रेडिएंट ब्रश बनाता है। |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::Drawing::PointF, System::Drawing::PointF, float, float) | एक नया रेडियल ग्रेडिएंट ब्रश बनाता है। |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::SharedPtr\<XpsModel::XpsColor\>) | एक नया सॉलिड कलर ब्रश बनाता है। |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::Drawing::Color) | एक नया सॉलिड कलर ब्रश बनाता है। |
| [CreateVisualBrush](./createvisualbrush/)(System::SharedPtr\<XpsModel::XpsContentElement\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | एक नया विज़ुअल ब्रश बनाता है। |
| [get_Height](./get_height/)() | पेज की ऊँचाई को रिटर्न/सेट करता है, जो प्रभावी कोऑर्डिनेट स्पेस की इकाइयों में वास्तविक संख्या के रूप में व्यक्त की जाती है। |
| [get_PageCount](./get_pagecount/)() | सक्रिय दस्तावेज़ में पेजों की संख्या रिटर्न करता है। |
| [get_TotalPageCount](./get_totalpagecount/)() | सभी दस्तावेज़ों के अंदर [XPS](../../aspose.page.xps/) दस्तावेज़ में पेजों की कुल संख्या रिटर्न करता है। |
| [get_Utils](./get_utils/)() | औपचारिक [XPS](../../aspose.page.xps/) मैनिपुलेशन API से परे उपयोगिताएँ प्रदान करने वाले ऑब्जेक्ट को प्राप्त करता है। |
| [get_Width](./get_width/)() | पेज की चौड़ाई को रिटर्न/सेट करता है, जो प्रभावी कोऑर्डिनेट स्पेस की इकाइयों में वास्तविक संख्या के रूप में व्यक्त की जाती है। |
| [Insert](./insert/)(int32_t, T) | पेज में *index* स्थिति पर एक एलिमेंट (Canvas, Path, या Glyphs) डालता है। |
| [InsertCanvas](./insertcanvas/)(int32_t) | पेज में *index* स्थिति पर एक नया कैनवास डालता है। |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | पेज में *index* स्थिति पर नए ग्लिफ़्स डालता है। |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | पेज में *index* स्थिति पर नए ग्लिफ़्स डालता है। |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsModel::XpsPathGeometry\>) | पेज में *index* स्थिति पर एक नया पाथ डालता है। |
| [Remove](./remove/)(T) | पेज से एक एलिमेंट हटाता है। |
| [RemoveAt](./removeat/)(int32_t) | पृष्ठ से *index* स्थिति पर एक तत्व हटाता है। |
| [set_Height](./set_height/)(float) | पेज की ऊँचाई को रिटर्न/सेट करता है, जो प्रभावी कोऑर्डिनेट स्पेस की इकाइयों में वास्तविक संख्या के रूप में व्यक्त की जाती है। |
| [set_Width](./set_width/)(float) | पेज की चौड़ाई को रिटर्न/सेट करता है, जो प्रभावी कोऑर्डिनेट स्पेस की इकाइयों में वास्तविक संख्या के रूप में व्यक्त की जाती है। |
## संबंधित देखें

* Class [IModificationAPI](../imodificationapi/)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../)
* Library [Aspose.Page for C++](../../)
