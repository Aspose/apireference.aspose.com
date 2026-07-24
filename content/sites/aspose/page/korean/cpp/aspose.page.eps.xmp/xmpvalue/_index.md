---
title: "Aspose::Page::EPS::XMP::XmpValue class"
linktitle: "XmpValue"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::EPS::XMP::XmpValue class. C++에서 XMP 값을 나타냅니다."
type: docs
weight: 300
url: /ko/cpp/aspose.page.eps.xmp/xmpvalue/
---
## XmpValue class


[XMP](../) 값을 나타냅니다.

```cpp
class XmpValue : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_IsArray](./get_isarray/)() | [XmpValue](./)이 배열이면 true를 반환합니다. |
| [get_IsDateTime](./get_isdatetime/)() const | 값이 DateTime이면 true를 반환합니다. |
| [get_IsDouble](./get_isdouble/)() const | 값이 부동 소수점 값이면 true를 반환합니다. |
| [get_IsField](./get_isfield/)() | [XmpValue](./)이 필드이면 true를 반환합니다. |
| [get_IsInteger](./get_isinteger/)() const | 값이 정수이면 true를 반환합니다. |
| [get_IsNamedValue](./get_isnamedvalue/)() const | [XmpValue](./)이 명명된 값이면 true를 반환합니다. |
| [get_IsNamedValues](./get_isnamedvalues/)() | [XmpValue](./)이 명명된 값을 나타내면 true를 반환합니다. |
| [get_IsRaw](./get_israw/)() | 값이 지원되지 않거나 알 수 없으며 원시 XML 코드가 제공됩니다. |
| [get_IsString](./get_isstring/)() | 값이 문자열이면 true를 반환합니다. |
| [get_IsStructure](./get_isstructure/)() | [XmpValue](./)이 구조를 나타내면 true를 반환합니다. |
| static [to_KeyValuePair](./to_keyvaluepair/)(System::SharedPtr\<XmpValue\>) | [XmpValue](./)을 명명된 값으로 변환합니다. |
| static [to_KeyValuePairArray](./to_keyvaluepairarray/)(System::SharedPtr\<XmpValue\>) | XmlValue을 명명된 컬렉션 값으로 변환합니다. |
| static [to_String](./to_string/)(System::SharedPtr\<XmpValue\>) | [XmpValue](./)을 문자열로 변환합니다. |
| static [to_XmpValue](./to_xmpvalue/)(System::String) | 문자열을 [XmpValue](./)으로 변환합니다. |
| static [to_XmpValue](./to_xmpvalue/)(int32_t) | 정수를 [XmpValue](./)으로 변환합니다. |
| static [to_XmpValue](./to_xmpvalue/)(double) | double을 [XmpValue](./)으로 변환합니다. |
| static [to_XmpValue](./to_xmpvalue/)(System::DateTime) | DateTime을 [XmpValue](./)으로 변환합니다. |
| static [to_XmpValue](./to_xmpvalue/)(System::ArrayPtr\<System::SharedPtr\<System::Object\>\>) | 배열을 [XmpValue](./)으로 변환합니다. |
| static [to_XmpValueArray](./to_xmpvaluearray/)(System::SharedPtr\<XmpValue\>) | [XmpValue](./)을 배열로 변환합니다. |
| [ToArray](./toarray/)() | 배열을 반환합니다. |
| [ToDateTime](./todatetime/)() | 날짜/시간으로 변환합니다. |
| [ToDictionary](./todictionary/)() | 명명된 값을 포함하는 사전을 반환합니다. |
| [ToDouble](./todouble/)() | double로 변환합니다. |
| [ToField](./tofield/)() | [XMP](../) 값을 [XMP](../) 필드로 반환합니다. |
| [ToInteger](./tointeger/)() | 정수로 변환합니다. |
| [ToNamedValue](./tonamedvalue/)() | [XMP](../) 값을 명명된 값으로 반환합니다. |
| [ToNamedValues](./tonamedvalues/)() | [XMP](../) 값을 명명된 값 컬렉션으로 반환합니다. |
| [ToRaw](./toraw/)() | 알 수 없거나 지원되지 않는 값에 대한 원시 XML 코드입니다. |
| [ToString](./tostring/)(System::SharedPtr\<System::IFormatProvider\>) | 문자열 표현을 반환합니다. |
| [ToString](./tostring/)() const override | [XmpValue](./)의 문자열 표현을 반환합니다. |
| [ToStringValue](./tostringvalue/)() | 문자열로 변환합니다. |
| [ToStructure](./tostructure/)() | [XMP](../) 값을 구조(필드 집합)로 반환합니다. |
| [XmpValue](./xmpvalue/)(System::String) | 문자열 값에 대한 생성자입니다. |
| [XmpValue](./xmpvalue/)(int32_t) | 정수 값에 대한 생성자입니다. |
| [XmpValue](./xmpvalue/)(double) | 부동 소수점 값에 대한 생성자입니다. |
| [XmpValue](./xmpvalue/)(System::DateTime) | 날짜/시간 값에 대한 생성자입니다. |
| [XmpValue](./xmpvalue/)(System::ArrayPtr\<System::SharedPtr\<XmpValue\>\>) | 배열 값에 대한 생성자입니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::EPS::XMP](../)
* Library [Aspose.Page for C++](../../)
