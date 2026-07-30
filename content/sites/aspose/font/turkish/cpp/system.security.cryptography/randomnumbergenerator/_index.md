---
title: "System::Security::Cryptography::RandomNumberGenerator sınıfı"
linktitle: "RandomNumberGenerator"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::RandomNumberGenerator sınıfı. Rastgele sayı üreteçlerinin miras alması için soyut sınıf. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığın üzerinde veya new operatörüyle oluşturulmamalıdır; aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta işlevlere argüman olarak geçirin."
type: docs
weight: 2600
url: /tr/cpp/system.security.cryptography/randomnumbergenerator/
---
## RandomNumberGenerator class


Rastgele sayı üreteçlerinin miras alması için soyut sınıf. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığın üzerinde veya new operatörüyle oluşturulmamalıdır; aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi işlevlere argüman olarak geçirin.

```cpp
class RandomNumberGenerator : public virtual System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [Create](./create/)() | Rastgele veri oluşturmak için kullanılabilecek kriptografik bir rastgele sayı üreteci için varsayılan uygulamanın bir örneğini oluşturur. Henüz uygulanmadı. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>) | Mevcut dizi öğelerini rastgele baytlarla doldurur. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>, int, int) | Mevcut dizi dilimini rastgele baytlarla doldurur. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>) | Mevcut dizi görünümü öğelerini rastgele baytlarla doldurur. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>, int, int) | Mevcut dizi görünümü dilimini rastgele baytlarla doldurur. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<uint8_t, N\>\&) | Mevcut yığın dizisi öğelerini rastgele baytlarla doldurur. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<uint8_t, N\>\&, int, int) | Mevcut yığın dizisi dilimini rastgele baytlarla doldurur. |
| virtual [GetNonZeroBytes](./getnonzerobytes/)(ArrayPtr\<uint8_t\>) | Mevcut dizi öğelerini sıfır olmayan rastgele baytlarla doldurur. |
| virtual [GetNonZeroBytes](./getnonzerobytes/)(System::Details::ArrayView\<uint8_t\>) | Mevcut dizi görünümü öğelerini sıfır olmayan rastgele baytlarla doldurur. |
| [GetNonZeroBytes](./getnonzerobytes/)(System::Details::StackArray\<uint8_t, N\>\&) | Mevcut yığın dizisi öğelerini sıfır olmayan rastgele baytlarla doldurur. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
