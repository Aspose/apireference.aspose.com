---
title: "System::Security::Cryptography::AsymmetricAlgorithm class"
linktitle: "AsymmetricAlgorithm"
second_title: "Aspose.Font для C++"
description: "System::Security::Cryptography::AsymmetricAlgorithm class. Абстрактный базовый класс для асимметричных алгоритмов шифрования. Объекты этого класса должны выделяться только с помощью функции System::MakeObject() . Никогда не создавайте экземпляр этого типа в стеке или с использованием оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 200
url: /ru/cpp/system.security.cryptography/asymmetricalgorithm/
---
## AsymmetricAlgorithm class


Абстрактный базовый класс для асимметричных алгоритмов шифрования. Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../../system/makeobject/) . Никогда не создавайте экземпляр этого типа в стеке или с использованием оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class AsymmetricAlgorithm : public virtual System::Object,
                            public System::IDisposable
```

## Методы

| Метод | Описание |
| --- | --- |
| [Clear](./clear/)() | Освобождает все ресурсы. |
| static [Create](./create/)() | Создаёт алгоритм по умолчанию. Не реализовано. |
| static [Create](./create/)(const String\&) | Создаёт алгоритм по имени. Не реализовано. |
| [Dispose](./dispose/)() override | Освобождает ресурсы, принадлежащие текущему объекту. |
| virtual [FromXmlString](./fromxmlstring/)(String) | Читает параметры алгоритма из XML-строки. |
| virtual [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() | Получает алгоритм обмена ключами для использования. |
| virtual [get_KeySize](./get_keysize/)() | Информация RTTI. |
| virtual [get_LegalKeySizes](./get_legalkeysizes/)() | Получает массив допустимых размеров ключей. |
| virtual [get_SignatureAlgorithm](./get_signaturealgorithm/)() | Получает алгоритм подписи для использования. |
| virtual [set_KeySize](./set_keysize/)(int32_t) | Устанавливает размер ключа. |
| virtual [ToXmlString](./toxmlstring/)(bool) | Записывает параметры алгоритма в XML-строку. |
## См. также

* Class [Object](../../system/object/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
