---
title: "System::Xml::Xsl::IXsltContextVariable::Evaluate 方法"
linktitle: "Evaluate"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::Xsl::IXsltContextVariable::Evaluate 方法。运行时评估该变量并返回一个表示该变量值的对象，在 C++ 中。"
type: docs
weight: 100
url: /zh/cpp/system.xml.xsl/ixsltcontextvariable/evaluate/
---
## IXsltContextVariable::Evaluate method


在运行时求值变量，并返回一个表示该变量值的对象。

```cpp
virtual SharedPtr<Object> System::Xml::Xsl::IXsltContextVariable::Evaluate(SharedPtr<XsltContext> xsltContext)=0
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| xsltContext | SharedPtr\<XsltContext\> | 一个表示该变量执行上下文的 [XsltContext](../../xsltcontext/)。 |

### ReturnValue

一个表示该变量值的 [Object](../../../system/object/)。可能的返回类型包括数字、字符串、[Boolean](../../../system/boolean/)、文档片段或节点集。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XsltContext](../../xsltcontext/)
* Class [IXsltContextVariable](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
