---
title: "System::Text::EncoderFallbackBuffer::Fallback 메서드"
linktitle: "Fallback"
second_title: "C++용 Aspose.Page"
description: "System::Text::EncoderFallbackBuffer::Fallback 메서드. C++에서 실제 대체 절차를 구현합니다."
type: docs
weight: 100
url: /ko/cpp/system.text/encoderfallbackbuffer/fallback/
---
## EncoderFallbackBuffer::Fallback(char_t, int) method


실제 폴백 절차를 구현합니다.

```cpp
virtual bool System::Text::EncoderFallbackBuffer::Fallback(char_t charUnknown, int index)=0
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| charUnknown | char_t | 문자 인코더가 인코딩에 실패했습니다. |
| index | int | 오류를 발생시킨 문자 인덱스. |

### ReturnValue

버퍼가 알 수 없는 문자를 처리하면 true, 무시하면 false.

## 또 보기

* Class [EncoderFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## EncoderFallbackBuffer::Fallback(char_t, char_t, int) method


실제 폴백 절차를 구현합니다.

```cpp
virtual bool System::Text::EncoderFallbackBuffer::Fallback(char_t charUnknownHigh, char_t charUnknownLow, int index)=0
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| charUnknownHigh | char_t | 오류를 발생시킨 서러게이트 쌍의 높은 부분. |
| charUnknownLow | char_t | 오류를 발생시킨 서러게이트 쌍의 낮은 부분. |
| index | int | 오류를 발생시킨 문자 인덱스. |

### ReturnValue

버퍼가 알 수 없는 문자를 처리하면 true, 무시하면 false.

## 또 보기

* Class [EncoderFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
