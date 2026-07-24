---
title: "System::Security::Cryptography::DSA::VerifyData methode"
linktitle: "VerifyData"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::DSA::VerifyData methode. Verifieert dat de handtekening van de opgegeven gegevens geldig is in C++."
type: docs
weight: 700
url: /nl/cpp/system.security.cryptography/dsa/verifydata/
---
## DSA::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


Verifieert dat de handtekening van de opgegeven gegevens geldig is.

```cpp
bool System::Security::Cryptography::DSA::VerifyData(const ByteArrayPtr &data, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| gegevens | const ByteArrayPtr\& | Ondertekende gegevens. |
| handtekening | const ByteArrayPtr\& | Handtekeninggegevens. |
| hash_algorithm | const HashAlgorithmName\& | Hash-algoritme. retourneert true als de handtekening geldig is, anders - false. |

## Zie ook

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## DSA::VerifyData(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) method


Verifieert dat de handtekening van de opgegeven gegevens geldig is.

```cpp
bool System::Security::Cryptography::DSA::VerifyData(const ByteArrayPtr &data, int32_t offset, int32_t count, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| gegevens | const ByteArrayPtr\& | Ondertekende gegevens. |
| offset | int32_t | Offset in **data**. |
| count | int32_t | Aantal bytes om te hashen. |
| handtekening | const ByteArrayPtr\& | Handtekeninggegevens. |
| hash_algorithm | const HashAlgorithmName\& | Hash-algoritme. retourneert true als de handtekening geldig is, anders - false. |

## Zie ook

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## DSA::VerifyData(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


Verifieert dat de handtekening van de opgegeven binaire stroom geldig is.

```cpp
bool System::Security::Cryptography::DSA::VerifyData(const StreamPtr &stream, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stream | const StreamPtr\& | Ondertekende gegevens. |
| handtekening | const ByteArrayPtr\& | Handtekeninggegevens. |
| hash_algorithm | const HashAlgorithmName\& | Hash-algoritme. retourneert true als de handtekening geldig is, anders - false. |

## Zie ook

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
