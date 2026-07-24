---
title: "Kelas System::Console"
linktitle: "Console"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Console. Menyediakan metode untuk mengoutput data ke aliran output standar. Ini adalah tipe statis tanpa layanan instance. Anda tidak pernah boleh membuat instance darinya dengan cara apapun dalam C++."
type: docs
weight: 1400
url: /id/cpp/system/console/
---
## Console class


Menyediakan metode untuk mengeluarkan data ke aliran output standar. Ini adalah tipe statis tanpa layanan instance. Anda tidak boleh pernah membuat instance darinya dengan cara apapun.

```cpp
class Console
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| static [Beep](./beep/)() | BELUM DIIMPLEMENTASIKAN. |
| static [get_Error](./get_error/)() | Mengembalikan shared pointer yang menunjuk ke objek yang mewakili aliran error standar. |
| static [get_In](./get_in/)() | Mengembalikan shared pointer yang menunjuk ke objek yang mewakili aliran input standar. |
| static [get_Out](./get_out/)() | Mengembalikan pointer bersama yang menunjuk ke objek yang mewakili aliran output standar. |
| static [Mute](./mute/)(bool) | Menyenyunyikan atau mengaktifkan kembali aliran output standar. |
| static [ReadKey](./readkey/)() | BELUM DIIMPLEMENTASIKAN. |
| static [SetError](./seterror/)(const SharedPtr\<System::IO::TextWriter\>\&) | Menetapkan objek yang ditentukan ke properti Error kelas. |
| static [SetIn](./setin/)(const SharedPtr\<System::IO::TextReader\>\&) | Mengatur properti In ke objek TextReader yang ditentukan. |
| static [SetOut](./setout/)(const SharedPtr\<System::IO::TextWriter\>\&) | Menetapkan objek yang ditentukan ke properti Out kelas. |
| static [Write](./write/)(const SharedPtr\<T\>\&) | Mengoutputkan representasi string dari objek yang ditentukan ke aliran output standar. |
| static [Write](./write/)(bool) | Mengoutputkan representasi string dari nilai bool ke aliran output standar. |
| static [Write](./write/)(char_t) | Mengoutputkan nilai karakter yang ditentukan ke aliran output standar. |
| static [Write](./write/)(const ArrayPtr\<char_t\>\&) | Mengoutputkan representasi string dari array karakter yang ditentukan ke aliran output standar. |
| static [Write](./write/)(const Decimal\&) | Mengoutputkan representasi string dari nilai [Decimal](../decimal/) ke aliran output standar. |
| static [Write](./write/)(double) | Mengoutputkan representasi string dari nilai floating-point double-precision ke aliran output standar. |
| static [Write](./write/)(float) | Mengoutputkan representasi string dari nilai floating-point single-precision ke aliran output standar. |
| static [Write](./write/)(int32_t) | Mengoutputkan representasi string dari nilai integer 32-bit ke aliran output standar. |
| static [Write](./write/)(int64_t) | Mengoutputkan representasi string dari nilai integer 64-bit ke aliran output standar. |
| static [Write](./write/)(const String\&) | Mengoutputkan objek string yang ditentukan ke aliran output standar. |
| static [Write](./write/)(const char_t *) | Mengoutputkan c-string yang ditentukan ke aliran output standar. |
| static [Write](./write/)(const TypeInfo\&) | Mengoutputkan representasi string dari nilai [TypeInfo](../typeinfo/) ke aliran output standar. |
| static [Write](./write/)(uint32_t) | Mengoutputkan representasi string dari nilai integer tak bertanda 32-bit ke aliran output standar. |
| static [Write](./write/)(uint64_t) | Mengoutputkan representasi string dari nilai integer tak bertanda 64-bit ke aliran output standar. |
| static [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) | Mengoutputkan representasi string dari rentang yang ditentukan dari array karakter yang ditentukan ke aliran output standar. |
| static [Write](./write/)(const String\&, Args\&&...) | Mengoutputkan representasi string dari argumen yang ditentukan yang diformat sesuai format yang ditentukan ke aliran output standar. |
| static [Write](./write/)(const char *) |  |
| static [WriteLine](./writeline/)() | Mengoutputkan terminator baris saat ini ke aliran output standar. |
| static [WriteLine](./writeline/)(const SharedPtr\<T\>\&) | Mengoutputkan representasi string dari objek yang ditentukan diikuti oleh terminator baris saat ini ke aliran output standar. |
| static [WriteLine](./writeline/)(bool) | Mengoutputkan representasi string dari nilai bool diikuti oleh terminator baris saat ini ke aliran output standar. |
| static [WriteLine](./writeline/)(char_t) | Mengoutputkan nilai karakter yang ditentukan diikuti oleh terminator baris saat ini ke aliran output standar. |
| static [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) | Mengoutput representasi string dari array karakter yang ditentukan diikuti oleh terminator baris saat ini ke aliran output standar. |
| static [WriteLine](./writeline/)(const Decimal\&) | Mengoutput representasi string dari nilai [Decimal](../decimal/) diikuti oleh terminator baris saat ini ke aliran output standar. |
| static [WriteLine](./writeline/)(double) | Mengoutput representasi string dari nilai floating-point double-precision diikuti oleh terminator baris saat ini ke aliran output standar. |
| static [WriteLine](./writeline/)(float) | Mengoutput representasi string dari nilai floating-point single-precision diikuti oleh terminator baris saat ini ke aliran output standar. |
| static [WriteLine](./writeline/)(int32_t) | Mengoutput representasi string dari nilai integer 32-bit diikuti oleh terminator baris saat ini ke aliran output standar. |
| static [WriteLine](./writeline/)(int64_t) | Mengoutput representasi string dari nilai integer 64-bit diikuti oleh terminator baris saat ini ke aliran output standar. |
| static [WriteLine](./writeline/)(const String\&) | Mengoutput objek string yang ditentukan diikuti oleh terminator baris saat ini ke aliran output standar. |
| static [WriteLine](./writeline/)(const char_t *) | Mengoutput c-string yang ditentukan diikuti oleh terminator baris saat ini ke aliran output standar. |
| static [WriteLine](./writeline/)(const TypeInfo\&) | Mengoutput representasi string dari nilai [TypeInfo](../typeinfo/) diikuti oleh terminator baris saat ini ke aliran output standar. |
| static [WriteLine](./writeline/)(uint32_t) | Mengoutput representasi string dari nilai integer tak bertanda 32-bit diikuti oleh terminator baris saat ini ke aliran output standar. |
| static [WriteLine](./writeline/)(uint64_t) | Mengoutput representasi string dari nilai integer tak bertanda 64-bit diikuti oleh terminator baris saat ini ke aliran output standar. |
| static [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int, int) | Mengoutput representasi string dari rentang yang ditentukan dari array karakter yang ditentukan diikuti oleh terminator baris saat ini ke aliran output standar. |
| static [WriteLine](./writeline/)(const Exception\&) | Mengoutput representasi string dari objek [Exception](../exception/) yang ditentukan diikuti oleh terminator baris saat ini ke aliran output standar. |
| static [WriteLine](./writeline/)(const String\&, Args\&&...) | Mengoutput representasi string dari argumen yang ditentukan yang diformat sesuai dengan format yang ditentukan diikuti oleh terminator baris saat ini ke aliran output standar. |
| static [WriteLine](./writeline/)(const char *) |  |
## Catatan



```cpp
#include "system/console.h"
#include <array>

int main()
{
  using namespace System;

  // Cetak pesan hello.
  Console::WriteLine(u"Hello, world!");

  // Buat sebuah instance dari kelas 'std::array'.
  std::array<int, 5> arr = {1, 2, 3, 4, 5};

  // Cetak elemen-elemen dari array.
  for (auto el: arr)
  {
    Console::Write(u"{0} ", el);
  }
  Console::WriteLine();

  return 0;
}
/*
This code example produces the following output:
Hello, world!
1 2 3 4 5
*/
```

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
