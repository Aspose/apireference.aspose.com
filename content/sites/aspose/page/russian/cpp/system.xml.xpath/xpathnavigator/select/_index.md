---
title: "System::Xml::XPath::XPathNavigator::Select метод"
linktitle: "Select"
second_title: "Aspose.Page для C++"
description: "System::Xml::XPath::XPathNavigator::Select метод. Выбирает набор узлов, используя указанное XPathExpression в C++."
type: docs
weight: 7100
url: /ru/cpp/system.xml.xpath/xpathnavigator/select/
---
## XPathNavigator::Select(SharedPtr\<XPathExpression\>) method


Выбирает набор узлов, используя указанное [XPathExpression](../../xpathexpression/).

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::Select(SharedPtr<XPathExpression> expr)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | Объект [XPathExpression](../../xpathexpression/), содержащий скомпилированный запрос [XPath](../../). |

### ReturnValue

Объект [XPathNodeIterator](../../xpathnodeiterator/), указывающий на выбранный набор узлов.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Select(String) method


Выбирает набор узлов, используя указанное выражение [XPath](../../).

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::Select(String xpath)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| xpath | String | Строка [String](../../../system/string/) представляющая выражение [XPath](../../). |

### ReturnValue

Объект [XPathNodeIterator](../../xpathnodeiterator/), указывающий на выбранный набор узлов.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Select(String, SharedPtr\<IXmlNamespaceResolver\>) method


Выбирает набор узлов, используя указанное выражение [XPath](../../) с объектом [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/), указанным для разрешения префиксов пространств имён.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::Select(String xpath, SharedPtr<IXmlNamespaceResolver> resolver)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| xpath | String | Строка [String](../../../system/string/) представляющая выражение [XPath](../../). |
| resolver | SharedPtr\<IXmlNamespaceResolver\> | Объект [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/), используемый для разрешения префиксов пространств имён. |

### ReturnValue

Объект [XPathNodeIterator](../../xpathnodeiterator/), указывающий на выбранный набор узлов.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
