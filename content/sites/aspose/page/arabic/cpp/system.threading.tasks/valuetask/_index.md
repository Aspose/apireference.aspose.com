---
title: "فئة System::Threading::Tasks::ValueTask"
linktitle: "ValueTask"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Threading::Tasks::ValueTask. توفر نتيجة قابلة للانتظار لعملية غير متزامنة في C++."
type: docs
weight: 500
url: /ar/cpp/system.threading.tasks/valuetask/
---
## ValueTask class


يوفر نتيجة قابلة للانتظار لعملية غير متزامنة.

```cpp
class ValueTask : public System::IEquatable<ValueTask>,
                  public System::Details::BoxableObjectBase
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [AsTask](./astask/)() const | تحول هذا [ValueTask](./) إلى مؤشر مشترك إلى [Task](../task/). |
| [ConfigureAwait](./configureawait/)(bool) const | يضبط مُنتظرًا لهذه المهمة. |
| [Equals](./equals/)(ValueTask) override | يحدد ما إذا كانت هذه الحالة تساوي مثيلًا آخر من [ValueTask](./). |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | يحدد ما إذا كانت هذه الحالة تساوي كائنًا آخر. |
| [get_IsCanceled](./get_iscanceled/)() const | يحصل على قيمة تُشير إلى ما إذا كانت المهمة قد اكتملت بسبب الإلغاء. |
| [get_IsCompleted](./get_iscompleted/)() const | يحصل على قيمة تُشير إلى ما إذا كانت المهمة قد اكتملت. |
| [get_IsCompletedSuccessfully](./get_iscompletedsuccessfully/)() const | يحصل على قيمة تُشير إلى ما إذا كانت المهمة قد اكتملت بنجاح. |
| [get_IsFaulted](./get_isfaulted/)() const | يحصل على قيمة تُشير إلى ما إذا كانت المهمة قد اكتملت بسبب استثناء غير مُعالج. |
| [GetAwaiter](./getawaiter/)() const | يحصل على مُنتظر لهذه المهمة لدعم تعبيرات await. |
| [operator!=](./operator!=/)(const ValueTask\&) const | عامل عدم المساواة لـ [ValueTask](./). |
| [operator==](./operator==/)(const ValueTask\&) const | عامل المساواة لـ [ValueTask](./). |
| [ValueTask](./valuetask/)() | ينشئ [ValueTask](./) فارغًا غير مهيأ. |
| [ValueTask](./valuetask/)(const TaskPtr\&) | ينشئ [ValueTask](./) من مؤشر مشترك إلى [Task](../task/). |
## انظر أيضًا

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
