---
title: "System::Security::Cryptography::TripleDESManaged::CreateDecryptor method"
linktitle: "CreateDecryptor"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::TripleDESManaged::CreateDecryptor method. Δημιουργεί αντικείμενο αποκρυπτογράφησης με παραμέτρους που ορίζονται από το αντικείμενο αλγορίθμου σε C++."
type: docs
weight: 100
url: /el/cpp/system.security.cryptography/tripledesmanaged/createdecryptor/
---
## TripleDESManaged::CreateDecryptor() method


Δημιουργεί αντικείμενο αποκρυπτογράφησης με παραμέτρους που ορίζονται από το αντικείμενο αλγορίθμου.

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateDecryptor()
```

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Class [TripleDESManaged](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## TripleDESManaged::CreateDecryptor(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Δημιουργεί αντικείμενο αποκρυπτογράφησης με ρητές παραμέτρους.

```cpp
SharedPtr<ICryptoTransform> System::Security::Cryptography::TripleDESManaged::CreateDecryptor(System::ArrayPtr<uint8_t> rgbKey, System::ArrayPtr<uint8_t> rgbIV) override
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
* Class [TripleDESManaged](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
