---
title: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyData metodo"
linktitle: "VerifyData"
second_title: "Aspose.Page per C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyData metodo. Verifica la firma dei dati in C++."
type: docs
weight: 1800
url: /it/cpp/system.security.cryptography/rsacryptoserviceprovider/verifydata/
---
## RSACryptoServiceProvider::VerifyData method


Controlla la firma dei dati.

```cpp
bool System::Security::Cryptography::RSACryptoServiceProvider::VerifyData(const ByteArrayPtr &buffer, const SharedPtr<Object> &halg, const ByteArrayPtr &signature)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Data](../../../system.data/) per cui verificare la firma. |
| halg | const SharedPtr\<Object\>\& | Algoritmo hash da utilizzare. |
| firma | const ByteArrayPtr\& | Firma così ricevuta. |

### ReturnValue

True se la firma è valida, false altrimenti.

## Vedi anche

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
