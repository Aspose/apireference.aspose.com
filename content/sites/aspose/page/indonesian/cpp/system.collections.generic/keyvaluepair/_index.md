---
title: "kelas System::Collections::Generic::KeyValuePair"
linktitle: "KeyValuePair"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Collections::Generic::KeyValuePair. Pasangan kunci dan nilai. Tipe ini harus dialokasikan pada stack dan diteruskan ke fungsi dengan nilai atau referensi. Jangan pernah menggunakan kelas System::SmartPtr untuk mengelola objek tipe ini dalam C++."
type: docs
weight: 2900
url: /id/cpp/system.collections.generic/keyvaluepair/
---
## KeyValuePair class


Pasangan kunci dan nilai. Tipe ini harus dialokasikan pada stack dan diteruskan ke fungsi dengan nilai atau referensi. Jangan pernah menggunakan kelas [System::SmartPtr](../../system/smartptr/) untuk mengelola objek tipe ini.

```cpp
template<typename TKey,typename TValue>class KeyValuePair
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_Key](./get_key/)() const | Mendapatkan kunci. |
| [get_Value](./get_value/)() const | Mendapatkan nilai. |
| [GetHashCode](./gethashcode/)() const | Menghitung hash pasangan kunci-nilai dengan melakukan XOR pada hash kunci dan nilai. |
| [IsNull](./isnull/)() const | Selalu mengembalikan false. |
| [KeyValuePair](./keyvaluepair/)() | Inisialisasi pasangan kunci-nilai null. |
| [KeyValuePair](./keyvaluepair/)(const TKey\&, const TValue\&) | Konstruktor. |
| [KeyValuePair](./keyvaluepair/)(const std::pair\<OtherK, OtherV\>\&) | Konstruktor konversi tipe. |
| [operator<](./operator_/)(const KeyValuePair\&) const | Patch untuk kelas yang mewarisi dari [IComparer<KeyValuePair<TKey, TValue>>](../icomparer/), tidak membandingkan apa pun. |
| [ToString](./tostring/)() const | Mengonversi pasangan kunci-nilai menjadi string. |

## Lihat Juga

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
