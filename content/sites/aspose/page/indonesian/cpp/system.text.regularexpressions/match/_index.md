---
title: "System::Text::RegularExpressions::Match kelas"
linktitle: "Match"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Text::RegularExpressions::Match. Kecocokan tunggal dari regexp pada string. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject() . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 600
url: /id/cpp/system.text.regularexpressions/match/
---
## Match class


[Single](../../system/single/) match of regexp over string. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Match : public System::Text::RegularExpressions::Group
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [AddCapture](./addcapture/)(const CapturePtr\&) | Menambahkan penangkapan ke dalam kecocokan. |
| [AddGroup](./addgroup/)(const GroupPtr\&) | Menambahkan grup ke dalam kecocokan. |
| static [get_Empty](./get_empty/)() | Akses ke kecocokan kosong. |
| [get_Groups](./get_groups/)() | Mendapatkan daftar grup. |
| [Match](./match/)(const UStringPtr\&, int, int) | Konstruktor. |
| [NextMatch](./nextmatch/)() | Iterasi atas kecocokan. |
| virtual [Result](./result/)(const String\&) | Memformat string dengan mengganti referensi submatch dengan nilai-nilainya. |
| [SetMappedIndexes](./setmappedindexes/)(const std::vector\<int\>\&) |  |
## Lihat Juga

* Class [Group](../group/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
