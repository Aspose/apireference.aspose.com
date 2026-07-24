---
title: "System::Net::Sockets::Socket::GetSocketOption 메서드"
linktitle: "GetSocketOption"
second_title: "C++용 Aspose.Page"
description: "System::Net::Sockets::Socket::GetSocketOption 메서드. 지정된 옵션 이름에 해당하는 값을 C++에서 반환합니다."
type: docs
weight: 3900
url: /ko/cpp/system.net.sockets/socket/getsocketoption/
---
## Socket::GetSocketOption(SocketOptionLevel, SocketOptionName) method


지정된 옵션 이름에 해당하는 값을 반환합니다.

```cpp
System::SharedPtr<Object> System::Net::Sockets::Socket::GetSocketOption(SocketOptionLevel optionLevel, SocketOptionName optionName)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| optionLevel | SocketOptionLevel | 소켓 옵션 레벨입니다. |
| optionName | SocketOptionName | 옵션 이름입니다. |

### ReturnValue

지정된 옵션 이름에 해당하는 값입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Enum [SocketOptionLevel](../../socketoptionlevel/)
* Enum [SocketOptionName](../../socketoptionname/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::GetSocketOption(SocketOptionLevel, SocketOptionName, int32_t) method


지정된 옵션 이름에 해당하는 값을 반환합니다.

```cpp
System::ArrayPtr<uint8_t> System::Net::Sockets::Socket::GetSocketOption(SocketOptionLevel optionLevel, SocketOptionName optionName, int32_t optionLength)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| optionLevel | SocketOptionLevel | 소켓 옵션 레벨입니다. |
| optionName | SocketOptionName | 옵션 이름입니다. |
| optionLength | int32_t | 옵션 길이입니다. |

### ReturnValue

지정된 옵션 이름에 해당하는 값입니다.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketOptionLevel](../../socketoptionlevel/)
* Enum [SocketOptionName](../../socketoptionname/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::GetSocketOption(SocketOptionLevel, SocketOptionName, System::ArrayPtr\<uint8_t\>) method


지정된 옵션 이름에 해당하는 값을 가져옵니다.

```cpp
void System::Net::Sockets::Socket::GetSocketOption(SocketOptionLevel optionLevel, SocketOptionName optionName, System::ArrayPtr<uint8_t> optionValue)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| optionLevel | SocketOptionLevel | 소켓 옵션 레벨입니다. |
| optionName | SocketOptionName | 옵션 이름입니다. |
| optionValue | System::ArrayPtr\<uint8_t\> | 해당 값이 할당될 출력 매개변수입니다. |

## 또 보기

* Enum [SocketOptionLevel](../../socketoptionlevel/)
* Enum [SocketOptionName](../../socketoptionname/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
