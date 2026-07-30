---
title: "System::Security::Cryptography::RijndaelManaged::CreateEncryptor metodu"
linktitle: "CreateEncryptor"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::RijndaelManaged::CreateEncryptor metodu. C++'de algoritma nesnesi tarafından tanımlanan parametrelerle şifreleyici nesnesi oluşturur."
type: docs
weight: 200
url: /tr/cpp/system.security.cryptography/rijndaelmanaged/createencryptor/
---
## RijndaelManaged::CreateEncryptor() method


Algoritma nesnesi tarafından tanımlanan parametrelerle şifreleyici nesnesi oluşturur.

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateEncryptor()
```

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Class [RijndaelManaged](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RijndaelManaged::CreateEncryptor(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Açık parametrelerle şifreleyici nesnesi oluşturur.

```cpp
SharedPtr<ICryptoTransform> System::Security::Cryptography::RijndaelManaged::CreateEncryptor(System::ArrayPtr<uint8_t> rgbKey, System::ArrayPtr<uint8_t> rgbIV) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| rgbKey | System::ArrayPtr\<uint8_t\> | Şifreleme anahtarı bayt dizisi biçiminde. |
| rgbIV | System::ArrayPtr\<uint8_t\> | İlk değer bayt dizisi biçiminde. |

### ReturnValue

Yeni oluşturulmuş şifreleyici nesnesi.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [RijndaelManaged](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
