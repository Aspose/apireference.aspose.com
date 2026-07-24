---
title: "System::Xml::Schema::XmlSchemaSet::Schemas yöntemi"
linktitle: "Schemas"
second_title: "Aspose.Page için C++"
description: "System::Xml::Schema::XmlSchemaSet::Schemas yöntemi. C++'ta XmlSchemaSet içinde bulunan tüm XML Şema tanım dili (XSD) şemalarının bir koleksiyonunu döndürür."
type: docs
weight: 1600
url: /tr/cpp/system.xml.schema/xmlschemaset/schemas/
---
## XmlSchemaSet::Schemas() method


Tüm XML [Schema](../../) tanım dili (XSD) şemalarının [XmlSchemaSet](../) içinde bir koleksiyonunu döndürür.

```cpp
SharedPtr<Collections::Generic::IList<SharedPtr<XmlSchema>>> System::Xml::Schema::XmlSchemaSet::Schemas()
```


### ReturnValue

[XmlSchemaSet](../) içine eklenmiş tüm şemaları içeren bir IList nesnesi. Eğer [XmlSchemaSet](../) içine hiçbir şema eklenmemişse, boş bir koleksiyon döndürülür.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Schemas(String) method


Verilen ad alanına ait olan [XmlSchemaSet](../) içindeki tüm XML [Schema](../../) tanım dili (XSD) şemalarının bir koleksiyonunu döndürür.

```cpp
SharedPtr<Collections::Generic::List<SharedPtr<XmlSchema>>> System::Xml::Schema::XmlSchemaSet::Schemas(String targetNamespace)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| targetNamespace | String | Şemanın **targetNamespace** özelliği. |

### ReturnValue

Verilen ad alanına ait olan ve [XmlSchemaSet](../) içine eklenmiş tüm şemaları içeren bir IList nesnesi. Eğer [XmlSchemaSet](../) içine hiçbir şema eklenmemişse, boş bir koleksiyon döndürülür.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [List](../../../system.collections.generic/list/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
