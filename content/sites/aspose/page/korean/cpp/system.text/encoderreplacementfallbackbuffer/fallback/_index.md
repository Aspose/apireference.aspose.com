---
title: "System::Text::EncoderReplacementFallbackBuffer::Fallback 메서드"
linktitle: "Fallback"
second_title: "C++용 Aspose.Page"
description: "System::Text::EncoderReplacementFallbackBuffer::Fallback 메서드. C++에서 인코딩 실패를 처리합니다."
type: docs
weight: 200
url: /ko/cpp/system.text/encoderreplacementfallbackbuffer/fallback/
---
## EncoderReplacementFallbackBuffer::Fallback(char_t, int) method


인코딩 실패를 처리합니다.

```cpp
virtual bool System::Text::EncoderReplacementFallbackBuffer::Fallback(char_t charUnknown, int index) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| charUnknown | char_t | 알 수 없는 문자; 무시되었습니다. |
| index | int | 알 수 없는 문자 위치; 무시되었습니다. |

### ReturnValue

대체 문자열이 제공되고 비어 있지 않으면 true, 그렇지 않으면 false.

## 또 보기

* Class [EncoderReplacementFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## EncoderReplacementFallbackBuffer::Fallback(char_t, char_t, int) method


인코딩 실패를 처리합니다.

```cpp
virtual bool System::Text::EncoderReplacementFallbackBuffer::Fallback(char_t charUnknownHigh, char_t charUnknownLow, int index) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| charUnknownHigh | char_t | 오류를 발생시킨 서러게이트 쌍의 높은 부분. |
| charUnknownLow | char_t | 오류를 발생시킨 서러게이트 쌍의 낮은 부분. |
| index | int | 알 수 없는 문자 위치; 무시되었습니다. |

### ReturnValue

대체 문자열이 제공되고 비어 있지 않으면 true, 그렇지 않으면 false.

## 또 보기

* Class [EncoderReplacementFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
