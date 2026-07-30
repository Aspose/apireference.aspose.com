---
title: "System::Xml::XPath::XPathNavigator::Evaluate метод"
linktitle: "Evaluate"
second_title: "Aspose.Font для C++"
description: "System::Xml::XPath::XPathNavigator::Evaluate метод. Выполняет оценку XPathExpression и возвращает типизированный результат в C++."
type: docs
weight: 1200
url: /ru/cpp/system.xml.xpath/xpathnavigator/evaluate/
---
## XPathNavigator::Evaluate(SharedPtr\<XPathExpression\>) method


Выполняет оценку [XPathExpression](../../xpathexpression/) и возвращает типизированный результат.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(SharedPtr<XPathExpression> expr)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | Объект [XPathExpression](../../xpathexpression/), который можно оценить. |

### ReturnValue

Результат выражения ([Boolean](../../../system/boolean/), число, строка или набор узлов). Это соответствует объектам [Boolean](../../../system/boolean/), [Double](../../../system/double/), [String](../../../system/string/) или [XPathNodeIterator](../../xpathnodeiterator/) соответственно.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::Evaluate(SharedPtr\<XPathExpression\>, SharedPtr\<XPathNodeIterator\>) method


Использует предоставленный контекст для оценки [XPathExpression](../../xpathexpression/) и возвращает типизированный результат.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(SharedPtr<XPathExpression> expr, SharedPtr<XPathNodeIterator> context)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | Объект [XPathExpression](../../xpathexpression/), который можно оценить. |
| context | SharedPtr\<XPathNodeIterator\> | Объект [XPathNodeIterator](../../xpathnodeiterator/), указывающий на выбранный набор узлов, над которым будет выполнена оценка. |

### ReturnValue

Результат выражения ([Boolean](../../../system/boolean/), число, строка или набор узлов). Это соответствует объектам [Boolean](../../../system/boolean/), [Double](../../../system/double/), [String](../../../system/string/) или [XPathNodeIterator](../../xpathnodeiterator/) соответственно.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::Evaluate(String) method


Выполняет оценку указанного выражения [XPath](../../) и возвращает типизированный результат.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(String xpath)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| xpath | String | Строка, представляющая выражение [XPath](../../), которое можно оценить. |

### ReturnValue

Результат выражения ([Boolean](../../../system/boolean/), число, строка или набор узлов). Это соответствует объектам [Boolean](../../../system/boolean/), [Double](../../../system/double/), [String](../../../system/string/) или [XPathNodeIterator](../../xpathnodeiterator/) соответственно.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::Evaluate(String, SharedPtr\<IXmlNamespaceResolver\>) method


Выполняет оценку указанного выражения [XPath](../../) и возвращает типизированный результат, используя объект [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/), указанный для разрешения префиксов пространств имён в выражении [XPath](../../).

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(String xpath, SharedPtr<IXmlNamespaceResolver> resolver)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| xpath | String | Строка, представляющая выражение [XPath](../../), которое можно оценить. |
| resolver | SharedPtr\<IXmlNamespaceResolver\> | Объект [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/), используемый для разрешения префиксов пространств имён в выражении [XPath](../../). |

### ReturnValue

Результат выражения ([Boolean](../../../system/boolean/), число, строка или набор узлов). Это соответствует объектам [Boolean](../../../system/boolean/), [Double](../../../system/double/), [String](../../../system/string/) или [XPathNodeIterator](../../xpathnodeiterator/) соответственно.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
