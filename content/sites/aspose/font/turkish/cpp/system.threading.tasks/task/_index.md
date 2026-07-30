---
title: "System::Threading::Tasks::Task class"
linktitle: "Task"
second_title: "Aspose.Font için C++"
description: "System::Threading::Tasks::Task sınıfı. C++'ta beklenebilen ve diğer görevlerle birleştirilebilen bir asenkron işlemi temsil eder."
type: docs
weight: 600
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
| [Activate](./activate/)(const SharedPtr\<TaskScheduler\>\&) | Görevi bir zamanlayıcıda yürütülmek üzere etkinleştirir. |
| [AddCompletionAction](./addcompletionaction/)(const Action<>\&) | Tamamlandığında yürütülecek bir devam eylemi ekler. |
| [Cancel](./cancel/)() | Görevi iptal edilmiş olarak işaretler ve görevi sonlandırır. |
| [Complete](./complete/)() | Görevi tamamlandı olarak işaretler ve görevi sonlandırır. |
| [ConfigureAwait](./configureawait/)(bool) const | Bu görev üzerindeki await'lerin bağlam yakalama açısından nasıl davranması gerektiğini yapılandırır. |
| [ContinueWith](./continuewith/)(const Action\<TaskPtr\>\&) | Görev tamamlandığında çalışan bir devam (continuation) oluşturur. |
| [ContinueWith](./continuewith/)(const Func\<TaskPtr, TResult\>\&) | Görev tamamlandığında çalışan bir devam (continuation) oluşturur. |
| [Dispose](./dispose/)() override | Görevle ilişkili kaynakları serbest bırakır. |
| [Execute](./execute/)() | Görevin işlevini yürütür. |
| [get_AsyncState](./get_asyncstate/)() const | Görevle ilişkili kullanıcı tanımlı durum nesnesini alır. |
| static [get_CompletedTask](./get_completedtask/)() | Tamamlanmış bir görevi (tek örnek) alır. |
| static [get_CurrentId](./get_currentid/)() |  |
| [get_Exception](./get_exception/)() const | Görev için kimliği alır. |
| [get_Id](./get_id/)() const |  |
| [get_IsCanceled](./get_iscanceled/)() const | Görevin iptal nedeniyle tamamlanıp tamamlanmadığını alır. |
| [get_IsCompleted](./get_iscompleted/)() const | Görevin tamamlanıp tamamlanmadığını alır. |
| [get_IsFaulted](./get_isfaulted/)() const | Görevin işlenmemiş bir istisna nedeniyle tamamlanıp tamamlanmadığını alır. |
| [get_Scheduler](./get_scheduler/)() const | Bu görevle ilişkili zamanlayıcıyı alır. |
| [get_Status](./get_status/)() const | Görevin mevcut durumunu alır. |
| [GetAwaiter](./getawaiter/)() const | Await ile kullanılmak üzere bu görev için bir awaiter alır. |
| [RunSynchronously](./runsynchronously/)() | Görevi mevcut iş parçacığında senkron olarak çalıştırır. |
| [RunSynchronously](./runsynchronously/)(const SharedPtr\<TaskScheduler\>\&) | Görevi belirtilen zamanlayıcıyı kullanarak senkron olarak çalıştırır. |
| [set_Function](./set_function/)(const FunctionT\&) | Yürütülecek iç fonksiyonu ayarlar. |
| [set_Scheduler](./set_scheduler/)(const SharedPtr\<TaskScheduler\>\&) | Bu görevle ilişkili zamanlayıcıyı ayarlar. |
| [set_Status](./set_status/)(TaskStatus) | Görev durumunu ayarlar. |
| [Start](./start/)() | Görev yürütmesini varsayılan zamanlayıcıyı kullanarak başlatır. |
| [Start](./start/)(const SharedPtr\<TaskScheduler\>\&) | Görev yürütmesini belirtilen zamanlayıcıyı kullanarak başlatır. |
| [Task](./task/)(const Action<>\&) | Bir [Task](./) nesnesi, yürütülecek bir eylem ile oluşturur. |
| [Task](./task/)(const Action<>\&, const CancellationToken\&) | Bir [Task](./) nesnesi, bir eylem ve iptal belirteci ile oluşturur. |
| [Task](./task/)(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&) | Bir [Task](./) nesnesi, durumlu bir eylem ve durum nesnesi ile oluşturur. |
| [Task](./task/)(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&, const CancellationToken\&) | Bir [Task](./) nesnesi, durumlu eylem, durum ve iptal belirteci ile oluşturur. |
| [Task](./task/)() | Başlatılmamış görevler oluşturmak için iç yapıcı. |
| [Wait](./wait/)(const CancellationToken\&) | İptal desteğiyle görevin tamamlanmasını bekler. |
| [Wait](./wait/)() | Görevin tamamlanmasını bekler. |
| [~Task](./~task/)() | Yıkıcı. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [FunctionT](./functiont/) | Dahili uygulama. Kullanıcı kodu için değildir. |
## Açıklamalar


İptal, devam ettirmeler ve async/await desenlerini destekleyen, .NET'teki [System.Threading.Tasks.Task](./) benzeri bir C++ uygulaması sağlar.
## Ayrıca Bakınız

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
