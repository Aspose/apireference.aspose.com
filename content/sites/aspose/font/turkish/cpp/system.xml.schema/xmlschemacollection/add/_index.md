---
title: "System::Xml::Schema::XmlSchemaCollection::Add method"
linktitle: "Add"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::XmlSchemaCollection::Add yöntemi. XmlSchema'ı C++'ta koleksiyona ekler."
type: docs
weight: 200
url: /tr/cpp/system.xml.schema/xmlschemacollection/add/
---
## XmlSchemaCollection::Add(const SharedPtr\<XmlSchema\>\&) method


[XmlSchema](../../xmlschema/) koleksiyona ekler.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const SharedPtr<XmlSchema> &schema)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | Koleksiyona eklenecek [XmlSchema](../../xmlschema/). |

### ReturnValue

[XmlSchema](../../xmlschema/) nesnesi.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaCollection::Add(const SharedPtr\<XmlSchema\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


[XmlSchema](../../xmlschema/) koleksiyona ekler. Belirtilen [XmlResolver](../../../system.xml/xmlresolver/) herhangi bir dış referansı çözmek için kullanılır.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const SharedPtr<XmlSchema> &schema, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | Koleksiyona eklenecek [XmlSchema](../../xmlschema/). |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | **include** ve **import** öğelerinde başvurulan ad alanlarını çözmek için kullanılan [XmlResolver](../../../system.xml/xmlresolver/). Bu **nullptr** ise, dış referanslar çözülmez. |

### ReturnValue

Şema koleksiyonuna eklenen [XmlSchema](../../xmlschema/).

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaCollection::Add(const SharedPtr\<XmlSchemaCollection\>\&) method


Verilen koleksiyonda tanımlı tüm ad alanlarını (ilişkili şemaları dahil) bu koleksiyona ekler.

```cpp
void System::Xml::Schema::XmlSchemaCollection::Add(const SharedPtr<XmlSchemaCollection> &schema)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchemaCollection\>\& | Bu koleksiyona eklemek istediğiniz [XmlSchemaCollection](../). |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaCollection](../)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaCollection::Add(const String\&, const SharedPtr\<XmlReader\>\&) method


[XmlReader](../../../system.xml/xmlreader/) içinde bulunan şemayı şema koleksiyonuna ekler.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const String &ns, const SharedPtr<XmlReader> &reader)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ns | const String\& | Şema ile ilişkili ad alanı URI'si. XML Şemaları için, bu genellikle **targetNamespace** olur. |
| reader | const SharedPtr\<XmlReader\>\& | Eklemek için şemayı içeren [XmlReader](../../../system.xml/xmlreader/). |

### ReturnValue

Şema koleksiyonuna eklenen [XmlSchema](../../xmlschema/); eklenen şema bir XDR şemasıysa veya şemada derleme hataları varsa **nullptr**.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaCollection::Add(const String\&, const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


[XmlReader](../../../system.xml/xmlreader/) içinde bulunan şemayı şema koleksiyonuna ekler. Belirtilen [XmlResolver](../../../system.xml/xmlresolver/) herhangi bir dış kaynağı çözmek için kullanılır.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const String &ns, const SharedPtr<XmlReader> &reader, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ns | const String\& | Şema ile ilişkili ad alanı URI'si. XML Şemaları için, bu genellikle **targetNamespace** olur. |
| reader | const SharedPtr\<XmlReader\>\& | Eklemek için şemayı içeren [XmlReader](../../../system.xml/xmlreader/). |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | **include** ve **import** öğelerinde veya **x-schema** özniteliğinde (XDR şemaları) başvurulan ad alanlarını çözmek için kullanılan [XmlResolver](../../../system.xml/xmlresolver/). Bu **nullptr** ise, dış referanslar çözülmez. |

### ReturnValue

Şema koleksiyonuna eklenen [XmlSchema](../../xmlschema/); eklenen şema bir XDR şemasıysa veya şemada derleme hataları varsa **nullptr**.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaCollection::Add(const String\&, const String\&) method


Verilen URL tarafından bulunan şemayı şema koleksiyonuna ekler.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const String &ns, const String &uri)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ns | const String\& | Şema ile ilişkili ad alanı URI'si. XML Şemaları için, bu genellikle **targetNamespace** olur. |
| uri | const String\& | Yüklenecek şemayı belirten URL. |

### ReturnValue

Şema koleksiyonuna eklenen [XmlSchema](../../xmlschema/); eklenen şema bir XDR şemasıysa veya şemada derleme hataları varsa **nullptr**.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
