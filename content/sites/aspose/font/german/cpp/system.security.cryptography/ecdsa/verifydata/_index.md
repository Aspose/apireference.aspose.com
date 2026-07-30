---
title: "System::Security::Cryptography::ECDsa::VerifyData method"
linktitle: "VerifyData"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::ECDsa::VerifyData method. Verifiziert, dass die Signatur der angegebenen Daten in C++ gültig ist."
type: docs
weight: 900
url: /de/cpp/system.security.cryptography/ecdsa/verifydata/
---
## ECDsa::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


Überprüft, ob die Signatur der angegebenen Daten gültig ist.

```cpp
bool System::Security::Cryptography::ECDsa::VerifyData(const ByteArrayPtr &data, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Daten | const ByteArrayPtr\& | Signierte Daten. |
| Signatur | const ByteArrayPtr\& | Signaturdaten. |
| hash_algorithm | const HashAlgorithmName\& | Hash-Algorithmus. Gibt true zurück, wenn die Signatur gültig ist, andernfalls false. |

## Siehe auch

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## ECDsa::VerifyData(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) method


Überprüft, ob die Signatur der angegebenen Daten gültig ist.

```cpp
bool System::Security::Cryptography::ECDsa::VerifyData(const ByteArrayPtr &data, int32_t offset, int32_t count, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
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
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## ECDsa::VerifyData(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


Überprüft, ob die Signatur des angegebenen Binärstroms gültig ist.

```cpp
bool System::Security::Cryptography::ECDsa::VerifyData(const StreamPtr &stream, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Stream | const StreamPtr\& | Signierte Daten. |
| Signatur | const ByteArrayPtr\& | Signaturdaten. |
| hash_algorithm | const HashAlgorithmName\& | Hash-Algorithmus. Gibt true zurück, wenn die Signatur gültig ist, andernfalls false. |

## Siehe auch

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
