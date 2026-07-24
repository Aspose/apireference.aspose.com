---
title: "Μέθοδος System::Security::Cryptography::RSACryptoServiceProvider::Encrypt"
linktitle: "Κρυπτογράφηση"
second_title: "Aspose.Page για C++"
description: "Μέθοδος System::Security::Cryptography::RSACryptoServiceProvider::Encrypt. Κρυπτογραφεί τα δεδομένα εισόδου χρησιμοποιώντας τη συγκεκριμένη λειτουργία γεμίσματος σε C++."
type: docs
weight: 400
url: /el/cpp/system.security.cryptography/rsacryptoserviceprovider/encrypt/
---
## RSACryptoServiceProvider::Encrypt(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) method


Κρυπτογραφεί τα εισερχόμενα δεδομένα χρησιμοποιώντας τη συγκεκριμένη λειτουργία γεμίσματος.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Encrypt(ByteArrayPtr data, SharedPtr<RSAEncryptionPadding> padding) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| data | ByteArrayPtr | Πίνακας [Byte](../../../system/byte/) για κρυπτογράφηση. |
| συμπλήρωση | SharedPtr\<RSAEncryptionPadding\> | Λειτουργία padding. |

### ReturnValue

Κρυπτογραφημένα δεδομένα σε μορφή πίνακα byte.

## Δείτε επίσης

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSAEncryptionPadding](../../rsaencryptionpadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::Encrypt(const ByteArrayPtr\&, bool) method


Κρυπτογραφεί το μήνυμα. Δεν έχει υλοποιηθεί.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Encrypt(const ByteArrayPtr &rgb, bool use_oaep)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| rgb | const ByteArrayPtr\& | [Data](../../../system.data/) για κρυπτογράφηση. |
| use_oaep | bool | True για χρήση γεμίσματος OAEP, false για χρήση γεμίσματος PKCS#1 v1.5. |

### ReturnValue

Πίνακας κρυπτογραφημένων δεδομένων.

## Δείτε επίσης

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
