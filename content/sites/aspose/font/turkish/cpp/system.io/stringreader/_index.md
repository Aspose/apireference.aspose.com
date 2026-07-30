---
title: "System::IO::StringReader class"
linktitle: "StringReader"
second_title: "Aspose.Font için C++"
description: "System::IO::StringReader sınıfı. Bir dizeden karakter okuyan bir okuyucuyu temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 2400
url: /tr/cpp/system.io/stringreader/
---
## StringReader class


Bir dizeden karakter okuyan bir okuyucuyu temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class StringReader : public System::IO::TextReader
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Close](./close/)() override | Akışı kapatır. |
| [Dispose](./dispose/)() override | Hiçbir şey yapmaz. |
| [Dispose](./dispose/)(bool) override | Hiçbir şey yapmaz. |
| [Peek](./peek/)() override | Akıştan tek bir karakteri, akış konumunu değiştirmeden okur. |
| [Read](./read/)() override | Akıştan tek bir karakter okur. |
| [Read](./read/)(ArrayPtr\<char_t\>, int, int) override | Akıştan belirtilen sayıda karakteri, belirtilen konumdan başlayarak belirtilen karakter dizisine okur. |
| [ReadLine](./readline/)() override | Akıştan karakterleri mevcut satırın sonuna kadar okur. |
| [ReadToEnd](./readtoend/)() override | Akıştan karakterleri akışın sonuna kadar okur. |
| [StringReader](./stringreader/)(const String\&) | Belirtilen dizeden karakter okuyan yeni bir [StringReader](./) sınıf örneği oluşturur. |
## Ayrıca Bakınız

* Class [TextReader](../textreader/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
