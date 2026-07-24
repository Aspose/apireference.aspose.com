---
title: "System::Xml::XPath::XPathNavigator::SelectSingleNode method"
linktitle: "SelectSingleNode"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XPath::XPathNavigator::SelectSingleNode method. Memilih satu node dalam XPathNavigator menggunakan objek XPathExpression yang ditentukan dalam C++."
type: docs
weight: 7500
url: /id/cpp/system.xml.xpath/xpathnavigator/selectsinglenode/
---
## XPathNavigator::SelectSingleNode(SharedPtr\<XPathExpression\>) method


Memilih satu node dalam [XPathNavigator](../) menggunakan objek [XPathExpression](../../xpathexpression/) yang ditentukan.

```cpp
virtual SharedPtr<XPathNavigator> System::Xml::XPath::XPathNavigator::SelectSingleNode(SharedPtr<XPathExpression> expression)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| expression | SharedPtr\<XPathExpression\> | Sebuah objek [XPathExpression](../../xpathexpression/) yang berisi kueri [XPath](../../) yang telah dikompilasi. |

### ReturnValue

Sebuah objek [XPathNavigator](../) yang berisi node pertama yang cocok untuk kueri [XPath](../../) yang ditentukan; jika tidak ada hasil kueri, **nullptr**.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectSingleNode(String) method


Memilih satu node dalam [XPathNavigator](../) menggunakan kueri [XPath](../../) yang ditentukan.

```cpp
virtual SharedPtr<XPathNavigator> System::Xml::XPath::XPathNavigator::SelectSingleNode(String xpath)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| xpath | String | Sebuah [String](../../../system/string/) yang mewakili ekspresi [XPath](../../). |

### ReturnValue

Sebuah objek [XPathNavigator](../) yang berisi node pertama yang cocok untuk kueri [XPath](../../) yang ditentukan; jika tidak ada hasil kueri, **nullptr**.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectSingleNode(String, SharedPtr\<IXmlNamespaceResolver\>) method


Memilih satu node dalam objek [XPathNavigator](../) menggunakan kueri [XPath](../../) yang ditentukan dengan objek [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) yang digunakan untuk menyelesaikan awalan ruang nama.

```cpp
virtual SharedPtr<XPathNavigator> System::Xml::XPath::XPathNavigator::SelectSingleNode(String xpath, SharedPtr<IXmlNamespaceResolver> resolver)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| xpath | String | Sebuah [String](../../../system/string/) yang mewakili ekspresi [XPath](../../). |
| resolver | SharedPtr\<IXmlNamespaceResolver\> | Objek [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) yang digunakan untuk menyelesaikan awalan ruang nama dalam kueri [XPath](../../). |

### ReturnValue

Sebuah objek [XPathNavigator](../) yang berisi node pertama yang cocok untuk kueri [XPath](../../) yang ditentukan; jika tidak ada hasil kueri, **nullptr**.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
