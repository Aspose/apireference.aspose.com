---
title: "System::IO::FileStream::Write 메서드"
linktitle: "Write"
second_title: "C++용 Aspose.Page"
description: "System::IO::FileStream::Write 메서드. C++에서 지정된 바이트 배열의 지정된 하위 범위 바이트를 스트림에 씁니다."
type: docs
weight: 1900
url: /ko/cpp/system.io/filestream/write/
---
## FileStream::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


지정된 바이트 배열에서 지정된 바이트 하위 범위를 스트림에 씁니다.

```cpp
void System::IO::FileStream::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | const ArrayPtr\<uint8_t\>\& | 쓰기 위한 바이트를 포함하는 배열. |
| offset | int32_t | 쓰기 서브범위가 시작되는 **buffer** 내의 0 기반 인덱스. |
| count | int32_t | 쓰기 위한 하위 범위의 요소 수. |

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileStream::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


지정된 바이트 배열에서 지정된 바이트 하위 범위를 스트림에 씁니다.

```cpp
void System::IO::FileStream::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | const System::Details::ArrayView\<uint8_t\>\& | 쓰기 위한 바이트를 포함하는 배열 뷰. |
| offset | int32_t | 쓰기 서브범위가 시작되는 **buffer** 내의 0 기반 인덱스. |
| count | int32_t | 쓰기 위한 하위 범위의 요소 수. |

## 또 보기

* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
