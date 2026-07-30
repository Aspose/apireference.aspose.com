---
title: "System::Security::Cryptography::RC2Managed::CreateDecryptor metodu"
linktitle: "CreateDecryptor"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::RC2Managed::CreateDecryptor metodu. C++'ta algoritma nesnesi tarafından tanımlanan parametrelerle decryptor nesnesi oluşturur."
type: docs
weight: 100
url: /tr/cpp/system.security.cryptography/rc2managed/createdecryptor/
---
## RC2Managed::CreateDecryptor() method


Algoritma nesnesi tarafından tanımlanan parametrelerle deşifreleyici nesnesi oluşturur.

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateDecryptor()
```

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Class [RC2Managed](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RC2Managed::CreateDecryptor(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Açık parametrelerle deşifreleyici nesnesi oluşturur.

```cpp
SharedPtr<ICryptoTransform> System::Security::Cryptography::RC2Managed::CreateDecryptor(System::ArrayPtr<uint8_t> rgbKey, System::ArrayPtr<uint8_t> rgbIV) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| rgbKey | System::ArrayPtr\<uint8_t\> | Şifreleme anahtarı bayt dizisi biçiminde. |
| rgbIV | System::ArrayPtr\<uint8_t\> | İlk değer bayt dizisi biçiminde. |

### ReturnValue

Yeni oluşturulmuş çözücü nesnesi.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [RC2Managed](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
