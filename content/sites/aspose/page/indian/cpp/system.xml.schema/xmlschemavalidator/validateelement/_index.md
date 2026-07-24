---
title: "System::Xml::Schema::XmlSchemaValidator::ValidateElement विधि"
linktitle: "ValidateElement"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaValidator::ValidateElement मेथड। C++ में वर्तमान संदर्भ में तत्व को मान्य करता है।"
type: docs
weight: 1700
url: /hi/cpp/system.xml.schema/xmlschemavalidator/validateelement/
---
## XmlSchemaValidator::ValidateElement(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) method


वर्तमान संदर्भ में तत्व को वैध करता है।

```cpp
void System::Xml::Schema::XmlSchemaValidator::ValidateElement(const String &localName, const String &namespaceUri, const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| localName | const String\& | मान्य करने के लिए तत्व का स्थानीय नाम। |
| namespaceUri | const String\& | मान्य करने के लिए तत्व का नेमस्पेस URI। |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | एक [XmlSchemaInfo](../../xmlschemainfo/) ऑब्जेक्ट जिसकी प्रॉपर्टीज़ तत्व के नाम के सफल मान्यकरण पर सेट की जाती हैं। यह पैरामीटर **nullptr** हो सकता है। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaValidator::ValidateElement(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&, const String\&, const String\&, const String\&, const String\&) method


वर्तमान संदर्भ में तत्व को वैध करता है, जिसमें निर्दिष्ट **xsi:Type**, **xsi:Nil**, **xsi:SchemaLocation**, और **xsi:NoNamespaceSchemaLocation** गुण मान शामिल हैं।

```cpp
void System::Xml::Schema::XmlSchemaValidator::ValidateElement(const String &localName, const String &namespaceUri, const SharedPtr<XmlSchemaInfo> &schemaInfo, const String &xsiType, const String &xsiNil, const String &xsiSchemaLocation, const String &xsiNoNamespaceSchemaLocation)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| localName | const String\& | मान्य करने के लिए तत्व का स्थानीय नाम। |
| namespaceUri | const String\& | मान्य करने के लिए तत्व का नेमस्पेस URI। |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | एक [XmlSchemaInfo](../../xmlschemainfo/) ऑब्जेक्ट जिसकी प्रॉपर्टीज़ तत्व के नाम के सफल मान्यकरण पर सेट की जाती हैं। यह पैरामीटर **nullptr** हो सकता है। |
| xsiType | const String\& | तत्व का **xsi:Type** एट्रिब्यूट मान। यह पैरामीटर **nullptr** हो सकता है। |
| xsiNil | const String\& | तत्व का **xsi:Nil** एट्रिब्यूट मान। यह पैरामीटर **nullptr** हो सकता है। |
| xsiSchemaLocation | const String\& | तत्व का **xsi:SchemaLocation** एट्रिब्यूट मान। यह पैरामीटर **nullptr** हो सकता है। |
| xsiNoNamespaceSchemaLocation | const String\& | तत्व का **xsi:NoNamespaceSchemaLocation** एट्रिब्यूट मान। यह पैरामीटर **nullptr** हो सकता है। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
