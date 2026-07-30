---
title: "System::Nullable class"
linktitle: "Nullable"
second_title: "Aspose.Font für C++"
description: "System::Nullable-Klasse. Vorwärtsdeklaration in C++."
type: docs
weight: 4600
url: /de/cpp/system/nullable/
---
## Nullable class


Vorwärtsdeklaration.

```cpp
template<typename T>class Nullable
```


| Parameter | Beschreibung |
| --- | --- |
| T | Der zugrunde liegende Werttyp, der von der [Nullable](./)-Klasse erweitert wird. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Equals](./equals/)(const T1\&) const | Bestimmt, ob der vom aktuellen Objekt dargestellte Wert dem vom angegebenen [Nullable](./)-Objekt dargestellten Wert entspricht. |
| [get_HasValue](./get_hasvalue/)() const | Bestimmt, ob das aktuelle Objekt irgendeinen Wert darstellt. |
| [get_Value](./get_value/)() const | Gibt eine Kopie des vom aktuellen Objekt dargestellten Wertes zurück. |
| [GetHashCode](./gethashcode/)() const | Gibt einen Hashcode für das aktuelle Objekt zurück. |
| [GetValueOrDefault](./getvalueordefault/)(T) | Gibt den vom aktuellen Objekt dargestellten Wert zurück oder den angegebenen Wert, wenn der vom aktuellen Objekt dargestellte Wert null ist. |
| [GetValueOrDefault](./getvalueordefault/)() |  |
| [IsNull](./isnull/)() const | Bestimmt, ob das aktuelle Objekt einen Nullwert darstellt. |
| [Nullable](./nullable/)() | Konstruiert eine Instanz, die einen Nullwert darstellt. |
| [Nullable](./nullable/)(std::nullptr_t) | Konstruiert eine Instanz, die null darstellt. |
| [Nullable](./nullable/)(const T1\&) | Konstruiert eine Instanz der [Nullable](./)-Klasse, die den angegebenen Wert darstellt, der (falls erforderlich) in den Wert des zugrunde liegenden Typs T konvertiert wurde. |
| [Nullable](./nullable/)(const Nullable\<T1\>\&) | Konstruiert eine Instanz, die einen Wert darstellt, der durch das angegebene [Nullable](./)-Objekt repräsentiert wird. Das angegebene Nullable-Objekt kann einen Wert eines anderen Typs als den zugrunde liegenden Typ der konstruierten Instanz darstellen, in welchem Fall der dargestellte Wert in einen Wert des Typs T konvertiert wird. |
| [NullableBoolHelper](./nullableboolhelper/)(const T1\&, const std::function\<bool()>\&, bool) const | Hilfsfunktion, um zu prüfen, ob dieses und **other** beide nicht null sind und ggf. ein Lambda aufzurufen. Wird in Implementierungen verwendet. |
| [operator const T &](./operatorconstt&/)() const | Gibt eine konstante Referenz auf den vom aktuellen Objekt dargestellten Wert zurück. |
| [operator!=](./operator!=/)(std::nullptr_t) const | Bestimmt, ob der vom aktuellen Objekt dargestellte Wert nicht null ist. |
| [operator!=](./operator!=/)(const T1\&) const | Bestimmt, ob der vom aktuellen Objekt dargestellte Wert nicht gleich dem angegebenen Wert ist. |
| [operator!=](./operator!=/)(const Nullable\<T1\>\&) const | Bestimmt, ob der vom aktuellen Objekt dargestellte Wert nicht gleich dem Wert des angegebenen [Nullable](./)-Objekts ist. |
| [operator&=](./operator&=/)(bool) | Wendet [operator&=()](./operator&=/) auf den vom aktuellen Objekt dargestellten Wert an und verwendet den angegebenen Wert als rechten Parameter. |
| [operator+](./operator+/)(std::nullptr_t) const | Gibt eine standardmäßig konstruierte Instanz der Klasse Nullable<T> zurück. |
| [operator+](./operator+/)(const T1\&) const | Addiert nullable und nicht-nullable Werte. |
| [operator+](./operator+/)(const Nullable\<T1\>\&) const | Addiert nullable Werte. |
| [operator+=](./operator+=/)(std::nullptr_t) | Setzt das aktuelle Objekt zurück, sodass es einen Nullwert darstellt. |
| [operator+=](./operator+=/)(const T1\&) | Wendet [operator+=()](./operator+=/) auf den vom aktuellen Objekt dargestellten Wert an und verwendet den angegebenen Wert als rechten Parameter. |
| [operator+=](./operator+=/)(const Nullable\<T1\>\&) | Wendet [operator+=()](./operator+=/) auf den vom aktuellen Objekt dargestellten Wert an und verwendet den Wert des angegebenen [Nullable](./)-Objekts als rechten Parameter. |
| [operator-](./operator-/)(T1) const | Subtrahiert nullable und null‑gezeigte Werte. |
| [operator-](./operator-/)(const T1\&) const | Subtrahiert nullable und nicht-nullable Werte. |
| [operator-](./operator-/)(const Nullable\<T1\>\&) const | Subtrahiert nullable Werte. |
| [operator-=](./operator-=/)(T1) | Gibt eine Instanz der Klasse [Nullable](./) zurück, die einen Nullwert darstellt. |
| [operator-=](./operator-=/)(const T1\&) | Wendet [operator-=()](./operator-=/) auf den vom aktuellen Objekt dargestellten Wert an und verwendet den angegebenen Wert als rechten Parameter. |
| [operator-=](./operator-=/)(const Nullable\<T1\>\&) | Wendet [operator-=()](./operator-=/) auf den vom aktuellen Objekt dargestellten Wert an und verwendet den Wert des angegebenen [Nullable](./)-Objekts als rechten Parameter. |
| [operator<](./operator_/)(std::nullptr_t) const | Gibt immer false zurück. |
| [operator<](./operator_/)(const T1\&) const | Bestimmt, ob der vom aktuellen Objekt dargestellte Wert kleiner ist als der angegebene Wert, indem [operator<()](./operator_/) auf diese Werte angewendet wird. |
| [operator<](./operator_/)(const Nullable\<T1\>\&) const | Bestimmt, ob der vom aktuellen Objekt dargestellte Wert kleiner ist als der Wert des angegebenen [Nullable](./)-Objekts, indem [operator<()](./operator_/) auf diese Werte angewendet wird. |
| [operator<=](./operator_=/)(std::nullptr_t) const | Gibt immer false zurück. |
| [operator<=](./operator_=/)(const T1\&) const | Bestimmt, ob der vom aktuellen Objekt dargestellte Wert kleiner oder gleich dem angegebenen Wert ist, indem [operator<=()](./operator_=/) auf diese Werte angewendet wird. |
| [operator<=](./operator_=/)(const Nullable\<T1\>\&) const | Bestimmt, ob der vom aktuellen Objekt dargestellte Wert kleiner oder gleich dem Wert des angegebenen [Nullable](./)-Objekts ist, indem [operator<=()](./operator_=/) auf diese Werte angewendet wird. |
| [operator=](./operator=/)(std::nullptr_t) | Weist dem aktuellen Objekt einen Nullwert zu. |
| [operator=](./operator=/)(const T1\&) | Ersetzt den vom Objekt derzeit dargestellten Wert durch den angegebenen. |
| [operator=](./operator=/)(const Nullable\<T1\>\&) | Ersetzt den vom Objekt derzeit dargestellten Wert durch den angegebenen. |
| [operator==](./operator==/)(std::nullptr_t) const | Bestimmt, ob der von dem aktuellen Objekt dargestellte Wert null ist. |
| [operator==](./operator==/)(const T1\&) const | Bestimmt, ob der von dem aktuellen Objekt dargestellte Wert dem angegebenen Wert entspricht. |
| [operator==](./operator==/)(const Nullable\<T1\>\&) const | Bestimmt, ob der vom aktuellen Objekt dargestellte Wert dem vom angegebenen [Nullable](./)-Objekt dargestellten Wert entspricht. |
| [operator>](./operator_/)(std::nullptr_t) const | Gibt immer false zurück. |
| [operator>](./operator_/)(const T1\&) const | Bestimmt, ob der von dem aktuellen Objekt dargestellte Wert größer als der angegebene Wert ist, indem [operator>()](./operator_/) auf diese Werte angewendet wird. |
| [operator>](./operator_/)(const Nullable\<T1\>\&) const | Bestimmt, ob der von dem aktuellen Objekt dargestellte Wert größer ist als der von dem angegebenen [Nullable](./)-Objekt dargestellte Wert, indem [operator>()](./operator_/) auf diese Werte angewendet wird. |
| [operator>=](./operator_=/)(std::nullptr_t) const | Gibt immer false zurück. |
| [operator>=](./operator_=/)(const T1\&) const | Bestimmt, ob der von dem aktuellen Objekt dargestellte Wert größer oder gleich dem von dem angegebenen Objekt dargestellten Wert ist, indem [operator>=()](./operator_=/) auf diese Werte angewendet wird. |
| [operator>=](./operator_=/)(const Nullable\<T1\>\&) const | Bestimmt, ob der von dem aktuellen Objekt dargestellte Wert größer oder gleich dem von dem angegebenen [Nullable](./)-Objekt dargestellten Wert ist, indem [operator>=()](./operator_=/) auf diese Werte angewendet wird. |
| [operator | =](./operator_=/)(bool) | Wendet [operator | =()](./operator_=/) auf den von dem aktuellen Objekt dargestellten Wert, wobei der angegebene Wert als Rechtsargument verwendet wird. |
| [reset](./reset/)() | Setzt den derzeit dargestellten Wert auf null. |
| [set_Value](./set_value/)(const T\&) | Setzt einen neuen Wert für das Nullable-Objekt. |
| [ToString](./tostring/)() const | Konvertiert den von dem aktuellen Objekt dargestellten Wert in einen String. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [ValueType](./valuetype/) | Ein Alias für einen Typ des von dieser Klasse dargestellten Wertes. |
## Hinweise


Stellt einen Wert des angegebenen Typs dar, dem null zugewiesen werden kann. Dieser Typ sollte auf dem Stack alloziert und an Funktionen per Wert oder Referenz übergeben werden. Verwenden Sie niemals die Klasse [System::SmartPtr](../smartptr/), um Objekte dieses Typs zu verwalten.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
