---
title: "System::Drawing::Imaging::ImageAttributes वर्ग"
linktitle: "ImageAttributes"
second_title: "Aspose.Page C++ के लिए"
description: "System::Drawing::Imaging::ImageAttributes वर्ग. यह रेंडरिंग के दौरान छवि रंगों के कैसे हेरफेर किया जाता है, इस बारे में जानकारी दर्शाता है। इस वर्ग की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस वर्ग को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 900
url: /hi/cpp/system.drawing.imaging/imageattributes/
---
## ImageAttributes class


रेंडरिंग के दौरान छवि रंगों के कैसे हेरफेर किया जाता है, इस बारे में जानकारी दर्शाता है। इस वर्ग की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस वर्ग को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class ImageAttributes : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [ClearBrushRemapTable](./clearbrushremaptable/)() | लागू नहीं किया गया। |
| [ClearColorKey](./clearcolorkey/)(ColorAdjustType) | लागू नहीं किया गया। |
| [ClearColorMatrix](./clearcolormatrix/)(ColorAdjustType) | लागू नहीं किया गया। |
| [ClearGamma](./cleargamma/)(ColorAdjustType) | लागू नहीं किया गया। |
| [ClearNoOp](./clearnoop/)(ColorAdjustType) | लागू नहीं किया गया। |
| [ClearOutputChannel](./clearoutputchannel/)(ColorAdjustType) | लागू नहीं किया गया। |
| [ClearOutputChannelColorProfile](./clearoutputchannelcolorprofile/)(ColorAdjustType) | लागू नहीं किया गया। |
| [ClearRemapTable](./clearremaptable/)(ColorAdjustType) | लागू नहीं किया गया। |
| [ClearThreshold](./clearthreshold/)(ColorAdjustType) | लागू नहीं किया गया। |
| [Clone](./clone/)() | वर्तमान वस्तु की एक प्रति बनाता है। |
| [Dispose](./dispose/)() | वर्तमान ऑब्जेक्ट द्वारा प्राप्त सभी ऑपरेटिंग सिस्टम संसाधनों को रिलीज़ करता है। |
| [GetAdjustedPalette](./getadjustedpalette/)(const SharedPtr\<ColorPalette\>\&, ColorAdjustType) | लागू नहीं किया गया। |
| [ImageAttributes](./imageattributes/)() | डिफ़ॉल्ट कंस्ट्रक्टर। |
| [SetBrushRemapTable](./setbrushremaptable/)(const ArrayPtr\<SharedPtr\<ColorMap\>\>\&) | लागू नहीं किया गया। |
| [SetColorKey](./setcolorkey/)(Color, Color, ColorAdjustType) | लागू नहीं किया गया। |
| [SetColorMatrices](./setcolormatrices/)(const SharedPtr\<ColorMatrix\>\&, const SharedPtr\<ColorMatrix\>\&, ColorMatrixFlag, ColorAdjustType) | लागू नहीं किया गया। |
| [SetColorMatrix](./setcolormatrix/)(const SharedPtr\<ColorMatrix\>\&, ColorMatrixFlag, ColorAdjustType) | रंग-संशोधन मैट्रिक्स सेट करता है। |
| [SetGamma](./setgamma/)(float, ColorAdjustType) | लागू नहीं किया गया। |
| [SetNoOp](./setnoop/)(ColorAdjustType) | लागू नहीं किया गया। |
| [SetOutputChannel](./setoutputchannel/)(ColorChannelFlag, ColorAdjustType) | लागू नहीं किया गया। |
| [SetOutputChannelColorProfile](./setoutputchannelcolorprofile/)(const String\&, ColorAdjustType) | लागू नहीं किया गया। |
| [SetRemapTable](./setremaptable/)(const ArrayPtr\<SharedPtr\<ColorMap\>\>\&, ColorAdjustType) | लागू नहीं किया गया। |
| [SetThreshold](./setthreshold/)(float, ColorAdjustType) | लागू नहीं किया गया। |
| [SetWrapMode](./setwrapmode/)(Drawing2D::WrapMode, Color, bool) | रैप मोड और रंग सेट करता है जिसका उपयोग यह तय करने के लिए किया जाता है कि किसी आकार के ऊपर या आकार की सीमाओं पर टेक्सचर को कैसे टाइल किया जाए। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
