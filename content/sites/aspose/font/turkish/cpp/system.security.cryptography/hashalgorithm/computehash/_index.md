---
title: "System::Security::Cryptography::HashAlgorithm::ComputeHash yöntemi"
linktitle: "ComputeHash"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::HashAlgorithm::ComputeHash yöntemi. C++'da tamponu hash'ler."
type: docs
weight: 200
url: /tr/cpp/system.security.cryptography/hashalgorithm/computehash/
---
## HashAlgorithm::ComputeHash(const ArrayPtr\<uint8_t\>\&) method


Tamponu hash'ler.

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::ComputeHash(const ArrayPtr<uint8_t> &buffer)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | Kaynak tampon. |

### ReturnValue

Hesaplanan hash değeri.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## HashAlgorithm::ComputeHash(const ArrayPtr\<uint8_t\>\&, int, int) method


Tampon dilimini hash'ler.

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::ComputeHash(const ArrayPtr<uint8_t> &buffer, int offset, int count)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | Kaynak tampon. |
| offset | int | Kaynak tampondaki ofset. |
| count | int | Kaynak tampondan kullanılacak bayt sayısı. |

### ReturnValue

Hesaplanan hash değeri.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## HashAlgorithm::ComputeHash(SharedPtr\<IO::Stream\> const\&) method


Akışı sonuna kadar okur ve okunan veri için hash hesaplar.

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::ComputeHash(SharedPtr<IO::Stream> const &inputStream)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| inputStream | SharedPtr\<IO::Stream\> const\& | Veri okunacak akış. |

### ReturnValue

Tüm akış verisi için hesaplanmış karma değer.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
