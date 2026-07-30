---
title: "System::Threading ad alanı"
linktitle: "System::Threading"
second_title: "Aspose.Font için C++"
description: "C++'ta System::Threading ad alanını nasıl kullanılır."
type: docs
weight: 6900
url: /tr/cpp/system.threading/
---



## Sınıflar

| Sınıf | Açıklama |
| --- | --- |
| [AutoResetEvent](./autoresetevent/) | [Event](../system/event/) otomatik olarak sıfırlanan bekleyen iş parçacığını bildirmek için. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığına (stack) ya da new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Her zaman bu sınıfı [System::SmartPtr](../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin. |
| [CancellationToken](./cancellationtoken/) | İşlemlerin iptal edilmesi gerektiğine dair bildirimi yayar. Bu sınıf, iş parçacıkları arasında iş birliğine dayalı iptal mekanizması sağlar; bir iş parçacığının bir işlemin iptal edilmesi gerektiğini diğerlerine bildirmesine olanak tanır. |
| [CancellationTokenRegistration](./cancellationtokenregistration/) | İptal belirteci geri çağrısı için bir kaydı temsil eder. |
| [CancellationTokenSource](./cancellationtokensource/) | İptal bildirimlerini tetiklemek için kullanılabilen bir iptal belirteci kaynağı. |
| [EventWaitHandle](./eventwaithandle/) | [Event](../system/event/) bekleyen iş parçacığına gönderilebilen. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığına (stack) ya da new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Her zaman bu sınıfı [System::SmartPtr](../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin. |
| [Interlocked](./interlocked/) | İş parçacığı güvenli işlemler için API sağlar. Bu, örnek hizmeti olmayan statik bir türdür. Herhangi bir şekilde onun örneklerini asla oluşturmamalısınız. |
| [ManualResetEvent](./manualresetevent/) | [Event](../system/event/) otomatik olarak sıfırlanmayan bekleyen iş parçacığını bildirmek için. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığına (stack) ya da new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Her zaman bu sınıfı [System::SmartPtr](../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin. |
| [Monitor](./monitor/) | Sınıf [Monitor](./monitor/) nesnelere erişimi senkronize eden bir mekanizma sağlar. |
| [Mutex](./mutex/) | [Mutex](./mutex/) uygulaması. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığına (stack) ya da new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Her zaman bu sınıfı [System::SmartPtr](../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin. |
| [Semaphore](./semaphore/) | [Semaphore](./semaphore/) uygulaması. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığına (stack) ya da new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Her zaman bu sınıfı [System::SmartPtr](../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin. |
| [SynchronizationContext](./synchronizationcontext/) | Çeşitli senkronizasyon işlemleri arasında bir senkronizasyon bağlamını yaymak için temel işlevselliği sağlar. |
| [Thread](./thread/) | [Thread](./thread/) uygulaması. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığına (stack) ya da new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Her zaman bu sınıfı [System::SmartPtr](../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin. |
| [ThreadPool](./threadpool/) | [Thread](./thread/) havuz API'si, işleri kuyruğa iterek işçi iş parçacığı havuzu tarafından okunmasını sağlar. Bu, örnek hizmeti olmayan statik bir türdür. Herhangi bir şekilde onun örneklerini asla oluşturmamalısınız. |
| [ThreadPoolImpl](./threadpoolimpl/) | [Thread](./thread/) havuz iç veri. Bu, erişim işlev(ler)iyle bellek yönetimi yapılan bir tek örnek (singleton) türdür. Onu doğrudan örneklememelisiniz. |
| [Timer](./timer/) | [Timer](./timer/) sınıfı, gecikmeden sonra işi ayrı bir iş parçacığında yürütür. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığına (stack) ya da new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Her zaman bu sınıfı [System::SmartPtr](../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin. |
| [TimerQueue](./timerqueue/) | [Timer](./timer/) nesnelerini yöneten kuyruk. Bu sadece bir uygulamadır. [Timer](./timer/) nesneleri kendileri burada kaydolur, onları kullanmak için bunu yapmanız gerekmez - bunun yerine [Timer](./timer/) sınıfı API'sını kullanın. Bu, erişim işlev(ler)iyle bellek yönetimi yapılan bir tek örnek (singleton) türdür. Onu doğrudan örneklememelisiniz. |
| [WaitHandle](./waithandle/) | Bekleme ilkel taban sınıfı. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığına (stack) ya da new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Her zaman bu sınıfı [System::SmartPtr](../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin. |
## Enums

| Enum | Açıklama |
| --- | --- |
| [ApartmentState](./apartmentstate/) | İş parçacığının apartman durumunu ayarlar. |
| [EventResetMode](./eventresetmode/) | Olay durumunun nasıl sıfırlandığını gösterir. |
| [ThreadState](./threadstate/) | İş parçacığının durumu. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [ParameterizedThreadStart](./parameterizedthreadstart/) | [Thread](./thread/) işlevi tek parametre ile. |
| [SendOrPostCallback](./sendorpostcallback/) |  |
| [ThreadStart](./threadstart/) | [Thread](./thread/) işlevi parametresiz. |
| [TimerCallback](./timercallback/) | Zamanlayıcı tarafından çağrılacak geri arama işlevi. |
| [wait_handle_t](./wait_handle_t/) | Handle türü. |
| [WaitCallback](./waitcallback/) | Bir yer olduğunda yürütülecek geri arama öğesi. |
