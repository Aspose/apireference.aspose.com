---
title: VerifyData()
second_title: Aspose.Slides for C++ API Reference
description: Checks data signature.
type: docs
weight: 209
url: /cpp/system.security.cryptography/dsacryptoserviceprovider/verifydata/
---
## DSACryptoServiceProvider::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&) method


Checks data signature.

```cpp
bool System::Security::Cryptography::DSACryptoServiceProvider::VerifyData(const ByteArrayPtr &buffer, const ByteArrayPtr &signature)
```


### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| buffer | const [ByteArrayPtr](../../../system/bytearrayptr/)\& | [Data](../../../system.data/) to check signature for. |
| signature | const [ByteArrayPtr](../../../system/bytearrayptr/)\& | Signature as received. |

### Return Value

True if signature is valid, false otherwise.

## DSACryptoServiceProvider::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


Verifies that the signature of the specified data is valid.

```cpp
bool System::Security::Cryptography::DSA::VerifyData(const ByteArrayPtr &data, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| data | const [ByteArrayPtr](../../../system/bytearrayptr/)\& | Signed data. |
| signature | const [ByteArrayPtr](../../../system/bytearrayptr/)\& | Signature data. |
| hash_algorithm | const [HashAlgorithmName](../../hashalgorithmname/)\& | Hash algorithm. return true if signature is valid, otherwise - false. |

## DSACryptoServiceProvider::VerifyData(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) method


Verifies that the signature of the specified data is valid.

```cpp
bool System::Security::Cryptography::DSA::VerifyData(const ByteArrayPtr &data, int32_t offset, int32_t count, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| data | const [ByteArrayPtr](../../../system/bytearrayptr/)\& | Signed data. |
| offset | **int32_t** | Offset in **data**. |
| count | **int32_t** | Number of bytes to hash. |
| signature | const [ByteArrayPtr](../../../system/bytearrayptr/)\& | Signature data. |
| hash_algorithm | const [HashAlgorithmName](../../hashalgorithmname/)\& | Hash algorithm. return true if signature is valid, otherwise - false. |

## DSACryptoServiceProvider::VerifyData(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


Verifies that the signature of the specified binary stream is valid.

```cpp
bool System::Security::Cryptography::DSA::VerifyData(const StreamPtr &stream, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| stream | const [StreamPtr](../../../system/streamptr/)\& | Signed data. |
| signature | const [ByteArrayPtr](../../../system/bytearrayptr/)\& | Signature data. |
| hash_algorithm | const [HashAlgorithmName](../../hashalgorithmname/)\& | Hash algorithm. return true if signature is valid, otherwise - false. |

## See Also

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Class [DSACryptoServiceProvider](../)
* Struct [HashAlgorithmName](../../hashalgorithmname/)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Slides](../../../)