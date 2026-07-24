---
title: "kelas System::Tuple"
linktitle: "Tuple"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Tuple. Kelas yang merepresentasikan struktur data tuple. Jumlah maksimum item adalah 8 dalam C++."
type: docs
weight: 6400
url: /id/cpp/system/tuple/
---
## Tuple class


Kelas yang mewakili struktur data tuple. Jumlah maksimum item adalah 8.

```cpp
template<typename ...>class Tuple : public System::Runtime::CompilerServices::ITuple
```


| Parameter | Deskripsi |
| --- | --- |
| Argumen | Tipe elemen tuple. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Menentukan apakah objek saat ini dan objek yang ditentukan identik. |
| [get_Item](./get_item/)() const | Mendapatkan nilai komponen objek [Tuple](./). |
| [Tuple](./tuple/)(Args...) | Membuat objek tuple. |
## Catatan



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

## Lihat Juga

* Class [ITuple](../../system.runtime.compilerservices/ituple/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
