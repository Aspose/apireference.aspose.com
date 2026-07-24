---
title: "System::Security::Cryptography::RSA::VerifyHash Methode"
linktitle: "VerifyHash"
second_title: "Aspose.Page für C++"
description: "System::Security::Cryptography::RSA::VerifyHash Methode. Überprüft, ob die Signatur des angegebenen Hashwerts in C++ gültig ist."
type: docs
weight: 1400
url: /de/cpp/system.security.cryptography/rsa/verifyhash/
---
## RSA::VerifyHash method


Überprüft, ob die Signatur des angegebenen Hashwerts gültig ist.

```cpp
virtual bool System::Security::Cryptography::RSA::VerifyHash(ByteArrayPtr hash, ByteArrayPtr signature, const HashAlgorithmName &hash_algorithm, SharedPtr<RSASignaturePadding> padding)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Hash | ByteArrayPtr | Hashwert der signierten Daten. |
| Signatur | ByteArrayPtr | Signaturdaten. |
| hash_algorithm | const HashAlgorithmName\& | Hash-Algorithmus. |
| Auffüllung | SharedPtr\<RSASignaturePadding\> | Auffüllmodus. Gibt true zurück, wenn die Signatur gültig ist, sonst false. |

## Siehe auch

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
