---
title: "System::Xml::Xsl::IXsltContextVariable 类"
linktitle: "IXsltContextVariable"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::Xsl::IXsltContextVariable 类。提供在 C++ 运行时执行期间在样式表中定义的特定变量的接口。"
type: docs
weight: 200
url: /zh/cpp/system.xml.xsl/ixsltcontextvariable/
---
## IXsltContextVariable class


在运行时执行期间提供对在样式表中定义的特定变量的接口。

```cpp
class IXsltContextVariable : public virtual System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [Evaluate](./evaluate/)(SharedPtr\<XsltContext\>) | 在运行时求值变量，并返回一个表示该变量值的对象。 |
| virtual [get_IsLocal](./get_islocal/)() | 返回一个指示变量是否为局部的值。 |
| virtual [get_IsParam](./get_isparam/)() | 返回一个指示变量是否为可扩展样式表语言转换 (XSLT) 参数的值。这可以是样式表或模板的参数。 |
| virtual [get_VariableType](./get_variabletype/)() | 返回表示变量的 XML 路径语言 ([XPath](../../system.xml.xpath/)) 类型的 XPathResultType。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
