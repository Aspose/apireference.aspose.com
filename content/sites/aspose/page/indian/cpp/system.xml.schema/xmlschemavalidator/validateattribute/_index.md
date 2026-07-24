---
title: "System::Xml::Schema::XmlSchemaValidator::ValidateAttribute मेथड"
linktitle: "ValidateAttribute"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaValidator::ValidateAttribute मेथड। यह C++ में वर्तमान तत्व संदर्भ में एट्रिब्यूट का नाम, नेमस्पेस URI, और मान को सत्यापित करता है।"
type: docs
weight: 1600
url: /hi/cpp/system.xml.schema/xmlschemavalidator/validateattribute/
---
## XmlSchemaValidator::ValidateAttribute(const String\&, const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) method


वर्तमान तत्व संदर्भ में एट्रिब्यूट नाम, नेमस्पेस URI और मान को वैध करता है।

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateAttribute(const String &localName, const String &namespaceUri, const String &attributeValue, const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| localName | const String\& | सत्यापित करने के लिए गुण का स्थानीय नाम। |
| namespaceUri | const String\& | सत्यापित करने के लिए गुण का नेमस्पेस URI। |
| attributeValue | const String\& | सत्यापित करने के लिए गुण का मान। |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | एक [XmlSchemaInfo](../../xmlschemainfo/) ऑब्जेक्ट जिसका गुण सफल सत्यापन पर सेट होते हैं। यह पैरामीटर **nullptr** हो सकता है। |

### ReturnValue

सत्यापित गुण का मान।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaValidator::ValidateAttribute(const String\&, const String\&, XmlValueGetter, const SharedPtr\<XmlSchemaInfo\>\&) method


वर्तमान तत्व संदर्भ में एट्रिब्यूट नाम, नेमस्पेस URI और मान को वैध करता है।

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateAttribute(const String &localName, const String &namespaceUri, XmlValueGetter attributeValue, const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| localName | const String\& | सत्यापित करने के लिए गुण का स्थानीय नाम। |
| namespaceUri | const String\& | सत्यापित करने के लिए गुण का नेमस्पेस URI। |
| attributeValue | XmlValueGetter | एक [XmlValueGetter](../../xmlvaluegetter/) कॉलबैक जिसका उपयोग गुण का मान XML [Schema](../../) डिफिनिशन लैंग्वेज (XSD) प्रकार के साथ संगत प्रकार में पास करने के लिए किया जाता है। |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | एक [XmlSchemaInfo](../../xmlschemainfo/) ऑब्जेक्ट जिसका गुण सफल सत्यापन पर सेट होते हैं। यह पैरामीटर **nullptr** हो सकता है। |

### ReturnValue

सत्यापित गुण का मान।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Typedef [XmlValueGetter](../../xmlvaluegetter/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
