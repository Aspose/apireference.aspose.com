---
title: "System::Security::Cryptography::HashAlgorithm::ComputeHash μέθοδος"
linktitle: "ComputeHash"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::HashAlgorithm::ComputeHash μέθοδος. Κατακερματίζει το buffer σε C++."
type: docs
weight: 200
url: /el/cpp/system.security.cryptography/hashalgorithm/computehash/
---
## HashAlgorithm::ComputeHash(const ArrayPtr\<uint8_t\>\&) method


Κατακερματίζει το buffer.

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::ComputeHash(const ArrayPtr<uint8_t> &buffer)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | const ArrayPtr\<uint8_t\>\& | Πηγαίο buffer. |

### ReturnValue

Υπολογισμένη τιμή κατακερματισμού.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## HashAlgorithm::ComputeHash(const ArrayPtr\<uint8_t\>\&, int, int) method


Κατακερματίζει το τμήμα του buffer.

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::ComputeHash(const ArrayPtr<uint8_t> &buffer, int offset, int count)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | const ArrayPtr\<uint8_t\>\& | Πηγαίο buffer. |
| offset | int | Μετατόπιση στο πηγαίο buffer. |
| count | int | Αριθμός byte προς χρήση από το πηγαίο buffer. |

### ReturnValue

Υπολογισμένη τιμή κατακερματισμού.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## HashAlgorithm::ComputeHash(SharedPtr\<IO::Stream\> const\&) method


Διαβάζει τη ροή μέχρι το τέλος και υπολογίζει το κατακερματισμό για τα διαβασμένα δεδομένα.

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::ComputeHash(SharedPtr<IO::Stream> const &inputStream)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| inputStream | SharedPtr\<IO::Stream\> const\& | Ροή για ανάγνωση δεδομένων. |

### ReturnValue

Υπολογισμένη τιμή κατακερματισμού για ολόκληρα τα δεδομένα της ροής.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
