---
title: "System::Text::RegularExpressions::Match class"
linktitle: "Match"
second_title: "Aspose.Page لـ C++"
description: "System::Text::RegularExpressions::Match class. مطابقة واحدة للتعبير النمطي على سلسلة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة داخل مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 600
url: /ar/cpp/system.text.regularexpressions/match/
---
## Match class


[Single](../../system/single/) match of regexp over string. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Match : public System::Text::RegularExpressions::Group
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [AddCapture](./addcapture/)(const CapturePtr\&) | يضيف الالتقاط إلى المطابقة. |
| [AddGroup](./addgroup/)(const GroupPtr\&) | يضيف مجموعة إلى المطابقة. |
| static [get_Empty](./get_empty/)() | مستخرج المطابقة الفارغة. |
| [get_Groups](./get_groups/)() | يحصل على قائمة المجموعات. |
| [Match](./match/)(const UStringPtr\&, int, int) | منشئ. |
| [NextMatch](./nextmatch/)() | التكرار على المطابقات. |
| virtual [Result](./result/)(const String\&) | يقوم بتنسيق السلسلة عن طريق استبدال مراجع المطابقات الفرعية بقيمها. |
| [SetMappedIndexes](./setmappedindexes/)(const std::vector\<int\>\&) |  |
## انظر أيضًا

* Class [Group](../group/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
