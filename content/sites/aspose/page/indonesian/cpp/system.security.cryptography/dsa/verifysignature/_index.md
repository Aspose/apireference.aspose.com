---
title: "System::Security::Cryptography::DSA::VerifySignature metode"
linktitle: "VerifySignature"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::DSA::VerifySignature metode. Memverifikasi tanda tangan DSA untuk data yang ditentukan dalam C++."
type: docs
weight: 800
url: /id/cpp/system.security.cryptography/dsa/verifysignature/
---
## DSA::VerifySignature method


Verifikasi tanda tangan [DSA](../) untuk data yang ditentukan.

```cpp
virtual bool System::Security::Cryptography::DSA::VerifySignature(ByteArrayPtr rgb_hash, ByteArrayPtr rgb_signature)=0
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| rgb_hash | ByteArrayPtr | [Data](../../../system.data/) ditandatangani dengan **rgb_signature**. |
| rgb_signature | ByteArrayPtr | Tanda tangan [DSA](../). |

### ReturnValue

true - jika **rgb_signature** cocok dengan tanda tangan [DSA](../) yang dihitung pada **rgb_hash**, selainnya - false.

## Lihat Juga

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
