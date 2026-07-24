---
title: "System::Text::ICUDecoder 클래스"
linktitle: "ICUDecoder"
second_title: "C++용 Aspose.Page"
description: "System::Text::ICUDecoder 클래스. ICU를 사용하여 디코딩하는 디코더입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마세요. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용하여 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 2000
url: /ko/cpp/system.text/icudecoder/
---
## ICUDecoder class


[Decoder](../decoder/) that uses ICU for decoding. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ICUDecoder : public System::Text::Decoder
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) | 바이트를 문자로 변환합니다. |
| virtual [Convert](./convert/)(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) | 바이트를 문자로 변환합니다. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | 버퍼를 디코딩하는 데 필요한 문자 수를 가져옵니다. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int, bool) | 버퍼를 디코딩하는 데 필요한 문자 수를 가져옵니다. |
| virtual [GetCharCount](./getcharcount/)(const uint8_t *, int, bool) | 버퍼를 디코딩하는 데 필요한 문자 수를 가져옵니다. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | 버퍼를 디코딩한 결과 문자를 가져옵니다. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, bool) | 버퍼를 디코딩한 결과 문자를 가져옵니다. |
| virtual [GetChars](./getchars/)(const uint8_t *, int, char_t *, int, bool) | 버퍼를 디코딩한 결과 문자를 가져옵니다. |
| [ICUDecoder](./icudecoder/)(ICUEncoding *) | 생성자. |
| virtual [Reset](./reset/)() | 내부 변수를 초기 상태로 설정합니다. |
| virtual [~ICUDecoder](./~icudecoder/)() | 소멸자. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Base](./base/) | [Base](./base/) 유형. |
## 또 보기

* Class [Decoder](../decoder/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
