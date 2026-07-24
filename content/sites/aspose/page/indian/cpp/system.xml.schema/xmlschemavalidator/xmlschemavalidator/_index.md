---
title: "System::Xml::Schema::XmlSchemaValidator::XmlSchemaValidator constructor"
linktitle: "XmlSchemaValidator"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaValidator::XmlSchemaValidator कन्स्ट्रक्टर। C++ में XmlSchemaValidator क्लास का नया इंस्टेंस इनिशियलाइज़ करता है।"
type: docs
weight: 100
url: /hi/cpp/system.xml.schema/xmlschemavalidator/xmlschemavalidator/
---
## XmlSchemaValidator::XmlSchemaValidator constructor


एक नया इंस्टेंस [XmlSchemaValidator](../) क्लास का इनिशियलाइज़ करता है।

```cpp
System::Xml::Schema::XmlSchemaValidator::XmlSchemaValidator(const SharedPtr<XmlNameTable> &nameTable, const SharedPtr<XmlSchemaSet> &schemas, const SharedPtr<IXmlNamespaceResolver> &namespaceResolver, XmlSchemaValidationFlags validationFlags)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| nameTable | const SharedPtr\<XmlNameTable\>\& | एक [XmlNameTable](../../../system.xml/xmlnametable/) ऑब्जेक्ट जिसमें तत्व और गुण नाम एटॉमाइज़्ड स्ट्रिंग्स के रूप में होते हैं। |
| schemas | const SharedPtr\<XmlSchemaSet\>\& | एक [XmlSchemaSet](../../xmlschemaset/) ऑब्जेक्ट जिसमें सत्यापन के लिए उपयोग किए जाने वाले XML [Schema](../../) डिफिनिशन लैंग्वेज (XSD) स्कीमा होते हैं। |
| namespaceResolver | const SharedPtr\<IXmlNamespaceResolver\>\& | एक [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) ऑब्जेक्ट जिसका उपयोग सत्यापन के दौरान मिलने वाले नेमस्पेस को हल करने के लिए किया जाता है। |
| validationFlags | XmlSchemaValidationFlags | एक [XmlSchemaValidationFlags](../../xmlschemavalidationflags/) मान जो स्कीमा सत्यापन विकल्पों को निर्दिष्ट करता है। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../../system.xml/xmlnametable/)
* Class [XmlSchemaSet](../../xmlschemaset/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Enum [XmlSchemaValidationFlags](../../xmlschemavalidationflags/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
