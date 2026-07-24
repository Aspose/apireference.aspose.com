---
title: "System::Xml::Schema::XmlSchemaDatatype::ChangeType method"
linktitle: "ChangeType"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaDatatype::ChangeType method. निर्दिष्ट मान को, जिसका प्रकार XML स्कीमा प्रकार के वैध प्रतिनिधित्वों में से एक है जिसे XmlSchemaDatatype द्वारा दर्शाया गया है, C++ में निर्दिष्ट रन‑टाइम प्रकार में परिवर्तित करता है।"
type: docs
weight: 100
url: /hi/cpp/system.xml.schema/xmlschemadatatype/changetype/
---
## XmlSchemaDatatype::ChangeType(SharedPtr\<Object\>, const TypeInfo\&) method


निर्दिष्ट मान को, जिसका प्रकार XML स्कीमा प्रकार के वैध प्रतिनिधित्वों में से एक है जिसे [XmlSchemaDatatype](../) द्वारा दर्शाया गया है, निर्दिष्ट रन‑टाइम प्रकार में परिवर्तित करता है।

```cpp
virtual SharedPtr<Object> System::Xml::Schema::XmlSchemaDatatype::ChangeType(SharedPtr<Object> value, const TypeInfo &targetType)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | SharedPtr\<Object\> | निर्दिष्ट प्रकार में परिवर्तित करने के लिए इनपुट मान। |
| targetType | const TypeInfo\& | इनपुट मान को परिवर्तित करने के लिए लक्ष्य प्रकार। |

### ReturnValue

परिवर्तित इनपुट मान।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlSchemaDatatype](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaDatatype::ChangeType(SharedPtr\<Object\>, const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) method


निर्दिष्ट मान को, जिसका प्रकार XML स्कीमा प्रकार के वैध प्रतिनिधित्वों में से एक है जिसे [XmlSchemaDatatype](../) द्वारा दर्शाया गया है, रन‑टाइम प्रकार में परिवर्तित करता है, यदि [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) का उपयोग करके, यदि [XmlSchemaDatatype](../) **xs:QName** प्रकार या उससे व्युत्पन्न प्रकार का प्रतिनिधित्व करता है।

```cpp
virtual SharedPtr<Object> System::Xml::Schema::XmlSchemaDatatype::ChangeType(SharedPtr<Object> value, const TypeInfo &targetType, SharedPtr<IXmlNamespaceResolver> namespaceResolver)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | SharedPtr\<Object\> | निर्दिष्ट प्रकार में परिवर्तित करने के लिए इनपुट मान। |
| targetType | const TypeInfo\& | इनपुट मान को परिवर्तित करने के लिए लक्ष्य प्रकार। |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | एक [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) जिसका उपयोग नेमस्पेस उपसर्गों को हल करने के लिए किया जाता है। यह केवल तब उपयोगी है जब [XmlSchemaDatatype](../) **xs:QName** प्रकार या उससे व्युत्पन्न प्रकार का प्रतिनिधित्व करता है। |

### ReturnValue

परिवर्तित इनपुट मान।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XmlSchemaDatatype](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
