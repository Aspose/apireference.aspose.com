---
title: "System::Xml::XPath::XPathNavigator::CheckValidity metode"
linktitle: "CheckValidity"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XPath::XPathNavigator::CheckValidity metode. Memverifikasi bahwa data XML dalam XPathNavigator sesuai dengan skema bahasa definisi XML Schema (XSD) yang disediakan dalam C++."
type: docs
weight: 300
url: /id/cpp/system.xml.xpath/xpathnavigator/checkvalidity/
---
## XPathNavigator::CheckValidity method


Memverifikasi bahwa data XML dalam [XPathNavigator](../) sesuai dengan bahasa definisi XML [Schema](../../../system.xml.schema/) (XSD) yang disediakan.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::CheckValidity(SharedPtr<System::Xml::Schema::XmlSchemaSet> schemas, System::Xml::Schema::ValidationEventHandler validationEventHandler)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| schemas | SharedPtr\<System::Xml::Schema::XmlSchemaSet\> | XmlSchemaSet yang berisi skema yang digunakan untuk memvalidasi data XML yang terdapat dalam [XPathNavigator](../). |
| validationEventHandler | System::Xml::Schema::ValidationEventHandler | ValidationEventHandler yang menerima informasi tentang peringatan dan kesalahan validasi skema. |

### ReturnValue

**true** if no schema validation errors occurred; otherwise, **false**.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../../../system.xml.schema/xmlschemaset/)
* Typedef [ValidationEventHandler](../../../system.xml.schema/validationeventhandler/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
