---
title: "فئة System::Random"
linktitle: "Random"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Random. تمثل مولد أرقام عشوائية شبه عشوائي. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء تشغيلية و/أو أعطال تأكيدية. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 5200
url: /ar/cpp/system/random/
---
## Random class


تمثل مولد أرقام عشوائية شبه عشوائي. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء تشغيلية و/أو أعطال تأكيدية. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class Random : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [IsNull](./isnull/)() const | دائمًا تُعيد false. |
| virtual [Next](./next/)() | تُرجع عددًا عشوائيًا غير سالب أصغر من القيمة القصوى int32. |
| virtual [Next](./next/)(int32_t) | تُرجع عددًا عشوائيًا غير سالب أصغر من الحد الأقصى المحدد. |
| virtual [Next](./next/)(int32_t, int32_t) | تُرجع عددًا عشوائيًا ضمن النطاق المحدد. |
| virtual [NextBytes](./nextbytes/)(const ArrayPtr\<uint8_t\>\&) | يملأ عناصر المصفوفة المحددة من البايتات بأعداد عشوائية. |
| virtual [NextDouble](./nextdouble/)() | تُرجع عددًا عشوائيًا بين 0.0 و 1.0. |
| [Random](./random/)() | يُنشئ نسخة جديدة، باستخدام قيمة بذرة افتراضية تعتمد على الوقت. |
| [Random](./random/)(int32_t) | يُنشئ نسخة جديدة من فئة [System.Random](./)، باستخدام قيمة البذرة المحددة. |
## ملاحظات



```cpp
#include "system/random.h"
#include "system/smart_ptr.h"
#include <iostream>

int main()
{
  const auto rnd = System::MakeObject<System::Random>();

  // احصل على رقم شهر عشوائي واطبعه.
  auto monthNumber = rnd->Next(1, 13);
  std::cout << "Month: " << monthNumber << std::endl;

  // املأ المصفوفة بأعداد عشوائية.
  auto arr = System::MakeObject<System::Array<uint8_t>>(12);
  rnd->NextBytes(arr);

  // اطبع المصفوفة.
  for (auto i = 0; i < arr->get_Length(); ++i)
  {
    std::cout << static_cast<int>(arr[i]) << ' ';
  }
  std::cout << std::endl;

  return 0;
}
/*
This code example produces the following output:
Month: 4
177 213 89 240 68 182 18 96 109 131 1 78
*/
```

## انظر أيضًا

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
