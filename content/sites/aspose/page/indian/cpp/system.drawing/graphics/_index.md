---
title: "System::Drawing::Graphics क्लास"
linktitle: "ग्राफ़िक्स"
second_title: "Aspose.Page C++ के लिए"
description: "System::Drawing::Graphics क्लास। एक ड्रॉइंग सतह का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें। C++ में।"
type: docs
weight: 1000
url: /hi/cpp/system.drawing/graphics/
---
## Graphics class


एक ड्रॉइंग सतह का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class Graphics : public virtual System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [AddMetafileComment](./addmetafilecomment/)(const System::ArrayPtr\<uint8_t\>\&) | लागू नहीं किया गया। |
| [BeginContainer](./begincontainer/)() | इस ऑब्जेक्ट की वर्तमान स्थिति के साथ एक कंटेनर को सहेजता है, एक नया कंटेनर खोलता और उपयोग करता है और सहेजे गए कंटेनर को लौटाता है। |
| [BeginContainer](./begincontainer/)(Rectangle, Rectangle, GraphicsUnit) | इस ऑब्जेक्ट की वर्तमान स्थिति के साथ एक कंटेनर को सहेजता है, एक नया कंटेनर खोलता और उपयोग करता है और सहेजे गए कंटेनर को लौटाता है। |
| [BeginContainer](./begincontainer/)(RectangleF, RectangleF, GraphicsUnit) | इस ऑब्जेक्ट की वर्तमान स्थिति के साथ एक कंटेनर को सहेजता है, एक नया कंटेनर खोलता और उपयोग करता है और सहेजे गए कंटेनर को लौटाता है। |
| [Clear](./clear/)(Color) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए ड्रॉइंग सतह को साफ़ करता है और उसे निर्दिष्ट रंग से भर देता है। |
| [CopyFromScreen](./copyfromscreen/)(Point, Point, Size, CopyPixelOperation) | लागू नहीं किया गया। |
| [CopyFromScreen](./copyfromscreen/)(int32_t, int32_t, int32_t, int32_t, Size, CopyPixelOperation) | लागू नहीं किया गया। |
| [Dispose](./dispose/)() | वर्तमान ऑब्जेक्ट द्वारा प्राप्त सभी ऑपरेटिंग सिस्टम संसाधनों को रिलीज़ करता है। |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए सतह पर निर्दिष्ट पेन का उपयोग करके निर्दिष्ट आर्क को ड्रॉ करता है। |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, float, float, float, float, float, float) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए सतह पर निर्दिष्ट पेन का उपयोग करके निर्दिष्ट आर्क को ड्रॉ करता है। |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, Rectangle, float, float) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए सतह पर निर्दिष्ट पेन का उपयोग करके निर्दिष्ट आर्क को ड्रॉ करता है। |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, RectangleF, float, float) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए सतह पर निर्दिष्ट पेन का उपयोग करके निर्दिष्ट आर्क को ड्रॉ करता है। |
| [DrawBezier](./drawbezier/)(const SharedPtr\<Pen\>\&, const Point\&, const Point\&, const Point\&, const Point\&) | लागू नहीं किया गया। |
| [DrawBezier](./drawbezier/)(const SharedPtr\<Pen\>\&, const PointF\&, const PointF\&, const PointF\&, const PointF\&) | लागू नहीं किया गया। |
| [DrawBezier](./drawbezier/)(const SharedPtr\<Pen\>\&, float, float, float, float, float, float, float, float) | लागू नहीं किया गया। |
| [DrawBeziers](./drawbeziers/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&) | निर्दिष्ट पेन का उपयोग करके बीज़ियर स्प्लाइन की एक श्रृंखला को ड्रॉ करता है। |
| [DrawBeziers](./drawbeziers/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&) | निर्दिष्ट पेन का उपयोग करके बीज़ियर स्प्लाइन की एक श्रृंखला को ड्रॉ करता है। |
| [DrawClosedCurve](./drawclosedcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&, float, Drawing2D::FillMode) | निर्दिष्ट पेन का उपयोग करके बंद स्प्लाइन को ड्रॉ करता है। |
| [DrawClosedCurve](./drawclosedcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&, float, Drawing2D::FillMode) | निर्दिष्ट पेन का उपयोग करके बंद स्प्लाइन को ड्रॉ करता है। |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&, float) | निर्दिष्ट पेन का उपयोग करके स्प्लाइन को ड्रॉ करता है। |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&, float) | निर्दिष्ट पेन का उपयोग करके स्प्लाइन को ड्रॉ करता है। |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&, int32_t, int32_t, float) | निर्दिष्ट पेन का उपयोग करके स्प्लाइन को ड्रॉ करता है। |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&, int32_t, int32_t, float) | निर्दिष्ट पेन का उपयोग करके स्प्लाइन को ड्रॉ करता है। |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, Rectangle) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए सतह पर निर्दिष्ट पेन का उपयोग करके निर्दिष्ट एलिप्स को ड्रॉ करता है। |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, RectangleF) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए सतह पर निर्दिष्ट पेन का उपयोग करके निर्दिष्ट एलिप्स को ड्रॉ करता है। |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, int, int, int, int) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए सतह पर निर्दिष्ट पेन का उपयोग करके निर्दिष्ट एलिप्स को ड्रॉ करता है। |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, float, float, float, float) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए सतह पर निर्दिष्ट पेन का उपयोग करके निर्दिष्ट एलिप्स को ड्रॉ करता है। |
| [DrawIcon](./drawicon/)(const SharedPtr\<Icon\>\&, Rectangle) | लागू नहीं किया गया। |
| [DrawIcon](./drawicon/)(const SharedPtr\<Icon\>\&, int32_t, int32_t) | लागू नहीं किया गया। |
| [DrawIconUnstretched](./drawiconunstretched/)(const SharedPtr\<Icon\>\&, Rectangle) | लागू नहीं किया गया। |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::ArrayPtr\<Point\>\&) | लागू नहीं किया गया। |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::ArrayPtr\<PointF\>\&, const RectangleF\&, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | निर्दिष्ट स्थान पर निर्दिष्ट छवि के निर्दिष्ट क्षेत्र को ड्रॉ करता है। |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::Details::ArrayView\<PointF\>\&, const RectangleF\&, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | निर्दिष्ट स्थान पर निर्दिष्ट छवि के निर्दिष्ट क्षेत्र को ड्रॉ करता है। |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::Details::StackArray\<PointF, N\>\&, const RectangleF\&, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | निर्दिष्ट स्थान पर निर्दिष्ट छवि के निर्दिष्ट क्षेत्र को ड्रॉ करता है। |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, int, int) | निर्दिष्ट स्थान पर निर्दिष्ट छवि को ड्रॉ करता है। |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, float, float) | निर्दिष्ट स्थान पर निर्दिष्ट छवि को ड्रॉ करता है। |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Point) | निर्दिष्ट स्थान पर निर्दिष्ट छवि को ड्रॉ करता है। |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, PointF) | निर्दिष्ट स्थान पर निर्दिष्ट छवि को ड्रॉ करता है। |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, int, int, int, int) | निर्दिष्ट छवि को निर्दिष्ट आयत में ड्रॉ करता है। |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, float, float, float, float) | निर्दिष्ट छवि को निर्दिष्ट आयत में ड्रॉ करता है। |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, RectangleF, RectangleF, GraphicsUnit) | निर्दिष्ट स्थान पर निर्दिष्ट छवि के निर्दिष्ट क्षेत्र को ड्रॉ करता है। |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, Rectangle, GraphicsUnit) | निर्दिष्ट स्थान पर निर्दिष्ट छवि के निर्दिष्ट क्षेत्र को ड्रॉ करता है। |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, int, int, Rectangle, GraphicsUnit) | निर्दिष्ट स्थान पर निर्दिष्ट छवि के निर्दिष्ट क्षेत्र को ड्रॉ करता है। |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const Rectangle\&) | निर्दिष्ट स्थान पर निर्दिष्ट छवि को ड्रॉ करता है। |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const RectangleF\&) | निर्दिष्ट स्थान पर निर्दिष्ट छवि को ड्रॉ करता है। |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | निर्दिष्ट छवि के निर्दिष्ट क्षेत्र को निर्दिष्ट आयत में ड्रॉ करता है। |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | निर्दिष्ट छवि के निर्दिष्ट क्षेत्र को निर्दिष्ट आयत में ड्रॉ करता है। |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit) | निर्दिष्ट छवि के निर्दिष्ट क्षेत्र को निर्दिष्ट आयत में ड्रॉ करता है। |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit) | निर्दिष्ट छवि के निर्दिष्ट क्षेत्र को निर्दिष्ट आयत में ड्रॉ करता है। |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort) | लागू नहीं किया गया। |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort) | लागू नहीं किया गया। |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort, IntPtr) | लागू नहीं किया गया। |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort, IntPtr) | लागू नहीं किया गया। |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<PointF\>\&, RectangleF, GraphicsUnit) | लागू नहीं किया गया। |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<PointF\>\&) | लागू नहीं किया गया। |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<Point\>\&, Rectangle, GraphicsUnit) | लागू नहीं किया गया। |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<Point\>\&, Rectangle, GraphicsUnit, const SharedPtr\<Imaging::ImageAttributes\>\&) | निर्दिष्ट स्थान पर निर्दिष्ट छवि के निर्दिष्ट क्षेत्र को ड्रॉ करता है। |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, float, float, RectangleF, GraphicsUnit) | निर्दिष्ट स्थान पर निर्दिष्ट छवि के निर्दिष्ट क्षेत्र को ड्रॉ करता है। |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, int, int) | निर्दिष्ट स्थान पर उसकी मूल भौतिक आकार का उपयोग करके निर्दिष्ट छवि को ड्रॉ करता है। |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, int, int, int, int) | निर्दिष्ट स्थान पर उसकी मूल भौतिक आकार का उपयोग करके एक निर्दिष्ट छवि को ड्रॉ करता है। |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, const Rectangle\&) | निर्दिष्ट स्थान पर उसकी मूल भौतिक आकार का उपयोग करके एक निर्दिष्ट छवि को ड्रॉ करता है। |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, const Point\&) | निर्दिष्ट स्थान पर उसकी मूल भौतिक आकार का उपयोग करके एक निर्दिष्ट छवि को ड्रॉ करता है। |
| [DrawImageUnscaledAndClipped](./drawimageunscaledandclipped/)(const SharedPtr\<Image\>\&, Rectangle) | लागू नहीं किया गया। |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, Point, Point) | निर्दिष्ट पेन का उपयोग करके निर्दिष्ट रेखा को ड्रॉ करता है। |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, PointF, PointF) | निर्दिष्ट पेन का उपयोग करके निर्दिष्ट रेखा को ड्रॉ करता है। |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, int, int, int, int) | निर्दिष्ट पेन का उपयोग करके निर्दिष्ट रेखा को ड्रॉ करता है। |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, float, float, float, float) | निर्दिष्ट पेन का उपयोग करके निर्दिष्ट रेखा को ड्रॉ करता है। |
| [DrawLines](./drawlines/)(const SharedPtr\<Pen\>\&, const System::ArrayPtr\<System::Drawing::Point\>\&) | निर्दिष्ट पेन का उपयोग करके रेखा खंडों की एक श्रृंखला को ड्रॉ करता है। |
| [DrawLines](./drawlines/)(const SharedPtr\<Pen\>\&, const System::ArrayPtr\<System::Drawing::PointF\>\&) | निर्दिष्ट पेन का उपयोग करके रेखा खंडों की एक श्रृंखला को ड्रॉ करता है। |
| [DrawPath](./drawpath/)(const SharedPtr\<Pen\>\&, const SharedPtr\<Drawing2D::GraphicsPath\>\&) | निर्दिष्ट पेन का उपयोग करके निर्दिष्ट पथ को ड्रॉ करता है। |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए सतह पर निर्दिष्ट पेन का उपयोग करके निर्दिष्ट पाई को ड्रॉ करता है। |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, float, float, float, float, float, float) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए सतह पर निर्दिष्ट पेन का उपयोग करके निर्दिष्ट पाई को ड्रॉ करता है। |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, Rectangle, float, float) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए सतह पर निर्दिष्ट पेन का उपयोग करके निर्दिष्ट पाई को ड्रॉ करता है। |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, RectangleF, float, float) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए सतह पर निर्दिष्ट पेन का उपयोग करके निर्दिष्ट पाई को ड्रॉ करता है। |
| [DrawPolygon](./drawpolygon/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&) | निर्दिष्ट पेन का उपयोग करके एक बहुभुज को ड्रॉ करता है। |
| [DrawPolygon](./drawpolygon/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&) | निर्दिष्ट पेन का उपयोग करके एक बहुभुज को ड्रॉ करता है। |
| [DrawRectangle](./drawrectangle/)(const SharedPtr\<Pen\>\&, int, int, int, int) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए सतह पर निर्दिष्ट पेन का उपयोग करके निर्दिष्ट आयत को ड्रॉ करता है। |
| [DrawRectangle](./drawrectangle/)(const SharedPtr\<Pen\>\&, float, float, float, float) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए सतह पर निर्दिष्ट पेन का उपयोग करके निर्दिष्ट आयत को ड्रॉ करता है। |
| [DrawRectangle](./drawrectangle/)(const SharedPtr\<Pen\>\&, Rectangle) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए सतह पर निर्दिष्ट पेन का उपयोग करके निर्दिष्ट आयत को ड्रॉ करता है। |
| [DrawRectangles](./drawrectangles/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Rectangle\>\&) | निर्दिष्ट पेन का उपयोग करके आयतों की एक श्रृंखला को ड्रॉ करता है। |
| [DrawRectangles](./drawrectangles/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<RectangleF\>\&) | निर्दिष्ट पेन का उपयोग करके आयतों की एक श्रृंखला को ड्रॉ करता है। |
| [DrawString](./drawstring/)(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, PointF, const System::SharedPtr\<System::Drawing::StringFormat\>\&) | निर्दिष्ट फ़ॉन्ट और ब्रश का उपयोग करके निर्दिष्ट स्थान पर निर्दिष्ट स्ट्रिंग को ड्रॉ करता है। |
| [DrawString](./drawstring/)(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, RectangleF, const System::SharedPtr\<System::Drawing::StringFormat\>\&) | निर्दिष्ट फ़ॉन्ट और ब्रश का उपयोग करके निर्दिष्ट आयत में निर्दिष्ट स्ट्रिंग को ड्रॉ करता है। |
| [DrawString](./drawstring/)(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, float, float, const System::SharedPtr\<System::Drawing::StringFormat\>\&) | निर्दिष्ट फ़ॉन्ट और ब्रश का उपयोग करके निर्दिष्ट स्थान पर निर्दिष्ट स्ट्रिंग को ड्रॉ करता है। |
| [EndContainer](./endcontainer/)(const SharedPtr\<Drawing2D::GraphicsContainer\>\&) | वर्तमान कंटेनर को बंद करता है और इस ऑब्जेक्ट की स्थिति को सहेजे गए कंटेनर की स्थिति से पुनर्स्थापित करता है। |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<PointF\>\&, Graphics::EnumerateMetafileProc) | लागू नहीं किया गया। |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<Point\>\&, Graphics::EnumerateMetafileProc) | लागू नहीं किया गया। |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Point, Graphics::EnumerateMetafileProc) | लागू नहीं किया गया। |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, PointF, Graphics::EnumerateMetafileProc) | लागू नहीं किया गया। |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Rectangle, Graphics::EnumerateMetafileProc) | लागू नहीं किया गया। |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, RectangleF, Graphics::EnumerateMetafileProc) | लागू नहीं किया गया। |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Point, Rectangle, GraphicsUnit, Graphics::EnumerateMetafileProc) | लागू नहीं किया गया। |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, PointF, RectangleF, GraphicsUnit, Graphics::EnumerateMetafileProc) | लागू नहीं किया गया। |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<Point\>\&, Rectangle, GraphicsUnit, Graphics::EnumerateMetafileProc) | लागू नहीं किया गया। |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<PointF\>\&, RectangleF, GraphicsUnit, Graphics::EnumerateMetafileProc) | लागू नहीं किया गया। |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Rectangle, Rectangle, GraphicsUnit, Graphics::EnumerateMetafileProc) | लागू नहीं किया गया। |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, RectangleF, RectangleF, GraphicsUnit, Graphics::EnumerateMetafileProc) | लागू नहीं किया गया। |
| [ExcludeClip](./excludeclip/)(Rectangle) | लागू नहीं किया गया। |
| [ExcludeClip](./excludeclip/)(const SharedPtr\<Region\>\&) | लागू नहीं किया गया। |
| [FillClosedCurve](./fillclosedcurve/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<PointF\>\&, Drawing2D::FillMode, float) | निर्दिष्ट ब्रश का उपयोग करके एक बंद स्प्लाइन को ड्रॉ करता है। |
| [FillClosedCurve](./fillclosedcurve/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<Point\>\&, Drawing2D::FillMode, float) | निर्दिष्ट ब्रश का उपयोग करके एक बंद स्प्लाइन को ड्रॉ करता है। |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, Rectangle) | बाउंडिंग आयत द्वारा निर्दिष्ट एलिप्स के अंदर को निर्दिष्ट ब्रश का उपयोग करके भरता है। |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, RectangleF) | बाउंडिंग आयत द्वारा निर्दिष्ट एलिप्स के अंदर को निर्दिष्ट ब्रश का उपयोग करके भरता है। |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, int, int, int, int) | बाउंडिंग आयत द्वारा निर्दिष्ट एलिप्स के अंदर को निर्दिष्ट ब्रश का उपयोग करके भरता है। |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, float, float, float, float) | बाउंडिंग आयत द्वारा निर्दिष्ट एलिप्स के अंदर को निर्दिष्ट ब्रश का उपयोग करके भरता है। |
| [FillPath](./fillpath/)(const SharedPtr\<Brush\>\&, const SharedPtr\<Drawing2D::GraphicsPath\>\&) | निर्दिष्ट पाथ के अंदर को निर्दिष्ट ब्रश का उपयोग करके भरता है। |
| [FillPie](./fillpie/)(const SharedPtr\<Brush\>\&, int, int, int, int, int, int) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए सतह पर निर्दिष्ट ब्रश का उपयोग करके निर्दिष्ट पाई को भरता है। |
| [FillPie](./fillpie/)(const SharedPtr\<Brush\>\&, float, float, float, float, float, float) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए सतह पर निर्दिष्ट ब्रश का उपयोग करके निर्दिष्ट पाई को भरता है। |
| [FillPie](./fillpie/)(const SharedPtr\<Brush\>\&, Rectangle, float, float) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए सतह पर निर्दिष्ट ब्रश का उपयोग करके निर्दिष्ट पाई को भरता है। |
| [FillPolygon](./fillpolygon/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<Point\>\&, Drawing2D::FillMode) | निर्दिष्ट बहुभुज के अंदर को निर्दिष्ट ब्रश का उपयोग करके भरता है। |
| [FillPolygon](./fillpolygon/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<PointF\>\&, Drawing2D::FillMode) | निर्दिष्ट बहुभुज के अंदर को निर्दिष्ट ब्रश का उपयोग करके भरता है। |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, float, float, float, float) | निर्दिष्ट आयत को निर्दिष्ट ब्रश से भरता है। |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, int, int, int, int) | निर्दिष्ट आयत को निर्दिष्ट ब्रश से भरता है। |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, Rectangle) | निर्दिष्ट आयत को निर्दिष्ट ब्रश से भरता है। |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, RectangleF) | निर्दिष्ट आयत को निर्दिष्ट ब्रश से भरता है। |
| [FillRectangles](./fillrectangles/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<Rectangle\>\&) | निर्दिष्ट ब्रश का उपयोग करके आयतों की एक श्रृंखला को भरता है। |
| [FillRectangles](./fillrectangles/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<RectangleF\>\&) | निर्दिष्ट ब्रश का उपयोग करके आयतों की एक श्रृंखला को भरता है। |
| [FillRegion](./fillregion/)(const SharedPtr\<Brush\>\&, const SharedPtr\<Region\>\&) | निर्दिष्ट क्षेत्र के अंदर को निर्दिष्ट ब्रश का उपयोग करके भरता है। |
| [Flush](./flush/)(Drawing2D::FlushIntention) | सभी लंबित ड्रॉ ऑपरेशनों की तत्काल निष्पादन को ट्रिगर करता है। |
| static [FromHwnd](./fromhwnd/)(IntPtr) | लागू नहीं किया गया। |
| static [FromHwndInternal](./fromhwndinternal/)(IntPtr) | लागू नहीं किया गया। |
| static [FromImage](./fromimage/)(const SharedPtr\<Image\>\&) | निर्दिष्ट छवि से एक नया [Graphics](./) ऑब्जेक्ट बनाता है। |
| [get_Clip](./get_clip/)() | एक [Region](../region/) ऑब्जेक्ट लौटाता है जो वर्तमान [Graphics](./) ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए ड्रॉइंग सतह के ड्रॉइंग क्षेत्र को सीमित करने वाले क्षेत्र को दर्शाता है। |
| [get_ClipBounds](./get_clipbounds/)() const | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए सतह के क्लिपिंग क्षेत्र को सीमित करने वाला एक आयत लौटाता है। |
| [get_CompositingMode](./get_compositingmode/)() | एक मान लौटाता है जो दर्शाता है कि कैसे संयुक्त छवियों को वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए सतह पर ड्रॉ किया जाता है। |
| [get_CompositingQuality](./get_compositingquality/)() | छवियों को संयोजित करते समय उपयोग किए गए गुणवत्ता स्तर को दर्शाने वाला मान लौटाता है। |
| [get_DpiX](./get_dpix/)() | क्षैतिज रिज़ॉल्यूशन लौटाता है। |
| [get_DpiY](./get_dpiy/)() | ऊर्ध्वाधर रिज़ॉल्यूशन लौटाता है। |
| [get_InterpolationMode](./get_interpolationmode/)() | वर्तमान ऑब्जेक्ट से संबंधित इंटरपोलेशन मोड को दर्शाने वाला मान लौटाता है। |
| [get_IsClipEmpty](./get_isclipempty/)() const | लागू नहीं किया गया। |
| [get_IsVisibleClipEmpty](./get_isvisibleclipempty/)() const | लागू नहीं किया गया। |
| [get_PageScale](./get_pagescale/)() const | वर्तमान [Graphics](./) ऑब्जेक्ट के लिए विश्व इकाइयों और पेज इकाइयों के बीच स्केलिंग लौटाता है। |
| [get_PageUnit](./get_pageunit/)() const | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए सतह पर पेज निर्देशांक के लिए उपयोग किए जाने वाले माप इकाइयों को लौटाता है। |
| [get_PixelOffsetMode](./get_pixeloffsetmode/)() | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए सतह पर रेंडरिंग के दौरान पिक्सेल कैसे ऑफ़सेट होते हैं, यह दर्शाने वाला मान लौटाता है। |
| [get_RenderingOrigin](./get_renderingorigin/)() const | एक [Point](../point/) ऑब्जेक्ट लौटाता है जो वर्तमान [Graphics](./) ऑब्जेक्ट के रेंडरिंग मूल को दर्शाता है, डिथरिंग और हैच ब्रश के लिए। |
| [get_SmoothingMode](./get_smoothingmode/)() | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए सतह पर रेंडरिंग के दौरान उपयोग किए जाने वाले स्मूदिंग मोड को दर्शाने वाला मान लौटाता है। |
| [get_TextContrast](./get_textcontrast/)() const | लागू नहीं किया गया। |
| [get_TextRenderingHint](./get_textrenderinghint/)() | टेक्स्ट रेंडरिंग की गुणवत्ता को दर्शाने वाला मान लौटाता है। |
| [get_Transform](./get_transform/)() | वर्तमान [Graphics](./) ऑब्जेक्ट के लिए ज्यामितीय विश्व परिवर्तन लौटाता है। |
| [get_VisibleClipBounds](./get_visibleclipbounds/)() const | वर्तमान [Graphics](./) ऑब्जेक्ट के दृश्यमान क्लिपिंग क्षेत्र की बाउंडिंग आयत का प्रतिनिधित्व करने वाला [RectangleF](../rectanglef/) ऑब्जेक्ट लौटाता है। |
| [GetHdc](./gethdc/)() | लागू नहीं किया गया। |
| [GetNearestColor](./getnearestcolor/)(Color) | लागू नहीं किया गया। |
| [GetSkCanvas](./getskcanvas/)() const |  |
| [IntersectClip](./intersectclip/)(const System::SharedPtr\<Region\>\&) | इस ऑब्जेक्ट के क्लिप क्षेत्र को वर्तमान क्लिप और निर्दिष्ट क्लिप के प्रतिच्छेदन में अपडेट करता है। |
| [IntersectClip](./intersectclip/)(System::Drawing::RectangleF) | इस ऑब्जेक्ट के क्लिप क्षेत्र को वर्तमान क्लिप और निर्दिष्ट क्लिप के प्रतिच्छेदन में अपडेट करता है। |
| [IntersectClip](./intersectclip/)(System::Drawing::Rectangle) | इस ऑब्जेक्ट के क्लिप क्षेत्र को वर्तमान क्लिप और निर्दिष्ट क्लिप के प्रतिच्छेदन में अपडेट करता है। |
| [IsVisible](./isvisible/)(Point) | निर्धारित करता है कि निर्दिष्ट बिंदु वर्तमान [Graphics](./) ऑब्जेक्ट के दृश्यमान क्लिप क्षेत्र के भीतर स्थित है या नहीं। |
| [IsVisible](./isvisible/)(PointF) | लागू नहीं किया गया। |
| [IsVisible](./isvisible/)(Rectangle) | लागू नहीं किया गया। |
| [IsVisible](./isvisible/)(RectangleF) | लागू नहीं किया गया। |
| [IsVisible](./isvisible/)(int32_t, int32_t) | लागू नहीं किया गया। |
| [IsVisible](./isvisible/)(float, float) | लागू नहीं किया गया। |
| [IsVisible](./isvisible/)(float, float, float, float) | लागू नहीं किया गया। |
| [IsVisible](./isvisible/)(int32_t, int32_t, int32_t, int32_t) | लागू नहीं किया गया। |
| [MeasureCharacterRanges](./measurecharacterranges/)(const System::String\&, const SharedPtr\<Font\>\&, RectangleF, const SharedPtr\<StringFormat\>\&) | निर्दिष्ट स्ट्रिंग में अक्षर स्थितियों को सीमित करने वाले प्रत्येक क्षेत्र की एक सरणी लौटाता है। |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, PointF const\&, System::SharedPtr\<StringFormat\> const\&) const | निर्दिष्ट फ़ॉर्मेट में निर्दिष्ट फ़ॉन्ट में खींचे जाने पर निर्दिष्ट स्ट्रिंग का आकार लौटाता है। |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, int, System::SharedPtr\<StringFormat\> const\&) const | निर्दिष्ट फ़ॉर्मेट में निर्दिष्ट फ़ॉन्ट में खींचे जाने पर निर्दिष्ट स्ट्रिंग का आकार लौटाता है। |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&, int\&, int\&) const | लागू नहीं किया गया। |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&) const | निर्दिष्ट फ़ॉर्मेट में निर्दिष्ट फ़ॉन्ट में खींचे जाने पर निर्दिष्ट स्ट्रिंग का आकार लौटाता है। |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Drawing2D::Matrix\>\&, Drawing2D::MatrixOrder) | वर्तमान [Graphics](./) ऑब्जेक्ट के विश्व परिवर्तन मैट्रिक्स को निर्दिष्ट मैट्रिक्स से गुणा करता है। |
| [ReleaseHdc](./releasehdc/)() | लागू नहीं किया गया। |
| [ReleaseHdc](./releasehdc/)(IntPtr) | लागू नहीं किया गया। |
| [ResetClip](./resetclip/)() | इस ग्राफ़िक्स के क्लिप क्षेत्र को अनंत क्षेत्र में रीसेट करता है। |
| [ResetTransform](./resettransform/)() | वर्तमान ऑब्जेक्ट के विश्व परिवर्तन मैट्रिक्स को इस प्रकार रीसेट करता है कि वह पहचान मैट्रिक्स बन जाए। |
| [Restore](./restore/)(const SharedPtr\<Drawing2D::GraphicsState\>\&) | सहेजे गए स्थिति से इस ऑब्जेक्ट की स्थिति को पुनर्स्थापित करता है। |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | निर्दिष्ट क्रम में वर्तमान [Graphics](./) ऑब्जेक्ट के विश्व परिवर्तन मैट्रिक्स पर निर्दिष्ट घूर्णन लागू करता है। |
| [Save](./save/)() | इस ऑब्जेक्ट की वर्तमान स्थिति को सहेजता है और सहेजी गई स्थिति लौटाता है। |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | निर्दिष्ट स्केल वेक्टर को वर्तमान ऑब्जेक्ट के विश्व परिवर्तन मैट्रिक्स पर लागू करता है। |
| [set_Clip](./set_clip/)(const SharedPtr\<Region\>\&) | वर्तमान द्वारा प्रतिनिधित्व किए गए ड्राइंग सतह के ड्राइंग क्षेत्र को सीमित करने वाला एक क्षेत्र सेट करता है। |
| [set_CompositingMode](./set_compositingmode/)(Drawing2D::CompositingMode) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए सतह पर सम्मिलित छवियों को कैसे खींचा जाता है, यह निर्दिष्ट करने वाला मान सेट करता है। |
| [set_CompositingQuality](./set_compositingquality/)(Drawing2D::CompositingQuality) | छवियों को सम्मिलित करते समय उपयोग करने के लिए गुणवत्ता स्तर निर्दिष्ट करने वाला मान सेट करता है। |
| [set_InterpolationMode](./set_interpolationmode/)(Drawing2D::InterpolationMode) | वर्तमान ऑब्जेक्ट से संबंधित इंटरपोलेशन मोड को दर्शाने वाला मान सेट करता है। |
| [set_PageScale](./set_pagescale/)(float) | वर्तमान [Graphics](./) ऑब्जेक्ट के लिए विश्व इकाइयों और पेज इकाइयों के बीच स्केलिंग सेट करता है। |
| [set_PageUnit](./set_pageunit/)(GraphicsUnit) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए सतह पर पेज निर्देशांक के लिए उपयोग किए जाने वाले माप इकाइयों को सेट करता है। |
| [set_PixelOffsetMode](./set_pixeloffsetmode/)(Drawing2D::PixelOffsetMode) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए सतह पर रेंडरिंग के दौरान पिक्सेल को कैसे ऑफ़सेट किया जाना चाहिए, यह निर्दिष्ट करने वाला मान सेट करता है। |
| [set_RenderingOrigin](./set_renderingorigin/)(Point) | वर्तमान [Graphics](./) ऑब्जेक्ट के डिथरिंग और हैच ब्रश के लिए रेंडरिंग मूल बिंदु निर्दिष्ट करने वाला एक [Point](../point/) ऑब्जेक्ट सेट करता है। |
| [set_SmoothingMode](./set_smoothingmode/)(Drawing2D::SmoothingMode) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए सतह पर रेंडरिंग के दौरान उपयोग किए जाने वाले स्मूथिंग मोड को निर्दिष्ट करने वाला मान सेट करता है। |
| [set_TextContrast](./set_textcontrast/)(int32_t) | लागू नहीं किया गया। |
| [set_TextRenderingHint](./set_textrenderinghint/)(Text::TextRenderingHint) | पाठ रेंडरिंग की गुणवत्ता को निर्दिष्ट करने वाला मान सेट करता है। |
| [set_Transform](./set_transform/)(const SharedPtr\<Drawing2D::Matrix\>\&) | वर्तमान [Graphics](./) ऑब्जेक्ट के लिए ज्यामितीय विश्व परिवर्तन सेट करता है। |
| [SetClip](./setclip/)(const SharedPtr\<Region\>\&, Drawing2D::CombineMode) | वर्तमान [Graphics](./) ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए ड्राइंग सतह के क्लिपिंग क्षेत्र को वर्तमान क्लिप क्षेत्र और निर्दिष्ट क्षेत्र को मिलाने वाले निर्दिष्ट ऑपरेशन के परिणाम में सेट करता है। |
| [SetClip](./setclip/)(Rectangle, Drawing2D::CombineMode) | वर्तमान [Graphics](./) ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए ड्राइंग सतह के क्लिपिंग क्षेत्र को वर्तमान क्लिप क्षेत्र और निर्दिष्ट क्षेत्र को मिलाने वाले निर्दिष्ट ऑपरेशन के परिणाम में सेट करता है। |
| [SetClip](./setclip/)(RectangleF, Drawing2D::CombineMode) | वर्तमान [Graphics](./) ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए ड्राइंग सतह के क्लिपिंग क्षेत्र को वर्तमान क्लिप क्षेत्र और निर्दिष्ट क्षेत्र को मिलाने वाले निर्दिष्ट ऑपरेशन के परिणाम में सेट करता है। |
| [SetClip](./setclip/)(const SharedPtr\<Graphics\>\&, Drawing2D::CombineMode) | लागू नहीं किया गया। |
| [SetClip](./setclip/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&, Drawing2D::CombineMode) | वर्तमान [Graphics](./) ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए ड्राइंग सतह के क्लिपिंग क्षेत्र को निर्दिष्ट ऑपरेशन के परिणाम में सेट करता है जो वर्तमान क्लिप क्षेत्र और ग्राफ़िक्स पाथ द्वारा निर्दिष्ट क्षेत्र को संयोजित करता है। |
| [TransformPoints](./transformpoints/)(Drawing2D::CoordinateSpace, Drawing2D::CoordinateSpace, const ArrayPtr\<System::Drawing::Point\>\&) | लागू नहीं किया गया। |
| [TransformPoints](./transformpoints/)(Drawing2D::CoordinateSpace, Drawing2D::CoordinateSpace, const ArrayPtr\<System::Drawing::PointF\>\&) | लागू नहीं किया गया। |
| [TranslateClip](./translateclip/)(int, int) | लागू नहीं किया गया। |
| [TranslateClip](./translateclip/)(float, float) | लागू नहीं किया गया। |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | वर्तमान [Graphics](./) ऑब्जेक्ट के विश्व परिवर्तन मैट्रिक्स पर निर्दिष्ट ट्रांसलेशन वेक्टर लागू करता है। |
| [~Graphics](./~graphics/)() |  |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [DrawImageAbort](./drawimageabort/) | DrawImage मेथड के तर्क के रूप में उपयोग किए जाने वाले कॉलबैक फ़ंक्शन ऑब्जेक्ट का प्रकार। |
| [EnumerateMetafileProc](./enumeratemetafileproc/) | EnumerateMetafile मेथड के तर्क के रूप में उपयोग किए जाने वाले कॉलबैक फ़ंक्शन ऑब्जेक्ट का प्रकार। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
