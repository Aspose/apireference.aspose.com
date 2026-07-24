---
title: "System::Threading::Tasks::Task sınıf"
linktitle: "Task"
second_title: "Aspose.Page için C++"
description: "System::Threading::Tasks::Task sınıf. C++'ta beklenebilen ve diğer görevlerle birleştirilebilen bir asenkron işlemi temsil eder."
type: docs
weight: 300
url: /tr/cpp/system.threading.tasks/task/
---
## Task class


Beklenebilen ve diğer görevlerle birleştirilebilen bir asenkron işlemi temsil eder.

```cpp
class Task : public System::IDisposable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Activate](./activate/)(TaskScheduler *) | Görevi bir zamanlayıcıda çalıştırmak için etkinleştirir. |
| [AddContinuation](./addcontinuation/)(const Action<>\&) | Tamamlandığında yürütülecek bir devam eylemi ekler. |
| [Complete](./complete/)() | Görevi tamamlandı olarak işaretler ve görevi sonlandırır. |
| [ConfigureAwait](./configureawait/)(bool) const | Bu görevdeki beklemelerin bağlam yakalama açısından nasıl davranması gerektiğini yapılandırır. |
| [ContinueWith](./continuewith/)(const Action\<TaskPtr\>\&) | Görev tamamlandığında yürütülen bir devam oluşturur. |
| [Dispose](./dispose/)() override | Görevle ilişkili kaynakları serbest bırakır. |
| [Execute](./execute/)() | Görevin işlevini yürütür. |
| [get_AsyncState](./get_asyncstate/)() const | Görevle ilişkili kullanıcı tanımlı durum nesnesini alır. |
| static [get_CompletedTask](./get_completedtask/)() | Tamamlanmış bir görevi alır (tek örnek) |
| static [get_CurrentId](./get_currentid/)() |  |
| [get_Id](./get_id/)() const | Görev için kimliği alır. |
| [get_IsCanceled](./get_iscanceled/)() const | Görevin iptal nedeniyle tamamlanıp tamamlanmadığını alır. |
| [get_IsCompleted](./get_iscompleted/)() const | Görevin tamamlanıp tamamlanmadığını alır. |
| [get_IsFaulted](./get_isfaulted/)() const | Görevin işlenmemiş bir istisna nedeniyle tamamlanıp tamamlanmadığını alır. |
| [get_Scheduler](./get_scheduler/)() const | Bu görevle ilişkili zamanlayıcıyı alır. |
| [get_Status](./get_status/)() const | Görevin mevcut durumunu alır. |
| [GetAwaiter](./getawaiter/)() const | Await ile kullanım için bu görev için bir bekleyici alır. |
| [RunSynchronously](./runsynchronously/)() | Görevi mevcut iş parçacığında senkron olarak çalıştırır. |
| [RunSynchronously](./runsynchronously/)(const SharedPtr\<TaskScheduler\>\&) | Görevi belirtilen zamanlayıcıyı kullanarak senkron olarak çalıştırır. |
| [set_Function](./set_function/)(const FunctionT\&) | İç işlevi yürütmek için ayarlar. |
| [set_Scheduler](./set_scheduler/)(TaskScheduler *) | Bu görevle ilişkili zamanlayıcıyı ayarlar. |
| [set_Status](./set_status/)(TaskStatus) | Görev durumunu ayarlar. |
| [Start](./start/)() | Varsayılan zamanlayıcıyı kullanarak görev yürütmesini başlatır. |
| [Start](./start/)(const SharedPtr\<TaskScheduler\>\&) | Belirtilen zamanlayıcıyı kullanarak görev yürütmesini başlatır. |
| [Task](./task/)(const Action<>\&) | Yürütülecek bir eylemle bir [Task](./) oluşturur. |
| [Task](./task/)(const Action<>\&, const CancellationToken\&) | Bir eylem ve iptal belirteciyle bir [Task](./) oluşturur. |
| [Task](./task/)(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&) | Durumlu bir eylem ve durum nesnesiyle bir [Task](./) oluşturur. |
| [Task](./task/)(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&, const CancellationToken\&) | Durumlu eylem, durum ve iptal belirteciyle bir [Task](./) oluşturur. |
| [Task](./task/)() | Başlatılmamış görevler oluşturmak için iç yapıcı. |
| [Wait](./wait/)(const CancellationToken\&) const | İptal desteğiyle görevin tamamlanmasını bekler. |
| [Wait](./wait/)() const | Görevin tamamlanmasını bekler. |
| [~Task](./~task/)() | Yıkıcı. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [FunctionT](./functiont/) | Dahili uygulama. Kullanıcı kodu için değildir. |
## Açıklamalar


[System.Threading.Tasks.Task](./) benzeri bir C++ uygulaması sağlar, .NET'te olduğu gibi, iptal, devam ettirmeler ve async/await desenlerini destekler.
## Ayrıca Bakınız

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
