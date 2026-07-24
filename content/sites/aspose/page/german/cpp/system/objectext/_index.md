---
title: "Klasse System::ObjectExt"
linktitle: "ObjectExt"
second_title: "Aspose.Page für C++"
description: "Klasse System::ObjectExt. Stellt statische Methoden bereit, die C#‑Object‑Methoden nachahmen, die für Nicht‑Object‑C++‑Typen (Zeichenketten, Zahlen usw.) aufgerufen werden. Dies ist ein statischer Typ ohne Instanzdienste. Sie sollten niemals Instanzen davon auf irgendeine Weise in C++ erstellen."
type: docs
weight: 4900
url: /de/cpp/system/objectext/
---
## ObjectExt class


Stellt statische Methoden bereit, die C#‑[Object](../object/)-Methoden nachahmen, die für Nicht‑Object‑C++‑Typen (Zeichenketten, Zahlen usw.) aufgerufen werden. Dies ist ein statischer Typ ohne Instanzdienste. Sie sollten niemals Instanzen davon auf irgendeine Weise erstellen.

```cpp
class ObjectExt : public System::ObjectType
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [ArrayInitializerCast](./arrayinitializercast/)(From ...) | Konvertiert grundlegende Array‑Werte (was C# implizit erledigt, C++ jedoch anscheinend nicht tut). |
| static [Box](./box/)(const T\&) | Boxt Werttypen für die Konvertierung zu [Object](../object/). Implementierung für Aufzählungstypen. |
| static [Box](./box/)(const T\&) | Boxt Werttypen für die Konvertierung zu [Object](../object/). Implementierung für Nicht‑Aufzählungstypen. |
| static [Box](./box/)(const T\&) | Boxt [Nullable](../nullable/)-Typen für die Konvertierung zu [Object](../object/). |
| static [Box](./box/)(const String\&) | Boxt Zeichenkettenwerte. |
| static [BoxEnum](./boxenum/)(T) | Boxt Aufzählungstypen, damit sie als [Object](../object/) propagiert werden. |
| static [CastToIList](./casttoilist/)(const SmartPtr\<Object\>\&) |  |
| static [Coalesce](./coalesce/)(T0, T1) | Implementierung der Übersetzung des '??'-Operators für nicht‑nullable Typen. |
| static [Coalesce](./coalesce/)(System::Nullable\<T0\>, T1) | Implementierung der Übersetzung des '??'-Operators für nullable Typen. |
| static [CoalesceInternal](./coalesceinternal/)(RT1, F) | Implementierung der Übersetzung des '??'-Operators für nicht‑nullable Typen. Überladung für den Fall, dass RT2 in RT1 konvertierbar ist. |
| static [Equals](./equals/)(const T\&, const T2\&) |  |
| static [Equals](./equals/)(const T\&, const T2\&) | Ersatz für C#‑[Object.Equals](../object/equals/)-Aufrufe, die für jeden Typ in C++ funktionieren. Überladung für Smart‑Pointer‑Typen. |
| static [Equals](./equals/)(T, const T2\&) | Ersatz für C#‑[Object.Equals](../object/equals/)-Aufrufe, die für jeden Typ in C++ funktionieren. Überladung für Strukturtypen. |
| static [Equals](./equals/)(const T\&, const T2\&) | Ersatz für C#‑[Object.Equals](../object/equals/)-Aufrufe, die für jeden Typ in C++ funktionieren. Überladung für Skalartypen. |
| static [Equals](./equals/)(const char_t(&), String) | Ersatz für C#‑[Object.Equals](../object/equals/)-Aufrufe, die für jeden Typ in C++ funktionieren. Überladung für Zeichenkettenliterale mit Zeichenkettenvergleich. |
| static [Equals](./equals/)(const float\&, const float\&) | Emuliert den C#‑artigen Gleitkommavergleich, bei dem zwei NaNs als gleich betrachtet werden, obwohl nach IEC 60559:1989 NaN zu keinem Wert, einschließlich NaN, gleich ist. |
| static [Equals](./equals/)(const double\&, const double\&) | Emuliert den C#‑artigen Gleitkommavergleich, bei dem zwei NaNs als gleich betrachtet werden, obwohl nach IEC 60559:1989 NaN zu keinem Wert, einschließlich NaN, gleich ist. |
| static [ExplicitCastToObject](./explicitcasttoobject/)(const T\&) |  |
| static [ExplicitCastToObject](./explicitcasttoobject/)(const T\&) |  |
| static [GetHashCode](./gethashcode/)(const T\&) | Implementiert [GetHashCode()](./gethashcode/)-Aufrufe; funktioniert sowohl für [Object](../object/)-Unterklassen als auch für nicht verwandte Typen. |
| static [Is](./is/)(const T\&) | Implementiert die Übersetzung des 'is'-Operators. Spezialisierung für boxbare (Wert‑)Typen, wobei genau das gemeint ist. |
| static [Is](./is/)(const U\&) | Implementiert die Übersetzung des 'is'-Operators. Spezialisierung für Zeigertypen, optimiert für 'final'-Klassen. |
| static [Is](./is/)(const U\&) | Implementiert die Übersetzung des 'is'-Operators. Spezialisierung für Zeigertypen. |
| static [Is](./is/)(const Object\&) | Implementiert die Übersetzung des 'is'-Operators. Spezialisierung für Werttypen. |
| static [Is](./is/)(const Object\&) | Implementiert die Übersetzung des 'is'-Operators. Spezialisierung für nicht konvertierbare Typen. |
| static [Is](./is/)(const SmartPtr\<U\>\&) | Implementiert die Übersetzung des 'is'-Operators. Spezialisierung für Zeigertypen. |
| static [Is](./is/)(const ExceptionWrapper\<U\>\&) | Implementiert die Übersetzung des 'is'-Operators. Spezialisierung für Ausnahmewrapper-Typen. |
| static [Is](./is/)(const SmartPtr\<Object\>\&) | Implementiert die Übersetzung des 'is'-Operators. Spezialisierung für nullable Typen. |
| static [Is](./is/)(const SmartPtr\<Object\>\&) | Implementiert die Übersetzung des 'is'-Operators. Spezialisierung für boxbare Typen mit definiertem ==-Operator. |
| static [Is](./is/)(const SmartPtr\<Object\>\&) | Implementiert die Übersetzung des 'is'-Operators. Spezialisierung für boxbare Typen ohne definierten ==. |
| static [Is](./is/)(const SmartPtr\<V\>\&) | Implementiert die Übersetzung des 'is'-Operators. Spezialisierung für Werttypen, die zu Schnittstellen geboxt werden. |
| static [Is](./is/)(const SmartPtr\<U\>\&) | Implementiert die Übersetzung des 'is'-Operators. Spezialisierung für Aufzählungstypen. |
| static [Is](./is/)(const WeakPtr\<U\>\&) | Implementiert die Übersetzung des 'is'-Operators. Spezialisierung für Aufzählungstypen gegenüber schwachen Zeigern. |
| static [Is](./is/)(const Nullable\<U\>\&) | Implementiert die Übersetzung des 'is'-Operators. Spezialisierung für den Typ [Nullable](../nullable/). |
| static [Is](./is/)(const char16_t *) | Implementiert die Übersetzung des 'is'-Operators. Spezialisierung für String-Literal. |
| static [Is](./is/)(int32_t) | Implementiert die Übersetzung des 'is'-Operators. Spezialisierung für Integer-Literal. |
| static [IsBoxedValue](./isboxedvalue/)(const SmartPtr\<Object\>\&) | Prüft, ob das Objekt ein geboxter Wert ist. |
| static [ObjectToUnknown](./objecttounknown/)(SmartPtr\<Object\>) | Konvertiert [Object](../object/) zu einem unbekannten Typ und behandelt sowohl Smart-Pointer-Typen als auch geboxte Wertsituationen. |
| static [ObjectToUnknown](./objecttounknown/)(SmartPtr\<Object\>) | Konvertiert [Object](../object/) zu einem unbekannten Typ und behandelt sowohl Smart-Pointer-Typen als auch geboxte Wertsituationen. |
| static [ToString](./tostring/)(const char_t *) | Ersatz für die C#-ToString-Methode, damit sie mit jedem C++-Typ funktioniert. |
| static [ToString](./tostring/)(const Nullable\<T\>\&) | Ersatz für die C#-ToString-Methode, damit sie mit jedem C++-Typ funktioniert. |
| static [ToString](./tostring/)(const T\&) | Ersatz für die C#-ToString-Methode, damit sie mit jedem C++-Typ funktioniert. |
| static [ToString](./tostring/)(const T\&) | Ersatz für die C#-ToString-Methode, damit sie mit jedem C++-Typ funktioniert. |
| static [ToString](./tostring/)(T\&) | Ersatz für die C#-ToString-Methode, damit sie mit jedem C++-Typ funktioniert. |
| static [ToString](./tostring/)(T\&) | Ersatz für die C#-ToString-Methode, damit sie mit jedem C++-Typ funktioniert. |
| static [ToString](./tostring/)(T\&&) | Ersatz für die C#-ToString-Methode, damit sie mit jedem C++-Typ funktioniert. |
| static [ToString](./tostring/)(T\&) | Ersatz für die C#-ToString-Methode, damit sie mit jedem C++-Typ funktioniert. |
| static [ToString](./tostring/)(const T\&) | Ersatz für die C#-ToString-Methode, damit sie mit jedem C++-Typ funktioniert. |
| static [ToString](./tostring/)(T\&&) | Ersatz für die C#-ToString-Methode, damit sie mit jedem C++-Typ funktioniert. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | Entboxt Werttypen nach der Konvertierung zu [Object](../object/). Implementierung für Aufzählungstypen. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | Entboxt Werttypen nach der Konvertierung zu [Object](../object/). Implementierung für Nicht-Aufzählungs- und Nicht-nullable-Typen. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | Entboxt Werttypen nach der Konvertierung zu [Object](../object/). Implementierung für Nicht-Aufzählungs- und Nicht-nullable-Typen. |
| static [Unbox](./unbox/)(E) | Entboxt Aufzählungstypen zu Integer. |
| static [Unbox](./unbox/)(E) | Konvertiert Aufzählungstypen. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | Entboxt String-Werte. |
| static [UnboxStringSafe](./unboxstringsafe/)(const SmartPtr\<Object\>\&) | Entboxt String aus geboxtem Wert. |
| static [UnboxToNullable](./unboxtonullable/)(const SmartPtr\<Object\>\&, bool) | Entboxt Objekt zu nullable Typ. |
| static [UnknownIsNull](./unknownisnull/)(T) | Prüft, ob ein Objekt unbekannten Typs nullptr ist. Überladung für nicht-skalare Typen. |
| static [UnknownIsNull](./unknownisnull/)(T) | Prüft, ob ein Objekt unbekannten Typs nullptr ist. Überladung für skalare Typen. |
| static [UnknownToObject](./unknowntoobject/)(T) | Konvertiert einen unbekannten Typ zu [Object](../object/), wobei sowohl Smart-Pointer-Typen als auch Werttyp-Situationen behandelt werden. |
| static [UnknownToObject](./unknowntoobject/)(const T\&) | Konvertiert einen unbekannten Typ zu [Object](../object/), wobei sowohl Smart-Pointer-Typen als auch Werttyp-Situationen behandelt werden. |
## Siehe auch

* Class [ObjectType](../objecttype/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
