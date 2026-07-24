---
title: "System::Xml::Schema::XmlSchemaIdentityConstraint वर्ग"
linktitle: "XmlSchemaIdentityConstraint"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaIdentityConstraint वर्ग। C++ में पहचान बाधाओं (identity constraints) जैसे key, keyref, और unique तत्वों के लिए वर्ग।"
type: docs
weight: 3400
url: /hi/cpp/system.xml.schema/xmlschemaidentityconstraint/
---
## XmlSchemaIdentityConstraint class


पहचान प्रतिबंधों के लिए क्लास: **key**, **keyref**, और **unique** तत्व।

```cpp
class XmlSchemaIdentityConstraint : public System::Xml::Schema::XmlSchemaAnnotated
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Fields](./get_fields/)() | XML Path Language ([XPath](../../system.xml.xpath/)) अभिव्यक्ति चयनकर्ता के लिए लागू होने वाले फ़ील्ड संग्रह को बच्चों के रूप में लौटाता है। |
| [get_Name](./get_name/)() | पहचान बाधा (identity constraint) का नाम लौटाता है। |
| [get_QualifiedName](./get_qualifiedname/)() | पहचान बाधा का योग्य नाम लौटाता है, जो **QualifiedName** मान की पोस्ट-कम्पाइल व्याख्या रखता है। |
| [get_Selector](./get_selector/)() | [XPath](../../system.xml.xpath/) अभिव्यक्ति **selector** तत्व को लौटाता है। |
| [set_Name](./set_name/)(const String\&) | पहचान बाधा का नाम सेट करता है। |
| [set_Selector](./set_selector/)(const SharedPtr\<XmlSchemaXPath\>\&) | [XPath](../../system.xml.xpath/) अभिव्यक्ति **selector** तत्व को सेट करता है। |
| [XmlSchemaIdentityConstraint](./xmlschemaidentityconstraint/)() | [XmlSchemaIdentityConstraint](./) वर्ग का नया उदाहरण आरंभ करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
