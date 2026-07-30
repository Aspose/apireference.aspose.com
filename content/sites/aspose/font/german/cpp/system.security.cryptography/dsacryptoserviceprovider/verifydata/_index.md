---
title: "System::Security::Cryptography::DSACryptoServiceProvider::VerifyData Methode"
linktitle: "VerifyData"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::DSACryptoServiceProvider::VerifyData Methode. Prüft die Datensignatur in C++."
type: docs
weight: 1700
url: /de/cpp/system.security.cryptography/dsacryptoserviceprovider/verifydata/
---
## DSACryptoServiceProvider::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&) method


Prüft die Datensignatur.

```cpp
bool System::Security::Cryptography::DSACryptoServiceProvider::VerifyData(const ByteArrayPtr &buffer, const ByteArrayPtr &signature)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Daten](../../../system.data/) zur Überprüfung der Signatur. |
| Signatur | const ByteArrayPtr\& | Signatur wie empfangen. |

### ReturnValue

True, wenn die Signatur gültig ist, false sonst.

## Siehe auch

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSACryptoServiceProvider::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


Überprüft, ob die Signatur der angegebenen Daten gültig ist.

```cpp
bool System::Security::Cryptography::DSA::VerifyData(const ByteArrayPtr &data, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Daten | const ByteArrayPtr\& | Signierte Daten. |
| Signatur | const ByteArrayPtr\& | Signaturdaten. |
| hash_algorithm | const HashAlgorithmName\& | Hash-Algorithmus. Gibt true zurück, wenn die Signatur gültig ist, andernfalls false. |

## Siehe auch

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSACryptoServiceProvider::VerifyData(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) method


Überprüft, ob die Signatur der angegebenen Daten gültig ist.

```cpp
bool System::Security::Cryptography::DSA::VerifyData(const ByteArrayPtr &data, int32_t offset, int32_t count, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Daten | const ByteArrayPtr\& | Signierte Daten. |
| Offset | int32_t | Versatz in **data**. |
| count | int32_t | Anzahl der zu hashenden Bytes. |
| Signatur | const ByteArrayPtr\& | Signaturdaten. |
| hash_algorithm | const HashAlgorithmName\& | Hash-Algorithmus. Gibt true zurück, wenn die Signatur gültig ist, andernfalls false. |

## Siehe auch

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSACryptoServiceProvider::VerifyData(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


Überprüft, ob die Signatur des angegebenen Binärstroms gültig ist.

```cpp
bool System::Security::Cryptography::DSA::VerifyData(const StreamPtr &stream, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Stream | const StreamPtr\& | Signierte Daten. |
| Signatur | const ByteArrayPtr\& | Signaturdaten. |
| hash_algorithm | const HashAlgorithmName\& | Hash-Algorithmus. Gibt true zurück, wenn die Signatur gültig ist, andernfalls false. |

## Siehe auch

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
