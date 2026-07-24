---
title: "System::Xml::XmlDocument::Validate yöntemi"
linktitle: "Doğrula"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlDocument::Validate yöntemi. XmlDocument'i, C++'da XmlDocument::get_Schemas listesinde bulunan XML Şema Tanım Dili (XSD) şemalarına karşı doğrular."
type: docs
weight: 4300
url: /tr/cpp/system.xml/xmldocument/validate/
---
## XmlDocument::Validate(Schema::ValidationEventHandler) method


[XmlDocument](../)'i, [XmlDocument::get_Schemas](../get_schemas/) listesinde bulunan XML [Schema](../../../system.xml.schema/) Tanım Dili (XSD) şemalarına karşı doğrular.

```cpp
void System::Xml::XmlDocument::Validate(Schema::ValidationEventHandler validationEventHandler)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| validationEventHandler | Schema::ValidationEventHandler | [Schema::ValidationEventHandler](../../../system.xml.schema/validationeventhandler/) nesnesi, şema doğrulama uyarıları ve hataları hakkında bilgi alır. |

## Ayrıca Bakınız

* Typedef [ValidationEventHandler](../../../system.xml.schema/validationeventhandler/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::Validate(Schema::ValidationEventHandler, const SharedPtr\<XmlNode\>\&) method


Belirtilen [XmlNode](../../xmlnode/) nesnesini, [XmlDocument::get_Schemas](../get_schemas/) listesinde bulunan XML [Schema](../../../system.xml.schema/) Tanım Dili (XSD) şemalarına karşı doğrular.

```cpp
void System::Xml::XmlDocument::Validate(Schema::ValidationEventHandler validationEventHandler, const SharedPtr<XmlNode> &nodeToValidate)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| validationEventHandler | Schema::ValidationEventHandler | [Schema::ValidationEventHandler](../../../system.xml.schema/validationeventhandler/) nesnesi, şema doğrulama uyarıları ve hataları hakkında bilgi alır. |
| nodeToValidate | const SharedPtr\<XmlNode\>\& | Doğrulama için bir [XmlDocument](../)'tan oluşturulan [XmlNode](../../xmlnode/) nesnesi. |

## Ayrıca Bakınız

* Typedef [ValidationEventHandler](../../../system.xml.schema/validationeventhandler/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
