---
title: "System::Text::StringBuilder klass"
linktitle: "StringBuilder"
second_title: "Aspose.Page för C++"
description: "System::Text::StringBuilder klass. Buffer för att samla sträng del för del. Denna typ kan allokeras antingen på stacken som värdetyp eller på heapen med hjälp av System::MakeObject()-funktionen. När objektet är allokerat, blanda aldrig ihop dessa två användningsfall: att ha SmartPtr-pekare till stackallokerade objekt är strikt förbjudet i C++."
type: docs
weight: 2400
url: /sv/cpp/system.text/stringbuilder/
---
## StringBuilder class


[Buffer](../../system/buffer/) to accumulate string part by part. This type can be allocated either in stack as value type or in heap using [System::MakeObject()](../../system/makeobject/) function. Once the object is allocated, never mix up these two usecases: having [SmartPtr](../../system/smartptr/) pointers onto stack-allocated objects is strictly prohibited.

```cpp
class StringBuilder : public System::Object
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Append](./append/)(char_t) | Lägger till tecken i byggaren. |
| [Append](./append/)(char_t, int) | Lägger till tecken i byggaren. |
| [Append](./append/)(const ArrayPtr\<char_t\>\&) | Lägger till teckenarray i byggaren. |
| [Append](./append/)(const ArrayPtr\<char_t\>\&, int, int) | Lägger till del av teckenarray i byggaren. |
| [Append](./append/)(const String\&) | Lägger till sträng i byggaren. |
| [Append](./append/)(const String\&, int, int) | Lägger till del av sträng i byggaren. |
| [Append](./append/)(const SharedPtr\<T\>\&) | Lägger till objektets strängrepresentation i byggaren. |
| [Append](./append/)(const SharedPtr\<StringBuilder\>\&) | Lägger till byggarens innehåll i byggaren. |
| [Append](./append/)(float) | Lägger till flyttal i byggaren. |
| [Append](./append/)(double) | Lägger till flyttal i byggaren. |
| [Append](./append/)(int) | Lägger till heltal i byggaren. |
| [Append](./append/)(T) | Lägger till aritmetiskt värde i byggaren. |
| [Append](./append/)(E) | Lägger till enumvärdets strängrepresentation till byggaren. |
| [AppendFormat](./appendformat/)(const String\&, const TArgs\&...) | Lägger till formaterad sträng till byggaren. |
| [AppendFormat](./appendformat/)(const SharedPtr\<IFormatProvider\>\&, const String\&, const TArgs\&...) | Lägger till formaterad sträng till byggaren. |
| [AppendLine](./appendline/)() | Lägger till radbrytningstecken till byggaren. |
| [AppendLine](./appendline/)(const String\&) | Lägger till sträng följt av radbrytningstecken till byggaren. |
| [Clear](./clear/)() | Tar bort alla tecken från byggaren. |
| [CopyTo](./copyto/)(int, System::ArrayPtr\<char_t\> const\&, int, int) | Kopierar byggarens data till befintliga arraypositioner. |
| [get_Capacity](./get_capacity/)() const | Hämtar aktuell kapacitet för strängbyggaren. |
| [get_Length](./get_length/)() const | Hämtar längden på strängen som för närvarande finns i byggaren. |
| [idx_get](./idx_get/)(int) const | Hämtar tecken på angiven position. |
| [idx_set](./idx_set/)(int, char_t) | Sätter tecken på angiven position. |
| [Insert](./insert/)(int, const String\&) | Infogar sträng i byggarens fasta position. |
| [Insert](./insert/)(int32_t, const String\&, int32_t) | Infogar upprepad sträng i byggarens fasta position. |
| [Insert](./insert/)(int, char_t) | Infogar tecken i byggarens fasta position. |
| [Insert](./insert/)(int, const System::ArrayPtr\<char_t\>\&, int, int) | Infogar tecken i byggarens fasta position. |
| [Insert](./insert/)(int, T) | Infogar värde i byggarens fasta position. |
| [operator[]](./operator[]/)(int) const | Hämtar tecken på angiven position. |
| [Remove](./remove/)(int, int) | Tar bort fragment från byggaren. |
| [Replace](./replace/)(const String\&, const String\&) | Ersätter delsträng genom byggaren. |
| [Replace](./replace/)(const String\&, const String\&, int, int) | Ersätter delsträng genom byggarens intervall. |
| [Replace](./replace/)(char_t, char_t) | Ersätter tecken genom byggaren. |
| [Replace](./replace/)(char_t, char_t, int, int) | Ersätter tecken genom byggarens intervall. |
| [set_Capacity](./set_capacity/)(int) | Ställer in aktuell kapacitet för strängbyggaren. |
| [set_Length](./set_length/)(int) | Avkortar eller utökar strängbyggaren till angiven längd. |
| [StringBuilder](./stringbuilder/)() | Konstruktor. |
| [StringBuilder](./stringbuilder/)(int) | Konstruktor. |
| [StringBuilder](./stringbuilder/)(const String\&) | Konstruktor. |
| [StringBuilder](./stringbuilder/)(const String\&, int) | Konstruktor. |
| [StringBuilder](./stringbuilder/)(const String\&, int, int, int) | Konstruktor. |
| [ToString](./tostring/)() const override | Hämtar strängen som för närvarande finns i byggaren. |
| [ToString](./tostring/)(int, int) const | Hämtar delsträngen som för närvarande finns i byggaren. |
| [~StringBuilder](./~stringbuilder/)() | Destruktor. |
## Se även

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
