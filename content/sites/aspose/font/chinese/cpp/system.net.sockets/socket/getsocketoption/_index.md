---
title: "System::Net::Sockets::Socket::GetSocketOption 方法"
linktitle: "GetSocketOption"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Sockets::Socket::GetSocketOption 方法。返回与 C++ 中指定选项名称对应的值。"
type: docs
weight: 3900
url: /zh/cpp/system.net.sockets/socket/getsocketoption/
---
## Socket::GetSocketOption(SocketOptionLevel, SocketOptionName) method


返回与指定选项名称对应的值。

```cpp
System::SharedPtr<Object> System::Net::Sockets::Socket::GetSocketOption(SocketOptionLevel optionLevel, SocketOptionName optionName)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| optionLevel | SocketOptionLevel | 套接字选项级别。 |
| optionName | SocketOptionName | 选项名称。 |

### ReturnValue

对应指定选项名称的值。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Enum [SocketOptionLevel](../../socketoptionlevel/)
* Enum [SocketOptionName](../../socketoptionname/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::GetSocketOption(SocketOptionLevel, SocketOptionName, int32_t) method


返回与指定选项名称对应的值。

```cpp
System::ArrayPtr<uint8_t> System::Net::Sockets::Socket::GetSocketOption(SocketOptionLevel optionLevel, SocketOptionName optionName, int32_t optionLength)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| optionLevel | SocketOptionLevel | 套接字选项级别。 |
| optionName | SocketOptionName | 选项名称。 |
| optionLength | int32_t | 选项长度。 |

### ReturnValue

对应指定选项名称的值。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketOptionLevel](../../socketoptionlevel/)
* Enum [SocketOptionName](../../socketoptionname/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::GetSocketOption(SocketOptionLevel, SocketOptionName, System::ArrayPtr\<uint8_t\>) method


获取与指定选项名称对应的值。

```cpp
void System::Net::Sockets::Socket::GetSocketOption(SocketOptionLevel optionLevel, SocketOptionName optionName, System::ArrayPtr<uint8_t> optionValue)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| optionLevel | SocketOptionLevel | 套接字选项级别。 |
| optionName | SocketOptionName | 选项名称。 |
| optionValue | System::ArrayPtr\<uint8_t\> | 将分配对应值的输出参数。 |

## 另见

* Enum [SocketOptionLevel](../../socketoptionlevel/)
* Enum [SocketOptionName](../../socketoptionname/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
