---
title: "System::Xml::Schema::XmlSchemaObjectTable class"
linktitle: "XmlSchemaObjectTable"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaObjectTable class. यह C++ में XmlSchema क्लास में सम्मिलित तत्वों (जैसे Attributes, AttributeGroups, Elements, आदि) के संग्रह प्रदान करता है।"
type: docs
weight: 5300
url: /hi/cpp/system.xml.schema/xmlschemaobjecttable/
---
## XmlSchemaObjectTable class


[XmlSchema](../xmlschema/) क्लास में सम्मिलित तत्वों (जैसे Attributes, AttributeGroups, Elements, आदि) के संग्रह प्रदान करता है।

```cpp
class XmlSchemaObjectTable : public System::Collections::Generic::IEnumerable<System::Collections::Generic::KeyValuePair<SharedPtr<System::Xml::XmlQualifiedName>, SharedPtr<System::Xml::Schema::XmlSchemaObject>>>
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Contains](./contains/)(const SharedPtr\<XmlQualifiedName\>\&) | निर्धारित करता है कि निर्दिष्ट योग्य नाम संग्रह में मौजूद है या नहीं। |
| [get_Count](./get_count/)() | [XmlSchemaObjectTable](./) में सम्मिलित आइटमों की संख्या लौटाता है। |
| [get_Names](./get_names/)() | [XmlSchemaObjectTable](./) में सभी नामित तत्वों का संग्रह लौटाता है। |
| [get_Values](./get_values/)() | [XmlSchemaObjectTable](./) में सभी तत्वों के सभी मानों का संग्रह लौटाता है। |
| [GetEnumerator](./getenumerator/)() override | [XmlSchemaObjectTable](./) के माध्यम से इटररेट करने वाला एक एनेमरेटर लौटाता है। |
| [idx_get](./idx_get/)(const SharedPtr\<XmlQualifiedName\>\&) | योग्य नाम द्वारा निर्दिष्ट [XmlSchemaObjectTable](./) में तत्व लौटाता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
