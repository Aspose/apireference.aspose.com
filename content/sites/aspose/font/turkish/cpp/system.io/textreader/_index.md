---
title: "System::IO::TextReader sınıfı"
linktitle: "TextReader"
second_title: "Aspose.Font için C++"
description: "System::IO::TextReader sınıfı. Farklı kaynaklardan karakter dizileri okuyan okuyucu sınıflarını temsil eden sınıflar için temel sınıf. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 2600
url: /tr/cpp/system.io/textreader/
---
## TextReader class


Farklı kaynaklardan karakter dizileri okuyan okuyucu sınıflarını temsil eden sınıflar için temel sınıf. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class TextReader : public System::IDisposable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [Close](./close/)() | Akışı kapatır ve edinilen kaynakları serbest bırakır. |
| [Dispose](./dispose/)() override | Geçerli nesne tarafından kullanılan tüm kaynakları serbest bırakır ve temel akışı kapatır. |
| virtual [Peek](./peek/)() | Akışın okuma imlecini değiştirmeden akıştan tek bir karakter okur. |
| virtual [Read](./read/)() | Akıştan tek bir karakter okur. |
| virtual [Read](./read/)(ArrayPtr\<char_t\>, int, int) | Akıştan belirtilen sayıda karakteri okur ve belirtilen konumdan başlayarak belirtilen karakter dizisine yazar. |
| virtual [ReadBlock](./readblock/)(ArrayPtr\<char_t\>, int, int) | Mevcut metin okuyucusundan belirtilen azami sayıda karakteri okur ve veriyi belirtilen indexten başlayarak bir tampon belleğe yazar. |
| virtual [ReadLine](./readline/)() | Akıştan karakterleri mevcut satırın sonuna kadar okur. |
| virtual [ReadToEnd](./readtoend/)() | Akıştan karakterleri akışın sonuna kadar okur. |
## Ayrıca Bakınız

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
