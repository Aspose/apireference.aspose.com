---
title: "System::Decimal Klasse"
linktitle: "Decimal"
second_title: "Aspose.Font für C++"
description: "System::Decimal Klasse. Stellt eine Dezimalzahl dar. Dieser Typ sollte auf dem Stack alloziert und an Funktionen per Wert oder Referenz übergeben werden. Verwenden Sie niemals die System::SmartPtr Klasse, um Objekte dieses Typs in C++ zu verwalten."
type: docs
weight: 1900
url: /de/cpp/system/decimal/
---
## Decimal class


Stellt eine Dezimalzahl dar. Dieser Typ sollte auf dem Stack alloziert und an Funktionen per Wert oder Referenz übergeben werden. Verwenden Sie niemals die [System::SmartPtr](../smartptr/) Klasse, um Objekte dieses Typs zu verwalten.

```cpp
class Decimal
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [Add](./add/)(const Decimal\&, const Decimal\&) | Addiert zwei angegebene [Decimal](./) Werte. |
| static [Ceiling](./ceiling/)(const Decimal\&) | Gibt den kleinsten ganzzahligen Wert zurück, der größer oder gleich dem angegebenen Wert ist. |
| static [Compare](./compare/)(const Decimal\&, const Decimal\&) | Bestimmt, ob der von dem ersten [Decimal](./) Objekt dargestellte Wert kleiner, gleich oder größer ist als der von dem zweiten [Decimal](./) Objekt dargestellte Wert. |
| [CompareTo](./compareto/)(const Decimal\&) const | Bestimmt, ob der von dem aktuellen Objekt dargestellte Wert kleiner, gleich oder größer ist als der von dem angegebenen Objekt dargestellte Wert. |
| [Decimal](./decimal/)() | Konstruiert eine Instanz, die 0 darstellt. |
| [Decimal](./decimal/)(std::int8_t) | Konstruiert eine Instanz, die den angegebenen Wert darstellt. |
| [Decimal](./decimal/)(std::int16_t) | Konstruiert eine Instanz, die den angegebenen Wert darstellt. |
| [Decimal](./decimal/)(std::int32_t) | Konstruiert eine Instanz, die den angegebenen Wert darstellt. |
| [Decimal](./decimal/)(std::int64_t) | Konstruiert eine Instanz, die den angegebenen Wert darstellt. |
| [Decimal](./decimal/)(std::uint8_t) | Konstruiert eine Instanz, die den angegebenen Wert darstellt. |
| [Decimal](./decimal/)(std::uint16_t) | Konstruiert eine Instanz, die den angegebenen Wert darstellt. |
| [Decimal](./decimal/)(std::uint32_t) | Konstruiert eine Instanz, die den angegebenen Wert darstellt. |
| [Decimal](./decimal/)(std::uint64_t) | Konstruiert eine Instanz, die den angegebenen Wert darstellt. |
| [Decimal](./decimal/)(float) | Konstruiert eine Instanz, die den angegebenen Wert darstellt. |
| [Decimal](./decimal/)(double) | Konstruiert eine Instanz, die den angegebenen Wert darstellt. |
| explicit [Decimal](./decimal/)(const std::string\&) | Konstruiert eine Instanz, die einen Wert darstellt, dessen Zeichenkettenrepräsentation als Instanz der std::string Klasse angegeben ist. |
| [Decimal](./decimal/)(int32_t, int32_t, int32_t, bool, uint8_t) | Konstruiert ein [Decimal](./) Objekt aus den angegebenen Komponenten. |
| [Decimal](./decimal/)(const Decimal\&) | Konstruiert eine Instanz der [Decimal](./) Klasse, die dieselbe Zahl wie das angegebene [Decimal](./) Objekt darstellt. |
| [Decimal](./decimal/)(const ArrayPtr\<int32_t\>\&) | Konstruiert eine Instanz der [Decimal](./) Klasse aus einem Integer-Array, das eine Binärdarstellung enthält. |
| [Decimal](./decimal/)(std::nullptr_t) | Wirft stets ArgumentNullException. |
| [Decimal](./decimal/)(const number_type\&) | Konstruiert eine Instanz der [Decimal](./) Klasse, die den angegebenen Wert darstellt. |
| static [Divide](./divide/)(const Decimal\&, const Decimal\&) | Dividiert zwei angegebene [Decimal](./) Werte. |
| [Equals](./equals/)(const Decimal\&) const | Bestimmt, ob die vom aktuellen Objekt und dem angegebenen Objekt dargestellten Werte gleich sind. |
| [Equals](./equals/)(const SharedPtr\<Object\>\&) const | Bestimmt, ob die vom aktuellen Objekt und dem angegebenen Objekt dargestellten Werte gleich sind. |
| static [Equals](./equals/)(const Decimal\&, const Decimal\&) | Bestimmt, ob die von den angegebenen Objekten dargestellten Werte gleich sind. |
| static [Floor](./floor/)(const Decimal\&) | Gibt den größten ganzzahligen Wert zurück, der kleiner oder gleich dem angegebenen Wert ist. |
| static [FromOACurrency](./fromoacurrency/)(int64_t) | [Convert](../convert/) den angegebenen OLE-Währungswert in den entsprechenden [Decimal](./)-Wert. NICHT IMPLEMENTIERT. |
| static [GetBits](./getbits/)(const Decimal\&) | Konvertiert das angegebene [Decimal](./)-Objekt in die binäre Darstellung des von ihm repräsentierten Wertes. |
| static [GetBytes](./getbytes/)(const Decimal\&, const System::ArrayPtr\<uint8_t\>\&) | [Convert](../convert/) den angegebenen [Decimal](./)-Wert in ein Byte-Array. |
| [GetHashCode](./gethashcode/)() const | Gibt einen Hashcode für das aktuelle Objekt zurück. |
| [GetTypeCode](./gettypecode/)() const | Ermittelt den Objekttypcode. |
| static [Multiply](./multiply/)(const Decimal\&, const Decimal\&) | Multipliziert zwei angegebene [Decimal](./)-Werte. |
| static [Negate](./negate/)(const Decimal\&) | Gibt eine neue Instanz der [Decimal](./)-Klasse zurück, die einen Wert darstellt, der sich aus der Negation des von dem angegebenen Objekt dargestellten Wertes ergibt. |
| explicit [operator bool](./operatorbool/)() const | Konvertiert den vom aktuellen Objekt dargestellten Wert in einen booleschen Wert. |
| explicit [operator double](./operatordouble/)() const | Konvertiert den vom aktuellen Objekt dargestellten Wert in einen double‑Präzisions‑Gleitkommawert. |
| explicit [operator float](./operatorfloat/)() const | Konvertiert den vom aktuellen Objekt dargestellten Wert in einen single‑Präzisions‑Gleitkommawert. |
| [operator!=](./operator!=/)(const Decimal\&) const | Bestimmt, ob die vom aktuellen Objekt und dem angegebenen Objekt dargestellten Werte nicht gleich sind. |
| [operator!=](./operator!=/)(std::nullptr_t) const | Bestimmt, ob der vom aktuellen Objekt dargestellte Wert von 0 verschieden ist. |
| [operator%](./operator%/)(const Decimal\&) const | Gibt eine neue Instanz der [Decimal](./)-Klasse zurück, die einen Wert darstellt, der das Ergebnis einer Modulo‑Operation mit den vom aktuellen und dem angegebenen Objekt dargestellten Werten ist. |
| [operator%=](./operator%=/)(const Decimal\&) | Weist dem aktuellen Objekt einen neuen Wert zu, der das Ergebnis einer Modulo‑Operation mit den vom aktuellen und dem angegebenen Objekt dargestellten Werten ist. |
| [operator*](./operator_/)(const Decimal\&) const | Gibt eine neue Instanz der [Decimal](./)-Klasse zurück, die einen Wert darstellt, der das Ergebnis der Multiplikation der vom aktuellen und dem angegebenen Objekt dargestellten Werte ist. |
| [operator*=](./operator_=/)(const Decimal\&) | Weist dem aktuellen Objekt einen neuen Wert zu, der das Ergebnis der Multiplikation der vom aktuellen und dem angegebenen Objekt dargestellten Werte ist. |
| [operator+](./operator+/)(const Decimal\&) const | Gibt eine neue Instanz der [Decimal](./)-Klasse zurück, die einen Wert darstellt, der die Summe der vom aktuellen und dem angegebenen Objekt dargestellten Werte ist. |
| [operator++](./operator++/)() | Erhöht den vom aktuellen Objekt dargestellten Wert. |
| [operator+=](./operator+=/)(const Decimal\&) | Weist dem aktuellen Objekt einen neuen Wert zu, der die Summe der vom aktuellen und dem angegebenen Objekt dargestellten Werte ist. |
| [operator-](./operator-/)(const Decimal\&) const | Gibt eine neue Instanz der [Decimal](./)-Klasse zurück, die einen Wert darstellt, der das Ergebnis der Subtraktion des vom angegebenen Objekt dargestellten Wertes vom vom aktuellen Objekt dargestellten Wert ist. |
| [operator-](./operator-/)() const | Gibt eine neue Instanz der [Decimal](./)-Klasse zurück, die einen Wert darstellt, der sich aus der Negation des vom aktuellen Objekt dargestellten Wertes ergibt. |
| [operator--](./operator--/)() | Verringert den vom aktuellen Objekt dargestellten Wert. |
| [operator-=](./operator-=/)(const Decimal\&) | Weist dem aktuellen Objekt einen neuen Wert zu, der das Ergebnis der Subtraktion des vom angegebenen Objekt dargestellten Wertes vom vom aktuellen Objekt dargestellten Wert ist. |
| [operator/](./operator//)(const Decimal\&) const | Gibt eine neue Instanz der Klasse [Decimal](./) zurück, die einen Wert darstellt, der das Ergebnis der Division des vom aktuellen Objekt dargestellten Werts durch den vom angegebenen Objekt dargestellten Wert ist. |
| [operator/=](./operator/=/)(const Decimal\&) | Weist dem aktuellen Objekt einen neuen Wert zu, der das Ergebnis der Division des vom aktuellen Objekt dargestellten Werts durch den vom angegebenen Objekt dargestellten Wert ist. |
| [operator<](./operator_/)(const Decimal\&) const | Ermittelt, ob der vom aktuellen Objekt dargestellte Wert kleiner ist als der vom angegebenen Objekt dargestellte Wert. |
| [operator<=](./operator_=/)(const Decimal\&) const | Ermittelt, ob der vom aktuellen Objekt dargestellte Wert kleiner oder gleich dem vom angegebenen Objekt dargestellten Wert ist. |
| [operator=](./operator=/)(const Decimal\&) | Weist dem aktuellen Objekt den vom angegebenen Objekt dargestellten Wert zu. |
| [operator==](./operator==/)(const Decimal\&) const | Bestimmt, ob die vom aktuellen Objekt und dem angegebenen Objekt dargestellten Werte gleich sind. |
| [operator==](./operator==/)(std::nullptr_t) const | Ermittelt, ob der vom aktuellen Objekt dargestellte Wert 0 ist. |
| [operator>](./operator_/)(const Decimal\&) const | Ermittelt, ob der vom aktuellen Objekt dargestellte Wert größer ist als der vom angegebenen Objekt dargestellte Wert. |
| [operator>=](./operator_=/)(const Decimal\&) const | Ermittelt, ob der vom aktuellen Objekt dargestellte Wert größer oder gleich dem vom angegebenen Objekt dargestellten Wert ist. |
| static [Parse](./parse/)(const String\&) | Konvertiert die Zeichenkettenrepräsentation einer Dezimalzahl in eine äquivalente Instanz der Klasse [Decimal](./). |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles) | Konvertiert die Zeichenkettenrepräsentation einer Dezimalzahl in eine äquivalente Instanz der Klasse [Decimal](./) unter Verwendung des angegebenen Stils. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&) | Konvertiert die Zeichenkettenrepräsentation einer Dezimalzahl in eine äquivalente Instanz der Klasse [Decimal](./) unter Verwendung des angegebenen Formatproviders. |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&) | Konvertiert die Zeichenkettenrepräsentation einer Dezimalzahl in eine äquivalente Instanz der Klasse [Decimal](./) unter Verwendung des angegebenen Stils und Formatproviders. |
| static [Remainder](./remainder/)(const Decimal\&, const Decimal\&) | Berechnet den Rest nach der Division zweier [Decimal](./)-Werte. |
| static [Round](./round/)(const Decimal\&, MidpointRounding) | Rundet den angegebenen Wert auf die nächste ganze Zahl. Ein Parameter legt das Verhalten der Funktion fest, wenn der angegebene Wert gleich weit von zwei nächsten Zahlen entfernt ist. |
| static [Round](./round/)(const Decimal\&, int, MidpointRounding) | Rundet den angegebenen Wert auf den nächsten Wert mit der angegebenen Anzahl von Nachkommastellen. Ein Parameter legt das Verhalten der Funktion fest, wenn der angegebene Wert gleich weit von zwei nächsten Zahlen entfernt ist. |
| static [Subtract](./subtract/)(const Decimal\&, const Decimal\&) | Subtrahiert einen angegebenen [Decimal](./)-Wert von einem anderen. |
| static [ToByte](./tobyte/)(Decimal) | Konvertiert den [Decimal](./)-Wert in einen vorzeichenlosen 8‑Bit‑Ganzzahlwert. |
| static [ToDouble](./todouble/)(Decimal) | Konvertiert den [Decimal](./)-Wert in eine Gleitkommazahl mit doppelter Genauigkeit. |
| static [ToInt16](./toint16/)(Decimal) | Konvertiert den [Decimal](./)-Wert in einen vorzeichenbehafteten 16‑Bit‑Ganzzahlwert. |
| static [ToInt32](./toint32/)(Decimal) | Konvertiert den [Decimal](./)-Wert in einen vorzeichenbehafteten 32‑Bit‑Ganzzahlwert. |
| static [ToInt64](./toint64/)(Decimal) | Konvertiert den [Decimal](./)-Wert in einen vorzeichenbehafteten 64‑Bit‑Ganzzahlwert. |
| static [ToOACurrency](./tooacurrency/)(const Decimal\&) | [Convert](../convert/) den angegebenen [Decimal](./)-Wert in den äquivalenten OLE‑Währungswert. NICHT IMPLEMENTIERT. |
| static [ToSByte](./tosbyte/)(Decimal) | Konvertiert den [Decimal](./)-Wert in einen vorzeichenbehafteten 8‑Bit‑Ganzzahlwert. |
| static [ToSingle](./tosingle/)(Decimal) | Konvertiert den [Decimal](./)-Wert in eine Gleitkommazahl mit einfacher Genauigkeit. |
| [ToStdString](./tostdstring/)() const | Gibt eine Instanz von std::string zurück, die die Zeichenkettenrepräsentation des vom Objekt dargestellten Werts enthält. |
| [ToString](./tostring/)() const | Gibt die Zeichenkettenrepräsentation des vom Objekt dargestellten Werts zurück. |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | Konvertiert das aktuelle Objekt mithilfe der kulturspezifischen Formatinformationen in eine Zeichenkette. |
| [ToString](./tostring/)(const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const SharedPtr\<Globalization::NumberFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const Decimal\&, std::nullptr_t) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | Konvertiert das aktuelle Objekt in seine Zeichenkettenrepräsentation unter Verwendung des angegebenen Zeichenkettenformats und der kulturspezifischen Formatinformationen, die vom angegebenen [IFormatProvider](../iformatprovider/)‑Objekt bereitgestellt werden. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::NumberFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, std::nullptr_t) const |  |
| [ToStringInternal](./tostringinternal/)() const | Gibt die Zeichenkettenrepräsentation des vom Objekt dargestellten Werts zurück. Für den internen Gebrauch. |
| static [ToUInt16](./touint16/)(Decimal) | Konvertiert den [Decimal](./)-Wert in einen vorzeichenlosen 16‑Bit‑Ganzzahlwert. |
| static [ToUInt32](./touint32/)(Decimal) | Konvertiert den [Decimal](./)-Wert in einen vorzeichenlosen 32‑Bit‑Ganzzahlwert. |
| static [ToUInt64](./touint64/)(Decimal) | Konvertiert den [Decimal](./)-Wert in einen vorzeichenlosen 64‑Bit‑Ganzzahlwert. |
| static [Truncate](./truncate/)(const Decimal\&) | Gibt das [Decimal](./)-Objekt zurück, das einen Wert darstellt, dessen ganzzahliger Teil dem des von dem angegebenen [Decimal](./)-Objekt dargestellten Werts entspricht, wobei alle Nachkommastellen verworfen wurden. |
| static [TryParse](./tryparse/)(const String\&, Decimal\&) | Konvertiert die angegebene Zeichenkette, die die Zeichenkettenrepräsentation einer Zahl enthält, in den entsprechenden [Decimal](./)-Wert. |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, Decimal\&) | Konvertiert die angegebene Zeichenkette, die die Zeichenkettenrepräsentation einer Zahl enthält, in den entsprechenden [Decimal](./)-Wert unter Verwendung der bereitgestellten Formatinformationen und des Zahlenstils. |
| static [Type](./type/)() | Gibt eine Referenz auf das [TypeInfo](../typeinfo/)-Objekt zurück, das die Typinformationen der [Decimal](./)-Klasse repräsentiert. |
| [~Decimal](./~decimal/)() | Destruktor. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [MaxValue](./maxvalue/) | Stellt die größte Zahl dar, die von der [Decimal](./)-Klasse dargestellt werden kann. |
| static [MinusOne](./minusone/) | Stellt die Zahl -1 dar. |
| static [MinValue](./minvalue/) | Stellt die kleinste Zahl dar, die von der [Decimal](./)-Klasse dargestellt werden kann. |
| static [One](./one/) | Stellt die Zahl 1 dar. |
| static [Zero](./zero/) | Stellt die Zahl 0 dar. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [number_type](./number_type/) | Ein Alias für Detail::decimal_number_type. |
## Hinweise



```cpp
#include "system/console.h"
#include "system/decimal.h"

int main()
{
  using namespace System;

  Console::WriteLine(Decimal::MinValue);
  Console::WriteLine(Decimal::MaxValue);

  auto dividend = Decimal::One;
  auto divisor = 6;
  Console::WriteLine(dividend/divisor);

  return 0;
}
/*
This code example produces the following output:
-79228162514264337593543950335
79228162514264337593543950335
0,1666666666666666666666666667
*/
```

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
