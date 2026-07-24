---
title: "System::IO::Stream::Write 메서드"
linktitle: "Write"
second_title: "C++용 Aspose.Page"
description: "System::IO::Stream::Write 메서드. 지정된 바이트 배열에서 지정된 바이트 하위 범위를 스트림에 C++에서 씁니다."
type: docs
weight: 2600
url: /ko/cpp/system.io/stream/write/
---
## Stream::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


지정된 바이트 배열에서 지정된 바이트 하위 범위를 스트림에 씁니다.

```cpp
virtual void System::IO::Stream::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count)=0
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | const ArrayPtr\<uint8_t\>\& | 쓰기를 위한 바이트를 포함하는 배열 |
| offset | int32_t | 쓰기 하위 범위가 시작되는 **buffer** 내 요소의 0 기반 인덱스 |
| count | int32_t | 쓰기 위한 하위 범위의 요소 수 |

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


지정된 바이트 배열에서 지정된 바이트 하위 범위를 스트림에 씁니다.

```cpp
virtual void System::IO::Stream::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | const System::Details::ArrayView\<uint8_t\>\& | 쓰기 위한 바이트를 포함하는 배열 뷰 |
| offset | int32_t | 쓰기 하위 범위가 시작되는 **buffer** 내 요소의 0 기반 인덱스 |
| count | int32_t | 쓰기 위한 하위 범위의 요소 수 |

## 또 보기

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::Write(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) method


지정된 바이트 배열에서 지정된 바이트 하위 범위를 스트림에 씁니다.

```cpp
template<std::size_t> void System::IO::Stream::Write(const System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t count)
```


| 매개변수 | 설명 |
| --- | --- |
| N | 스택 배열의 크기 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | const System::Details::StackArray\<uint8_t, N\>\& | 쓰기를 위한 바이트를 포함하는 스택 배열 |
| offset | int32_t | 쓰기 하위 범위가 시작되는 **buffer** 내 요소의 0 기반 인덱스 |
| count | int32_t | 쓰기 위한 하위 범위의 요소 수 |

## 또 보기

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
