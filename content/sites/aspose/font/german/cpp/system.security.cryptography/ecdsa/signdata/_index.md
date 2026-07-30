---
title: "System::Security::Cryptography::ECDsa::SignData Methode"
linktitle: "SignData"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::ECDsa::SignData Methode. Berechnet den Hashwert des angegebenen Datenarrays mit dem angegebenen Hash-Algorithmus und signiert das Ergebnis in C++."
type: docs
weight: 700
url: /de/cpp/system.security.cryptography/ecdsa/signdata/
---
## ECDsa::SignData(const ByteArrayPtr\&, const HashAlgorithmName\&) method


Berechnet den Hashwert des angegebenen Datenarrays mit dem angegebenen Hash-Algorithmus und signiert das Ergebnis.

```cpp
virtual ByteArrayPtr System::Security::Cryptography::ECDsa::SignData(const ByteArrayPtr &data, const HashAlgorithmName &hash_algorithm)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Daten | const ByteArrayPtr\& | Eingabedatenarray. |
| hash_algorithm | const HashAlgorithmName\& | Hash-Algorithmus. Gibt die ECDSA-Signatur für die Eingabedaten zurück. |

## Siehe auch

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## ECDsa::SignData(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) method


Berechnet den Hashwert des angegebenen Datenarrays mit dem angegebenen Hash-Algorithmus und signiert das Ergebnis.

```cpp
virtual ByteArrayPtr System::Security::Cryptography::ECDsa::SignData(const ByteArrayPtr &data, int32_t offset, int32_t count, const HashAlgorithmName &hash_algorithm)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Daten | const ByteArrayPtr\& | Eingabedatenarray. |
| Offset | int32_t | Versatz in **data**. |
| count | int32_t | Anzahl der Bytes, die als Eingabedaten verwendet werden sollen. |
| hash_algorithm | const HashAlgorithmName\& | Hash-Algorithmus. Gibt die ECDSA-Signatur für die Eingabedaten zurück. |

## Siehe auch

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## ECDsa::SignData(const StreamPtr\&, const HashAlgorithmName\&) method


Berechnet den Hashwert des angegebenen Binärstroms mit dem angegebenen Hash-Algorithmus und signiert das Ergebnis.

```cpp
virtual ByteArrayPtr System::Security::Cryptography::ECDsa::SignData(const StreamPtr &stream, const HashAlgorithmName &hash_algorithm)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Stream | const StreamPtr\& | Binärer Stream. |
| hash_algorithm | const HashAlgorithmName\& | Hash-Algorithmus. Gibt die ECDSA-Signatur für die Eingabedaten zurück. |

## Siehe auch

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
