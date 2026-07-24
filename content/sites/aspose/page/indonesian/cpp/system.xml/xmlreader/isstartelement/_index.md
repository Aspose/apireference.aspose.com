---
title: "Metode System::Xml::XmlReader::IsStartElement"
linktitle: "IsStartElement"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Xml::XmlReader::IsStartElement. Memanggil XmlReader::MoveToContent dan menguji apakah node konten saat ini adalah tag pembuka atau tag elemen kosong dalam C++."
type: docs
weight: 3000
url: /id/cpp/system.xml/xmlreader/isstartelement/
---
## XmlReader::IsStartElement() method


Memanggil [XmlReader::MoveToContent](../movetocontent/) dan menguji apakah node konten saat ini adalah tag pembuka atau tag elemen kosong.

```cpp
virtual bool System::Xml::XmlReader::IsStartElement()
```


### ReturnValue

**true** if [XmlReader::MoveToContent](../movetocontent/) finds a start tag or empty element tag; **false** if a node type other than [XmlNodeType::Element](../../xmlnodetype/) was found.

## Lihat Juga

* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::IsStartElement(String, String) method


Memanggil [XmlReader::MoveToContent](../movetocontent/) dan menguji apakah node konten saat ini adalah tag pembuka atau tag elemen kosong serta apakah nilai [XmlReader::get_LocalName](../get_localname/) dan [XmlReader::get_NamespaceURI](../get_namespaceuri/) dari elemen yang ditemukan cocok dengan string yang diberikan.

```cpp
virtual bool System::Xml::XmlReader::IsStartElement(String localname, String ns)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| localname | String | String yang akan dicocokkan dengan nilai **LocalName** dari elemen yang ditemukan. |
| ns | String | String yang akan dicocokkan dengan nilai **NamespaceURI** dari elemen yang ditemukan. |

### ReturnValue

**true** if the resulting node is an element. **false** if a node type other than [XmlNodeType::Element](../../xmlnodetype/) was found or if the **LocalName** and **NamespaceURI** values of the element do not match the specified strings.

## Lihat Juga

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::IsStartElement(String) method


Memanggil [XmlReader::MoveToContent](../movetocontent/) dan menguji apakah node konten saat ini adalah tag pembuka atau tag elemen kosong serta apakah nilai [XmlReader::get_Name](../get_name/) dari elemen yang ditemukan cocok dengan argumen yang diberikan.

```cpp
virtual bool System::Xml::XmlReader::IsStartElement(String name)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| name | String | String yang dicocokkan dengan nilai **Name** dari elemen yang ditemukan. |

### ReturnValue

**true** if the resulting node is an element and the **Name** value matches the specified string. **false** if a node type other than [XmlNodeType::Element](../../xmlnodetype/) was found or if the element **Name** value does not match the specified string.

## Lihat Juga

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
