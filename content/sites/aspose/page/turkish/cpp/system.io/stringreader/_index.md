---
title: "System::IO::StringReader sınıfı"
linktitle: "StringReader"
second_title: "Aspose.Page için C++"
description: "System::IO::StringReader sınıfı. Bir dizeden karakter okuyan bir okuyucuyu temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Yığın (stack) üzerinde veya new operatörüyle bu tipin örneğini oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 2400
url: /tr/cpp/system.io/stringreader/
---
## StringReader class


Bir dizeden karakter okuyan bir okuyucuyu temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığın (stack) üzerinde veya new operatörüyle bu tipin örneğini oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class StringReader : public System::IO::TextReader
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Close](./close/)() override | Akışı kapatır. |
| [Dispose](./dispose/)() override | Hiçbir şey yapmaz. |
| [Dispose](./dispose/)(bool) override | Hiçbir şey yapmaz. |
| [Peek](./peek/)() override | Akışın konumunu değiştirmeden akıştan tek bir karakter okur. |
| [Read](./read/)() override | Akıştan tek bir karakter okur. |
| [Read](./read/)(ArrayPtr\<char_t\>, int, int) override | Belirtilen konumdan başlayarak akıştan belirtilen karakter dizisine belirtilen sayıda karakter okur. |
| [ReadLine](./readline/)() override | Akıştan karakterleri, geçerli satırın sonuna kadar okur. |
| [ReadToEnd](./readtoend/)() override | Akıştan karakterleri, akışın sonuna kadar okur. |
| [StringReader](./stringreader/)(const String\&) | Belirtilen dizeden karakter okuyan yeni bir [StringReader](./) sınıf örneği oluşturur. |
## Ayrıca Bakınız

* Class [TextReader](../textreader/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
