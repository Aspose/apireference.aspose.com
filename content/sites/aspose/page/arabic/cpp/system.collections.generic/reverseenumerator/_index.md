---
title: "فئة System::Collections::Generic::ReverseEnumerator"
linktitle: "ReverseEnumerator"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Collections::Generic::ReverseEnumerator. مُعدد يقوم بالتنقل العكسي عبر الحاوية. يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة System::MakeObject(). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيسبّب أخطاء تشغيلية و/أو أعطال تأكيد. دائمًا غلف هذه الفئة في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 3800
url: /ar/cpp/system.collections.generic/reverseenumerator/
---
## ReverseEnumerator class


[Enumerator](../baseset/) that reverse-iterates through container. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
template<typename Container,typename Element>class ReverseEnumerator : public System::Collections::Generic::IEnumerator<typename Container::value_type>
```


| Parameter | الوصف |
| --- | --- |
| حاوية | حاوية للتكرار عبرها. |
| Element | نوع العنصر. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Current](./get_current/)() const override | يحصل على العنصر 'الحالي'. |
| [IsValid](./isvalid/)() const | يتحقق مما إذا تم استدعاء [MoveNext()](./movenext/) ولم يتم الوصول إلى النهاية. |
| [MoveNext](./movenext/)() override | زيادة على نمط المُعدِّد. |
| [Reset](./reset/)() override | يعيد ضبط المُعدِّد للسماح بإعادة تعداد العناصر. |
| [ReverseEnumerator](./reverseenumerator/)(const Object::ptr\&, Container\&) | يُهيئ المُؤشِّر. |
| virtual [~ReverseEnumerator](./~reverseenumerator/)() | المدمر. |

## انظر أيضًا

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
