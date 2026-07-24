---
title: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyData méthode"
linktitle: "VerifyData"
second_title: "Aspose.Page pour C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyData méthode. Vérifie la signature des données en C++."
type: docs
weight: 1800
url: /fr/cpp/system.security.cryptography/rsacryptoserviceprovider/verifydata/
---
## RSACryptoServiceProvider::VerifyData method


Vérifie la signature des données.

```cpp
bool System::Security::Cryptography::RSACryptoServiceProvider::VerifyData(const ByteArrayPtr &buffer, const SharedPtr<Object> &halg, const ByteArrayPtr &signature)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Data](../../../system.data/) dont vérifier la signature. |
| halg | const SharedPtr\<Object\>\& | Algorithme de hachage à utiliser. |
| signature | const ByteArrayPtr\& | Signature telle que reçue. |

### ReturnValue

Vrai si la signature est valide, faux sinon.

## Voir aussi

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
