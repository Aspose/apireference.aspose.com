---
title: "System::Func class"
linktitle: "Func"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Func. Delegasi fungsi. Tipe ini harus dialokasikan pada stack dan diteruskan ke fungsi dengan nilai atau referensi. Jangan pernah menggunakan kelas System::SmartPtr untuk mengelola objek dari tipe ini dalam C++."
type: docs
weight: 2800
url: /id/cpp/system/func/
---
## Func class


Delegasi fungsi. Tipe ini harus dialokasikan pada stack dan diteruskan ke fungsi dengan nilai atau referensi. Jangan pernah menggunakan kelas [System::SmartPtr](../smartptr/) untuk mengelola objek dari tipe ini.

```cpp
template<typename...>class Func : public System::MulticastDelegate<::System::Detail::FuncArgsReorderer<void(), Args...>::type>
```


| Parameter | Deskripsi |
| --- | --- |
| Argumen | Argumen pemanggilan, kemudian tipe pengembalian yang wajib. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [Func](./func/)() | Konstruktor default yang membuat null-Func. |
| [Func](./func/)(T\&&) | Konstruktor yang membuat objek [Func](./) dan menetapkan nilai (baik callback aktual atau nullptr) padanya. |
| [Func](./func/)(const Func\&) | Konstruktor penyalinan. |
| [Func](./func/)(Func\&&) | Konstruktor pemindahan. |
| [operator=](./operator=/)(const Func\&) | Penugasan penyalinan. |
| [operator=](./operator=/)(Func\&&) | Penugasan pemindahan. |
| [~Func](./~func/)() | Destruktor. |
## Catatan



```cpp
#include "system/func.h"
#include <iostream>

// Fungsi ini menerima sebuah instance delegasi System::Func sebagai parameter.
void Print(int x, const System::Func<int, int> &func)
{
  std::cout << func(x) << std::endl;
}

int main()
{
  // Buat sebuah instance delegasi System::Func.
  auto func = static_cast<System::Func<int, int>>([](int x) -> int
  {
    return x * x;
  });

  // Lewatkan instance yang dibuat sebagai argumen fungsi.
  Print(1, func);
  Print(2, func);
  Print(3, func);

  return 0;
}
/*
This code example produces the following output:
1
4
9
*/
```

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
