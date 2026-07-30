---
title: "System::Threading::Tasks::ResultTask sınıfı"
linktitle: "ResultTask"
second_title: "Aspose.Font için C++"
description: "System::Threading::Tasks::ResultTask sınıfı. Tamamlandığında bir sonuç değeri döndüren bir Task özelleştirmesi C++'ta."
type: docs
weight: 400
url: /tr/cpp/system.threading.tasks/resulttask/
---
## ResultTask class


Tamamlandığında bir sonuç değeri döndüren bir [Task](../task/) özelleştirmesi.

```cpp
template<typename T>class ResultTask : public System::Threading::Tasks::Task
```


| Parametre | Açıklama |
| --- | --- |
| T | Görev tarafından döndürülen sonuç değerinin türü |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Complete](./complete/)(const T\&) | Görev için sonuç değerini ayarlar ve görevi tamamlar. |
| [ConfigureAwait](./configureawait/)(bool) const | Bu sonuç görevi üzerindeki await'ların bağlam yakalama açısından nasıl davranması gerektiğini yapılandırır. |
| [ContinueWith](./continuewith/)(const Action\<RTaskPtr\<T\>\>\&) | Sonuç görevi tamamlandığında çalışan bir devam (continuation) oluşturur. |
| [ContinueWith](./continuewith/)(const Func\<RTaskPtr\<T\>, TNewResult\>\&) | Sonuç görevi tamamlandığında çalışan bir devam (continuation) oluşturur. |
| [ContinueWith](./continuewith/)(const Action\<TaskPtr\>\&) | Görev tamamlandığında çalışan bir devam (continuation) oluşturur. |
| [ContinueWith](./continuewith/)(const Func\<TaskPtr, TResult\>\&) | Görev tamamlandığında çalışan bir devam (continuation) oluşturur. |
| [get_Result](./get_result/)() | Asenkron işlemin sonucunu alır. |
| [GetAwaiter](./getawaiter/)() const | Await ile kullanılmak üzere bu sonuç görevi için bir awaiter alır. |
| [ResultTask](./resulttask/)(const Func\<T\>\&) | Bir değer döndüren fonksiyonla bir [ResultTask](./) oluşturur. |
| [ResultTask](./resulttask/)() | Dahili uygulama. Kullanıcı kodu için değildir. |
| [ResultTask](./resulttask/)(const T\&) | Belirtilen sonuçla sonuç görevleri oluşturmak için dahili yapıcı. |
| [set_Result](./set_result/)(const T\&) | Görev için sonuç değerini ayarlar. |
## Açıklamalar



Sonuç üreten bir asenkron işlemi temsil eder, .NET'teki [System.Threading.Tasks.Task<TResult>](../task/) benzeri.
## Ayrıca Bakınız

* Class [Task](../task/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
