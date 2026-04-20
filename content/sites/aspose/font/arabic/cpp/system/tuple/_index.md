---
title: "فئة System::Tuple"
linktitle: "Tuple"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Tuple. فئة تمثّل بنية بيانات الـ tuple. الحد الأقصى لعدد العناصر هو 8 في C++."
type: docs
weight: 6400
url: /ar/cpp/system/tuple/
---
## Tuple class


فئة تمثل بنية بيانات tuple. الحد الأقصى لعدد العناصر هو 8.

```cpp
template<typename ...>class Tuple : public System::Runtime::CompilerServices::ITuple
```


| معامل | الوصف |
| --- | --- |
| المعاملات | أنواع عناصر الـ tuple. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override | يحدد ما إذا كان الكائنان الحالي والمحدد متطابقان. |
| [get_Item](./get_item/)() const | يحصل على قيمة مكوّن كائن [Tuple](./). |
| [Tuple](./tuple/)(Args...) | ينشئ كائن tuple. |
## ملاحظات



```cpp
#include "system/smart_ptr.h"
#include "system/tuple.h"
#include <iostream>

int main()
{
  const auto tuple = System::MakeObject<System::Tuple<int, int, int>>(32, 16, 128);

  std::cout <<
    "Item 1: " << tuple->get_Item<0>() << std::endl <<
    "Item 2: " << tuple->get_Item<1>() << std::endl <<
    "Item 3: " << tuple->get_Item<2>() << std::endl;

  return 0;
}
/*
This code example produces the following output:
Item 1: 32
Item 2: 16
Item 3: 128
*/
```

## انظر أيضًا

* Class [ITuple](../../system.runtime.compilerservices/ituple/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
