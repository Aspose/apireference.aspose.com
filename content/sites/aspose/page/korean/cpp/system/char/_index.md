---
title: "System::Char 클래스"
linktitle: "Char"
second_title: "C++용 Aspose.Page"
description: "System::Char 클래스. UTF-16 코드 단위로 표현된 문자를 조작하기 위한 메서드를 제공합니다. 인스턴스 서비스를 제공하지 않는 정적 타입이며, C++에서 어떠한 방법으로도 인스턴스를 생성해서는 안 됩니다."
type: docs
weight: 1200
url: /ko/cpp/system/char/
---
## Char class


UTF-16 코드 단위로 표현된 문자를 조작하는 메서드를 제공합니다. 인스턴스 서비스를 제공하지 않는 정적 타입이며, 어떤 방법으로도 인스턴스를 생성해서는 안 됩니다.

```cpp
class Char
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [ConvertFromUtf32](./convertfromutf32/)(uint32_t) | UTF-32 코드 단위를 [System::String](../string/) 클래스의 인스턴스로 변환합니다. |
| static [ConvertToUtf32](./converttoutf32/)(char_t, char_t) | 지정된 UTF-16 서러게이트 쌍을 UTF-32 코드 단위로 변환합니다. |
| static [ConvertToUtf32](./converttoutf32/)(const String\&, int) | 지정된 문자열 위치에 있는 UTF-16 인코딩 문자 또는 서러게이트 쌍의 값을 UTF-32 코드 유닛으로 변환합니다. |
| static [GetNumericValue](./getnumericvalue/)(char_t) | 지정된 UTF-16 문자를 배정밀도 부동소수점 숫자 값으로 변환합니다. |
| static [GetUnicodeCategory](./getunicodecategory/)(char_t) | 지정된 문자의 유니코드 범주를 나타내는 값을 반환합니다. |
| static [IsAsciiWhiteSpace](./isasciiwhitespace/)(char_t) | 지정된 문자가 ASCII 공백 문자로 분류되는지 여부를 결정합니다. |
| static [IsControl](./iscontrol/)(const char_t *, int) | 지정된 문자 버퍼의 지정된 인덱스에 있는 문자가 유니코드 제어 문자로 분류되는지 여부를 결정합니다. |
| static [IsControl](./iscontrol/)(char_t) | 지정된 문자가 유니코드 제어 문자로 분류되는지 여부를 결정합니다. |
| static [IsDigit](./isdigit/)(const char_t *, int) | 지정된 문자 버퍼의 지정된 인덱스에 있는 문자가 십진 숫자로 분류되는지 여부를 결정합니다. |
| static [IsDigit](./isdigit/)(const String\&, const int32_t) | 지정된 문자열의 지정된 인덱스에 있는 문자가 십진 숫자로 분류되는지 여부를 결정합니다. |
| static [IsDigit](./isdigit/)(char_t) | 지정된 문자가 십진 숫자로 분류되는지 여부를 결정합니다. |
| static [IsHighSurrogate](./ishighsurrogate/)(const String\&, int) | 지정된 문자열의 지정된 인덱스에 있는 문자가 UTF-16 상위 서러게이트 코드 유닛인지 여부를 결정합니다. |
| static [IsHighSurrogate](./ishighsurrogate/)(const char_t *, int) | 지정된 문자 버퍼의 지정된 인덱스에 있는 문자가 상위 서러게이트인지 여부를 결정합니다. |
| static [IsHighSurrogate](./ishighsurrogate/)(char_t) | 지정된 문자가 상위 서러게이트인지 여부를 결정합니다. |
| static [IsLetter](./isletter/)(const char_t *, int) | 지정된 문자 버퍼의 지정된 인덱스에 있는 문자가 유니코드 문자로 분류되는지 여부를 결정합니다. |
| static [IsLetter](./isletter/)(char_t) | 지정된 문자가 유니코드 문자로 분류되는지 여부를 결정합니다. |
| static [IsLetterOrDigit](./isletterordigit/)(const char_t *, int) | 지정된 문자 버퍼의 지정된 인덱스에 있는 문자가 유니코드 문자 또는 십진 숫자로 분류되는지 여부를 결정합니다. |
| static [IsLetterOrDigit](./isletterordigit/)(char_t) | 지정된 문자가 유니코드 문자 또는 십진 숫자로 분류되는지 여부를 결정합니다. |
| static [IsLower](./islower/)(const char_t *, int) | 지정된 문자 버퍼의 지정된 인덱스에 있는 문자가 소문자로 분류되는지 여부를 결정합니다. |
| static [IsLower](./islower/)(char_t) | 지정된 문자가 소문자로 분류되는지 여부를 결정합니다. |
| static [IsLower](./islower/)(const String\&, int) | 지정된 문자열의 지정된 인덱스에 있는 문자가 소문자로 분류되는지 여부를 결정합니다. |
| static [IsLowSurrogate](./islowsurrogate/)(const char_t *, int) | 지정된 문자 버퍼의 지정된 인덱스에 있는 문자가 하위 서러게이트인지 여부를 결정합니다. |
| static [IsLowSurrogate](./islowsurrogate/)(char_t) | 지정된 문자가 하위 서러게이트인지 여부를 결정합니다. |
| static [IsNumber](./isnumber/)(const char_t *, int) | 지정된 문자 버퍼의 지정된 인덱스에 있는 문자가 숫자로 분류되는지 여부를 결정합니다. |
| static [IsNumber](./isnumber/)(char_t) | 지정된 문자가 숫자로 분류되는지 여부를 결정합니다. |
| static [IsPunctuation](./ispunctuation/)(const char_t *, int) | 지정된 문자 버퍼의 지정된 인덱스에 있는 문자가 구두점 문자로 분류되는지 여부를 결정합니다. |
| static [IsPunctuation](./ispunctuation/)(char_t) | 지정된 문자가 구두점 문자로 분류되는지 여부를 결정합니다. |
| static [IsSeparator](./isseparator/)(const char_t *, int) | 지정된 문자 버퍼의 지정된 인덱스에 있는 문자가 구분자 문자로 분류되는지 여부를 결정합니다. |
| static [IsSeparator](./isseparator/)(char_t) | 지정된 문자가 구분자 문자로 분류되는지 여부를 결정합니다. |
| static [IsSurrogate](./issurrogate/)(char_t) | 지정된 문자가 UTF-16 서러게이트 코드 유닛인지 여부를 결정합니다. |
| static [IsSurrogate](./issurrogate/)(const String\&, int) | 지정된 문자열의 지정된 인덱스에 있는 문자가 UTF-16 서러게이트 코드 유닛인지 여부를 결정합니다. |
| static [IsSurrogatePair](./issurrogatepair/)(char_t, char_t) | 두 지정된 문자가 UTF-16 서러게이트 쌍을 이루는지 여부를 결정합니다. |
| static [IsSurrogatePair](./issurrogatepair/)(const String\&, int) | 지정된 문자 버퍼에서 연속된 두 문자가 서러게이트 쌍인지 여부를 결정합니다. |
| static [IsSymbol](./issymbol/)(const char_t *, int) | 지정된 문자 버퍼의 지정된 인덱스에 있는 문자가 기호 문자로 분류되는지 여부를 결정합니다. |
| static [IsSymbol](./issymbol/)(char_t) | 지정된 문자가 기호 문자로 분류되는지 여부를 결정합니다. |
| static [IsUpper](./isupper/)(const String\&, int) | 지정된 문자열의 지정된 인덱스에 있는 문자가 대문자로 분류되는지 여부를 결정합니다. |
| static [IsUpper](./isupper/)(const char_t *, int) | 지정된 문자 버퍼의 지정된 인덱스에 있는 문자가 대문자로 분류되는지 여부를 결정합니다. |
| static [IsUpper](./isupper/)(char_t) | 지정된 문자가 대문자로 분류되는지 여부를 결정합니다. |
| static [IsWhiteSpace](./iswhitespace/)(const char_t *, int) | 지정된 문자 버퍼의 지정된 인덱스에 있는 문자가 공백 문자로 분류되는지 여부를 결정합니다. |
| static [IsWhiteSpace](./iswhitespace/)(char_t) | 지정된 문자가 공백 문자로 분류되는지 여부를 결정합니다. |
| static [IsWhiteSpace](./iswhitespace/)(const String\&, int) | 지정된 문자열의 지정된 인덱스에 있는 문자가 공백 문자로 분류되는지 여부를 결정합니다. |
| static [Parse](./parse/)(const String\&) | 지정된 문자열의 첫 번째이자 유일한 문자를 char_t 값으로 변환합니다. |
| static [ToLower](./tolower/)(char_t) | 지정된 문자를 소문자로 변환합니다. |
| static [ToLower](./tolower/)(char_t, const SharedPtr\<Globalization::CultureInfo\>\&) | 지정된 문자를 소문자로 변환합니다. |
| static [ToLowerInvariant](./tolowerinvariant/)(char_t) | 지정된 문자를 소문자로 변환합니다. |
| static [ToUpper](./toupper/)(char_t) | 지정된 문자를 대문자로 변환합니다. |
| static [ToUpper](./toupper/)(char_t, const SharedPtr\<Globalization::CultureInfo\>\&) | 지정된 문자를 대문자로 변환합니다. |
| static [ToUpperInvariant](./toupperinvariant/)(char_t) | 지정된 문자를 대문자로 변환합니다. |
| static [TryParse](./tryparse/)(const System::String\&, char_t\&) | 단일 문자로 구성된 문자열을 UTF-16 문자로 변환하려 시도합니다. 입력 문자열이 null이 아니고 정확히 한 문자 길이를 가질 때만 함수가 성공합니다. |
## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
