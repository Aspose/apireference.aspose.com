---
title: "System::Net::Sockets::NetworkStream::Write 메서드"
linktitle: "Write"
second_title: "C++용 Aspose.Page"
description: "System::Net::Sockets::NetworkStream::Write 메서드. 지정된 바이트 배열에서 지정된 바이트 하위 범위를 스트림에 C++에서 씁니다."
type: docs
weight: 2500
url: /ko/cpp/system.net.sockets/networkstream/write/
---
## NetworkStream::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


지정된 바이트 배열에서 지정된 바이트 하위 범위를 스트림에 씁니다.

```cpp
void System::Net::Sockets::NetworkStream::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t size) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | const ArrayPtr\<uint8_t\>\& | 쓰기 위한 바이트를 포함하는 배열. |
| offset | int32_t | 지정된 배열에서 바이트 단위의 오프셋입니다. |
| size | int32_t | 쓰기 위한 하위 범위의 요소 수. |

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## NetworkStream::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


지정된 바이트 배열에서 지정된 바이트 하위 범위를 스트림에 씁니다.

```cpp
void System::Net::Sockets::NetworkStream::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t size) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | const System::Details::ArrayView\<uint8_t\>\& | 쓰기 위한 바이트를 포함하는 배열 뷰 |
| offset | int32_t | 쓰기 하위 범위가 시작되는 **buffer** 내 요소의 0 기반 인덱스 |
| size | int32_t | 쓰기 위한 하위 범위의 요소 수 |

## 또 보기

* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
