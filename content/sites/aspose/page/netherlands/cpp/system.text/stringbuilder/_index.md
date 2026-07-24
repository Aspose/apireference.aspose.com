---
title: "System::Text::StringBuilder klasse"
linktitle: "StringBuilder"
second_title: "Aspose.Page voor C++"
description: "System::Text::StringBuilder klasse. Buffer om tekenreeks deel voor deel op te bouwen. Dit type kan worden toegewezen op de stack als waardetype of op de heap met de functie System::MakeObject(). Zodra het object is toegewezen, mag je deze twee gebruikssituaties nooit combineren: het hebben van SmartPtr pointers naar op de stack toegewezen objecten is strikt verboden in C++."
type: docs
weight: 2400
url: /nl/cpp/system.text/stringbuilder/
---
## StringBuilder class


[Buffer](../../system/buffer/) to accumulate string part by part. This type can be allocated either in stack as value type or in heap using [System::MakeObject()](../../system/makeobject/) function. Once the object is allocated, never mix up these two usecases: having [SmartPtr](../../system/smartptr/) pointers onto stack-allocated objects is strictly prohibited.

```cpp
class StringBuilder : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Append](./append/)(char_t) | Voegt een teken toe aan de builder. |
| [Append](./append/)(char_t, int) | Voegt tekens toe aan de builder. |
| [Append](./append/)(const ArrayPtr\<char_t\>\&) | Voegt tekenarray toe aan de builder. |
| [Append](./append/)(const ArrayPtr\<char_t\>\&, int, int) | Voegt een deel van een tekenarray toe aan de builder. |
| [Append](./append/)(const String\&) | Voegt een tekenreeks toe aan de builder. |
| [Append](./append/)(const String\&, int, int) | Voegt een deel van een tekenreeks toe aan de builder. |
| [Append](./append/)(const SharedPtr\<T\>\&) | Voegt de tekenreeksrepresentatie van het object toe aan de builder. |
| [Append](./append/)(const SharedPtr\<StringBuilder\>\&) | Voegt de inhoud van de builder toe aan de builder. |
| [Append](./append/)(float) | Voegt een zwevendekommagetal toe aan de builder. |
| [Append](./append/)(double) | Voegt een zwevendekommagetal toe aan de builder. |
| [Append](./append/)(int) | Voegt een geheel getal toe aan de builder. |
| [Append](./append/)(T) | Voegt een rekenkundige waarde toe aan de builder. |
| [Append](./append/)(E) | Voegt de tekenreeksrepresentatie van een enum‑waarde toe aan de builder. |
| [AppendFormat](./appendformat/)(const String\&, const TArgs\&...) | Voegt een geformatteerde tekenreeks toe aan de builder. |
| [AppendFormat](./appendformat/)(const SharedPtr\<IFormatProvider\>\&, const String\&, const TArgs\&...) | Voegt een geformatteerde tekenreeks toe aan de builder. |
| [AppendLine](./appendline/)() | Voegt een nieuweregelteken toe aan de builder. |
| [AppendLine](./appendline/)(const String\&) | Voegt een tekenreeks gevolgd door een nieuweregelteken toe aan de builder. |
| [Clear](./clear/)() | Verwijdert alle tekens uit de builder. |
| [CopyTo](./copyto/)(int, System::ArrayPtr\<char_t\> const\&, int, int) | Kopieert de gegevens van de builder naar bestaande array‑posities. |
| [get_Capacity](./get_capacity/)() const | Haalt de huidige capaciteit van de stringbuilder op. |
| [get_Length](./get_length/)() const | Haalt de lengte van de momenteel in de builder aanwezige tekenreeks op. |
| [idx_get](./idx_get/)(int) const | Haalt het teken op op de opgegeven positie. |
| [idx_set](./idx_set/)(int, char_t) | Stelt het teken in op de opgegeven positie. |
| [Insert](./insert/)(int, const String\&) | Voegt een tekenreeks in op een vaste positie in de builder. |
| [Insert](./insert/)(int32_t, const String\&, int32_t) | Voegt herhaalde tekenreeks in op de vaste positie van de builder. |
| [Insert](./insert/)(int, char_t) | Voegt teken in op de vaste positie van de builder. |
| [Insert](./insert/)(int, const System::ArrayPtr\<char_t\>\&, int, int) | Voegt tekens in op de vaste positie van de builder. |
| [Insert](./insert/)(int, T) | Voegt waarde in op de vaste positie van de builder. |
| [operator[]](./operator[]/)(int) const | Haalt het teken op op de opgegeven positie. |
| [Remove](./remove/)(int, int) | Verwijdert fragment uit de builder. |
| [Replace](./replace/)(const String\&, const String\&) | Vervangt subreeks via de builder. |
| [Replace](./replace/)(const String\&, const String\&, int, int) | Vervangt subreeks via het bereik van de builder. |
| [Replace](./replace/)(char_t, char_t) | Vervangt teken via de builder. |
| [Replace](./replace/)(char_t, char_t, int, int) | Vervangt teken via het bereik van de builder. |
| [set_Capacity](./set_capacity/)(int) | Stelt de huidige capaciteit van de stringbuilder in. |
| [set_Length](./set_length/)(int) | Kort af of breidt de stringbuilder uit tot de opgegeven lengte. |
| [StringBuilder](./stringbuilder/)() | Constructor. |
| [StringBuilder](./stringbuilder/)(int) | Constructor. |
| [StringBuilder](./stringbuilder/)(const String\&) | Constructor. |
| [StringBuilder](./stringbuilder/)(const String\&, int) | Constructor. |
| [StringBuilder](./stringbuilder/)(const String\&, int, int, int) | Constructor. |
| [ToString](./tostring/)() const override | Haalt de momenteel in de builder aanwezige tekenreeks op. |
| [ToString](./tostring/)(int, int) const | Haalt de momenteel in de builder aanwezige subreeks op. |
| [~StringBuilder](./~stringbuilder/)() | Destructor. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
