---
title: "System::Security::Cryptography::DSA::VerifySignature Methode"
linktitle: "VerifySignature"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::DSA::VerifySignature Methode. Verifiziert die DSA‑Signatur für die angegebenen Daten in C++."
type: docs
weight: 800
url: /de/cpp/system.security.cryptography/dsa/verifysignature/
---
## DSA::VerifySignature method


Verifiziere [DSA](../)‑Signatur für die angegebenen Daten.

```cpp
virtual bool System::Security::Cryptography::DSA::VerifySignature(ByteArrayPtr rgb_hash, ByteArrayPtr rgb_signature)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| rgb_hash | ByteArrayPtr | [Daten](../../../system.data/) signiert mit **rgb_signature**. |
| rgb_signature | ByteArrayPtr | [DSA](../)‑Signatur. |

### ReturnValue

true - wenn **rgb_signature** mit der auf **rgb_hash** berechneten [DSA](../)‑Signatur übereinstimmt, sonst - false.

## Siehe auch

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
