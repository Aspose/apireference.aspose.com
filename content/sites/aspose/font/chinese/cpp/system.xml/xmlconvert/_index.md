---
title: "System::Xml::XmlConvert 类"
linktitle: "XmlConvert"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlConvert 类。对 XML 名称进行编码和解码，并提供在运行时类型与 XML Schema 定义语言 (XSD) 类型之间转换的方法。在转换数据类型时，返回的值在 C++ 中与区域设置无关。"
type: docs
weight: 1200
url: /zh/cpp/system.xml/xmlconvert/
---
## XmlConvert class


对 XML 名称进行编码和解码，并提供在运行时类型与 XML [Schema](../../system.xml.schema/) 定义语言 (XSD) 类型之间转换的方法。在转换数据类型时，返回的值与区域设置无关。

```cpp
class XmlConvert : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [DecodeName](./decodename/)(const String\&) | 解码名称。此方法执行 XmlConvert::EncodeName(String) 和 XmlConvert::EncodeLocalName(String) 方法的逆操作。 |
| static [EncodeLocalName](./encodelocalname/)(const String\&) | 将名称转换为有效的 XML 本地名称。 |
| static [EncodeName](./encodename/)(const String\&) | 将名称转换为有效的 XML 名称。 |
| static [EncodeNmToken](./encodenmtoken/)(const String\&) | 根据 XML 规范验证名称是否有效。 |
| static [IsNCNameChar](./isncnamechar/)(char16_t) | 检查传入的字符是否为有效的非冒号字符类型。 |
| static [IsPublicIdChar](./ispublicidchar/)(char16_t) | 如果参数中的字符是有效的公共标识符字符，则返回传入的字符实例，否则返回 **nullptr**。 |
| static [IsStartNCNameChar](./isstartncnamechar/)(char16_t) | 检查传入的字符是否为有效的起始名称字符类型。 |
| static [IsWhitespaceChar](./iswhitespacechar/)(char16_t) | 检查传入的字符是否为有效的 XML 空白字符。 |
| static [IsXmlChar](./isxmlchar/)(char16_t) | 检查传入的字符是否为有效的 XML 字符。 |
| static [IsXmlSurrogatePair](./isxmlsurrogatepair/)(char16_t, char16_t) | 检查传入的代理对字符是否为有效的 XML 字符。 |
| static [ToBoolean](./toboolean/)(String) | 将 [String](../../system/string/) 转换为 [Boolean](../../system/boolean/) 等价类型。 |
| static [ToByte](./tobyte/)(const String\&) | 将 [String](../../system/string/) 转换为 [Byte](../../system/byte/) 等价类型。 |
| static [ToChar](./tochar/)(const String\&) | 将 [String](../../system/string/) 转换为 [Char](../../system/char/) 等价类型。 |
| static [ToDateTime](./todatetime/)(const String\&) | 将 [String](../../system/string/) 转换为 [DateTime](../../system/datetime/) 等价类型。 |
| static [ToDateTime](./todatetime/)(const String\&, const String\&) | 将 [String](../../system/string/) 转换为 [DateTime](../../system/datetime/) 等价类型。 |
| static [ToDateTime](./todatetime/)(const String\&, const ArrayPtr\<String\>\&) | 将 [String](../../system/string/) 转换为 [DateTime](../../system/datetime/) 等价类型。 |
| static [ToDateTime](./todatetime/)(const String\&, XmlDateTimeSerializationMode) | 使用指定的 [XmlDateTimeSerializationMode](../xmldatetimeserializationmode/)，将 [String](../../system/string/) 转换为 [DateTime](../../system/datetime/)。 |
| static [ToDateTimeOffset](./todatetimeoffset/)(const String\&) | 将提供的 [String](../../system/string/) 转换为 [DateTimeOffset](../../system/datetimeoffset/) 等价类型。 |
| static [ToDateTimeOffset](./todatetimeoffset/)(const String\&, const String\&) | 将提供的 [String](../../system/string/) 转换为 [DateTimeOffset](../../system/datetimeoffset/) 等价类型。 |
| static [ToDateTimeOffset](./todatetimeoffset/)(const String\&, const ArrayPtr\<String\>\&) | 将提供的 [String](../../system/string/) 转换为 [DateTimeOffset](../../system/datetimeoffset/) 等价类型。 |
| static [ToDecimal](./todecimal/)(const String\&) | 将 [String](../../system/string/) 转换为 [Decimal](../../system/decimal/) 等价类型。 |
| static [ToDouble](./todouble/)(String) | 将 [String](../../system/string/) 转换为 [Double](../../system/double/) 等价类型。 |
| static [ToGuid](./toguid/)(const String\&) | 将 [String](../../system/string/) 转换为 [Guid](../../system/guid/) 等价类型。 |
| static [ToInt16](./toint16/)(const String\&) | 将 [String](../../system/string/) 转换为 [Int16](../../system/int16/) 等价类型。 |
| static [ToInt32](./toint32/)(const String\&) | 将 [String](../../system/string/) 转换为 [Int32](../../system/int32/) 等价类型。 |
| static [ToInt64](./toint64/)(const String\&) | 将 [String](../../system/string/) 转换为等价的 [Int64](../../system/int64/)。 |
| static [ToSByte](./tosbyte/)(const String\&) | 将 [String](../../system/string/) 转换为等价的 [SByte](../../system/sbyte/)。 |
| static [ToSingle](./tosingle/)(String) | 将 [String](../../system/string/) 转换为等价的 [Single](../../system/single/)。 |
| static [ToString](./tostring/)(bool) | 将 [Boolean](../../system/boolean/) 转换为 [String](../../system/string/)。 |
| static [ToString](./tostring/)(char16_t) | 将 [Char](../../system/char/) 转换为 [String](../../system/string/)。 |
| static [ToString](./tostring/)(Decimal) | 将 [Decimal](../../system/decimal/) 转换为 [String](../../system/string/)。 |
| static [ToString](./tostring/)(int8_t) | 将 [SByte](../../system/sbyte/) 转换为 [String](../../system/string/)。 |
| static [ToString](./tostring/)(int16_t) | 将 [Int16](../../system/int16/) 转换为 [String](../../system/string/)。 |
| static [ToString](./tostring/)(int32_t) | 将 [Int32](../../system/int32/) 转换为 [String](../../system/string/)。 |
| static [ToString](./tostring/)(int64_t) | 将 [Int64](../../system/int64/) 转换为 [String](../../system/string/)。 |
| static [ToString](./tostring/)(uint8_t) | 将 [Byte](../../system/byte/) 转换为 [String](../../system/string/)。 |
| static [ToString](./tostring/)(uint16_t) | 将 [UInt16](../../system/uint16/) 转换为 [String](../../system/string/)。 |
| static [ToString](./tostring/)(uint32_t) | 将 [UInt32](../../system/uint32/) 转换为 [String](../../system/string/)。 |
| static [ToString](./tostring/)(uint64_t) | 将 [UInt64](../../system/uint64/) 转换为 [String](../../system/string/)。 |
| static [ToString](./tostring/)(float) | 将 [Single](../../system/single/) 转换为 [String](../../system/string/)。 |
| static [ToString](./tostring/)(double) | 将 [Double](../../system/double/) 转换为 [String](../../system/string/)。 |
| static [ToString](./tostring/)(TimeSpan) | 将 [TimeSpan](../../system/timespan/) 转换为 [String](../../system/string/)。 |
| static [ToString](./tostring/)(DateTime) | 将 [DateTime](../../system/datetime/) 转换为 [String](../../system/string/)。 |
| static [ToString](./tostring/)(DateTime, const String\&) | 将 [DateTime](../../system/datetime/) 转换为 [String](../../system/string/)。 |
| static [ToString](./tostring/)(DateTime, XmlDateTimeSerializationMode) | 将 [DateTime](../../system/datetime/) 使用指定的 [XmlDateTimeSerializationMode](../xmldatetimeserializationmode/) 转换为 [String](../../system/string/)。 |
| static [ToString](./tostring/)(DateTimeOffset) | 将提供的 [DateTimeOffset](../../system/datetimeoffset/) 转换为 [String](../../system/string/)。 |
| static [ToString](./tostring/)(DateTimeOffset, const String\&) | 将提供的 [DateTimeOffset](../../system/datetimeoffset/) 按指定格式转换为 [String](../../system/string/)。 |
| static [ToString](./tostring/)(Guid) | 将 [Guid](../../system/guid/) 转换为 [String](../../system/string/)。 |
| static [ToTimeSpan](./totimespan/)(const String\&) | 将 [String](../../system/string/) 转换为等价的 [TimeSpan](../../system/timespan/)。 |
| static [ToUInt16](./touint16/)(const String\&) | 将 [String](../../system/string/) 转换为等价的 [UInt16](../../system/uint16/)。 |
| static [ToUInt32](./touint32/)(const String\&) | 将 [String](../../system/string/) 转换为等价的 [UInt32](../../system/uint32/)。 |
| static [ToUInt64](./touint64/)(const String\&) | 将 [String](../../system/string/) 转换为等价的 [UInt64](../../system/uint64/)。 |
| static [VerifyName](./verifyname/)(const String\&) | 验证该名称是否符合 W3C 扩展标记语言推荐的有效名称。 |
| static [VerifyNCName](./verifyncname/)(const String\&) | 验证该名称是否符合 W3C 扩展标记语言推荐的有效 **NCName**。**NCName** 是一种不能包含冒号的名称。 |
| static [VerifyNMTOKEN](./verifynmtoken/)(const String\&) | 验证该字符串是否符合 W3C XML [Schema](../../system.xml.schema/) 第2部分：数据类型 推荐的有效 NMTOKEN。 |
| static [VerifyPublicId](./verifypublicid/)(const String\&) | 如果字符串参数中的所有字符都是有效的公共标识符字符，则返回传入的字符串实例。 |
| static [VerifyTOKEN](./verifytoken/)(const String\&) | 验证该字符串是否符合 W3C XML [Schema](../../system.xml.schema/) 第2部分：数据类型 推荐的有效标记。 |
| static [VerifyWhitespace](./verifywhitespace/)(const String\&) | 如果字符串参数中的所有字符都是有效的空白字符，则返回传入的字符串实例。 |
| static [VerifyXmlChars](./verifyxmlchars/)(const String\&) | 如果字符串参数中的所有字符及代理对字符都是有效的 XML 字符，则返回传入的字符串；否则会抛出 [XmlException](../xmlexception/)，并提供首次遇到的无效字符信息。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
