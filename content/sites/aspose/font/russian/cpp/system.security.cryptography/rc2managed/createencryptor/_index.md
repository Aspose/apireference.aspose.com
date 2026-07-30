---
title: "System::Security::Cryptography::RC2Managed::CreateEncryptor метод"
linktitle: "CreateEncryptor"
second_title: "Aspose.Font для C++"
description: "System::Security::Cryptography::RC2Managed::CreateEncryptor метод. Создаёт объект шифратора с параметрами, определёнными объектом алгоритма в C++."
type: docs
weight: 200
url: /ru/cpp/system.security.cryptography/rc2managed/createencryptor/
---
## RC2Managed::CreateEncryptor() method


Создаёт объект шифратора с параметрами, определёнными объектом алгоритма.

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateEncryptor()
```

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Class [RC2Managed](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RC2Managed::CreateEncryptor(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Создаёт объект шифратора с явными параметрами.

```cpp
SharedPtr<ICryptoTransform> System::Security::Cryptography::RC2Managed::CreateEncryptor(System::ArrayPtr<uint8_t> rgbKey, System::ArrayPtr<uint8_t> rgbIV) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| rgbKey | System::ArrayPtr\<uint8_t\> | Ключ шифрования в виде массива байтов. |
| rgbIV | System::ArrayPtr\<uint8_t\> | Начальное значение в виде массива байтов. |

### ReturnValue

Недавно созданный объект шифратора.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [RC2Managed](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
