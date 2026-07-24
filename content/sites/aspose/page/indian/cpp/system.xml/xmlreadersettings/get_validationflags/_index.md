---
title: "System::Xml::XmlReaderSettings::get_ValidationFlags मेथड"
linktitle: "get_ValidationFlags"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlReaderSettings::get_ValidationFlags मेथड। स्कीमा वैधता सेटिंग्स दर्शाने वाला मान लौटाता है। यह सेटिंग C++ में उन XmlReader ऑब्जेक्ट्स पर लागू होती है जो स्कीमा वैधता करती हैं (XmlReaderSettings::get_ValidationType मान ValidationType::Schema है)।"
type: docs
weight: 1800
url: /hi/cpp/system.xml/xmlreadersettings/get_validationflags/
---
## XmlReaderSettings::get_ValidationFlags method


स्कीमा वैधता सेटिंग्स दर्शाने वाला मान लौटाता है। यह सेटिंग उन [XmlReader](../../xmlreader/) ऑब्जेक्ट्स पर लागू होती है जो स्कीमा वैधता करती हैं ([XmlReaderSettings::get_ValidationType](../get_validationtype/) मान [ValidationType::Schema](../../validationtype/) है)।

```cpp
Schema::XmlSchemaValidationFlags System::Xml::XmlReaderSettings::get_ValidationFlags()
```


### ReturnValue

एक बिटवाइज़ संयोजन जो वैधता विकल्पों को निर्दिष्ट करता है। XmlSchemaValidationFlags::ProcessIdentityConstraints और XmlSchemaValidationFlags::AllowXmlAttributes डिफ़ॉल्ट रूप से सक्षम हैं। XmlSchemaValidationFlags::ProcessInlineSchema, XmlSchemaValidationFlags::ProcessSchemaLocation और XmlSchemaValidationFlags::ReportValidationWarnings डिफ़ॉल्ट रूप से अक्षम हैं।

## संबंधित देखें

* Enum [XmlSchemaValidationFlags](../../../system.xml.schema/xmlschemavalidationflags/)
* Class [XmlReaderSettings](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
