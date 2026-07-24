---
title: "System::Xml::XPath::XPathItem::ValueAs metode"
linktitle: "ValueAs"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XPath::XPathItem::ValueAs metode. Mengembalikan nilai item sebagai tipe yang ditentukan dalam C++."
type: docs
weight: 1100
url: /id/cpp/system.xml.xpath/xpathitem/valueas/
---
## XPathItem::ValueAs(const TypeInfo\&) method


Mengembalikan nilai item sebagai tipe yang ditentukan.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathItem::ValueAs(const TypeInfo &returnType)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| returnType | const TypeInfo\& | Tipe untuk mengembalikan nilai item. |

### ReturnValue

Nilai item sebagai tipe yang diminta.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XPathItem](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathItem::ValueAs(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) method


Saat dioverride dalam kelas turunan, mengembalikan nilai item sebagai tipe yang ditentukan menggunakan objek [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) yang ditetapkan untuk menyelesaikan prefiks namespace.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathItem::ValueAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> nsResolver)=0
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| returnType | const TypeInfo\& | Tipe untuk mengembalikan nilai item. |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) objek yang digunakan untuk menyelesaikan prefiks namespace. |

### ReturnValue

Nilai item sebagai tipe yang diminta.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathItem](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
