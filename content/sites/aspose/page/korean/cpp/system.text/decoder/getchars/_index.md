---
title: "System::Text::Decoder::GetChars 메서드"
linktitle: "GetChars"
second_title: "C++용 Aspose.Page"
description: "System::Text::Decoder::GetChars 메서드. C++에서 버퍼를 디코딩한 결과 문자를 가져옵니다."
type: docs
weight: 500
url: /ko/cpp/system.text/decoder/getchars/
---
## Decoder::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) method


버퍼를 디코딩한 결과 문자를 가져옵니다.

```cpp
virtual int System::Text::Decoder::GetChars(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 바이트 | ArrayPtr\<uint8_t\> | 디코딩할 바이트. |
| byteIndex | int | 입력 버퍼 오프셋. |
| byteCount | int | 입력 버퍼 크기. |
| chars | ArrayPtr\<char_t\> | 대상 문자 버퍼. |
| charIndex | int | 대상 배열 오프셋. |

### ReturnValue

작성된 문자 수.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Decoder::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, bool) method


버퍼를 디코딩한 결과 문자를 가져옵니다.

```cpp
virtual int System::Text::Decoder::GetChars(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex, bool flush)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 바이트 | ArrayPtr\<uint8_t\> | 디코딩할 바이트. |
| byteIndex | int | 입력 버퍼 오프셋. |
| byteCount | int | 입력 버퍼 크기. |
| chars | ArrayPtr\<char_t\> | 대상 문자 버퍼. |
| charIndex | int | 대상 배열 오프셋. |
| flush | bool | true인 경우, 계산 후 내부 디코더 상태를 정리합니다. |

### ReturnValue

작성된 문자 수.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Decoder::GetChars(const uint8_t *, int, char_t *, int, bool) method


버퍼를 디코딩한 결과 문자를 가져옵니다.

```cpp
virtual int System::Text::Decoder::GetChars(const uint8_t *bytes, int byteCount, char_t *chars, int charCount, bool flush)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 바이트 | const uint8_t * | 디코딩할 바이트. |
| byteCount | int | 입력 버퍼 크기. |
| chars | char_t * | 대상 문자 버퍼. |
| charCount | int | 대상 배열 크기. |
| flush | bool | true인 경우, 계산 후 내부 디코더 상태를 정리합니다. |

### ReturnValue

작성된 문자 수.

## 또 보기

* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
