---
title: "System::Text::EncoderExceptionFallback 클래스"
linktitle: "EncoderExceptionFallback"
second_title: "C++용 Aspose.Page"
description: "System::Text::EncoderExceptionFallback 클래스. 예외를 발생시키는 폴백 전략을 제공합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인자로 전달하십시오."
type: docs
weight: 1000
url: /ko/cpp/system.text/encoderexceptionfallback/
---
## EncoderExceptionFallback class


예외를 발생시키는 폴백 전략을 제공합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여만 할당해야 합니다. 스택에 이 유형의 인스턴스를 만들거나 operator new를 사용하지 마세요. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고 이 포인터를 사용하여 함수 인수로 전달하십시오.

```cpp
class EncoderExceptionFallback : public System::Text::EncoderFallback
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [CreateFallbackBuffer](./createfallbackbuffer/)() override | 폴백 버퍼를 생성합니다. |
| [EncoderExceptionFallback](./encoderexceptionfallback/)() | 생성자. |
| [get_MaxCharCount](./get_maxcharcount/)() const override | 인스턴스가 반환할 수 있는 최대 문자 수를 가져옵니다. |
## 또 보기

* Class [EncoderFallback](../encoderfallback/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
