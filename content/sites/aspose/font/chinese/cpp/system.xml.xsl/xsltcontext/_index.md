---
title: "System::Xml::Xsl::XsltContext 类"
linktitle: "XsltContext"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Xsl::XsltContext 类。封装了可扩展样式表语言转换 (XSLT) 处理器的当前执行上下文，允许 XML 路径语言 (XPath) 在 C++ 中解析 XPath 表达式中的函数、参数和命名空间。"
type: docs
weight: 500
url: /zh/cpp/system.xml.xsl/xsltcontext/
---
## XsltContext class


封装了可扩展样式表语言转换 (XSLT) 处理器的当前执行上下文，允许 XML 路径语言（[XPath](../../system.xml.xpath/)）在 [XPath](../../system.xml.xpath/) 表达式中解析函数、参数和命名空间。

```cpp
class XsltContext : public System::Xml::XmlNamespaceManager
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [CompareDocument](./comparedocument/)(String, String) | 在派生类中重写时，比较两个文档的基础统一资源标识符 (URI)，比较依据是文档被 XSLT 处理器加载的顺序（即 [XslTransform](../xsltransform/) 类）。 |
| virtual [get_Whitespace](./get_whitespace/)() | 在派生类中重写时，获取一个值，指示是否在输出中包含空白节点。 |
| virtual [PreserveWhitespace](./preservewhitespace/)(SharedPtr\<System::Xml::XPath::XPathNavigator\>) | 在派生类中重写时，评估在给定上下文中是保留空白节点还是剥除它们。 |
| virtual [ResolveFunction](./resolvefunction/)(String, String, ArrayPtr\<System::Xml::XPath::XPathResultType\>) | 在派生类中重写时，解析函数引用并返回表示该函数的 [IXsltContextFunction](../ixsltcontextfunction/)。在执行时使用 [IXsltContextFunction](../ixsltcontextfunction/) 来获取函数的返回值。 |
| virtual [ResolveVariable](./resolvevariable/)(String, String) | 在派生类中重写时，解析变量引用并返回表示该变量的 [IXsltContextVariable](../ixsltcontextvariable/)。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 另见

* Class [XmlNamespaceManager](../../system.xml/xmlnamespacemanager/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Font for C++](../../)
