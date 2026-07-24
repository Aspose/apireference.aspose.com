---
title: "System::Xml::Xsl::XsltContext::ResolveVariable 方法"
linktitle: "ResolveVariable"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::Xsl::XsltContext::ResolveVariable 方法。当在派生类中被重写时，解析变量引用并返回一个表示该变量的 IXsltContextVariable，在 C++ 中。"
type: docs
weight: 500
url: /zh/cpp/system.xml.xsl/xsltcontext/resolvevariable/
---
## XsltContext::ResolveVariable method


当在派生类中被重写时，解析变量引用并返回一个表示该变量的 [IXsltContextVariable](../../ixsltcontextvariable/)。

```cpp
virtual SharedPtr<IXsltContextVariable> System::Xml::Xsl::XsltContext::ResolveVariable(String prefix, String name)=0
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| prefix | String | 变量在 [XPath](../../../system.xml.xpath/) 表达式中出现的前缀。 |
| name | 字符串 | 变量的名称。 |

### ReturnValue

在运行时表示该变量的 [IXsltContextVariable](../../ixsltcontextvariable/)。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXsltContextVariable](../../ixsltcontextvariable/)
* Class [String](../../../system/string/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
