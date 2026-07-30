---
title: "System::Security::Cryptography::X509Certificates::X509KeyUsageFlags перечисление"
linktitle: "X509KeyUsageFlags"
second_title: "Aspose.Font для C++"
description: "System::Security::Cryptography::X509Certificates::X509KeyUsageFlags enum. Определяет, как может использоваться ключ сертификата в C++."
type: docs
weight: 2200
url: /ru/cpp/system.security.cryptography.x509certificates/x509keyusageflags/
---
## X509KeyUsageFlags enum


Определяет, как может использоваться ключ сертификата.

```cpp
enum class X509KeyUsageFlags : int32_t
```

### Значения

| Имя | Значение | Описание |
| --- | --- | --- |
| Нет | 0 | Отсутствуют параметры использования ключа. |
| EncipherOnly | 1 | Ключ может использоваться только для шифрования. |
| CrlSign | 2 | Ключ может использоваться для подписи списка отзыва сертификатов. |
| KeyCertSign | 4 | Ключ может использоваться для подписи сертификатов. |
| KeyAgreement | 8 | Ключ может использоваться для установления согласования ключей. |
| DataEncipherment | 16 | Ключ может использоваться для шифрования данных. |
| KeyEncipherment | 32 | Ключ может использоваться для шифрования ключа. |
| NonRepudiation | 64 | Ключ может использоваться для аутентификации. |
| DigitalSignature | 128 | Ключ может использоваться в качестве цифровой подписи. |
| DecipherOnly | 32768 | Ключ может использоваться только для дешифрования. |

## См. также

* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Font for C++](../../)
