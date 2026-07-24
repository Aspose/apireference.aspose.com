---
title: "System::Boolean class"
linktitle: "Boolean"
second_title: "Aspose.Page для C++"
description: "System::Boolean class. Класс, который хранит статические члены типа System.Boolean .Net в C++."
type: docs
weight: 600
url: /ru/cpp/system/boolean/
---
## Boolean class


Класс, который хранит статические члены типа [System.Boolean](./) .[Net](../../system.net/).

```cpp
class Boolean
```

## Методы

| Метод | Описание |
| --- | --- |
| static [Parse](./parse/)(const String\&) | Преобразует указанную строку в значение типа bool. |
| static [TryParse](./tryparse/)(const String\&, bool\&) | Преобразует указанную строку в значение типа bool. |
## Поля

| Поле | Описание |
| --- | --- |
| static [FalseString](./falsestring/) | Представление [String](../string/) логического значения 'false'. |
| static [TrueString](./truestring/) | Представление [String](../string/) логического значения 'true'. |
## Примечания



```cpp
#include <system/boolean.h>

using namespace System;

int main()
{
  // Создайте логическую переменную.
  bool isWeekend = false;

  // Разберите входную строку и выведите результат.
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

## См. также

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
