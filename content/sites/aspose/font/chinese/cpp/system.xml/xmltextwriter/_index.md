---
title: "System::Xml::XmlTextWriter 类"
linktitle: "XmlTextWriter"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlTextWriter 类。表示一种写入器，提供快速、非缓存、前向唯一的方式来生成符合 W3C 可扩展标记语言 (XML) 1.0 以及 XML 命名空间建议的 XML 数据流或文件（在 C++ 中）。"
type: docs
weight: 4000
url: /zh/cpp/system.xml/xmltextwriter/
---
## XmlTextWriter class


表示一个写入器，以快速、非缓存、仅向前的方式生成符合 W3C 可扩展标记语言 (XML) 1.0 和 XML 命名空间推荐的包含 XML 数据的流或文件。

```cpp
class XmlTextWriter : public System::Xml::XmlWriter
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Close](./close/)() override | 关闭此流以及底层流。 |
| [Flush](./flush/)() override | 将缓冲区中的内容刷新到底层流，并同时刷新底层流。 |
| [get_BaseStream](./get_basestream/)() | 返回底层流对象。 |
| [get_Formatting](./get_formatting/)() | 指示输出的格式方式。 |
| [get_Indentation](./get_indentation/)() | 返回在层次结构的每个级别要写入的 IndentChars 数量，当 [XmlTextWriter::set_Formatting](./set_formatting/) 设置为 [Formatting::Indented](../formatting/) 时。 |
| [get_IndentChar](./get_indentchar/)() | 返回在层次结构缩进时使用的字符，当 [XmlTextWriter::set_Formatting](./set_formatting/) 设置为 [Formatting::Indented](../formatting/) 时。 |
| [get_Namespaces](./get_namespaces/)() | 返回一个值，指示是否启用命名空间支持。 |
| [get_QuoteChar](./get_quotechar/)() | 返回用于引用属性值的字符。 |
| [get_WriteState](./get_writestate/)() override | 返回写入器的状态。 |
| [get_XmlLang](./get_xmllang/)() override | 返回当前的 **xml:lang** 范围。 |
| [get_XmlSpace](./get_xmlspace/)() override | 返回一个表示当前 **xml:space** 范围的 [XmlSpace](../xmlspace/)。 |
| [LookupPrefix](./lookupprefix/)(String) override | 返回在当前命名空间范围内为该命名空间 URI 定义的最近前缀。 |
| [set_Formatting](./set_formatting/)(System::Xml::Formatting) | 指示输出的格式方式。 |
| [set_Indentation](./set_indentation/)(int32_t) | 设置在层次结构的每个级别要写入的 IndentChars 数量，当 [XmlTextWriter::set_Formatting](./set_formatting/) 设置为 [Formatting::Indented](../formatting/) 时。 |
| [set_IndentChar](./set_indentchar/)(char16_t) | 设置在层次结构缩进时使用的字符，当 [XmlTextWriter::set_Formatting](./set_formatting/) 设置为 [Formatting::Indented](../formatting/) 时。 |
| [set_Namespaces](./set_namespaces/)(bool) | 设置一个值，指示是否启用命名空间支持。 |
| [set_QuoteChar](./set_quotechar/)(char16_t) | 设置用于引用属性值的字符。 |
| [WriteBase64](./writebase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | 将指定的二进制字节编码为 base64 并写出生成的文本。 |
| [WriteBinHex](./writebinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | 将指定的二进制字节编码为 binhex 并写出生成的文本。 |
| [WriteCData](./writecdata/)(String) override | 写出包含指定文本的 **...** 块。 |
| [WriteCharEntity](./writecharentity/)(char16_t) override | 强制为指定的 Unicode 字符值生成字符实体。 |
| [WriteChars](./writechars/)(ArrayPtr\<char16_t\>, int32_t, int32_t) override | 一次写入一个缓冲区的文本。 |
| [WriteComment](./writecomment/)(String) override | 写出包含指定文本的注释 ****。 |
| [WriteDocType](./writedoctype/)(const String\&, const String\&, const String\&, const String\&) override | 使用指定的名称和可选属性写出 DOCTYPE 声明。 |
| [WriteEndAttribute](./writeendattribute/)() override | 关闭先前的 [XmlTextWriter::WriteStartAttribute](./writestartattribute/) 调用。 |
| [WriteEndDocument](./writeenddocument/)() override | 关闭所有打开的元素或属性，并将写入器恢复到 Start 状态。 |
| [WriteEndElement](./writeendelement/)() override | 关闭一个元素并弹出相应的命名空间范围。 |
| [WriteEntityRef](./writeentityref/)(const String\&) override | 将实体引用写为 **&name**;。 |
| [WriteFullEndElement](./writefullendelement/)() override | 关闭一个元素并弹出相应的命名空间范围。 |
| [WriteName](./writename/)(const String\&) override | 写出指定的名称，确保它符合 [W3C XML 1.0 recommendation](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name) 的有效名称规则。 |
| [WriteNmToken](./writenmtoken/)(const String\&) override | 写出指定的名称，确保它是符合 [W3C XML 1.0 recommendation](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name) 的有效 **NmToken**。 |
| [WriteProcessingInstruction](./writeprocessinginstruction/)(String, String) override | 写出一条处理指令，在名称和文本之间留有空格，如下所示： **<?name text?>**。 |
| [WriteQualifiedName](./writequalifiedname/)(const String\&, const String\&) override | 写出带命名空间限定的名称。此方法查找给定命名空间范围内的前缀。 |
| [WriteRaw](./writeraw/)(ArrayPtr\<char16_t\>, int32_t, int32_t) override | 从字符缓冲区手动写入原始标记。 |
| [WriteRaw](./writeraw/)(const String\&) override | 从字符串手动写入原始标记。 |
| [WriteStartAttribute](./writestartattribute/)(const String\&, const String\&, const String\&) override | 写入属性的起始部分。 |
| [WriteStartDocument](./writestartdocument/)() override | 写入版本为 \"1.0\" 的 XML 声明。 |
| [WriteStartDocument](./writestartdocument/)(bool) override | 写入版本为 \"1.0\" 且包含 standalone 属性的 XML 声明。 |
| [WriteStartElement](./writestartelement/)(const String\&, const String\&, const String\&) override | 写入指定的起始标签，并将其与给定的命名空间和前缀关联。 |
| [WriteString](./writestring/)(const String\&) override | 写入给定的文本内容。 |
| [WriteSurrogateCharEntity](./writesurrogatecharentity/)(char16_t, char16_t) override | 生成并写入代理字符对的代理字符实体。 |
| [WriteWhitespace](./writewhitespace/)(String) override | 写出给定的空白字符。 |
| [XmlTextWriter](./xmltextwriter/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Text::Encoding\>\&) | 使用指定的流和编码创建 [XmlTextWriter](./) 类的实例。 |
| [XmlTextWriter](./xmltextwriter/)(const String\&, const SharedPtr\<Text::Encoding\>\&) | 使用指定的文件创建 [XmlTextWriter](./) 类的实例。 |
| [XmlTextWriter](./xmltextwriter/)(const SharedPtr\<IO::TextWriter\>\&) | 使用指定的 TextWriter 创建 [XmlTextWriter](./) 类的实例。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



建议改用 [XmlWriter](../xmlwriter/) 类。

此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [XmlWriter](../xmlwriter/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
