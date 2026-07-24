---
title: "System::Xml::Schema::XmlAtomicValue क्लास"
linktitle: "XmlAtomicValue"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlAtomicValue क्लास। मान्यताप्राप्त XML तत्व या एट्रिब्यूट का टाइप्ड वैल्यू दर्शाता है। XmlAtomicValue क्लास को C++ में इनहेरिट नहीं किया जा सकता।"
type: docs
weight: 300
url: /hi/cpp/system.xml.schema/xmlatomicvalue/
---
## XmlAtomicValue class


मान्यताप्राप्त XML तत्व या एट्रिब्यूट का टाइप्ड वैल्यू दर्शाता है। [XmlAtomicValue](./) क्लास को इनहेरिट नहीं किया जा सकता।

```cpp
class XmlAtomicValue : public System::Xml::XPath::XPathItem
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Clone](./clone/)() | इस [XmlAtomicValue](./) ऑब्जेक्ट की एक कॉपी लौटाता है। |
| [get_IsNode](./get_isnode/)() override | एक मान लौटाता है जो दर्शाता है कि मान्यताप्राप्त XML तत्व या एट्रिब्यूट एक [XPath](../../system.xml.xpath/) नोड है या एक एटॉमिक वैल्यू। |
| [get_TypedValue](./get_typedvalue/)() override | वर्तमान मान्यताप्राप्त XML तत्व या एट्रिब्यूट को उसके स्कीमा प्रकार के अनुसार सबसे उपयुक्त प्रकार के बॉक्स्ड ऑब्जेक्ट के रूप में लौटाता है। |
| [get_Value](./get_value/)() override | मान्यताप्राप्त XML तत्व या एट्रिब्यूट का [String](../../system/string/) वैल्यू लौटाता है। |
| [get_ValueAsBoolean](./get_valueasboolean/)() override | मान्यताप्राप्त XML तत्व या एट्रिब्यूट का वैल्यू एक [Boolean](../../system/boolean/) के रूप में लौटाता है। |
| [get_ValueAsDateTime](./get_valueasdatetime/)() override | मान्यताप्राप्त XML तत्व या एट्रिब्यूट का वैल्यू एक [DateTime](../../system/datetime/) के रूप में लौटाता है। |
| [get_ValueAsDouble](./get_valueasdouble/)() override | मान्यताप्राप्त XML तत्व या एट्रिब्यूट का वैल्यू एक [Double](../../system/double/) के रूप में लौटाता है। |
| [get_ValueAsInt](./get_valueasint/)() override | मान्यताप्राप्त XML तत्व या एट्रिब्यूट का वैल्यू एक [Int32](../../system/int32/) के रूप में लौटाता है। |
| [get_ValueAsLong](./get_valueaslong/)() override | मान्यताप्राप्त XML तत्व या एट्रिब्यूट का वैल्यू एक [Int64](../../system/int64/) के रूप में लौटाता है। |
| [get_ValueType](./get_valuetype/)() override | मान्यताप्राप्त XML तत्व या एट्रिब्यूट का प्रकार लौटाता है। |
| [get_XmlType](./get_xmltype/)() override | मान्यताप्राप्त XML तत्व या एट्रिब्यूट के लिए [XmlSchemaType](../xmlschematype/) लौटाता है। |
| [ToString](./tostring/)() const override | मान्यताप्राप्त XML तत्व या एट्रिब्यूट का [String](../../system/string/) वैल्यू लौटाता है। |
| [ValueAs](./valueas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) override | मान्यताप्राप्त XML तत्व या एट्रिब्यूट का वैल्यू उस प्रकार के रूप में लौटाता है जो [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) ऑब्जेक्ट का उपयोग करके निर्दिष्ट किया गया है, ताकि नेमस्पेस प्रीफ़िक्स हल किए जा सकें। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [XPathItem](../../system.xml.xpath/xpathitem/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
