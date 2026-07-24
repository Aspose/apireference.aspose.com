---
title: "kelas System::Comparison"
linktitle: "Perbandingan"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Comparison. Mewakili pointer ke metode yang membandingkan dua objek dengan tipe yang sama. Tipe ini harus dialokasikan pada stack dan diteruskan ke fungsi dengan nilai atau referensi. Jangan pernah menggunakan kelas System::SmartPtr untuk mengelola objek tipe ini di C++."
type: docs
weight: 1300
url: /id/cpp/system/comparison/
---
## Comparison class


Mewakili pointer ke metode yang membandingkan dua objek dengan tipe yang sama. Tipe ini harus dialokasikan pada stack dan diteruskan ke fungsi dengan nilai atau referensi. Jangan pernah menggunakan kelas [System::SmartPtr](../smartptr/) untuk mengelola objek tipe ini.

```cpp
template<typename T>class Comparison : public System::MulticastDelegate<int(T, T)>
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe objek yang dibandingkan oleh metode |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [Comparison](./comparison/)(Y) | Membuat sebuah instance delegasi [Comparison](./) yang mewakili pointer ke entitas yang dapat dipanggil yang ditentukan. |
| [operator()](./operator()/)(T, T) | Memanggil objek yang dapat dipanggil yang ditunjuk oleh objek saat ini. |
## Catatan



```cpp
#include "system/comparison.h"
#include "system/console.h"
#include "system/exceptions.h"
#include "system/string.h"
#include <algorithm>
#include <initializer_list>
#include <vector>

using namespace System;

// Kelas templat yang mewakili array dinamis.
template <typename T>
class MyArray
{
  // Digunakan untuk menyimpan data array.
  std::vector<T> m_data;

public:
  // Membuat sebuah instance baru dari array dinamis kami.
  MyArray(const std::initializer_list<T>& source) : m_data(source) {};

  // Digunakan untuk mengurutkan data array. Metode ini menerima sebuah instance dari
  // 'System::Comparison' kelas templat.
  void Sort(Comparison<T> comparison)
  {
    if (comparison.IsNull())
    {
      throw ArgumentNullException(u"comparison");
    }
    std::sort(m_data.begin(), m_data.end(), comparison);
  }

  // Mengembalikan jumlah elemen yang disimpan oleh array dinamis kami.
  size_t get_Size()
  {
    return m_data.size();
  }

  // Digunakan untuk mendapatkan elemen pada indeks yang ditentukan.
  T& operator[](int index)
  {
    if (index < 0 || index >= m_data.size())
    {
      throw IndexOutOfRangeException(u"index");
    }
    return m_data[index];
  }
};

int main() {
  // Buat sebuah instance dari kelas MyArray dengan elemen yang ditentukan.
  MyArray<String> arr = {u"a", u"e", u"c", u"b", u"d"};

  // Urutkan elemen array dinamis secara naik.
  arr.Sort([](const String &a, const String &b) -> int
  {
    return String::Compare(a, b);
  });

  // Cetak elemen-elemen array dinamis.
  for (auto i = 0; i < arr.get_Size(); ++i)
  {
    Console::WriteLine(arr[i]);
  }

  return 0;
}
/*
This code example produces the following output:
a
b
c
d
e
*/
```

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
