---
title: "System::Text::Encoder::GetBytes 메서드"
linktitle: "GetBytes"
second_title: "C++용 Aspose.Page"
description: "System::Text::Encoder::GetBytes 메서드. C++에서 버퍼를 인코딩한 결과 바이트를 가져옵니다."
type: docs
weight: 500
url: /ko/cpp/system.text/encoder/getbytes/
---
## Encoder::GetBytes(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, bool) method


버퍼를 인코딩한 결과 바이트를 가져옵니다.

```cpp
virtual int System::Text::Encoder::GetBytes(ArrayPtr<char_t> chars, int charIndex, int charCount, ArrayPtr<uint8_t> bytes, int byteIndex, bool flush)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | 인코드할 문자. |
| charIndex | int | 소스 배열 오프셋. |
| charCount | int | 소스 서브배열 길이. |
| 바이트 | ArrayPtr\<uint8_t\> | 대상 바이트 버퍼. |
| byteIndex | int | 대상 버퍼 오프셋. |
| flush | bool | true이면 계산 후 내부 인코더 상태를 정리합니다. |

### ReturnValue

작성된 바이트 수.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoder::GetBytes(const char_t *, int, uint8_t *, int, bool) method


버퍼를 인코딩한 결과 바이트를 가져옵니다.

```cpp
virtual int System::Text::Encoder::GetBytes(const char_t *chars, int charCount, uint8_t *bytes, int byteCount, bool flush)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| chars | const char_t * | 인코드할 문자. |
| charCount | int | 소스 배열 길이. |
| 바이트 | uint8_t * | 대상 바이트 버퍼. |
| byteCount | int | 대상 버퍼 크기. |
| flush | bool | true이면 계산 후 내부 인코더 상태를 정리합니다. |

### ReturnValue

작성된 바이트 수.

## 또 보기

* Class [Encoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
