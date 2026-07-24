---
title: "System::Net::Sockets::Socket::SendTo 메서드"
linktitle: "SendTo"
second_title: "C++용 Aspose.Page"
description: "System::Net::Sockets::Socket::SendTo 메서드. 지정된 데이터를 지정된 엔드포인트로 전송합니다 C++에서."
type: docs
weight: 4700
url: /ko/cpp/system.net.sockets/socket/sendto/
---
## Socket::SendTo(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


지정된 데이터를 지정된 엔드포인트로 전송합니다.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | System::ArrayPtr\<uint8_t\> | 전송할 데이터. |
| offset | int32_t | 지정된 배열에서 바이트 단위의 오프셋입니다. |
| size | int32_t | 지정된 배열에서 'offset' 매개변수부터 시작하는 바이트 수. |
| socketFlags | SocketFlags | 전송 동작. |
| remoteEP | System::SharedPtr\<EndPoint\> | 원격 엔드포인트. |

### ReturnValue

전송된 바이트 수.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


지정된 데이터를 지정된 엔드포인트로 전송합니다.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | System::ArrayPtr\<uint8_t\> | 전송할 데이터. |
| size | int32_t | 지정된 배열의 바이트 수. |
| socketFlags | SocketFlags | 전송 동작. |
| remoteEP | System::SharedPtr\<EndPoint\> | 원격 엔드포인트. |

### ReturnValue

전송된 바이트 수.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) method


지정된 데이터를 지정된 엔드포인트로 전송합니다.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | System::ArrayPtr\<uint8_t\> | 전송할 데이터. |
| socketFlags | SocketFlags | 전송 동작. |
| remoteEP | System::SharedPtr\<EndPoint\> | 원격 엔드포인트. |

### ReturnValue

전송된 바이트 수.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::ArrayPtr\<uint8_t\>, System::SharedPtr\<EndPoint\>) method


지정된 데이터를 지정된 엔드포인트로 전송합니다.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::ArrayPtr<uint8_t> buffer, System::SharedPtr<EndPoint> remoteEP)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | System::ArrayPtr\<uint8_t\> | 전송할 데이터. |
| remoteEP | System::SharedPtr\<EndPoint\> | 원격 엔드포인트. |

### ReturnValue

전송된 바이트 수.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


지정된 데이터를 지정된 엔드포인트로 전송합니다.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | System::Details::ArrayView\<uint8_t\> | 전송할 데이터. |
| offset | int32_t | 지정된 배열에서 바이트 단위의 오프셋입니다. |
| size | int32_t | 지정된 배열에서 'offset' 매개변수부터 시작하는 바이트 수. |
| socketFlags | SocketFlags | 전송 동작. |
| remoteEP | System::SharedPtr\<EndPoint\> | 원격 엔드포인트. |

### ReturnValue

전송된 바이트 수.

## 또 보기

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


지정된 데이터를 지정된 엔드포인트로 전송합니다.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | System::Details::ArrayView\<uint8_t\> | 전송할 데이터. |
| size | int32_t | 지정된 배열의 바이트 수. |
| socketFlags | SocketFlags | 전송 동작. |
| remoteEP | System::SharedPtr\<EndPoint\> | 원격 엔드포인트. |

### ReturnValue

전송된 바이트 수.

## 또 보기

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::ArrayView\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) method


지정된 데이터를 지정된 엔드포인트로 전송합니다.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | System::Details::ArrayView\<uint8_t\> | 전송할 데이터. |
| socketFlags | SocketFlags | 전송 동작. |
| remoteEP | System::SharedPtr\<EndPoint\> | 원격 엔드포인트. |

### ReturnValue

전송된 바이트 수.

## 또 보기

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::ArrayView\<uint8_t\>, System::SharedPtr\<EndPoint\>) method


지정된 데이터를 지정된 엔드포인트로 전송합니다.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::Details::ArrayView<uint8_t> buffer, System::SharedPtr<EndPoint> remoteEP)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | System::Details::ArrayView\<uint8_t\> | 전송할 데이터. |
| remoteEP | System::SharedPtr\<EndPoint\> | 원격 엔드포인트. |

### ReturnValue

전송된 바이트 수.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


지정된 데이터를 지정된 엔드포인트로 전송합니다.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::SendTo(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | System::Details::StackArray\<uint8_t, N\>\& | 전송할 데이터. |
| offset | int32_t | 지정된 배열에서 바이트 단위의 오프셋입니다. |
| size | int32_t | 지정된 배열에서 'offset' 매개변수부터 시작하는 바이트 수. |
| socketFlags | SocketFlags | 전송 동작. |
| remoteEP | System::SharedPtr\<EndPoint\> | 원격 엔드포인트. |

### ReturnValue

전송된 바이트 수.

## 또 보기

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


지정된 데이터를 지정된 엔드포인트로 전송합니다.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::SendTo(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | System::Details::StackArray\<uint8_t, N\>\& | 전송할 데이터. |
| size | int32_t | 지정된 배열의 바이트 수. |
| socketFlags | SocketFlags | 전송 동작. |
| remoteEP | System::SharedPtr\<EndPoint\> | 원격 엔드포인트. |

### ReturnValue

전송된 바이트 수.

## 또 보기

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags, System::SharedPtr\<EndPoint\>) method


지정된 데이터를 지정된 엔드포인트로 전송합니다.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::SendTo(System::Details::StackArray<uint8_t, N> &buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | System::Details::StackArray\<uint8_t, N\>\& | 전송할 데이터. |
| socketFlags | SocketFlags | 전송 동작. |
| remoteEP | System::SharedPtr\<EndPoint\> | 원격 엔드포인트. |

### ReturnValue

전송된 바이트 수.

## 또 보기

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::StackArray\<uint8_t, N\>\&, System::SharedPtr\<EndPoint\>) method


지정된 데이터를 지정된 엔드포인트로 전송합니다.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::SendTo(System::Details::StackArray<uint8_t, N> &buffer, System::SharedPtr<EndPoint> remoteEP)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | System::Details::StackArray\<uint8_t, N\>\& | 전송할 데이터. |
| remoteEP | System::SharedPtr\<EndPoint\> | 원격 엔드포인트. |

### ReturnValue

전송된 바이트 수.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
