---
title: "System::Collections::IEnumerator class"
linktitle: "IEnumerator"
second_title: "Aspose.Font لـ C++"
description: "System::Collections::IEnumerator class. واجهة للعداد التي يمكن استخدامها للتنقل عبر بعض العناصر. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 600
url: /ar/cpp/system.collections/ienumerator/
---
## IEnumerator class


واجهة للعداد التي يمكن استخدامها للتنقل عبر بعض العناصر. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class IEnumerator : public virtual System::IDisposable,
                    public virtual System::Object
```


| معامل | الوصف |
| --- | --- |
| T | نوع العنصر. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Current](./current/)() const | يحصل على العنصر الحالي. |
| virtual [get_Current](./get_current/)() const | يحصل على العنصر الحالي. |
| virtual [MoveNext](./movenext/)() | ينقل المُعدِّد إلى العنصر التالي. إذا لم يتم الإشارة إلى أي عنصر من قبل، يضبط الإشارة إلى أول عنصر متاح. إذا تم الوصول إلى نهاية الحاوية، لا يفعل شيئًا. |
| virtual [Reset](./reset/)() | يعيد ضبط العداد إلى الموضع قبل العنصر الأول. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [ValueType](./valuetype/) | معلومات RTTI. |

## انظر أيضًا

* Class [IDisposable](../../system/idisposable/)
* Class [Object](../../system/object/)
* Namespace [System::Collections](../)
* Library [Aspose.Font for C++](../../)
