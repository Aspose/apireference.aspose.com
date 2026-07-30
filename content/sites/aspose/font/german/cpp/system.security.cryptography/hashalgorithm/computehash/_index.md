---
title: "System::Security::Cryptography::HashAlgorithm::ComputeHash Methode"
linktitle: "ComputeHash"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::HashAlgorithm::ComputeHash Methode. Hasht den Puffer in C++."
type: docs
weight: 200
url: /de/cpp/system.security.cryptography/hashalgorithm/computehash/
---
## HashAlgorithm::ComputeHash(const ArrayPtr\<uint8_t\>\&) method


Hasht den Puffer.

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::ComputeHash(const ArrayPtr<uint8_t> &buffer)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | Quellpuffer. |

### ReturnValue

Berechneter Hash-Wert.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## HashAlgorithm::ComputeHash(const ArrayPtr\<uint8_t\>\&, int, int) method


Hasht einen Pufferabschnitt.

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::ComputeHash(const ArrayPtr<uint8_t> &buffer, int offset, int count)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | Quellpuffer. |
| Offset | int | Versatz im Quellpuffer. |
| count | int | Anzahl der Bytes, die aus dem Quellpuffer verwendet werden sollen. |

### ReturnValue

Berechneter Hash-Wert.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## HashAlgorithm::ComputeHash(SharedPtr\<IO::Stream\> const\&) method


Liest den Stream bis zum Ende und berechnet den Hash für die gelesenen Daten.

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::ComputeHash(SharedPtr<IO::Stream> const &inputStream)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| inputStream | SharedPtr\<IO::Stream\> const\& | Stream zum Lesen von Daten. |

### ReturnValue

Berechneter Hashwert für die gesamten Stream-Daten.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
