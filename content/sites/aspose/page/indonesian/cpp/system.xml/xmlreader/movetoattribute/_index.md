---
title: "Metode System::Xml::XmlReader::MoveToAttribute"
linktitle: "MoveToAttribute"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Xml::XmlReader::MoveToAttribute. Ketika dioverride dalam kelas turunan, berpindah ke atribut dengan indeks yang ditentukan dalam C++."
type: docs
weight: 3200
url: /id/cpp/system.xml/xmlreader/movetoattribute/
---
## XmlReader::MoveToAttribute(int32_t) method


Saat ditimpa dalam kelas turunan, berpindah ke atribut dengan indeks yang ditentukan.

```cpp
virtual void System::Xml::XmlReader::MoveToAttribute(int32_t i)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| i | int32_t | Indeks atribut. |

## Lihat Juga

* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::MoveToAttribute(String) method


Ketika dioverride dalam kelas turunan, berpindah ke atribut dengan nilai [XmlReader::get_Name](../get_name/) yang ditentukan.

```cpp
virtual bool System::Xml::XmlReader::MoveToAttribute(String name)=0
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| name | String | Nama lengkap atribut. |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## Lihat Juga

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::MoveToAttribute(String, String) method


Ketika dioverride dalam kelas turunan, berpindah ke atribut dengan nilai [XmlReader::get_LocalName](../get_localname/) dan [XmlReader::get_NamespaceURI](../get_namespaceuri/) yang ditentukan.

```cpp
virtual bool System::Xml::XmlReader::MoveToAttribute(String name, String ns)=0
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| name | String | Nama lokal atribut. |
| ns | String | Namespace URI atribut. |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## Lihat Juga

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
