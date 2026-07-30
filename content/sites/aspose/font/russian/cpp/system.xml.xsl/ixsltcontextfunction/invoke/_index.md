---
title: "System::Xml::Xsl::IXsltContextFunction::Invoke метод"
linktitle: "Invoke"
second_title: "Aspose.Font для C++"
description: "System::Xml::Xsl::IXsltContextFunction::Invoke метод. Предоставляет способ вызова функции с заданными аргументами в указанном контексте в C++."
type: docs
weight: 500
url: /ru/cpp/system.xml.xsl/ixsltcontextfunction/invoke/
---
## IXsltContextFunction::Invoke method


Предоставляет метод для вызова функции с заданными аргументами в указанном контексте.

```cpp
virtual SharedPtr<Object> System::Xml::Xsl::IXsltContextFunction::Invoke(SharedPtr<XsltContext> xsltContext, ArrayPtr<SharedPtr<Object>> args, SharedPtr<System::Xml::XPath::XPathNavigator> docContext)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| xsltContext | SharedPtr\<XsltContext\> | Контекст XSLT для вызова функции. |
| args | ArrayPtr\<SharedPtr\<Object\>\> | Аргументы вызова функции. Каждый аргумент является элементом массива. |
| docContext | SharedPtr\<System::Xml::XPath::XPathNavigator\> | Контекстный узел вызова функции. |

### ReturnValue

Объект [Object](../../../system/object/), представляющий возвращаемое значение функции.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XsltContext](../../xsltcontext/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [IXsltContextFunction](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
