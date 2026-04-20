---
title: "فئة System::Collections::Generic::BaseEnumerator"
linktitle: "BaseEnumerator"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Collections::Generic::BaseEnumerator. تعريف المُعدِّد لتغليف الأنواع على نمط STL للاستخدام على نمط C#. لا يجري أي تأكيدات على بنية الحاوية باستثناء وجود مكرِّر تسلسلي. يستخدم الدوال begin() و end(). يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 600
url: /ar/cpp/system.collections.generic/baseenumerator/
---
## BaseEnumerator class


[Enumerator](../baseset/) definition to wrap STL-styled types for C#-styled usage. Makes no assertions on container structure except for existance of sequental iterator. Uses begin() and end() functions. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
template<typename Container,typename Element>class BaseEnumerator : public System::Collections::Generic::IEnumerator<Element>
```


| معامل | الوصف |
| --- | --- |
| حاوية | نوع حاوية على نمط STL. |
| Element | نوع العنصر. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [BaseEnumerator](./baseenumerator/)(const Object::ptr\&, Container\&) | يُهيّئ المكرّر. |
| [IsValid](./isvalid/)() const | يتحقق مما إذا تم استدعاء [MoveNext()](./movenext/) ولم يتم الوصول إلى النهاية. |
| [MoveNext](./movenext/)() override | زيادة على نمط المكرّر. |
| [Reset](./reset/)() override | يعيد ضبط المكرّر للسماح بإعادة تعداد العناصر. |

## انظر أيضًا

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
