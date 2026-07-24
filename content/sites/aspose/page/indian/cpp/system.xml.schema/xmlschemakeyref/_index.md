---
title: "System::Xml::Schema::XmlSchemaKeyref वर्ग"
linktitle: "XmlSchemaKeyref"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaKeyref वर्ग। यह वर्ग XMLSchema से keyref तत्व को दर्शाता है जैसा कि World Wide Web Consortium (W3C) द्वारा C++ में निर्दिष्ट किया गया है।"
type: docs
weight: 4000
url: /hi/cpp/system.xml.schema/xmlschemakeyref/
---
## XmlSchemaKeyref class


यह वर्ग XMLSchema से **keyref** तत्व को दर्शाता है जैसा कि World Wide [Web](../../system.web/) Consortium (W3C) द्वारा निर्दिष्ट किया गया है।

```cpp
class XmlSchemaKeyref : public System::Xml::Schema::XmlSchemaIdentityConstraint
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Refer](./get_refer/)() | वापस करता है उस कुंजी का नाम जिसे यह प्रतिबंध किसी अन्य सरल या जटिल प्रकार में संदर्भित करता है। |
| [set_Refer](./set_refer/)(const SharedPtr\<XmlQualifiedName\>\&) | सेट करता है उस कुंजी का नाम जिसे यह प्रतिबंध किसी अन्य सरल या जटिल प्रकार में संदर्भित करता है। |
| [XmlSchemaKeyref](./xmlschemakeyref/)() | एक नया उदाहरण प्रारंभ करता है [XmlSchemaKeyref](./) वर्ग का। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [XmlSchemaIdentityConstraint](../xmlschemaidentityconstraint/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
