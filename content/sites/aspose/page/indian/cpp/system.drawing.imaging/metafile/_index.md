---
title: "System::Drawing::Imaging::Metafile class"
linktitle: "Metafile"
second_title: "Aspose.Page C++ के लिए"
description: "System::Drawing::Imaging::Metafile क्लास। एक ग्राफिक मेटाफाइल का प्रतिनिधित्व करता है। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियां और/या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों को तर्क के रूप में पास करें।"
type: docs
weight: 1200
url: /hi/cpp/system.drawing.imaging/metafile/
---
## Metafile class


एक ग्राफिक मेटाफाइल का प्रतिनिधित्व करता है। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियां और/या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों को तर्क के रूप में पास करें।

```cpp
class Metafile : public System::Drawing::Image
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Clone](./clone/)() override | वर्तमान ऑब्जेक्ट की एक प्रति लौटाता है। |
| [get_Height](./get_height/)() const override | छवि की ऊँचाई पिक्सेल में लौटाता है। |
| [get_PixelFormat](./get_pixelformat/)() const override | पिक्सेल फ़ॉर्मेट को दर्शाने वाला मान लौटाता है। |
| [get_RawFormat](./get_rawformat/)() const override | छवि फ़ॉर्मेट को दर्शाने वाला मान लौटाता है। |
| [get_Width](./get_width/)() const override | छवि की चौड़ाई पिक्सेल में लौटाता है। |
| [GetHenhmetafile](./gethenhmetafile/)() | लागू नहीं किया गया। |
| [GetMetafileHeader](./getmetafileheader/)() | वर्तमान ऑब्जेक्ट से संबंधित हेडर लौटाता है। |
| [Metafile](./metafile/)(const System::String\&) | लागू नहीं किया गया। |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&) | लागू नहीं किया गया। |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr, EmfType) | लागू नहीं किया गया। |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr) | लागू नहीं किया गया। |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr, Rectangle, MetafileFrameUnit, EmfType) | लागू नहीं किया गया। |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr, RectangleF, MetafileFrameUnit, EmfType) | लागू नहीं किया गया। |
| [Metafile](./metafile/)(IntPtr, EmfType) | लागू नहीं किया गया। |
| [PlayRecord](./playrecord/)(EmfPlusRecordType, int32_t, int32_t, System::ByteArrayPtr) | लागू नहीं किया गया। |
| virtual [~Metafile](./~metafile/)() | डिस्ट्रक्टर। |
## संबंधित देखें

* Class [Image](../../system.drawing/image/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
