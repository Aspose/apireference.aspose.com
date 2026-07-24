---
title: "فئة System::Collections::Generic::IEnumerator"
linktitle: "IEnumerator"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Collections::Generic::IEnumerator. واجهة مكرّر يمكن استخدامها للتنقل عبر بعض العناصر. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أعطال تأكيدية. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2300
url: /ar/cpp/system.collections.generic/ienumerator/
---
## IEnumerator class


واجهة للعداد يمكن استخدامها للتنقل عبر بعض العناصر. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. دائمًا قم بلف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
template<typename T>class IEnumerator : public virtual System::IDisposable,
                                        public System::Details::EnumeratorBasedIterator<T>,
                                        protected System::Details::IteratorPointerUpdater<T, false>
```


| Parameter | الوصف |
| --- | --- |
| T | نوع العنصر. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [AsVirtualizedIterator](./asvirtualizediterator/)() | يجهّز المكرر لاستخدامه من قبل فئة VirtualizedIterator. |
| [CloneIterator](./cloneiterator/)() const override | ينسخ المتكرر الحالي. |
| virtual [Current](./current/)() const | يحصل على العنصر الحالي. |
| virtual [get_Current](./get_current/)() const | يحصل على العنصر الحالي. |
| [IEnumerator](./ienumerator/)() |  |
| [IncrementIterator](./incrementiterator/)() override | يحرك المكرّر خطوة إلى الأمام. |
| [InitializeIterator](./initializeiterator/)() override | يقوم بالنداء الأول لـ [MoveNext()](./movenext/) ويجهّز كائن المكرّر لاستخدامه من قبل VirtualizedIterator. |
| [MarkOwnedByVirtualizedIterator](./markownedbyvirtualizediterator/)() | يعلّم المكرّر المملوك للـ virtualized iterator. |
| virtual [MoveNext](./movenext/)() | ينقل المُعدِّر إلى العنصر التالي. إذا لم يتم الإشارة إلى أي عنصر من قبل، يحدد المرجع إلى أول عنصر متاح. إذا وصل إلى نهاية الحاوية، لا يفعل شيئًا. |
| virtual [Reset](./reset/)() | يعيد ضبط العداد إلى الموضع قبل العنصر الأول. |
| virtual [~IEnumerator](./~ienumerator/)() |  |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [ValueType](./valuetype/) | نوع القيمة. |
## ملاحظات



```cpp
#include <system/collections/list.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // أنشئ مثيل فئة List.
  auto collection = MakeObject<List<int>>();

  // املأ القائمة.
  collection->Add(1);
  collection->Add(2);
  collection->Add(3);

  // احصل على المُعدِّد للقائمة.
  auto enumerator = collection->GetEnumerator();

  while (enumerator->MoveNext())
  {
    // احصل على العنصر الحالي واطبعّه.
    std::cout << enumerator->get_Current() << ' ';
  }

  // أعد ضبط المُعدِّد.
  enumerator->Reset();

  return 0;
}
/*
This code example produces the following output:
1 2 3
*/
```

## انظر أيضًا

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
