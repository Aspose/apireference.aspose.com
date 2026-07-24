---
title: "System::Text::ICUDecoder::GetCharCount 메서드"
linktitle: "GetCharCount"
second_title: "C++용 Aspose.Page"
description: "System::Text::ICUDecoder::GetCharCount 메서드. C++에서 버퍼를 디코딩하는 데 필요한 문자 수를 가져옵니다."
type: docs
weight: 400
url: /ko/cpp/system.text/icudecoder/getcharcount/
---
## ICUDecoder::GetCharCount(ArrayPtr\<uint8_t\>, int, int) method


버퍼를 디코딩하는 데 필요한 문자 수를 가져옵니다.

```cpp
virtual int System::Text::ICUDecoder::GetCharCount(ArrayPtr<uint8_t> bytes, int index, int count)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 바이트 | ArrayPtr\<uint8_t\> | 디코딩할 바이트. |
| index | int | [Buffer](../../../system/buffer/) 오프셋. |
| count | int | 디코드할 바이트 수. |

### ReturnValue

버퍼를 디코딩하는 데 필요한 문자 수.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUDecoder::GetCharCount(ArrayPtr\<uint8_t\>, int, int, bool) method


버퍼를 디코딩하는 데 필요한 문자 수를 가져옵니다.

```cpp
virtual int System::Text::ICUDecoder::GetCharCount(ArrayPtr<uint8_t> bytes, int index, int count, bool flush)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 바이트 | ArrayPtr\<uint8_t\> | 디코딩할 바이트. |
| index | int | [Buffer](../../../system/buffer/) 오프셋. |
| count | int | 디코드할 바이트 수. |
| flush | bool | true인 경우, 계산 후 내부 디코더 상태를 정리합니다. |

### ReturnValue

버퍼를 디코딩하는 데 필요한 문자 수.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUDecoder::GetCharCount(const uint8_t *, int, bool) method


버퍼를 디코딩하는 데 필요한 문자 수를 가져옵니다.

```cpp
virtual int System::Text::ICUDecoder::GetCharCount(const uint8_t *bytes, int count, bool flush)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 바이트 | const uint8_t * | 디코딩할 바이트. |
| count | int | 디코드할 바이트 수. |
| flush | bool | true인 경우, 계산 후 내부 디코더 상태를 정리합니다. |

### ReturnValue

버퍼를 디코딩하는 데 필요한 문자 수.

## 또 보기

* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
