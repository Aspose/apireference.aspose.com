---
title: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyData Methode"
linktitle: "VerifyData"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyData Methode. Prüft die Datensignatur in C++."
type: docs
weight: 1800
url: /de/cpp/system.security.cryptography/rsacryptoserviceprovider/verifydata/
---
## RSACryptoServiceProvider::VerifyData method


Prüft die Datensignatur.

```cpp
bool System::Security::Cryptography::RSACryptoServiceProvider::VerifyData(const ByteArrayPtr &buffer, const SharedPtr<Object> &halg, const ByteArrayPtr &signature)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Daten](../../../system.data/) zur Überprüfung der Signatur. |
| halg | const SharedPtr\<Object\>\& | Hash-Algorithmus zur Verwendung. |
| Signatur | const ByteArrayPtr\& | Signatur wie empfangen. |

### ReturnValue

True, wenn die Signatur gültig ist, false sonst.

## Siehe auch

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
