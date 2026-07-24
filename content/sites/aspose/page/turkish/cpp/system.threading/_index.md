---
title: "System::Threading ad alanı"
linktitle: "System::Threading"
second_title: "Aspose.Page için C++"
description: "C++'ta System::Threading ad alanı nasıl kullanılır."
type: docs
weight: 6500
url: /tr/cpp/system.threading/
---



## Sınıflar

| Sınıf | Açıklama |
| --- | --- |
| [AutoResetEvent](./autoresetevent/) | [Event](../system/event/) otomatik olarak sıfırlanan bekleyen iş parçacığını bildirmek için. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek yığına (stack) ya da new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin. |
| [CancellationToken](./cancellationtoken/) | İşlemlerin iptal edilmesi gerektiğine dair bildirimi yayar. Bu sınıf, iş parçacıkları arasında iş birliğine dayalı iptal mekanizması sağlar; bir iş parçacığının bir işlemin iptal edilmesi gerektiğini diğerlerine bildirmesine olanak tanır. |
| [CancellationTokenRegistration](./cancellationtokenregistration/) | Bir iptal belirteci geri çağrısı için kaydı temsil eder. |
| [CancellationTokenSource](./cancellationtokensource/) | İptal bildirimlerini tetiklemek için kullanılabilen bir iptal belirteci kaynağı. |
| [EventWaitHandle](./eventwaithandle/) | [Event](../system/event/) bekleyen iş parçacığına gönderilebilen. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek yığına (stack) ya da new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin. |
| [Interlocked](./interlocked/) | İş parçacığı güvenli işlemler için API sağlar. Bu, örnek hizmeti olmayan statik bir türdür. Hiçbir şekilde onun örneklerini oluşturmayınız. |
| [ManualResetEvent](./manualresetevent/) | [Event](../system/event/) otomatik olarak sıfırlanmayan bekleyen iş parçacığını bildirmek için. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türün örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin. |
| [Monitor](./monitor/) | Sınıf [Monitor](./monitor/) nesnelere erişimi senkronize eden bir mekanizma sağlar. |
| [Mutex](./mutex/) | [Mutex](./mutex/) uygulaması. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türün örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin. |
| [Semaphore](./semaphore/) | [Semaphore](./semaphore/) uygulaması. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türün örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin. |
| [SynchronizationContext](./synchronizationcontext/) | Farklı senkronizasyon işlemleri arasında bir senkronizasyon bağlamını yaymak için temel işlevselliği sağlar. |
| [Thread](./thread/) | [Thread](./thread/) uygulaması. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türün örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin. |
| [ThreadPool](./threadpool/) | [Thread](./thread/) havuzu API'si, işleri kuyruğa iterek işçi iş parçacığı havuzu tarafından okunmasını sağlar. Bu, örnek hizmeti olmayan statik bir türdür. Hiçbir şekilde onun örneklerini oluşturmayınız. |
| [ThreadPoolImpl](./threadpoolimpl/) | [Thread](./thread/) havuzu iç veri. Bu, bellek yönetimi erişim işlev(ler)iyle yapılan tek örnekli (singleton) bir türdür. Doğrudan onun örneklerini oluşturmayınız. |
| [Timer](./timer/) | [Timer](./timer/) sınıfı gecikmeden sonra ayrı bir iş parçacığında iş öğesini yürütür. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türün örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin. |
| [TimerQueue](./timerqueue/) | [Timer](./timer/) nesnelerini yöneten kuyruk. Bu sadece bir uygulamadır. [Timer](./timer/) nesneleri kendileri oraya kaydolur, onları kullanmak için bunu yapmanıza gerek yoktur - bunun yerine [Timer](./timer/) sınıfı API'sini kullanın. Bu, bellek yönetimi erişim işlev(ler)iyle yapılan tek örnekli (singleton) bir türdür. Doğrudan onun örneklerini oluşturmayınız. |
| [WaitHandle](./waithandle/) | Bekleme ilkel temel sınıfı. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türün örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin. |
## Enums

| Enum | Açıklama |
| --- | --- |
| [ApartmentState](./apartmentstate/) | İş parçacığının apartment durumunu ayarlar. |
| [EventResetMode](./eventresetmode/) | Olay durumunun nasıl sıfırlandığını gösterir. |
| [ThreadState](./threadstate/) | İş parçacığının durumu. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [ParameterizedThreadStart](./parameterizedthreadstart/) | Tek parametreli [Thread](./thread/) işlevi. |
| [SendOrPostCallback](./sendorpostcallback/) |  |
| [ThreadStart](./threadstart/) | Parametresiz [Thread](./thread/) işlevi. |
| [TimerCallback](./timercallback/) | Zamanlayıcı tarafından çağrılacak geri arama (callback) işlevi. |
| [wait_handle_t](./wait_handle_t/) | Handle türü. |
| [WaitCallback](./waitcallback/) | Bir yer olduğunda yürütülecek geri arama öğesi. |
