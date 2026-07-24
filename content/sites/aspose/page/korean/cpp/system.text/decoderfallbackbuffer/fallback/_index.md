---
title: "System::Text::DecoderFallbackBuffer::Fallback 메서드"
linktitle: "Fallback"
second_title: "C++용 Aspose.Page"
description: "System::Text::DecoderFallbackBuffer::Fallback 메서드. C++에서 실제 폴백 절차를 구현합니다."
type: docs
weight: 100
url: /ko/cpp/system.text/decoderfallbackbuffer/fallback/
---
## DecoderFallbackBuffer::Fallback method


실제 폴백 절차를 구현합니다.

```cpp
virtual bool System::Text::DecoderFallbackBuffer::Fallback(ArrayPtr<uint8_t> bytesUnknown, int index)=0
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| bytesUnknown | ArrayPtr\<uint8_t\> | [Array](../../../system/array/) 디코더가 디코딩에 실패하는 바이트를 포함하는 바이트 배열. |
| index | int | 오류를 발생시킨 바이트의 인덱스. |

### ReturnValue

버퍼가 알 수 없는 바이트를 처리하면 true, 무시하면 false.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [DecoderFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
