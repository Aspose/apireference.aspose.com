---
title: "System::Drawing::Imaging::BitmapData class"
linktitle: "BitmapData"
second_title: "Aspose.Page C++ के लिए"
description: "System::Drawing::Imaging::BitmapData class। एक बिटमैप छवि के गुणों का सेट दर्शाता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे C++ में फ़ंक्शनों को तर्क के रूप में पास करें।"
type: docs
weight: 100
url: /hi/cpp/system.drawing.imaging/bitmapdata/
---
## BitmapData class


एक बिटमैप छवि के गुणों का सेट दर्शाता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों को तर्क के रूप में पास करें।

```cpp
class BitmapData : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Height](./get_height/)() const | छवि की ऊँचाई पिक्सेल में लौटाता है। |
| [get_PixelFormat](./get_pixelformat/)() const | बिटमैप छवि का पिक्सेल फ़ॉर्मेट लौटाता है। |
| [get_Scan0](./get_scan0/)() const | बिटमैप में पहले पिक्सेल डेटा का पता लौटाता है। |
| [get_Stride](./get_stride/)() const | छवि की स्ट्राइड चौड़ाई बाइट्स में लौटाता है। |
| [get_Width](./get_width/)() const | छवि की चौड़ाई पिक्सेल में लौटाता है। |
| [set_Height](./set_height/)(int) | छवि की ऊँचाई पिक्सेल में सेट करता है। |
| [set_PixelFormat](./set_pixelformat/)(PixelFormat) | बिटमैप छवि का पिक्सेल फ़ॉर्मेट सेट करता है। |
| [set_Scan0](./set_scan0/)(IntPtr) | बिटमैप में पहले पिक्सेल डेटा का पता सेट करता है। |
| [set_Stride](./set_stride/)(int) | छवि की स्ट्राइड चौड़ाई बाइट्स में सेट करता है। |
| [set_Width](./set_width/)(int) | छवि की चौड़ाई पिक्सेल में सेट करता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
