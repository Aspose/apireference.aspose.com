---
title: "System::Xml::XPath::XPathNavigator::Select method"
linktitle: "Select"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XPath::XPathNavigator::Select method. Memilih sekumpulan node menggunakan XPathExpression yang ditentukan dalam C++."
type: docs
weight: 7100
url: /id/cpp/system.xml.xpath/xpathnavigator/select/
---
## XPathNavigator::Select(SharedPtr\<XPathExpression\>) method


Memilih sekumpulan node menggunakan [XPathExpression](../../xpathexpression/) yang ditentukan.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::Select(SharedPtr<XPathExpression> expr)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | Sebuah objek [XPathExpression](../../xpathexpression/) yang berisi kueri [XPath](../../) yang telah dikompilasi. |

### ReturnValue

Sebuah [XPathNodeIterator](../../xpathnodeiterator/) yang menunjuk ke sekumpulan node yang dipilih.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Select(String) method


Memilih sekumpulan node, menggunakan ekspresi [XPath](../../) yang ditentukan.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::Select(String xpath)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| xpath | String | Sebuah [String](../../../system/string/) yang mewakili ekspresi [XPath](../../). |

### ReturnValue

Sebuah [XPathNodeIterator](../../xpathnodeiterator/) yang menunjuk ke sekumpulan node yang dipilih.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Select(String, SharedPtr\<IXmlNamespaceResolver\>) method


Memilih sekumpulan node menggunakan ekspresi [XPath](../../) yang ditentukan dengan objek [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) yang ditentukan untuk menyelesaikan prefiks namespace.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::Select(String xpath, SharedPtr<IXmlNamespaceResolver> resolver)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| xpath | String | Sebuah [String](../../../system/string/) yang mewakili ekspresi [XPath](../../). |
| resolver | SharedPtr\<IXmlNamespaceResolver\> | [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) objek yang digunakan untuk menyelesaikan prefiks namespace. |

### ReturnValue

Sebuah [XPathNodeIterator](../../xpathnodeiterator/) yang menunjuk ke sekumpulan node yang dipilih.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
