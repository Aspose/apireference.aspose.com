---
title: "Kelas System::ConsoleOutput"
linktitle: "ConsoleOutput"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::ConsoleOutput. Mewakili aliran output standar. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1500
url: /id/cpp/system/consoleoutput/
---
## ConsoleOutput class


Mewakili aliran output standar. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class ConsoleOutput : public System::IO::TextWriter
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_Encoding](./get_encoding/)() override | Selalu mengembalikan enkoding ASCII. |
| [Write](./write/)(bool) override | Mengoutput representasi string dari nilai bool yang ditentukan ke aliran output yang diwakili oleh objek saat ini. |
| [Write](./write/)(const SharedPtr\<Object\>\&) override | Mengoutput representasi string dari objek yang ditentukan ke aliran output yang diwakili oleh objek saat ini. |
| [Write](./write/)(char_t) override | Mengoutput nilai karakter yang ditentukan ke aliran output yang diwakili oleh objek saat ini. |
| [Write](./write/)(Decimal) override | Mengoutput representasi string dari nilai [Decimal](../decimal/) ke aliran output yang diwakili oleh objek saat ini. |
| [Write](./write/)(double) override | Mengoutput representasi string dari nilai floating-point double-precision ke aliran output yang diwakili oleh objek saat ini. |
| [Write](./write/)(int32_t) override | Mengoutput representasi string dari nilai integer 32-bit ke aliran output yang diwakili oleh objek saat ini. |
| [Write](./write/)(int64_t) override | Mengoutput representasi string dari nilai integer 64-bit ke aliran output yang diwakili oleh objek saat ini. |
| [Write](./write/)(float) override | Mengoutput representasi string dari nilai floating-point single-precision ke aliran output yang diwakili oleh objek saat ini. |
| [Write](./write/)(const String\&) override | Mengoutput objek string yang ditentukan ke aliran output yang diwakili oleh objek saat ini. |
| [Write](./write/)(uint32_t) override | Mengoutput representasi string dari nilai integer tak bertanda 32-bit ke aliran output yang diwakili oleh objek saat ini. |
| [Write](./write/)(uint64_t) override | Mengoutput representasi string dari nilai integer tak bertanda 64-bit ke aliran output yang diwakili oleh objek saat ini. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&) override | Mengoutput representasi string dari array karakter yang ditentukan ke aliran output yang diwakili oleh objek saat ini. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | Mengoutput representasi string dari rentang nilai array karakter yang ditentukan ke aliran output yang diwakili oleh objek saat ini. |
| [Write](./write/)(const char_t *) override | Mengoutput c-string yang ditentukan ke aliran output yang diwakili oleh objek saat ini. |
| [Write](./write/)(const TypeInfo\&) override | Mengoutput representasi string dari objek [TypeInfo](../typeinfo/) yang ditentukan ke aliran output yang diwakili oleh objek saat ini. |
| [Write](./write/)(const char *) |  |
| [WriteLine](./writeline/)() override | Mengoutput terminator baris saat ini ke aliran output yang diwakili oleh objek saat ini. |
| [WriteLine](./writeline/)(const SharedPtr\<Object\>\&) override | Mengoutput representasi string dari objek yang ditentukan diikuti oleh terminator baris saat ini ke aliran output yang diwakili oleh objek saat ini. |
| [WriteLine](./writeline/)(bool) override | Mengoutput representasi string dari nilai bool yang ditentukan diikuti oleh terminator baris saat ini ke aliran output yang diwakili oleh objek saat ini. |
| [WriteLine](./writeline/)(char_t) override | Mengoutput nilai karakter yang ditentukan diikuti oleh terminator baris saat ini ke aliran output yang diwakili oleh objek saat ini. |
| [WriteLine](./writeline/)(Decimal) override | Mengoutput representasi string dari nilai [Decimal](../decimal/) diikuti oleh terminator baris saat ini ke aliran output yang diwakili oleh objek saat ini. |
| [WriteLine](./writeline/)(double) override | Mengoutput representasi string dari nilai floating-point double-precision diikuti oleh terminator baris saat ini ke aliran output yang diwakili oleh objek saat ini. |
| [WriteLine](./writeline/)(int) override | Mengoutput representasi string dari nilai integer 32-bit diikuti oleh terminator baris saat ini ke aliran output yang diwakili oleh objek saat ini. |
| [WriteLine](./writeline/)(int64_t) override | Mengoutput representasi string dari nilai integer 64-bit diikuti oleh terminator baris saat ini ke aliran output yang diwakili oleh objek saat ini. |
| [WriteLine](./writeline/)(float) override | Mengoutput representasi string dari nilai floating-point presisi tunggal yang diikuti oleh terminator baris saat ini ke aliran output yang diwakili oleh objek saat ini. |
| [WriteLine](./writeline/)(const String\&) override | Mengoutput objek string yang ditentukan yang diikuti oleh terminator baris saat ini ke aliran output yang diwakili oleh objek saat ini. |
| [WriteLine](./writeline/)(uint32_t) override | Mengoutput representasi string dari nilai integer 32-bit tak bertanda yang diikuti oleh terminator baris saat ini ke aliran output yang diwakili oleh objek saat ini. |
| [WriteLine](./writeline/)(uint64_t) override | Mengoutput representasi string dari nilai integer 64-bit tak bertanda yang diikuti oleh terminator baris saat ini ke aliran output yang diwakili oleh objek saat ini. |
| [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) override | Mengoutput representasi string dari array karakter yang ditentukan yang diikuti oleh terminator baris saat ini ke aliran output yang diwakili oleh objek saat ini. |
| [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | Mengoutput representasi string dari rentang nilai array karakter yang ditentukan yang diikuti oleh terminator baris saat ini ke aliran output yang diwakili oleh objek saat ini. |
| [WriteLine](./writeline/)(const char_t *) override | Mengoutput c-string yang ditentukan yang diikuti oleh terminator baris saat ini ke aliran output yang diwakili oleh objek saat ini. |
| [WriteLine](./writeline/)(const TypeInfo\&) override | Mengoutput representasi string dari objek [TypeInfo](../typeinfo/) yang ditentukan yang diikuti oleh terminator baris saat ini ke aliran output yang diwakili oleh objek saat ini. |
| [WriteLine](./writeline/)(const char *) |  |
## Lihat Juga

* Class [TextWriter](../../system.io/textwriter/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
