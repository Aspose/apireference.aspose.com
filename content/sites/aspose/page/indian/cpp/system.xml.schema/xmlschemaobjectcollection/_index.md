---
title: "System::Xml::Schema::XmlSchemaObjectCollection क्लास"
linktitle: "XmlSchemaObjectCollection"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaObjectCollection क्लास। C++ में XmlSchemaObjects का संग्रह।"
type: docs
weight: 5100
url: /hi/cpp/system.xml.schema/xmlschemaobjectcollection/
---
## XmlSchemaObjectCollection class


XmlSchemaObjects का एक संग्रह।

```cpp
class XmlSchemaObjectCollection : public System::Collections::CollectionBase<SharedPtr<System::Xml::Schema::XmlSchemaObject>>
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Add](./add/)(const SharedPtr\<XmlSchemaObject\>\&) | एक [XmlSchemaObject](../xmlschemaobject/) को [XmlSchemaObjectCollection](./) में जोड़ता है। |
| [Contains](./contains/)(const SharedPtr\<XmlSchemaObject\>\&) | निर्दिष्ट [XmlSchemaObject](../xmlschemaobject/) [XmlSchemaObjectCollection](./) में है या नहीं दर्शाता है। |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlSchemaObject\>\>\&, int32_t) | संग्रह से सभी XmlSchemaObjects को दिए गए सरणी में कॉपी करता है, दिए गए इंडेक्स से शुरू करके। |
| [GetEnumerator](./getenumerator/)() override | एक एन्यूमरेटर लौटाता है जो [XmlSchemaObjectCollection](./) में मौजूद XmlSchemaObjects के माध्यम से इटरिट करने के लिए उपयोग किया जाता है। |
| virtual [idx_get](./idx_get/)(int32_t) | निर्दिष्ट इंडेक्स पर स्थित [XmlSchemaObject](../xmlschemaobject/) लौटाता है। |
| virtual [idx_set](./idx_set/)(int32_t, SharedPtr\<XmlSchemaObject\>) | निर्दिष्ट इंडेक्स पर [XmlSchemaObject](../xmlschemaobject/) सेट करता है। |
| [IndexOf](./indexof/)(const SharedPtr\<XmlSchemaObject\>\&) | निर्दिष्ट [XmlSchemaObject](../xmlschemaobject/) के अनुरूप संग्रह इंडेक्स लौटाता है। |
| [Insert](./insert/)(int32_t, const SharedPtr\<XmlSchemaObject\>\&) | एक [XmlSchemaObject](../xmlschemaobject/) को [XmlSchemaObjectCollection](./) में डालता है। |
| [Remove](./remove/)(const SharedPtr\<XmlSchemaObject\>\&) | एक [XmlSchemaObject](../xmlschemaobject/) को [XmlSchemaObjectCollection](./) से हटाता है। |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override |  n'th टेम्पलेट आर्ग्युमेंट को एक weak पॉइंटर सेट करें (shared के बजाय)। कंटेनरों में पॉइंटर्स को weak मोड में स्विच करने की अनुमति देता है। |
| [XmlSchemaObjectCollection](./xmlschemaobjectcollection/)() | एक नया उदाहरण प्रारंभ करता है [XmlSchemaObjectCollection](./) क्लास का। |
| [XmlSchemaObjectCollection](./xmlschemaobjectcollection/)(const SharedPtr\<XmlSchemaObject\>\&) | एक नया उदाहरण प्रारंभ करता है [XmlSchemaObjectCollection](./) क्लास का जो एक [XmlSchemaObject](../xmlschemaobject/) लेता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [CollectionBase](../../system.collections/collectionbase/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
