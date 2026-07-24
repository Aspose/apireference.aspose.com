---
title: "فئة System::IAsyncResult"
linktitle: "IAsyncResult"
second_title: "Aspose.Page لـ C++"
description: "فئة System::IAsyncResult. تمثل حالة العملية غير المتزامنة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء كائن من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء تشغيلية و/أو أخطاء تأكيد. قم دائمًا بلف هذه الفئة في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 3100
url: /ar/cpp/system/iasyncresult/
---
## IAsyncResult class


تمثل حالة العملية غير المتزامنة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../makeobject/). لا تقم بإنشاء كائن من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء تشغيلية و/أو أخطاء تأكيد. قم دائمًا بلف هذه الفئة في مؤشر [System::SmartPtr](../smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class IAsyncResult : public virtual System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [get_AsyncState](./get_asyncstate/)() | يرجع كائنًا يحتوي على معلومات حول العملية غير المتزامنة. |
| virtual [get_AsyncWaitHandle](./get_asyncwaithandle/)() | يرجع كائنًا من نوع WaitHandle يمكن استخدامه للانتظار حتى اكتمال العملية غير المتزامنة. |
| virtual [get_CompletedSynchronously](./get_completedsynchronously/)() | يعيد قيمة تشير إلى ما إذا كانت العملية غير المتزامنة قد اكتملت بشكل متزامن. |
| virtual [get_IsCompleted](./get_iscompleted/)() | يعيد قيمة تشير إلى ما إذا كانت العملية غير المتزامنة قد اكتملت. |
| virtual [~IAsyncResult](./~iasyncresult/)() | المدمر. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [smart_ptr](./smart_ptr/) | مؤشر مشترك إلى [IAsyncResult](./). |
## انظر أيضًا

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
