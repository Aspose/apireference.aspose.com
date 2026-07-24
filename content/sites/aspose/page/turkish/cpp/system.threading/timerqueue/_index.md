---
title: "System::Threading::TimerQueue class"
linktitle: "TimerQueue"
second_title: "Aspose.Page için C++"
description: "System::Threading::TimerQueue sınıfı. Timer nesnelerini yöneten kuyruk. Bu sadece bir uygulamadır. Timer nesneleri kendileri oraya kaydolur, onları kullanmak için bunu yapmanıza gerek yok - bunun yerine Timer sınıfı API'sini kullanın. Bu, erişim işlev(ler)iyle bellek yönetimi yapılan tekil (singleton) bir türdür. C++'de doğrudan onun örneklerini asla oluşturmayın."
type: docs
weight: 1600
url: /tr/cpp/system.threading/timerqueue/
---
## TimerQueue class


Kuyruk, [Timer](../timer/) nesnelerini işler. Bu sadece bir uygulamadır. [Timer](../timer/) nesneleri kendileri oraya kaydolur, onları kullanmak için bunu yapmanız gerekmez - bunun yerine [Timer](../timer/) sınıfı API'sini kullanın. Bu, erişim işlev(i)leriyle bellek yönetimi yapılan bir tek örnek (singleton) tiptir. Bunu doğrudan örneklememelisiniz.

```cpp
class TimerQueue
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(Timer *) | Zamanlayıcıyı kuyruğa kaydeder. |
| [Delete](./delete/)(Timer *) | Zamanlayıcıyı kuyruktan siler. |
| static [GetInstance](./getinstance/)() | Uygulama tek örnek (singleton). |
| static [JoinWorkerThread](./joinworkerthread/)() | İşçi iş parçacığına katılır. Gerekirse sonsuz bekler. |
| [operator=](./operator=/)(const TimerQueue\&) | Kopyalama yok. |
| [TimerQueue](./timerqueue/)(const TimerQueue\&) | Kopyalama yok. |
## Ayrıca Bakınız

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
