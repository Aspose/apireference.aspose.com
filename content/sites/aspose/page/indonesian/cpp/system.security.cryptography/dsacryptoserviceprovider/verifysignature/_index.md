---
title: "System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature method"
linktitle: "VerifySignature"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature method. Memverifikasi tanda tangan DSA untuk data yang ditentukan di C++."
type: docs
weight: 1900
url: /id/cpp/system.security.cryptography/dsacryptoserviceprovider/verifysignature/
---
## DSACryptoServiceProvider::VerifySignature method


Verifikasi tanda tangan [DSA](../../dsa/) untuk data yang ditentukan.

```cpp
bool System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature(ByteArrayPtr rgb_hash, ByteArrayPtr rgb_signature) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| rgb_hash | ByteArrayPtr | [Data](../../../system.data/) ditandatangani dengan **rgb_signature**. |
| rgb_signature | ByteArrayPtr | tanda tangan [DSA](../../dsa/). |

### ReturnValue

true - jika **rgb_signature** cocok dengan tanda tangan [DSA](../../dsa/) yang dihitung pada **rgb_hash**, jika tidak - false.

## Lihat Juga

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
