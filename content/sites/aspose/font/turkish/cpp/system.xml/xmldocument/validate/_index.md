---
title: "System::Xml::XmlDocument::Validate yöntemi"
linktitle: "Doğrula"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlDocument::Validate yöntemi. C++'de XmlDocument::get_Schemas listesinde bulunan XML Şema Tanım Dili (XSD) şemalarına karşı XmlDocument'ı doğrular."
type: docs
weight: 4300
url: /tr/cpp/system.xml/xmldocument/validate/
---
## XmlDocument::Validate(Schema::ValidationEventHandler) method


[XmlDocument](../) öğesini, [XmlDocument::get_Schemas](../get_schemas/) listesinde bulunan XML [Schema](../../../system.xml.schema/) Tanım Dili (XSD) şemalarına karşı doğrular.

```cpp
void System::Xml::XmlDocument::Validate(Schema::ValidationEventHandler validationEventHandler)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| validationEventHandler | Schema::ValidationEventHandler | Şema doğrulama uyarıları ve hataları hakkında bilgi alan [Schema::ValidationEventHandler](../../../system.xml.schema/validationeventhandler/) nesnesi. |

## Ayrıca Bakınız

* Typedef [ValidationEventHandler](../../../system.xml.schema/validationeventhandler/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlDocument::Validate(Schema::ValidationEventHandler, const SharedPtr\<XmlNode\>\&) method


[XmlNode](../../xmlnode/) nesnesini, [XmlDocument::get_Schemas](../get_schemas/) listesinde bulunan XML [Schema](../../../system.xml.schema/) Tanım Dili (XSD) şemalarına karşı doğrular.

```cpp
void System::Xml::XmlDocument::Validate(Schema::ValidationEventHandler validationEventHandler, const SharedPtr<XmlNode> &nodeToValidate)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| validationEventHandler | Schema::ValidationEventHandler | Şema doğrulama uyarıları ve hataları hakkında bilgi alan [Schema::ValidationEventHandler](../../../system.xml.schema/validationeventhandler/) nesnesi. |
| nodeToValidate | const SharedPtr\<XmlNode\>\& | Doğrulama için bir [XmlDocument](../) üzerinden oluşturulan [XmlNode](../../xmlnode/) nesnesi. |

## Ayrıca Bakınız

* Typedef [ValidationEventHandler](../../../system.xml.schema/validationeventhandler/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
