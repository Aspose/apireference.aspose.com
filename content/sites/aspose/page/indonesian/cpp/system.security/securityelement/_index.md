---
title: "kelas System::Security::SecurityElement"
linktitle: "SecurityElement"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Security::SecurityElement. Model objek XML untuk mengkodekan objek keamanan. Tidak diimplementasikan. Objek-objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject() . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 300
url: /id/cpp/system.security/securityelement/
---
## SecurityElement class


Model objek XML untuk mengkodekan objek keamanan. Tidak diimplementasikan. Objek-objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/) . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen.

```cpp
class SecurityElement : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [AddAttribute](./addattribute/)(const String\&, const String\&) | Menambahkan atribut ke tag. |
| [AddChild](./addchild/)(SecurityElement) | Menambahkan tag anak. |
| [Attribute](./attribute/)(const String\&) | Mendapatkan nilai atribut. |
| [Copy](./copy/)() | Mengkloning tag. |
| [Equal](./equal/)(SecurityElement) | Memeriksa kesamaan parameter. |
| static [Escape](./escape/)(const String\&) | Menyandikan karakter dalam string XML. |
| static [FromString](./fromstring/)(const String\&) | Membuat elemen dari kode XML. |
| [get_Attributes](./get_attributes/)() | Mendapatkan atribut tag. |
| [get_Children](./get_children/)() | Mendapatkan objek anak tag. |
| [get_Tag](./get_tag/)() | Mendapatkan nama tag. |
| [get_Text](./get_text/)() | Mendapatkan teks dalam tag. |
| static [IsValidAttributeName](./isvalidattributename/)(const String\&) | Memeriksa apakah nama atribut valid. |
| static [IsValidAttributeValue](./isvalidattributevalue/)(const String\&) | Memeriksa apakah nilai atribut valid. |
| static [IsValidTag](./isvalidtag/)(const String\&) | Memeriksa apakah tag valid. |
| static [IsValidText](./isvalidtext/)(const String\&) | Memeriksa apakah teks valid. |
| [SearchForChildByTag](./searchforchildbytag/)(const String\&) | Mendapatkan tag anak berdasarkan nama. |
| [SearchForTextOfTag](./searchfortextoftag/)(const String\&) | Mendapatkan teks dalam tag anak berdasarkan nama tag. |
| [SecurityElement](./securityelement/)(const String\&) | Konstruktor. |
| [SecurityElement](./securityelement/)(const String\&, const String\&) | Konstruktor. |
| [set_Attributes](./set_attributes/)(System::Collections::Generic::Dictionary\<String, String\>) | Mengatur atribut tag. |
| [set_Children](./set_children/)(System::Collections::Generic::List\<SecurityElement\>) | Mengatur objek anak tag. |
| [set_Tag](./set_tag/)(const String\&) | Mengatur nama tag. |
| [set_Text](./set_text/)(const String\&) | Mengatur teks dalam tag. |
| [ToString](./tostring/)() const override | Mengonversi tag menjadi string. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Security](../)
* Library [Aspose.Page for C++](../../)
