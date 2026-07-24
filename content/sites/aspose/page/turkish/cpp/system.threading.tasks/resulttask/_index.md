---
title: "System::Threading::Tasks::ResultTask sınıfı"
linktitle: "ResultTask"
second_title: "Aspose.Page için C++"
description: "System::Threading::Tasks::ResultTask sınıfı. C++'ta tamamlandığında bir sonuç değeri döndüren bir Task özelleştirmesi."
type: docs
weight: 100
url: /tr/cpp/system.threading.tasks/resulttask/
---
## ResultTask class


Tamamlandığında bir sonuç değeri döndüren bir [Task](../task/) özelleştirmesi.

```cpp
template<typename T>class ResultTask : public System::Threading::Tasks::Task
```


| Parameter | Açıklama |
| --- | --- |
| T | Görev tarafından döndürülen sonuç değerinin türü |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [ConfigureAwait](./configureawait/)(bool) const | Bu sonuç görevi üzerindeki await'ların bağlam yakalama ile ilgili nasıl davranacağını yapılandırır. |
| [ContinueWith](./continuewith/)(const Action\<RTaskPtr\<T\>\>\&) | Sonuç görevi tamamlandığında çalışan bir devam (continuation) oluşturur. |
| [get_Result](./get_result/)() const | Asenkron işlemin sonucunu alır. |
| [GetAwaiter](./getawaiter/)() const | Bu sonuç görevi için Await ile kullanılacak bir awaiter alır. |
| [ResultTask](./resulttask/)(const Func\<T\>\&) | Bir değer döndüren bir fonksiyonla bir [ResultTask](./) oluşturur. |
| [ResultTask](./resulttask/)() | Dahili uygulama. Kullanıcı kodu için değildir. |
| [ResultTask](./resulttask/)(const T\&) | Belirtilen sonuçla sonuç görevleri oluşturmak için dahili yapıcı. |
| [set_Result](./set_result/)(const T\&) | Görev için sonuç değerini ayarlar. |
## Açıklamalar



Bir sonuç üreten asenkron işlemi temsil eder, .NET'teki [System.Threading.Tasks.Task<TResult>](../task/) benzeri.
## Ayrıca Bakınız

* Class [Task](../task/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
