---
title: "System::Text::Encoder 클래스"
linktitle: "Encoder"
second_title: "C++용 Aspose.Page"
description: "System::Text::Encoder 클래스. 문자 시퀀스를 바이트 시퀀스로 인코딩합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마세요. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용하여 함수 인수로 전달하십시오."
type: docs
weight: 900
url: /ko/cpp/system.text/encoder/
---
## Encoder class


문자 시퀀스를 바이트 시퀀스로 인코딩합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마세요. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 사용하여 함수 인수로 전달하십시오.

```cpp
class Encoder : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) | 문자를 바이트로 변환합니다. |
| virtual [Convert](./convert/)(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) | 문자를 바이트로 변환합니다. |
| [get_Fallback](./get_fallback/)() const | 오류 처리 폴백을 가져옵니다. |
| [get_FallbackBuffer](./get_fallbackbuffer/)() const | 폴백 버퍼를 가져옵니다. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int, bool) | 버퍼를 인코딩하는 데 필요한 바이트 수를 가져옵니다. |
| virtual [GetByteCount](./getbytecount/)(const char_t *, int, bool) | 버퍼를 인코딩하는 데 필요한 바이트 수를 가져옵니다. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, bool) | 버퍼를 인코딩한 결과 바이트를 가져옵니다. |
| virtual [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int, bool) | 버퍼를 인코딩한 결과 바이트를 가져옵니다. |
| virtual [Reset](./reset/)() | 인코더 내부 상태를 정리합니다. |
| [set_Fallback](./set_fallback/)(const EncoderFallbackPtr\&) | 오류 처리 폴백을 설정합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
