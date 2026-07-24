---
title: "Μέθοδος System::Security::Cryptography::RSACryptoServiceProvider::Decrypt"
linktitle: "Αποκρυπτογράφηση"
second_title: "Aspose.Page για C++"
description: "Μέθοδος System::Security::Cryptography::RSACryptoServiceProvider::Decrypt. Αποκρυπτογραφεί τα δεδομένα εισόδου χρησιμοποιώντας τη συγκεκριμένη λειτουργία γεμίσματος σε C++."
type: docs
weight: 200
url: /el/cpp/system.security.cryptography/rsacryptoserviceprovider/decrypt/
---
## RSACryptoServiceProvider::Decrypt(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) method


Αποκρυπτογραφεί τα εισερχόμενα δεδομένα χρησιμοποιώντας τη συγκεκριμένη λειτουργία γεμίσματος.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Decrypt(ByteArrayPtr data, SharedPtr<RSAEncryptionPadding> padding) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| data | ByteArrayPtr | [Byte](../../../system/byte/) πίνακας για αποκρυπτογράφηση. |
| συμπλήρωση | SharedPtr\<RSAEncryptionPadding\> | Λειτουργία padding. |

### ReturnValue

Αποκρυπτογραφημένα δεδομένα σε μορφή πίνακα byte.

## Δείτε επίσης

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSAEncryptionPadding](../../rsaencryptionpadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::Decrypt(const ByteArrayPtr\&, bool) method


Αποκρυπτογραφεί το μήνυμα. Δεν έχει υλοποιηθεί.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Decrypt(const ByteArrayPtr &rgb, bool use_oaep)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| rgb | const ByteArrayPtr\& | [Data](../../../system.data/) για αποκρυπτογράφηση. |
| use_oaep | bool | True για χρήση γεμίσματος OAEP, false για χρήση γεμίσματος PKCS#1 v1.5. |

### ReturnValue

Πίνακας αποκρυπτογραφημένων δεδομένων.

## Δείτε επίσης

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
