---
title: "System::Text::EncoderReplacementFallbackBuffer 클래스"
linktitle: "EncoderReplacementFallbackBuffer"
second_title: "C++용 Aspose.Page"
description: "System::Text::EncoderReplacementFallbackBuffer 클래스. 인코딩 폴백 전략을 대체하기 위한 버퍼입니다. 이 클래스의 객체는 반드시 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++ 함수의 인자로 전달하십시오."
type: docs
weight: 1500
url: /ko/cpp/system.text/encoderreplacementfallbackbuffer/
---
## EncoderReplacementFallbackBuffer class


[Buffer](../../system/buffer/) for replacing encoding fallback strategy. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EncoderReplacementFallbackBuffer : public System::Text::EncoderFallbackBuffer
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [EncoderReplacementFallbackBuffer](./encoderreplacementfallbackbuffer/)(const EncoderReplacementFallbackPtr\&) | 생성자. |
| [Fallback](./fallback/)(char_t, int) override | 인코딩 실패를 처리합니다. |
| [Fallback](./fallback/)(char_t, char_t, int) override | 인코딩 실패를 처리합니다. |
| [get_Remaining](./get_remaining/)() const override | 버퍼에 남아 있는 문자 수를 가져옵니다. |
| [GetNextChar](./getnextchar/)() override | 다음 사용 가능한 문자를 가져옵니다. |
| [MovePrevious](./moveprevious/)() override | 이전 문자로 이동합니다. |
| [Reset](./reset/)() override | 버퍼를 초기 상태로 재설정합니다 ( [Fallback()](./fallback/) 호출 이전). |
## 또 보기

* Class [EncoderFallbackBuffer](../encoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
