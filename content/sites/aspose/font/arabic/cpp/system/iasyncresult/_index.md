---
title: "فئة System::IAsyncResult"
linktitle: "IAsyncResult"
second_title: "Aspose.Font لـ C++"
description: "فئة System::IAsyncResult. تمثل حالة العملية غير المتزامنة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء مثال لهذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء تشغيلية و/أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 3100
url: /ar/cpp/system/iasyncresult/
---
## IAsyncResult class


تمثل حالة العملية غير المتزامنة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../makeobject/). لا تقم أبداً بإنشاء مثال لهذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء تشغيلية و/أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class IAsyncResult : public virtual System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [get_AsyncState](./get_asyncstate/)() | يرجع كائنًا يحتوي على المعلومات حول العملية asyrchronous. |
| virtual [get_AsyncWaitHandle](./get_asyncwaithandle/)() | يرجع مثيلًا من WaitHandle يمكن استخدامه للانتظار حتى اكتمال العملية غير المتزامنة. |
| virtual [get_CompletedSynchronously](./get_completedsynchronously/)() | يرجع قيمة تشير إلى ما إذا كانت العملية غير المتزامنة قد اكتملت بشكل متزامن. |
| virtual [get_IsCompleted](./get_iscompleted/)() | يرجع قيمة تشير إلى ما إذا كانت العملية غير المتزامنة قد اكتملت. |
| virtual [~IAsyncResult](./~iasyncresult/)() | المدمر. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [smart_ptr](./smart_ptr/) | مؤشر مشترك إلى [IAsyncResult](./). |
## انظر أيضًا

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
