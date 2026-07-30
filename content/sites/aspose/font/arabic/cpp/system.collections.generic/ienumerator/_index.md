---
title: "فئة System::Collections::Generic::IEnumerator"
linktitle: "IEnumerator"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Collections::Generic::IEnumerator. واجهة عدّاد يمكن استخدامها للتنقل عبر بعض العناصر. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2300
url: /ar/cpp/system.collections.generic/ienumerator/
---
## IEnumerator class


واجهة للعداد التي يمكن استخدامها للتنقل عبر بعض العناصر. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
template<typename T>class IEnumerator : public virtual System::IDisposable,
                                        public System::Details::EnumeratorBasedIterator<T>,
                                        protected System::Details::IteratorPointerUpdater<T, false>
```


| معامل | الوصف |
| --- | --- |
| T | نوع العنصر. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [AsVirtualizedIterator](./asvirtualizediterator/)() | يجهز المتكرر للاستخدام من قبل فئة VirtualizedIterator. |
| [CloneIterator](./cloneiterator/)() const override | ينسخ المكرِّر الحالي. |
| virtual [Current](./current/)() const | يحصل على العنصر الحالي. |
| virtual [get_Current](./get_current/)() const | يحصل على العنصر الحالي. |
| [IEnumerator](./ienumerator/)() |  |
| [IncrementIterator](./incrementiterator/)() override | يحرك المكرّر خطوة إلى الأمام. |
| [InitializeIterator](./initializeiterator/)() override | يقوم بالاتصال الأول لـ [MoveNext()](./movenext/) ويجهز كائن العدّاد للاستخدام من قبل VirtualizedIterator. |
| [MarkOwnedByVirtualizedIterator](./markownedbyvirtualizediterator/)() | يعلّم العدّاد المملوك للمتكرر الافتراضي. |
| virtual [MoveNext](./movenext/)() | ينقل المُعدِّد إلى العنصر التالي. إذا لم يتم الإشارة إلى أي عنصر من قبل، يضبط الإشارة إلى أول عنصر متاح. إذا تم الوصول إلى نهاية الحاوية، لا يفعل شيئًا. |
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
  // إنشاء مثال فئة List.
  auto collection = MakeObject<List<int>>();

  // املأ القائمة.
  collection->Add(1);
  collection->Add(2);
  collection->Add(3);

  // احصل على عدّاد القائمة.
  auto enumerator = collection->GetEnumerator();

  while (enumerator->MoveNext())
  {
    // احصل على العنصر الحالي واطبعّه.
    std::cout << enumerator->get_Current() << ' ';
  }

  // إعادة تعيين العدّاد.
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
* Library [Aspose.Font for C++](../../)
