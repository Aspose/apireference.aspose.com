---
title: "System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature method"
linktitle: "CreateSignature"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature method. Πληροφορίες RTTI σε C++."
type: docs
weight: 100
url: /el/cpp/system.security.cryptography/asymmetricsignatureformatter/createsignature/
---
## AsymmetricSignatureFormatter::CreateSignature(System::ArrayPtr\<uint8_t\>) method


Πληροφορίες RTTI.

```cpp
virtual System::ArrayPtr<uint8_t> System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature(System::ArrayPtr<uint8_t> rgbHash)=0
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| rgbHash | System::ArrayPtr\<uint8_t\> | [Data](../../../system.data/) για τον υπολογισμό του κατακερματισμού. |

### ReturnValue

Υπολογισμένη υπογραφή σε μορφή πίνακα byte.
## Παρατηρήσεις


Δημιουργεί την υπογραφή για τα καθορισμένα δεδομένα.
## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [AsymmetricSignatureFormatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## AsymmetricSignatureFormatter::CreateSignature(System::SharedPtr\<HashAlgorithm\>) method


Δημιουργεί την υπογραφή για την καθορισμένη τιμή κατακερματισμού.

```cpp
virtual System::ArrayPtr<uint8_t> System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature(System::SharedPtr<HashAlgorithm> hash)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| hash | System::SharedPtr\<HashAlgorithm\> | Αλγόριθμος κατακερματισμού προς χρήση κατά τη δημιουργία της υπογραφής. |

### ReturnValue

Υπολογισμένη υπογραφή σε μορφή πίνακα byte.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HashAlgorithm](../../hashalgorithm/)
* Class [AsymmetricSignatureFormatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
