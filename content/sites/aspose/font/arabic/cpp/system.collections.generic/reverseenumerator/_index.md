---
title: "فئة System::Collections::Generic::ReverseEnumerator"
linktitle: "ReverseEnumerator"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Collections::Generic::ReverseEnumerator. مكرّر يعيد التكرار عكسيًا عبر الحاوية. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 3800
url: /ar/cpp/system.collections.generic/reverseenumerator/
---
## ReverseEnumerator class


[Enumerator](../baseset/) that reverse-iterates through container. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
template<typename Container,typename Element>class ReverseEnumerator : public System::Collections::Generic::IEnumerator<typename Container::value_type>
```


| معامل | الوصف |
| --- | --- |
| حاوية | حاوية للتكرار عبرها. |
| Element | نوع العنصر. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Current](./get_current/)() const override | يحصل على العنصر 'الحالي'. |
| [IsValid](./isvalid/)() const | يتحقق مما إذا تم استدعاء [MoveNext()](./movenext/) ولم يتم الوصول إلى النهاية. |
| [MoveNext](./movenext/)() override | زيادة على نمط المكرّر. |
| [Reset](./reset/)() override | يعيد ضبط المكرّر للسماح بإعادة تعداد العناصر. |
| [ReverseEnumerator](./reverseenumerator/)(const Object::ptr\&, Container\&) | يُهيّئ المكرّر. |
| virtual [~ReverseEnumerator](./~reverseenumerator/)() | المدمر. |

## انظر أيضًا

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
