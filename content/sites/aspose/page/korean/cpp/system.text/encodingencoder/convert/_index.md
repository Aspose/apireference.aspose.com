---
title: "System::Text::EncodingEncoder::Convert 메서드"
linktitle: "Convert"
second_title: "C++용 Aspose.Page"
description: "System::Text::EncodingEncoder::Convert 메서드. C++에서 문자를 바이트로 변환합니다."
type: docs
weight: 100
url: /ko/cpp/system.text/encodingencoder/convert/
---
## EncodingEncoder::Convert(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) method


문자를 바이트로 변환합니다.

```cpp
virtual void System::Text::EncodingEncoder::Convert(ArrayPtr<char_t> chars, int charIndex, int charCount, ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, bool flush, int &charsUsed, int &bytesUsed, bool &completed)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | 인코드할 문자. |
| charIndex | int | 입력 버퍼 오프셋. |
| charCount | int | 입력 버퍼 크기. |
| 바이트 | ArrayPtr\<uint8_t\> | 대상 바이트 버퍼. |
| byteIndex | int | 대상 배열 오프셋. |
| byteCount | int | 대상 배열 크기. |
| flush | bool | true이면 계산 후 내부 인코더 상태를 정리합니다. |
| charsUsed | int\& | 읽은 문자 수를 저장할 변수에 대한 참조. |
| bytesUsed | int\& | 작성된 바이트 수를 저장할 변수에 대한 참조. |
| completed | bool\& | 입력 버퍼가 소진되면 true로, 그렇지 않으면 false로 설정될 변수에 대한 참조. |

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [EncodingEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## EncodingEncoder::Convert(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) method


문자를 바이트로 변환합니다.

```cpp
virtual void System::Text::EncodingEncoder::Convert(const char_t *chars, int charCount, uint8_t *bytes, int byteCount, bool flush, int &charsUsed, int &bytesUsed, bool &completed)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| chars | const char_t * | 인코드할 문자. |
| charCount | int | 입력 버퍼 크기. |
| 바이트 | uint8_t * | 대상 바이트 버퍼. |
| byteCount | int | 대상 배열 크기. |
| flush | bool | true이면 계산 후 내부 인코더 상태를 정리합니다. |
| charsUsed | int\& | 읽은 문자 수를 저장할 변수에 대한 참조. |
| bytesUsed | int\& | 작성된 바이트 수를 저장할 변수에 대한 참조. |
| completed | bool\& | 입력 버퍼가 소진되면 true로, 그렇지 않으면 false로 설정될 변수에 대한 참조. |

## 또 보기

* Class [EncodingEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
