---
title: "System::IO::TextReader sınıfı"
linktitle: "TextReader"
second_title: "Aspose.Page için C++"
description: "System::IO::TextReader sınıfı. Farklı kaynaklardan karakter dizileri okuyan okuyucuları temsil eden sınıflar için temel bir sınıftır. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta işlevlere argüman olarak geçirmek için kullanın."
type: docs
weight: 2600
url: /tr/cpp/system.io/textreader/
---
## TextReader class


Farklı kaynaklardan karakter dizileri okuyan okuyucuları temsil eden sınıflar için temel bir sınıftır. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi işlevlere argüman olarak geçirmek için kullanın.

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
| virtual [Read](./read/)(ArrayPtr\<char_t\>, int, int) | Akıştan belirtilen sayıda karakteri okur ve bunları belirtilen konumdan başlayarak belirtilen karakter dizisine yazar. |
| virtual [ReadBlock](./readblock/)(ArrayPtr\<char_t\>, int, int) | Mevcut metin okuyucusundan belirtilen azami sayıda karakteri okur ve verileri belirtilen indeksden başlayarak bir tampon belleğe yazar. |
| virtual [ReadLine](./readline/)() | Akıştan karakterleri, geçerli satırın sonuna kadar okur. |
| virtual [ReadToEnd](./readtoend/)() | Akıştan karakterleri, akışın sonuna kadar okur. |
## Ayrıca Bakınız

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
