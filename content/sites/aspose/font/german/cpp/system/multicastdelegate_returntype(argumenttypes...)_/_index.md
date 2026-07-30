---
title: "System::MulticastDelegate< ReturnType(ArgumentTypes...)> Klasse"
linktitle: "MulticastDelegate< ReturnType(ArgumentTypes...)>"
second_title: "Aspose.Font für C++"
description: "System::MulticastDelegate< ReturnType(ArgumentTypes...)> Klasse. Stellt eine Sammlung von Delegaten dar. Dieser Typ sollte auf dem Stack alloziert und an Funktionen per Wert oder Referenz übergeben werden. Verwenden Sie niemals die System::SmartPtr Klasse, um Objekte dieses Typs in C++ zu verwalten."
type: docs
weight: 4500
url: /de/cpp/system/multicastdelegate_returntype(argumenttypes...)_/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)> class


Stellt eine Sammlung von Delegaten dar. Dieser Typ sollte auf dem Stack alloziert und an Funktionen per Wert oder Referenz übergeben werden. Verwenden Sie niemals die [System::SmartPtr](../smartptr/) Klasse, um Objekte dieses Typs zu verwalten.

```cpp
template<class ReturnType,class...>class MulticastDelegate< ReturnType(ArgumentTypes...)> : public System::Details::DelegateHoldingVariables
```


| Parameter | Beschreibung |
| --- | --- |
| ReturnType | Rückgabetyp der aufrufbaren Entitäten, auf die jeder Delegat in der Sammlung zeigt |
| ArgumentTypes | Argumentliste der aufrufbaren Entitäten, auf die jeder Delegat in der Sammlung zeigt |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [BeginInvoke](./begininvoke/)(ArgumentTypes..., const AsyncCallback\&, const CallbackArgumentType\&) | NICHT IMPLEMENTIERT. |
| [connect](./connect/)(Callback) | Fügt den angegebenen Delegaten zur Sammlung hinzu. |
| [connect](./connect/)(std::function\<R(Args...)>) | Fügt das angegebene Funktionsobjekt zur Delegatensammlung hinzu. Das Funktionsobjekt wird vor dem Hinzufügen in den Delegatentyp [Callback](./callback/) konvertiert. |
| [connect](./connect/)(MulticastDelegate\&) | Fügt das angegebene MulticastDelegate-Objekt zur Delegatensammlung hinzu. |
| [connect](./connect/)(MemberType ClassType::*, ClassType *) | Fügt die angegebene nicht-statische Methode des angegebenen Objekts zur Delegatensammlung hinzu. |
| [connect](./connect/)(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) | Fügt die angegebene nicht-statische Methode des angegebenen Objekts zur Delegatensammlung hinzu. |
| [disconnect](./disconnect/)(Callback) | Entfernt den angegebenen Delegaten aus der Delegatensammlung. |
| [disconnect](./disconnect/)(MemberType ClassType::*, ClassType *) | Entfernt die angegebene nicht-statische Methode des angegebenen Objekts aus der Delegatensammlung. |
| [disconnect](./disconnect/)(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) | Entfernt die angegebene nicht-statische Methode des angegebenen Objekts aus der Delegatensammlung. |
| [disconnect](./disconnect/)(MulticastDelegate\&) | Entfernt das angegebene MulticastDelegate-Objekt aus der Delegatensammlung. |
| [disconnect_all_slots](./disconnect_all_slots/)() | Entfernt alle Delegaten aus der Delegatensammlung. |
| [empty](./empty/)() const | Bestimmt, ob die Delegatensammlung leer ist. |
| [EndInvoke](./endinvoke/)(const SharedPtr\<IAsyncResult\>\&) | NICHT IMPLEMENTIERT. |
| [Equals](./equals/)(const MulticastDelegate\&) |  |
| [GetHashCode](./gethashcode/)() const |  |
| [GetType](./gettype/)() const |  |
| [invoke](./invoke/)(ArgumentTypes...) const | Ruft alle derzeit in der Delegatensammlung vorhandenen Delegaten auf. Delegaten werden in derselben Reihenfolge aufgerufen, in der sie zur Sammlung hinzugefügt wurden. Die Methode blockiert, solange die Delegaten ausgeführt werden. |
| [IsNull](./isnull/)() const | Bestimmt, ob die Delegatensammlung leer ist. |
| [MulticastDelegate](./multicastdelegate/)() | Konstruiert eine leere Sammlung. |
| [MulticastDelegate](./multicastdelegate/)(std::nullptr_t) | Entspricht dem Standardkonstruktor. |
| [MulticastDelegate](./multicastdelegate/)(const MulticastDelegate\&) | Führt eine flache Kopie der Delegatensammlung durch. |
| [MulticastDelegate](./multicastdelegate/)(MulticastDelegate\&&) | Move-Konstruktor. |
| [MulticastDelegate](./multicastdelegate/)(Callback\&&) | Konstruiert eine Instanz und fügt den angegebenen Delegaten zur Delegaten‑Sammlung hinzu. |
| [MulticastDelegate](./multicastdelegate/)(T) | Konstruiert eine Instanz und fügt den angegebenen Wert zur Delegaten‑Sammlung hinzu. |
| [MulticastDelegate](./multicastdelegate/)(std::function\<ReturnType(ArgumentTypes...)>) | Konstruiert eine Instanz und fügt den angegebenen Wert zur Delegaten‑Sammlung hinzu. |
| [operator!=](./operator!=/)(const std::nullptr_t\&) const | Bestimmt, ob die Delegaten‑Sammlung nicht leer ist. |
| [operator!=](./operator!=/)(const MulticastDelegate\&) const | Bestimmt, ob zwei Instanzen von MulticastDelegate - das aktuelle Objekt und das angegebene Objekt - ungleich sind. |
| [operator()](./operator()/)(ArgumentTypes...) const | Ruft alle derzeit in der Delegaten‑Sammlung vorhandenen Delegaten auf. Delegaten werden in derselben Reihenfolge aufgerufen, in der sie zur Sammlung hinzugefügt wurden. Der Operator blockiert, solange die Delegaten ausgeführt werden. |
| [operator+=](./operator+=/)(Callback) | Fügt den angegebenen Delegaten zur Sammlung hinzu. |
| [operator-=](./operator-=/)(Callback) | Entfernt den angegebenen Delegaten aus der Delegatensammlung. |
| [operator=](./operator=/)(const MulticastDelegate\&) | Weist die von dem angegebenen Objekt repräsentierte Delegaten‑Sammlung dem aktuellen Objekt zu. Infolgedessen zeigen beide Objekte auf dieselbe Delegaten‑Sammlung. |
| [operator=](./operator=/)(MulticastDelegate\&&) | Move-Zuweisungsoperator. |
| [operator==](./operator==/)(const std::nullptr_t\&) const | Bestimmt, ob die Delegatensammlung leer ist. |
| [operator==](./operator==/)(const MulticastDelegate\&) const | Bestimmt, ob zwei Instanzen von MulticastDelegate - das aktuelle Objekt und das angegebene Objekt - gleich sind. |
| [remove_empty_callbacks](./remove_empty_callbacks/)() const | Bereinigt enthaltene Callbacks, die leer sind (tatsächlich nichts aufrufen). |
| [ToString](./tostring/)() const |  |
| static [Type](./type/)() | Gibt eine Referenz auf das [TypeInfo](../typeinfo/)‑Objekt zurück, das die Typinformationen der MulticastDelegate‑Klasse darstellt. |
| [~MulticastDelegate](./~multicastdelegate/)() | Destruktor. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Callback](./callback/) | Der Typ der von der MulticastDelegate‑Klasse repräsentierten Delegaten. |

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
