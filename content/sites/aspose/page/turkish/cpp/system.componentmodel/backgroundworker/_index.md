---
title: "System::ComponentModel::BackgroundWorker sınıfı"
linktitle: "BackgroundWorker"
second_title: "Aspose.Page için C++"
description: "System::ComponentModel::BackgroundWorker sınıfı. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak allocate edilmelidir. Yığını (stack) üzerinde veya new operatörüyle örnek oluşturmaktan kaçının; bu, çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 200
url: /tr/cpp/system.componentmodel/backgroundworker/
---
## BackgroundWorker class


Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak allocate edilmelidir. Yığını (stack) üzerinde veya new operatörüyle örnek oluşturmaktan kaçının; bu, çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class BackgroundWorker : public System::ComponentModel::Component
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [BackgroundWorker](./backgroundworker/)() | RTTI bilgisi. |
| [get_WorkerReportsProgress](./get_workerreportsprogress/)() const | [System::ComponentModel::BackgroundWorker](./) nesnesinin ilerleme güncellemelerini raporlayıp raporlayamayacağını gösteren bir değer alır. |
| [ReportProgress](./reportprogress/)(int) | **System::ComponentModel::BackgroundWorker::ProgressChanged** olayını tetikler. |
| [ReportProgress](./reportprogress/)(int, const System::SharedPtr\<System::Object\>\&) | **System::ComponentModel::BackgroundWorker::ProgressChanged** olayını userState nesnesiyle tetikler. |
| [RunWorkerAsync](./runworkerasync/)() | Arka plan işleminin yürütülmesini başlatır. |
| [RunWorkerAsync](./runworkerasync/)(const System::SharedPtr\<System::Object\>\&) | Arka plan işleminin yürütülmesini başlatır. |
| [set_WorkerReportsProgress](./set_workerreportsprogress/)(bool) | [System::ComponentModel::BackgroundWorker](./) nesnesinin ilerleme güncellemelerini raporlayıp raporlayamayacağını gösteren bir değer ayarlar. |
| [~BackgroundWorker](./~backgroundworker/)() | Yıkıcı. |
## Ayrıca Bakınız

* Class [Component](../component/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
