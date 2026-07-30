---
title: "System::Threading::Tasks::ValueTask فئة"
linktitle: "ValueTask"
second_title: "Aspose.Font لـ C++"
description: "System::Threading::Tasks::ValueTask فئة. توفر نتيجة يمكن انتظارها لعملية غير متزامنة في C++."
type: docs
weight: 800
url: /ar/cpp/system.threading.tasks/valuetask/
---
## ValueTask class


يوفر نتيجة يمكن انتظارها لعملية غير متزامنة.

```cpp
class ValueTask : public System::IEquatable<ValueTask>,
                  public System::Details::BoxableObjectBase
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [AsTask](./astask/)() const | يحوّل هذا [ValueTask](./) إلى مؤشر مشترك إلى [Task](../task/). |
| [ConfigureAwait](./configureawait/)(bool) const | يضبط مُنتظر لهذه المهمة. |
| [Equals](./equals/)(ValueTask) override | يحدد ما إذا كانت هذه المثيل مساوية لمثيل آخر من [ValueTask](./). |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | يحدد ما إذا كانت هذه المثيل مساوية لكائن آخر. |
| [get_IsCanceled](./get_iscanceled/)() const | يحصل على قيمة تشير إلى ما إذا كانت المهمة قد انتهت بسبب الإلغاء. |
| [get_IsCompleted](./get_iscompleted/)() const | يحصل على قيمة تشير إلى ما إذا كانت المهمة قد انتهت. |
| [get_IsCompletedSuccessfully](./get_iscompletedsuccessfully/)() const | يحصل على قيمة تشير إلى ما إذا كانت المهمة قد انتهت بنجاح. |
| [get_IsFaulted](./get_isfaulted/)() const | يحصل على قيمة تشير إلى ما إذا كانت المهمة قد انتهت بسبب استثناء غير معالج. |
| [GetAwaiter](./getawaiter/)() const | يحصل على awaiter لهذه المهمة لدعم تعبيرات await. |
| [operator!=](./operator!=/)(const ValueTask\&) const | عامل عدم المساواة لـ [ValueTask](./). |
| [operator==](./operator==/)(const ValueTask\&) const | عامل المساواة لـ [ValueTask](./). |
| [ValueTask](./valuetask/)() | ينشئ [ValueTask](./) فارغًا غير مهيأ. |
| [ValueTask](./valuetask/)(const TaskPtr\&) | ينشئ [ValueTask](./) من مؤشر مشترك إلى [Task](../task/). |
## انظر أيضًا

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
