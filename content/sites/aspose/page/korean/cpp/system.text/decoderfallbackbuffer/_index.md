---
title: "System::Text::DecoderFallbackBuffer 클래스"
linktitle: "DecoderFallbackBuffer"
second_title: "C++용 Aspose.Page"
description: "System::Text::DecoderFallbackBuffer 클래스. 폴백 구현을 위한 버퍼를 제공합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하는 데 사용하십시오."
type: docs
weight: 600
url: /ko/cpp/system.text/decoderfallbackbuffer/
---
## DecoderFallbackBuffer class


폴백 구현을 위한 버퍼를 제공합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class DecoderFallbackBuffer : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [Fallback](./fallback/)(ArrayPtr\<uint8_t\>, int) | 실제 폴백 절차를 구현합니다. |
| virtual [get_Remaining](./get_remaining/)() const | 처리할 남은 문자 수를 가져옵니다. |
| virtual [GetNextChar](./getnextchar/)() | 폴백 버퍼에서 다음 문자를 추출합니다. |
| virtual [MovePrevious](./moveprevious/)() | 가능하면 버퍼 위치를 한 단계 뒤로 이동합니다. |
| virtual [Reset](./reset/)() | 버퍼를 초기 상태로 재설정합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
