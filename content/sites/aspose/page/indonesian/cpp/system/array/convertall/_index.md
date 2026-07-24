---
title: "metode System::Array::ConvertAll"
linktitle: "ConvertAll"
second_title: "Aspose.Page untuk C++"
description: "metode System::Array::ConvertAll. Membuat objek Array baru dan mengisinya dengan elemen-elemen dari array yang ditentukan yang dikonversi ke tipe **OutputType** menggunakan delegasi konverter yang ditentukan dalam C++."
type: docs
weight: 4800
url: /id/cpp/system/array/convertall/
---
## Array::ConvertAll(ArrayPtr\<InputType\>, Converter\<InputType, OutputType\>) method


Membuat objek [Array](../) baru dan mengisinya dengan elemen-elemen dari array yang ditentukan yang dikonversi ke tipe **OutputType** menggunakan delegasi konverter yang ditentukan.

```cpp
template<typename InputType,typename OutputType> static ArrayPtr<OutputType> System::Array<T>::ConvertAll(ArrayPtr<InputType> input_array, Converter<InputType, OutputType> converter)
```


| Parameter | Deskripsi |
| --- | --- |
| InputType | Tipe elemen dari array input |
| OutputType | Tipe elemen dari array hasil |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| input_array | ArrayPtr\<InputType\> | Sebuah objek [Array](../) |
| converter | Converter\<InputType, OutputType\> | Sebuah objek [Converter](../../converter/) yang digunakan untuk mengonversi setiap elemen dari array input menjadi nilai yang setara dengan tipe **OutputType** |

### ReturnValue

Array baru yang berisi nilai-nilai dengan tipe **OutputType** yang setara dengan nilai-nilai **input_array**

## Lihat Juga

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Converter](../../converter/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::ConvertAll(ArrayPtr\<InputType\>, std::function\<OutputType(InputType)>) method


Membuat objek [Array](../) baru dan mengisinya dengan elemen-elemen dari array yang ditentukan yang dikonversi ke tipe **OutputType** menggunakan objek fungsi konverter yang ditentukan.

```cpp
template<typename InputType,typename OutputType> static ArrayPtr<OutputType> System::Array<T>::ConvertAll(ArrayPtr<InputType> input_array, std::function<OutputType(InputType)> converter)
```


| Parameter | Deskripsi |
| --- | --- |
| InputType | Tipe elemen dari array input |
| OutputType | Tipe elemen dari array hasil |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| input_array | ArrayPtr\<InputType\> | Sebuah objek [Array](../) |
| converter | std::function\<OutputType(InputType)> | Objek fungsi yang digunakan untuk mengonversi setiap elemen dari array input menjadi nilai yang setara dengan tipe **OutputType** |

### ReturnValue

Array baru yang berisi nilai-nilai dengan tipe **OutputType** yang setara dengan nilai-nilai **input_array**

## Lihat Juga

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
