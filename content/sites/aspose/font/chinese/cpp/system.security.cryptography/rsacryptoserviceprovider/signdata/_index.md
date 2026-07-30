---
title: "System::Security::Cryptography::RSACryptoServiceProvider::SignData 方法"
linktitle: "SignData"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::SignData 方法。计算指定输入值的签名（在 C++ 中）。"
type: docs
weight: 1600
url: /zh/cpp/system.security.cryptography/rsacryptoserviceprovider/signdata/
---
## RSACryptoServiceProvider::SignData(const ByteArrayPtr\&, const SharedPtr\<Object\>\&) method


计算指定输入值的签名。

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignData(const ByteArrayPtr &buffer, const SharedPtr<Object> &halg)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Buffer](../../../system/buffer/) 用于读取输入数据。 |
| halg | const SharedPtr\<Object\>\& | 要使用的哈希算法。 |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## 另见

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSACryptoServiceProvider::SignData(const ByteArrayPtr\&, int32_t, int32_t, const SharedPtr\<Object\>\&) method


计算指定输入值的签名。

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignData(const ByteArrayPtr &buffer, int32_t offset, int32_t count, const SharedPtr<Object> &halg)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Buffer](../../../system/buffer/) 用于读取输入数据。 |
| offset | int32_t | 输入缓冲区切片的起始索引。 |
| count | int32_t | 输入缓冲区切片的大小。 |
| halg | const SharedPtr\<Object\>\& | 要使用的哈希算法。 |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## 另见

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSACryptoServiceProvider::SignData(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Object\>\&) method


计算指定输入值的签名。

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignData(const SharedPtr<IO::Stream> &input_stream, const SharedPtr<Object> &halg)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| input_stream | const SharedPtr\<IO::Stream\>\& | 用于读取待签名数据的流。 |
| halg | const SharedPtr\<Object\>\& | 要使用的哈希算法。 |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## 另见

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
