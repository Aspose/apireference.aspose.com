---
title: "System::Net::Sockets::Socket::IOControl 方法"
linktitle: "IOControl"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Sockets::Socket::IOControl 方法。在 C++ 中设置套接字的低级操作模式。"
type: docs
weight: 4000
url: /zh/cpp/system.net.sockets/socket/iocontrol/
---
## Socket::IOControl(int32_t, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


设置套接字的低级操作模式。

```cpp
int32_t System::Net::Sockets::Socket::IOControl(int32_t ioControlCode, System::ArrayPtr<uint8_t> optionInValue, System::ArrayPtr<uint8_t> optionOutValue)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| ioControlCode | int32_t | 要执行的操作的控制代码。 |
| optionInValue | System::ArrayPtr\<uint8_t\> | 包含输入数据的字节数组。 |
| optionOutValue | System::ArrayPtr\<uint8_t\> | 包含输出数据的字节数组。 |

### ReturnValue

**optionOutValue** 参数中的字节数。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::IOControl(IOControlCode, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


设置套接字的低级操作模式。

```cpp
int32_t System::Net::Sockets::Socket::IOControl(IOControlCode ioControlCode, System::ArrayPtr<uint8_t> optionInValue, System::ArrayPtr<uint8_t> optionOutValue)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| ioControlCode | IOControlCode | 要执行的操作的控制代码。 |
| optionInValue | System::ArrayPtr\<uint8_t\> | 包含输入数据的字节数组。 |
| optionOutValue | System::ArrayPtr\<uint8_t\> | 包含输出数据的字节数组。 |

### ReturnValue

**optionOutValue** 参数中的字节数。

## 另见

* Enum [IOControlCode](../../iocontrolcode/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
