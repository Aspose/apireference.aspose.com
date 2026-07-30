---
title: "System::Xml::Schema::XmlSchemaSet::Schemas yöntemi"
linktitle: "Şemalar"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::XmlSchemaSet::Schemas yöntemi. C++'daki XmlSchemaSet içinde bulunan tüm XML Schema tanım dili (XSD) şemalarının bir koleksiyonunu döndürür."
type: docs
weight: 1600
url: /tr/cpp/system.xml.schema/xmlschemaset/schemas/
---
## XmlSchemaSet::Schemas() method


Tüm XML [Schema](../../) tanım dili (XSD) şemalarının bir koleksiyonunu [XmlSchemaSet](../) içinde döndürür.

```cpp
SharedPtr<Collections::Generic::IList<SharedPtr<XmlSchema>>> System::Xml::Schema::XmlSchemaSet::Schemas()
```


### ReturnValue

[XmlSchemaSet](../)'e eklenmiş tüm şemaları içeren bir IList nesnesi. Eğer [XmlSchemaSet](../)'e hiçbir şema eklenmemişse, boş bir koleksiyon döndürülür.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaSet::Schemas(String) method


Verilen ad alanına ait tüm XML [Schema](../../) tanım dili (XSD) şemalarının bir koleksiyonunu [XmlSchemaSet](../) içinde döndürür.

```cpp
SharedPtr<Collections::Generic::List<SharedPtr<XmlSchema>>> System::Xml::Schema::XmlSchemaSet::Schemas(String targetNamespace)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| targetNamespace | Dize | Şemanın **targetNamespace** özelliği. |

### ReturnValue

Verilen ad alanına ait ve [XmlSchemaSet](../)'e eklenmiş tüm şemaları içeren bir IList nesnesi. Eğer [XmlSchemaSet](../)'e hiçbir şema eklenmemişse, boş bir koleksiyon döndürülür.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [List](../../../system.collections.generic/list/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
