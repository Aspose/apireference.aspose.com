---
title: "System::Security::Cryptography::X509Certificates::X509KeyUsageFlags enum"
linktitle: "X509KeyUsageFlags"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::X509Certificates::X509KeyUsageFlags enum. Definisce come la chiave del certificato può essere usata in C++."
type: docs
weight: 2200
url: /it/cpp/system.security.cryptography.x509certificates/x509keyusageflags/
---
## X509KeyUsageFlags enum


Definisce come può essere utilizzata la chiave del certificato.

```cpp
enum class X509KeyUsageFlags : int32_t
```

### Valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
| None | 0 | Nessun parametro di utilizzo della chiave. |
| EncipherOnly | 1 | La chiave può essere usata solo per la crittografia. |
| CrlSign | 2 | La chiave può essere usata per firmare una lista di revoca dei certificati. |
| KeyCertSign | 4 | La chiave può essere usata per firmare certificati. |
| KeyAgreement | 8 | La chiave può essere usata per determinare l'accordo di chiave. |
| DataEncipherment | 16 | La chiave può essere usata per la crittografia dei dati. |
| KeyEncipherment | 32 | La chiave può essere usata per la crittografia della chiave. |
| NonRepudiation | 64 | La chiave può essere usata per l'autenticazione. |
| DigitalSignature | 128 | La chiave può essere usata come firma digitale. |
| DecipherOnly | 32768 | La chiave può essere usata solo per la decrittazione. |

## Vedi anche

* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Font for C++](../../)
