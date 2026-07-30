---
title: "System::Security::Cryptography::RSA::SignData Methode"
linktitle: "SignData"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::RSA::SignData-Methode. Berechnet den Hashwert des angegebenen Datenarrays mithilfe des angegebenen Hash-Algorithmus und der Auffüllung und signiert das Ergebnis in C++."
type: docs
weight: 1000
url: /de/cpp/system.security.cryptography/rsa/signdata/
---
## RSA::SignData(const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


Berechnet den Hashwert des angegebenen Datenarrays mit dem angegebenen Hash-Algorithmus und Auffüllung und signiert das Ergebnis.

```cpp
ByteArrayPtr System::Security::Cryptography::RSA::SignData(const ByteArrayPtr &data, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Daten | const ByteArrayPtr\& | Eingabedatenarray. |
| hash_algorithm | const HashAlgorithmName\& | Hash-Algorithmus. |
| padding | const SharedPtr\<RSASignaturePadding\>\& | Auffüllungsmodus. Gibt die [RSA](../)-Signatur für die Eingabedaten zurück. |

## Siehe auch

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSA::SignData(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


Berechnet den Hashwert des angegebenen Datenarrays mit dem angegebenen Hash-Algorithmus und Auffüllung und signiert das Ergebnis.

```cpp
ByteArrayPtr System::Security::Cryptography::RSA::SignData(const ByteArrayPtr &data, int32_t offset, int32_t count, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Daten | const ByteArrayPtr\& | Eingabedatenarray. |
| Offset | int32_t | Versatz in **data**. |
| count | int32_t | Anzahl der Bytes, die als Eingabedaten verwendet werden sollen. |
| hash_algorithm | const HashAlgorithmName\& | Hash-Algorithmus. |
| padding | const SharedPtr\<RSASignaturePadding\>\& | Auffüllungsmodus. Gibt die [RSA](../)-Signatur für die Eingabedaten zurück. |

## Siehe auch

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSA::SignData(const StreamPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


Berechnet den Hashwert des angegebenen Binärstroms mithilfe des angegebenen Hash‑Algorithmus und der Auffüllung und signiert das Ergebnis.

```cpp
ByteArrayPtr System::Security::Cryptography::RSA::SignData(const StreamPtr &stream, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Stream | const StreamPtr\& | Binärer Stream. |
| hash_algorithm | const HashAlgorithmName\& | Hash-Algorithmus. |
| padding | const SharedPtr\<RSASignaturePadding\>\& | Auffüllungsmodus. Gibt die [RSA](../)-Signatur für die Eingabedaten zurück. |

## Siehe auch

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
