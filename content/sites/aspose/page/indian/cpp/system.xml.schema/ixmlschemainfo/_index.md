---
title: "System::Xml::Schema::IXmlSchemaInfo क्लास"
linktitle: "IXmlSchemaInfo"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::IXmlSchemaInfo क्लास। C++ में एक मान्य XML नोड के पोस्ट-स्कीमा-वैधता इन्फोसैट को परिभाषित करता है।"
type: docs
weight: 100
url: /hi/cpp/system.xml.schema/ixmlschemainfo/
---
## IXmlSchemaInfo class


एक वैध XML नोड के पोस्ट-स्कीमा-वैलिडेशन इन्फोसैट को परिभाषित करता है।

```cpp
class IXmlSchemaInfo : public virtual System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [get_IsDefault](./get_isdefault/)() | एक मान लौटाता है जो दर्शाता है कि क्या इस मान्य किए गए XML नोड को XML [Schema](../) Definition Language (XSD) स्कीमा वैधता के दौरान लागू किए गए डिफ़ॉल्ट के परिणामस्वरूप सेट किया गया था। |
| virtual [get_IsNil](./get_isnil/)() | एक मान लौटाता है जो दर्शाता है कि इस मान्य किए गए XML नोड का मान **nil** है या नहीं। |
| virtual [get_MemberType](./get_membertype/)() | इस मान्य किए गए XML नोड के लिए गतिशील स्कीमा प्रकार लौटाता है। |
| virtual [get_SchemaAttribute](./get_schemaattribute/)() | इस सत्यापित XML नोड से संबंधित संकलित [XmlSchemaAttribute](../xmlschemaattribute/) को लौटाता है। |
| virtual [get_SchemaElement](./get_schemaelement/)() | इस सत्यापित XML नोड से संबंधित संकलित [XmlSchemaElement](../xmlschemaelement/) को लौटाता है। |
| virtual [get_SchemaType](./get_schematype/)() | इस मान्य किए गए XML नोड का स्थिर XML [Schema](../) Definition Language (XSD) स्कीमा प्रकार लौटाता है। |
| virtual [get_Validity](./get_validity/)() | इस मान्य XML नोड का [XmlSchemaValidity](../xmlschemavalidity/) मान लौटाता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
