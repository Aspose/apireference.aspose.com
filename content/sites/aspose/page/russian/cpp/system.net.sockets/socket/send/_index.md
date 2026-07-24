---
title: "System::Net::Sockets::Socket::Send метод"
linktitle: "Отправить"
second_title: "Aspose.Page для C++"
description: "System::Net::Sockets::Socket::Send метод. Отправляет указанные данные в сокет в C++."
type: docs
weight: 4600
url: /ru/cpp/system.net.sockets/socket/send/
---
## Socket::Send(System::ArrayPtr\<uint8_t\>) method


Отправляет указанные данные в socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| буфер | System::ArrayPtr\<uint8_t\> | Данные для отправки. |

### ReturnValue

Количество отправленных байт.

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) method


Отправляет указанные данные в socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| буфер | System::ArrayPtr\<uint8_t\> | Данные для отправки. |
| смещение | int32_t | Смещение в байтах в указанном массиве. |
| size | int32_t | Количество байт в указанном массиве, начиная с параметра 'offset'. |
| socketFlags | SocketFlags | Поведение отправки. |

### ReturnValue

Количество отправленных байт.

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


Отправляет указанные данные в socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| буфер | System::ArrayPtr\<uint8_t\> | Данные для отправки. |
| смещение | int32_t | Смещение в байтах в указанном массиве. |
| size | int32_t | Количество байт в указанном массиве, начиная с параметра 'offset'. |
| socketFlags | SocketFlags | Поведение отправки. |
| errorCode | SocketError\& | Выходной параметр, в который будет записан код ошибки при неудачной операции отправки. |

### ReturnValue

Количество отправленных байт.

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) method


Отправляет указанные данные в socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| буфер | System::ArrayPtr\<uint8_t\> | Данные для отправки. |
| size | int32_t | Количество байтов из указанных данных, которые необходимо отправить. |
| socketFlags | SocketFlags | Поведение отправки. |

### ReturnValue

Количество отправленных байт.

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, SocketFlags) method


Отправляет указанные данные в socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| буфер | System::ArrayPtr\<uint8_t\> | Данные для отправки. |
| socketFlags | SocketFlags | Поведение отправки. |

### ReturnValue

Количество отправленных байт.

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>) method


Отправляет указанные данные в socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| буфер | System::Details::ArrayView\<uint8_t\> | Данные для отправки. |

### ReturnValue

Количество отправленных байт.

## См. также

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) method


Отправляет указанные данные в socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| буфер | System::Details::ArrayView\<uint8_t\> | Данные для отправки. |
| смещение | int32_t | Смещение в байтах в указанном массиве. |
| size | int32_t | Количество байт в указанном массиве, начиная с параметра 'offset'. |
| socketFlags | SocketFlags | Поведение отправки. |

### ReturnValue

Количество отправленных байт.

## См. также

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


Отправляет указанные данные в socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| буфер | System::Details::ArrayView\<uint8_t\> | Данные для отправки. |
| смещение | int32_t | Смещение в байтах в указанном массиве. |
| size | int32_t | Количество байт в указанном массиве, начиная с параметра 'offset'. |
| socketFlags | SocketFlags | Поведение отправки. |
| errorCode | SocketError\& | Выходной параметр, в который будет записан код ошибки при неудачной операции отправки. |

### ReturnValue

Количество отправленных байт.

## См. также

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) method


Отправляет указанные данные в socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| буфер | System::Details::ArrayView\<uint8_t\> | Данные для отправки. |
| size | int32_t | Количество байтов из указанных данных, которые необходимо отправить. |
| socketFlags | SocketFlags | Поведение отправки. |

### ReturnValue

Количество отправленных байт.

## См. также

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, SocketFlags) method


Отправляет указанные данные в socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| буфер | System::Details::ArrayView\<uint8_t\> | Данные для отправки. |
| socketFlags | SocketFlags | Поведение отправки. |

### ReturnValue

Количество отправленных байт.

## См. также

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&) method


Отправляет указанные данные в socket.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| буфер | System::Details::StackArray\<uint8_t, N\>\& | Данные для отправки. |

### ReturnValue

Количество отправленных байт.

## См. также

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) method


Отправляет указанные данные в socket.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| буфер | System::Details::StackArray\<uint8_t, N\>\& | Данные для отправки. |
| смещение | int32_t | Смещение в байтах в указанном массиве. |
| size | int32_t | Количество байт в указанном массиве, начиная с параметра 'offset'. |
| socketFlags | SocketFlags | Поведение отправки. |

### ReturnValue

Количество отправленных байт.

## См. также

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) method


Отправляет указанные данные в socket.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| буфер | System::Details::StackArray\<uint8_t, N\>\& | Данные для отправки. |
| смещение | int32_t | Смещение в байтах в указанном массиве. |
| size | int32_t | Количество байт в указанном массиве, начиная с параметра 'offset'. |
| socketFlags | SocketFlags | Поведение отправки. |
| errorCode | SocketError\& | Выходной параметр, в который будет записан код ошибки при неудачной операции отправки. |

### ReturnValue

Количество отправленных байт.

## См. также

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) method


Отправляет указанные данные в socket.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| буфер | System::Details::StackArray\<uint8_t, N\>\& | Данные для отправки. |
| size | int32_t | Количество байтов из указанных данных, которые необходимо отправить. |
| socketFlags | SocketFlags | Поведение отправки. |

### ReturnValue

Количество отправленных байт.

## См. также

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) method


Отправляет указанные данные в socket.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, SocketFlags socketFlags)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| буфер | System::Details::StackArray\<uint8_t, N\>\& | Данные для отправки. |
| socketFlags | SocketFlags | Поведение отправки. |

### ReturnValue

Количество отправленных байт.

## См. также

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) method


Отправляет указанные данные в socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Коллекция массивов байтов, из которых данные должны быть отправлены. |

### ReturnValue

Количество отправленных байт.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) method


Отправляет указанные данные в socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Коллекция массивов байтов, из которых данные должны быть отправлены. |
| socketFlags | SocketFlags | Поведение отправки. |

### ReturnValue

Количество отправленных байт.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) method


Отправляет указанные данные в socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags, SocketError &errorCode)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | Коллекция массивов байтов, из которых данные должны быть отправлены. |
| socketFlags | SocketFlags | Поведение отправки. |
| errorCode | SocketError\& | Выходной параметр, в который будет записан код ошибки при неудачной операции отправки. |

### ReturnValue

Количество отправленных байт.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
