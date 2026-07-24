---
title: "System::Security::Cryptography::X509Certificates::X509KeyUsageFlags enum"
linktitle: "X509KeyUsageFlags"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::X509Certificates::X509KeyUsageFlags enum. Definieert hoe de certificaatsleutel kan worden gebruikt in C++."
type: docs
weight: 2200
url: /nl/cpp/system.security.cryptography.x509certificates/x509keyusageflags/
---
## X509KeyUsageFlags enum


Definieert hoe de certificaatsleutel kan worden gebruikt.

```cpp
enum class X509KeyUsageFlags : int32_t
```

### Waarden

| Naam | Waarde | Beschrijving |
| --- | --- | --- |
| None | 0 | Geen parameters voor sleutelgebruik. |
| EncipherOnly | 1 | Sleutel kan alleen worden gebruikt voor versleuteling. |
| CrlSign | 2 | Sleutel kan worden gebruikt om een certificaat intrekkingslijst te ondertekenen. |
| KeyCertSign | 4 | Sleutel kan worden gebruikt om certificaten te ondertekenen. |
| KeyAgreement | 8 | Sleutel kan worden gebruikt om sleutelovereenkomst te bepalen. |
| DataEncipherment | 16 | Sleutel kan worden gebruikt voor gegevensversleuteling. |
| KeyEncipherment | 32 | Sleutel kan worden gebruikt voor sleutelversleuteling. |
| NonRepudiation | 64 | Sleutel kan worden gebruikt voor authenticatie. |
| DigitalSignature | 128 | Sleutel kan worden gebruikt als digitale handtekening. |
| DecipherOnly | 32768 | Sleutel kan alleen worden gebruikt voor ontsleuteling. |

## Zie ook

* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
