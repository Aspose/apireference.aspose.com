---
title: "System::Threading::EventWaitHandle sınıfı"
linktitle: "EventWaitHandle"
second_title: "Aspose.Font için C++"
description: "System::Threading::EventWaitHandle sınıfı. Bekleyen iş parçacığına gönderilebilecek bir olay. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta işlevlere argüman olarak geçirin."
type: docs
weight: 500
url: /tr/cpp/system.threading/eventwaithandle/
---
## EventWaitHandle class


[Event](../../system/event/) that can be sent to waiting thread. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EventWaitHandle : public System::Threading::WaitHandle
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [EventWaitHandle](./eventwaithandle/)(bool, EventResetMode) | RTTI bilgisi. |
| virtual [Reset](./reset/)() | Olayı sinyal vermeyen duruma ayarlar. |
| virtual [Set](./set/)() | Olayı sinyal veren duruma ayarlar. |
| [~EventWaitHandle](./~eventwaithandle/)() | Yıkıcı. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | Fonksiyon tarafından döndürülecek özel değer, aksi takdirde zaman aşımı geçerse ve hiçbir şey sinyal göndermezse, dizideki sinyalleri olan nesnenin indeksini döndürür. |
## Ayrıca Bakınız

* Class [WaitHandle](../waithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
