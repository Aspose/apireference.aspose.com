---
title: "System::Text::UTF7Encoding 클래스"
linktitle: "UTF7Encoding"
second_title: "C++용 Aspose.Page"
description: "System::Text::UTF7Encoding 클래스. UTF-7 인코딩을 제공합니다. 이 클래스의 객체는 반드시 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++ 함수의 인자로 전달하십시오."
type: docs
weight: 2700
url: /ko/cpp/system.text/utf7encoding/
---
## UTF7Encoding class


UTF-7 인코딩. 이 클래스의 객체는 반드시 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인자로 전달하십시오.

```cpp
class UTF7Encoding : public System::Text::Encoding
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Clone](./clone/)() override | 인코딩 객체를 복제합니다. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | 객체와 비교합니다. |
| [GetByteCount](./getbytecount/)(const char_t *, int) override | 문자 버퍼를 인코딩하는 데 필요한 문자 수를 가져옵니다. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int) | 문자 버퍼를 인코딩하는 데 필요한 문자 수를 가져옵니다. |
| virtual [GetByteCount](./getbytecount/)(System::Details::ArrayView\<char_t\>, int, int) | 문자 버퍼를 인코딩하는 데 필요한 문자 수를 가져옵니다. |
| [GetByteCount](./getbytecount/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | 문자 버퍼를 인코딩하는 데 필요한 문자 수를 가져옵니다. |
| virtual [GetByteCount](./getbytecount/)(const String\&) | 문자열을 인코딩하는 데 필요한 문자 수를 가져옵니다. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>) | 문자 버퍼를 인코딩하는 데 필요한 문자 수를 가져옵니다. |
| [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) override | 문자 버퍼를 인코딩하여 생성된 바이트를 가져옵니다. |
| [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int) override | 문자 버퍼를 인코딩하여 생성된 바이트를 가져옵니다. |
| [GetBytes](./getbytes/)(const String\&, int, int, ArrayPtr\<uint8_t\>, int) override | 문자 버퍼를 인코딩하여 생성된 바이트를 가져옵니다. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) | 문자 버퍼를 인코딩하여 생성된 바이트를 가져옵니다. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) | 문자 버퍼를 인코딩하여 생성된 바이트를 가져옵니다. |
| virtual [GetBytes](./getbytes/)(const String\&) | 문자 버퍼를 인코딩하여 생성된 바이트를 가져옵니다. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int) | 문자 버퍼를 인코딩하여 생성된 바이트를 가져옵니다. |
| virtual [GetBytes](./getbytes/)(const System::Details::ArrayView\<char_t\>\&, int, int) | 문자 버퍼를 인코딩하여 생성된 바이트를 가져옵니다. |
| [GetBytes](./getbytes/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | 문자 버퍼를 인코딩하여 생성된 바이트를 가져옵니다. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>) | 문자 버퍼를 인코딩하여 생성된 바이트를 가져옵니다. |
| [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) override | 바이트 버퍼를 디코딩하는 데 필요한 문자 수를 가져옵니다. |
| [GetCharCount](./getcharcount/)(const uint8_t *, int) override | 바이트 버퍼를 디코딩하는 데 필요한 문자 수를 가져옵니다. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>) | 바이트 버퍼를 디코딩하는 데 필요한 문자 수를 가져옵니다. |
| [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) override | 바이트 버퍼를 디코딩하여 생성된 문자를 가져옵니다. |
| [GetChars](./getchars/)(const uint8_t *, int, char_t *, int) override | 바이트 버퍼를 디코딩하여 생성된 문자를 가져옵니다. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int) | 바이트 버퍼를 디코딩하여 생성된 문자를 가져옵니다. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>) | 바이트 버퍼를 디코딩하여 생성된 문자를 가져옵니다. |
| [GetDecoder](./getdecoder/)() override | 이 객체에 요청을 전달하는 디코더를 가져옵니다. |
| [GetEncoder](./getencoder/)() override | 이 객체에 요청을 전달하는 인코더를 가져옵니다. |
| [GetHashCode](./gethashcode/)() const override | 인코딩 해시 코드를 가져옵니다. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | 지정된 문자 수를 인코딩하는 데 필요한 최대 바이트 수를 가져옵니다. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | 지정된 바이트 수를 디코딩하는 데 필요한 최대 문자 수를 가져옵니다. |
| [GetString](./getstring/)(ArrayPtr\<uint8_t\>, int, int) override | 바이트 버퍼를 문자열로 디코딩합니다. |
| virtual [GetString](./getstring/)(uint8_t *, int) | 바이트 버퍼를 문자열로 디코딩합니다. |
| virtual [GetString](./getstring/)(ArrayPtr\<uint8_t\>) | 바이트 버퍼를 문자열로 디코딩합니다. |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&) | 바이트 버퍼를 문자열로 디코딩합니다. |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>\&) | 바이트 버퍼를 문자열로 디코딩합니다. |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&, int, int) | 바이트 버퍼를 문자열로 디코딩합니다. |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>, int, int) | 바이트 버퍼를 문자열로 디코딩합니다. |
| [operator==](./operator==/)(const UTF7Encoding\&) const | 인코딩 매개변수를 비교합니다. |
| [UTF7Encoding](./utf7encoding/)() | 생성자. |
| [UTF7Encoding](./utf7encoding/)(bool) | 생성자. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | 기본 코드 페이지 값. |
| static constexpr [UTF7_CODE_PAGE](./utf7_code_page/) | UTF-7 코드 페이지 ID에 사용되는 매직 넘버로, [Windows](../../system.windows/)에서 사용됩니다. |
## 또 보기

* Class [Encoding](../encoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
