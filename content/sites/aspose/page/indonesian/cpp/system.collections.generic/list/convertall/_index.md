---
title: "System::Collections::Generic::List::ConvertAll metode"
linktitle: "ConvertAll"
second_title: "Aspose.Page untuk C++"
description: "System::Collections::Generic::List::ConvertAll metode. Membuat daftar elemen yang dikonversi ke tipe berbeda dalam C++."
type: docs
weight: 1300
url: /id/cpp/system.collections.generic/list/convertall/
---
## List::ConvertAll method


Membuat daftar elemen yang dikonversi ke tipe yang berbeda.

```cpp
template<typename OutputType> SharedPtr<List<OutputType>> System::Collections::Generic::List<T>::ConvertAll(Converter<T, OutputType> converter)
```


| Parameter | Deskripsi |
| --- | --- |
| OutputType | Tipe elemen daftar output. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| converter | Converter\<T, OutputType\> | [Converter](../../../system/converter/) untuk digunakan dalam konversi item. |

### ReturnValue

Daftar baru yang berisi elemen yang telah dikonversi.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [List](../)
* Typedef [Converter](../../../system/converter/)
* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
