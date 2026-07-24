---
title: "System::Xml::XmlReader::ReadToNextSibling metode"
linktitle: "ReadToNextSibling"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlReader::ReadToNextSibling metode. Memajukan XmlReader ke elemen saudara berikutnya dengan nama lokal dan URI namespace yang ditentukan dalam C++."
type: docs
weight: 7300
url: /id/cpp/system.xml/xmlreader/readtonextsibling/
---
## XmlReader::ReadToNextSibling(String, String) method


Memajukan [XmlReader](../) ke elemen saudara berikutnya dengan nama lokal dan URI namespace yang ditentukan.

```cpp
virtual bool System::Xml::XmlReader::ReadToNextSibling(String localName, String namespaceURI)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| localName | String | Nama lokal dari elemen saudara yang ingin Anda pindahkan. |
| namespaceURI | String | URI namespace dari elemen saudara yang ingin Anda pindahkan. |

### ReturnValue

**true** if a matching sibling element is found; otherwise, **false**. If a matching sibling element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the parent element.

## Lihat Juga

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadToNextSibling(String) method


Memajukan [XmlReader](../) ke elemen saudara berikutnya dengan nama terkualifikasi yang ditentukan.

```cpp
virtual bool System::Xml::XmlReader::ReadToNextSibling(String name)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| name | String | Nama terkualifikasi dari elemen saudara yang ingin Anda pindahkan. |

### ReturnValue

**true** if a matching sibling element is found; otherwise **false**. If a matching sibling element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the parent element.

## Lihat Juga

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
