---
title: "System::Boolean class"
linktitle: "Boolean"
second_title: "Aspose.Page لـ C++"
description: "System::Boolean class. فئة تحتفظ بالأعضاء الثابتة لنوع System.Boolean .Net في C++."
type: docs
weight: 600
url: /ar/cpp/system/boolean/
---
## Boolean class


فئة تحتفظ بالأعضاء الثابتة لنوع [System.Boolean](./) .[Net](../../system.net/).

```cpp
class Boolean
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [Parse](./parse/)(const String\&) | يحوّل السلسلة المحددة إلى قيمة من نوع bool. |
| static [TryParse](./tryparse/)(const String\&, bool\&) | يحوّل السلسلة المحددة إلى قيمة من نوع bool. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [FalseString](./falsestring/) | [String](../string/) تمثيل القيمة المنطقية 'false'. |
| static [TrueString](./truestring/) | [String](../string/) تمثيل القيمة المنطقية 'true'. |
## ملاحظات



```cpp
#include <system/boolean.h>

using namespace System;

int main()
{
  // إنشاء المتغيّر المنطقي.
  bool isWeekend = false;

  // قم بتحليل السلسلة المدخلة واطبع النتيجة.
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
* Library [Aspose.Page for C++](../../)
