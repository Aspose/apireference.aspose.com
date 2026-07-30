---
title: "System::Security::Cryptography::DSACryptoServiceProvider::SignData 方法"
linktitle: "SignData"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::DSACryptoServiceProvider::SignData 方法。计算 C++ 中指定输入值的签名。"
type: docs
weight: 1500
url: /zh/cpp/system.security.cryptography/dsacryptoserviceprovider/signdata/
---
## DSACryptoServiceProvider::SignData(const ByteArrayPtr\&) method


计算指定输入值的签名。

```cpp
ByteArrayPtr System::Security::Cryptography::DSACryptoServiceProvider::SignData(const ByteArrayPtr &buffer)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Buffer](../../../system/buffer/) 用于读取输入数据。 |

### ReturnValue

[DSA](../../dsa/) signature for specified data.

## 另见

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSACryptoServiceProvider::SignData(const ByteArrayPtr\&, int32_t, int32_t) method


计算指定输入值的签名。

```cpp
ByteArrayPtr System::Security::Cryptography::DSACryptoServiceProvider::SignData(const ByteArrayPtr &buffer, int32_t offset, int32_t count)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Buffer](../../../system/buffer/) 用于读取输入数据。 |
| offset | int32_t | 输入缓冲区切片的起始索引。 |
| count | int32_t | 输入缓冲区切片的大小。 |

### ReturnValue

[DSA](../../dsa/) signature for specified data.

## 另见

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSACryptoServiceProvider::SignData(const ByteArrayPtr\&, const HashAlgorithmName\&) method


RTTI 信息。

```cpp
ByteArrayPtr System::Security::Cryptography::DSA::SignData(const ByteArrayPtr &data, const HashAlgorithmName &hash_algorithm)
```

## 另见

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSACryptoServiceProvider::SignData(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) method


RTTI 信息。

```cpp
ByteArrayPtr System::Security::Cryptography::DSA::SignData(const ByteArrayPtr &data, int32_t offset, int32_t count, const HashAlgorithmName &hash_algorithm)
```

## 另见

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSACryptoServiceProvider::SignData(const SharedPtr\<IO::Stream\>\&) method


计算指定输入值的签名。

```cpp
ByteArrayPtr System::Security::Cryptography::DSACryptoServiceProvider::SignData(const SharedPtr<IO::Stream> &input_stream)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| input_stream | const SharedPtr\<IO::Stream\>\& | 用于读取待签名数据的流。 |

### ReturnValue

[DSA](../../dsa/) signature for specified data.

## 另见

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSACryptoServiceProvider::SignData(const StreamPtr\&, const HashAlgorithmName\&) method


RTTI 信息。

```cpp
ByteArrayPtr System::Security::Cryptography::DSA::SignData(const StreamPtr &stream, const HashAlgorithmName &hash_algorithm)
```

## 另见

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
