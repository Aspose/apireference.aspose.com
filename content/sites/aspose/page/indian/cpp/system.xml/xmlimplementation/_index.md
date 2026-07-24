---
title: "System::Xml::XmlImplementation क्लास"
linktitle: "XmlImplementation"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlImplementation क्लास। C++ में XmlDocument ऑब्जेक्ट्स के सेट के लिए संदर्भ परिभाषित करता है।"
type: docs
weight: 2000
url: /hi/cpp/system.xml/xmlimplementation/
---
## XmlImplementation class


[XmlDocument](../xmldocument/) ऑब्जेक्ट्स के सेट के लिए संदर्भ परिभाषित करता है।

```cpp
class XmlImplementation : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [CreateDocument](./createdocument/)() | एक नया [XmlDocument](../xmldocument/) बनाता है। |
| [HasFeature](./hasfeature/)(const String\&, const String\&) | जाँचता है कि डॉक्यूमेंट [Object](../../system/object/) मॉडल (DOM) इम्प्लीमेंटेशन एक विशिष्ट फीचर को लागू करता है या नहीं। |
| [XmlImplementation](./xmlimplementation/)() | [XmlImplementation](./) क्लास का नया इंस्टेंस इनिशियलाइज़ करता है। |
| [XmlImplementation](./xmlimplementation/)(const SharedPtr\<XmlNameTable\>\&) | [XmlImplementation](./) क्लास का नया इंस्टेंस निर्दिष्ट [XmlNameTable](../xmlnametable/) के साथ इनिशियलाइज़ करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
