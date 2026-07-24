---
title: "System::Drawing::Imaging::ImageCodecInfo क्लास"
linktitle: "ImageCodecInfo"
second_title: "Aspose.Page C++ के लिए"
description: "System::Drawing::Imaging::ImageCodecInfo क्लास। एक इमेज कोडेक के बारे में जानकारी प्रदान करती है। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार की इंस्टेंस को स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे C++ में फ़ंक्शनों के तर्क के रूप में पास करें।"
type: docs
weight: 1000
url: /hi/cpp/system.drawing.imaging/imagecodecinfo/
---
## ImageCodecInfo class


एक इमेज कोडेक के बारे में जानकारी प्रदान करता है। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार की इंस्टेंस को स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों के तर्क के रूप में पास करें।

```cpp
class ImageCodecInfo : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_FormatID](./get_formatid/)() const | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए कोडेक के फ़ॉर्मेट से जुड़ा एक GUID लौटाता है। |
| [get_MimeType](./get_mimetype/)() | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए कोडेक का मल्टीपर्पज़ इंटरनेट मेल एक्सटेंशन (MIME) प्रकार लौटाता है। |
| static [GetImageDecoders](./getimagedecoders/)() | समर्थित इमेज डिकोडर्स को दर्शाने वाले [ImageCodecInfo](./) ऑब्जेक्ट्स की एक एरे लौटाता है। |
| static [GetImageEncoders](./getimageencoders/)() | समर्थित इमेज एन्कोडर्स को दर्शाने वाले [ImageCodecInfo](./) ऑब्जेक्ट्स की एक एरे लौटाता है। |
| [set_FormatID](./set_formatid/)(const Guid\&) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए कोडेक के फ़ॉर्मेट से जुड़ा एक GUID सेट करता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
