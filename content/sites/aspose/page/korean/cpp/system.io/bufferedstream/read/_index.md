---
title: "System::IO::BufferedStream::Read 메서드"
linktitle: "읽기"
second_title: "C++용 Aspose.Page"
description: "System::IO::BufferedStream::Read 메서드. 기본 스트림에서 지정된 바이트 수를 읽어 지정된 바이트 배열에 씁니다 (C++)."
type: docs
weight: 900
url: /ko/cpp/system.io/bufferedstream/read/
---
## BufferedStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


기본 스트림에서 지정된 바이트 수를 읽어 지정된 바이트 배열에 씁니다.

```cpp
virtual int32_t System::IO::BufferedStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
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
* Class [BufferedStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BufferedStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


기본 스트림에서 지정된 바이트 수를 읽어 지정된 바이트 배열에 씁니다.

```cpp
virtual int32_t System::IO::BufferedStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | const System::Details::ArrayView\<uint8_t\>\& | 읽은 바이트를 쓸 바이트 배열 |
| offset | int32_t | **buffer** 내에서 쓰기를 시작하는 0 기반 위치 |
| count | int32_t | 읽을 바이트 수 |

### ReturnValue

읽은 바이트 수

## 또 보기

* Class [BufferedStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
