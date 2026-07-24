---
title: "System::Drawing::Drawing2D::GraphicsPath क्लास"
linktitle: "GraphicsPath"
second_title: "Aspose.Page C++ के लिए"
description: "System::Drawing::Drawing2D::GraphicsPath क्लास। जुड़े हुए रेखाओं और वक्रों का एक सेट दर्शाता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 600
url: /hi/cpp/system.drawing.drawing2d/graphicspath/
---
## GraphicsPath class


कनेक्टेड लाइनों और वक्रों के एक सेट का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शन को तर्क के रूप में पास करने के लिए करें।

```cpp
class GraphicsPath : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [AddArc](./addarc/)(float, float, float, float, float, float) | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए पथ में निर्दिष्ट दीर्घवृत्तीय चाप जोड़ता है। |
| [AddArc](./addarc/)(int, int, int, int, float, float) | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए पथ में निर्दिष्ट दीर्घवृत्तीय चाप जोड़ता है। |
| [AddArc](./addarc/)(const RectangleF\&, float, float) | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए पथ में निर्दिष्ट दीर्घवृत्तीय चाप जोड़ता है। |
| [AddArc](./addarc/)(const Rectangle\&, float, float) | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए पथ में निर्दिष्ट दीर्घवृत्तीय चाप जोड़ता है। |
| [AddBezier](./addbezier/)(const Point\&, const Point\&, const Point\&, const Point\&) | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए पथ में निर्दिष्ट क्यूबिक बेज़ियर वक्र जोड़ता है। |
| [AddBezier](./addbezier/)(const PointF\&, const PointF\&, const PointF\&, const PointF\&) | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए पथ में निर्दिष्ट क्यूबिक बेज़ियर वक्र जोड़ता है। |
| [AddBezier](./addbezier/)(int, int, int, int, int, int, int, int) | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए पथ में निर्दिष्ट क्यूबिक बेज़ियर वक्र जोड़ता है। |
| [AddBezier](./addbezier/)(float, float, float, float, float, float, float, float) | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए पथ में निर्दिष्ट क्यूबिक बेज़ियर वक्र जोड़ता है। |
| [AddBeziers](./addbeziers/)(const ArrayPtr\<Point\>\&) | वर्तमान आकृति में कनेक्टेड क्यूबिक बेज़ियर वक्रों की एक श्रृंखला जोड़ता है। |
| [AddBeziers](./addbeziers/)(const ArrayPtr\<PointF\>\&) | वर्तमान आकृति में कनेक्टेड क्यूबिक बेज़ियर वक्रों की एक श्रृंखला जोड़ता है। |
| [AddClosedCurve](./addclosedcurve/)(const ArrayPtr\<PointF\>\&, float) | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए पथ में निर्दिष्ट बंद वक्र जोड़ता है। |
| [AddClosedCurve](./addclosedcurve/)(const ArrayPtr\<Point\>\&, float) | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए पथ में निर्दिष्ट बंद वक्र जोड़ता है। |
| [AddCurve](./addcurve/)(const ArrayPtr\<PointF\>\&, float) | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए पथ में निर्दिष्ट वक्र जोड़ता है। |
| [AddCurve](./addcurve/)(const ArrayPtr\<Point\>\&, float) | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए पथ में निर्दिष्ट वक्र जोड़ता है। |
| [AddCurve](./addcurve/)(const ArrayPtr\<PointF\>\&, int, int, float) | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए पथ में निर्दिष्ट वक्र जोड़ता है। |
| [AddCurve](./addcurve/)(const ArrayPtr\<Point\>\&, int, int, float) | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए पथ में निर्दिष्ट वक्र जोड़ता है। |
| [AddEllipse](./addellipse/)(float, float, float, float) | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए पथ में निर्दिष्ट दीर्घवृत्त जोड़ता है। |
| [AddEllipse](./addellipse/)(int, int, int, int) | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए पथ में निर्दिष्ट दीर्घवृत्त जोड़ता है। |
| [AddEllipse](./addellipse/)(const RectangleF\&) | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए पथ में निर्दिष्ट दीर्घवृत्त जोड़ता है। |
| [AddEllipse](./addellipse/)(const Rectangle\&) | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए पथ में निर्दिष्ट दीर्घवृत्त जोड़ता है। |
| [AddLine](./addline/)(const Point\&, const Point\&) | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए पथ में निर्दिष्ट रेखा जोड़ता है। |
| [AddLine](./addline/)(const PointF\&, const PointF\&) | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए पथ में निर्दिष्ट रेखा जोड़ता है। |
| [AddLine](./addline/)(int, int, int, int) | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए पथ में निर्दिष्ट रेखा जोड़ता है। |
| [AddLine](./addline/)(float, float, float, float) | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए पथ में निर्दिष्ट रेखा जोड़ता है। |
| [AddLines](./addlines/)(const ArrayPtr\<PointF\>\&) | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए पथ में कनेक्टेड रेखा खंडों की निर्दिष्ट श्रृंखला जोड़ता है। |
| [AddLines](./addlines/)(const ArrayPtr\<Point\>\&) | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए पथ में कनेक्टेड रेखा खंडों की निर्दिष्ट श्रृंखला जोड़ता है। |
| [AddPath](./addpath/)(const SharedPtr\<GraphicsPath\>\&, bool) | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए पथ में निर्दिष्ट पथ जोड़ता है। |
| [AddPie](./addpie/)(float, float, float, float, float, float) | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए पथ में पाई आकार की निर्दिष्ट रूपरेखा जोड़ता है। |
| [AddPie](./addpie/)(int, int, int, int, float, float) | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए पथ में पाई आकार की निर्दिष्ट रूपरेखा जोड़ता है। |
| [AddPie](./addpie/)(const Rectangle\&, float, float) | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए पथ में पाई आकार की निर्दिष्ट रूपरेखा जोड़ता है। |
| [AddPolygon](./addpolygon/)(const ArrayPtr\<PointF\>\&) | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए पथ में निर्दिष्ट बहुभुज जोड़ता है। |
| [AddPolygon](./addpolygon/)(const ArrayPtr\<Point\>\&) | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए पथ में निर्दिष्ट बहुभुज जोड़ता है। |
| [AddRectangle](./addrectangle/)(const Rectangle\&) | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए पथ में निर्दिष्ट आयत जोड़ता है। |
| [AddRectangle](./addrectangle/)(const RectangleF\&) | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए पथ में निर्दिष्ट आयत जोड़ता है। |
| [AddRectangles](./addrectangles/)(const ArrayPtr\<Rectangle\>\&) | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए पथ में आयतों की निर्दिष्ट श्रृंखला जोड़ता है। |
| [AddRectangles](./addrectangles/)(const ArrayPtr\<RectangleF\>\&) | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए पथ में आयतों की निर्दिष्ट श्रृंखला जोड़ता है। |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, Point, const SharedPtr\<StringFormat\>\&) | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए पथ में पाठ की एक स्ट्रिंग जोड़ता है। |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, PointF, const SharedPtr\<StringFormat\>\&) | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए पथ में पाठ की एक स्ट्रिंग जोड़ता है। |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, Rectangle, const SharedPtr\<StringFormat\>\&) | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए पथ में पाठ की एक स्ट्रिंग जोड़ता है। |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, RectangleF, const SharedPtr\<StringFormat\>\&) | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए पथ में पाठ की एक स्ट्रिंग जोड़ता है। |
| virtual [Clone](./clone/)() | वर्तमान वस्तु की एक प्रति बनाता है। |
| [CloseAllFigures](./closeallfigures/)() | सभी खुले आकृतियों को बंद करता है और एक नई शुरू करता है। |
| [CloseFigure](./closefigure/)() | वर्तमान आकृति को बंद करता है और एक नई शुरू करता है। |
| [Dispose](./dispose/)() | वर्तमान ऑब्जेक्ट द्वारा प्राप्त सभी ऑपरेटिंग सिस्टम संसाधनों को रिलीज़ करता है। |
| [Flatten](./flatten/)() | पथ में प्रत्येक वक्र को कनेक्टेड रेखाओं की श्रृंखला में बदलकर सपाट करता है। 0.25 का फ्लैटनेस मान उपयोग किया जाता है। |
| [Flatten](./flatten/)(const MatrixPtr\&) | पथ में प्रत्येक वक्र को कनेक्टेड रेखाओं की श्रृंखला में बदलकर सपाट करता है। 0.25 का फ्लैटनेस मान उपयोग किया जाता है। |
| [Flatten](./flatten/)(const MatrixPtr\&, float) | पथ में प्रत्येक वक्र को कनेक्टेड रेखाओं की श्रृंखला में बदलकर सपाट करता है। |
| [get_FillMode](./get_fillmode/)() | वर्तमान वस्तु का भराव मोड लौटाता है। |
| [get_PathData](./get_pathdata/)() | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए पथ को बनाते बिंदुओं और उनके प्रकारों को शामिल करने वाला एक [PathData](../pathdata/) वस्तु लौटाता है। |
| [get_PathPoints](./get_pathpoints/)() const | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए पथ को बनाते बिंदुओं को शामिल करने वाला एक एरे लौटाता है। |
| [get_PathTypes](./get_pathtypes/)() const | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए पथ को बनाते बिंदुओं के प्रकार को दर्शाने वाले मानों को शामिल करने वाला एक एरे लौटाता है। |
| [get_PointCount](./get_pointcount/)() const | वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए पथ में बिंदुओं की संख्या लौटाता है। |
| [GetBounds](./getbounds/)(const MatrixPtr\&, const SharedPtr\<Pen\>\&) const | निर्दिष्ट मैट्रिक्स के साथ परिवर्तित होने पर वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए पथ को सीमित करने वाली आयत को दर्शाने वाला एक [RectangleF](../../system.drawing/rectanglef/) वस्तु लौटाता है। |
| [GetFigureFlags](./getfigureflags/)() | वर्तमान ऑब्जेक्ट द्वारा दर्शाए गए पथ में शामिल आकृतियों के प्रकार को दर्शाने वाले Detail::FigureType मानों के बिटवाइज़ संयोजन के रूप में एक मान लौटाता है। |
| [GetLastPoint](./getlastpoint/)() const | पथ में अंतिम बिंदु को दर्शाने वाला एक [PointF](../../system.drawing/pointf/) ऑब्जेक्ट लौटाता है। |
| [GraphicsPath](./graphicspath/)(FillMode) | निर्दिष्ट फ़िल मोड के साथ एक नया [GraphicsPath](./) क्लास का इंस्टेंस बनाता है। |
| [GraphicsPath](./graphicspath/)(const ArrayPtr\<Point\>\&, const ArrayPtr\<uint8_t\>\&, FillMode) | निर्दिष्ट पथ को दर्शाने वाला एक नया [GraphicsPath](./) ऑब्जेक्ट बनाता है। |
| [GraphicsPath](./graphicspath/)(const ArrayPtr\<PointF\>\&, const ArrayPtr\<uint8_t\>\&, FillMode) | निर्दिष्ट पथ को दर्शाने वाला एक नया [GraphicsPath](./) ऑब्जेक्ट बनाता है। |
| [GraphicsPath](./graphicspath/)(const SkPath\&) |  |
| [IsOutlineVisible](./isoutlinevisible/)(const PointF\&, const SharedPtr\<Pen\>\&) | निर्दिष्ट बिंदु इस [GraphicsPath](./) की रूपरेखा (के नीचे) में शामिल है या नहीं दर्शाता है जब निर्दिष्ट [Pen](../../system.drawing/pen/) से खींचा जाता है। लागू नहीं किया गया। |
| [IsVisible](./isvisible/)(const PointF\&) | निर्धारित करता है कि क्या निर्दिष्ट बिंदु वर्तमान ऑब्जेक्ट द्वारा दर्शाए गए पथ के भीतर स्थित है। |
| [IsVisible](./isvisible/)(float, float) | निर्धारित करता है कि क्या निर्दिष्ट बिंदु वर्तमान ऑब्जेक्ट द्वारा दर्शाए गए पथ के भीतर स्थित है। |
| [Reset](./reset/)() | पथ को सभी बिंदुओं को हटाकर खाली करता है। |
| [Reverse](./reverse/)() | इस [GraphicsPath](./) के PathPoints एरे में बिंदुओं का क्रम उलट देता है। |
| [set_FillMode](./set_fillmode/)(FillMode) | वर्तमान ऑब्जेक्ट का फ़िल मोड सेट करता है। |
| [SetMarkers](./setmarkers/)() | लागू नहीं किया गया। |
| [StartFigure](./startfigure/)() | एक नया आकृति शुरू करता है। |
| [Transform](./transform/)(const MatrixPtr\&) | निर्दिष्ट ट्रांसफ़ॉर्म मैट्रिक्स को लागू करके वर्तमान ऑब्जेक्ट द्वारा दर्शाए गए पथ को परिवर्तित करता है। |
| [Transform](./transform/)(const SkMatrix\&) |  |
| [Widen](./widen/)(const SharedPtr\<Pen\>\&) | इस पथ को मूल पथ के चारों ओर एक रूपरेखा के साथ बदलता है। |
| [~GraphicsPath](./~graphicspath/)() | डिस्ट्रक्टर। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
