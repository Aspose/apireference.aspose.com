---
title: "System::Collections::IEnumeratorImplRefType kelas"
linktitle: "IEnumeratorImplRefType"
second_title: "Aspose.Page untuk C++"
description: "System::Collections::IEnumeratorImplRefType kelas. Pembungkus yang membuat implementasi IEnumerator non-generic di atas Iterator generic IEnumeratorImplRefType - pembungkus untuk Tipe Referensi dalam C++."
type: docs
weight: 700
url: /id/cpp/system.collections/ienumeratorimplreftype/
---
## IEnumeratorImplRefType class


Pembungkus yang membuat implementasi [IEnumerator](../ienumerator/) non-generic di atas Iterator [IEnumeratorImplRefType](./) - pembungkus untuk Tipe Referensi.

```cpp
template<typename T>class IEnumeratorImplRefType : public System::Collections::IEnumerator
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe elemen. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_Current](./get_current/)() const override | Mendapatkan elemen saat ini. |
| [IEnumeratorImplRefType](./ienumeratorimplreftype/)(System::SharedPtr\<System::Collections::Generic::IEnumerator\<System::SharedPtr\<T\>\>\>) | konstruktor pembungkus |
| [MoveNext](./movenext/)() override | Memindahkan enumerator ke elemen berikutnya. Jika tidak ada elemen yang direferensikan sebelumnya, mengatur referensi ke elemen pertama yang tersedia. Jika akhir kontainer tercapai, tidak melakukan apa‑apa. |

## Lihat Juga

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
