---
title: "System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature μέθοδος"
linktitle: "VerifySignature"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature μέθοδος. Επαληθεύει την υπογραφή στα δεδομένα σε C++."
type: docs
weight: 300
url: /el/cpp/system.security.cryptography/asymmetricsignaturedeformatter/verifysignature/
---
## AsymmetricSignatureDeformatter::VerifySignature(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Επαληθεύει την υπογραφή στα δεδομένα.

```cpp
virtual bool System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature(System::ArrayPtr<uint8_t> rgbHash, System::ArrayPtr<uint8_t> rgbSignature)=0
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| rgbHash | System::ArrayPtr\<uint8_t\> | [Δεδομένα](../../../system.data/) υπογεγραμμένα με **rgbSignature**. |
| rgbSignature | System::ArrayPtr\<uint8_t\> | Υπογραφή που πρέπει να επαληθευτεί για τα δεδομένα. |

### ReturnValue

Αληθές εάν ο έλεγχος υπογραφής πετύχει, ψευδές διαφορετικά.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [AsymmetricSignatureDeformatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## AsymmetricSignatureDeformatter::VerifySignature(System::SharedPtr\<HashAlgorithm\>, System::ArrayPtr\<uint8_t\>) method


Επαληθεύει την υπογραφή στα δεδομένα. Δεν έχει υλοποιηθεί.

```cpp
virtual bool System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature(System::SharedPtr<HashAlgorithm> hash, System::ArrayPtr<uint8_t> rgbSignature)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| hash | System::SharedPtr\<HashAlgorithm\> | Αλγόριθμος που θα χρησιμοποιηθεί για κατακερματισμό. |
| rgbSignature | System::ArrayPtr\<uint8_t\> | Υπογραφή που πρέπει να επαληθευτεί για τα δεδομένα. |

### ReturnValue

Αληθές εάν ο έλεγχος υπογραφής πετύχει, ψευδές διαφορετικά.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HashAlgorithm](../../hashalgorithm/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [AsymmetricSignatureDeformatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
