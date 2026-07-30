---
title: "System::Xml::XPath::XPathNavigator::SelectSingleNode метод"
linktitle: "SelectSingleNode"
second_title: "Aspose.Font для C++"
description: "System::Xml::XPath::XPathNavigator::SelectSingleNode метод. Выбирает один узел в XPathNavigator, используя указанный объект XPathExpression в C++."
type: docs
weight: 7500
url: /ru/cpp/system.xml.xpath/xpathnavigator/selectsinglenode/
---
## XPathNavigator::SelectSingleNode(SharedPtr\<XPathExpression\>) method


Выбирает один узел в [XPathNavigator](../), используя указанный объект [XPathExpression](../../xpathexpression/).

```cpp
virtual SharedPtr<XPathNavigator> System::Xml::XPath::XPathNavigator::SelectSingleNode(SharedPtr<XPathExpression> expression)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| expression | SharedPtr\<XPathExpression\> | Объект [XPathExpression](../../xpathexpression/) содержащий скомпилированный запрос [XPath](../../). |

### ReturnValue

Объект [XPathNavigator](../), содержащий первый соответствующий узел для указанного запроса [XPath](../../); в противном случае **nullptr**, если результаты запроса отсутствуют.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::SelectSingleNode(String) method


Выбирает один узел в [XPathNavigator](../), используя указанный запрос [XPath](../../).

```cpp
virtual SharedPtr<XPathNavigator> System::Xml::XPath::XPathNavigator::SelectSingleNode(String xpath)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| xpath | String | Объект [String](../../../system/string/) представляющий выражение [XPath](../../). |

### ReturnValue

Объект [XPathNavigator](../), содержащий первый соответствующий узел для указанного запроса [XPath](../../); в противном случае **nullptr**, если результаты запроса отсутствуют.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::SelectSingleNode(String, SharedPtr\<IXmlNamespaceResolver\>) method


Выбирает один узел в объекте [XPathNavigator](../), используя указанный запрос [XPath](../../) с объектом [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) указанным для разрешения префиксов пространств имён.

```cpp
virtual SharedPtr<XPathNavigator> System::Xml::XPath::XPathNavigator::SelectSingleNode(String xpath, SharedPtr<IXmlNamespaceResolver> resolver)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| xpath | String | Объект [String](../../../system/string/) представляющий выражение [XPath](../../). |
| resolver | SharedPtr\<IXmlNamespaceResolver\> | Объект [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) используется для разрешения префиксов пространств имён в запросе [XPath](../../). |

### ReturnValue

Объект [XPathNavigator](../), содержащий первый соответствующий узел для указанного запроса [XPath](../../); в противном случае **nullptr**, если результаты запроса отсутствуют.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
