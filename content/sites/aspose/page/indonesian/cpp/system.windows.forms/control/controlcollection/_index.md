---
title: "System::Windows::Forms::Control::ControlCollection kelas"
linktitle: "ControlCollection"
second_title: "Aspose.Page untuk C++"
description: "System::Windows::Forms::Control::ControlCollection kelas. Kumpulan kontrol. Tidak diimplementasikan dalam C++."
type: docs
weight: 200
url: /id/cpp/system.windows.forms/control/controlcollection/
---
## ControlCollection class


Kumpulan kontrol. Tidak diimplementasikan.

```cpp
class ControlCollection : public System::Collections::Generic::IList<System::SharedPtr<Control>>
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Add](./add/)(const System::SharedPtr\<Control\>\&) override | Menambahkan kontrol ke dalam kumpulan. |
| virtual [AddRange](./addrange/)(System::ArrayPtr\<System::SharedPtr\<Control\>\>) | Menambahkan beberapa kontrol ke dalam kumpulan. |
| [Clear](./clear/)() override | Menghapus semua kontrol dari kumpulan. |
| [Contains](./contains/)(const System::SharedPtr\<Control\>\&) const override | Memeriksa apakah kontrol tertentu ada dalam kumpulan. |
| virtual [ContainsKey](./containskey/)(System::String) const | Memeriksa apakah kontrol dengan nama tertentu ada dalam kumpulan. |
| [ControlCollection](./controlcollection/)(const System::SharedPtr\<Control\>\&) | Konstruktor. |
| [CopyTo](./copyto/)(System::ArrayPtr\<System::SharedPtr\<Control\>\>, int) override | Menyalin isi kumpulan ke elemen array yang ada. |
| [Find](./find/)(const System::String\&, bool) const | Mencari kontrol bernama dalam kumpulan. Secara opsional memeriksa kumpulan kontrol yang terkandung secara rekursif. |
| [get_Count](./get_count/)() const override | Mendapatkan jumlah kontrol dalam kumpulan. |
| [get_Owner](./get_owner/)() const | Mendapatkan kontrol pemilik kumpulan. |
| [GetChildIndex](./getchildindex/)(const System::SharedPtr\<Control\>\&) const | Mencari kontrol tertentu. |
| virtual [GetChildIndex](./getchildindex/)(const System::SharedPtr\<Control\>\&, bool) const | Mencari kontrol tertentu. |
| [GetEnumerator](./getenumerator/)() override | Mendapatkan enumerator untuk mengiterasi koleksi. |
| [idx_get](./idx_get/)(int) const override | Aksesor berdasarkan indeks. |
| virtual [idx_get](./idx_get/)(System::String) const | Pengakses berdasarkan nama. |
| [idx_set](./idx_set/)(int, System::SharedPtr\<Control\>) override | Aksesor berdasarkan indeks. |
| virtual [idx_set](./idx_set/)(System::String, System::SharedPtr\<Control\>) | Pengakses berdasarkan nama. |
| [IndexOf](./indexof/)(const System::SharedPtr\<Control\>\&) const override | Mencari kontrol dalam koleksi. |
| virtual [IndexOfKey](./indexofkey/)(System::String) const | Mencari kontrol bernama dalam koleksi. |
| [Insert](./insert/)(int, const System::SharedPtr\<Control\>\&) override | Menyisipkan kontrol ke dalam koleksi. |
| [Remove](./remove/)(const System::SharedPtr\<Control\>\&) override | Menghapus kontrol dari koleksi. |
| [RemoveAt](./removeat/)(int) override | Menghapus kontrol dari koleksi. |
| virtual [RemoveByKey](./removebykey/)(System::String) | Menghapus kontrol dari koleksi. |
| virtual [SetChildIndex](./setchildindex/)(const System::SharedPtr\<Control\>\&, int) | Memindahkan kontrol ke posisi baru. |
## Lihat Juga

* Class [IList](../../../system.collections.generic/ilist/)
* Class [Control](../)
* Namespace [System::Windows::Forms](../../)
* Library [Aspose.Page for C++](../../../)
