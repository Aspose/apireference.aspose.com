---
title: "System::Xml::Schema::XmlSchemaType::IsDerivedFrom विधि"
linktitle: "IsDerivedFrom"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaType::IsDerivedFrom विधि. यह एक मान लौटाता है जो दर्शाता है कि निर्दिष्ट व्युत्पन्न स्कीमा प्रकार C++ में निर्दिष्ट मूल स्कीमा प्रकार से व्युत्पन्न है या नहीं।"
type: docs
weight: 1700
url: /hi/cpp/system.xml.schema/xmlschematype/isderivedfrom/
---
## XmlSchemaType::IsDerivedFrom method


निर्दिष्ट व्युत्पन्न स्कीमा प्रकार आधार स्कीमा प्रकार से व्युत्पन्न है या नहीं, यह दर्शाने वाला मान लौटाता है।

```cpp
static bool System::Xml::Schema::XmlSchemaType::IsDerivedFrom(SharedPtr<XmlSchemaType> derivedType, const SharedPtr<XmlSchemaType> &baseType, XmlSchemaDerivationMethod except)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| derivedType | SharedPtr\<XmlSchemaType\> | परीक्षण के लिए व्युत्पन्न [XmlSchemaType](../) । |
| baseType | const SharedPtr\<XmlSchemaType\>\& | व्युत्पन्न [XmlSchemaType](../) के विरुद्ध परीक्षण करने के लिए मूल [XmlSchemaType](../) । |
| except | XmlSchemaDerivationMethod | [XmlSchemaDerivationMethod](../../xmlschemaderivationmethod/) मानों में से एक जो परीक्षण से बाहर रखने के लिए प्रकार व्युत्पत्ति विधि का प्रतिनिधित्व करता है। |

### ReturnValue

**true** if the derived type is derived from the base type; otherwise, **false**.

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaType](../)
* Enum [XmlSchemaDerivationMethod](../../xmlschemaderivationmethod/)
* Class [XmlSchemaType](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
