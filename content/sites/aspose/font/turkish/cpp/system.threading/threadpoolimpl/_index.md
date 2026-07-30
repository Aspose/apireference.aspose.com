---
title: "System::Threading::ThreadPoolImpl sınıfı"
linktitle: "ThreadPoolImpl"
second_title: "Aspose.Font için C++"
description: "System::Threading::ThreadPoolImpl sınıfı. İş parçacığı havuzu iç verileri. Bu, erişim işlev(ler)i tarafından bellek yönetimi yapılan bir tek örnek (singleton) tiptir. C++'ta doğrudan örneklerini oluşturmayınız."
type: docs
weight: 1400
url: /tr/cpp/system.threading/threadpoolimpl/
---
## ThreadPoolImpl class


[Thread](../thread/) pool internal data. This is a singleton type with memory management done by access function(s). You should never create instances of it directly.

```cpp
class ThreadPoolImpl
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [GetAvailableThreads](./getavailablethreads/)(int\&, int\&) | Kullanılabilir iş parçacığı sayısını alır. |
| static [GetInitialized](./getinitialized/)() | Başlatma durumu tek örneğini alır. |
| [GetMaxThreads](./getmaxthreads/)(int\&, int\&) | Eşzamanlı iş parçacıklarının azami sayısını alır. |
| [GetMinThreads](./getminthreads/)(int\&, int\&) | Havuz tarafından oluşturulan iş parçacıklarının asgari sayısını alır. |
| [JoinAll](./joinall/)() | Tüm sahip olunan iş parçacıklarına katılır. Sonsuz bekler. |
| [QueueUserWorkItem](./queueuserworkitem/)(WaitCallback, const System::SharedPtr\<System::Object\>\&) | İş öğesini kuyruğa ekler. |
| [SetMaxThreads](./setmaxthreads/)(int, int) | Havuzun sahip olduğu iş parçacığı sayısını ayarlar. |
| [SetMinThreads](./setminthreads/)(int, int) | Havuzun sahip olduğu iş parçacıklarının asgari sayısını ayarlar. |
| [ThreadPoolImpl](./threadpoolimpl/)() | Yapıcı. |
| [~ThreadPoolImpl](./~threadpoolimpl/)() | Yıkıcı. İş parçacıkları henüz sonlandırılmadıysa hepsine katılır. |
## Ayrıca Bakınız

* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
