---
title: "System::Text::EncoderFallback 클래스"
linktitle: "EncoderFallback"
second_title: "C++용 Aspose.Page"
description: "System::Text::EncoderFallback 클래스. 인코딩 오류를 처리하기 위한 폴백 API를 제공합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하는 데 사용하십시오."
type: docs
weight: 1200
url: /ko/cpp/system.text/encoderfallback/
---
## EncoderFallback class


인코딩 오류를 처리하기 위한 폴백 API를 제공합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하는 데 사용하십시오.

```cpp
class EncoderFallback : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [CreateFallbackBuffer](./createfallbackbuffer/)() | 폴백 알고리즘과 연결된 버퍼를 가져옵니다. |
| static [get_ExceptionFallback](./get_exceptionfallback/)() | 기본 예외 폴백 구현을 가져옵니다. |
| virtual [get_MaxCharCount](./get_maxcharcount/)() const | 폴백에서 반환될 수 있는 최대 문자 수를 가져옵니다. |
| static [get_ReplacementFallback](./get_replacementfallback/)() | 기본 교체 폴백 구현을 가져옵니다. |
| static [get_StandardSafeFallback](./get_standardsafefallback/)() | 기본 표준 안전 폴백 구현을 가져옵니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
