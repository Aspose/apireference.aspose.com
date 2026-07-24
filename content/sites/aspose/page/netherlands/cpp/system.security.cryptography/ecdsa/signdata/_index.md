---
title: "System::Security::Cryptography::ECDsa::SignData methode"
linktitle: "SignData"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::ECDsa::SignData methode. Berekent de hashwaarde van de opgegeven gegevensarray met behulp van het opgegeven hash-algoritme en ondertekent het resultaat in C++."
type: docs
weight: 700
url: /nl/cpp/system.security.cryptography/ecdsa/signdata/
---
## ECDsa::SignData(const ByteArrayPtr\&, const HashAlgorithmName\&) method


Berekent de hashwaarde van de opgegeven gegevensarray met het opgegeven hash-algoritme en ondertekent het resultaat.

```cpp
virtual ByteArrayPtr System::Security::Cryptography::ECDsa::SignData(const ByteArrayPtr &data, const HashAlgorithmName &hash_algorithm)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| gegevens | const ByteArrayPtr\& | Invoergegevensarray. |
| hash_algorithm | const HashAlgorithmName\& | Hash-algoritme. retourneert ECDSA-handtekening voor de invoergegevens. |

## Zie ook

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## ECDsa::SignData(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) method


Berekent de hashwaarde van de opgegeven gegevensarray met het opgegeven hash-algoritme en ondertekent het resultaat.

```cpp
virtual ByteArrayPtr System::Security::Cryptography::ECDsa::SignData(const ByteArrayPtr &data, int32_t offset, int32_t count, const HashAlgorithmName &hash_algorithm)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| gegevens | const ByteArrayPtr\& | Invoergegevensarray. |
| offset | int32_t | Offset in **data**. |
| count | int32_t | Aantal bytes dat als invoergegevens moet worden gebruikt. |
| hash_algorithm | const HashAlgorithmName\& | Hash-algoritme. retourneert ECDSA-handtekening voor de invoergegevens. |

## Zie ook

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## ECDsa::SignData(const StreamPtr\&, const HashAlgorithmName\&) method


Berekent de hashwaarde van de opgegeven binaire stroom met het opgegeven hash-algoritme en ondertekent het resultaat.

```cpp
virtual ByteArrayPtr System::Security::Cryptography::ECDsa::SignData(const StreamPtr &stream, const HashAlgorithmName &hash_algorithm)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stream | const StreamPtr\& | Binaire stroom. |
| hash_algorithm | const HashAlgorithmName\& | Hash-algoritme. retourneert ECDSA-handtekening voor de invoergegevens. |

## Zie ook

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
