---
title: "System::Xml::XmlParserContext 类"
linktitle: "XmlParserContext"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlParserContext 类。提供 XmlReader 在 C++ 中解析 XML 片段所需的所有上下文信息。"
type: docs
weight: 3000
url: /zh/cpp/system.xml/xmlparsercontext/
---
## XmlParserContext class


提供 [XmlReader](../xmlreader/) 解析 XML 片段所需的所有上下文信息。

```cpp
class XmlParserContext : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_BaseURI](./get_baseuri/)() | 返回基础 URI。 |
| [get_DocTypeName](./get_doctypename/)() | 返回文档类型声明的名称。 |
| [get_Encoding](./get_encoding/)() | 返回编码类型。 |
| [get_InternalSubset](./get_internalsubset/)() | 返回内部 DTD 子集。 |
| [get_NamespaceManager](./get_namespacemanager/)() | 返回 [XmlNamespaceManager](../xmlnamespacemanager/)。 |
| [get_NameTable](./get_nametable/)() | 返回用于原子化字符串的 [XmlNameTable](../xmlnametable/)。有关原子化字符串的更多信息，请参阅 [XmlNameTable](../xmlnametable/)。 |
| [get_PublicId](./get_publicid/)() | 返回公共标识符。 |
| [get_SystemId](./get_systemid/)() | 返回系统标识符。 |
| [get_XmlLang](./get_xmllang/)() | 返回当前的 **xml:lang** 范围。 |
| [get_XmlSpace](./get_xmlspace/)() | 返回当前 **xml:space** 范围。 |
| [set_BaseURI](./set_baseuri/)(const String\&) | 设置基础 URI。 |
| [set_DocTypeName](./set_doctypename/)(const String\&) | 设置文档类型声明的名称。 |
| [set_Encoding](./set_encoding/)(const SharedPtr\<System::Text::Encoding\>\&) | 设置编码类型。 |
| [set_InternalSubset](./set_internalsubset/)(const String\&) | 设置内部 DTD 子集。 |
| [set_NamespaceManager](./set_namespacemanager/)(const SharedPtr\<XmlNamespaceManager\>\&) | 设置 [XmlNamespaceManager](../xmlnamespacemanager/)。 |
| [set_NameTable](./set_nametable/)(const SharedPtr\<XmlNameTable\>\&) | 设置用于原子化字符串的 [XmlNameTable](../xmlnametable/)。有关原子化字符串的更多信息，请参阅 [XmlNameTable](../xmlnametable/)。 |
| [set_PublicId](./set_publicid/)(const String\&) | 设置公共标识符。 |
| [set_SystemId](./set_systemid/)(const String\&) | 设置系统标识符。 |
| [set_XmlLang](./set_xmllang/)(const String\&) | 设置当前 **xml:lang** 范围。 |
| [set_XmlSpace](./set_xmlspace/)(System::Xml::XmlSpace) | 设置当前 **xml:space** 范围。 |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace) | 使用指定的 [XmlNameTable](../xmlnametable/)、[XmlNamespaceManager](../xmlnamespacemanager/)、**xml:lang** 和 **xml:space** 值初始化 [XmlParserContext](./) 类的新实例。 |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) | 使用指定的 [XmlNameTable](../xmlnametable/)、[XmlNamespaceManager](../xmlnamespacemanager/)、**xml:lang**、**xml:space** 和编码初始化 [XmlParserContext](./) 类的新实例。 |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace) | 使用指定的 [XmlNameTable](../xmlnametable/)、[XmlNamespaceManager](../xmlnamespacemanager/)、基础 URI、**xml:lang**、**xml:space** 和文档类型值初始化 [XmlParserContext](./) 类的新实例。 |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) | 使用指定的 [XmlNameTable](../xmlnametable/)、[XmlNamespaceManager](../xmlnamespacemanager/)、基础 URI、**xml:lang**、**xml:space**、编码和文档类型值初始化 [XmlParserContext](./) 类的新实例。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
