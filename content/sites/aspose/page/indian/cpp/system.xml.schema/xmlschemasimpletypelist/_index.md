---
title: "System::Xml::Schema::XmlSchemaSimpleTypeList क्लास"
linktitle: "XmlSchemaSimpleTypeList"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaSimpleTypeList क्लास। यह XML Schema से सूची तत्व का प्रतिनिधित्व करता है जैसा कि World Wide Web Consortium (W3C) द्वारा निर्दिष्ट है। इस क्लास का उपयोग C++ में निर्दिष्ट डेटा टाइप के मानों की सूची के रूप में simpleType तत्व को परिभाषित करने के लिए किया जा सकता है।"
type: docs
weight: 6400
url: /hi/cpp/system.xml.schema/xmlschemasimpletypelist/
---
## XmlSchemaSimpleTypeList class


XML [Schema](../) से **list** तत्व का प्रतिनिधित्व करता है जैसा कि World Wide [Web](../../system.web/) Consortium (W3C) द्वारा निर्दिष्ट है। इस क्लास का उपयोग **simpleType** तत्व को निर्दिष्ट डेटा टाइप के मानों की सूची के रूप में परिभाषित करने के लिए किया जा सकता है।

```cpp
class XmlSchemaSimpleTypeList : public System::Xml::Schema::XmlSchemaSimpleTypeContent
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_BaseItemType](./get_baseitemtype/)() | सिम्पल टाइप के मानों के आधार पर [XmlSchemaSimpleTypeList::get_ItemType](./get_itemtype/) और [XmlSchemaSimpleTypeList::get_ItemTypeName](./get_itemtypename/) मानों के आधार पर **simpleType** तत्व के प्रकार को दर्शाने वाला [XmlSchemaSimpleType](../xmlschemasimpletype/) लौटाता है। |
| [get_ItemType](./get_itemtype/)() | **simpleType** तत्व को लौटाता है जो बेस वैल्यू द्वारा निर्दिष्ट प्रकार से व्युत्पन्न है। |
| [get_ItemTypeName](./get_itemtypename/)() | इस स्कीमा (या निर्दिष्ट नेमस्पेस द्वारा संकेतित किसी अन्य स्कीमा) में परिभाषित बिल्ट-इन डेटा टाइप या **simpleType** तत्व का नाम लौटाता है। |
| [set_BaseItemType](./set_baseitemtype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | [XmlSchemaSimpleType](../xmlschemasimpletype/) को सेट करता है जो **simpleType** तत्व के प्रकार को दर्शाता है, जो सरल प्रकार के [XmlSchemaSimpleTypeList::get_ItemType](./get_itemtype/) और [XmlSchemaSimpleTypeList::get_ItemTypeName](./get_itemtypename/) मानों के आधार पर है। |
| [set_ItemType](./set_itemtype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | **simpleType** तत्व को सेट करता है जो बेस वैल्यू द्वारा निर्दिष्ट प्रकार से व्युत्पन्न है। |
| [set_ItemTypeName](./set_itemtypename/)(const SharedPtr\<XmlQualifiedName\>\&) | इस स्कीमा (या निर्दिष्ट नेमस्पेस द्वारा संकेतित किसी अन्य स्कीमा) में परिभाषित बिल्ट-इन डेटा टाइप या **simpleType** तत्व का नाम सेट करता है। |
| [XmlSchemaSimpleTypeList](./xmlschemasimpletypelist/)() | एक नया उदाहरण प्रारंभ करता है [XmlSchemaSimpleTypeList](./) क्लास का। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [XmlSchemaSimpleTypeContent](../xmlschemasimpletypecontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
