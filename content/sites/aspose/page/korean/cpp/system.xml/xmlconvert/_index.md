---
title: "System::Xml::XmlConvert 클래스"
linktitle: "XmlConvert"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlConvert 클래스. XML 이름을 인코딩 및 디코딩하고, 런타임 타입과 XML 스키마 정의 언어 (XSD) 타입 간 변환을 위한 메서드를 제공합니다. 데이터 타입을 변환할 때 반환되는 값은 C++에서 로케일에 독립적입니다."
type: docs
weight: 1200
url: /ko/cpp/system.xml/xmlconvert/
---
## XmlConvert class


XML 이름을 인코딩 및 디코딩하고, 런타임 타입과 XML [Schema](../../system.xml.schema/) 정의 언어 (XSD) 타입 간 변환을 위한 메서드를 제공합니다. 데이터 타입을 변환할 때 반환되는 값은 로케일에 독립적입니다.

```cpp
class XmlConvert : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [DecodeName](./decodename/)(const String\&) | 이름을 디코딩합니다. 이 메서드는 XmlConvert::EncodeName(String) 및 XmlConvert::EncodeLocalName(String) 메서드의 반대 작업을 수행합니다. |
| static [EncodeLocalName](./encodelocalname/)(const String\&) | 이름을 유효한 XML 로컬 이름으로 변환합니다. |
| static [EncodeName](./encodename/)(const String\&) | 이름을 유효한 XML 이름으로 변환합니다. |
| static [EncodeNmToken](./encodenmtoken/)(const String\&) | XML 사양에 따라 이름이 유효한지 확인합니다. |
| static [IsNCNameChar](./isncnamechar/)(char16_t) | 전달된 문자가 유효한 비콜론 문자 유형인지 확인합니다. |
| static [IsPublicIdChar](./ispublicidchar/)(char16_t) | 인수에 전달된 문자가 유효한 public id 문자이면 해당 문자 인스턴스를 반환하고, 그렇지 않으면 **nullptr**을 반환합니다. |
| static [IsStartNCNameChar](./isstartncnamechar/)(char16_t) | 전달된 문자가 유효한 시작 이름 문자 유형인지 확인합니다. |
| static [IsWhitespaceChar](./iswhitespacechar/)(char16_t) | 전달된 문자가 유효한 XML 공백 문자인지 확인합니다. |
| static [IsXmlChar](./isxmlchar/)(char16_t) | 전달된 문자가 유효한 XML 문자인지 확인합니다. |
| static [IsXmlSurrogatePair](./isxmlsurrogatepair/)(char16_t, char16_t) | 전달된 서러게이트 문자 쌍이 유효한 XML 문자인지 확인합니다. |
| static [ToBoolean](./toboolean/)(String) | [String](../../system/string/)을(를) [Boolean](../../system/boolean/) 등가형으로 변환합니다. |
| static [ToByte](./tobyte/)(const String\&) | [String](../../system/string/)을(를) [Byte](../../system/byte/) 등가형으로 변환합니다. |
| static [ToChar](./tochar/)(const String\&) | [String](../../system/string/)을(를) [Char](../../system/char/) 등가형으로 변환합니다. |
| static [ToDateTime](./todatetime/)(const String\&) | [String](../../system/string/)을(를) [DateTime](../../system/datetime/) 등가형으로 변환합니다. |
| static [ToDateTime](./todatetime/)(const String\&, const String\&) | [String](../../system/string/)을(를) [DateTime](../../system/datetime/) 등가형으로 변환합니다. |
| static [ToDateTime](./todatetime/)(const String\&, const ArrayPtr\<String\>\&) | [String](../../system/string/)을(를) [DateTime](../../system/datetime/) 등가형으로 변환합니다. |
| static [ToDateTime](./todatetime/)(const String\&, XmlDateTimeSerializationMode) | [String](../../system/string/)을(를) 지정된 [XmlDateTimeSerializationMode](../xmldatetimeserializationmode/)을 사용하여 [DateTime](../../system/datetime/)으로 변환합니다. |
| static [ToDateTimeOffset](./todatetimeoffset/)(const String\&) | 제공된 [String](../../system/string/)을(를) [DateTimeOffset](../../system/datetimeoffset/) 등가형으로 변환합니다. |
| static [ToDateTimeOffset](./todatetimeoffset/)(const String\&, const String\&) | 제공된 [String](../../system/string/)을(를) [DateTimeOffset](../../system/datetimeoffset/) 등가형으로 변환합니다. |
| static [ToDateTimeOffset](./todatetimeoffset/)(const String\&, const ArrayPtr\<String\>\&) | 제공된 [String](../../system/string/)을(를) [DateTimeOffset](../../system/datetimeoffset/) 등가형으로 변환합니다. |
| static [ToDecimal](./todecimal/)(const String\&) | [String](../../system/string/)을(를) [Decimal](../../system/decimal/) 등가형으로 변환합니다. |
| static [ToDouble](./todouble/)(String) | [String](../../system/string/)을(를) [Double](../../system/double/) 등가형으로 변환합니다. |
| static [ToGuid](./toguid/)(const String\&) | [String](../../system/string/)을(를) [Guid](../../system/guid/) 등가형으로 변환합니다. |
| static [ToInt16](./toint16/)(const String\&) | [String](../../system/string/)을(를) [Int16](../../system/int16/) 등가형으로 변환합니다. |
| static [ToInt32](./toint32/)(const String\&) | [String](../../system/string/)을(를) [Int32](../../system/int32/) 등가형으로 변환합니다. |
| static [ToInt64](./toint64/)(const String\&) | [String](../../system/string/)을(를) [Int64](../../system/int64/) 등가형으로 변환합니다. |
| static [ToSByte](./tosbyte/)(const String\&) | [String](../../system/string/)을(를) [SByte](../../system/sbyte/) 등가형으로 변환합니다. |
| static [ToSingle](./tosingle/)(String) | [String](../../system/string/)을(를) [Single](../../system/single/) 등가형으로 변환합니다. |
| static [ToString](./tostring/)(bool) | [Boolean](../../system/boolean/)을(를) [String](../../system/string/)으로 변환합니다. |
| static [ToString](./tostring/)(char16_t) | [Char](../../system/char/)을(를) [String](../../system/string/)으로 변환합니다. |
| static [ToString](./tostring/)(Decimal) | [Decimal](../../system/decimal/)을(를) [String](../../system/string/)으로 변환합니다. |
| static [ToString](./tostring/)(int8_t) | [SByte](../../system/sbyte/)을(를) [String](../../system/string/)으로 변환합니다. |
| static [ToString](./tostring/)(int16_t) | [Int16](../../system/int16/)을(를) [String](../../system/string/)으로 변환합니다. |
| static [ToString](./tostring/)(int32_t) | [Int32](../../system/int32/)을(를) [String](../../system/string/)으로 변환합니다. |
| static [ToString](./tostring/)(int64_t) | [Int64](../../system/int64/)을(를) [String](../../system/string/)으로 변환합니다. |
| static [ToString](./tostring/)(uint8_t) | [Byte](../../system/byte/)을(를) [String](../../system/string/)으로 변환합니다. |
| static [ToString](./tostring/)(uint16_t) | [UInt16](../../system/uint16/)을 [String](../../system/string/)으로 변환합니다. |
| static [ToString](./tostring/)(uint32_t) | [UInt32](../../system/uint32/)을 [String](../../system/string/)으로 변환합니다. |
| static [ToString](./tostring/)(uint64_t) | [UInt64](../../system/uint64/)을 [String](../../system/string/)으로 변환합니다. |
| static [ToString](./tostring/)(float) | [Single](../../system/single/)을 [String](../../system/string/)으로 변환합니다. |
| static [ToString](./tostring/)(double) | [Double](../../system/double/)을 [String](../../system/string/)으로 변환합니다. |
| static [ToString](./tostring/)(TimeSpan) | [TimeSpan](../../system/timespan/)을 [String](../../system/string/)으로 변환합니다. |
| static [ToString](./tostring/)(DateTime) | [DateTime](../../system/datetime/)을 [String](../../system/string/)으로 변환합니다. |
| static [ToString](./tostring/)(DateTime, const String\&) | [DateTime](../../system/datetime/)을 [String](../../system/string/)으로 변환합니다. |
| static [ToString](./tostring/)(DateTime, XmlDateTimeSerializationMode) | [DateTime](../../system/datetime/)을 지정된 [XmlDateTimeSerializationMode](../xmldatetimeserializationmode/)을 사용하여 [String](../../system/string/)으로 변환합니다. |
| static [ToString](./tostring/)(DateTimeOffset) | 제공된 [DateTimeOffset](../../system/datetimeoffset/)을 [String](../../system/string/)으로 변환합니다. |
| static [ToString](./tostring/)(DateTimeOffset, const String\&) | 제공된 [DateTimeOffset](../../system/datetimeoffset/)을 지정된 형식으로 [String](../../system/string/)으로 변환합니다. |
| static [ToString](./tostring/)(Guid) | [Guid](../../system/guid/)을 [String](../../system/string/)으로 변환합니다. |
| static [ToTimeSpan](./totimespan/)(const String\&) | [String](../../system/string/)을 [TimeSpan](../../system/timespan/) 등가값으로 변환합니다. |
| static [ToUInt16](./touint16/)(const String\&) | [String](../../system/string/)을 [UInt16](../../system/uint16/) 등가값으로 변환합니다. |
| static [ToUInt32](./touint32/)(const String\&) | [String](../../system/string/)을 [UInt32](../../system/uint32/) 등가값으로 변환합니다. |
| static [ToUInt64](./touint64/)(const String\&) | [String](../../system/string/)을 [UInt64](../../system/uint64/) 등가값으로 변환합니다. |
| static [VerifyName](./verifyname/)(const String\&) | 이름이 W3C 확장 마크업 언어 권고에 따라 유효한 이름인지 확인합니다. |
| static [VerifyNCName](./verifyncname/)(const String\&) | 이름이 W3C 확장 마크업 언어 권고에 따라 유효한 **NCName**인지 확인합니다. **NCName**은 콜론을 포함할 수 없는 이름입니다. |
| static [VerifyNMTOKEN](./verifynmtoken/)(const String\&) | 문자열이 W3C XML [Schema](../../system.xml.schema/) Part2: Datatypes 권고에 따라 유효한 NMTOKEN인지 확인합니다. |
| static [VerifyPublicId](./verifypublicid/)(const String\&) | 문자열 인수의 모든 문자가 유효한 public id 문자이면 전달된 문자열 인스턴스를 반환합니다. |
| static [VerifyTOKEN](./verifytoken/)(const String\&) | 문자열이 W3C XML [Schema](../../system.xml.schema/) Part2: Datatypes 권고에 따라 유효한 토큰인지 확인합니다. |
| static [VerifyWhitespace](./verifywhitespace/)(const String\&) | 문자열 인수의 모든 문자가 유효한 공백 문자이면 전달된 문자열 인스턴스를 반환합니다. |
| static [VerifyXmlChars](./verifyxmlchars/)(const String\&) | 문자열 인수의 모든 문자와 서러게이트 쌍 문자가 유효한 XML 문자이면 전달된 문자열을 반환하고, 그렇지 않으면 첫 번째 잘못된 문자의 정보와 함께 [XmlException](../xmlexception/)이 발생합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
