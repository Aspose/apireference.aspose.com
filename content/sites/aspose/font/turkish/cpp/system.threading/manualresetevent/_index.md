---
title: "System::Threading::ManualResetEvent sınıfı"
linktitle: "ManualResetEvent"
second_title: "Aspose.Font için C++"
description: "System::Threading::ManualResetEvent sınıfı. Otomatik olarak sıfırlanmayan, bekleyen iş parçacığını bilgilendiren olay. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 700
url: /tr/cpp/system.threading/manualresetevent/
---
## ManualResetEvent class


[Event](../../system/event/) to notify waiting thread that does not reset automatically. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ManualResetEvent : public System::Threading::EventWaitHandle
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [ManualResetEvent](./manualresetevent/)(bool) | RTTI bilgisi. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | Fonksiyon tarafından döndürülecek özel değer, aksi takdirde zaman aşımı geçerse ve hiçbir şey sinyal göndermezse, dizideki sinyalleri olan nesnenin indeksini döndürür. |
## Ayrıca Bakınız

* Class [EventWaitHandle](../eventwaithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
