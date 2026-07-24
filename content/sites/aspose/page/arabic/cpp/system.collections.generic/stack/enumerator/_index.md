---
title: "فئة System::Collections::Generic::Stack::Enumerator"
linktitle: "المُعدِّد"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Collections::Generic::Stack::Enumerator. مُعدٍ للتنقل عبر المكدس. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2000
url: /ar/cpp/system.collections.generic/stack/enumerator/
---
## Enumerator class


[Enumerator](./) to iterate through stack. Objects of this class should only be allocated using [System::MakeObject()](../../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Enumerator : public System::Collections::Generic::ReverseEnumerator<stack_t>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Enumerator](./enumerator/)(const ThisPtr\&) | ينشئ مُعدٍ يتنقل عبر المكدس المعطى. |
## انظر أيضًا

* Class [ReverseEnumerator](../../reverseenumerator/)
* Class [Stack](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
