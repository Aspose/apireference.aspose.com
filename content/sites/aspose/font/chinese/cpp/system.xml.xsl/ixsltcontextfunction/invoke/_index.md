---
title: "System::Xml::Xsl::IXsltContextFunction::Invoke 方法"
linktitle: "Invoke"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Xsl::IXsltContextFunction::Invoke 方法。提供在 C++ 中使用给定上下文和参数调用函数的方法。"
type: docs
weight: 500
url: /zh/cpp/system.xml.xsl/ixsltcontextfunction/invoke/
---
## IXsltContextFunction::Invoke method


提供在给定上下文中使用给定参数调用函数的方法。

```cpp
virtual SharedPtr<Object> System::Xml::Xsl::IXsltContextFunction::Invoke(SharedPtr<XsltContext> xsltContext, ArrayPtr<SharedPtr<Object>> args, SharedPtr<System::Xml::XPath::XPathNavigator> docContext)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| xsltContext | SharedPtr\<XsltContext\> | 函数调用的 XSLT 上下文。 |
| args | ArrayPtr\<SharedPtr\<Object\>\> | 函数调用的参数。每个参数都是数组中的一个元素。 |
| docContext | SharedPtr\<System::Xml::XPath::XPathNavigator\> | 函数调用的上下文节点。 |

### ReturnValue

一个表示函数返回值的[Object](../../../system/object/)。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XsltContext](../../xsltcontext/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [IXsltContextFunction](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
