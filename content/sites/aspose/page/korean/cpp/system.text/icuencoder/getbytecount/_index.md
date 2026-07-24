---
title: "System::Text::ICUEncoder::GetByteCount 메서드"
linktitle: "GetByteCount"
second_title: "C++용 Aspose.Page"
description: "System::Text::ICUEncoder::GetByteCount 메서드. C++에서 버퍼를 인코딩하는 데 필요한 바이트 수를 가져옵니다."
type: docs
weight: 400
url: /ko/cpp/system.text/icuencoder/getbytecount/
---
## ICUEncoder::GetByteCount(ArrayPtr\<char_t\>, int, int, bool) method


버퍼를 인코딩하는 데 필요한 바이트 수를 가져옵니다.

```cpp
virtual int System::Text::ICUEncoder::GetByteCount(ArrayPtr<char_t> chars, int index, int count, bool flush)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | 인코드할 문자. |
| index | int | [Buffer](../../../system/buffer/) 오프셋. |
| count | int | 인코딩할 문자 수. |
| flush | bool | true이면 계산 후 내부 인코더 상태를 정리합니다. |

### ReturnValue

버퍼를 인코딩하는 데 필요한 바이트 수.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoder::GetByteCount(const char_t *, int, bool) method


버퍼를 인코딩하는 데 필요한 바이트 수를 가져옵니다.

```cpp
virtual int System::Text::ICUEncoder::GetByteCount(const char_t *chars, int count, bool flush)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| chars | const char_t * | 인코드할 문자. |
| count | int | 인코딩할 문자 수. |
| flush | bool | true이면 계산 후 내부 인코더 상태를 정리합니다. |

### ReturnValue

버퍼를 인코딩하는 데 필요한 바이트 수.

## 또 보기

* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
