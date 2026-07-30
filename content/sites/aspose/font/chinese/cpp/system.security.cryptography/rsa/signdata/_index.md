---
title: "System::Security::Cryptography::RSA::SignData 方法"
linktitle: "SignData"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::RSA::SignData 方法。使用指定的哈希算法和填充方式计算指定数据数组的哈希值，并在 C++ 中对结果进行签名。"
type: docs
weight: 1000
url: /zh/cpp/system.security.cryptography/rsa/signdata/
---
## RSA::SignData(const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


使用指定的哈希算法和填充方式计算指定数据数组的哈希值，并对结果进行签名。

```cpp
ByteArrayPtr System::Security::Cryptography::RSA::SignData(const ByteArrayPtr &data, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 数据 | const ByteArrayPtr\& | 输入数据数组。 |
| hash_algorithm | const HashAlgorithmName\& | 哈希算法。 |
| padding | const SharedPtr\<RSASignaturePadding\>\& | 填充模式。返回输入数据的 [RSA](../) 签名。 |

## 另见

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSA::SignData(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


使用指定的哈希算法和填充方式计算指定数据数组的哈希值，并对结果进行签名。

```cpp
ByteArrayPtr System::Security::Cryptography::RSA::SignData(const ByteArrayPtr &data, int32_t offset, int32_t count, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 数据 | const ByteArrayPtr\& | 输入数据数组。 |
| offset | int32_t | 在 **data** 中的偏移。 |
| count | int32_t | 用作输入数据的字节数。 |
| hash_algorithm | const HashAlgorithmName\& | 哈希算法。 |
| padding | const SharedPtr\<RSASignaturePadding\>\& | 填充模式。返回输入数据的 [RSA](../) 签名。 |

## 另见

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSA::SignData(const StreamPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


使用指定的哈希算法和填充，对指定的二进制流计算哈希值并对结果进行签名。

```cpp
ByteArrayPtr System::Security::Cryptography::RSA::SignData(const StreamPtr &stream, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 流 | const StreamPtr\& | 二进制流。 |
| hash_algorithm | const HashAlgorithmName\& | 哈希算法。 |
| padding | const SharedPtr\<RSASignaturePadding\>\& | 填充模式。返回输入数据的 [RSA](../) 签名。 |

## 另见

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
