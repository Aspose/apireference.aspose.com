---
title: "System::Xml::XPath::XPathNavigator::MoveToFollowing metode"
linktitle: "MoveToFollowing"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XPath::XPathNavigator::MoveToFollowing metode. Memindahkan XPathNavigator ke elemen dengan nama lokal dan URI namespace yang ditentukan dalam urutan dokumen dalam C++."
type: docs
weight: 5700
url: /id/cpp/system.xml.xpath/xpathnavigator/movetofollowing/
---
## XPathNavigator::MoveToFollowing(String, String) method


Memindahkan [XPathNavigator](../) ke elemen dengan nama lokal dan URI namespace yang ditentukan dalam urutan dokumen.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(String localName, String namespaceURI)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| localName | String | Nama lokal elemen. |
| namespaceURI | String | URI namespace elemen. |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## Lihat Juga

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToFollowing(String, String, SharedPtr\<XPathNavigator\>) method


Memindahkan [XPathNavigator](../) ke elemen dengan nama lokal dan URI namespace yang ditentukan, ke batas yang ditentukan, dalam urutan dokumen.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(String localName, String namespaceURI, SharedPtr<XPathNavigator> end)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| localName | String | Nama lokal elemen. |
| namespaceURI | String | URI namespace elemen. |
| end | SharedPtr\<XPathNavigator\> | Objek [XPathNavigator](../) yang diposisikan pada batas elemen yang tidak akan dilewati oleh [XPathNavigator](../) saat ini saat mencari elemen berikutnya. |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## Lihat Juga

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToFollowing(XPathNodeType) method


Memindahkan [XPathNavigator](../) ke elemen berikutnya dari [XPathNodeType](../../xpathnodetype/) yang ditentukan dalam urutan dokumen.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(XPathNodeType type)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| type | XPathNodeType | [XPathNodeType](../../xpathnodetype/) dari elemen. [XPathNodeType](../../xpathnodetype/) tidak dapat berupa [XPathNodeType::Attribute](../../xpathnodetype/) atau [XPathNodeType::Namespace](../../xpathnodetype/). |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## Lihat Juga

* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToFollowing(XPathNodeType, SharedPtr\<XPathNavigator\>) method


Memindahkan [XPathNavigator](../) ke elemen berikutnya dari [XPathNodeType](../../xpathnodetype/) yang ditentukan, ke batas yang ditentukan, dalam urutan dokumen.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(XPathNodeType type, SharedPtr<XPathNavigator> end)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| type | XPathNodeType | [XPathNodeType](../../xpathnodetype/) dari elemen. [XPathNodeType](../../xpathnodetype/) tidak dapat berupa [XPathNodeType::Attribute](../../xpathnodetype/) atau [XPathNodeType::Namespace](../../xpathnodetype/). |
| end | SharedPtr\<XPathNavigator\> | Objek [XPathNavigator](../) yang diposisikan pada batas elemen yang tidak akan dilewati oleh [XPathNavigator](../) saat ini saat mencari elemen berikutnya. |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## Lihat Juga

* Enum [XPathNodeType](../../xpathnodetype/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
