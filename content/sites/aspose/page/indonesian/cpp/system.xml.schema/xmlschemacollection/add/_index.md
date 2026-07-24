---
title: "System::Xml::Schema::XmlSchemaCollection::Add metode"
linktitle: "Add"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::Schema::XmlSchemaCollection::Add metode. Menambahkan XmlSchema ke koleksi dalam C++."
type: docs
weight: 200
url: /id/cpp/system.xml.schema/xmlschemacollection/add/
---
## XmlSchemaCollection::Add(const SharedPtr\<XmlSchema\>\&) method


Menambahkan [XmlSchema](../../xmlschema/) ke koleksi.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const SharedPtr<XmlSchema> &schema)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | [XmlSchema](../../xmlschema/) yang akan ditambahkan ke koleksi. |

### ReturnValue

Objek [XmlSchema](../../xmlschema/).

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const SharedPtr\<XmlSchema\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Menambahkan [XmlSchema](../../xmlschema/) ke koleksi. [XmlResolver](../../../system.xml/xmlresolver/) yang ditentukan digunakan untuk menyelesaikan referensi eksternal apa pun.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const SharedPtr<XmlSchema> &schema, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | [XmlSchema](../../xmlschema/) yang akan ditambahkan ke koleksi. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/) yang digunakan untuk menyelesaikan namespace yang dirujuk dalam elemen **include** dan **import**. Jika ini **nullptr**, referensi eksternal tidak diselesaikan. |

### ReturnValue

[XmlSchema](../../xmlschema/) yang ditambahkan ke koleksi skema.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const SharedPtr\<XmlSchemaCollection\>\&) method


Menambahkan semua namespace yang didefinisikan dalam koleksi yang diberikan (termasuk skema terkait) ke koleksi ini.

```cpp
void System::Xml::Schema::XmlSchemaCollection::Add(const SharedPtr<XmlSchemaCollection> &schema)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchemaCollection\>\& | [XmlSchemaCollection](../) yang ingin Anda tambahkan ke koleksi ini. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaCollection](../)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const String\&, const SharedPtr\<XmlReader\>\&) method


Menambahkan skema yang terdapat dalam [XmlReader](../../../system.xml/xmlreader/) ke koleksi skema.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const String &ns, const SharedPtr<XmlReader> &reader)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| ns | const String\& | URI namespace yang terkait dengan skema. Untuk XML Schema, ini biasanya adalah **targetNamespace**. |
| reader | const SharedPtr\<XmlReader\>\& | [XmlReader](../../../system.xml/xmlreader/) yang berisi skema untuk ditambahkan. |

### ReturnValue

[XmlSchema](../../xmlschema/) yang ditambahkan ke koleksi skema; **nullptr** jika skema yang ditambahkan adalah skema XDR atau jika terdapat kesalahan kompilasi dalam skema.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const String\&, const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Menambahkan skema yang terdapat dalam [XmlReader](../../../system.xml/xmlreader/) ke dalam koleksi skema. [XmlResolver](../../../system.xml/xmlresolver/) yang ditentukan digunakan untuk menyelesaikan sumber daya eksternal apa pun.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const String &ns, const SharedPtr<XmlReader> &reader, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| ns | const String\& | URI namespace yang terkait dengan skema. Untuk XML Schema, ini biasanya adalah **targetNamespace**. |
| reader | const SharedPtr\<XmlReader\>\& | [XmlReader](../../../system.xml/xmlreader/) yang berisi skema untuk ditambahkan. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/) yang digunakan untuk menyelesaikan namespace yang dirujuk dalam elemen **include** dan **import** atau atribut **x-schema** (skema XDR). Jika ini **nullptr**, referensi eksternal tidak diselesaikan. |

### ReturnValue

[XmlSchema](../../xmlschema/) yang ditambahkan ke koleksi skema; **nullptr** jika skema yang ditambahkan adalah skema XDR atau jika terdapat kesalahan kompilasi dalam skema.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const String\&, const String\&) method


Menambahkan skema yang terletak pada URL yang diberikan ke dalam koleksi skema.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const String &ns, const String &uri)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| ns | const String\& | URI namespace yang terkait dengan skema. Untuk XML Schema, ini biasanya adalah **targetNamespace**. |
| uri | const String\& | URL yang menentukan skema yang akan dimuat. |

### ReturnValue

[XmlSchema](../../xmlschema/) yang ditambahkan ke koleksi skema; **nullptr** jika skema yang ditambahkan adalah skema XDR atau jika terdapat kesalahan kompilasi dalam skema.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
