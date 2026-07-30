---
title: "الفئة System::Collections::Generic::SimpleEnumerator"
linktitle: "SimpleEnumerator"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::Collections::Generic::SimpleEnumerator. فئة مكرّر (Iterator) للحاويات البسيطة التي تحتفظ بالعناصر مباشرةً باستخدام دالتي rbegin() و rend(). يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال في التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 3900
url: /ar/cpp/system.collections.generic/simpleenumerator/
---
## SimpleEnumerator class


فئة مكرّر (Iterator) للحاويات البسيطة التي تحتفظ بالعناصر مباشرةً باستخدام دالتي rbegin() و rend(). يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال في التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
template<typename Container,typename Element>class SimpleEnumerator : public System::Collections::Generic::BaseEnumerator<Container, typename Container::value_type>
```


| معامل | الوصف |
| --- | --- |
| حاوية | نوع الحاوية للتكرار عبرها. |
| Element | نوع العنصر. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | ينسخ المكرِّر الحالي. |
| [get_Current](./get_current/)() const override | يحصل على العنصر 'الحالي'. |
| [SimpleEnumerator](./simpleenumerator/)(Object::ptr, Container\&) | ينشئ مكرّرًا بسيطًا. |

## انظر أيضًا

* Class [BaseEnumerator](../baseenumerator/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
