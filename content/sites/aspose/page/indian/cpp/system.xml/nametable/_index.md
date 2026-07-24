---
title: "System::Xml::NameTable क्लास"
linktitle: "NameTable"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::NameTable क्लास। C++ में एक सिंगल-थ्रेडेड XmlNameTable लागू करता है।"
type: docs
weight: 500
url: /hi/cpp/system.xml/nametable/
---
## NameTable class


एक सिंगल-थ्रेडेड [XmlNameTable](../xmlnametable/) लागू करता है।

```cpp
class NameTable : public System::Xml::XmlNameTable
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Add](./add/)(const String\&) override | निर्दिष्ट स्ट्रिंग को एटॉमाइज़ करता है और इसे [NameTable](./) में जोड़ता है। |
| [Add](./add/)(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) override | निर्दिष्ट स्ट्रिंग को एटॉमाइज़ करता है और इसे [NameTable](./) में जोड़ता है। |
| [Get](./get/)(const String\&) override | निर्दिष्ट मान के साथ एटॉमाइज़्ड स्ट्रिंग लौटाता है। |
| [Get](./get/)(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) override | निर्दिष्ट वर्ण सीमा के समान अक्षरों को सम्मिलित करने वाली एटॉमाइज़्ड स्ट्रिंग को लौटाता है। |
| [NameTable](./nametable/)() | [NameTable](./) क्लास का नया इंस्टेंस प्रारंभ करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [XmlNameTable](../xmlnametable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
