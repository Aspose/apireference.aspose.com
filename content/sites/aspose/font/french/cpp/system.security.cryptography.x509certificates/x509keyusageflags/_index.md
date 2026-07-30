---
title: "System::Security::Cryptography::X509Certificates::X509KeyUsageFlags énum"
linktitle: "X509KeyUsageFlags"
second_title: "Aspose.Font pour C++"
description: "System::Security::Cryptography::X509Certificates::X509KeyUsageFlags enum. Définit comment la clé du certificat peut être utilisée en C++."
type: docs
weight: 2200
url: /fr/cpp/system.security.cryptography.x509certificates/x509keyusageflags/
---
## X509KeyUsageFlags enum


Définit comment la clé du certificat peut être utilisée.

```cpp
enum class X509KeyUsageFlags : int32_t
```

### Valeurs

| Nom | Valeur | Description |
| --- | --- | --- |
| Aucun | 0 | Aucun paramètre d'utilisation de la clé. |
| EncipherOnly | 1 | La clé ne peut être utilisée que pour le chiffrement. |
| CrlSign | 2 | La clé peut être utilisée pour signer une liste de révocation de certificats. |
| KeyCertSign | 4 | La clé peut être utilisée pour signer des certificats. |
| KeyAgreement | 8 | La clé peut être utilisée pour déterminer l'accord de clé. |
| DataEncipherment | 16 | La clé peut être utilisée pour le chiffrement des données. |
| KeyEncipherment | 32 | La clé peut être utilisée pour le chiffrement de la clé. |
| NonRepudiation | 64 | La clé peut être utilisée pour l'authentification. |
| DigitalSignature | 128 | La clé peut être utilisée comme signature numérique. |
| DéchiffrerUniquement | 32768 | La clé ne peut être utilisée que pour le déchiffrement. |

## Voir aussi

* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Font for C++](../../)
