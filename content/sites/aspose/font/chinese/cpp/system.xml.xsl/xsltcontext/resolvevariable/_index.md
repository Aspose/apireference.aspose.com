---
title: "System::Xml::Xsl::XsltContext::ResolveVariable 方法"
linktitle: "ResolveVariable"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Xsl::XsltContext::ResolveVariable 方法。当在派生类中被重写时，解析变量引用并返回在 C++ 中表示该变量的 IXsltContextVariable。"
type: docs
weight: 500
url: /zh/cpp/system.xml.xsl/xsltcontext/resolvevariable/
---
## XsltContext::ResolveVariable method


当在派生类中被重写时，解析变量引用并返回一个表示该变量的 [IXsltContextVariable](../../ixsltcontextvariable/)。

```cpp
virtual SharedPtr<IXsltContextVariable> System::Xml::Xsl::XsltContext::ResolveVariable(String prefix, String name)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| prefix | String | 变量在 [XPath](../../../system.xml.xpath/) 表达式中出现的前缀。 |
| 名称 | String | 变量的名称。 |

### ReturnValue

在运行时表示该变量的[IXsltContextVariable](../../ixsltcontextvariable/)。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXsltContextVariable](../../ixsltcontextvariable/)
* Class [String](../../../system/string/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
