---
title: "System::Xml::XPath::XPathItem क्लास"
linktitle: "XPathItem"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XPath::XPathItem क्लास। C++ में XQuery 1.0 और XPath 2.0 डेटा मॉडल में एक आइटम का प्रतिनिधित्व करता है।"
type: docs
weight: 400
url: /hi/cpp/system.xml.xpath/xpathitem/
---
## XPathItem class


XQuery 1.0 और [XPath](../) 2.0 [Data](../../system.data/) मॉडल में एक आइटम का प्रतिनिधित्व करता है।

```cpp
class XPathItem : public virtual System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [get_IsNode](./get_isnode/)() | जब किसी व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो यह एक मान प्राप्त करता है जो दर्शाता है कि आइटम एक [XPath](../) नोड है या एक एटॉमिक मान। |
| virtual [get_TypedValue](./get_typedvalue/)() | जब किसी व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो यह वर्तमान आइटम को उसके स्कीमा प्रकार के अनुसार सबसे उपयुक्त प्रकार के बॉक्स्ड ऑब्जेक्ट के रूप में प्राप्त करता है। |
| virtual [get_Value](./get_value/)() | जब किसी व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो यह आइटम का **string** मान प्राप्त करता है। |
| virtual [get_ValueAsBoolean](./get_valueasboolean/)() | जब किसी व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो यह आइटम का मान एक [Boolean](../../system/boolean/) के रूप में प्राप्त करता है। |
| virtual [get_ValueAsDateTime](./get_valueasdatetime/)() | जब किसी व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो यह आइटम का मान एक [DateTime](../../system/datetime/) के रूप में प्राप्त करता है। |
| virtual [get_ValueAsDouble](./get_valueasdouble/)() | जब किसी व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो यह आइटम का मान एक [Double](../../system/double/) के रूप में प्राप्त करता है। |
| virtual [get_ValueAsInt](./get_valueasint/)() | जब किसी व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो यह आइटम का मान एक [Int32](../../system/int32/) के रूप में प्राप्त करता है। |
| virtual [get_ValueAsLong](./get_valueaslong/)() | जब किसी व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो यह आइटम का मान एक [Int64](../../system/int64/) के रूप में प्राप्त करता है। |
| virtual [get_ValueType](./get_valuetype/)() | जब एक व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो आइटम का प्रकार प्राप्त करता है। |
| virtual [get_XmlType](./get_xmltype/)() | जब किसी व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो यह आइटम के लिए XmlSchemaType प्राप्त करता है। |
| virtual [ValueAs](./valueas/)(const TypeInfo\&) | आइटम का मान निर्दिष्ट प्रकार के रूप में लौटाता है। |
| virtual [ValueAs](./valueas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | जब किसी व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो यह आइटम का मान उस प्रकार के रूप में लौटाता है जो [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) ऑब्जेक्ट का उपयोग करके नेमस्पेस उपसर्गों को हल करने के लिए निर्दिष्ट किया गया है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
