---
title: "System::String 클래스"
linktitle: "String"
second_title: "C++용 Aspose.Page"
description: "System::String 클래스. 라이브러리 전반에서 사용되는 문자열 클래스입니다. 코드를 변환할 때 C# System.String을 대체합니다. 최적화 이유로 Object의 하위 클래스로 간주되지 않습니다. 이 타입은 스택에 할당하고 값이나 참조로 함수에 전달해야 합니다. C++에서 이 타입의 객체를 관리하기 위해 System::SmartPtr 클래스를 절대 사용하지 마세요."
type: docs
weight: 5800
url: /ko/cpp/system/string/
---
## String class


[String](./) class used across the library. Is a substitute for C# [System.String](./) when translating code. For optimization reasons, isn't considered an [Object](../object/) subclass. This type should be allocated on stack and passed to functions by value or by reference. Never use [System::SmartPtr](../smartptr/) class to manage objects of this type.

```cpp
class String
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [ASPOSECPP_VALUE_TYPE_IMPLEMENTS_INTERFACES](./asposecpp_value_type_implements_interfaces/)() | [String](./)은 C++ 측에서 암시적으로(상속 없이) 일부 인터페이스를 구현하는 값 타입입니다. |
| [begin](./begin/)() const | 실제 문자열 버퍼의 시작을 가리키는 포인터를 반환합니다. 절대 재할당하지 않습니다. 버퍼가 null-terminated임을 보장하지 않습니다. |
| [Clone](./clone/)() const | 현재 문자열의 복사본을 생성합니다. |
| static [Compare](./compare/)(const String\&, int, const String\&, int, int, bool) | Less-equal-greater-연산자로 두 서브스트링을 비교합니다. |
| static [Compare](./compare/)(const String\&, int, const String\&, int, int, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) | Less-equal-greater-연산자로 두 서브스트링을 비교합니다. |
| static [Compare](./compare/)(const String\&, const String\&, System::StringComparison) | Less-equal-greater-연산자로 두 문자열을 비교합니다. |
| static [Compare](./compare/)(const String\&, int, const String\&, int, int, System::StringComparison) | Less-equal-greater-연산자로 두 문자열을 비교합니다. |
| static [Compare](./compare/)(const String\&, const String\&, bool) | Less-equal-greater-연산자로 두 문자열을 비교합니다. |
| static [Compare](./compare/)(const String\&, const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) | Less-equal-greater-연산자로 두 문자열을 비교합니다. |
| static [CompareOrdinal](./compareordinal/)(const String\&, const String\&) | Less-equal-greater-연산자로 ordinal 모드를 사용하여 두 문자열을 비교합니다. |
| static [CompareOrdinal](./compareordinal/)(const String\&, int, const String\&, int, int) | Less-equal-greater-연산자로 ordinal 모드를 사용하여 두 문자열을 비교합니다. |
| [CompareTo](./compareto/)(const String\&) const | 'less-equals-more' 스타일로 두 문자열을 비교합니다. 현재 문화권을 사용합니다. |
| static [Concat](./concat/)(const ArrayPtr\<String\>\&) | 문자열을 연결합니다. |
| static [Concat](./concat/)(const String\&, const String\&) | 문자열을 연결합니다. |
| static [Concat](./concat/)(const String\&, const String\&, const String\&) | 문자열을 연결합니다. |
| static [Concat](./concat/)(const String\&, const String\&, const String\&, const String\&) | 문자열을 연결합니다. |
| [Contains](./contains/)(const String\&) const | str이 현재 문자열의 서브스트링인지 확인합니다. |
| [Contains](./contains/)(char16_t) const | 문자열에 지정된 문자가 포함되어 있는지 확인합니다. |
| static [Copy](./copy/)(const String\&) | 문자열 복사본을 생성합니다. |
| [CopyTo](./copyto/)(int, const ArrayPtr\<char_t\>\&, int, int) const | 문자열 문자를 기존 배열 요소에 복사합니다. 크기 조정은 수행되지 않습니다. |
| [end](./end/)() const | 실제 문자열 버퍼의 끝을 가리키는 포인터를 반환합니다. 절대 재할당하지 않습니다. 버퍼가 null-terminated임을 보장하지 않습니다. |
| [EndsWith](./endswith/)(const String\&) const | 문자열이 지정된 서브스트링으로 끝나는지 확인합니다. |
| [EndsWith](./endswith/)(const String\&, System::StringComparison) const | 문자열이 지정된 서브스트링으로 끝나는지 확인합니다. |
| [EndsWith](./endswith/)(const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) const | 문자열이 지정된 서브스트링으로 끝나는지 확인합니다. |
| [Equals](./equals/)(const String\&, System::StringComparison) const | [String](./) 동등성 비교. [StringComparison](../stringcomparison/) 열거형이 제공하는 여러 모드가 지원됩니다. |
| [Equals](./equals/)(const String\&) const | [String](./) 동등성 비교. [System::StringComparison::Ordinal](../stringcomparison/) 비교 모드를 사용합니다. |
| static [Equals](./equals/)(const String\&, const String\&) | Equal-연산자로 Ordial 비교 모드를 사용하여 두 문자열을 비교합니다. |
| static [Equals](./equals/)(const String\&, const String\&, System::StringComparison) | Equal-연산자로 두 문자열을 비교합니다. |
| [FastToAscii](./fasttoascii/)(char, int) const | [String](./)을 ASCII 문자열로 변환하려 시도합니다. |
| static [Format](./format/)(const SharedPtr\<IFormatProvider\>\&, const String\&, const Args\&...) | C# 스타일로 문자열을 포맷합니다. |
| static [Format](./format/)(std::nullptr_t, const String\&, const Args\&...) | C# 스타일로 문자열을 포맷합니다. |
| static [Format](./format/)(std::nullptr_t, const char16_t(&), const Args\&...) | C# 스타일로 문자열을 포맷합니다. |
| static [Format](./format/)(const String\&, const Args\&...) | C# 스타일로 문자열을 포맷합니다. |
| static [Format](./format/)(const String\&, const System::ArrayPtr\<T\>\&) | C# 스타일로 문자열을 포맷합니다. |
| static [FromAscii](./fromascii/)(const char *) | ASCII 문자열에서 [String](./)을 생성합니다. |
| static [FromAscii](./fromascii/)(const char *, int) | ASCII 문자열에서 [String](./)을 생성합니다. |
| static [FromAscii](./fromascii/)(const std::string\&) | ASCII 문자열에서 [String](./)을 생성합니다. |
| static [FromUtf16](./fromutf16/)(const std::u16string\&) | utf16 문자열에서 [String](./)을 생성합니다. |
| static [FromUtf32](./fromutf32/)(const uint32_t *, int32_t) | utf32 문자열에서 [String](./)을 생성합니다. |
| static [FromUtf8](./fromutf8/)(const char *) | utf8 문자열에서 [String](./)을 생성합니다. |
| static [FromUtf8](./fromutf8/)(const char *, int) | utf8 문자열에서 [String](./)을 생성합니다. |
| static [FromUtf8](./fromutf8/)(const uint8_t *) | utf8 문자열에서 [String](./)을 생성합니다. |
| static [FromUtf8](./fromutf8/)(const std::string\&) | utf8 문자열에서 [String](./)을 생성합니다. |
| static [FromWCS](./fromwcs/)(const std::wstring\&) | widestring에서 [String](./)을 생성합니다. |
| [get_Length](./get_length/)() const | 문자열 길이를 가져옵니다. |
| [GetHashCode](./gethashcode/)() const | 해시가 포함된 문자열입니다. ICU에서 구현되었으며, C#의 해시와 일치하지 않습니다. |
| [IndexOf](./indexof/)(const String\&, System::StringComparison) const | 부분 문자열 앞쪽 조회. |
| [IndexOf](./indexof/)(char_t, int) const | 문자 앞쪽 조회. |
| [IndexOf](./indexof/)(char_t, int, int) const | 부분 문자열 내 문자 앞쪽 조회. |
| [IndexOf](./indexof/)(const String\&, int) const | 부분 문자열 앞쪽 조회. |
| [IndexOf](./indexof/)(const String\&, int, System::StringComparison) const | 부분 문자열 앞쪽 조회. |
| [IndexOf](./indexof/)(const String\&, int, int, System::StringComparison) const | 부분 문자열 앞쪽 조회. |
| [IndexOf](./indexof/)(const String\&, int, int) const | 부분 문자열 앞쪽 조회. |
| [IndexOfAny](./indexofany/)(char_t, int) const | 문자 앞쪽 조회. |
| [IndexOfAny](./indexofany/)(const String\&, int) const | 따라서 이 문자열에서 str의 모든 문자를 찾습니다. 첫 번째 문자를 찾으면 해당 위치를 반환하고, 그렇지 않으면 두 번째 문자를 찾아 계속 진행합니다. |
| [IndexOfAny](./indexofany/)(const ArrayPtr\<char_t\>\&) const | 전체 문자열을 통해 전달된 문자 중 하나를 찾습니다. 첫 번째 문자열 문자를 anyOf의 모든 문자와 비교하고, 두 번째 문자와 계속 비교합니다. 대상 문자 중 하나와 일치하는 첫 번째 문자의 인덱스를 반환합니다. |
| [IndexOfAny](./indexofany/)(const ArrayPtr\<char_t\>\&, int32_t) const | 부분 문자열을 통해 전달된 문자 중 하나를 찾습니다. 첫 번째 문자열 문자를 anyOf의 모든 문자와 비교하고, 두 번째 문자와 계속 비교합니다. 대상 문자 중 하나와 일치하는 첫 번째 문자의 인덱스를 반환합니다. |
| [IndexOfAny](./indexofany/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const | 부분 문자열을 통해 전달된 문자 중 하나를 찾습니다. 첫 번째 문자열 문자를 anyOf의 모든 문자와 비교하고, 두 번째 문자와 계속 비교합니다. 대상 문자 중 하나와 일치하는 첫 번째 문자의 인덱스를 반환합니다. |
| [Insert](./insert/)(int, const String\&) const | 지정된 위치에 부분 문자열을 삽입합니다. |
| [Is](./is/)(const System::TypeInfo\&) const | 전달된 [TypeInfo](../typeinfo/)에 지정된 유형인지 문자열 객체를 확인합니다. |
| [IsAsciiString](./isasciistring/)() const | [String](./)이 ASCII 기호만 포함하는지 표시합니다. |
| [IsEmpty](./isempty/)() const | 문자열이 null이 아니면서 비어 있는지 확인합니다. |
| [IsNormalized](./isnormalized/)(System::Text::NormalizationForm) const | 지정된 정규화 형식을 사용하여 유니코드 문자열이 정규화되었는지 확인합니다. |
| [IsNull](./isnull/)() const | 문자열이 null로 간주되는지 확인합니다. [String](./)은 [String()](./string/) 생성자를 통해 생성되었거나, 이동, 복사되었거나 null 문자열에서 할당되었거나, [reset()](./reset/) 메서드가 호출된 경우에만 null입니다. |
| [IsNullOrEmpty](./isnullorempty/)() const | 문자열이 비어 있거나 null로 간주되는지 확인합니다. |
| static [IsNullOrEmpty](./isnullorempty/)(const String\&) | 전달된 문자열이 null이거나 비어 있는지 확인합니다. |
| static [IsNullOrWhiteSpace](./isnullorwhitespace/)(const String\&) | 지정된 문자열이 null인지, 비어 있는지, 혹은 공백 문자만으로 구성되어 있는지 표시합니다. |
| static [Join](./join/)(const String\&, const ArrayPtr\<String\>\&, int, int) | 문자열을 구분자로 사용하여 배열을 결합합니다. |
| static [Join](./join/)(const String\&, const System::Details::ArrayView\<String\>\&, int, int) | 문자열을 구분자로 사용하여 배열을 결합합니다. |
| static [Join](./join/)(const String\&, const SharedPtr\<System::Collections::Generic::IEnumerable\<String\>\>\&) | 문자열을 구분자로 사용하여 배열을 결합합니다. |
| static [Join](./join/)(const String\&, const ArrayPtr\<SharedPtr\<Object\>\>\&) | 문자열을 구분자로 사용하여 배열을 결합합니다. |
| [LastIndexOf](./lastindexof/)(const String\&, int) const | 부분 문자열 뒤쪽 조회. |
| [LastIndexOf](./lastindexof/)(const String\&, System::StringComparison) const | 부분 문자열 뒤쪽 조회. |
| [LastIndexOf](./lastindexof/)(const String\&, int, System::StringComparison) const | 부분 문자열 뒤쪽 조회. |
| [LastIndexOf](./lastindexof/)(const String\&, int, int, StringComparison) const | 부분 문자열 뒤쪽 조회. |
| [LastIndexOf](./lastindexof/)(char_t) const | 문자 뒤쪽 조회. |
| [LastIndexOf](./lastindexof/)(char_t, int32_t) const | 문자 뒤쪽 조회. |
| [LastIndexOf](./lastindexof/)(char_t, int32_t, int32_t) const | 문자 뒤쪽 조회. |
| [LastIndexOfAny](./lastindexofany/)(const ArrayPtr\<char_t\>\&) const | 전체 문자열을 뒤에서부터 전달된 문자 중 하나를 찾습니다. 마지막 문자열 문자를 anyOf의 모든 문자와 비교하고, 이전 문자와 계속 비교합니다. 찾은 첫 번째 일치 항목의 인덱스를 반환합니다. |
| [LastIndexOfAny](./lastindexofany/)(const ArrayPtr\<char_t\>\&, int32_t) const | 부분 문자열을 뒤에서부터 전달된 문자 중 하나를 찾습니다. 마지막 문자열 문자를 anyOf의 모든 문자와 비교하고, 이전 문자와 계속 비교합니다. 찾은 첫 번째 일치 항목의 인덱스를 반환합니다. |
| [LastIndexOfAny](./lastindexofany/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const | 부분 문자열을 뒤에서부터 전달된 문자 중 하나를 찾습니다. 마지막 문자열 문자를 anyOf의 모든 문자와 비교하고, 이전 문자와 계속 비교합니다. 찾은 첫 번째 일치 항목의 인덱스를 반환합니다. |
| [Normalize](./normalize/)(System::Text::NormalizationForm) const | 지정된 정규화 형식을 사용하여 유니코드 문자열을 정규화합니다. |
| [operator!=](./operator!=/)(const String\&) const | 비동등 비교 연산자. |
| [operator!=](./operator!=/)(std::nullptr_t) const | 문자열이 null이 아닌지 확인합니다. [IsNull()](./isnull/) 호출과 동일한 논리를 적용합니다. |
| [operator+](./operator+/)(const String\&) const | [String](./) 연결 연산자. |
| [operator+](./operator+/)(const T\&) const | [String](./) 문자열 리터럴 또는 문자 문자열 포인터와의 연결. |
| [operator+](./operator+/)(char_t) const | 문자열 끝에 문자를 추가합니다. |
| [operator+](./operator+/)(int) const | 문자열 끝에 정수 값의 문자열 표현을 추가합니다. |
| [operator+](./operator+/)(uint32_t) const | 문자열 끝에 부호 없는 정수 값의 문자열 표현을 추가합니다. |
| [operator+](./operator+/)(double) const | 문자열 끝에 부동 소수점 값의 문자열 표현을 추가합니다. |
| [operator+](./operator+/)(int64_t) const | 문자열 끝에 정수 값의 문자열 표현을 추가합니다. |
| [operator+](./operator+/)(const T\&) const | 문자열 끝에 참조 형식 객체의 문자열 표현을 추가합니다. |
| [operator+](./operator+/)(const T\&) const | 문자열 끝에 참조 형식 객체의 문자열 표현을 추가합니다. |
| [operator+](./operator+/)(T) const | 문자열 끝에 불리언 값의 문자열 표현을 추가합니다. |
| [operator+=](./operator+=/)(char_t) | 연결 할당 연산자. |
| [operator+=](./operator+=/)(const String\&) | 연결 할당 연산자. |
| [operator+=](./operator+=/)(double) | 연결 할당 연산자. |
| [operator+=](./operator+=/)(uint8_t) | 연결 할당 연산자. |
| [operator+=](./operator+=/)(int16_t) | 연결 할당 연산자. |
| [operator+=](./operator+=/)(uint16_t) | 연결 할당 연산자. |
| [operator+=](./operator+=/)(int32_t) | 연결 할당 연산자. |
| [operator+=](./operator+=/)(uint32_t) | 연결 할당 연산자. |
| [operator+=](./operator+=/)(int64_t) | 연결 할당 연산자. |
| [operator+=](./operator+=/)(uint64_t) | 연결 할당 연산자. |
| [operator+=](./operator+=/)(T) | 연결 할당 연산자. |
| [operator<](./operator_/)(const String\&) const | 문자열을 순서대로 비교합니다. |
| [operator=](./operator=/)(const String\&) | 할당 연산자. |
| [operator=](./operator=/)(String\&&) | 이동 할당 연산자. |
| [operator==](./operator==/)(const String\&) const | 동등 비교 연산자. |
| [operator==](./operator==/)(std::nullptr_t) const | 문자열이 null인지 확인합니다. [IsNull()](./isnull/) 호출과 동일한 논리를 적용합니다. |
| [operator>](./operator_/)(const String\&) const | 문자열을 순서대로 비교합니다. |
| [operator[]](./operator[]/)(int) const | 지정된 위치의 문자를 가져옵니다. |
| [PadLeft](./padleft/)(int, char_t) const | 원본 문자열 왼쪽에 패딩을 추가합니다. |
| [PadRight](./padright/)(int, char_t) const | 원본 문자열 오른쪽에 패딩을 추가합니다. |
| [rbegin](./rbegin/)() const | 실제 문자열 버퍼의 마지막 문자(있는 경우)로의 역방향 반복자를 반환합니다. |
| [Remove](./remove/)(int32_t, int32_t) const | 현재 문자열에서 부분 문자열을 제외한 모든 것을 추출합니다. |
| [rend](./rend/)() const | 실제 문자열 버퍼의 첫 번째 문자 앞(있는 경우)으로의 역방향 반복자를 반환합니다. |
| [Replace](./replace/)(char_t, char_t) const | 문자열에서 문자의 모든 발생을 교체합니다. |
| [Replace](./replace/)(const String\&, const String\&) const | 이 문자열에서 lookup의 모든 발생을 교체합니다. |
| [reset](./reset/)() | 문자열을 null로 설정합니다. C#에서 'string_variable_name = null'과 유사합니다. |
| [SetCharAt](./setcharat/)(int, char_t) | 지정된 위치에 문자를 설정합니다. |
| [Split](./split/)(char_t, StringSplitOptions) const | 문자를 기준으로 문자열을 분할합니다. |
| [Split](./split/)(char_t, int32_t, StringSplitOptions) const | 문자를 기준으로 문자열을 분할합니다. |
| [Split](./split/)(char_t, char_t, StringSplitOptions) const | 두 문자 중 하나를 기준으로 문자열을 분할합니다. |
| [Split](./split/)(const ArrayPtr\<char_t\>\&, StringSplitOptions) const | 지정된 문자 중 하나로 문자열을 분할합니다. |
| [Split](./split/)(const ArrayPtr\<char_t\>\&, int32_t, StringSplitOptions) const | 지정된 문자 중 하나로 문자열을 분할합니다. |
| [Split](./split/)(const String\&, StringSplitOptions) const | 문자열을 하위 문자열로 분할합니다. |
| [Split](./split/)(const String\&, int, StringSplitOptions) const | 문자열을 하위 문자열로 분할합니다. |
| [Split](./split/)(const ArrayPtr\<String\>\&, StringSplitOptions) const | 문자열을 하위 문자열로 분할합니다. |
| [Split](./split/)(const ArrayPtr\<String\>\&, int, StringSplitOptions) const | 문자열을 하위 문자열로 분할합니다. 현재는 0개 또는 1개의 요소를 가진 구분자 배열만 지원합니다. |
| [StartsWith](./startswith/)(const String\&) const | 문자열이 지정된 하위 문자열로 시작하는지 확인합니다. |
| [StartsWith](./startswith/)(const String\&, System::StringComparison) const | 문자열이 지정된 하위 문자열로 시작하는지 확인합니다. |
| [StartsWith](./startswith/)(const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) const | 문자열이 지정된 하위 문자열로 시작하는지 확인합니다. |
| [String](./string/)() | 기본 생성자. null로 간주되는 문자열 객체를 생성합니다. |
| [String](./string/)(T\&, typename std::enable_if\<IsStringLiteral\<T, char16_t\>::value\>::type *) | 문자열 리터럴을 기반으로 문자열을 생성합니다. 리터럴을 null 종료 문자열로 간주하고, 리터럴 크기를 기준으로 대상 문자열 길이를 계산합니다. |
| [String](./string/)(const T\&, typename std::enable_if\<IsStringPointer\<T, char16_t\>::value\>::type *) | 문자열 포인터를 기반으로 문자열을 생성합니다. 가리키는 문자열을 null 종료 문자열로 처리하고, null 문자 기준으로 대상 문자열 길이를 계산합니다. |
| explicit [String](./string/)(T\&, typename std::enable_if\<IsStringLiteral\<T, char\>::value\>::type *) | 문자열 리터럴을 기반으로 문자열을 생성합니다. 리터럴을 UTF8의 null 종료 문자열로 간주하고, 리터럴 크기를 기준으로 대상 문자열 길이를 계산합니다. |
| explicit [String](./string/)(const T\&, typename std::enable_if\<IsStringPointer\<T, char\>::value\>::type *) | 문자열 포인터를 기반으로 문자열을 생성합니다. 가리키는 문자열을 UTF8의 null 종료 문자열로 처리하고, null 문자 기준으로 대상 문자열 길이를 계산합니다. |
| [String](./string/)(const char16_t *, int) | 문자열 포인터와 명시적 길이를 사용하여 문자열을 생성합니다. |
| [String](./string/)(const char *, int) | 문자열 포인터와 명시적 길이를 사용하여 문자열을 생성합니다. |
| [String](./string/)(const char16_t *, int, int) | 시작 위치와 길이를 사용하여 문자열 포인터에서 문자열을 생성합니다. |
| explicit [String](./string/)(const char16_t, int) | 채우기 생성자. |
| [String](./string/)(const T\&, typename std::enable_if\<std::is_same\<T, std::nullptr_t\>::value\>::type *) | nullptr 생성자. 다른 템플릿 생성자와의 우선순위를 해결하기 위해 템플릿으로 선언되었습니다. |
| explicit [String](./string/)(T\&, typename std::enable_if\<IsStringLiteral\<T, wchar_t\>::value\>::type *) | 와이드 문자열 리터럴을 기반으로 문자열을 생성합니다. 리터럴을 null 종료 문자열로 간주하고, 리터럴 크기를 기준으로 대상 문자열 길이를 계산합니다. 일부 플랫폼에서는 wchar_t 변환이 시간이 많이 소요되므로 암시적 변환이 허용되지 않습니다. |
| explicit [String](./string/)(const T\&, typename std::enable_if\<IsStringPointer\<T, wchar_t\>::value\>::type *) | 와이드 문자 문자열 포인터를 기반으로 문자열을 생성합니다. 가리키는 문자열을 null 종료 문자열로 처리하고, null 문자 기준으로 대상 문자열 길이를 계산합니다. 일부 플랫폼에서는 wchar_t 변환이 시간이 많이 소요되므로 암시적 변환이 허용되지 않습니다. |
| explicit [String](./string/)(const wchar_t *, int) | 와이드 문자 문자열 포인터와 명시적 길이를 사용하여 문자열을 생성합니다. 일부 플랫폼에서는 wchar_t 변환이 시간이 많이 소요되므로 암시적 변환이 허용되지 않습니다. |
| explicit [String](./string/)(const wchar_t, int) | 채우기 생성자. 일부 플랫폼에서는 wchar_t 변환이 시간이 많이 소요되므로 암시적 변환이 허용되지 않습니다. |
| [String](./string/)(const String\&) | 복사 생성자. |
| [String](./string/)(String\&&) | 이동 생성자. |
| [String](./string/)(const ArrayPtr\<char16_t\>\&) | 전체 문자 배열을 문자열로 변환합니다. |
| [String](./string/)(const ArrayPtr\<char16_t\>\&, int, int) | 문자 배열의 부분 범위를 문자열로 변환합니다. 매개변수가 배열 범위를 벗어나면 빈 문자열이 생성됩니다. |
| explicit [String](./string/)(const codeporting_icu::UnicodeString\&) | UnicodeString을 [String](./)으로 래핑합니다. |
| explicit [String](./string/)(codeporting_icu::UnicodeString\&&) | 이동 생성자. |
| explicit [String](./string/)(const std::wstring\&) | widestring에서 [String](./)을 생성합니다. |
| explicit [String](./string/)(const std::u16string\&) | utf16 문자열에서 [String](./)을 생성합니다. |
| explicit [String](./string/)(const std::string\&) | UTF-8 형식으로 제공된 std::string 문자열에서 [String](./)을 생성합니다. |
| explicit [String](./string/)(const std::u32string\&) | std::u32string 문자열에서 [String](./)을 생성합니다. |
| [Substring](./substring/)(int32_t) const | 하위 문자열을 추출합니다. |
| [Substring](./substring/)(int32_t, int32_t) const | 하위 문자열을 추출합니다. |
| [ToAsciiString](./toasciistring/)() const | 문자열을 std::string으로 변환합니다. ASCII 인코딩을 사용합니다. |
| [ToByteArray](./tobytearray/)(int32_t, int32_t, bool) const | 문자열 또는 하위 문자열을 바이트 배열로 변환합니다. |
| [ToCharArray](./tochararray/)(int32_t, int32_t) const | 문자열 또는 하위 문자열을 문자 배열로 변환합니다. |
| [ToLower](./tolower/)() const | 문자열의 모든 문자를 소문자로 변환합니다. |
| [ToLower](./tolower/)(const SharedPtr\<System::Globalization::CultureInfo\>\&) const | 특정 문화권을 사용하여 문자열의 모든 문자를 소문자로 변환합니다. |
| [ToLowerInvariant](./tolowerinvariant/)() const | 불변 문화권을 사용하여 문자열의 모든 문자를 소문자로 변환합니다. |
| [ToString](./tostring/)() const | 값 형식 객체에서 [ToString()](./tostring/)이 호출되는 상황에서 [String](./) 클래스를 처리하기 위한 래퍼입니다. |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | 값 형식 객체에서 [ToString()](./tostring/)이 호출되는 상황에서 [String](./) 클래스를 처리하기 위한 래퍼입니다. |
| [ToU16Str](./tou16str/)() const | 문자열을 std::u16string으로 변환합니다. |
| [ToU32Str](./tou32str/)() const | 문자열을 std::u32string으로 변환합니다. |
| [ToUpper](./toupper/)() const | 문자열의 모든 문자를 대문자로 변환합니다. |
| [ToUpper](./toupper/)(const SharedPtr\<System::Globalization::CultureInfo\>\&) const | 특정 문화권을 사용하여 문자열의 모든 문자를 대문자로 변환합니다. |
| [ToUpperInvariant](./toupperinvariant/)() const | 불변 문화권을 사용하여 문자열의 모든 문자를 대문자로 변환합니다. |
| [ToUtf8String](./toutf8string/)() const | 문자열을 std::string으로 변환합니다. UTF-8 인코딩을 사용합니다. |
| [ToWCS](./towcs/)() const | 문자열을 std::wstring으로 변환합니다. |
| [Trim](./trim/)() const | 문자열의 시작과 끝에서 모든 공백 문자를 제거합니다. |
| [Trim](./trim/)(char_t) const | 전달된 문자에 대한 모든 발생을 문자열의 시작과 끝에서 제거합니다. |
| [Trim](./trim/)(const String\&) const | 전달된 문자들에 대한 모든 발생을 문자열의 시작과 끝에서 제거합니다. |
| [Trim](./trim/)(const ArrayPtr\<char_t\>\&) const | 전달된 문자들에 대한 모든 발생을 문자열의 시작과 끝에서 제거합니다. |
| [TrimEnd](./trimend/)() const | 문자열의 끝에서 모든 공백 문자를 제거합니다. |
| [TrimEnd](./trimend/)(char_t) const | 전달된 문자에 대한 모든 발생을 문자열의 끝에서 제거합니다. |
| [TrimEnd](./trimend/)(const String\&) const | 전달된 문자들에 대한 모든 발생을 문자열의 끝에서 제거합니다. |
| [TrimEnd](./trimend/)(const ArrayPtr\<char_t\>\&) const | 전달된 문자들에 대한 모든 발생을 문자열의 끝에서 제거합니다. |
| [TrimStart](./trimstart/)() const | 문자열의 시작에서 모든 공백 문자를 제거합니다. |
| [TrimStart](./trimstart/)(char_t) const | 전달된 문자에 대한 모든 발생을 문자열의 시작에서 제거합니다. |
| [TrimStart](./trimstart/)(const String\&) const | 전달된 문자들에 대한 모든 발생을 문자열의 시작에서 제거합니다. |
| [TrimStart](./trimstart/)(const ArrayPtr\<char_t\>\&) const | 전달된 문자들에 대한 모든 발생을 문자열의 시작에서 제거합니다. |
| [u_str](./u_str/)() const | ICU 스타일의 널 종료 버퍼를 반환합니다. 문자열을 재할당할 수 있습니다. |
| [~String](./~string/)() | 소멸자. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [Empty](./empty/) | 빈 문자열. |
| static [Null](./null/) | 널 문자열. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [reverse_iterator](./reverse_iterator/) | 역방향 반복자 타입. |
## 비고



```cpp
#include "system/string.h"
#include <iostream>

int main()
{
  // 문자 배열에서 문자열을 구성하고 출력합니다.
  const auto chars = {u'h', u'e', u'l', u'l', u'o'};
  const System::String string1(chars);
  std::cout << string1 << std::endl;

  // 바이트 배열에서 문자열을 구성하고 출력합니다.
  const uint8_t bytes[] = {0x77, 0x6f, 0x72, 0x6c, 0x64, 0x0};
  const auto string2 = System::String::FromUtf8(bytes);
  std::cout << string2 << std::endl;

  // 아래 문자열을 트림하고 출력합니다.
  const System::String string3(u"   This string contains whitespaces in the beginning and at the end.   ");
  std::cout << '"' << string3.Trim() << '"' << std::endl;

  // 문장의 단어 수를 출력합니다.
  std::cout << "Number of words: " << string3.Trim().Split(' ')->get_Length() << std::endl;

  return 0;
}
/*
This code example produces the following output:
hello
world
"This string contains whitespaces in the beginning and at the end."
Number of words: 11
*/
```

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
