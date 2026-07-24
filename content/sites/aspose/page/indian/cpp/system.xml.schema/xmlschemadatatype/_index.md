---
title: "System::Xml::Schema::XmlSchemaDatatype क्लास"
linktitle: "XmlSchemaDatatype"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaDatatype क्लास। XmlSchemaDatatype क्लास C++ में XML Schema परिभाषा भाषा (XSD) प्रकारों को रनटाइम प्रकारों में मैप करने के लिए एक अमूर्त क्लास है।"
type: docs
weight: 2400
url: /hi/cpp/system.xml.schema/xmlschemadatatype/
---
## XmlSchemaDatatype class


[XmlSchemaDatatype](./) क्लास XML [Schema](../) परिभाषा भाषा (XSD) प्रकारों को रनटाइम प्रकारों में मैप करने के लिए एक अमूर्त क्लास है।

```cpp
class XmlSchemaDatatype : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [ChangeType](./changetype/)(SharedPtr\<Object\>, const TypeInfo\&) | निर्दिष्ट मान को, जिसका प्रकार [XmlSchemaDatatype](./) द्वारा प्रतिनिधित्व किए गए XML स्कीमा प्रकार के वैध प्रतिनिधित्वों में से एक है, निर्दिष्ट रनटाइम प्रकार में परिवर्तित करता है। |
| virtual [ChangeType](./changetype/)(SharedPtr\<Object\>, const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | निर्दिष्ट मान को, जिसका प्रकार [XmlSchemaDatatype](./) द्वारा प्रतिनिधित्व किए गए XML स्कीमा प्रकार के वैध प्रतिनिधित्वों में से एक है, निर्दिष्ट रनटाइम प्रकार में परिवर्तित करता है, यदि [XmlSchemaDatatype](./) **xs:QName** प्रकार या उससे व्युत्पन्न प्रकार को दर्शाता है तो [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) का उपयोग करके। |
| virtual [get_TokenizedType](./get_tokenizedtype/)() | जब एक व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो World Wide [Web](../../system.web/) Consortium (W3C) XML 1.0 विनिर्देश में निर्दिष्ट **string** का प्रकार प्राप्त करता है। |
| virtual [get_TypeCode](./get_typecode/)() | सरल प्रकार के लिए [XmlTypeCode](../xmltypecode/) मान लौटाता है। |
| virtual [get_ValueType](./get_valuetype/)() | जब एक व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो आइटम का प्रकार प्राप्त करता है। |
| virtual [get_Variety](./get_variety/)() | सरल प्रकार के लिए [XmlSchemaDatatypeVariety](../xmlschemadatatypevariety/) मान लौटाता है। |
| virtual [IsDerivedFrom](./isderivedfrom/)(SharedPtr\<XmlSchemaDatatype\>) | यह मेथड हमेशा **false** लौटाता है। |
| virtual [ParseValue](./parsevalue/)(String, SharedPtr\<XmlNameTable\>, SharedPtr\<IXmlNamespaceResolver\>) | जब एक व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो निर्दिष्ट **string** को अंतर्निहित या उपयोगकर्ता-परिभाषित सरल प्रकार के विरुद्ध मान्य करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
