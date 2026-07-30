---
title: "System::ConsoleOutput sınıfı"
linktitle: "ConsoleOutput"
second_title: "Aspose.Font için C++"
description: "System::ConsoleOutput sınıfı. Standart çıktı akışını temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak allocate (ayrılmalıdır). Bu tipin örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 1500
url: /tr/cpp/system/consoleoutput/
---
## ConsoleOutput class


Standart çıktı akışını temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../makeobject/) işlevi kullanılarak allocate (ayrılmalıdır). Bu tipin örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

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
| [Write](./write/)(Decimal) override | [Decimal](../decimal/) değerinin dize temsilini, geçerli nesne tarafından temsil edilen çıktı akışına yazar. |
| [Write](./write/)(double) override | Mevcut nesne tarafından temsil edilen çıktı akışına çift hassasiyetli kayan nokta değerinin dize temsilini gönderir. |
| [Write](./write/)(int32_t) override | Mevcut nesne tarafından temsil edilen çıktı akışına 32 bit tam sayı değerinin dize temsilini gönderir. |
| [Write](./write/)(int64_t) override | Mevcut nesne tarafından temsil edilen çıktı akışına 64 bit tam sayı değerinin dize temsilini gönderir. |
| [Write](./write/)(float) override | Mevcut nesne tarafından temsil edilen çıktı akışına tek hassasiyetli kayan nokta değerinin dize temsilini gönderir. |
| [Write](./write/)(const String\&) override | Mevcut nesne tarafından temsil edilen çıktı akışına belirtilen dize nesnesini gönderir. |
| [Write](./write/)(uint32_t) override | Mevcut nesne tarafından temsil edilen çıktı akışına işaretsiz 32 bit tam sayı değerinin dize temsilini gönderir. |
| [Write](./write/)(uint64_t) override | Mevcut nesne tarafından temsil edilen çıktı akışına işaretsiz 64 bit tam sayı değerinin dize temsilini gönderir. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&) override | Mevcut nesne tarafından temsil edilen çıktı akışına belirtilen karakter dizisinin dize temsilini gönderir. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | Mevcut nesne tarafından temsil edilen çıktı akışına belirtilen karakter dizisinin bir değer aralığının dize temsilini gönderir. |
| [Write](./write/)(const char_t *) override | Mevcut nesne tarafından temsil edilen çıktı akışına belirtilen C dizesini gönderir. |
| [Write](./write/)(const TypeInfo\&) override | Mevcut nesne tarafından temsil edilen çıktı akışına belirtilen [TypeInfo](../typeinfo/) nesnesinin dize temsilini gönderir. |
| [Write](./write/)(const char *) |  |
| [WriteLine](./writeline/)() override | Mevcut nesne tarafından temsil edilen çıktı akışına geçerli satır sonlandırıcısını gönderir. |
| [WriteLine](./writeline/)(const SharedPtr\<Object\>\&) override | Mevcut nesne tarafından temsil edilen çıktı akışına belirtilen nesnenin dize temsilini ve ardından geçerli satır sonlandırıcısını gönderir. |
| [WriteLine](./writeline/)(bool) override | Mevcut nesne tarafından temsil edilen çıktı akışına belirtilen bool değerinin dize temsilini ve ardından geçerli satır sonlandırıcısını gönderir. |
| [WriteLine](./writeline/)(char_t) override | Mevcut nesne tarafından temsil edilen çıktı akışına belirtilen karakter değerini ve ardından geçerli satır sonlandırıcısını gönderir. |
| [WriteLine](./writeline/)(Decimal) override | Mevcut nesne tarafından temsil edilen çıktı akışına [Decimal](../decimal/) değerinin dize temsilini ve ardından geçerli satır sonlandırıcısını gönderir. |
| [WriteLine](./writeline/)(double) override | Mevcut nesne tarafından temsil edilen çıktı akışına çift hassasiyetli kayan nokta değerinin dize temsilini ve ardından geçerli satır sonlandırıcısını gönderir. |
| [WriteLine](./writeline/)(int) override | Mevcut nesne tarafından temsil edilen çıktı akışına 32 bit tam sayı değerinin dize temsilini ve ardından geçerli satır sonlandırıcısını gönderir. |
| [WriteLine](./writeline/)(int64_t) override | Mevcut nesne tarafından temsil edilen çıktı akışına 64 bit tam sayı değerinin dize temsilini ve ardından geçerli satır sonlandırıcısını gönderir. |
| [WriteLine](./writeline/)(float) override | Mevcut nesne tarafından temsil edilen çıktı akışına tek hassasiyetli kayan nokta değerinin dize temsilini ve ardından geçerli satır sonlandırıcısını gönderir. |
| [WriteLine](./writeline/)(const String\&) override | Mevcut nesne tarafından temsil edilen çıktı akışına belirtilen dize nesnesini ve ardından geçerli satır sonlandırıcısını gönderir. |
| [WriteLine](./writeline/)(uint32_t) override | Mevcut nesne tarafından temsil edilen çıktı akışına işaretsiz 32 bit tam sayı değerinin dize temsilini ve ardından geçerli satır sonlandırıcısını gönderir. |
| [WriteLine](./writeline/)(uint64_t) override | Mevcut nesne tarafından temsil edilen çıktı akışına işaretsiz 64 bit tam sayı değerinin dize temsilini ve ardından geçerli satır sonlandırıcısını gönderir. |
| [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) override | Mevcut nesne tarafından temsil edilen çıktı akışına belirtilen karakter dizisinin dize temsilini ve ardından geçerli satır sonlandırıcısını gönderir. |
| [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | Mevcut nesne tarafından temsil edilen çıktı akışına belirtilen karakter dizisinin bir değer aralığının dize temsilini ve ardından geçerli satır sonlandırıcısını gönderir. |
| [WriteLine](./writeline/)(const char_t *) override | Belirtilen c-string'i geçerli satır sonlandırıcısının ardından, geçerli nesne tarafından temsil edilen çıktı akışına yazar. |
| [WriteLine](./writeline/)(const TypeInfo\&) override | Belirtilen [TypeInfo](../typeinfo/) nesnesinin dize temsilini geçerli satır sonlandırıcısının ardından, geçerli nesne tarafından temsil edilen çıktı akışına yazar. |
| [WriteLine](./writeline/)(const char *) |  |
## Ayrıca Bakınız

* Class [TextWriter](../../system.io/textwriter/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
