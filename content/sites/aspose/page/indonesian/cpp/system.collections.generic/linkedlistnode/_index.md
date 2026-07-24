---
title: "System::Collections::Generic::LinkedListNode kelas"
linktitle: "LinkedListNode"
second_title: "Aspose.Page untuk C++"
description: "System::Collections::Generic::LinkedListNode kelas. Node dari linked list. Mengimplementasikan pembungkus di atas iterator std::list yang dibungkus dalam linked list. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 3200
url: /id/cpp/system.collections.generic/linkedlistnode/
---
## LinkedListNode class


Node dari linked list. Mengimplementasikan pembungkus di atas iterator std::list yang dibungkus dalam linked list. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
template<typename T>class LinkedListNode : public System::Object
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe nilai yang disimpan. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_List](./get_list/)() const | Mendapatkan daftar yang berisi. |
| [get_Next](./get_next/)() const | Mendapatkan node berikutnya. |
| [get_Previous](./get_previous/)() const | Mendapatkan node sebelumnya. |
| [get_Value](./get_value/)() const | Mendapatkan nilai yang disimpan. |
| [LinkedListNode](./linkedlistnode/)(const T\&) | Konstruktor. |
| [set_Value](./set_value/)(const T\&) | Menetapkan nilai yang disimpan. |

## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
