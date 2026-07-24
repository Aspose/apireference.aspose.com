---
title: "Enumeración System::Security::Cryptography::X509Certificates::X509KeyUsageFlags"
linktitle: "X509KeyUsageFlags"
second_title: "Aspose.Page para C++"
description: "Enumeración System::Security::Cryptography::X509Certificates::X509KeyUsageFlags. Define cómo se puede usar la clave del certificado en C++."
type: docs
weight: 2200
url: /es/cpp/system.security.cryptography.x509certificates/x509keyusageflags/
---
## X509KeyUsageFlags enum


Define cómo se puede usar la clave del certificado.

```cpp
enum class X509KeyUsageFlags : int32_t
```

### Valores

| Nombre | Valor | Descripción |
| --- | --- | --- |
| None | 0 | Sin parámetros de uso de clave. |
| EncipherOnly | 1 | La clave solo puede usarse para cifrado. |
| CrlSign | 2 | La clave puede usarse para firmar una lista de revocación de certificados. |
| KeyCertSign | 4 | La clave puede usarse para firmar certificados. |
| KeyAgreement | 8 | La clave puede usarse para determinar el acuerdo de claves. |
| DataEncipherment | 16 | La clave puede usarse para el cifrado de datos. |
| KeyEncipherment | 32 | La clave puede usarse para el cifrado de claves. |
| NonRepudiation | 64 | La clave puede usarse para la autenticación. |
| DigitalSignature | 128 | La clave puede usarse como una firma digital. |
| DecipherOnly | 32768 | La clave solo puede usarse para descifrado. |

## Ver también

* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
