---
title: "System::Xml::XmlConvert クラス"
linktitle: "XmlConvert"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlConvert クラス。XML 名をエンコードおよびデコードし、ランタイム型と XML スキーマ定義言語 (XSD) 型間の変換メソッドを提供します。データ型を変換する際、返される値は C++ でロケールに依存しません。"
type: docs
weight: 1200
url: /ja/cpp/system.xml/xmlconvert/
---
## XmlConvert class


XML 名をエンコードおよびデコードし、ランタイム型と XML [Schema](../../system.xml.schema/) 定義言語 (XSD) 型間の変換メソッドを提供します。データ型を変換する際、返される値はロケールに依存しません。

```cpp
class XmlConvert : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [DecodeName](./decodename/)(const String\&) | 名前をデコードします。このメソッドは XmlConvert::EncodeName(String) および XmlConvert::EncodeLocalName(String) メソッドの逆操作を行います。 |
| static [EncodeLocalName](./encodelocalname/)(const String\&) | 名前を有効な XML ローカル名に変換します。 |
| static [EncodeName](./encodename/)(const String\&) | 名前を有効な XML 名に変換します。 |
| static [EncodeNmToken](./encodenmtoken/)(const String\&) | XML 仕様に従って名前が有効かどうかを検証します。 |
| static [IsNCNameChar](./isncnamechar/)(char16_t) | 渡された文字が有効なコロン以外の文字タイプかどうかをチェックします。 |
| static [IsPublicIdChar](./ispublicidchar/)(char16_t) | 引数の文字が有効な public id 文字であれば渡された文字インスタンスを返し、そうでなければ **nullptr** を返します。 |
| static [IsStartNCNameChar](./isstartncnamechar/)(char16_t) | 渡された文字が有効な開始名文字タイプかどうかをチェックします。 |
| static [IsWhitespaceChar](./iswhitespacechar/)(char16_t) | 渡された文字が有効な XML 空白文字かどうかをチェックします。 |
| static [IsXmlChar](./isxmlchar/)(char16_t) | 渡された文字が有効な XML 文字かどうかをチェックします。 |
| static [IsXmlSurrogatePair](./isxmlsurrogatepair/)(char16_t, char16_t) | 渡されたサロゲートペア文字が有効な XML 文字かどうかをチェックします。 |
| static [ToBoolean](./toboolean/)(String) | [String](../../system/string/) を [Boolean](../../system/boolean/) に変換します。 |
| static [ToByte](./tobyte/)(const String\&) | [String](../../system/string/) を [Byte](../../system/byte/) に変換します。 |
| static [ToChar](./tochar/)(const String\&) | [String](../../system/string/) を [Char](../../system/char/) に変換します。 |
| static [ToDateTime](./todatetime/)(const String\&) | [String](../../system/string/) を [DateTime](../../system/datetime/) に変換します。 |
| static [ToDateTime](./todatetime/)(const String\&, const String\&) | [String](../../system/string/) を [DateTime](../../system/datetime/) に変換します。 |
| static [ToDateTime](./todatetime/)(const String\&, const ArrayPtr\<String\>\&) | [String](../../system/string/) を [DateTime](../../system/datetime/) に変換します。 |
| static [ToDateTime](./todatetime/)(const String\&, XmlDateTimeSerializationMode) | 指定された [XmlDateTimeSerializationMode](../xmldatetimeserializationmode/) を使用して、[String](../../system/string/) を [DateTime](../../system/datetime/) に変換します。 |
| static [ToDateTimeOffset](./todatetimeoffset/)(const String\&) | 提供された [String](../../system/string/) を [DateTimeOffset](../../system/datetimeoffset/) に変換します。 |
| static [ToDateTimeOffset](./todatetimeoffset/)(const String\&, const String\&) | 提供された [String](../../system/string/) を [DateTimeOffset](../../system/datetimeoffset/) に変換します。 |
| static [ToDateTimeOffset](./todatetimeoffset/)(const String\&, const ArrayPtr\<String\>\&) | 提供された [String](../../system/string/) を [DateTimeOffset](../../system/datetimeoffset/) に変換します。 |
| static [ToDecimal](./todecimal/)(const String\&) | [String](../../system/string/) を [Decimal](../../system/decimal/) に変換します。 |
| static [ToDouble](./todouble/)(String) | [String](../../system/string/) を [Double](../../system/double/) に変換します。 |
| static [ToGuid](./toguid/)(const String\&) | [String](../../system/string/) を [Guid](../../system/guid/) に変換します。 |
| static [ToInt16](./toint16/)(const String\&) | [String](../../system/string/) を [Int16](../../system/int16/) に変換します。 |
| static [ToInt32](./toint32/)(const String\&) | [String](../../system/string/) を [Int32](../../system/int32/) に変換します。 |
| static [ToInt64](./toint64/)(const String\&) | [String](../../system/string/) を [Int64](../../system/int64/) に変換します。 |
| static [ToSByte](./tosbyte/)(const String\&) | [String](../../system/string/) を [SByte](../../system/sbyte/) に変換します。 |
| static [ToSingle](./tosingle/)(String) | [String](../../system/string/) を [Single](../../system/single/) に変換します。 |
| static [ToString](./tostring/)(bool) | [Boolean](../../system/boolean/) を [String](../../system/string/) に変換します。 |
| static [ToString](./tostring/)(char16_t) | [Char](../../system/char/) を [String](../../system/string/) に変換します。 |
| static [ToString](./tostring/)(Decimal) | [Decimal](../../system/decimal/) を [String](../../system/string/) に変換します。 |
| static [ToString](./tostring/)(int8_t) | [SByte](../../system/sbyte/) を [String](../../system/string/) に変換します。 |
| static [ToString](./tostring/)(int16_t) | [Int16](../../system/int16/) を [String](../../system/string/) に変換します。 |
| static [ToString](./tostring/)(int32_t) | [Int32](../../system/int32/) を [String](../../system/string/) に変換します。 |
| static [ToString](./tostring/)(int64_t) | [Int64](../../system/int64/) を [String](../../system/string/) に変換します。 |
| static [ToString](./tostring/)(uint8_t) | [Byte](../../system/byte/) を [String](../../system/string/) に変換します。 |
| static [ToString](./tostring/)(uint16_t) | [UInt16](../../system/uint16/) を [String](../../system/string/) に変換します。 |
| static [ToString](./tostring/)(uint32_t) | [UInt32](../../system/uint32/) を [String](../../system/string/) に変換します。 |
| static [ToString](./tostring/)(uint64_t) | [UInt64](../../system/uint64/) を [String](../../system/string/) に変換します。 |
| static [ToString](./tostring/)(float) | [Single](../../system/single/) を [String](../../system/string/) に変換します。 |
| static [ToString](./tostring/)(double) | [Double](../../system/double/) を [String](../../system/string/) に変換します。 |
| static [ToString](./tostring/)(TimeSpan) | [TimeSpan](../../system/timespan/) を [String](../../system/string/) に変換します。 |
| static [ToString](./tostring/)(DateTime) | [DateTime](../../system/datetime/) を [String](../../system/string/) に変換します。 |
| static [ToString](./tostring/)(DateTime, const String\&) | [DateTime](../../system/datetime/) を [String](../../system/string/) に変換します。 |
| static [ToString](./tostring/)(DateTime, XmlDateTimeSerializationMode) | [DateTime](../../system/datetime/) を、指定された [XmlDateTimeSerializationMode](../xmldatetimeserializationmode/) を使用して [String](../../system/string/) に変換します。 |
| static [ToString](./tostring/)(DateTimeOffset) | 提供された [DateTimeOffset](../../system/datetimeoffset/) を [String](../../system/string/) に変換します。 |
| static [ToString](./tostring/)(DateTimeOffset, const String\&) | 提供された [DateTimeOffset](../../system/datetimeoffset/) を、指定された形式で [String](../../system/string/) に変換します。 |
| static [ToString](./tostring/)(Guid) | [Guid](../../system/guid/) を [String](../../system/string/) に変換します。 |
| static [ToTimeSpan](./totimespan/)(const String\&) | [String](../../system/string/) を [TimeSpan](../../system/timespan/) に変換します。 |
| static [ToUInt16](./touint16/)(const String\&) | [String](../../system/string/) を [UInt16](../../system/uint16/) に変換します。 |
| static [ToUInt32](./touint32/)(const String\&) | [String](../../system/string/) を [UInt32](../../system/uint32/) に変換します。 |
| static [ToUInt64](./touint64/)(const String\&) | [String](../../system/string/) を [UInt64](../../system/uint64/) に変換します。 |
| static [VerifyName](./verifyname/)(const String\&) | 名前が W3C Extended Markup Language の勧告に従って有効な名前であることを検証します。 |
| static [VerifyNCName](./verifyncname/)(const String\&) | 名前が W3C Extended Markup Language の勧告に従って有効な **NCName** であることを検証します。**NCName** はコロンを含めることのできない名前です。 |
| static [VerifyNMTOKEN](./verifynmtoken/)(const String\&) | 文字列が W3C XML [Schema](../../system.xml.schema/) Part2: Datatypes の勧告に従って有効な NMTOKEN であることを検証します。 |
| static [VerifyPublicId](./verifypublicid/)(const String\&) | 文字列引数のすべての文字が有効な public id 文字である場合、渡された文字列インスタンスを返します。 |
| static [VerifyTOKEN](./verifytoken/)(const String\&) | 文字列が W3C XML [Schema](../../system.xml.schema/) Part2: Datatypes の勧告に従って有効なトークンであることを検証します。 |
| static [VerifyWhitespace](./verifywhitespace/)(const String\&) | 文字列引数のすべての文字が有効な空白文字である場合、渡された文字列インスタンスを返します。 |
| static [VerifyXmlChars](./verifyxmlchars/)(const String\&) | 文字列引数のすべての文字およびサロゲートペア文字が有効な XML 文字である場合、渡された文字列を返します。そうでない場合、最初に見つかった無効な文字に関する情報を含む [XmlException](../xmlexception/) がスローされます。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
