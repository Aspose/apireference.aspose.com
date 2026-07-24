---
title: "System::Security::Cryptography::RSA::VerifyHash metode"
linktitle: "VerifyHash"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::RSA::VerifyHash metode. Memverifikasi bahwa tanda tangan hash yang ditentukan valid dalam C++."
type: docs
weight: 1400
url: /id/cpp/system.security.cryptography/rsa/verifyhash/
---
## RSA::VerifyHash method


Memverifikasi bahwa tanda tangan dari hash yang ditentukan valid.

```cpp
virtual bool System::Security::Cryptography::RSA::VerifyHash(ByteArrayPtr hash, ByteArrayPtr signature, const HashAlgorithmName &hash_algorithm, SharedPtr<RSASignaturePadding> padding)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| hash | ByteArrayPtr | Nilai hash dari data yang ditandatangani. |
| tanda tangan | ByteArrayPtr | Data tanda tangan. |
| hash_algorithm | const HashAlgorithmName\& | Algoritma hash. |
| padding | SharedPtr\\<RSASignaturePadding\\> | Mode padding. mengembalikan true jika tanda tangan valid, jika tidak - false. |

## Lihat Juga

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
