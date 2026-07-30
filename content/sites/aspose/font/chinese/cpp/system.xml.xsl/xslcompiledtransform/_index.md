---
title: "System::Xml::Xsl::XslCompiledTransform 类"
linktitle: "XslCompiledTransform"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Xsl::XslCompiledTransform 类。使用 XSLT 样式表在 C++ 中转换 XML 数据。"
type: docs
weight: 300
url: /zh/cpp/system.xml.xsl/xslcompiledtransform/
---
## XslCompiledTransform class


使用 XSLT 样式表转换 XML 数据。

```cpp
class XslCompiledTransform : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_OutputSettings](./get_outputsettings/)() | 返回一个 [XmlWriterSettings](../../system.xml/xmlwritersettings/) 对象，其中包含从样式表的 **xsl:output** 元素派生的输出信息。 |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&) | 编译包含在 [XmlReader](../../system.xml/xmlreader/) 中的样式表。 |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) | 编译包含在 [XmlReader](../../system.xml/xmlreader/) 中的 XSLT 样式表。 [XmlResolver](../../system.xml/xmlresolver/) 解析任何 XSLT **import** 或 **include** 元素，XSLT 设置决定样式表的权限。 |
| [Load](./load/)(const String\&) | 加载并编译位于指定 URI 的样式表。 |
| [Load](./load/)(const String\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) | 加载并编译由 URI 指定的 XSLT 样式表。 [XmlResolver](../../system.xml/xmlresolver/) 解析任何 XSLT **import** 或 **include** 元素，XSLT 设置决定样式表的权限。 |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) | 编译包含在 IXPathNavigable 对象中的样式表。 |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, SharedPtr\<XsltSettings\>, SharedPtr\<XmlResolver\>) | 编译包含在 IXPathNavigable 中的 XSLT 样式表。 [XmlResolver](../../system.xml/xmlresolver/) 解析任何 XSLT **import** 或 **include** 元素，XSLT 设置决定样式表的权限。 |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XmlWriter\>\&) | 使用 IXPathNavigable 对象指定的输入文档执行转换，并将结果输出到 [XmlWriter](../../system.xml/xmlwriter/)。 |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | 使用 IXPathNavigable 对象指定的输入文档执行转换，并将结果输出到 [XmlWriter](../../system.xml/xmlwriter/)。 [XsltArgumentList](../xsltargumentlist/) 提供额外的运行时参数。 |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | 使用 IXPathNavigable 对象指定的输入文档执行转换，并将结果输出到 TextWriter。 [XsltArgumentList](../xsltargumentlist/) 提供额外的运行时参数。 |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | 使用 IXPathNavigable 对象指定的输入文档执行转换，并将结果输出到流。 [XsltArgumentList](../xsltargumentlist/) 提供额外的运行时参数。 |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XmlWriter\>\&) | 使用 [XmlReader](../../system.xml/xmlreader/) 对象指定的输入文档执行转换，并将结果输出到 [XmlWriter](../../system.xml/xmlwriter/)。 |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | 使用 [XmlReader](../../system.xml/xmlreader/) 对象指定的输入文档执行转换，并将结果输出到 [XmlWriter](../../system.xml/xmlwriter/)。 [XsltArgumentList](../xsltargumentlist/) 提供额外的运行时参数。 |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | 使用 [XmlReader](../../system.xml/xmlreader/) 对象指定的输入文档执行转换，并将结果输出到 TextWriter。 [XsltArgumentList](../xsltargumentlist/) 提供额外的运行时参数。 |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | 使用 [XmlReader](../../system.xml/xmlreader/) 对象指定的输入文档执行转换，并将结果输出到流。 [XsltArgumentList](../xsltargumentlist/) 提供额外的运行时参数。 |
| [Transform](./transform/)(const String\&, const SharedPtr\<XmlWriter\>\&) | 使用由 URI 指定的输入文档执行转换，并将结果输出到 [XmlWriter](../../system.xml/xmlwriter/)。 |
| [Transform](./transform/)(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | 使用由 URI 指定的输入文档执行转换，并将结果输出到 [XmlWriter](../../system.xml/xmlwriter/)。 [XsltArgumentList](../xsltargumentlist/) 提供额外的运行时参数。 |
| [Transform](./transform/)(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | 使用由 URI 指定的输入文档执行转换，并将结果输出到 TextWriter。 |
| [Transform](./transform/)(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | 使用由 URI 指定的输入文档执行转换，并将结果输出到流。 [XsltArgumentList](../xsltargumentlist/) 提供额外的运行时参数。 |
| [Transform](./transform/)(const String\&, const String\&) | 使用由 URI 指定的输入文档执行转换，并将结果输出到文件。 |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) | 使用 [XmlReader](../../system.xml/xmlreader/) 对象指定的输入文档执行转换，并将结果输出到 [XmlWriter](../../system.xml/xmlwriter/)。 [XsltArgumentList](../xsltargumentlist/) 提供额外的运行时参数，且 [XmlResolver](../../system.xml/xmlresolver/) 解析 XSLT **document()** 函数。 |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) | 使用 IXPathNavigable 对象指定的输入文档执行转换，并将结果输出到 [XmlWriter](../../system.xml/xmlwriter/)。 [XsltArgumentList](../xsltargumentlist/) 提供额外的运行时参数，且 [XmlResolver](../../system.xml/xmlresolver/) 解析 XSLT **document()** 函数。 |
| [XslCompiledTransform](./xslcompiledtransform/)() | 初始化 [XslCompiledTransform](./) 类的新实例。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Font for C++](../../)
