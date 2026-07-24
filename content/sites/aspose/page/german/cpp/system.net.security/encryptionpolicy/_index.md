---
title: "System::Net::Security::EncryptionPolicy Enum"
linktitle: "EncryptionPolicy"
second_title: "Aspose.Page für C++"
description: "System::Net::Security::EncryptionPolicy Enum. Enumeriert die Verschlüsselungsrichtlinien in C++."
type: docs
weight: 400
url: /de/cpp/system.net.security/encryptionpolicy/
---
## EncryptionPolicy enum


Enumeriert die Verschlüsselungsrichtlinien.

```cpp
enum class EncryptionPolicy
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| RequireEncryption | 0 | Erfordere Verschlüsselung und erlaube niemals einen 'Null'-Cipher. |
| AllowNoEncryption | 1 | Bevorzuge die vollständige Verschlüsselung, aber ein 'Null'-Cipher kann verwendet werden, wenn der Server zustimmt. |
| NoEncryption | 2 | Erlaube keine Verschlüsselung und fordere, dass ein 'Null'-Cipher verwendet wird, wenn die Gegenstelle einen 'Null'-Cipher verarbeiten kann. |

## Siehe auch

* Namespace [System::Net::Security](../)
* Library [Aspose.Page for C++](../../)
