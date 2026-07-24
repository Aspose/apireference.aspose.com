---
title: "System::Text::Encoding 클래스"
linktitle: "Encoding"
second_title: "C++용 Aspose.Page"
description: "System::Text::Encoding 클래스. C++에서 인코딩 서비스를 제공합니다."
type: docs
weight: 1600
url: /ko/cpp/system.text/encoding/
---
## Encoding class


[Encoding](./) services.

```cpp
class Encoding : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [Clone](./clone/)() | 인코딩 객체를 복제합니다. |
| static [Convert](./convert/)(const EncodingPtr\&, const EncodingPtr\&, const ArrayPtr\<uint8_t\>\&) | 두 인코딩 간의 바이트를 변환합니다. |
| static [Convert](./convert/)(const EncodingPtr\&, const EncodingPtr\&, const ArrayPtr\<uint8_t\>\&, int, int) | 두 인코딩 간의 바이트를 변환합니다. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | 인코딩을 비교합니다. |
| static [get_ASCII](./get_ascii/)() | ASCII 인코딩을 가져옵니다. |
| static [get_BigEndianUnicode](./get_bigendianunicode/)() | 표준 빅 엔디안 Unicode 인코딩 객체를 가져옵니다. |
| static [get_BigEndianUTF32](./get_bigendianutf32/)() | 표준 빅 엔디안 UTF-32 인코딩 객체를 가져옵니다. |
| virtual [get_BodyName](./get_bodyname/)() | 메일 에이전트 본문과 호환되는 인코딩 이름을 가져옵니다. |
| virtual [get_CodePage](./get_codepage/)() | [Windows](../../system.windows/) 코드 페이지 ID를 가져옵니다. |
| [get_DecoderFallback](./get_decoderfallback/)() const | 디코더 폴백을 가져옵니다. |
| static [get_Default](./get_default/)() | 기본 인코딩을 가져옵니다. |
| [get_EncoderFallback](./get_encoderfallback/)() const | 인코더 폴백을 가져옵니다. |
| virtual [get_EncodingName](./get_encodingname/)() | 인간이 읽을 수 있는 인코딩 이름을 가져옵니다. |
| virtual [get_HeaderName](./get_headername/)() | 메일 에이전트 헤더와 호환되는 인코딩 이름을 가져옵니다. |
| virtual [get_IsBrowserDisplay](./get_isbrowserdisplay/)() | 인코딩을 브라우저에서 콘텐츠를 표시하는 데 사용할 수 있는지 확인합니다. |
| virtual [get_IsBrowserSave](./get_isbrowsersave/)() | 인코딩을 브라우저에서 콘텐츠를 저장하는 데 사용할 수 있는지 확인합니다. |
| virtual [get_IsMailNewsDisplay](./get_ismailnewsdisplay/)() | 인코딩을 메일 클라이언트에서 콘텐츠를 표시하는 데 사용할 수 있는지 확인합니다. |
| virtual [get_IsMailNewsSave](./get_ismailnewssave/)() | 인코딩을 메일 클라이언트에서 콘텐츠를 저장하는 데 사용할 수 있는지 확인합니다. |
| [get_IsReadOnly](./get_isreadonly/)() | 인코딩이 읽기 전용인지 확인합니다. |
| virtual [get_IsSingleByte](./get_issinglebyte/)() | 인코딩이 단일 바이트인지 확인합니다. |
| static [get_Latin1](./get_latin1/)() | Latin1 인코딩을 가져옵니다. 내부 사용용. |
| static [get_Unicode](./get_unicode/)() | 표준 Unicode 인코딩 객체를 가져옵니다. |
| static [get_UTF32](./get_utf32/)() |  |
| static [get_UTF7](./get_utf7/)() | 표준 UTF-7 인코딩 객체를 가져옵니다. |
| static [get_UTF8](./get_utf8/)() | 표준 UTF-8 인코딩 객체를 가져옵니다. |
| static [get_UTF8Unmarked](./get_utf8unmarked/)() | 클래스 라이브러리에서만 내부적으로 사용됩니다: 표시되지 않으며 입력 검증을 하지 않음. |
| virtual [get_WebName](./get_webname/)() | IANA와 호환되는 인코딩 이름을 가져옵니다. |
| virtual [get_WindowsCodePage](./get_windowscodepage/)() | [Windows](../../system.windows/) 코드 페이지 ID를 가져옵니다. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int) | 문자 버퍼를 인코딩하는 데 필요한 문자 수를 가져옵니다. |
| virtual [GetByteCount](./getbytecount/)(System::Details::ArrayView\<char_t\>, int, int) | 문자 버퍼를 인코딩하는 데 필요한 문자 수를 가져옵니다. |
| [GetByteCount](./getbytecount/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | 문자 버퍼를 인코딩하는 데 필요한 문자 수를 가져옵니다. |
| virtual [GetByteCount](./getbytecount/)(const String\&) | 문자열을 인코딩하는 데 필요한 문자 수를 가져옵니다. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>) | 문자 버퍼를 인코딩하는 데 필요한 문자 수를 가져옵니다. |
| virtual [GetByteCount](./getbytecount/)(const char_t *, int) | 문자 버퍼를 인코딩하는 데 필요한 문자 수를 가져옵니다. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) | 문자 버퍼를 인코딩하여 생성된 바이트를 가져옵니다. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) | 문자 버퍼를 인코딩하여 생성된 바이트를 가져옵니다. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) | 문자 버퍼를 인코딩하여 생성된 바이트를 가져옵니다. |
| virtual [GetBytes](./getbytes/)(const String\&, int, int, ArrayPtr\<uint8_t\>, int) | 문자 버퍼를 인코딩하여 생성된 바이트를 가져옵니다. |
| virtual [GetBytes](./getbytes/)(const String\&) | 문자 버퍼를 인코딩하여 생성된 바이트를 가져옵니다. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int) | 문자 버퍼를 인코딩하여 생성된 바이트를 가져옵니다. |
| virtual [GetBytes](./getbytes/)(const System::Details::ArrayView\<char_t\>\&, int, int) | 문자 버퍼를 인코딩하여 생성된 바이트를 가져옵니다. |
| [GetBytes](./getbytes/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | 문자 버퍼를 인코딩하여 생성된 바이트를 가져옵니다. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>) | 문자 버퍼를 인코딩하여 생성된 바이트를 가져옵니다. |
| virtual [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int) | 문자 버퍼를 인코딩하여 생성된 바이트를 가져옵니다. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | 바이트 버퍼를 디코딩하는 데 필요한 문자 수를 가져옵니다. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>) | 바이트 버퍼를 디코딩하는 데 필요한 문자 수를 가져옵니다. |
| virtual [GetCharCount](./getcharcount/)(const uint8_t *, int) | 바이트 버퍼를 디코딩하는 데 필요한 문자 수를 가져옵니다. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | 바이트 버퍼를 디코딩하여 생성된 문자를 가져옵니다. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int) | 바이트 버퍼를 디코딩하여 생성된 문자를 가져옵니다. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>) | 바이트 버퍼를 디코딩하여 생성된 문자를 가져옵니다. |
| virtual [GetChars](./getchars/)(const uint8_t *, int, char_t *, int) | 바이트 버퍼를 디코딩하여 생성된 문자를 가져옵니다. |
| virtual [GetDecoder](./getdecoder/)() | 이 객체에 요청을 전달하는 디코더를 가져옵니다. |
| virtual [GetEncoder](./getencoder/)() | 이 객체에 요청을 전달하는 인코더를 가져옵니다. |
| static [GetEncoding](./getencoding/)(const String\&) | 이름으로 인코딩을 가져옵니다. |
| static [GetEncoding](./getencoding/)(int) | 코드 페이지로 인코딩을 가져옵니다. |
| static [GetEncoding](./getencoding/)(int, const EncoderFallbackPtr\&, const DecoderFallbackPtr\&) | 코드 페이지로 인코딩을 가져옵니다. |
| static [GetEncoding](./getencoding/)(const String\&, const EncoderFallbackPtr\&, const DecoderFallbackPtr\&) | 이름으로 인코딩을 가져옵니다. |
| static [GetEncodings](./getencodings/)() | 알려진 인코딩 목록을 가져옵니다. |
| [GetHashCode](./gethashcode/)() const override | 인코딩을 해시합니다. |
| virtual [GetMaxByteCount](./getmaxbytecount/)(int) | 지정된 문자 수를 인코딩하는 데 필요한 최대 바이트 수를 가져옵니다. |
| virtual [GetMaxCharCount](./getmaxcharcount/)(int) | 지정된 바이트 수를 디코딩하는 데 필요한 최대 문자 수를 가져옵니다. |
| virtual [GetPreamble](./getpreamble/)() | 인코딩을 나타내는 바이트 시퀀스(예: BOM)를 반환합니다. |
| virtual [GetString](./getstring/)(uint8_t *, int) | 바이트 버퍼를 문자열로 디코딩합니다. |
| virtual [GetString](./getstring/)(ArrayPtr\<uint8_t\>) | 바이트 버퍼를 문자열로 디코딩합니다. |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&) | 바이트 버퍼를 문자열로 디코딩합니다. |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>\&) | 바이트 버퍼를 문자열로 디코딩합니다. |
| virtual [GetString](./getstring/)(ArrayPtr\<uint8_t\>, int, int) | 바이트 버퍼를 문자열로 디코딩합니다. |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&, int, int) | 바이트 버퍼를 문자열로 디코딩합니다. |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>, int, int) | 바이트 버퍼를 문자열로 디코딩합니다. |
| [set_DecoderFallback](./set_decoderfallback/)(const DecoderFallbackPtr\&) | 디코더 폴백을 설정합니다. |
| [set_EncoderFallback](./set_encoderfallback/)(const EncoderFallbackPtr\&) | 인코더 폴백을 설정합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](./default_code_page/) | 기본 코드 페이지 값. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | RTTI. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
