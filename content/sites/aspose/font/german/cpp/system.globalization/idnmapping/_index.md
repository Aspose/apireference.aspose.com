---
title: "System::Globalization::IdnMapping class"
linktitle: "IdnMapping"
second_title: "Aspose.Font für C++"
description: "System::Globalization::IdnMapping class. IdnMapping wird verwendet, um Namen in Punycode zu konvertieren. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Umwickeln Sie diese Klasse stets mit einem System::SmartPtr-Zeiger und verwenden Sie diesen Zeiger, um ihn in C++ als Argument an Funktionen zu übergeben."
type: docs
weight: 1300
url: /de/cpp/system.globalization/idnmapping/
---
## IdnMapping class


[IdnMapping](./) used to map names to Punycode. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class IdnMapping : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Vergleicht zwei [IdnMapping](./)-Objekte. |
| [get_AllowUnassigned](./get_allowunassigned/)() const | Liefert das Flag, das angibt, ob nicht zugewiesene Codepunkte in Vorgängen verwendet werden. |
| [get_UseStd3AsciiRules](./get_usestd3asciirules/)() const | Liefert das Flag, das angibt, ob standardisierte Namenskonventionen in Vorgängen verwendet werden. |
| [GetAscii](./getascii/)(const String\&) const | [Convert](../../system/convert/) Unicode-Domainnamen in das entsprechende ASCII-Äquivalent. |
| [GetAscii](./getascii/)(const String\&, int) const | [Convert](../../system/convert/) Unicode-Domainnamen in das entsprechende ASCII-Äquivalent. |
| [GetAscii](./getascii/)(const String\&, int, int) const | [Convert](../../system/convert/) Unicode-Domainnamen in das entsprechende ASCII-Äquivalent. |
| [GetHashCode](./gethashcode/)() const override | Liefert den Hashcode für das aktuelle [IdnMapping](./)-Objekt. |
| [GetUnicode](./getunicode/)(const String\&) const | [Convert](../../system/convert/) ASCII-Domainnamen in das entsprechende Unicode-Äquivalent. |
| [GetUnicode](./getunicode/)(const String\&, int) const | [Convert](../../system/convert/) ASCII-Domainnamen in das entsprechende Unicode-Äquivalent. |
| [GetUnicode](./getunicode/)(const String\&, int, int) const | [Convert](../../system/convert/) ASCII-Domainnamen in das entsprechende Unicode-Äquivalent. |
| [IdnMapping](./idnmapping/)() | RTTI-Informationen. |
| [IdnMapping](./idnmapping/)(const IdnMapping\&) |  |
| [operator=](./operator=/)(const IdnMapping\&) |  |
| [set_AllowUnassigned](./set_allowunassigned/)(bool) | Setzt das Flag, das angibt, ob nicht zugewiesene Codepunkte in Vorgängen verwendet werden. |
| [set_UseStd3AsciiRules](./set_usestd3asciirules/)(bool) | Setzt das Flag, das angibt, ob standardisierte Namenskonventionen in Vorgängen verwendet werden. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
