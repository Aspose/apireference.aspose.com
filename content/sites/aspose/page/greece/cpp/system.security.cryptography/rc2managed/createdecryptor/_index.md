---
title: "System::Security::Cryptography::RC2Managed::CreateDecryptor μέθοδος"
linktitle: "CreateDecryptor"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::RC2Managed::CreateDecryptor μέθοδος. Δημιουργεί αντικείμενο αποκρυπτογράφησης με παραμέτρους που ορίζονται από το αντικείμενο αλγορίθμου σε C++."
type: docs
weight: 100
url: /el/cpp/system.security.cryptography/rc2managed/createdecryptor/
---
## RC2Managed::CreateDecryptor() method


Δημιουργεί αντικείμενο αποκρυπτογράφησης με παραμέτρους που ορίζονται από το αντικείμενο αλγορίθμου.

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateDecryptor()
```

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Class [RC2Managed](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RC2Managed::CreateDecryptor(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Δημιουργεί αντικείμενο αποκρυπτογράφησης με ρητές παραμέτρους.

```cpp
SharedPtr<ICryptoTransform> System::Security::Cryptography::RC2Managed::CreateDecryptor(System::ArrayPtr<uint8_t> rgbKey, System::ArrayPtr<uint8_t> rgbIV) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| rgbKey | System::ArrayPtr\<uint8_t\> | Κλειδί κρυπτογράφησης σε μορφή πίνακα byte. |
| rgbIV | System::ArrayPtr\<uint8_t\> | Αρχική τιμή σε μορφή πίνακα byte. |

### ReturnValue

Νέο δημιουργημένο αντικείμενο αποκρυπτογράφησης.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [RC2Managed](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
