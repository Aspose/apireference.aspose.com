---
title: "System::Xml::XPath::XPathNavigator::Matches method"
linktitle: "Совпадения"
second_title: "Aspose.Page для C++"
description: "System::Xml::XPath::XPathNavigator::Matches method. Определяет, соответствует ли текущий узел указанному XPathExpression в C++."
type: docs
weight: 4900
url: /ru/cpp/system.xml.xpath/xpathnavigator/matches/
---
## XPathNavigator::Matches(SharedPtr\<XPathExpression\>) method


Определяет, соответствует ли текущий узел указанному [XPathExpression](../../xpathexpression/).

```cpp
virtual bool System::Xml::XPath::XPathNavigator::Matches(SharedPtr<XPathExpression> expr)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | Объект [XPathExpression](../../xpathexpression/), содержащий скомпилированное выражение [XPath](../../). |

### ReturnValue

**true** if the current node matches the [XPathExpression](../../xpathexpression/); otherwise, **false**.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Matches(String) method


Определяет, соответствует ли текущий узел указанному выражению [XPath](../../).

```cpp
virtual bool System::Xml::XPath::XPathNavigator::Matches(String xpath)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| xpath | String | Выражение [XPath](../../). |

### ReturnValue

**true** if the current node matches the specified [XPath](../../) expression; otherwise, **false**.

## См. также

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
