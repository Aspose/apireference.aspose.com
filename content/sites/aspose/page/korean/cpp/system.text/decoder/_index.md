---
title: "System::Text::Decoder 클래스"
linktitle: "Decoder"
second_title: "C++용 Aspose.Page"
description: "System::Text::Decoder 클래스. 바이트 시퀀스를 문자 시퀀스로 디코딩하는 기능을 캡슐화합니다. 이 클래스의 객체는 반드시 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++ 함수의 인자로 전달하십시오."
type: docs
weight: 200
url: /ko/cpp/system.text/decoder/
---
## Decoder class


바이트 시퀀스를 문자 시퀀스로 디코딩하는 기능을 캡슐화합니다. 이 클래스의 객체는 반드시 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인자로 전달하십시오.

```cpp
class Decoder : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) | 바이트를 문자로 변환합니다. |
| virtual [Convert](./convert/)(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) | 바이트를 문자로 변환합니다. |
| [get_Fallback](./get_fallback/)() const | 오류 처리 폴백을 가져옵니다. |
| [get_FallbackBuffer](./get_fallbackbuffer/)() const | 폴백 버퍼를 가져옵니다. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | 버퍼를 디코딩하는 데 필요한 문자 수를 가져옵니다. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int, bool) | 버퍼를 디코딩하는 데 필요한 문자 수를 가져옵니다. |
| virtual [GetCharCount](./getcharcount/)(const uint8_t *, int, bool) | 버퍼를 디코딩하는 데 필요한 문자 수를 가져옵니다. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | 버퍼를 디코딩한 결과 문자를 가져옵니다. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, bool) | 버퍼를 디코딩한 결과 문자를 가져옵니다. |
| virtual [GetChars](./getchars/)(const uint8_t *, int, char_t *, int, bool) | 버퍼를 디코딩한 결과 문자를 가져옵니다. |
| virtual [Reset](./reset/)() | 디코더 내부 상태를 정리합니다. |
| [set_Fallback](./set_fallback/)(const DecoderFallbackPtr\&) | 오류 처리 폴백을 설정합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
