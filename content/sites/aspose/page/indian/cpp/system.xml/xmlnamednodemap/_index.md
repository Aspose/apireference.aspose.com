---
title: "System::Xml::XmlNamedNodeMap क्लास"
linktitle: "XmlNamedNodeMap"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlNamedNodeMap क्लास। C++ में नाम या इंडेक्स द्वारा एक्सेस किए जा सकने वाले नोड्स का संग्रह दर्शाता है।"
type: docs
weight: 2200
url: /hi/cpp/system.xml/xmlnamednodemap/
---
## XmlNamedNodeMap class


नाम या इंडेक्स द्वारा एक्सेस किए जा सकने वाले नोड्स के संग्रह को दर्शाता है।

```cpp
class XmlNamedNodeMap : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::XmlNode>>
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [begin](./begin/)() const | संग्रह के पहले तत्व के लिए इटररेटर प्राप्त करता है। |
| [cbegin](./cbegin/)() const | संग्रह के पहले तत्व के लिए इटररेटर प्राप्त करता है। |
| [cend](./cend/)() const | संग्रह के अंतिम तत्व के पीछे एक गैर-मौजूद तत्व के लिए इटररेटर प्राप्त करता है। |
| [end](./end/)() const | संग्रह के अंतिम तत्व के पीछे एक गैर-मौजूद तत्व के लिए इटररेटर प्राप्त करता है। |
| virtual [get_Count](./get_count/)() | [XmlNamedNodeMap](./) में नोड्स की संख्या लौटाता है। |
| [GetEnumerator](./getenumerator/)() override | [XmlNamedNodeMap](./) में नोड्स के संग्रह पर इटररेशन के लिए समर्थन प्रदान करता है। |
| virtual [GetNamedItem](./getnameditem/)(String) | नाम द्वारा निर्दिष्ट एक [XmlNode](../xmlnode/) प्राप्त करता है। |
| virtual [GetNamedItem](./getnameditem/)(String, String) | मैच करने वाले [XmlNode::get_LocalName](../xmlnode/get_localname/) और [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) मानों वाले नोड को प्राप्त करता है। |
| virtual [Item](./item/)(int32_t) | निर्दिष्ट अनुक्रमणिका पर स्थित नोड को [XmlNamedNodeMap](./) में प्राप्त करता है। |
| virtual [RemoveNamedItem](./removenameditem/)(String) | [XmlNamedNodeMap](./) से नोड को हटाता है। |
| virtual [RemoveNamedItem](./removenameditem/)(String, String) | मैच करने वाले [XmlNode::get_LocalName](../xmlnode/get_localname/) और [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) मानों वाले नोड को हटाता है। |
| virtual [SetNamedItem](./setnameditem/)(SharedPtr\<XmlNode\>) | [XmlNode](../xmlnode/) को उसके [XmlNode::get_Name](../xmlnode/get_name/) मान का उपयोग करके जोड़ता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [iterator](./iterator/) | इटररेटर प्रकार। |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
