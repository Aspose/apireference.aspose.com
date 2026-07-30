---
title: "System::WeakReference< T > Klasse"
linktitle: "WeakReference< T >"
second_title: "Aspose.Font für C++"
description: "System::WeakReference< T > Klasse. Stellt eine schwache Referenz dar, die ein Objekt referenziert, während das Objekt in C++ weiterhin gelöscht werden kann."
type: docs
weight: 7700
url: /de/cpp/system/weakreference_t_/
---
## WeakReference< T > class


Stellt eine schwache Referenz dar, die ein Objekt referenziert, während das Objekt dennoch gelöscht werden kann.

```cpp
template<typename T>class WeakReference< T > : public System::Object
```


| Parameter | Beschreibung |
| --- | --- |
| T | Typ eines referenzierten Objekts. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [operator!=](./operator!=/)(std::nullptr_t) const | Prüft, ob das referenzierte Objekt nicht null ist. |
| [operator!=](./operator!=/)(const WeakReference\<T\>\&) const | Vergleicht das referenzierte Objekt mit einer anderen Instanz der Klasse [WeakReference](../weakreference/). |
| [operator==](./operator==/)(std::nullptr_t) const | Prüft, ob das referenzierte Objekt null ist. |
| [operator==](./operator==/)(const WeakReference\<T\>\&) const | Vergleicht das referenzierte Objekt mit einer anderen Instanz der Klasse [WeakReference](../weakreference/). |
| [reset](./reset/)() |  |
| [SetTarget](./settarget/)(const SmartPtr\<T\>\&) | Setzt das Objekt (das Ziel), das vom aktuellen [WeakReference](../weakreference/) Objekt referenziert wird. |
| [TryGetTarget](./trygettarget/)(const SmartPtr\<T\>\&) const | Gibt das Objekt (das Ziel) zurück, das vom aktuellen [WeakReference](../weakreference/) Objekt referenziert wird. |
| [WeakReference](./weakreference/)() | Standardkonstruktor. |
| [WeakReference](./weakreference/)(std::nullptr_t) | Konstruktor von nullptr. |
| [WeakReference](./weakreference/)(const SmartPtr\<T\>\&) | Initialisiert eine neue Instanz der [WeakReference](../weakreference/) Klasse, die das angegebene Objekt referenziert. |
| [WeakReference](./weakreference/)(const SmartPtr\<T\>\&, bool) | Initialisiert eine neue Instanz der [WeakReference](../weakreference/) Klasse, die das angegebene Objekt referenziert. |

## Siehe auch

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
