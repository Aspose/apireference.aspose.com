---
title: "System::Text::ICUEncoding 클래스"
linktitle: "ICUEncoding"
second_title: "C++용 Aspose.Page"
description: "System::Text::ICUEncoding 클래스. ICU 기반 인코딩 구현. 내부 전용. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마세요. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하세요."
type: docs
weight: 2200
url: /ko/cpp/system.text/icuencoding/
---
## ICUEncoding class


ICU 기반 인코딩 구현. 내부 사용 전용. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인자로 전달하십시오.

```cpp
class ICUEncoding : public System::Text::Encoding
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [GetByteCount](./getbytecount/)(const char_t *, int) override | 문자 버퍼를 인코딩하는 데 필요한 문자 수를 가져옵니다. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int) | RTTI. |
| virtual [GetByteCount](./getbytecount/)(System::Details::ArrayView\<char_t\>, int, int) | RTTI. |
| [GetByteCount](./getbytecount/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | RTTI. |
| virtual [GetByteCount](./getbytecount/)(const String\&) | RTTI. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>) | RTTI. |
| [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int) override | 문자 버퍼를 인코딩하여 생성된 바이트를 가져옵니다. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) | 문자 버퍼를 인코딩하여 생성된 바이트를 가져옵니다. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) | 문자 버퍼를 인코딩하여 생성된 바이트를 가져옵니다. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) | 문자 버퍼를 인코딩하여 생성된 바이트를 가져옵니다. |
| virtual [GetBytes](./getbytes/)(const String\&, int, int, ArrayPtr\<uint8_t\>, int) | 문자 버퍼를 인코딩하여 생성된 바이트를 가져옵니다. |
| virtual [GetBytes](./getbytes/)(const String\&) | 문자 버퍼를 인코딩하여 생성된 바이트를 가져옵니다. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int) | 문자 버퍼를 인코딩하여 생성된 바이트를 가져옵니다. |
| virtual [GetBytes](./getbytes/)(const System::Details::ArrayView\<char_t\>\&, int, int) | 문자 버퍼를 인코딩하여 생성된 바이트를 가져옵니다. |
| [GetBytes](./getbytes/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | 문자 버퍼를 인코딩하여 생성된 바이트를 가져옵니다. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>) | 문자 버퍼를 인코딩하여 생성된 바이트를 가져옵니다. |
| [GetCharCount](./getcharcount/)(const uint8_t *, int) override | 바이트 버퍼를 디코딩하는 데 필요한 문자 수를 가져옵니다. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | 바이트 버퍼를 디코딩하는 데 필요한 문자 수를 가져옵니다. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>) | 바이트 버퍼를 디코딩하는 데 필요한 문자 수를 가져옵니다. |
| [GetChars](./getchars/)(const uint8_t *, int, char_t *, int) override | 바이트 버퍼를 디코딩하여 생성된 문자를 가져옵니다. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | 바이트 버퍼를 디코딩하여 생성된 문자를 가져옵니다. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int) | 바이트 버퍼를 디코딩하여 생성된 문자를 가져옵니다. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>) | 바이트 버퍼를 디코딩하여 생성된 문자를 가져옵니다. |
| [GetDecoder](./getdecoder/)() override | 이 객체에 요청을 전달하는 디코더를 가져옵니다. |
| [GetEncoder](./getencoder/)() override | 이 객체에 요청을 전달하는 인코더를 가져옵니다. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | 지정된 문자 수를 인코딩하는 데 필요한 최대 바이트 수를 가져옵니다. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | 지정된 바이트 수를 디코딩하는 데 필요한 최대 문자 수를 가져옵니다. |
| [GetPreamble](./getpreamble/)() override | 인코딩을 나타내는 바이트 시퀀스(예: BOM)를 반환합니다. |
| [ICUEncoding](./icuencoding/)(const Details::EncodingInfoInternal *) | 생성자. |
| [operator==](./operator==/)(const ICUEncoding\&) const | 코드 페이지를 사용하여 인코딩을 비교합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | 기본 코드 페이지 값. |
## 또 보기

* Class [Encoding](../encoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
