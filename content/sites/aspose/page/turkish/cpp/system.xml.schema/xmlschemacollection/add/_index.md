---
title: "System::Xml::Schema::XmlSchemaCollection::Add metodu"
linktitle: "Add"
second_title: "Aspose.Page için C++"
description: "System::Xml::Schema::XmlSchemaCollection::Add metodu. C++'ta XmlSchema'yı koleksiyona ekler."
type: docs
weight: 200
url: /tr/cpp/system.xml.schema/xmlschemacollection/add/
---
## XmlSchemaCollection::Add(const SharedPtr\<XmlSchema\>\&) method


[XmlSchema](../../xmlschema/) öğesini koleksiyona ekler.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const SharedPtr<XmlSchema> &schema)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | Koleksiyona eklenecek [XmlSchema](../../xmlschema/). |

### ReturnValue

[XmlSchema](../../xmlschema/) nesnesi.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const SharedPtr\<XmlSchema\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


[XmlSchema](../../xmlschema/) öğesini koleksiyona ekler. Belirtilen [XmlResolver](../../../system.xml/xmlresolver/) dış referansları çözmek için kullanılır.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const SharedPtr<XmlSchema> &schema, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | Koleksiyona eklenecek [XmlSchema](../../xmlschema/). |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/), **include** ve **import** öğelerinde başvurulan ad alanlarını çözmek için kullanılır. Bu **nullptr** ise, dış referanslar çözülmez. |

### ReturnValue

Şema koleksiyonuna eklenen [XmlSchema](../../xmlschema/).

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const SharedPtr\<XmlSchemaCollection\>\&) method


Verilen koleksiyonda tanımlanan tüm ad alanlarını (ilişkili şemalarıyla birlikte) bu koleksiyona ekler.

```cpp
void System::Xml::Schema::XmlSchemaCollection::Add(const SharedPtr<XmlSchemaCollection> &schema)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchemaCollection\>\& | Bu koleksiyona eklemek istediğiniz [XmlSchemaCollection](../). |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaCollection](../)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const String\&, const SharedPtr\<XmlReader\>\&) method


[XmlReader](../../../system.xml/xmlreader/) içinde bulunan şemayı şema koleksiyonuna ekler.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const String &ns, const SharedPtr<XmlReader> &reader)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| ns | const String\& | Şema ile ilişkili ad alanı URI'si. XML Şemaları için bu genellikle **targetNamespace** olur. |
| reader | const SharedPtr\<XmlReader\>\& | Eklenecek şemayı içeren [XmlReader](../../../system.xml/xmlreader/). |

### ReturnValue

Şema koleksiyonuna eklenen [XmlSchema](../../xmlschema/); şema bir XDR şeması ise veya şemada derleme hataları varsa **nullptr** döndürülür.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const String\&, const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Şemayı, [XmlReader](../../../system.xml/xmlreader/) içinde bulunan şemayı şema koleksiyonuna ekler. Belirtilen [XmlResolver](../../../system.xml/xmlresolver/) dış kaynakları çözmek için kullanılır.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const String &ns, const SharedPtr<XmlReader> &reader, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| ns | const String\& | Şema ile ilişkili ad alanı URI'si. XML Şemaları için bu genellikle **targetNamespace** olur. |
| reader | const SharedPtr\<XmlReader\>\& | Eklenecek şemayı içeren [XmlReader](../../../system.xml/xmlreader/). |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/), **include** ve **import** öğelerinde veya **x-schema** özniteliğinde başvurulan ad alanlarını çözmek için kullanılır (XDR şemaları). Bu **nullptr** ise, dış başvurular çözülmez. |

### ReturnValue

Şema koleksiyonuna eklenen [XmlSchema](../../xmlschema/); şema bir XDR şeması ise veya şemada derleme hataları varsa **nullptr** döndürülür.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const String\&, const String\&) method


Verilen URL tarafından konumlandırılan şemayı şema koleksiyonuna ekler.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const String &ns, const String &uri)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| ns | const String\& | Şema ile ilişkili ad alanı URI'si. XML Şemaları için bu genellikle **targetNamespace** olur. |
| uri | const String\& | Yüklenecek şemayı belirten URL. |

### ReturnValue

Şema koleksiyonuna eklenen [XmlSchema](../../xmlschema/); şema bir XDR şeması ise veya şemada derleme hataları varsa **nullptr** döndürülür.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
