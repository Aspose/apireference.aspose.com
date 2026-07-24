---
title: "System::Text::DecoderReplacementFallbackBuffer::Fallback 메서드"
linktitle: "Fallback"
second_title: "C++용 Aspose.Page"
description: "System::Text::DecoderReplacementFallbackBuffer::Fallback 메서드. C++에서 디코딩 실패를 처리합니다."
type: docs
weight: 200
url: /ko/cpp/system.text/decoderreplacementfallbackbuffer/fallback/
---
## DecoderReplacementFallbackBuffer::Fallback method


디코딩 실패를 처리합니다.

```cpp
virtual bool System::Text::DecoderReplacementFallbackBuffer::Fallback(ArrayPtr<uint8_t> bytesUnknown, int index) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| bytesUnknown | ArrayPtr\<uint8_t\> | 알 수 없는 바이트의 [Array](../../../system/array/); 무시됨. |
| index | int | 알 수 없는 바이트 오프셋; 무시됨. |

### ReturnValue

대체 문자열이 제공되고 비어 있지 않으면 true, 그렇지 않으면 false.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [DecoderReplacementFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
