---
title: "System::WeakPtr Klasse"
linktitle: "WeakPtr"
second_title: "Aspose.Font für C++"
description: "System::WeakPtr Klasse. Unterklasse von System::SmartPtr, die sich beim Erzeugen in den Weak‑Modus versetzt. Bitte beachten Sie, dass diese Klasse nicht garantiert, dass ihre Instanz immer im Weak‑Modus bleibt, da set_Mode() weiterhin zugänglich ist. Dieser Typ ist ein Zeiger zur Verwaltung der Löschung anderer Objekte. Er sollte auf dem Stack alloziert und an Funktionen entweder per Wert oder per const‑Referenz übergeben werden in C++."
type: docs
weight: 7500
url: /de/cpp/system/weakptr/
---
## WeakPtr class


Unterklasse von [System::SmartPtr](../smartptr/), die sich beim Erzeugen in den Weak‑Modus versetzt. Bitte beachten Sie, dass diese Klasse nicht garantiert, dass ihre Instanz immer im Weak‑Modus bleibt, da [set_Mode()](../smartptr/set_mode/) weiterhin zugänglich ist. Dieser Typ ist ein Zeiger zur Verwaltung der Löschung anderer Objekte. Er sollte auf dem Stack alloziert und an Funktionen entweder per Wert oder per const‑Referenz übergeben werden.

```cpp
template<class T>class WeakPtr : public System::SmartPtr<T>
```


| Parameter | Beschreibung |
| --- | --- |
| T | Typ des Zeigenden. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [expired](./expired/)() const | Überprüft, ob das referenzierte Objekt bereits gelöscht wurde. |
| [get_weak](./get_weak/)() const | Liefert das referenzierte Objekt. Stellt sicher, dass der Zeiger im Weak‑Modus ist. |
| [operator=](./operator=/)(Q\&&) | Weist dem Weak‑Zeiger einen Wert zu. Ruft den spezifischen Zuweisungsoperator von [SmartPtr_](./smartptr_/) auf. |
| [operator==](./operator==/)(std::nullptr_t) const | Überprüft, ob der Weak‑Zeiger null ist. |
| [WeakPtr](./weakptr/)(std::nullptr_t) | Erstellt einen Null‑Zeiger. |
| [WeakPtr](./weakptr/)(Pointee_ *) | Erstellt einen Weak‑Zeiger auf das gegebene Objekt. |
| [WeakPtr](./weakptr/)(const SmartPtr_\&) | Erstellt einen Weak‑Zeiger, der auf denselben Zeiger verweist, auf den ptr zeigt. |
| [WeakPtr](./weakptr/)(const SmartPtr\<Q\>\&) | Erstellt einen Weak‑Zeiger, der auf denselben Zeiger verweist, auf den x zeigt. |
| [WeakPtr](./weakptr/)(const WeakPtr_\&) | Kopiert den Weak‑Zeiger (Copy‑Konstruktion). |
| [WeakPtr](./weakptr/)(const WeakPtr\<Q\>\&) | Kopiert den Weak‑Zeiger (Copy‑Konstruktion). |
| [WeakPtr](./weakptr/)(SmartPtr_\&&) | Verschiebt den Weak‑Zeiger (Move‑Konstruktion). |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Pointee_](./pointee_/) | Typ, auf den gezeigt wird. |
| [SmartPtr_](./smartptr_/) | Alias für die entsprechende [SmartPtr](../smartptr/)-Klasse. |
| [WeakPtr_](./weakptr_/) | Alias für den eigenen Typ. |

## Siehe auch

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
