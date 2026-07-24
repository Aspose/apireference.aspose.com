---
title: "System::Collections::IEnumeratorImplValueType kelas"
linktitle: "IEnumeratorImplValueType"
second_title: "Aspose.Page untuk C++"
description: "System::Collections::IEnumeratorImplValueType kelas. Pembungkus yang membuat implementasi IEnumerator non-generic di atas Iterator generic IEnumeratorImplRefType - pembungkus untuk tipe nilai dalam C++."
type: docs
weight: 800
url: /id/cpp/system.collections/ienumeratorimplvaluetype/
---
## IEnumeratorImplValueType class


Pembungkus yang membuat implementasi [IEnumerator](../ienumerator/) non-generic di atas Iterator generic [IEnumeratorImplRefType](../ienumeratorimplreftype/) - pembungkus untuk tipe nilai.

```cpp
template<typename T>class IEnumeratorImplValueType : public System::Collections::IEnumerator
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe elemen. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_Current](./get_current/)() const override | Mendapatkan elemen saat ini. |
| [IEnumeratorImplValueType](./ienumeratorimplvaluetype/)(System::SharedPtr\<System::Collections::Generic::IEnumerator\<T\>\>) | konstruktor pembungkus |
| [MoveNext](./movenext/)() override | Memindahkan enumerator ke elemen berikutnya. Jika tidak ada elemen yang direferensikan sebelumnya, mengatur referensi ke elemen pertama yang tersedia. Jika akhir kontainer tercapai, tidak melakukan apa‑apa. |

## Lihat Juga

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
