---
title: "System::Xml::Serialization::XmlSerializerNamespaces क्लास"
linktitle: "XmlSerializerNamespaces"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Serialization::XmlSerializerNamespaces क्लास। यह XML नेमस्पेस और प्रीफ़िक्स रखता है जो Serialization::XmlSerializer द्वारा C++ में XML-डॉक्यूमेंट इंस्टेंस में योग्य नाम उत्पन्न करने के लिए उपयोग किए जाते हैं।"
type: docs
weight: 800
url: /hi/cpp/system.xml.serialization/xmlserializernamespaces/
---
## XmlSerializerNamespaces class


XML नेमस्पेस और प्रीफ़िक्स को रखता है जो [Serialization::XmlSerializer](../xmlserializer/) द्वारा XML-डॉक्यूमेंट इंस्टेंस में योग्य नाम उत्पन्न करने के लिए उपयोग किए जाते हैं।

```cpp
class XmlSerializerNamespaces : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Add](./add/)(const String\&, const String\&) | एक [Serialization::XmlSerializerNamespaces](./) ऑब्जेक्ट में प्रीफ़िक्स और नेमस्पेस जोड़ी जोड़ता है। |
| [get_Count](./get_count/)() | संग्रह में प्रीफ़िक्स और नेमस्पेस जोड़ों की संख्या लौटाता है। |
| [get_NamespaceList](./get_namespacelist/)() |  |
| [get_Namespaces](./get_namespaces/)() |  |
| [set_Namespaces](./set_namespaces/)(const SharedPtr\<Collections::Generic::Dictionary\<String, String\>\>\&) |  |
| [ToArray](./toarray/)() | एक [Serialization::XmlSerializerNamespaces](./) ऑब्जेक्ट में प्रीफ़िक्स और नेमस्पेस जोड़ों की एरे लौटाता है। |
| [XmlSerializerNamespaces](./xmlserializernamespaces/)() | [Serialization::XmlSerializerNamespaces](./) क्लास की नई इंस्टेंस को प्रारंभ करता है। |
| [XmlSerializerNamespaces](./xmlserializernamespaces/)(const SharedPtr\<XmlSerializerNamespaces\>\&) | निर्दिष्ट **[XmlSerializerNamespaces](./)** इंस्टेंस का उपयोग करके, जिसमें प्रीफ़िक्स और नेमस्पेस जोड़ों का संग्रह है, [Serialization::XmlSerializerNamespaces](./) क्लास की नई इंस्टेंस को प्रारंभ करता है। |
| [XmlSerializerNamespaces](./xmlserializernamespaces/)(const ArrayPtr\<SharedPtr\<XmlQualifiedName\>\>\&) | [Serialization::XmlSerializerNamespaces](./) क्लास की नई इंस्टेंस को प्रारंभ करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Xml::Serialization](../)
* Library [Aspose.Page for C++](../../)
