---
title: "Metodo System::Security::Cryptography::HashAlgorithm::ComputeHash"
linktitle: "ComputeHash"
second_title: "Aspose.Font per C++"
description: "Metodo System::Security::Cryptography::HashAlgorithm::ComputeHash. Esegue l'hash del buffer in C++."
type: docs
weight: 200
url: /it/cpp/system.security.cryptography/hashalgorithm/computehash/
---
## HashAlgorithm::ComputeHash(const ArrayPtr\<uint8_t\>\&) method


Esegue l'hash del buffer.

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::ComputeHash(const ArrayPtr<uint8_t> &buffer)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | Buffer di origine. |

### ReturnValue

Valore hash calcolato.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## HashAlgorithm::ComputeHash(const ArrayPtr\<uint8_t\>\&, int, int) method


Esegue l'hash di una porzione del buffer.

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::ComputeHash(const ArrayPtr<uint8_t> &buffer, int offset, int count)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | Buffer di origine. |
| offset | int | Offset nel buffer di origine. |
| count | int | Numero di byte da utilizzare dal buffer di origine. |

### ReturnValue

Valore hash calcolato.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## HashAlgorithm::ComputeHash(SharedPtr\<IO::Stream\> const\&) method


Legge lo stream fino alla fine e calcola l'hash per i dati letti.

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::ComputeHash(SharedPtr<IO::Stream> const &inputStream)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| inputStream | SharedPtr\<IO::Stream\> const\& | Stream da cui leggere i dati. |

### ReturnValue

Valore hash calcolato per tutti i dati dello stream.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
