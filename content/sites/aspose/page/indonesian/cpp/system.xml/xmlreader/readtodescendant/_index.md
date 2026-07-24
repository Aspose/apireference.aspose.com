---
title: "Metode System::Xml::XmlReader::ReadToDescendant"
linktitle: "ReadToDescendant"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Xml::XmlReader::ReadToDescendant. Meningkatkan XmlReader ke elemen keturunan berikutnya dengan nama lokal dan namespace URI yang ditentukan dalam C++."
type: docs
weight: 7100
url: /id/cpp/system.xml/xmlreader/readtodescendant/
---
## XmlReader::ReadToDescendant(String, String) method


Mengarahkan [XmlReader](../) ke elemen keturunan berikutnya dengan nama lokal dan URI namespace yang ditentukan.

```cpp
virtual bool System::Xml::XmlReader::ReadToDescendant(String localName, String namespaceURI)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| localName | String | Nama lokal elemen yang ingin Anda pindah ke. |
| namespaceURI | String | URI namespace elemen yang ingin Anda pindah ke. |

### ReturnValue

**true** if a matching descendant element is found; otherwise **false**. If a matching child element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the element. If the [XmlReader](../) is not positioned on an element when [XmlReader::ReadToDescendant(String,String)](./) was called, this method returns **false** and the position of the [XmlReader](../) is not changed.

## Lihat Juga

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadToDescendant(String) method


Mengarahkan [XmlReader](../) ke elemen keturunan berikutnya dengan nama yang memenuhi syarat yang ditentukan.

```cpp
virtual bool System::Xml::XmlReader::ReadToDescendant(String name)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| name | String | Nama yang memenuhi syarat dari elemen yang ingin Anda pindah ke. |

### ReturnValue

**true** if a matching descendant element is found; otherwise **false**. If a matching child element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the element. If the [XmlReader](../) is not positioned on an element when [XmlReader::ReadToDescendant(String)](./) was called, this method returns **false** and the position of the [XmlReader](../) is not changed.

## Lihat Juga

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
