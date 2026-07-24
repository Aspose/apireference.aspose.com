---
title: "System::Boolean class"
linktitle: "Boolean"
second_title: "Aspose.Page untuk C++"
description: "System::Boolean class. Kelas yang menyimpan anggota statis dari tipe System.Boolean .Net dalam C++."
type: docs
weight: 600
url: /id/cpp/system/boolean/
---
## Boolean class


Kelas yang menyimpan anggota statis dari tipe [System.Boolean](./) .[Net](../../system.net/).

```cpp
class Boolean
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| static [Parse](./parse/)(const String\&) | Mengonversi string yang ditentukan ke nilai tipe bool. |
| static [TryParse](./tryparse/)(const String\&, bool\&) | Mengonversi string yang ditentukan ke nilai tipe bool. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [FalseString](./falsestring/) | Representasi [String](../string/) dari nilai boolean 'false'. |
| static [TrueString](./truestring/) | Representasi [String](../string/) dari nilai boolean 'true'. |
## Catatan



```cpp
#include <system/boolean.h>

using namespace System;

int main()
{
  // Buat variabel boolean.
  bool isWeekend = false;

  // Parse string masukan dan cetak hasil.
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

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
