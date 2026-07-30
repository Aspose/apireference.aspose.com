---
title: "System::Xml::Xsl::XsltContext::ResolveFunction 方法"
linktitle: "ResolveFunction"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Xsl::XsltContext::ResolveFunction 方法。若在派生类中被重写，则解析函数引用并返回表示该函数的 IXsltContextFunction。IXsltContextFunction 在执行时用于获取函数的返回值（C++）。"
type: docs
weight: 400
url: /zh/cpp/system.xml.xsl/xsltcontext/resolvefunction/
---
## XsltContext::ResolveFunction method


当在派生类中被重写时，解析函数引用并返回一个表示该函数的 [IXsltContextFunction](../../ixsltcontextfunction/)。该 [IXsltContextFunction](../../ixsltcontextfunction/) 在执行时用于获取函数的返回值。

```cpp
virtual SharedPtr<IXsltContextFunction> System::Xml::Xsl::XsltContext::ResolveFunction(String prefix, String name, ArrayPtr<System::Xml::XPath::XPathResultType> ArgTypes)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| prefix | String | 函数在 [XPath](../../../system.xml.xpath/) 表达式中出现的前缀。 |
| 名称 | String | 函数的名称。 |
| ArgTypes | ArrayPtr\<System::Xml::XPath::XPathResultType\> | 一个用于解析函数的参数类型数组。这使您可以在具有相同名称的方法之间进行选择（例如，重载方法）。 |

### ReturnValue

一个表示该函数的 [IXsltContextFunction](../../ixsltcontextfunction/)。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXsltContextFunction](../../ixsltcontextfunction/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [XPathResultType](../../../system.xml.xpath/xpathresulttype/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
