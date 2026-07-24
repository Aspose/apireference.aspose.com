---
title: "System::Text::DecoderReplacementFallback 클래스"
linktitle: "DecoderReplacementFallback"
second_title: "C++용 Aspose.Page"
description: "System::Text::DecoderReplacementFallback 클래스. 오류가 있는 기호를 스텁으로 교체하는 폴백 전략을 제공합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여만 할당해야 합니다. 스택에 이 유형의 인스턴스를 만들거나 operator new를 사용하지 마세요. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고 이 포인터를 사용하여 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 700
url: /ko/cpp/system.text/decoderreplacementfallback/
---
## DecoderReplacementFallback class


오류가 있는 기호를 스텁으로 교체하는 폴백 전략을 제공합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여만 할당해야 합니다. 스택에 이 유형의 인스턴스를 만들거나 operator new를 사용하지 마세요. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고 이 포인터를 사용하여 함수 인수로 전달하십시오.

```cpp
class DecoderReplacementFallback : public System::Text::DecoderFallback
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [CreateFallbackBuffer](./createfallbackbuffer/)() override | 폴백 버퍼를 생성합니다. |
| [DecoderReplacementFallback](./decoderreplacementfallback/)() | 기본 "?" 교체 문자열을 사용하는 생성자. |
| [DecoderReplacementFallback](./decoderreplacementfallback/)(const String\&) | 생성자. |
| [get_DefaultString](./get_defaultstring/)() const | 교체 문자열을 가져옵니다. |
| [get_MaxCharCount](./get_maxcharcount/)() const override | 인스턴스가 반환할 수 있는 최대 문자 수를 가져옵니다. |
## 또 보기

* Class [DecoderFallback](../decoderfallback/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
