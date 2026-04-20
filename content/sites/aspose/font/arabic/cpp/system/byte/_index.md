---
title: "System::Byte class"
linktitle: "Byte"
second_title: "Aspose.Font لـ C++"
description: "System::Byte class. يحتوي على طرق للعمل مع عدد صحيح غير موقع 8‑بت في C++."
type: docs
weight: 1100
url: /ar/cpp/system/byte/
---
## Byte class


يحتوي على طرق للعمل مع عدد صحيح غير موقع 8‑بت.

```cpp
class Byte
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [Parse](./parse/)(const String\&) | يحوّل السلسلة المحددة التي تحتوي على تمثيل عدد إلى عدد صحيح غير موقع 8‑بت مكافئ. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&) | يحوّل السلسلة المحددة التي تحتوي على تمثيل عدد إلى عدد صحيح غير موقع 8‑بت مكافئ باستخدام معلومات التنسيق المقدمة. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::NumberFormatInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, std::nullptr_t) |  |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&) | يحوّل السلسلة المحددة التي تحتوي على تمثيل عدد إلى عدد صحيح غير موقع 8‑بت مكافئ باستخدام معلومات التنسيق المقدمة ونمط الرقم. |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, std::nullptr_t) |  |
| static [TryParse](./tryparse/)(const String\&, uint8_t\&) | يحوّل السلسلة المحددة التي تحتوي على تمثيل عدد إلى عدد صحيح غير موقع 8‑بت مكافئ. |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, uint8_t\&) | يحوّل السلسلة المحددة التي تحتوي على تمثيل عدد إلى عدد صحيح غير موقع 8‑بت مكافئ باستخدام معلومات التنسيق المقدمة ونمط الرقم. |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, uint8_t\&) |  |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, uint8_t\&) |  |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, std::nullptr_t, uint8_t\&) |  |
## الحقول

| حقل | الوصف |
| --- | --- |
| static constexpr [MaxValue](./maxvalue/) | أكبر قيمة ممكنة. |
| static constexpr [MinValue](./minvalue/) | أصغر قيمة ممكنة. |
## ملاحظات



```cpp
#include <system/byte.h>

using namespace System;

int main()
{
  auto b1 = Byte::Parse(u"123");
  std::cout << static_cast<uint32_t>(b1) << std::endl;

  try
  {
    auto b2 = Byte::Parse(u"345");
    std::cout << static_cast<uint32_t>(b2) << std::endl;
  }
  catch (const OverflowException &ex)
  {
    std::cerr << ex.what() << std::endl;
  }

  uint8_t b3 = 0;
  if (Byte::TryParse(u"10", b3))
  {
    std::cout << static_cast<uint32_t>(b3) << std::endl;
  }
  else
  {
    std::cerr << "Something went wrong." << std::endl;
  }

  return 0;
}
/*
This code example produces the following output:
123
System::OverflowException: Value was either too large or too small for an UInt8
10
*/
```

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
