---
title: "System::Xml::XPath::XPathNavigator::Select метод"
linktitle: "Выбрать"
second_title: "Aspose.Font для C++"
description: "System::Xml::XPath::XPathNavigator::Select метод. Выбирает набор узлов, используя указанный XPathExpression в C++."
type: docs
weight: 7100
url: /ru/cpp/system.xml.xpath/xpathnavigator/select/
---
## XPathNavigator::Select(SharedPtr\<XPathExpression\>) method


Выбирает набор узлов, используя указанный [XPathExpression](../../xpathexpression/).

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::Select(SharedPtr<XPathExpression> expr)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | Объект [XPathExpression](../../xpathexpression/) содержащий скомпилированный запрос [XPath](../../). |

### ReturnValue

Объект [XPathNodeIterator](../../xpathnodeiterator/) указывает на выбранный набор узлов.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::Select(String) method


Выбирает набор узлов, используя указанное выражение [XPath](../../).

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::Select(String xpath)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| xpath | String | Объект [String](../../../system/string/) представляющий выражение [XPath](../../). |

### ReturnValue

Объект [XPathNodeIterator](../../xpathnodeiterator/) указывает на выбранный набор узлов.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::Select(String, SharedPtr\<IXmlNamespaceResolver\>) method


Выбирает набор узлов, используя указанное выражение [XPath](../../) с объектом [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/), указанным для разрешения префиксов пространств имён.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::Select(String xpath, SharedPtr<IXmlNamespaceResolver> resolver)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| xpath | String | Объект [String](../../../system/string/) представляющий выражение [XPath](../../). |
| resolver | SharedPtr\<IXmlNamespaceResolver\> | Объект [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/), используемый для разрешения префиксов пространств имен. |

### ReturnValue

Объект [XPathNodeIterator](../../xpathnodeiterator/) указывает на выбранный набор узлов.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
