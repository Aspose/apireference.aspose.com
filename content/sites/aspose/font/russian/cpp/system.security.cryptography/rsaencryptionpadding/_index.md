---
title: "System::Security::Cryptography::RSAEncryptionPadding класс"
linktitle: "RSAEncryptionPadding"
second_title: "Aspose.Font для C++"
description: "System::Security::Cryptography::RSAEncryptionPadding класс. Режим заполнения и параметры для операций шифрования или дешифрования RSA в C++."
type: docs
weight: 3600
url: /ru/cpp/system.security.cryptography/rsaencryptionpadding/
---
## RSAEncryptionPadding class


Режим заполнения и параметры для операций шифрования или дешифрования [RSA](../rsa/).

```cpp
class RSAEncryptionPadding : public System::IEquatable<SharedPtr<RSAEncryptionPadding>>
```

## Методы

| Метод | Описание |
| --- | --- |
| static [CreateOaep](./createoaep/)(const HashAlgorithmName\&) | Создаёт [RSAEncryptionPadding](./) с режимом OAEP и указанным алгоритмом хеширования. |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [Equals](./equals/)(SharedPtr\<RSAEncryptionPadding\>) override |  |
| [get_Mode](./get_mode/)() const | Возвращает режим заполнения. |
| [get_OaepHashAlgorithm](./get_oaephashalgorithm/)() const | Возвращает алгоритм хеширования, используемый с OAEP. |
| static [get_OaepSHA1](./get_oaepsha1/)() | Возвращает режим OAEP с алгоритмом хеширования [SHA1](../sha1/). |
| static [get_OaepSHA256](./get_oaepsha256/)() | Возвращает режим OAEP с алгоритмом хеширования [SHA256](../sha256/). |
| static [get_OaepSHA384](./get_oaepsha384/)() | Возвращает режим OAEP с алгоритмом хеширования [SHA384](../sha384/). |
| static [get_OaepSHA512](./get_oaepsha512/)() | Возвращает режим OAEP с алгоритмом хеширования [SHA512](../sha512/). |
| static [get_Pkcs1](./get_pkcs1/)() | Информация RTTI. |
| [GetHashCode](./gethashcode/)() const override | Аналог метода C# [Object.GetHashCode()](../../system/object/gethashcode/). Позволяет хешировать пользовательские объекты. |
| [ToString](./tostring/)() const override | Аналог метода C# [Object.ToString()](../../system/object/tostring/). Позволяет преобразовывать пользовательские объекты в строку. |
## См. также

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
