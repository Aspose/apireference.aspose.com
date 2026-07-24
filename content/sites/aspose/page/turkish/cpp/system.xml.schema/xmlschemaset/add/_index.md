---
title: "System::Xml::Schema::XmlSchemaSet::Add yöntemi"
linktitle: "Add"
second_title: "Aspose.Page için C++"
description: "System::Xml::Schema::XmlSchemaSet::Add yöntemi. Verilen XmlSchema'yi XmlSchemaSet'e C++'ta ekler."
type: docs
weight: 200
url: /tr/cpp/system.xml.schema/xmlschemaset/add/
---
## XmlSchemaSet::Add(const SharedPtr\<XmlSchema\>\&) method


Verilen [XmlSchema](../../xmlschema/) öğesini [XmlSchemaSet](../) içine ekler.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Add(const SharedPtr<XmlSchema> &schema)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | [XmlSchema](../../xmlschema/) nesnesi, [XmlSchemaSet](../) içine eklenecek. |

### ReturnValue

Şema geçerliyse bir [XmlSchema](../../xmlschema/) nesnesi. Şema geçerli değilse ve bir [ValidationEventHandler](../../validationeventhandler/) belirtilmişse, **nullptr** döndürülür ve uygun doğrulama olayı tetiklenir. Aksi takdirde, bir [XmlSchemaException](../../xmlschemaexception/) fırlatılır.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Add(const SharedPtr\<XmlSchemaSet\>\&) method


Verilen [XmlSchemaSet](../) içindeki tüm XML [Schema](../../) tanım dili (XSD) şemalarını [XmlSchemaSet](../) içine ekler.

```cpp
void System::Xml::Schema::XmlSchemaSet::Add(const SharedPtr<XmlSchemaSet> &schemas)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| schemas | const SharedPtr\<XmlSchemaSet\>\& | [XmlSchemaSet](../) nesnesi. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Add(String, const SharedPtr\<XmlReader\>\&) method


[XmlReader](../../../system.xml/xmlreader/) içinde bulunan XML [Schema](../../) tanım dili (XSD) şemasını [XmlSchemaSet](../) içine ekler.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Add(String targetNamespace, const SharedPtr<XmlReader> &schemaDocument)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| targetNamespace | String | Şemanın **targetNamespace** değeri, ya da şemada belirtilen **targetNamespace** değerini kullanmak için **nullptr**. |
| schemaDocument | const SharedPtr\<XmlReader\>\& | [XmlReader](../../../system.xml/xmlreader/) nesnesi. |

### ReturnValue

Şema geçerliyse bir [XmlSchema](../../xmlschema/) nesnesi. Şema geçerli değilse ve bir [ValidationEventHandler](../../validationeventhandler/) belirtilmişse, **nullptr** döndürülür ve uygun doğrulama olayı tetiklenir. Aksi takdirde, bir [XmlSchemaException](../../xmlschemaexception/) fırlatılır.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Add(String, const String\&) method


Belirtilen URL'deki XML [Schema](../../) tanım dili (XSD) şemasını [XmlSchemaSet](../) içine ekler.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Add(String targetNamespace, const String &schemaUri)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| targetNamespace | String | Şemanın **targetNamespace** değeri, ya da şemada belirtilen **targetNamespace** değerini kullanmak için **nullptr**. |
| schemaUri | const String\& | Yüklenecek şemayı belirten URL. |

### ReturnValue

Şema geçerliyse bir [XmlSchema](../../xmlschema/) nesnesi. Şema geçerli değilse ve bir [ValidationEventHandler](../../validationeventhandler/) belirtilmişse, **nullptr** döndürülür ve uygun doğrulama olayı tetiklenir. Aksi takdirde, bir [XmlSchemaException](../../xmlschemaexception/) fırlatılır.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
