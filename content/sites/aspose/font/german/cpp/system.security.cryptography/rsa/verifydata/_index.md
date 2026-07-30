---
title: "System::Security::Cryptography::RSA::VerifyData-Methode"
linktitle: "VerifyData"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::RSA::VerifyData-Methode. Überprüft, ob die Signatur der angegebenen Daten in C++ gültig ist."
type: docs
weight: 1300
url: /de/cpp/system.security.cryptography/rsa/verifydata/
---
## RSA::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


Überprüft, ob die Signatur der angegebenen Daten gültig ist.

```cpp
bool System::Security::Cryptography::RSA::VerifyData(const ByteArrayPtr &data, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Daten | const ByteArrayPtr\& | Signierte Daten. |
| Signatur | const ByteArrayPtr\& | Signaturdaten. |
| hash_algorithm | const HashAlgorithmName\& | Hash-Algorithmus. |
| Padding | const SharedPtr\<RSASignaturePadding\>\& | Padding-Modus. Gibt true zurück, wenn die Signatur gültig ist, andernfalls false. |

## Siehe auch

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSA::VerifyData(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


Überprüft, ob die Signatur der angegebenen Daten gültig ist.

```cpp
bool System::Security::Cryptography::RSA::VerifyData(const ByteArrayPtr &data, int32_t offset, int32_t count, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Daten | const ByteArrayPtr\& | Signierte Daten. |
| Offset | int32_t | Versatz in **data**. |
| count | int32_t | Anzahl der zu hashenden Bytes. |
| Signatur | const ByteArrayPtr\& | Signaturdaten. |
| hash_algorithm | const HashAlgorithmName\& | Hash-Algorithmus. |
| Padding | const SharedPtr\<RSASignaturePadding\>\& | Padding-Modus. Gibt true zurück, wenn die Signatur gültig ist, andernfalls false. |

## Siehe auch

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSA::VerifyData(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


Überprüft, ob die Signatur des angegebenen Binärstroms gültig ist.

```cpp
bool System::Security::Cryptography::RSA::VerifyData(const StreamPtr &stream, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Stream | const StreamPtr\& | Signierte Daten. |
| Signatur | const ByteArrayPtr\& | Signaturdaten. |
| hash_algorithm | const HashAlgorithmName\& | Hash-Algorithmus. |
| Padding | const SharedPtr\<RSASignaturePadding\>\& | Padding-Modus. Gibt true zurück, wenn die Signatur gültig ist, andernfalls false. |

## Siehe auch

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
