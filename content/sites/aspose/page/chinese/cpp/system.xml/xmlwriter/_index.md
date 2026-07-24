---
title: "System::Xml::XmlWriter 类"
linktitle: "XmlWriter"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlWriter 类。表示一种写入器，提供一种快速、非缓存、仅向前的方式来生成包含 XML 数据的流或文件（使用 C++）。"
type: docs
weight: 4400
url: /zh/cpp/system.xml/xmlwriter/
---
## XmlWriter class


表示一个写入器，提供一种快速、非缓存、仅向前的方式来生成包含 XML 数据的流或文件。

```cpp
class XmlWriter : public System::IDisposable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [Close](./close/)() | 当在派生类中被重写时，关闭此流以及底层流。 |
| static [Create](./create/)(const String\&) | 使用指定的文件名创建一个新的 [XmlWriter](./) 实例。 |
| static [Create](./create/)(const String\&, SharedPtr\<XmlWriterSettings\>) | 使用文件名和 [XmlWriterSettings](../xmlwritersettings/) 对象创建一个新的 [XmlWriter](./) 实例。 |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&) | 使用指定的流创建一个新的 [XmlWriter](./) 实例。 |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlWriterSettings\>) | 使用流和 [XmlWriterSettings](../xmlwritersettings/) 对象创建一个新的 [XmlWriter](./) 实例。 |
| static [Create](./create/)(const SharedPtr\<IO::TextWriter\>\&) | 使用指定的 TextWriter 创建一个新的 [XmlWriter](./) 实例。 |
| static [Create](./create/)(const SharedPtr\<IO::TextWriter\>\&, SharedPtr\<XmlWriterSettings\>) | 使用 TextWriter 和 [XmlWriterSettings](../xmlwritersettings/) 对象创建一个新的 [XmlWriter](./) 实例。 |
| static [Create](./create/)(const SharedPtr\<Text::StringBuilder\>\&) | 使用指定的 [Text::StringBuilder](../../system.text/stringbuilder/) 创建一个新的 [XmlWriter](./) 实例。 |
| static [Create](./create/)(const SharedPtr\<Text::StringBuilder\>\&, SharedPtr\<XmlWriterSettings\>) | 使用 [Text::StringBuilder](../../system.text/stringbuilder/) 和 [XmlWriterSettings](../xmlwritersettings/) 对象创建一个新的 [XmlWriter](./) 实例。 |
| static [Create](./create/)(const SharedPtr\<XmlWriter\>\&) | 使用指定的 [XmlWriter](./) 对象创建一个新的 [XmlWriter](./) 实例。 |
| static [Create](./create/)(const SharedPtr\<XmlWriter\>\&, SharedPtr\<XmlWriterSettings\>) | 使用指定的 [XmlWriter](./) 和 [XmlWriterSettings](../xmlwritersettings/) 对象创建一个新的 [XmlWriter](./) 实例。 |
| [Dispose](./dispose/)() override | 释放当前 [XmlWriter](./) 类实例使用的所有资源。 |
| virtual [Flush](./flush/)() | 当在派生类中被重写时，将缓冲区中的内容刷新到底层流，并且也刷新底层流。 |
| virtual [get_Settings](./get_settings/)() | 返回用于创建此 [XmlWriter](./) 实例的 [XmlWriterSettings](../xmlwritersettings/) 对象。 |
| virtual [get_WriteState](./get_writestate/)() | 当在派生类中被重写时，获取写入器的状态。 |
| virtual [get_XmlLang](./get_xmllang/)() | 当在派生类中被重写时，获取当前 **xml:lang** 范围。 |
| virtual [get_XmlSpace](./get_xmlspace/)() | 当在派生类中被重写时，获取表示当前 **xml:space** 范围的 [XmlSpace](../xmlspace/)。 |
| virtual [LookupPrefix](./lookupprefix/)(String) | 当在派生类中被重写时，返回在当前命名空间范围内为该命名空间 URI 定义的最近前缀。 |
| virtual [WriteAttributes](./writeattributes/)(SharedPtr\<XmlReader\>, bool) | 当在派生类中被重写时，写出在 [XmlReader](../xmlreader/) 当前位置找到的所有属性。 |
| [WriteAttributeString](./writeattributestring/)(const String\&, const String\&, const String\&) | 当在派生类中被重写时，写入具有指定本地名称、命名空间 URI 和数值的属性。 |
| [WriteAttributeString](./writeattributestring/)(const String\&, const String\&) | 当在派生类中被重写时，写出具有指定本地名称和数值的属性。 |
| [WriteAttributeString](./writeattributestring/)(const String\&, const String\&, const String\&, const String\&) | 当在派生类中被重写时，写出具有指定前缀、本地名称、命名空间 URI 和数值的属性。 |
| virtual [WriteBase64](./writebase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | 当在派生类中被重写时，将指定的二进制字节编码为 Base64 并写出生成的文本。 |
| virtual [WriteBinHex](./writebinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | 当在派生类中被重写时，将指定的二进制字节编码为 **BinHex** 并写出生成的文本。 |
| virtual [WriteCData](./writecdata/)(String) | 当在派生类中被重写时，写出一个包含指定文本的 **...** 块。 |
| virtual [WriteCharEntity](./writecharentity/)(char16_t) | 当在派生类中被重写时，强制为指定的 Unicode 字符值生成字符实体。 |
| virtual [WriteChars](./writechars/)(ArrayPtr\<char16_t\>, int32_t, int32_t) | 当在派生类中被重写时，一次写入一个缓冲区的文本。 |
| virtual [WriteComment](./writecomment/)(String) | 当在派生类中被重写时，写出一个包含指定文本的注释 ****。 |
| virtual [WriteDocType](./writedoctype/)(const String\&, const String\&, const String\&, const String\&) | 当在派生类中被重写时，写出带有指定名称和可选属性的 DOCTYPE 声明。 |
| [WriteElementString](./writeelementstring/)(const String\&, const String\&) | 写入具有指定本地名称和值的元素。 |
| [WriteElementString](./writeelementstring/)(const String\&, const String\&, const String\&) | 写入具有指定本地名称、命名空间 URI 和值的元素。 |
| [WriteElementString](./writeelementstring/)(const String\&, const String\&, const String\&, const String\&) | 写入具有指定前缀、本地名称、命名空间 URI 和值的元素。 |
| virtual [WriteEndAttribute](./writeendattribute/)() | 当在派生类中被重写时，关闭先前的 XmlWriter::WriteStartAttribute(String,String) 调用。 |
| virtual [WriteEndDocument](./writeenddocument/)() | 当在派生类中被重写时，关闭所有打开的元素或属性，并将写入器恢复到 Start 状态。 |
| virtual [WriteEndElement](./writeendelement/)() | 当在派生类中被重写时，关闭一个元素并弹出相应的命名空间作用域。 |
| virtual [WriteEntityRef](./writeentityref/)(const String\&) | 当在派生类中被重写时，写出实体引用为 **&name**;。 |
| virtual [WriteFullEndElement](./writefullendelement/)() | 当在派生类中被重写时，关闭一个元素并弹出相应的命名空间作用域。 |
| virtual [WriteName](./writename/)(const String\&) | 当在派生类中被重写时，写出指定的名称，确保它符合 W3C XML 1.0 推荐的有效名称（[https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name)）。 |
| virtual [WriteNmToken](./writenmtoken/)(const String\&) | 当在派生类中被重写时，写出指定的名称，确保它符合 W3C XML 1.0 推荐的有效 NmToken（[https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name)）。 |
| virtual [WriteNode](./writenode/)(SharedPtr\<XmlReader\>, bool) | 当在派生类中被重写时，将读取器的所有内容复制到写入器，并将读取器移动到下一个兄弟节点的起始位置。 |
| virtual [WriteNode](./writenode/)(SharedPtr\<XPath::XPathNavigator\>, bool) | 将 XPathNavigator 对象的所有内容复制到写入器。XPathNavigator 的位置保持不变。 |
| virtual [WriteProcessingInstruction](./writeprocessinginstruction/)(String, String) | 当在派生类中被重写时，写出如下带有名称和文本之间空格的处理指令： **<?name text?>**。 |
| virtual [WriteQualifiedName](./writequalifiedname/)(const String\&, const String\&) | 当在派生类中被重写时，写出带有命名空间限定的名称。此方法查找给定命名空间范围内的前缀。 |
| virtual [WriteRaw](./writeraw/)(ArrayPtr\<char16_t\>, int32_t, int32_t) | 当在派生类中被重写时，从字符缓冲区手动写入原始标记。 |
| virtual [WriteRaw](./writeraw/)(const String\&) | 当在派生类中被重写时，从字符串手动写入原始标记。 |
| [WriteStartAttribute](./writestartattribute/)(const String\&, const String\&) | 写入具有指定本地名称和命名空间 URI 的属性起始。 |
| virtual [WriteStartAttribute](./writestartattribute/)(const String\&, const String\&, const String\&) | 当在派生类中被重写时，写入具有指定前缀、本地名称和命名空间 URI 的属性起始。 |
| [WriteStartAttribute](./writestartattribute/)(const String\&) | 写入具有指定本地名称的属性起始。 |
| virtual [WriteStartDocument](./writestartdocument/)() | 当在派生类中被重写时，写出版本为 "1.0" 的 XML 声明。 |
| virtual [WriteStartDocument](./writestartdocument/)(bool) | 当在派生类中被重写时，写出版本为 "1.0" 且包含 standalone 属性的 XML 声明。 |
| [WriteStartElement](./writestartelement/)(const String\&, const String\&) | 在派生类中被重写时，写入指定的开始标签并将其与给定的命名空间关联。 |
| virtual [WriteStartElement](./writestartelement/)(const String\&, const String\&, const String\&) | 在派生类中被重写时，写入指定的开始标签并将其与给定的命名空间和前缀关联。 |
| [WriteStartElement](./writestartelement/)(const String\&) | 在派生类中被重写时，写出具有指定本地名称的开始标签。 |
| virtual [WriteString](./writestring/)(const String\&) | 在派生类中被重写时，写入给定的文本内容。 |
| virtual [WriteSurrogateCharEntity](./writesurrogatecharentity/)(char16_t, char16_t) | 在派生类中被重写时，生成并写入代理字符对的代理字符实体。 |
| virtual [WriteValue](./writevalue/)(SharedPtr\<Object\>) | 写入对象值。 |
| virtual [WriteValue](./writevalue/)(const String\&) | 写入一个 [String](../../system/string/) 值。 |
| virtual [WriteValue](./writevalue/)(bool) | 写入一个 [Boolean](../../system/boolean/) 值。 |
| virtual [WriteValue](./writevalue/)(DateTime) | 写入一个 [DateTime](../../system/datetime/) 值。 |
| virtual [WriteValue](./writevalue/)(DateTimeOffset) | 写入一个 [DateTimeOffset](../../system/datetimeoffset/) 值。 |
| virtual [WriteValue](./writevalue/)(double) | 写入一个 [Double](../../system/double/) 值。 |
| virtual [WriteValue](./writevalue/)(float) | 写入单精度浮点数。 |
| virtual [WriteValue](./writevalue/)(Decimal) | 写入一个 [Decimal](../../system/decimal/) 值。 |
| virtual [WriteValue](./writevalue/)(int32_t) | 写入一个 [Int32](../../system/int32/) 值。 |
| virtual [WriteValue](./writevalue/)(int64_t) | 写入一个 [Int64](../../system/int64/) 值。 |
| virtual [WriteWhitespace](./writewhitespace/)(String) | 在派生类中被重写时，写出给定的空白字符。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 另见

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
