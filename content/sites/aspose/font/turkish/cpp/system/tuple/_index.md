---
title: "System::Tuple sınıfı"
linktitle: "Tuple"
second_title: "Aspose.Font için C++"
description: "System::Tuple sınıfı. Bir tuple veri yapısını temsil eden sınıf. C++'ta maksimum öğe sayısı 8'dir."
type: docs
weight: 6400
url: /tr/cpp/system/tuple/
---
## Tuple class


Bir demet (tuple) veri yapısını temsil eden sınıf. Azami öğe sayısı 8'tir.

```cpp
template<typename ...>class Tuple : public System::Runtime::CompilerServices::ITuple
```


| Parametre | Açıklama |
| --- | --- |
| Args | Tuple öğelerinin tipleri. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Geçerli ve belirtilen nesnelerin aynı olup olmadığını belirler. |
| [get_Item](./get_item/)() const | [Tuple](./) nesnesinin bileşeninin değerini alır. |
| [Tuple](./tuple/)(Args...) | Bir tuple nesnesi oluşturur. |
## Açıklamalar



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

## Ayrıca Bakınız

* Class [ITuple](../../system.runtime.compilerservices/ituple/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
