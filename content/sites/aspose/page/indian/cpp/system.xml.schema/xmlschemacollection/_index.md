---
title: "System::Xml::Schema::XmlSchemaCollection क्लास"
linktitle: "XmlSchemaCollection"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaCollection क्लास। C++ में XML Schema परिभाषा भाषा (XSD) और XML-Data Reduced (XDR) स्कीमा का कैश रखती है।"
type: docs
weight: 1500
url: /hi/cpp/system.xml.schema/xmlschemacollection/
---
## XmlSchemaCollection class


XML [Schema](../) परिभाषा भाषा (XSD) और XML-Data Reduced (XDR) स्कीमा का कैश रखती है।

```cpp
class XmlSchemaCollection : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::Schema::XmlSchema>>
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Add](./add/)(const String\&, const String\&) | दिए गए URL द्वारा स्थित स्कीमा को स्कीमा संग्रह में जोड़ता है। |
| [Add](./add/)(const String\&, const SharedPtr\<XmlReader\>\&) | [XmlReader](../../system.xml/xmlreader/) में मौजूद स्कीमा को स्कीमा संग्रह में जोड़ता है। |
| [Add](./add/)(const String\&, const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | [XmlReader](../../system.xml/xmlreader/) में मौजूद स्कीमा को स्कीमा संग्रह में जोड़ता है। निर्दिष्ट [XmlResolver](../../system.xml/xmlresolver/) का उपयोग किसी भी बाहरी संसाधन को हल करने के लिए किया जाता है। |
| [Add](./add/)(const SharedPtr\<XmlSchema\>\&) | [XmlSchema](../xmlschema/) को संग्रह में जोड़ता है। |
| [Add](./add/)(const SharedPtr\<XmlSchema\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | [XmlSchema](../xmlschema/) को संग्रह में जोड़ता है। निर्दिष्ट [XmlResolver](../../system.xml/xmlresolver/) का उपयोग किसी भी बाहरी संदर्भ को हल करने के लिए किया जाता है। |
| [Add](./add/)(const SharedPtr\<XmlSchemaCollection\>\&) | दिए गए संग्रह में परिभाषित सभी नेमस्पेस (उनके संबंधित स्कीमा सहित) को इस संग्रह में जोड़ता है। |
| [Contains](./contains/)(const SharedPtr\<XmlSchema\>\&) | एक मान लौटाता है जो दर्शाता है कि निर्दिष्ट [XmlSchema](../xmlschema/) का **targetNamespace** संग्रह में है या नहीं। |
| [Contains](./contains/)(const String\&) | एक मान लौटाता है जो दर्शाता है कि निर्दिष्ट नेमस्पेस वाला स्कीमा संग्रह में है या नहीं। |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlSchema\>\>\&, int32_t) | इस संग्रह से सभी [XmlSchema](../xmlschema/) वस्तुओं को दिए गए इंडेक्स से शुरू होकर दिए गए ऐरे में कॉपी करता है। |
| [get_Count](./get_count/)() | इस संग्रह में परिभाषित नेमस्पेस की संख्या लौटाता है। |
| [get_NameTable](./get_nametable/)() | नए स्कीमा लोड करते समय [XmlSchemaCollection](./) द्वारा उपयोग किया जाने वाला डिफ़ॉल्ट [XmlNameTable](../../system.xml/xmlnametable/) लौटाता है। |
| [GetEnumerator](./getenumerator/)() override | स्कीमा संग्रह पर इटरशन के लिए समर्थन प्रदान करता है। |
| [idx_get](./idx_get/)(const String\&) | दिए गए नेमस्पेस URI से संबद्ध [XmlSchema](../xmlschema/) लौटाता है। |
| [XmlSchemaCollection](./xmlschemacollection/)() | [XmlSchemaCollection](./) क्लास का नया उदाहरण प्रारंभ करता है। |
| [XmlSchemaCollection](./xmlschemacollection/)(const SharedPtr\<XmlNameTable\>\&) | निर्दिष्ट [XmlNameTable](../../system.xml/xmlnametable/) के साथ [XmlSchemaCollection](./) क्लास का नया उदाहरण प्रारंभ करता है। स्कीमा लोड करते समय [XmlNameTable](../../system.xml/xmlnametable/) का उपयोग किया जाता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ


## Deprecated
XmlSchemaCollection क्लास पुरानी हो गई है। इसके बजाय XmlSchemaSet का उपयोग करें।

इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
