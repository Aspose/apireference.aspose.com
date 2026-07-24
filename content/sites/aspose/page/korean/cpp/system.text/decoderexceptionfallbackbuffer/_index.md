---
title: "System::Text::DecoderExceptionFallbackBuffer 클래스"
linktitle: "DecoderExceptionFallbackBuffer"
second_title: "C++용 Aspose.Page"
description: "System::Text::DecoderExceptionFallbackBuffer 클래스. 예외를 발생시키는 디코딩 폴백 전략을 위한 버퍼입니다. 실제로는 아무것도 저장하지 않고 대신 예외를 발생시킵니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 만들거나 operator new를 사용하지 마십시오. 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++ 함수에 인수로 전달하십시오."
type: docs
weight: 400
url: /ko/cpp/system.text/decoderexceptionfallbackbuffer/
---
## DecoderExceptionFallbackBuffer class


[Buffer](../../system/buffer/) for exception-throwing decoding fallback strategy. Doesn't store anything actually, but throws instead. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class DecoderExceptionFallbackBuffer : public System::Text::DecoderFallbackBuffer
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [DecoderExceptionFallbackBuffer](./decoderexceptionfallbackbuffer/)() | 생성자. |
| [Fallback](./fallback/)(ArrayPtr\<uint8_t\>, int) override | 디코딩 실패를 처리합니다. |
| [get_Remaining](./get_remaining/)() const override | 남은 문자 수를 가져옵니다. |
| [GetNextChar](./getnextchar/)() override | 다음 사용 가능한 문자를 가져옵니다. |
| [MovePrevious](./moveprevious/)() override | 이전 문자로 이동합니다. |
## 또 보기

* Class [DecoderFallbackBuffer](../decoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
