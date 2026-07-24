---
title: "System::Xml::XPath::XPathNavigator::ValueAs metode"
linktitle: "ValueAs"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XPath::XPathNavigator::ValueAs metode. Mengembalikan nilai node saat ini sebagai Tipe yang ditentukan, menggunakan objek IXmlNamespaceResolver yang ditentukan untuk menyelesaikan awalan ruang nama dalam C++."
type: docs
weight: 8100
url: /id/cpp/system.xml.xpath/xpathnavigator/valueas/
---
## XPathNavigator::ValueAs method


Mengembalikan nilai node saat ini sebagai Tipe yang ditentukan, menggunakan objek [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) yang ditentukan untuk menyelesaikan awalan ruang nama.

```cpp
SharedPtr<Object> System::Xml::XPath::XPathNavigator::ValueAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> nsResolver) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| returnType | const TypeInfo\& | Tipe untuk mengembalikan nilai node saat ini sebagai. |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) objek yang digunakan untuk menyelesaikan prefiks namespace. |

### ReturnValue

Nilai node saat ini sebagai Tipe yang diminta.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
