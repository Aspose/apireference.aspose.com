---
title: "System::Security::Cryptography::RandomNumberGenerator sınıfı"
linktitle: "RandomNumberGenerator"
second_title: "Aspose.Page için C++"
description: "System::Security::Cryptography::RandomNumberGenerator sınıfı. Rastgele sayı üreteçlerinin kalıtım alacağı soyut sınıf. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 2600
url: /tr/cpp/system.security.cryptography/randomnumbergenerator/
---
## RandomNumberGenerator class


Rastgele sayı üreteçlerinin kalıtım alacağı soyut sınıf. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class RandomNumberGenerator : public virtual System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [Create](./create/)() | Rastgele veri üretmek için kullanılabilecek bir kriptografik rastgele sayı üreteci varsayılan uygulamasının bir örneğini oluşturur. Henüz uygulanmadı. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>) | Mevcut dizi elemanlarını rastgele baytlarla doldurur. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>, int, int) | Mevcut dizi dilimini rastgele baytlarla doldurur. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>) | Mevcut dizi görünümü elemanlarını rastgele baytlarla doldurur. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>, int, int) | Mevcut dizi görünümü dilimini rastgele baytlarla doldurur. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<uint8_t, N\>\&) | Mevcut yığın dizisi elemanlarını rastgele baytlarla doldurur. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<uint8_t, N\>\&, int, int) | Mevcut yığın dizisi dilimini rastgele baytlarla doldurur. |
| virtual [GetNonZeroBytes](./getnonzerobytes/)(ArrayPtr\<uint8_t\>) | Mevcut dizi elemanlarını sıfır olmayan rastgele baytlarla doldurur. |
| virtual [GetNonZeroBytes](./getnonzerobytes/)(System::Details::ArrayView\<uint8_t\>) | Mevcut dizi görünümü elemanlarını sıfır olmayan rastgele baytlarla doldurur. |
| [GetNonZeroBytes](./getnonzerobytes/)(System::Details::StackArray\<uint8_t, N\>\&) | Mevcut yığın dizisi elemanlarını sıfır olmayan rastgele baytlarla doldurur. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
