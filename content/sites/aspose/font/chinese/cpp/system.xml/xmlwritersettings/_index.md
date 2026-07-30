---
title: "System::Xml::XmlWriterSettings 类"
linktitle: "XmlWriterSettings"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlWriterSettings 类。指定在 C++ 中由 XmlWriter::Create 方法创建的 XmlWriter 对象上支持的一组功能。"
type: docs
weight: 4500
url: /zh/cpp/system.xml/xmlwritersettings/
---
## XmlWriterSettings class


指定在由 [XmlWriter](../xmlwriter/) 对象创建的 [XmlWriter::Create](../xmlwriter/create/) 方法上支持的一组功能。

```cpp
class XmlWriterSettings : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Clone](./clone/)() | 创建 [XmlWriterSettings](./) 实例的副本。 |
| [get_CheckCharacters](./get_checkcharacters/)() | 返回一个值，指示 XML 写入器是否应检查以确保文档中的所有字符符合 W3C [XML 1.0 Recommendation](https://www.w3.org/TR/REC-xml/#charsets) 中的 "2.2 Characters" 部分。 |
| [get_CloseOutput](./get_closeoutput/)() | 返回一个值，指示在调用 [XmlWriter::Close](../xmlwriter/close/) 方法时，[XmlWriter](../xmlwriter/) 是否还应关闭底层流或 TextWriter。 |
| [get_ConformanceLevel](./get_conformancelevel/)() | 返回 XML 写入器检查 XML 输出的符合程度级别。 |
| [get_DoNotEscapeUriAttributes](./get_donotescapeuriattributes/)() | 返回一个值，指示 [XmlWriter](../xmlwriter/) 是否不转义 URI 属性。 |
| [get_Encoding](./get_encoding/)() | 返回要使用的文本编码类型。 |
| [get_Indent](./get_indent/)() | 返回一个值，指示是否对元素进行缩进。 |
| [get_IndentChars](./get_indentchars/)() | 返回缩进时使用的字符字符串。当 [XmlWriterSettings::set_Indent](./set_indent/) 的值设置为 **true** 时使用此设置。 |
| [get_NamespaceHandling](./get_namespacehandling/)() | 返回一个值，指示在写入 XML 内容时，[XmlWriter](../xmlwriter/) 是否应删除重复的命名空间声明。默认行为是写入器输出写入器的命名空间解析器中存在的所有命名空间声明。 |
| [get_NewLineChars](./get_newlinechars/)() | 返回用于换行的字符字符串。 |
| [get_NewLineHandling](./get_newlinehandling/)() | 返回一个值，指示是否在输出中规范化换行符。 |
| [get_NewLineOnAttributes](./get_newlineonattributes/)() | 返回一个值，指示是否在新行上写属性。 |
| [get_OmitXmlDeclaration](./get_omitxmldeclaration/)() | 返回一个值，指示是否省略 XML 声明。 |
| [get_OutputMethod](./get_outputmethod/)() | 返回用于序列化 [XmlWriter](../xmlwriter/) 输出的方法。 |
| [get_WriteEndDocumentOnClose](./get_writeenddocumentonclose/)() | 返回一个值，指示在调用 [XmlWriter::Close](../xmlwriter/close/) 方法时，[XmlWriter](../xmlwriter/) 是否会为所有未闭合的元素标签添加结束标签。 |
| [Reset](./reset/)() | 将设置类的成员重置为默认值。 |
| [set_CheckCharacters](./set_checkcharacters/)(bool) | 设置一个值，指示 XML 写入器是否应检查文档中的所有字符是否符合 W3C [XML 1.0 Recommendation](https://www.w3.org/TR/REC-xml/#charsets) 中的 “2.2 Characters” 部分。 |
| [set_CloseOutput](./set_closeoutput/)(bool) | 设置一个值，指示在调用 [XmlWriter::Close](../xmlwriter/close/) 方法时，[XmlWriter](../xmlwriter/) 是否还应关闭底层的流或 TextWriter。 |
| [set_ConformanceLevel](./set_conformancelevel/)(System::Xml::ConformanceLevel) | 设置 XML 写入器检查 XML 输出的符合程度级别。 |
| [set_DoNotEscapeUriAttributes](./set_donotescapeuriattributes/)(bool) | 设置一个值，指示 [XmlWriter](../xmlwriter/) 是否不转义 URI 属性。 |
| [set_Encoding](./set_encoding/)(const SharedPtr\<System::Text::Encoding\>\&) | 设置要使用的文本编码类型。 |
| [set_Indent](./set_indent/)(bool) | 设置一个值，指示是否对元素进行缩进。 |
| [set_IndentChars](./set_indentchars/)(const String\&) | 设置缩进时使用的字符字符串。当 [XmlWriterSettings::set_Indent](./set_indent/) 的值设置为 **true** 时使用此设置。 |
| [set_NamespaceHandling](./set_namespacehandling/)(System::Xml::NamespaceHandling) | 设置一个值，指示在写入 XML 内容时，[XmlWriter](../xmlwriter/) 是否应删除重复的命名空间声明。默认行为是写入器输出写入器的命名空间解析器中存在的所有命名空间声明。 |
| [set_NewLineChars](./set_newlinechars/)(const String\&) | 设置用于换行的字符字符串。 |
| [set_NewLineHandling](./set_newlinehandling/)(System::Xml::NewLineHandling) | 设置一个值，指示是否对输出中的换行进行标准化。 |
| [set_NewLineOnAttributes](./set_newlineonattributes/)(bool) | 设置一个值，指示是否在新行上写属性。 |
| [set_OmitXmlDeclaration](./set_omitxmldeclaration/)(bool) | 设置一个值，指示是否省略 XML 声明。 |
| [set_WriteEndDocumentOnClose](./set_writeenddocumentonclose/)(bool) | 设置一个值，指示在调用 [XmlWriter::Close](../xmlwriter/close/) 方法时，[XmlWriter](../xmlwriter/) 是否会为所有未闭合的元素标签添加结束标签。 |
| [XmlWriterSettings](./xmlwritersettings/)() | 初始化 [XmlWriterSettings](./) 类的新实例。 |
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
