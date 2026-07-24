---
title: "System::IO::Stream::Read 메서드"
linktitle: "읽기"
second_title: "C++용 Aspose.Page"
description: "System::IO::Stream::Read 메서드. 스트림에서 지정된 바이트 수를 읽어 지정된 바이트 배열에 기록합니다 (C++)."
type: docs
weight: 1800
url: /ko/cpp/system.io/stream/read/
---
## Stream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


스트림에서 지정된 바이트 수를 읽어 지정된 바이트 배열에 씁니다.

```cpp
virtual int32_t System::IO::Stream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count)=0
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | const ArrayPtr\<uint8_t\>\& | 읽은 바이트를 쓸 바이트 배열 |
| offset | int32_t | **buffer** 내에서 쓰기를 시작하는 0 기반 위치 |
| count | int32_t | 읽을 바이트 수 |

### ReturnValue

읽은 바이트 수

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


스트림에서 지정된 바이트 수를 읽어 지정된 바이트 배열에 씁니다.

```cpp
virtual int32_t System::IO::Stream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | const System::Details::ArrayView\<uint8_t\>\& | 읽은 바이트를 쓸 바이트 배열 뷰 |
| offset | int32_t | **buffer** 내에서 쓰기를 시작하는 0 기반 위치 |
| count | int32_t | 읽을 바이트 수 |

### ReturnValue

읽은 바이트 수

## 또 보기

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::Read(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) method


스트림에서 지정된 바이트 수를 읽어 지정된 바이트 배열에 씁니다.

```cpp
template<std::size_t> int32_t System::IO::Stream::Read(const System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t count)
```


| 매개변수 | 설명 |
| --- | --- |
| N | 스택 배열의 크기 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | const System::Details::StackArray\<uint8_t, N\>\& | 읽은 바이트를 기록할 바이트 스택 배열 |
| offset | int32_t | **buffer** 내에서 쓰기를 시작하는 0 기반 위치 |
| count | int32_t | 읽을 바이트 수 |

### ReturnValue

읽은 바이트 수

## 또 보기

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
