---
title: "System::Net::Sockets::Socket::GetSocketOption メソッド"
linktitle: "GetSocketOption"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Sockets::Socket::GetSocketOption メソッド。指定されたオプション名に対応する値を C++ で返します。"
type: docs
weight: 3900
url: /ja/cpp/system.net.sockets/socket/getsocketoption/
---
## Socket::GetSocketOption(SocketOptionLevel, SocketOptionName) method


指定されたオプション名に対応する値を返します。

```cpp
System::SharedPtr<Object> System::Net::Sockets::Socket::GetSocketOption(SocketOptionLevel optionLevel, SocketOptionName optionName)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| optionLevel | SocketOptionLevel | ソケットオプションのレベルです。 |
| optionName | SocketOptionName | オプション名です。 |

### ReturnValue

指定されたオプション名に対応する値です。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Enum [SocketOptionLevel](../../socketoptionlevel/)
* Enum [SocketOptionName](../../socketoptionname/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::GetSocketOption(SocketOptionLevel, SocketOptionName, int32_t) method


指定されたオプション名に対応する値を返します。

```cpp
System::ArrayPtr<uint8_t> System::Net::Sockets::Socket::GetSocketOption(SocketOptionLevel optionLevel, SocketOptionName optionName, int32_t optionLength)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| optionLevel | SocketOptionLevel | ソケットオプションのレベルです。 |
| optionName | SocketOptionName | オプション名です。 |
| optionLength | int32_t | オプションの長さです。 |

### ReturnValue

指定されたオプション名に対応する値です。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketOptionLevel](../../socketoptionlevel/)
* Enum [SocketOptionName](../../socketoptionname/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::GetSocketOption(SocketOptionLevel, SocketOptionName, System::ArrayPtr\<uint8_t\>) method


指定されたオプション名に対応する値を取得します。

```cpp
void System::Net::Sockets::Socket::GetSocketOption(SocketOptionLevel optionLevel, SocketOptionName optionName, System::ArrayPtr<uint8_t> optionValue)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| optionLevel | SocketOptionLevel | ソケットオプションのレベルです。 |
| optionName | SocketOptionName | オプション名です。 |
| optionValue | System::ArrayPtr\<uint8_t\> | 対応する値が割り当てられる出力パラメータです。 |

## 参照

* Enum [SocketOptionLevel](../../socketoptionlevel/)
* Enum [SocketOptionName](../../socketoptionname/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
