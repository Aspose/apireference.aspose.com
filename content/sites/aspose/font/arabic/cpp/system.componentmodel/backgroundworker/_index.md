---
title: "فئة System::ComponentModel::BackgroundWorker"
linktitle: "BackgroundWorker"
second_title: "Aspose.Font لـ C++"
description: "فئة System::ComponentModel::BackgroundWorker. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 200
url: /ar/cpp/system.componentmodel/backgroundworker/
---
## BackgroundWorker class


يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class BackgroundWorker : public System::ComponentModel::Component
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [BackgroundWorker](./backgroundworker/)() | معلومات RTTI. |
| [get_WorkerReportsProgress](./get_workerreportsprogress/)() const | يحصل على قيمة تُشير إلى ما إذا كان [System::ComponentModel::BackgroundWorker](./) يمكنه الإبلاغ عن تحديثات التقدم. |
| [ReportProgress](./reportprogress/)(int) | يطلق حدث **System::ComponentModel::BackgroundWorker::ProgressChanged**. |
| [ReportProgress](./reportprogress/)(int, const System::SharedPtr\<System::Object\>\&) | يطلق حدث **System::ComponentModel::BackgroundWorker::ProgressChanged** مع كائن userState. |
| [RunWorkerAsync](./runworkerasync/)() | يبدأ تنفيذ عملية خلفية. |
| [RunWorkerAsync](./runworkerasync/)(const System::SharedPtr\<System::Object\>\&) | يبدأ تنفيذ عملية خلفية. |
| [set_WorkerReportsProgress](./set_workerreportsprogress/)(bool) | يضبط قيمة تُشير إلى ما إذا كان [System::ComponentModel::BackgroundWorker](./) يمكنه الإبلاغ عن تحديثات التقدم. |
| [~BackgroundWorker](./~backgroundworker/)() | المدمر. |
## انظر أيضًا

* Class [Component](../component/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
