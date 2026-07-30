---
title: "System::Xml::XPath::XPathNavigator::CheckValidity yöntemi"
linktitle: "CheckValidity"
second_title: "Aspose.Font için C++"
description: "System::Xml::XPath::XPathNavigator::CheckValidity yöntemi. XPathNavigator içindeki XML verilerinin C++'ta sağlanan XML Şema tanım dili (XSD) şemasına uygun olduğunu doğrular."
type: docs
weight: 300
url: /tr/cpp/system.xml.xpath/xpathnavigator/checkvalidity/
---
## XPathNavigator::CheckValidity method


[XPathNavigator](../) içindeki XML verilerinin sağlanan XML [Schema](../../../system.xml.schema/) tanım dili (XSD) şemasına uygun olduğunu doğrular.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::CheckValidity(SharedPtr<System::Xml::Schema::XmlSchemaSet> schemas, System::Xml::Schema::ValidationEventHandler validationEventHandler)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| schemas | SharedPtr\<System::Xml::Schema::XmlSchemaSet\> | [XPathNavigator](../) içinde bulunan XML verilerini doğrulamak için kullanılan şemaları içeren XmlSchemaSet. |
| validationEventHandler | System::Xml::Schema::ValidationEventHandler | Şema doğrulama uyarıları ve hataları hakkında bilgi alan ValidationEventHandler. |

### ReturnValue

**true** if no schema validation errors occurred; otherwise, **false**.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../../../system.xml.schema/xmlschemaset/)
* Typedef [ValidationEventHandler](../../../system.xml.schema/validationeventhandler/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
