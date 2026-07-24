---
title: "System::Text::Decoder::Convert 메서드"
linktitle: "Convert"
second_title: "C++용 Aspose.Page"
description: "System::Text::Decoder::Convert 메서드. C++에서 바이트를 문자로 변환합니다."
type: docs
weight: 100
url: /ko/cpp/system.text/decoder/convert/
---
## Decoder::Convert(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) method


바이트를 문자로 변환합니다.

```cpp
virtual void System::Text::Decoder::Convert(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex, int charCount, bool flush, int &bytesUsed, int &charsUsed, bool &completed)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 바이트 | ArrayPtr\<uint8_t\> | 디코딩할 바이트. |
| byteIndex | int | 입력 버퍼 오프셋. |
| byteCount | int | 입력 버퍼 크기. |
| chars | ArrayPtr\<char_t\> | 대상 문자 버퍼. |
| charIndex | int | 대상 배열 오프셋. |
| charCount | int | 대상 배열 크기. |
| flush | bool | true인 경우, 계산 후 내부 디코더 상태를 정리합니다. |
| bytesUsed | int\& | 읽은 바이트 수를 저장할 변수에 대한 참조. |
| charsUsed | int\& | 작성된 문자 수를 저장할 변수에 대한 참조. |
| completed | bool\& | 입력 버퍼가 소진되면 true로, 그렇지 않으면 false로 설정될 변수에 대한 참조. |

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Decoder::Convert(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) method


바이트를 문자로 변환합니다.

```cpp
virtual void System::Text::Decoder::Convert(const uint8_t *bytes, int byteCount, char_t *chars, int charCount, bool flush, int &bytesUsed, int &charsUsed, bool &completed)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 바이트 | const uint8_t * | 디코딩할 바이트. |
| byteCount | int | 입력 버퍼 크기. |
| chars | char_t * | 대상 문자 버퍼. |
| charCount | int | 대상 배열 크기. |
| flush | bool | true인 경우, 계산 후 내부 디코더 상태를 정리합니다. |
| bytesUsed | int\& | 읽은 바이트 수를 저장할 변수에 대한 참조. |
| charsUsed | int\& | 작성된 문자 수를 저장할 변수에 대한 참조. |
| completed | bool\& | 입력 버퍼가 소진되면 true로, 그렇지 않으면 false로 설정될 변수에 대한 참조. |

## 또 보기

* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
