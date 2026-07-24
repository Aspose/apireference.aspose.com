---
title: "System::Collections::IEnumerator فئة"
linktitle: "IEnumerator"
second_title: "Aspose.Page لـ C++"
description: "System::Collections::IEnumerator فئة. واجهة للعداد يمكن استخدامها للتنقل عبر بعض العناصر. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. دائمًا قم بلف هذه الفئة في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 600
url: /ar/cpp/system.collections/ienumerator/
---
## IEnumerator class


واجهة للعداد يمكن استخدامها للتنقل عبر بعض العناصر. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. دائمًا قم بلف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class IEnumerator : public virtual System::IDisposable,
                    public virtual System::Object
```


| Parameter | الوصف |
| --- | --- |
| T | نوع العنصر. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Current](./current/)() const | يحصل على العنصر الحالي. |
| virtual [get_Current](./get_current/)() const | يحصل على العنصر الحالي. |
| virtual [MoveNext](./movenext/)() | ينقل المُعدِّر إلى العنصر التالي. إذا لم يتم الإشارة إلى أي عنصر من قبل، يحدد المرجع إلى أول عنصر متاح. إذا وصل إلى نهاية الحاوية، لا يفعل شيئًا. |
| virtual [Reset](./reset/)() | يعيد ضبط العداد إلى الموضع قبل العنصر الأول. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [ValueType](./valuetype/) | معلومات RTTI. |

## انظر أيضًا

* Class [IDisposable](../../system/idisposable/)
* Class [Object](../../system/object/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
