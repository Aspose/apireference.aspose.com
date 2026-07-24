---
title: "System::Globalization::StringInfo class"
linktitle: "StringInfo"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Globalization::StringInfo. Splitter untuk mengiterasi bagian-bagian string. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 2400
url: /id/cpp/system.globalization/stringinfo/
---
## StringInfo class


Splitter untuk mengiterasi bagian-bagian string. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen.

```cpp
class StringInfo : public virtual System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [get_LengthInTextElements](./get_lengthintextelements/)() const | Mendapatkan jumlah item teks dalam objek [StringInfo](./). |
| [get_String](./get_string/)() const | Mendapatkan nilai dari objek [StringInfo](./). |
| [GetHashCode](./gethashcode/)() const override | Analog dari metode C# [Object.GetHashCode()](../../system/object/gethashcode/). Memungkinkan hashing objek kustom. |
| static [GetNextTextElement](./getnexttextelement/)(const String\&) | Mendapatkan elemen pertama dalam string yang ditentukan. |
| static [GetNextTextElement](./getnexttextelement/)(const String\&, int) | Mendapatkan elemen pada indeks yang ditentukan dari string yang ditentukan. |
| static [GetTextElementEnumerator](./gettextelementenumerator/)(const String\&) | Membuat enumerator untuk mengiterasi karakter-karakter string. |
| static [GetTextElementEnumerator](./gettextelementenumerator/)(const String\&, int) | Membuat enumerator untuk mengiterasi karakter-karakter string mulai dari indeks yang ditentukan. |
| [operator=](./operator=/)(const StringInfo\&) |  |
| static [ParseCombiningCharacters](./parsecombiningcharacters/)(const String\&) | Mendapatkan indeks karakter dasar, surrogate tinggi, dan karakter kontrol. |
| [set_String](./set_string/)(const String\&) | Mengatur nilai objek [StringInfo](./). |
| [StringInfo](./stringinfo/)() | Informasi RTTI. |
| [StringInfo](./stringinfo/)(const String\&) | Konstruktor. |
| [StringInfo](./stringinfo/)(const StringInfo\&) |  |
| [SubstringByTextElements](./substringbytextelements/)(int) const | Mendapatkan substring elemen teks dari elemen teks yang ditentukan hingga elemen teks terakhir. |
| [SubstringByTextElements](./substringbytextelements/)(int, int) const | Mendapatkan substring elemen teks dari elemen teks yang ditentukan hingga sejumlah elemen teks yang ditentukan. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
