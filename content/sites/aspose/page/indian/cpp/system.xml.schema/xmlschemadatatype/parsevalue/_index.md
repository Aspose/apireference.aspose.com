---
title: "System::Xml::Schema::XmlSchemaDatatype::ParseValue method"
linktitle: "ParseValue"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaDatatype::ParseValue method. जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो C++ में निर्दिष्ट स्ट्रिंग को अंतर्निहित या उपयोगकर्ता‑परिभाषित सरल प्रकार के विरुद्ध मान्य करता है।"
type: docs
weight: 700
url: /hi/cpp/system.xml.schema/xmlschemadatatype/parsevalue/
---
## XmlSchemaDatatype::ParseValue method


जब एक व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो निर्दिष्ट **string** को अंतर्निहित या उपयोगकर्ता-परिभाषित सरल प्रकार के विरुद्ध मान्य करता है।

```cpp
virtual SharedPtr<Object> System::Xml::Schema::XmlSchemaDatatype::ParseValue(String s, SharedPtr<XmlNameTable> nameTable, SharedPtr<IXmlNamespaceResolver> nsmgr)=0
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| s | String | सरल प्रकार के विरुद्ध मान्य करने के लिए **string**। |
| nameTable | SharedPtr\<XmlNameTable\> | यदि यह [XmlSchemaDatatype](../) ऑब्जेक्ट **xs:NCName** प्रकार का प्रतिनिधित्व करता है, तो **string** को पार्स करते समय एटॉमिकेशन के लिए उपयोग करने वाला [XmlNameTable](../../../system.xml/xmlnametable/)। |
| nsmgr | SharedPtr\<IXmlNamespaceResolver\> | यदि यह [XmlSchemaDatatype](../) ऑब्जेक्ट **xs:QName** प्रकार का प्रतिनिधित्व करता है, तो **string** को पार्स करते समय उपयोग करने वाला [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) ऑब्जेक्ट। |

### ReturnValue

एक [Object](../../../system/object/) जिसे सुरक्षित रूप से उस प्रकार में कास्ट किया जा सकता है जो [XmlSchemaDatatype::get_ValueType](../get_valuetype/) कॉल द्वारा लौटाया जाता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XmlNameTable](../../../system.xml/xmlnametable/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XmlSchemaDatatype](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
