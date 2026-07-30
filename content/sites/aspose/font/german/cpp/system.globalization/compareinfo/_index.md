---
title: "System::Globalization::CompareInfo Klasse"
linktitle: "CompareInfo"
second_title: "Aspose.Font für C++"
description: "System::Globalization::CompareInfo Klasse. Führt kultursensible Zeichenkettenvergleiche durch. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 400
url: /de/cpp/system.globalization/compareinfo/
---
## CompareInfo class


Führt kultursensible Zeichenkettenvergleiche durch. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class CompareInfo : public virtual System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [Compare](./compare/)(const String\&, const String\&) const | Vergleicht Zeichenketten. Nicht implementiert. |
| virtual [Compare](./compare/)(const String\&, const String\&, CompareOptions) const | Vergleicht Zeichenketten. Nur die Modi Ordinal und OrdinalIgnoreCase werden unterstützt. |
| virtual [Compare](./compare/)(const String\&, int, int, const String\&, int, int) const | Vergleicht einen Abschnitt einer Zeichenkette mit einem Abschnitt einer zweiten Zeichenkette. Nicht implementiert. |
| virtual [Compare](./compare/)(const String\&, int, const String\&, int, CompareOptions) const | Vergleicht das Endsegment einer Zeichenkette mit dem Endsegment einer zweiten Zeichenkette mittels Zeichenkettenvergleichsmethoden. Nicht implementiert. |
| virtual [Compare](./compare/)(const String\&, int, const String\&, int) const | Vergleicht das Endsegment einer Zeichenkette mit dem Endsegment einer zweiten Zeichenkette. Nicht implementiert. |
| virtual [Compare](./compare/)(const String\&, int, int, const String\&, int, int, CompareOptions) const | Vergleicht einen Abschnitt einer Zeichenkette mit einem Abschnitt einer zweiten Zeichenkette mittels Zeichenkettenvergleichsmethoden. Nicht implementiert. |
| [CompareInfo](./compareinfo/)(const CompareInfo\&) | RTTI-Informationen. |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [get_LCID](./get_lcid/)() const | Liefert die LCID der Kultur, die mit dem Vergleichsobjekt verknüpft ist. |
| virtual [get_Name](./get_name/)() const | Liefert den Namen der Kultur, die mit dem Vergleichsobjekt verknüpft ist. |
| [get_Version](./get_version/)() const | Liefert Informationen zur Sortierversion. |
| static [GetCompareInfo](./getcompareinfo/)(int, const SharedPtr\<Reflection::Assembly\>\&) | Liefert das [CompareInfo](./), das mit der angegebenen Kultur verknüpft ist und Zeichenkettenvergleichsmethoden in der angegebenen Assembly verwendet. |
| static [GetCompareInfo](./getcompareinfo/)(const String\&, const SharedPtr\<Reflection::Assembly\>\&) | Liefert das [CompareInfo](./), das mit der angegebenen Kultur verknüpft ist und Zeichenkettenvergleichsmethoden in der angegebenen Assembly verwendet. |
| static [GetCompareInfo](./getcompareinfo/)(int) | Liefert das [CompareInfo](./), das mit der angegebenen Kultur verknüpft ist. |
| static [GetCompareInfo](./getcompareinfo/)(const String\&) | Liefert das [CompareInfo](./), das mit der angegebenen Kultur verknüpft ist. |
| virtual [GetHashCode](./gethashcode/)(const String\&, CompareOptions) const | Liefert den Hashcode der Zeichenkette basierend auf den angegebenen Vergleichsoptionen. |
| [GetHashCode](./gethashcode/)() const override | Analog zur C#-Methode [Object.GetHashCode()](../../system/object/gethashcode/). Ermöglicht das Hashen benutzerdefinierter Objekte. |
| virtual [GetSortKey](./getsortkey/)(const String\&, CompareOptions) const | Liefert das [SortKey](../sortkey/)-Objekt für die angegebene Zeichenkette unter Verwendung der angegebenen Vergleichsoptionen. |
| virtual [GetSortKey](./getsortkey/)(const String\&) const | Liefert das [SortKey](../sortkey/)-Objekt für die angegebene Zeichenkette. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int, int) const | Sucht nach Teilzeichenfolge. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int, CompareOptions) const | Sucht nach Teilzeichenfolge. Nur der Ordinalmodus wird unterstützt. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int, int, CompareOptions) const | Sucht nach Teilzeichenfolge. Nur der Ordinalmodus wird unterstützt. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int, int, CompareOptions) const | Sucht nach dem angegebenen Zeichen. Nur der Ordinalmodus wird unterstützt. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int) const | Sucht nach Teilzeichenfolge. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t) const | Sucht nach dem angegebenen Zeichen. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&) const | Sucht nach Teilzeichenfolge. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int, CompareOptions) const | Sucht nach dem angegebenen Zeichen. Nur der Ordinalmodus wird unterstützt. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int, int) const | Sucht nach dem angegebenen Zeichen. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int) const | Sucht nach dem angegebenen Zeichen. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, CompareOptions) const | Sucht nach Teilzeichenfolge. Nur der Ordinalmodus wird unterstützt. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, CompareOptions) const | Sucht nach dem angegebenen Zeichen. Nur der Ordinalmodus wird unterstützt. |
| virtual [IsPrefix](./isprefix/)(const String\&, const String\&, CompareOptions) const | Prüft, ob die angegebene Zeichenkette mit dem angegebenen Präfix beginnt, unter Verwendung der angegebenen Vergleichsoptionen. |
| virtual [IsPrefix](./isprefix/)(const String\&, const String\&) const | Prüft, ob die angegebene Zeichenkette mit dem angegebenen Präfix beginnt. |
| static [IsSortable](./issortable/)(char16_t) | Prüft, ob ein angegebenes Zeichen sortierbar ist. |
| static [IsSortable](./issortable/)(const String\&) | Prüft, ob eine angegebene Zeichenkette sortierbar ist. |
| virtual [IsSuffix](./issuffix/)(const String\&, const String\&, CompareOptions) const | Prüft, ob die angegebene Zeichenkette mit dem angegebenen Suffix endet, unter Verwendung der angegebenen Vergleichsoptionen. |
| virtual [IsSuffix](./issuffix/)(const String\&, const String\&) const | Prüft, ob die angegebene Zeichenkette mit dem angegebenen Suffix endet. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&) const | Sucht das letzte Vorkommen der angegebenen Teilzeichenfolge. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int, int, CompareOptions) const | Sucht das letzte Vorkommen der angegebenen Teilzeichenfolge unter Verwendung der angegebenen Vergleichsoptionen. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int, int, CompareOptions) const | Sucht das letzte Vorkommen des angegebenen Zeichens unter Verwendung der angegebenen Vergleichsoptionen. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int, int) const | Sucht das letzte Vorkommen der angegebenen Zeichenkette. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int, CompareOptions) const | Sucht das letzte Vorkommen der angegebenen Zeichenkette unter Verwendung der angegebenen Vergleichsoptionen. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int, CompareOptions) const | Sucht das letzte Vorkommen des angegebenen Zeichens unter Verwendung der angegebenen Vergleichsoptionen. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int) const | Sucht das letzte Vorkommen der angegebenen Zeichenkette. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int) const | Sucht das letzte Vorkommen des angegebenen Zeichens. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, CompareOptions) const | Sucht das letzte Vorkommen der angegebenen Zeichenkette unter Verwendung der angegebenen Vergleichsoptionen. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, CompareOptions) const | Sucht das letzte Vorkommen des angegebenen Zeichens unter Verwendung der angegebenen Vergleichsoptionen. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t) const | Sucht das letzte Vorkommen des angegebenen Zeichens. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int, int) const | Sucht das letzte Vorkommen des angegebenen Zeichens. |
| [operator=](./operator=/)(const CompareInfo\&) |  |
| [ToString](./tostring/)() const override | Analog zur C#-Methode [Object.ToString()](../../system/object/tostring/). Ermöglicht die Umwandlung benutzerdefinierter Objekte in einen String. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
