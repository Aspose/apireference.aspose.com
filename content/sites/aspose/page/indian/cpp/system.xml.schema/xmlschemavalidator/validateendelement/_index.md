---
title: "System::Xml::Schema::XmlSchemaValidator::ValidateEndElement मेथड"
linktitle: "ValidateEndElement"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaValidator::ValidateEndElement मेथड। यह जाँचता है कि सरल सामग्री वाले तत्वों के लिए तत्व की पाठ सामग्री उसके डेटा प्रकार के अनुसार वैध है या नहीं, और जटिल सामग्री वाले तत्वों के लिए वर्तमान तत्व की सामग्री पूर्ण है या नहीं, C++ में।"
type: docs
weight: 1800
url: /hi/cpp/system.xml.schema/xmlschemavalidator/validateendelement/
---
## XmlSchemaValidator::ValidateEndElement(const SharedPtr\<XmlSchemaInfo\>\&) method


सरल सामग्री वाले तत्वों के लिए, तत्व की टेक्स्ट सामग्री उसके डेटा प्रकार के अनुसार वैध है या नहीं, यह सत्यापित करता है, और जटिल सामग्री वाले तत्वों के लिए, वर्तमान तत्व की सामग्री पूर्ण है या नहीं, यह भी सत्यापित करता है।

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateEndElement(const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | एक [XmlSchemaInfo](../../xmlschemainfo/) ऑब्जेक्ट जिसकी प्रॉपर्टीज़ तत्व के सफल सत्यापन पर सेट की जाती हैं। यह पैरामीटर **nullptr** हो सकता है। |

### ReturnValue

यदि तत्व में सरल सामग्री है तो तत्व का पार्स किया गया, टाइप किया गया पाठ मान।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaValidator::ValidateEndElement(const SharedPtr\<XmlSchemaInfo\>\&, const SharedPtr\<Object\>\&) method


निर्दिष्ट तत्व की टेक्स्ट सामग्री उसके डेटा प्रकार के अनुसार वैध है या नहीं, यह सत्यापित करता है।

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateEndElement(const SharedPtr<XmlSchemaInfo> &schemaInfo, const SharedPtr<Object> &typedValue)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | एक [XmlSchemaInfo](../../xmlschemainfo/) ऑब्जेक्ट जिसकी प्रॉपर्टीज़ तत्व की पाठ सामग्री के सफल सत्यापन पर सेट की जाती हैं। यह पैरामीटर **nullptr** हो सकता है। |
| typedValue | const SharedPtr\<Object\>\& | तत्व की टाइप की गई पाठ सामग्री। |

### ReturnValue

तत्व की पार्स की गई, टाइप की गई सरल सामग्री।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
