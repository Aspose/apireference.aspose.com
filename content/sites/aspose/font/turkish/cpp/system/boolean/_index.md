---
title: "System::Boolean sınıfı"
linktitle: "Boolean"
second_title: "Aspose.Font için C++"
description: "System::Boolean sınıfı. C++'de System.Boolean .Net tipinin statik üyelerini tutan sınıf."
type: docs
weight: 600
url: /tr/cpp/system/boolean/
---
## Boolean class


Statik üyeleri [System.Boolean](./) .[Net](../../system.net/) tipinde tutan sınıf.

```cpp
class Boolean
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [Parse](./parse/)(const String\&) | Belirtilen dizeyi bool tipinde bir değere dönüştürür. |
| static [TryParse](./tryparse/)(const String\&, bool\&) | Belirtilen dizeyi bool tipinde bir değere dönüştürür. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [FalseString](./falsestring/) | 'false' boolean değerinin [String](../string/) temsili. |
| static [TrueString](./truestring/) | 'true' boolean değerinin [String](../string/) temsili. |
## Açıklamalar



```cpp
#include <system/boolean.h>

using namespace System;

int main()
{
  // Boolean değişkeni oluştur.
  bool isWeekend = false;

  // Girdi dizesini ayrıştır ve sonucu yazdır.
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

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
