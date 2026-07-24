---
title: "System::ConsoleOutput sınıfı"
linktitle: "ConsoleOutput"
second_title: "Aspose.Page için C++"
description: "System::ConsoleOutput sınıfı. Standart çıktı akışını temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da new operatörüyle asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 1500
url: /tr/cpp/system/consoleoutput/
---
## ConsoleOutput class


Standart çıktı akışını temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türün örneğini yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class ConsoleOutput : public System::IO::TextWriter
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Encoding](./get_encoding/)() override | Her zaman ASCII kodlamasını döndürür. |
| [Write](./write/)(bool) override | Belirtilen bool değerinin dize temsilini, geçerli nesne tarafından temsil edilen çıktı akışına yazar. |
| [Write](./write/)(const SharedPtr\<Object\>\&) override | Belirtilen nesnenin dize temsilini, geçerli nesne tarafından temsil edilen çıktı akışına yazar. |
| [Write](./write/)(char_t) override | Belirtilen karakter değerini, geçerli nesne tarafından temsil edilen çıktı akışına yazar. |
| [Write](./write/)(Decimal) override | Belirtilen [Decimal](../decimal/) değerinin dize temsilini, geçerli nesne tarafından temsil edilen çıktı akışına yazar. |
| [Write](./write/)(double) override | Çift duyarlıklı kayan nokta değerinin dize temsilini, geçerli nesne tarafından temsil edilen çıktı akışına yazar. |
| [Write](./write/)(int32_t) override | 32 bit tam sayının dize temsilini, geçerli nesne tarafından temsil edilen çıktı akışına yazar. |
| [Write](./write/)(int64_t) override | 64 bit tam sayının dize temsilini, geçerli nesne tarafından temsil edilen çıktı akışına yazar. |
| [Write](./write/)(float) override | Tek duyarlıklı kayan nokta değerinin dize temsilini, geçerli nesne tarafından temsil edilen çıktı akışına yazar. |
| [Write](./write/)(const String\&) override | Belirtilen dize nesnesini, geçerli nesne tarafından temsil edilen çıktı akışına yazar. |
| [Write](./write/)(uint32_t) override | İşaretsiz 32 bit tam sayının dize temsilini, geçerli nesne tarafından temsil edilen çıktı akışına yazar. |
| [Write](./write/)(uint64_t) override | İşaretsiz 64 bit tam sayının dize temsilini, geçerli nesne tarafından temsil edilen çıktı akışına yazar. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&) override | Belirtilen karakter dizisinin dize temsilini, geçerli nesne tarafından temsil edilen çıktı akışına yazar. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | Belirtilen karakter dizisinin bir değer aralığının dize temsilini, geçerli nesne tarafından temsil edilen çıktı akışına yazar. |
| [Write](./write/)(const char_t *) override | Belirtilen C-dizesini, geçerli nesne tarafından temsil edilen çıktı akışına yazar. |
| [Write](./write/)(const TypeInfo\&) override | Belirtilen [TypeInfo](../typeinfo/) nesnesinin dize temsilini, geçerli nesne tarafından temsil edilen çıktı akışına yazar. |
| [Write](./write/)(const char *) |  |
| [WriteLine](./writeline/)() override | Geçerli satır sonlandırıcısını, geçerli nesne tarafından temsil edilen çıktı akışına yazar. |
| [WriteLine](./writeline/)(const SharedPtr\<Object\>\&) override | Belirtilen nesnenin dize temsilini, ardından geçerli satır sonlandırıcısını, geçerli nesne tarafından temsil edilen çıktı akışına yazar. |
| [WriteLine](./writeline/)(bool) override | Belirtilen bool değerinin dize temsilini, ardından geçerli satır sonlandırıcısını, geçerli nesne tarafından temsil edilen çıktı akışına yazar. |
| [WriteLine](./writeline/)(char_t) override | Belirtilen karakter değerini, ardından geçerli satır sonlandırıcısını, geçerli nesne tarafından temsil edilen çıktı akışına yazar. |
| [WriteLine](./writeline/)(Decimal) override | Belirtilen [Decimal](../decimal/) değerinin dize temsilini, ardından geçerli satır sonlandırıcısını, geçerli nesne tarafından temsil edilen çıktı akışına yazar. |
| [WriteLine](./writeline/)(double) override | Çift duyarlıklı kayan nokta değerinin dize temsilini, ardından geçerli satır sonlandırıcısını, geçerli nesne tarafından temsil edilen çıktı akışına yazar. |
| [WriteLine](./writeline/)(int) override | 32 bit tam sayının dize temsilini, ardından geçerli satır sonlandırıcısını, geçerli nesne tarafından temsil edilen çıktı akışına yazar. |
| [WriteLine](./writeline/)(int64_t) override | 64 bit tam sayının dize temsilini, ardından geçerli satır sonlandırıcısını, geçerli nesne tarafından temsil edilen çıktı akışına yazar. |
| [WriteLine](./writeline/)(float) override | Tek duyarlıklı kayan nokta değerinin dize temsilini, mevcut satır sonlandırıcısını takiben, geçerli nesne tarafından temsil edilen çıktı akışına yazar. |
| [WriteLine](./writeline/)(const String\&) override | Belirtilen dize nesnesini, mevcut satır sonlandırıcısını takiben, geçerli nesne tarafından temsil edilen çıktı akışına yazar. |
| [WriteLine](./writeline/)(uint32_t) override | İşaretsiz 32-bit tam sayı değerinin dize temsilini, mevcut satır sonlandırıcısını takiben, geçerli nesne tarafından temsil edilen çıktı akışına yazar. |
| [WriteLine](./writeline/)(uint64_t) override | İşaretsiz 64-bit tam sayı değerinin dize temsilini, mevcut satır sonlandırıcısını takiben, geçerli nesne tarafından temsil edilen çıktı akışına yazar. |
| [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) override | Belirtilen karakter dizisinin dize temsilini, mevcut satır sonlandırıcısını takiben, geçerli nesne tarafından temsil edilen çıktı akışına yazar. |
| [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | Belirtilen karakter dizisinin bir değer aralığının dize temsilini, mevcut satır sonlandırıcısını takiben, geçerli nesne tarafından temsil edilen çıktı akışına yazar. |
| [WriteLine](./writeline/)(const char_t *) override | Belirtilen C-dizesini, mevcut satır sonlandırıcısını takiben, geçerli nesne tarafından temsil edilen çıktı akışına yazar. |
| [WriteLine](./writeline/)(const TypeInfo\&) override | Belirtilen [TypeInfo](../typeinfo/) nesnesinin dize temsilini, mevcut satır sonlandırıcısını takiben, geçerli nesne tarafından temsil edilen çıktı akışına yazar. |
| [WriteLine](./writeline/)(const char *) |  |
## Ayrıca Bakınız

* Class [TextWriter](../../system.io/textwriter/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
