---
title: "System::Xml::Schema::XmlSchemaType क्लास"
linktitle: "XmlSchemaType"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaType क्लास। C++ में सभी सरल प्रकारों और कॉम्प्लेक्स प्रकारों के लिए बेस क्लास।"
type: docs
weight: 6800
url: /hi/cpp/system.xml.schema/xmlschematype/
---
## XmlSchemaType class


सभी सरल प्रकारों और जटिल प्रकारों के लिए बेस क्लास।

```cpp
class XmlSchemaType : public System::Xml::Schema::XmlSchemaAnnotated
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_BaseSchemaType](./get_baseschematype/)() | पोस्ट‑कम्पाइलेशन ऑब्जेक्ट टाइप या बिल्ट‑इन XML [Schema](../) डिफिनिशन लैंग्वेज (XSD) डेटा टाइप, simpleType एलिमेंट, या complexType एलिमेंट लौटाता है। यह पोस्ट‑स्कीमा‑कम्पाइलेशन इन्फोसैट वैल्यू है। |
| [get_BaseXmlSchemaType](./get_basexmlschematype/)() | इस स्कीमा टाइप के बेस टाइप के लिए पोस्ट‑कम्पाइलेशन वैल्यू लौटाता है। |
| [get_Datatype](./get_datatype/)() | कॉम्प्लेक्स टाइप के डेटा टाइप के लिए पोस्ट‑कम्पाइलेशन वैल्यू लौटाता है। |
| [get_DerivedBy](./get_derivedby/)() | इस तत्व को उसके बेस टाइप से कैसे डेरिव किया गया, इस पर पोस्ट‑कम्पाइलेशन जानकारी लौटाता है। |
| [get_Final](./get_final/)() | टाइप डेरिवेशन का फाइनल एट्रिब्यूट लौटाता है जो यह संकेत देता है कि आगे की डेरिवेशन की अनुमति है या नहीं। |
| [get_FinalResolved](./get_finalresolved/)() | [XmlSchemaType::get_Final](./get_final/) वैल्यू की पोस्ट‑कम्पाइलेशन इंटरप्रिटेशन लौटाता है। |
| virtual [get_IsMixed](./get_ismixed/)() | एक वैल्यू लौटाता है जो यह दर्शाता है कि इस टाइप में मिश्रित कंटेंट मॉडल है या नहीं। यह कॉल केवल कॉम्प्लेक्स टाइप में वैध है। |
| [get_Name](./get_name/)() | टाइप का नाम लौटाता है। |
| [get_QualifiedName](./get_qualifiedname/)() | इस प्रकार के **Name** गुण से निर्मित प्रकार के योग्य नाम को लौटाता है। यह पोस्ट-स्कीमा-कम्पाइलेशन मान है। |
| [get_TypeCode](./get_typecode/)() | प्रकार का [XmlTypeCode](../xmltypecode/) लौटाता है। |
| static [GetBuiltInComplexType](./getbuiltincomplextype/)(XmlTypeCode) | निर्दिष्ट जटिल प्रकार के अंतर्निहित जटिल प्रकार को दर्शाने वाला एक [XmlSchemaComplexType](../xmlschemacomplextype/) लौटाता है। |
| static [GetBuiltInComplexType](./getbuiltincomplextype/)(const SharedPtr\<XmlQualifiedName\>\&) | योग्य नाम द्वारा निर्दिष्ट जटिल प्रकार के अंतर्निहित जटिल प्रकार को दर्शाने वाला एक [XmlSchemaComplexType](../xmlschemacomplextype/) लौटाता है। |
| static [GetBuiltInSimpleType](./getbuiltinsimpletype/)(const SharedPtr\<XmlQualifiedName\>\&) | योग्य नाम द्वारा निर्दिष्ट सरल प्रकार के अंतर्निहित सरल प्रकार को दर्शाने वाला एक [XmlSchemaSimpleType](../xmlschemasimpletype/) लौटाता है। |
| static [GetBuiltInSimpleType](./getbuiltinsimpletype/)(XmlTypeCode) | निर्दिष्ट सरल प्रकार के अंतर्निहित सरल प्रकार को दर्शाने वाला एक [XmlSchemaSimpleType](../xmlschemasimpletype/) लौटाता है। |
| static [IsDerivedFrom](./isderivedfrom/)(SharedPtr\<XmlSchemaType\>, const SharedPtr\<XmlSchemaType\>\&, XmlSchemaDerivationMethod) | निर्दिष्ट व्युत्पन्न स्कीमा प्रकार आधार स्कीमा प्रकार से व्युत्पन्न है या नहीं, यह दर्शाने वाला मान लौटाता है। |
| [set_Final](./set_final/)(XmlSchemaDerivationMethod) | अधिक व्युत्पन्न की अनुमति है या नहीं, यह दर्शाने वाले प्रकार व्युत्पन्न के अंतिम गुण को सेट करता है। |
| virtual [set_IsMixed](./set_ismixed/)(bool) | यदि इस प्रकार में मिश्रित सामग्री मॉडल है तो दर्शाने वाला मान सेट करता है। यह कॉल केवल जटिल प्रकार में मान्य है। |
| [set_Name](./set_name/)(const String\&) | प्रकार का नाम सेट करता है। |
| [XmlSchemaType](./xmlschematype/)() | [XmlSchemaType](./) वर्ग का नया उदाहरण प्रारंभ करता है। |
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
