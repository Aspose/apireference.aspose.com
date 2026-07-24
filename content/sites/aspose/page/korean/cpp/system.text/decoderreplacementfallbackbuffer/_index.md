---
title: "System::Text::DecoderReplacementFallbackBuffer 클래스"
linktitle: "DecoderReplacementFallbackBuffer"
second_title: "C++용 Aspose.Page"
description: "System::Text::DecoderReplacementFallbackBuffer 클래스. C++에서 디코딩 폴백 전략을 교체하기 위한 버퍼."
type: docs
weight: 800
url: /ko/cpp/system.text/decoderreplacementfallbackbuffer/
---
## DecoderReplacementFallbackBuffer class


[Buffer](../../system/buffer/) for replacing decoding fallback strategy.

```cpp
class DecoderReplacementFallbackBuffer : public System::Text::DecoderFallbackBuffer
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [DecoderReplacementFallbackBuffer](./decoderreplacementfallbackbuffer/)(const DecoderReplacementFallbackPtr\&) | 생성자. |
| [Fallback](./fallback/)(ArrayPtr\<uint8_t\>, int) override | 디코딩 실패를 처리합니다. |
| [get_Remaining](./get_remaining/)() const override | 버퍼에 남아 있는 문자 수를 가져옵니다. |
| [GetNextChar](./getnextchar/)() override | 다음 사용 가능한 문자를 가져옵니다. |
| [MovePrevious](./moveprevious/)() override | 이전 문자로 이동합니다. |
| [Reset](./reset/)() override | 버퍼를 초기 상태로 재설정합니다 ( [Fallback()](./fallback/) 호출 이전). |
## 또 보기

* Class [DecoderFallbackBuffer](../decoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
