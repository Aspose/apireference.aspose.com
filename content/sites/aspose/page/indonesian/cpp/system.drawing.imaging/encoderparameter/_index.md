---
title: "kelas System::Drawing::Imaging::EncoderParameter"
linktitle: "EncoderParameter"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Drawing::Imaging::EncoderParameter. Berfungsi sebagai wadah yang digunakan untuk meneruskan nilai ke encoder gambar. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 600
url: /id/cpp/system.drawing.imaging/encoderparameter/
---
## EncoderParameter class


Berfungsi sebagai wadah yang digunakan untuk meneruskan nilai ke encoder gambar. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen.

```cpp
class EncoderParameter : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [EncoderParameter](./encoderparameter/)() | Membuat instance baru dari kelas [EncoderParameter](./). |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, uint8_t, bool) | Membuat instance baru dari kelas [EncoderParameter](./). |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int16_t) | Membuat instance baru dari kelas [EncoderParameter](./). |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int64_t) | Membuat instance baru dari kelas [EncoderParameter](./). |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int32_t) | Membuat instance baru dari kelas [EncoderParameter](./). |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int32_t, int32_t) | Membuat instance baru dari kelas [EncoderParameter](./) yang mewakili sebuah pecahan. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int64_t, int64_t) | Membuat instance baru dari kelas [EncoderParameter](./) yang mewakili rentang nilai integer. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int32_t, int32_t, int32_t, int32_t) | Membuat instance baru dari kelas [EncoderParameter](./) yang mewakili rentang pecahan. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const String\&) | Membuat instance baru dari kelas [EncoderParameter](./). |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<uint8_t\>\&, bool) | Membuat instance baru dari kelas [EncoderParameter](./) yang mewakili sebuah array nilai. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int16_t\>\&) | Membuat instance baru dari kelas [EncoderParameter](./) yang mewakili sebuah array nilai. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int64_t\>\&) | Membuat instance baru dari kelas [EncoderParameter](./) yang mewakili sebuah array nilai. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&) | Membuat instance baru dari kelas [EncoderParameter](./) yang mewakili sebuah array pecahan. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int64_t\>\&, const ArrayPtr\<int64_t\>\&) | Membuat instance baru dari kelas [EncoderParameter](./) yang mewakili sebuah array rentang integer. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&) | Membuat sebuah instance baru dari kelas [EncoderParameter](./) yang mewakili array rentang pecahan. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int, EncoderParameterValueType, void *) | Membuat sebuah instance baru dari kelas [EncoderParameter](./) yang mewakili jumlah nilai yang ditentukan dari tipe yang ditentukan yang dibaca dari buffer yang ditentukan. |
| [get_Encoder](./get_encoder/)() const | Mengembalikan objek [Encoder](../encoder/) yang terkait dengan objek [EncoderParameter](./) saat ini. |
| [get_NumberOfValues](./get_numberofvalues/)() const | Mengembalikan jumlah nilai yang diwakili oleh objek saat ini. |
| [get_Type](./get_type/)() const | Mengembalikan tipe nilai yang diwakili oleh objek saat ini. |
| [set_Encoder](./set_encoder/)(const EncoderPtr\&) | Mengaitkan objek [Encoder](../encoder/) yang ditentukan dengan objek [EncoderParameter](./) saat ini. |
| [~EncoderParameter](./~encoderparameter/)() | Destruktor. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
