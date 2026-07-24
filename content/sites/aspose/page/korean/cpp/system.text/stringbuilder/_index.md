---
title: "System::Text::StringBuilder 클래스"
linktitle: "StringBuilder"
second_title: "C++용 Aspose.Page"
description: "System::Text::StringBuilder 클래스. 문자열을 부분별로 누적하는 버퍼입니다. 이 타입은 값 타입으로 스택에 할당하거나 System::MakeObject() 함수를 사용해 힙에 할당할 수 있습니다. 객체가 할당된 후에는 이 두 사용 사례를 절대 혼합하지 마세요: 스택에 할당된 객체에 대한 SmartPtr 포인터를 사용하는 것은 C++에서 엄격히 금지됩니다."
type: docs
weight: 2400
url: /ko/cpp/system.text/stringbuilder/
---
## StringBuilder class


[Buffer](../../system/buffer/) to accumulate string part by part. This type can be allocated either in stack as value type or in heap using [System::MakeObject()](../../system/makeobject/) function. Once the object is allocated, never mix up these two usecases: having [SmartPtr](../../system/smartptr/) pointers onto stack-allocated objects is strictly prohibited.

```cpp
class StringBuilder : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Append](./append/)(char_t) | 문자를 빌더에 추가합니다. |
| [Append](./append/)(char_t, int) | 문자들을 빌더에 추가합니다. |
| [Append](./append/)(const ArrayPtr\<char_t\>\&) | 문자 배열을 빌더에 추가합니다. |
| [Append](./append/)(const ArrayPtr\<char_t\>\&, int, int) | 문자 배열 슬라이스를 빌더에 추가합니다. |
| [Append](./append/)(const String\&) | 문자열을 빌더에 추가합니다. |
| [Append](./append/)(const String\&, int, int) | 문자열 슬라이스를 빌더에 추가합니다. |
| [Append](./append/)(const SharedPtr\<T\>\&) | 객체의 문자열 표현을 빌더에 추가합니다. |
| [Append](./append/)(const SharedPtr\<StringBuilder\>\&) | 빌더의 내용을 빌더에 추가합니다. |
| [Append](./append/)(float) | 부동 소수점 값을 빌더에 추가합니다. |
| [Append](./append/)(double) | 부동 소수점 값을 빌더에 추가합니다. |
| [Append](./append/)(int) | 정수 값을 빌더에 추가합니다. |
| [Append](./append/)(T) | 산술 값을 빌더에 추가합니다. |
| [Append](./append/)(E) | 빌더에 열거형 값 문자열 표현을 추가합니다. |
| [AppendFormat](./appendformat/)(const String\&, const TArgs\&...) | 포맷된 문자열을 빌더에 추가합니다. |
| [AppendFormat](./appendformat/)(const SharedPtr\<IFormatProvider\>\&, const String\&, const TArgs\&...) | 포맷된 문자열을 빌더에 추가합니다. |
| [AppendLine](./appendline/)() | 새 줄 문자를 빌더에 추가합니다. |
| [AppendLine](./appendline/)(const String\&) | 문자열과 새 줄 문자를 빌더에 추가합니다. |
| [Clear](./clear/)() | 빌더에서 모든 문자를 제거합니다. |
| [CopyTo](./copyto/)(int, System::ArrayPtr\<char_t\> const\&, int, int) | 빌더의 데이터를 기존 배열 위치에 복사합니다. |
| [get_Capacity](./get_capacity/)() const | 문자열 빌더의 현재 용량을 가져옵니다. |
| [get_Length](./get_length/)() const | 빌더에 현재 있는 문자열의 길이를 가져옵니다. |
| [idx_get](./idx_get/)(int) const | 지정된 위치의 문자를 가져옵니다. |
| [idx_set](./idx_set/)(int, char_t) | 지정된 위치에 문자를 설정합니다. |
| [Insert](./insert/)(int, const String\&) | 문자열을 빌더의 고정 위치에 삽입합니다. |
| [Insert](./insert/)(int32_t, const String\&, int32_t) | 반복 문자열을 빌더의 고정 위치에 삽입합니다. |
| [Insert](./insert/)(int, char_t) | 문자를 빌더의 고정 위치에 삽입합니다. |
| [Insert](./insert/)(int, const System::ArrayPtr\<char_t\>\&, int, int) | 문자들을 빌더의 고정 위치에 삽입합니다. |
| [Insert](./insert/)(int, T) | 값을 빌더의 고정 위치에 삽입합니다. |
| [operator[]](./operator[]/)(int) const | 지정된 위치의 문자를 가져옵니다. |
| [Remove](./remove/)(int, int) | 빌더에서 조각을 제거합니다. |
| [Replace](./replace/)(const String\&, const String\&) | 빌더를 통해 부분 문자열을 교체합니다. |
| [Replace](./replace/)(const String\&, const String\&, int, int) | 빌더의 범위를 통해 부분 문자열을 교체합니다. |
| [Replace](./replace/)(char_t, char_t) | 빌더를 통해 문자를 교체합니다. |
| [Replace](./replace/)(char_t, char_t, int, int) | 빌더의 범위를 통해 문자를 교체합니다. |
| [set_Capacity](./set_capacity/)(int) | 문자열 빌더의 현재 용량을 설정합니다. |
| [set_Length](./set_length/)(int) | 문자열 빌더를 지정된 길이로 잘라내거나 확장합니다. |
| [StringBuilder](./stringbuilder/)() | 생성자. |
| [StringBuilder](./stringbuilder/)(int) | 생성자. |
| [StringBuilder](./stringbuilder/)(const String\&) | 생성자. |
| [StringBuilder](./stringbuilder/)(const String\&, int) | 생성자. |
| [StringBuilder](./stringbuilder/)(const String\&, int, int, int) | 생성자. |
| [ToString](./tostring/)() const override | 빌더에 현재 포함된 문자열을 가져옵니다. |
| [ToString](./tostring/)(int, int) const | 빌더에 현재 포함된 부분 문자열을 가져옵니다. |
| [~StringBuilder](./~stringbuilder/)() | 소멸자. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
