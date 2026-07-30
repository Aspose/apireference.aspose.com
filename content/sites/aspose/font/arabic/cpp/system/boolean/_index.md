---
title: "فئة System::Boolean"
linktitle: "Boolean"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Boolean. الفئة التي تحتفظ بالأعضاء الثابتة لنوع System.Boolean .Net في C++."
type: docs
weight: 600
url: /ar/cpp/system/boolean/
---
## Boolean class


الفئة التي تحتفظ بالأعضاء الثابتة لنوع [System.Boolean](./) .[Net](../../system.net/).

```cpp
class Boolean
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [Parse](./parse/)(const String\&) | يقوم بتحويل السلسلة المحددة إلى قيمة من نوع bool. |
| static [TryParse](./tryparse/)(const String\&, bool\&) | يقوم بتحويل السلسلة المحددة إلى قيمة من نوع bool. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [FalseString](./falsestring/) | تمثيل [String](../string/) للقيمة المنطقية 'false'. |
| static [TrueString](./truestring/) | تمثيل [String](../string/) للقيمة المنطقية 'true'. |
## ملاحظات



```cpp
#include <system/boolean.h>

using namespace System;

int main()
{
  // إنشاء المتغيّر المنطقي.
  bool isWeekend = false;

  // تحليل السلسلة المدخلة وطباعة النتيجة.
  if (Boolean::TryParse(u"True", isWeekend))
  {
    std::cout << "Is weekend: " << (isWeekend ? "Yes" : "No");
  }
  else
  {
    std::cerr << "Something went wrong" << std::endl;
  }

  return 0;
}
/*
This code example produces the following output:
Is weekend: Yes
*/
```

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
