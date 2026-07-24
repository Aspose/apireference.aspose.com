---
title: "System::Xml::XmlQualifiedName क्लास"
linktitle: "XmlQualifiedName"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlQualifiedName क्लास। C++ में एक XML योग्य नाम का प्रतिनिधित्व करता है।"
type: docs
weight: 3200
url: /hi/cpp/system.xml/xmlqualifiedname/
---
## XmlQualifiedName class


XML योग्य नाम का प्रतिनिधित्व करता है।

```cpp
class XmlQualifiedName : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override | निर्धारित करता है कि निर्दिष्ट [XmlQualifiedName](./) ऑब्जेक्ट वर्तमान [XmlQualifiedName](./) ऑब्जेक्ट के बराबर है या नहीं। |
| [get_IsEmpty](./get_isempty/)() const | एक मान लौटाता है जो दर्शाता है कि [XmlQualifiedName](./) खाली है या नहीं। |
| [get_Name](./get_name/)() const | [XmlQualifiedName](./) के योग्य नाम का स्ट्रिंग प्रतिनिधित्व लौटाता है। |
| [get_Namespace](./get_namespace/)() const | [XmlQualifiedName](./) के नेमस्पेस का स्ट्रिंग प्रतिनिधित्व लौटाता है। |
| [GetHashCode](./gethashcode/)() const override | [XmlQualifiedName](./) के लिए हैश कोड लौटाता है। |
| static [ToString](./tostring/)(const String\&, const String\&) | [XmlQualifiedName](./) का स्ट्रिंग मान लौटाता है। |
| [ToString](./tostring/)() const override | [XmlQualifiedName](./) का स्ट्रिंग मान लौटाता है। |
| [XmlQualifiedName](./xmlqualifiedname/)() | [XmlQualifiedName](./) क्लास का नया इंस्टेंस प्रारंभ करता है। |
| [XmlQualifiedName](./xmlqualifiedname/)(const String\&) | निर्दिष्ट नाम के साथ [XmlQualifiedName](./) क्लास का नया इंस्टेंस प्रारंभ करता है। |
| [XmlQualifiedName](./xmlqualifiedname/)(const String\&, const String\&) | निर्दिष्ट नाम और नेमस्पेस के साथ [XmlQualifiedName](./) क्लास का नया इंस्टेंस प्रारंभ करता है। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [Empty](./empty/) | एक खाली [XmlQualifiedName](./) प्रदान करता है। |
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
