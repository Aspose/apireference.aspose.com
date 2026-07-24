---
title: "Metode System::Xml::XPath::XPathNavigator::MoveToNext"
linktitle: "MoveToNext"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Xml::XPath::XPathNavigator::MoveToNext. Saat dioverride dalam kelas turunan, memindahkan XPathNavigator ke node saudara berikutnya dari node saat ini dalam C++."
type: docs
weight: 6000
url: /id/cpp/system.xml.xpath/xpathnavigator/movetonext/
---
## XPathNavigator::MoveToNext() method


Saat dioverride dalam kelas turunan, memindahkan [XPathNavigator](../) ke node saudara berikutnya dari node saat ini.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToNext()=0
```


### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the next sibling node; otherwise **false** if there are no more siblings or if the [XPathNavigator](../) is currently positioned on an attribute node. If **false**, the position of the [XPathNavigator](../) is unchanged.

## Lihat Juga

* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToNext(String, String) method


Memindahkan [XPathNavigator](../) ke node saudara berikutnya dengan nama lokal dan URI namespace yang ditentukan.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToNext(String localName, String namespaceURI)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| localName | String | Nama lokal dari node saudara berikutnya yang akan dipindahkan. |
| namespaceURI | String | URI namespace dari node saudara berikutnya yang akan dipindahkan. |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the next sibling node; **false** if there are no more siblings, or if the [XPathNavigator](../) is currently positioned on an attribute node. If **false**, the position of the [XPathNavigator](../) is unchanged.

## Lihat Juga

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToNext(XPathNodeType) method


Memindahkan [XPathNavigator](../) ke node saudara berikutnya dari node saat ini yang cocok dengan [XPathNodeType](../../xpathnodetype/) yang ditentukan.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToNext(XPathNodeType type)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| type | XPathNodeType | [XPathNodeType](../../xpathnodetype/) dari node saudara yang akan dipindahkan. |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the next sibling node; otherwise, **false** if there are no more siblings or if the [XPathNavigator](../) is currently positioned on an attribute node. If **false**, the position of the [XPathNavigator](../) is unchanged.

## Lihat Juga

* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
