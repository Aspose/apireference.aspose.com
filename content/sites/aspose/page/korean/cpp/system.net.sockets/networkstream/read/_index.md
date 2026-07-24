---
title: "System::Net::Sockets::NetworkStream::Read method"
linktitle: "읽기"
second_title: "C++용 Aspose.Page"
description: "System::Net::Sockets::NetworkStream::Read 메서드. 지정된 바이트 수를 스트림에서 읽고 C++에서 지정된 바이트 배열에 씁니다."
type: docs
weight: 1900
url: /ko/cpp/system.net.sockets/networkstream/read/
---
## NetworkStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


스트림에서 지정된 바이트 수를 읽어 지정된 바이트 배열에 씁니다.

```cpp
int32_t System::Net::Sockets::NetworkStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t size) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | const ArrayPtr\<uint8_t\>\& | 읽은 바이트가 기록될 바이트 배열입니다. |
| offset | int32_t | 지정된 배열에서 바이트 단위의 오프셋입니다. |
| size | int32_t | 읽을 바이트 수입니다. |

### ReturnValue

읽은 바이트 수.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## NetworkStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


스트림에서 지정된 바이트 수를 읽어 지정된 바이트 배열에 씁니다.

```cpp
int32_t System::Net::Sockets::NetworkStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t size) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | const System::Details::ArrayView\<uint8_t\>\& | 읽은 바이트를 쓸 바이트 배열 뷰 |
| offset | int32_t | **buffer** 내에서 쓰기를 시작하는 0 기반 위치 |
| size | int32_t | 읽을 바이트 수 |

### ReturnValue

읽은 바이트 수

## 또 보기

* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
