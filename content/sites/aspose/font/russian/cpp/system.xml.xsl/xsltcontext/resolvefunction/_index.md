---
title: "System::Xml::Xsl::XsltContext::ResolveFunction метод"
linktitle: "ResolveFunction"
second_title: "Aspose.Font для C++"
description: "System::Xml::Xsl::XsltContext::ResolveFunction метод. При переопределении в производном классе разрешает ссылку на функцию и возвращает IXsltContextFunction, представляющий функцию. IXsltContextFunction используется во время выполнения для получения возвращаемого значения функции в C++."
type: docs
weight: 400
url: /ru/cpp/system.xml.xsl/xsltcontext/resolvefunction/
---
## XsltContext::ResolveFunction method


При переопределении в производном классе разрешает ссылку на функцию и возвращает [IXsltContextFunction](../../ixsltcontextfunction/), представляющий функцию. [IXsltContextFunction](../../ixsltcontextfunction/) используется во время выполнения для получения возвращаемого значения функции.

```cpp
virtual SharedPtr<IXsltContextFunction> System::Xml::Xsl::XsltContext::ResolveFunction(String prefix, String name, ArrayPtr<System::Xml::XPath::XPathResultType> ArgTypes)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| prefix | String | Префикс функции, как он появляется в выражении [XPath](../../../system.xml.xpath/). |
| имя | String | Имя функции. |
| ArgTypes | ArrayPtr\<System::Xml::XPath::XPathResultType\> | Массив типов аргументов для разрешаемой функции. Это позволяет выбирать между методами с одинаковым именем (например, перегруженными методами). |

### ReturnValue

Объект [IXsltContextFunction](../../ixsltcontextfunction/), представляющий функцию.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXsltContextFunction](../../ixsltcontextfunction/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [XPathResultType](../../../system.xml.xpath/xpathresulttype/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
