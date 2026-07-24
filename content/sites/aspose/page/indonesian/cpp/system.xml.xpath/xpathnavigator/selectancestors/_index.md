---
title: "System::Xml::XPath::XPathNavigator::SelectAncestors metode"
linktitle: "SelectAncestors"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XPath::XPathNavigator::SelectAncestors metode. Memilih semua node nenek moyang dari node saat ini yang memiliki nama lokal dan URI namespace yang ditentukan dalam C++."
type: docs
weight: 7200
url: /id/cpp/system.xml.xpath/xpathnavigator/selectancestors/
---
## XPathNavigator::SelectAncestors(String, String, bool) method


Memilih semua node nenek moyang dari node saat ini yang memiliki nama lokal dan URI namespace yang ditentukan.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectAncestors(String name, String namespaceURI, bool matchSelf)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| name | String | Nama lokal dari node-node nenek moyang. |
| namespaceURI | String | URI ruang nama dari node-node nenek moyang. |
| matchSelf | bool | Untuk menyertakan node konteks dalam pemilihan, **true**; jika tidak, **false**. |

### ReturnValue

Sebuah [XPathNodeIterator](../../xpathnodeiterator/) yang berisi node-node yang dipilih. Node yang dikembalikan berada dalam urutan dokumen terbalik.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectAncestors(XPathNodeType, bool) method


Memilih semua node nenek moyang dari node saat ini yang memiliki [XPathNodeType](../../xpathnodetype/) yang cocok.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectAncestors(XPathNodeType type, bool matchSelf)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| type | XPathNodeType | [XPathNodeType](../../xpathnodetype/) dari node-node nenek moyang. |
| matchSelf | bool | Untuk menyertakan node konteks dalam pemilihan, **true**; jika tidak, **false**. |

### ReturnValue

Sebuah [XPathNodeIterator](../../xpathnodeiterator/) yang berisi node-node yang dipilih. Node yang dikembalikan berada dalam urutan dokumen terbalik.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
