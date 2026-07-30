---
title: "System::Security::Cryptography::ECDsaBotan::VerifyData 方法"
linktitle: "VerifyData"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::ECDsaBotan::VerifyData 方法。验证指定数据的签名在 C++ 中是否有效。"
type: docs
weight: 1400
url: /zh/cpp/system.security.cryptography/ecdsabotan/verifydata/
---
## ECDsaBotan::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&) method


验证指定数据的签名是否有效。

```cpp
bool System::Security::Cryptography::ECDsaBotan::VerifyData(const ByteArrayPtr &data, const ByteArrayPtr &signature)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 数据 | const ByteArrayPtr\& | 已签名的数据。 |
| 签名 | const ByteArrayPtr\& | 签名数据。若签名有效返回 true，否则返回 false。 |

## 另见

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsaBotan](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## ECDsaBotan::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


验证指定数据的签名是否有效。

```cpp
bool System::Security::Cryptography::ECDsa::VerifyData(const ByteArrayPtr &data, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 数据 | const ByteArrayPtr\& | 已签名的数据。 |
| 签名 | const ByteArrayPtr\& | 签名数据。 |
| hash_algorithm | const HashAlgorithmName\& | 哈希算法。若签名有效返回 true，否则返回 false。 |

## 另见

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsaBotan](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## ECDsaBotan::VerifyData(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&) method


验证指定数据的签名是否有效。

```cpp
bool System::Security::Cryptography::ECDsaBotan::VerifyData(const ByteArrayPtr &data, int32_t offset, int32_t count, const ByteArrayPtr &signature)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 数据 | const ByteArrayPtr\& | 已签名的数据。 |
| offset | int32_t | 在 **data** 中的偏移。 |
| count | int32_t | 要进行哈希的字节数。 |
| 签名 | const ByteArrayPtr\& | 签名数据。若签名有效返回 true，否则返回 false。 |

## 另见

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsaBotan](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## ECDsaBotan::VerifyData(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) method


验证指定数据的签名是否有效。

```cpp
bool System::Security::Cryptography::ECDsa::VerifyData(const ByteArrayPtr &data, int32_t offset, int32_t count, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 数据 | const ByteArrayPtr\& | 已签名的数据。 |
| offset | int32_t | 在 **data** 中的偏移。 |
| count | int32_t | 要进行哈希的字节数。 |
| 签名 | const ByteArrayPtr\& | 签名数据。 |
| hash_algorithm | const HashAlgorithmName\& | 哈希算法。若签名有效返回 true，否则返回 false。 |

## 另见

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsaBotan](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## ECDsaBotan::VerifyData(const StreamPtr\&, const ByteArrayPtr\&) method


验证指定二进制流的签名是否有效。

```cpp
bool System::Security::Cryptography::ECDsaBotan::VerifyData(const StreamPtr &stream, const ByteArrayPtr &signature)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 流 | const StreamPtr\& | 已签名的数据。 |
| 签名 | const ByteArrayPtr\& | 签名数据。若签名有效返回 true，否则返回 false。 |

## 另见

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsaBotan](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## ECDsaBotan::VerifyData(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


验证指定二进制流的签名是否有效。

```cpp
bool System::Security::Cryptography::ECDsa::VerifyData(const StreamPtr &stream, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 流 | const StreamPtr\& | 已签名的数据。 |
| 签名 | const ByteArrayPtr\& | 签名数据。 |
| hash_algorithm | const HashAlgorithmName\& | 哈希算法。若签名有效返回 true，否则返回 false。 |

## 另见

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsaBotan](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
