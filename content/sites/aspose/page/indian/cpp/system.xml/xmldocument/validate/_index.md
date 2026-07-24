---
title: "System::Xml::XmlDocument::Validate मेथड"
linktitle: "मान्य करें"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlDocument::Validate method. XmlDocument को XML Schema Definition Language (XSD) स्कीमा के विरुद्ध मान्य करता है जो XmlDocument::get_Schemas सूची में C++ में शामिल हैं।"
type: docs
weight: 4300
url: /hi/cpp/system.xml/xmldocument/validate/
---
## XmlDocument::Validate(Schema::ValidationEventHandler) method


[XmlDocument](../) को XML [Schema](../../../system.xml.schema/) Definition Language (XSD) स्कीमा के विरुद्ध मान्य करता है जो [XmlDocument::get_Schemas](../get_schemas/) सूची में शामिल हैं।

```cpp
void System::Xml::XmlDocument::Validate(Schema::ValidationEventHandler validationEventHandler)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| validationEventHandler | Schema::ValidationEventHandler | स्कीमा मान्यकरण चेतावनियों और त्रुटियों के बारे में जानकारी प्राप्त करने वाला [Schema::ValidationEventHandler](../../../system.xml.schema/validationeventhandler/) ऑब्जेक्ट। |

## संबंधित देखें

* Typedef [ValidationEventHandler](../../../system.xml.schema/validationeventhandler/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::Validate(Schema::ValidationEventHandler, const SharedPtr\<XmlNode\>\&) method


[XmlNode](../../xmlnode/) ऑब्जेक्ट को निर्दिष्ट XML [Schema](../../../system.xml.schema/) Definition Language (XSD) स्कीमा के विरुद्ध मान्य करता है जो [XmlDocument::get_Schemas](../get_schemas/) सूची में हैं।

```cpp
void System::Xml::XmlDocument::Validate(Schema::ValidationEventHandler validationEventHandler, const SharedPtr<XmlNode> &nodeToValidate)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| validationEventHandler | Schema::ValidationEventHandler | स्कीमा मान्यकरण चेतावनियों और त्रुटियों के बारे में जानकारी प्राप्त करने वाला [Schema::ValidationEventHandler](../../../system.xml.schema/validationeventhandler/) ऑब्जेक्ट। |
| nodeToValidate | const SharedPtr\<XmlNode\>\& | मान्य करने के लिए [XmlDocument](../) से निर्मित [XmlNode](../../xmlnode/) ऑब्जेक्ट। |

## संबंधित देखें

* Typedef [ValidationEventHandler](../../../system.xml.schema/validationeventhandler/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
