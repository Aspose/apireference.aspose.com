---
title: "System::Threading::WaitHandle sınıfı"
linktitle: "WaitHandle"
second_title: "Aspose.Font için C++"
description: "System::Threading::WaitHandle sınıfı. Bekleme ilkel temel sınıfı. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 1700
url: /tr/cpp/system.threading/waithandle/
---
## WaitHandle class


Bekleme ilkel temel sınıfı. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class WaitHandle : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [Close](./close/)() | İşleyiciyle ilişkili herhangi bir kaynağı serbest bırakır. |
| [get_Handle](./get_handle/)() | İşleyiciyi alır. |
| static [WaitAll](./waitall/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) | RTTI bilgisi. |
| static [WaitAll](./waitall/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) | Tüm işleyicilerin tetiklenmesini bekler. |
| static [WaitAll](./waitall/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) | Tüm işleyicilerin tetiklenmesini bekler. |
| static [WaitAny](./waitany/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) | İşleyicilerden herhangi birinin tetiklenmesini bekler. |
| static [WaitAny](./waitany/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) | İşleyicilerden herhangi birinin tetiklenmesini bekler. |
| static [WaitAny](./waitany/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) | İşleyicilerden herhangi birinin tetiklenmesini bekler. |
| virtual [WaitOne](./waitone/)() | İşleyicinin sınırsız bir süre boyunca tetiklenmesini bekler. |
| virtual [WaitOne](./waitone/)(int) | İşleyicinin tetiklenmesini bekler. |
| virtual [WaitOne](./waitone/)(TimeSpan) | İşleyicinin tetiklenmesini bekler. |
| virtual [WaitOne](./waitone/)(int, bool) | İşleyicinin tetiklenmesini bekler. |
| virtual [~WaitHandle](./~waithandle/)() | Yıkıcı. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [WaitTimeout](./waittimeout/) | Fonksiyon tarafından döndürülecek özel değer, aksi takdirde zaman aşımı geçerse ve hiçbir şey sinyal göndermezse, dizideki sinyalleri olan nesnenin indeksini döndürür. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
