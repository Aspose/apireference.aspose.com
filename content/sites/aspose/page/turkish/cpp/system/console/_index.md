---
title: "System::Console sınıfı"
linktitle: "Console"
second_title: "Aspose.Page için C++"
description: "System::Console sınıfı. Verileri standart çıktı akışına göndermek için yöntemler sağlar. Bu, örnek hizmeti olmayan statik bir türdür. C++'ta hiçbir şekilde onun örneklerini oluşturmayınız."
type: docs
weight: 1400
url: /tr/cpp/system/console/
---
## Console class


Verileri standart çıktı akışına göndermek için yöntemler sağlar. Bu, örnek hizmeti olmayan statik bir türdür. Onun örneklerini hiçbir şekilde oluşturmayın.

```cpp
class Console
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [Beep](./beep/)() | UYGULANMADI. |
| static [get_Error](./get_error/)() | Standart hata akışını temsil eden nesneye işaret eden bir paylaşımlı gösterici döndürür. |
| static [get_In](./get_in/)() | Standart giriş akışını temsil eden nesneye işaret eden bir paylaşımlı gösterici döndürür. |
| static [get_Out](./get_out/)() | Standart çıktı akışını temsil eden nesneye işaret eden bir paylaşımlı işaretçi döndürür. |
| static [Mute](./mute/)(bool) | Standart çıktı akışını susturur veya susturmayı kaldırır. |
| static [ReadKey](./readkey/)() | UYGULANMADI. |
| static [SetError](./seterror/)(const SharedPtr\<System::IO::TextWriter\>\&) | Belirtilen nesneyi sınıfın Error özelliğine atar. |
| static [SetIn](./setin/)(const SharedPtr\<System::IO::TextReader\>\&) | In özelliğini belirtilen TextReader nesnesine ayarlar. |
| static [SetOut](./setout/)(const SharedPtr\<System::IO::TextWriter\>\&) | Belirtilen nesneyi sınıfın Out özelliğine atar. |
| static [Write](./write/)(const SharedPtr\<T\>\&) | Belirtilen nesnenin dize temsilini standart çıktı akışına yazar. |
| static [Write](./write/)(bool) | Bool değerinin dize temsilini standart çıktı akışına yazar. |
| static [Write](./write/)(char_t) | Belirtilen karakter değerini standart çıktı akışına yazar. |
| static [Write](./write/)(const ArrayPtr\<char_t\>\&) | Belirtilen karakter dizisinin dize temsilini standart çıktı akışına yazar. |
| static [Write](./write/)(const Decimal\&) | Belirtilen [Decimal](../decimal/) değerinin dize temsilini standart çıktı akışına yazar. |
| static [Write](./write/)(double) | Çift duyarlıklı kayan nokta değerinin dize temsilini standart çıktı akışına yazar. |
| static [Write](./write/)(float) | Tek duyarlıklı kayan nokta değerinin dize temsilini standart çıktı akışına yazar. |
| static [Write](./write/)(int32_t) | 32-bit tam sayı değerinin dize temsilini standart çıktı akışına yazar. |
| static [Write](./write/)(int64_t) | 64-bit tam sayı değerinin dize temsilini standart çıktı akışına yazar. |
| static [Write](./write/)(const String\&) | Belirtilen string nesnesini standart çıktı akışına yazar. |
| static [Write](./write/)(const char_t *) | Belirtilen c-dizisini standart çıktı akışına yazar. |
| static [Write](./write/)(const TypeInfo\&) | Belirtilen [TypeInfo](../typeinfo/) değerinin dize temsilini standart çıktı akışına yazar. |
| static [Write](./write/)(uint32_t) | İşaretsiz 32-bit tam sayı değerinin dize temsilini standart çıktı akışına yazar. |
| static [Write](./write/)(uint64_t) | İşaretsiz 64-bit tam sayı değerinin dize temsilini standart çıktı akışına yazar. |
| static [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) | Belirtilen karakter dizisinin belirtilen aralığının dize temsilini standart çıktı akışına yazar. |
| static [Write](./write/)(const String\&, Args\&&...) | Belirtilen formatta biçimlendirilmiş belirtilen argümanların dize temsilini standart çıktı akışına yazar. |
| static [Write](./write/)(const char *) |  |
| static [WriteLine](./writeline/)() | Geçerli satır sonlandırıcısını standart çıktı akışına yazar. |
| static [WriteLine](./writeline/)(const SharedPtr\<T\>\&) | Belirtilen nesnenin dize temsilini, ardından geçerli satır sonlandırıcısını, standart çıktı akışına yazar. |
| static [WriteLine](./writeline/)(bool) | Bool değerinin dize temsilini, ardından geçerli satır sonlandırıcısını, standart çıktı akışına yazar. |
| static [WriteLine](./writeline/)(char_t) | Belirtilen karakter değerini, ardından geçerli satır sonlandırıcısını, standart çıktı akışına yazar. |
| static [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) | Belirtilen karakter dizisinin dize temsilini, mevcut satır sonlandırıcısını takiben standart çıktı akışına yazar. |
| static [WriteLine](./writeline/)(const Decimal\&) | Mevcut satır sonlandırıcısını takiben [Decimal](../decimal/) değerinin dize temsilini standart çıktı akışına yazar. |
| static [WriteLine](./writeline/)(double) | Mevcut satır sonlandırıcısını takiben çift duyarlıklı kayan nokta değerinin dize temsilini standart çıktı akışına yazar. |
| static [WriteLine](./writeline/)(float) | Mevcut satır sonlandırıcısını takiben tek duyarlıklı kayan nokta değerinin dize temsilini standart çıktı akışına yazar. |
| static [WriteLine](./writeline/)(int32_t) | Mevcut satır sonlandırıcısını takiben 32 bit tam sayı değerinin dize temsilini standart çıktı akışına yazar. |
| static [WriteLine](./writeline/)(int64_t) | Mevcut satır sonlandırıcısını takiben 64 bit tam sayı değerinin dize temsilini standart çıktı akışına yazar. |
| static [WriteLine](./writeline/)(const String\&) | Belirtilen dize nesnesini, mevcut satır sonlandırıcısını takiben standart çıktı akışına yazar. |
| static [WriteLine](./writeline/)(const char_t *) | Belirtilen C dizesini, mevcut satır sonlandırıcısını takiben standart çıktı akışına yazar. |
| static [WriteLine](./writeline/)(const TypeInfo\&) | Mevcut satır sonlandırıcısını takiben [TypeInfo](../typeinfo/) değerinin dize temsilini standart çıktı akışına yazar. |
| static [WriteLine](./writeline/)(uint32_t) | Mevcut satır sonlandırıcısını takiben işaretsiz 32 bit tam sayı değerinin dize temsilini standart çıktı akışına yazar. |
| static [WriteLine](./writeline/)(uint64_t) | Mevcut satır sonlandırıcısını takiben işaretsiz 64 bit tam sayı değerinin dize temsilini standart çıktı akışına yazar. |
| static [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int, int) | Belirtilen karakter dizisinin belirtilen aralığının dize temsilini, mevcut satır sonlandırıcısını takiben standart çıktı akışına yazar. |
| static [WriteLine](./writeline/)(const Exception\&) | Belirtilen [Exception](../exception/) nesnesinin dize temsilini, mevcut satır sonlandırıcısını takiben standart çıktı akışına yazar. |
| static [WriteLine](./writeline/)(const String\&, Args\&&...) | Belirtilen argümanların, belirtilen biçime göre biçimlendirilmiş dize temsilini, mevcut satır sonlandırıcısını takiben standart çıktı akışına yazar. |
| static [WriteLine](./writeline/)(const char *) |  |
## Açıklamalar



```cpp
#include "system/console.h"
#include <array>

int main()
{
  using namespace System;

  // Merhaba mesajını yazdır.
  Console::WriteLine(u"Hello, world!");

  // 'std::array' sınıfının bir örneğini oluştur.
  std::array<int, 5> arr = {1, 2, 3, 4, 5};

  // Dizinin elemanlarını yazdır.
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

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
