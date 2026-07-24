---
title: "Método System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature"
linktitle: "VerifySignature"
second_title: "Aspose.Page para C++"
description: "Método System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature. Verifica la firma DSA para los datos especificados en C++."
type: docs
weight: 1900
url: /es/cpp/system.security.cryptography/dsacryptoserviceprovider/verifysignature/
---
## DSACryptoServiceProvider::VerifySignature method


Verificar la firma [DSA](../../dsa/) para los datos especificados.

```cpp
bool System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature(ByteArrayPtr rgb_hash, ByteArrayPtr rgb_signature) override
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| rgb_hash | ByteArrayPtr | [Data](../../../system.data/) firmado con **rgb_signature**. |
| rgb_signature | ByteArrayPtr | Firma [DSA](../../dsa/). |

### ReturnValue

true - si **rgb_signature** coincide con la firma [DSA](../../dsa/) calculada sobre **rgb_hash**, de lo contrario - false.

## Ver también

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
