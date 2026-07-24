---
title: "System::Net::Sockets::Socket::IOControl メソッド"
linktitle: "IOControl"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Sockets::Socket::IOControl メソッド。C++ でソケットの低レベル動作モードを設定します。"
type: docs
weight: 4000
url: /ja/cpp/system.net.sockets/socket/iocontrol/
---
## Socket::IOControl(int32_t, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


ソケットの低レベル動作モードを設定します。

```cpp
int32_t System::Net::Sockets::Socket::IOControl(int32_t ioControlCode, System::ArrayPtr<uint8_t> optionInValue, System::ArrayPtr<uint8_t> optionOutValue)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ioControlCode | int32_t | 実行する操作の制御コードです。 |
| optionInValue | System::ArrayPtr\<uint8_t\> | 入力データを含むバイト配列です。 |
| optionOutValue | System::ArrayPtr\<uint8_t\> | 出力データを含むバイト配列です。 |

### ReturnValue

**optionOutValue** パラメータのバイト数です。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::IOControl(IOControlCode, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


ソケットの低レベル動作モードを設定します。

```cpp
int32_t System::Net::Sockets::Socket::IOControl(IOControlCode ioControlCode, System::ArrayPtr<uint8_t> optionInValue, System::ArrayPtr<uint8_t> optionOutValue)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ioControlCode | IOControlCode | 実行する操作の制御コードです。 |
| optionInValue | System::ArrayPtr\<uint8_t\> | 入力データを含むバイト配列です。 |
| optionOutValue | System::ArrayPtr\<uint8_t\> | 出力データを含むバイト配列です。 |

### ReturnValue

**optionOutValue** パラメータのバイト数です。

## 参照

* Enum [IOControlCode](../../iocontrolcode/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
