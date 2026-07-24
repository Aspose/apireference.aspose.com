---
title: "System::Security::Cryptography::RSA::SignData methode"
linktitle: "SignData"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::RSA::SignData methode. Berekent de hashwaarde van de opgegeven gegevensarray met behulp van het opgegeven hash-algoritme en opvulling, en ondertekent het resultaat in C++."
type: docs
weight: 1000
url: /nl/cpp/system.security.cryptography/rsa/signdata/
---
## RSA::SignData(const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


Berekent de hashwaarde van de gespecificeerde gegevensarray met het gespecificeerde hash-algoritme en opvulling, en ondertekent het resultaat.

```cpp
ByteArrayPtr System::Security::Cryptography::RSA::SignData(const ByteArrayPtr &data, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| gegevens | const ByteArrayPtr\& | Invoergegevensarray. |
| hash_algorithm | const HashAlgorithmName\& | Hash-algoritme. |
| padding | const SharedPtr\<RSASignaturePadding\>\& | Opvulmodus. retourneert een [RSA](../)-handtekening voor de invoergegevens. |

## Zie ook

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSA::SignData(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


Berekent de hashwaarde van de gespecificeerde gegevensarray met het gespecificeerde hash-algoritme en opvulling, en ondertekent het resultaat.

```cpp
ByteArrayPtr System::Security::Cryptography::RSA::SignData(const ByteArrayPtr &data, int32_t offset, int32_t count, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| gegevens | const ByteArrayPtr\& | Invoergegevensarray. |
| offset | int32_t | Offset in **data**. |
| count | int32_t | Aantal bytes dat als invoergegevens moet worden gebruikt. |
| hash_algorithm | const HashAlgorithmName\& | Hash-algoritme. |
| padding | const SharedPtr\<RSASignaturePadding\>\& | Opvulmodus. retourneert een [RSA](../)-handtekening voor de invoergegevens. |

## Zie ook

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSA::SignData(const StreamPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


Berekent de hashwaarde van de gespecificeerde binaire stroom met het gespecificeerde hash-algoritme en opvulling, en ondertekent het resultaat.

```cpp
ByteArrayPtr System::Security::Cryptography::RSA::SignData(const StreamPtr &stream, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stream | const StreamPtr\& | Binaire stroom. |
| hash_algorithm | const HashAlgorithmName\& | Hash-algoritme. |
| padding | const SharedPtr\<RSASignaturePadding\>\& | Opvulmodus. retourneert een [RSA](../)-handtekening voor de invoergegevens. |

## Zie ook

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
