---
title: "System::Xml::XPath::XPathNavigator::SelectDescendants method"
linktitle: "SelectDescendants"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XPath::XPathNavigator::SelectDescendants method. Memilih semua node keturunan dari node saat ini dengan nama lokal dan URI namespace yang ditentukan dalam C++."
type: docs
weight: 7400
url: /id/cpp/system.xml.xpath/xpathnavigator/selectdescendants/
---
## XPathNavigator::SelectDescendants(String, String, bool) method


Memilih semua node turunan dari node saat ini dengan nama lokal dan URI namespace yang ditentukan.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectDescendants(String name, String namespaceURI, bool matchSelf)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| name | String | Nama lokal dari node keturunan. |
| namespaceURI | String | URI namespace dari node keturunan. |
| matchSelf | bool | **true** untuk menyertakan node konteks dalam pemilihan; jika tidak, **false**. |

### ReturnValue

Sebuah [XPathNodeIterator](../../xpathnodeiterator/) yang berisi node yang dipilih.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectDescendants(XPathNodeType, bool) method


Memilih semua node keturunan dari node saat ini yang memiliki [XPathNodeType](../../xpathnodetype/) yang cocok.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectDescendants(XPathNodeType type, bool matchSelf)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| type | XPathNodeType | [XPathNodeType](../../xpathnodetype/) dari node keturunan. |
| matchSelf | bool | **true** untuk menyertakan node konteks dalam pemilihan; jika tidak, **false**. |

### ReturnValue

Sebuah [XPathNodeIterator](../../xpathnodeiterator/) yang berisi node yang dipilih.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
