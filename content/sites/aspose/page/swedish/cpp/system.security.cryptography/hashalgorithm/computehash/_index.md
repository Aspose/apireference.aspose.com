---
title: "System::Security::Cryptography::HashAlgorithm::ComputeHash method"
linktitle: "ComputeHash"
second_title: "Aspose.Page för C++"
description: "System::Security::Cryptography::HashAlgorithm::ComputeHash method. Hashar bufferten i C++."
type: docs
weight: 200
url: /sv/cpp/system.security.cryptography/hashalgorithm/computehash/
---
## HashAlgorithm::ComputeHash(const ArrayPtr\<uint8_t\>\&) method


Hashar buffert.

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::ComputeHash(const ArrayPtr<uint8_t> &buffer)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | const ArrayPtr\<uint8_t\>\& | Källbuffert. |

### ReturnValue

Beräknat hashvärde.

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## HashAlgorithm::ComputeHash(const ArrayPtr\<uint8_t\>\&, int, int) method


Hashar buffertdel.

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::ComputeHash(const ArrayPtr<uint8_t> &buffer, int offset, int count)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | const ArrayPtr\<uint8_t\>\& | Källbuffert. |
| offset | int | Offset i källbufferten. |
| count | int | Antal byte att använda från källbufferten. |

### ReturnValue

Beräknat hashvärde.

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## HashAlgorithm::ComputeHash(SharedPtr\<IO::Stream\> const\&) method


Läser ström tills slutet och beräknar hash för den lästa datan.

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::ComputeHash(SharedPtr<IO::Stream> const &inputStream)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| inputStream | SharedPtr\<IO::Stream\> const\& | Ström att läsa data från. |

### ReturnValue

Beräknat hashvärde för hela strömdatan.

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
