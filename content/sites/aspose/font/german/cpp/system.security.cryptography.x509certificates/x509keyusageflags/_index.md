---
title: "System::Security::Cryptography::X509Certificates::X509KeyUsageFlags enum"
linktitle: "X509KeyUsageFlags"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::X509Certificates::X509KeyUsageFlags Enum. Definiert, wie der Zertifikatschlüssel in C++ verwendet werden kann."
type: docs
weight: 2200
url: /de/cpp/system.security.cryptography.x509certificates/x509keyusageflags/
---
## X509KeyUsageFlags enum


Definiert, wie der Zertifikatschlüssel verwendet werden kann.

```cpp
enum class X509KeyUsageFlags : int32_t
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| Keine | 0 | Keine Schlüsselverwendungsparameter. |
| EncipherOnly | 1 | Der Schlüssel kann nur für Verschlüsselung verwendet werden. |
| CrlSign | 2 | Der Schlüssel kann verwendet werden, um eine Zertifikatswiderrufsliste zu signieren. |
| KeyCertSign | 4 | Der Schlüssel kann zum Signieren von Zertifikaten verwendet werden. |
| KeyAgreement | 8 | Der Schlüssel kann zur Bestimmung der Schlüsselvereinbarung verwendet werden. |
| DataEncipherment | 16 | Der Schlüssel kann für Datenverschlüsselung verwendet werden. |
| KeyEncipherment | 32 | Der Schlüssel kann für Schlüsselverschlüsselung verwendet werden. |
| NonRepudiation | 64 | Der Schlüssel kann zur Authentifizierung verwendet werden. |
| DigitalSignature | 128 | Der Schlüssel kann als digitale Signatur verwendet werden. |
| DecipherOnly | 32768 | Der Schlüssel kann nur für Entschlüsselung verwendet werden. |

## Siehe auch

* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Font for C++](../../)
