---
title: "System::Net::Sockets::Socket::Receive 메서드"
linktitle: "수신"
second_title: "C++용 Aspose.Page"
description: "System::Net::Sockets::Socket::Receive 메서드. 소켓으로부터 데이터를 수신하고 C++에서 지정된 바이트 배열에 씁니다."
type: docs
weight: 4300
url: /ko/cpp/system.net.sockets/socket/receive/
---
## Socket::Receive(System::ArrayPtr\<uint8_t\>) method


소켓에서 데이터를 수신하고 지정된 바이트 배열에 기록합니다.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | System::ArrayPtr\<uint8_t\> | 수신된 데이터가 할당될 바이트 배열. |

### ReturnValue

수신된 바이트 수.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) method


소켓에서 데이터를 수신하고 지정된 바이트 배열에 기록합니다.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | System::ArrayPtr\<uint8_t\> | 수신된 데이터가 할당될 바이트 배열. |
| offset | int32_t | 지정된 배열에서 바이트 단위의 오프셋입니다. |
| size | int32_t | ‘offset’ 인덱스부터 지정된 바이트 배열에 할당될 수신 바이트 수. |
| socketFlags | SocketFlags | 수신 동작. |

### ReturnValue

수신된 바이트 수.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


소켓에서 데이터를 수신하고 지정된 바이트 배열에 기록합니다.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | System::ArrayPtr\<uint8_t\> | 수신된 데이터가 할당될 바이트 배열. |
| offset | int32_t | 지정된 배열에서 바이트 단위의 오프셋입니다. |
| size | int32_t | ‘offset’ 인덱스부터 지정된 바이트 배열에 할당될 수신 바이트 수. |
| socketFlags | SocketFlags | 수신 동작. |
| errorCode | SocketError\& | 수신 작업이 실패했을 때 오류 코드가 할당되는 출력 매개변수. |

### ReturnValue

수신된 바이트 수.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) method


소켓에서 데이터를 수신하고 지정된 바이트 배열에 기록합니다.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | System::ArrayPtr\<uint8_t\> | 수신된 데이터가 할당될 바이트 배열. |
| size | int32_t | 수신할 바이트 수. |
| socketFlags | SocketFlags | 수신 동작. |

### ReturnValue

수신된 바이트 수.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, SocketFlags) method


소켓에서 데이터를 수신하고 지정된 바이트 배열에 기록합니다.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | System::ArrayPtr\<uint8_t\> | 수신된 데이터가 할당될 바이트 배열. |
| socketFlags | SocketFlags | 수신 동작. |

### ReturnValue

수신된 바이트 수.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>) method


소켓에서 데이터를 수신하고 지정된 바이트 배열에 기록합니다.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | System::Details::ArrayView\<uint8_t\> | 수신된 데이터가 할당될 바이트 배열. |

### ReturnValue

수신된 바이트 수.

## 또 보기

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) method


소켓에서 데이터를 수신하고 지정된 바이트 배열에 기록합니다.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | System::Details::ArrayView\<uint8_t\> | 수신된 데이터가 할당될 바이트 배열. |
| offset | int32_t | 지정된 배열에서 바이트 단위의 오프셋입니다. |
| size | int32_t | ‘offset’ 인덱스부터 지정된 바이트 배열에 할당될 수신 바이트 수. |
| socketFlags | SocketFlags | 수신 동작. |

### ReturnValue

수신된 바이트 수.

## 또 보기

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


소켓에서 데이터를 수신하고 지정된 바이트 배열에 기록합니다.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | System::Details::ArrayView\<uint8_t\> | 수신된 데이터가 할당될 바이트 배열. |
| offset | int32_t | 지정된 배열에서 바이트 단위의 오프셋입니다. |
| size | int32_t | ‘offset’ 인덱스부터 지정된 바이트 배열에 할당될 수신 바이트 수. |
| socketFlags | SocketFlags | 수신 동작. |
| errorCode | SocketError\& | 수신 작업이 실패했을 때 오류 코드가 할당되는 출력 매개변수. |

### ReturnValue

수신된 바이트 수.

## 또 보기

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) method


소켓에서 데이터를 수신하고 지정된 바이트 배열에 기록합니다.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | System::Details::ArrayView\<uint8_t\> | 수신된 데이터가 할당될 바이트 배열. |
| size | int32_t | 수신할 바이트 수. |
| socketFlags | SocketFlags | 수신 동작. |

### ReturnValue

수신된 바이트 수.

## 또 보기

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, SocketFlags) method


소켓에서 데이터를 수신하고 지정된 바이트 배열에 기록합니다.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | System::Details::ArrayView\<uint8_t\> | 수신된 데이터가 할당될 바이트 배열. |
| socketFlags | SocketFlags | 수신 동작. |

### ReturnValue

수신된 바이트 수.

## 또 보기

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&) method


소켓에서 데이터를 수신하고 지정된 바이트 배열에 기록합니다.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | System::Details::StackArray\<uint8_t, N\>\& | 수신된 데이터가 할당될 바이트 배열. |

### ReturnValue

수신된 바이트 수.

## 또 보기

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) method


소켓에서 데이터를 수신하고 지정된 바이트 배열에 기록합니다.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | System::Details::StackArray\<uint8_t, N\>\& | 수신된 데이터가 할당될 바이트 배열. |
| offset | int32_t | 지정된 배열에서 바이트 단위의 오프셋입니다. |
| size | int32_t | ‘offset’ 인덱스부터 지정된 바이트 배열에 할당될 수신 바이트 수. |
| socketFlags | SocketFlags | 수신 동작. |

### ReturnValue

수신된 바이트 수.

## 또 보기

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) method


소켓에서 데이터를 수신하고 지정된 바이트 배열에 기록합니다.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | System::Details::StackArray\<uint8_t, N\>\& | 수신된 데이터가 할당될 바이트 배열. |
| offset | int32_t | 지정된 배열에서 바이트 단위의 오프셋입니다. |
| size | int32_t | ‘offset’ 인덱스부터 지정된 바이트 배열에 할당될 수신 바이트 수. |
| socketFlags | SocketFlags | 수신 동작. |
| errorCode | SocketError\& | 수신 작업이 실패했을 때 오류 코드가 할당되는 출력 매개변수. |

### ReturnValue

수신된 바이트 수.

## 또 보기

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) method


소켓에서 데이터를 수신하고 지정된 바이트 배열에 기록합니다.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | System::Details::StackArray\<uint8_t, N\>\& | 수신된 데이터가 할당될 바이트 배열. |
| size | int32_t | 수신할 바이트 수. |
| socketFlags | SocketFlags | 수신 동작. |

### ReturnValue

수신된 바이트 수.

## 또 보기

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) method


소켓에서 데이터를 수신하고 지정된 바이트 배열에 기록합니다.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, SocketFlags socketFlags)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | System::Details::StackArray\<uint8_t, N\>\& | 수신된 데이터가 할당될 바이트 배열. |
| socketFlags | SocketFlags | 수신 동작. |

### ReturnValue

수신된 바이트 수.

## 또 보기

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) method


소켓에서 데이터를 수신하고 지정된 바이트 배열들에 기록합니다.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | 수신된 데이터가 할당될 바이트 배열들. |

### ReturnValue

수신된 바이트 수.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) method


소켓에서 데이터를 수신하고 지정된 바이트 배열들에 기록합니다.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | 수신된 데이터가 할당될 바이트 배열들. |
| socketFlags | SocketFlags | 수신 동작. |

### ReturnValue

수신된 바이트 수.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) method


소켓에서 데이터를 수신하고 지정된 바이트 배열들에 기록합니다.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags, SocketError &errorCode)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | 수신된 데이터가 할당될 바이트 배열들. |
| socketFlags | SocketFlags | 수신 동작. |
| errorCode | SocketError\& | 수신 작업이 실패했을 때 오류 코드가 할당되는 출력 매개변수. |

### ReturnValue

수신된 바이트 수.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
