---
title: "System::Security::Cryptography::RSA::VerifyData methode"
linktitle: "VerifyData"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::RSA::VerifyData methode. Verifieert dat de handtekening van de opgegeven gegevens geldig is in C++."
type: docs
weight: 1300
url: /nl/cpp/system.security.cryptography/rsa/verifydata/
---
## RSA::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


Verifieert dat de handtekening van de opgegeven gegevens geldig is.

```cpp
bool System::Security::Cryptography::RSA::VerifyData(const ByteArrayPtr &data, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| gegevens | const ByteArrayPtr\& | Ondertekende gegevens. |
| handtekening | const ByteArrayPtr\& | Handtekeninggegevens. |
| hash_algorithm | const HashAlgorithmName\& | Hash-algoritme. |
| opvulling | const SharedPtr\<RSASignaturePadding\>\& | Opvulmodus. return true als de handtekening geldig is, anders - false. |

## Zie ook

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSA::VerifyData(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


Verifieert dat de handtekening van de opgegeven gegevens geldig is.

```cpp
bool System::Security::Cryptography::RSA::VerifyData(const ByteArrayPtr &data, int32_t offset, int32_t count, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| gegevens | const ByteArrayPtr\& | Ondertekende gegevens. |
| offset | int32_t | Offset in **data**. |
| count | int32_t | Aantal bytes om te hashen. |
| handtekening | const ByteArrayPtr\& | Handtekeninggegevens. |
| hash_algorithm | const HashAlgorithmName\& | Hash-algoritme. |
| opvulling | const SharedPtr\<RSASignaturePadding\>\& | Opvulmodus. return true als de handtekening geldig is, anders - false. |

## Zie ook

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSA::VerifyData(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


Verifieert dat de handtekening van de opgegeven binaire stroom geldig is.

```cpp
bool System::Security::Cryptography::RSA::VerifyData(const StreamPtr &stream, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stream | const StreamPtr\& | Ondertekende gegevens. |
| handtekening | const ByteArrayPtr\& | Handtekeninggegevens. |
| hash_algorithm | const HashAlgorithmName\& | Hash-algoritme. |
| opvulling | const SharedPtr\<RSASignaturePadding\>\& | Opvulmodus. return true als de handtekening geldig is, anders - false. |

## Zie ook

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
