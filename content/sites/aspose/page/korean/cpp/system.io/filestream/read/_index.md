---
title: "System::IO::FileStream::Read 메서드"
linktitle: "읽기"
second_title: "C++용 Aspose.Page"
description: "System::IO::FileStream::Read 메서드. C++에서 스트림으로부터 지정된 바이트 수를 읽어 지정된 바이트 배열에 씁니다."
type: docs
weight: 1300
url: /ko/cpp/system.io/filestream/read/
---
## FileStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


스트림에서 지정된 바이트 수를 읽어 지정된 바이트 배열에 씁니다.

```cpp
int32_t System::IO::FileStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | const ArrayPtr\<uint8_t\>\& | 읽은 바이트를 기록할 바이트 배열. |
| offset | int32_t | **buffer**에서 쓰기를 시작할 0 기반 위치. |
| count | int32_t | 읽을 바이트 수입니다. |

### ReturnValue

읽은 바이트 수.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


스트림에서 지정된 바이트 수를 읽어 지정된 바이트 배열에 씁니다.

```cpp
int32_t System::IO::FileStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | const System::Details::ArrayView\<uint8_t\>\& | 읽은 바이트를 쓸 바이트 배열 뷰. |
| offset | int32_t | **buffer**에서 쓰기를 시작할 0 기반 위치. |
| count | int32_t | 읽을 바이트 수입니다. |

### ReturnValue

읽은 바이트 수.

## 또 보기

* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
