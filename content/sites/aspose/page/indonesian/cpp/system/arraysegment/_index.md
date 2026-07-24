---
title: "Kelas System::ArraySegment"
linktitle: "ArraySegment"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::ArraySegment. Mewakili segmen dari array satu dimensi. Tipe ini harus dialokasikan pada stack dan diteruskan ke fungsi dengan nilai atau referensi. Jangan pernah menggunakan kelas System::SmartPtr untuk mengelola objek tipe ini dalam C++."
type: docs
weight: 300
url: /id/cpp/system/arraysegment/
---
## ArraySegment class


Mewakili segmen dari array satu dimensi. Tipe ini harus dialokasikan pada stack dan diteruskan ke fungsi dengan nilai atau referensi. Jangan pernah menggunakan kelas [System::SmartPtr](../smartptr/) untuk mengelola objek tipe ini.

```cpp
template<typename T>class ArraySegment : public System::Object
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe elemen segmen array. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [ArraySegment](./arraysegment/)(System::ArrayPtr\<T\>) |  |
| [ArraySegment](./arraysegment/)(System::ArrayPtr\<T\>, int32_t, int32_t) |  |
| [ArraySegment](./arraysegment/)() |  |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override |  |
| [Equals](./equals/)(ArraySegment\<T\>) |  |
| [get_Array](./get_array/)() |  |
| [get_Count](./get_count/)() |  |
| [get_Offset](./get_offset/)() |  |
| [GetHashCode](./gethashcode/)() const override | Analog dari metode C# [Object.GetHashCode()](../object/gethashcode/). Memungkinkan hashing objek khusus. |
## Catatan



```cpp
#include <system/array_segment.h>
#include <system/smart_ptr.h>

using namespace System;

void Print(const SmartPtr<ArraySegment<String>> &segment)
{
  for (auto i = segment->get_Offset(); i < segment->get_Offset() + segment->get_Count(); i++)
  {
    std::cout << segment->get_Array()[i] << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // Buat dan isi array.
  auto array = System::MakeObject<Array<String>>(3);
  array[0] = u"First";
  array[1] = u"Second";
  array[2] = u"Third";

  // Buat segmen array yang berisi seluruh array.
  auto fullArray = MakeObject<ArraySegment<String>>(array);

  // Cetak item-item segmen array.
  Print(fullArray);

  // Buat segmen array.
  auto segment = MakeObject<ArraySegment<String>>(array, 1, 2);

  // Cetak item-item segmen array.
  Print(segment);

  return 0;
}
/*
This code example produces the following output:
First Second Third
Second Third
*/
```

## Lihat Juga

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
