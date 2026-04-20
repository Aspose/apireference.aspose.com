---
title: "فئة System::Threading::Tasks::ResultValueTask"
linktitle: "ResultValueTask"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Threading::Tasks::ResultValueTask. تمثل نوعًا هجينًا شبيهًا بالمهمة يمكنه احتواء إما قيمة نتيجة مباشرة أو ResultTask<T> في C++."
type: docs
weight: 500
url: /ar/cpp/system.threading.tasks/resultvaluetask/
---
## ResultValueTask class


تمثل نوعًا هجينًا شبيهًا بالمهمة يمكنه احتواء إما قيمة نتيجة مباشرة أو [ResultTask<T>](../resulttask/).

```cpp
template<typename T>class ResultValueTask : public System::IEquatable<ResultValueTask<T>>,
                                            public System::Details::BoxableObjectBase
```


| معامل | الوصف |
| --- | --- |
| T | نوع النتيجة التي تنتجها المهمة. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [AsTask](./astask/)() const | يحوّل هذا [ResultValueTask](./) إلى مؤشر مشترك إلى [ResultTask<T>](../resulttask/). |
| [ConfigureAwait](./configureawait/)(bool) const | يضبط مُنتظر لهذه المهمة. |
| [Equals](./equals/)(ResultValueTask) override | يحدد ما إذا كانت هذه الحالة تساوي حالة [ResultValueTask](./) أخرى. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | يحدد ما إذا كانت هذه المثيل مساوية لكائن آخر. |
| [get_IsCanceled](./get_iscanceled/)() const | يحصل على قيمة تشير إلى ما إذا كانت المهمة قد انتهت بسبب الإلغاء. |
| [get_IsCompleted](./get_iscompleted/)() const | يحصل على قيمة تشير إلى ما إذا كانت المهمة قد انتهت. |
| [get_IsCompletedSuccessfully](./get_iscompletedsuccessfully/)() const | يحصل على قيمة تشير إلى ما إذا كانت المهمة قد انتهت بنجاح. |
| [get_IsFaulted](./get_isfaulted/)() const | يحصل على قيمة تشير إلى ما إذا كانت المهمة قد انتهت بسبب استثناء غير معالج. |
| [get_Result](./get_result/)() | يحصل على نتيجة المهمة المكتملة. |
| [GetAwaiter](./getawaiter/)() const | يحصل على awaiter لهذه المهمة لدعم تعبيرات await. |
| [operator!=](./operator!=/)(const ResultValueTask\&) const | عامل عدم المساواة لـ [ResultValueTask](./). |
| [operator==](./operator==/)(const ResultValueTask\&) const | عامل المساواة لـ [ResultValueTask](./). |
| [ResultValueTask](./resultvaluetask/)() | ينشئ [ResultValueTask](./) فارغًا غير مهيأ. |
| [ResultValueTask](./resultvaluetask/)(const T\&) | ينشئ [ResultValueTask](./) مكتملًا بالنتيجة المحددة. |
| [ResultValueTask](./resultvaluetask/)(const RTaskPtr\<T\>\&) | ينشئ [ResultValueTask](./) من مؤشر مشترك إلى [ResultTask<T>](../resulttask/). |
## ملاحظات


[ResultValueTask](./) combines the benefits of [ValueTask](../valuetask/) (reduced allocations for synchronous results) with the ability to wrap existing [ResultTask<T>](../resulttask/) objects. It provides awaitable interface and various task status inspection methods. 
## انظر أيضًا

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
