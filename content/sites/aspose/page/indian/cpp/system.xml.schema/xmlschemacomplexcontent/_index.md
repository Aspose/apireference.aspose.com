---
title: "System::Xml::Schema::XmlSchemaComplexContent वर्ग"
linktitle: "XmlSchemaComplexContent"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaComplexContent वर्ग। World Wide Web Consortium (W3C) द्वारा निर्दिष्ट XML Schema से complexContent तत्व का प्रतिनिधित्व करता है। यह वर्ग जटिल प्रकारों के लिए जटिल सामग्री मॉडल का प्रतिनिधित्व करता है। यह C++ में उन जटिल प्रकारों पर विस्तार या प्रतिबंध शामिल करता है जिनमें केवल तत्व या मिश्रित सामग्री हो सकती है।"
type: docs
weight: 1800
url: /hi/cpp/system.xml.schema/xmlschemacomplexcontent/
---
## XmlSchemaComplexContent class


XML [Schema](../) से **complexContent** तत्व का प्रतिनिधित्व करता है जैसा कि World Wide [Web](../../system.web/) Consortium (W3C) द्वारा निर्दिष्ट है। यह वर्ग जटिल प्रकारों के लिए जटिल सामग्री मॉडल का प्रतिनिधित्व करता है। यह केवल तत्व या मिश्रित सामग्री वाले जटिल प्रकारों पर विस्तार या प्रतिबंध शामिल करता है।

```cpp
class XmlSchemaComplexContent : public System::Xml::Schema::XmlSchemaContentModel
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Content](./get_content/)() override | सामग्री लौटाता है। |
| [get_IsMixed](./get_ismixed/)() | ऐसी जानकारी लौटाता है जो निर्धारित करती है कि प्रकार में मिश्रित सामग्री मॉडल है या नहीं। |
| [set_Content](./set_content/)(SharedPtr\<XmlSchemaContent\>) override | सामग्री सेट करता है। |
| [set_IsMixed](./set_ismixed/)(bool) | ऐसी जानकारी सेट करता है जो निर्धारित करती है कि प्रकार में मिश्रित सामग्री मॉडल है या नहीं। |
| [XmlSchemaComplexContent](./xmlschemacomplexcontent/)() | एक नया उदाहरण प्रारंभ करता है [XmlSchemaComplexContent](./) वर्ग का। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [XmlSchemaContentModel](../xmlschemacontentmodel/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
