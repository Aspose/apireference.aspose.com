---
title: "System::Net::Sockets::Socket::Send 메서드"
linktitle: "전송"
second_title: "C++용 Aspose.Page"
description: "System::Net::Sockets::Socket::Send 메서드. C++에서 지정된 데이터를 소켓으로 전송합니다."
type: docs
weight: 4600
url: /ko/cpp/system.net.sockets/socket/send/
---
## Socket::Send(System::ArrayPtr\<uint8_t\>) method


지정된 데이터를 소켓으로 전송합니다.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | System::ArrayPtr\<uint8_t\> | 전송할 데이터. |

### ReturnValue

전송된 바이트 수.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) method


지정된 데이터를 소켓으로 전송합니다.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | System::ArrayPtr\<uint8_t\> | 전송할 데이터. |
| offset | int32_t | 지정된 배열에서 바이트 단위의 오프셋입니다. |
| size | int32_t | 지정된 배열에서 'offset' 매개변수부터 시작하는 바이트 수. |
| socketFlags | SocketFlags | 전송 동작. |

### ReturnValue

전송된 바이트 수.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


지정된 데이터를 소켓으로 전송합니다.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | System::ArrayPtr\<uint8_t\> | 전송할 데이터. |
| offset | int32_t | 지정된 배열에서 바이트 단위의 오프셋입니다. |
| size | int32_t | 지정된 배열에서 'offset' 매개변수부터 시작하는 바이트 수. |
| socketFlags | SocketFlags | 전송 동작. |
| errorCode | SocketError\& | 전송 작업이 실패할 때 오류 코드가 할당되는 출력 매개변수. |

### ReturnValue

전송된 바이트 수.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) method


지정된 데이터를 소켓으로 전송합니다.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | System::ArrayPtr\<uint8_t\> | 전송할 데이터. |
| size | int32_t | 지정된 데이터에서 전송해야 하는 바이트 수. |
| socketFlags | SocketFlags | 전송 동작. |

### ReturnValue

전송된 바이트 수.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, SocketFlags) method


지정된 데이터를 소켓으로 전송합니다.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | System::ArrayPtr\<uint8_t\> | 전송할 데이터. |
| socketFlags | SocketFlags | 전송 동작. |

### ReturnValue

전송된 바이트 수.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>) method


지정된 데이터를 소켓으로 전송합니다.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | System::Details::ArrayView\<uint8_t\> | 전송할 데이터. |

### ReturnValue

전송된 바이트 수.

## 또 보기

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) method


지정된 데이터를 소켓으로 전송합니다.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | System::Details::ArrayView\<uint8_t\> | 전송할 데이터. |
| offset | int32_t | 지정된 배열에서 바이트 단위의 오프셋입니다. |
| size | int32_t | 지정된 배열에서 'offset' 매개변수부터 시작하는 바이트 수. |
| socketFlags | SocketFlags | 전송 동작. |

### ReturnValue

전송된 바이트 수.

## 또 보기

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


지정된 데이터를 소켓으로 전송합니다.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | System::Details::ArrayView\<uint8_t\> | 전송할 데이터. |
| offset | int32_t | 지정된 배열에서 바이트 단위의 오프셋입니다. |
| size | int32_t | 지정된 배열에서 'offset' 매개변수부터 시작하는 바이트 수. |
| socketFlags | SocketFlags | 전송 동작. |
| errorCode | SocketError\& | 전송 작업이 실패할 때 오류 코드가 할당되는 출력 매개변수. |

### ReturnValue

전송된 바이트 수.

## 또 보기

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) method


지정된 데이터를 소켓으로 전송합니다.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | System::Details::ArrayView\<uint8_t\> | 전송할 데이터. |
| size | int32_t | 지정된 데이터에서 전송해야 하는 바이트 수. |
| socketFlags | SocketFlags | 전송 동작. |

### ReturnValue

전송된 바이트 수.

## 또 보기

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, SocketFlags) method


지정된 데이터를 소켓으로 전송합니다.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | System::Details::ArrayView\<uint8_t\> | 전송할 데이터. |
| socketFlags | SocketFlags | 전송 동작. |

### ReturnValue

전송된 바이트 수.

## 또 보기

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&) method


지정된 데이터를 소켓으로 전송합니다.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | System::Details::StackArray\<uint8_t, N\>\& | 전송할 데이터. |

### ReturnValue

전송된 바이트 수.

## 또 보기

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) method


지정된 데이터를 소켓으로 전송합니다.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | System::Details::StackArray\<uint8_t, N\>\& | 전송할 데이터. |
| offset | int32_t | 지정된 배열에서 바이트 단위의 오프셋입니다. |
| size | int32_t | 지정된 배열에서 'offset' 매개변수부터 시작하는 바이트 수. |
| socketFlags | SocketFlags | 전송 동작. |

### ReturnValue

전송된 바이트 수.

## 또 보기

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) method


지정된 데이터를 소켓으로 전송합니다.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | System::Details::StackArray\<uint8_t, N\>\& | 전송할 데이터. |
| offset | int32_t | 지정된 배열에서 바이트 단위의 오프셋입니다. |
| size | int32_t | 지정된 배열에서 'offset' 매개변수부터 시작하는 바이트 수. |
| socketFlags | SocketFlags | 전송 동작. |
| errorCode | SocketError\& | 전송 작업이 실패할 때 오류 코드가 할당되는 출력 매개변수. |

### ReturnValue

전송된 바이트 수.

## 또 보기

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) method


지정된 데이터를 소켓으로 전송합니다.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | System::Details::StackArray\<uint8_t, N\>\& | 전송할 데이터. |
| size | int32_t | 지정된 데이터에서 전송해야 하는 바이트 수. |
| socketFlags | SocketFlags | 전송 동작. |

### ReturnValue

전송된 바이트 수.

## 또 보기

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) method


지정된 데이터를 소켓으로 전송합니다.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, SocketFlags socketFlags)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | System::Details::StackArray\<uint8_t, N\>\& | 전송할 데이터. |
| socketFlags | SocketFlags | 전송 동작. |

### ReturnValue

전송된 바이트 수.

## 또 보기

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) method


지정된 데이터를 소켓으로 전송합니다.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | 데이터를 전송해야 하는 바이트 배열 컬렉션. |

### ReturnValue

전송된 바이트 수.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) method


지정된 데이터를 소켓으로 전송합니다.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | 데이터를 전송해야 하는 바이트 배열 컬렉션. |
| socketFlags | SocketFlags | 전송 동작. |

### ReturnValue

전송된 바이트 수.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) method


지정된 데이터를 소켓으로 전송합니다.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags, SocketError &errorCode)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | 데이터를 전송해야 하는 바이트 배열 컬렉션. |
| socketFlags | SocketFlags | 전송 동작. |
| errorCode | SocketError\& | 전송 작업이 실패할 때 오류 코드가 할당되는 출력 매개변수. |

### ReturnValue

전송된 바이트 수.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
