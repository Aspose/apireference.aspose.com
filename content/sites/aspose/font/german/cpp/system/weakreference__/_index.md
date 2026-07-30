---
title: "System::WeakReference<> Klasse"
linktitle: "WeakReference<>"
second_title: "Aspose.Font für C++"
description: "System::WeakReference<> Klasse. Stellt eine schwache Referenz dar, die ein Objekt referenziert, während das Objekt weiterhin in C++ gelöscht werden kann."
type: docs
weight: 7800
url: /de/cpp/system/weakreference__/
---
## WeakReference<> class


Stellt eine schwache Referenz dar, die ein Objekt referenziert, während das Objekt dennoch gelöscht werden kann.

```cpp
class WeakReference<> : public System::WeakReference<System::Object>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_IsAlive](./get_isalive/)() const | Gibt einen Hinweis darauf, ob das vom aktuellen [WeakReference](../weakreference/) Objekt referenzierte Objekt gelöscht wurde. |
| [get_Target](./get_target/)() const | Gibt das Objekt (das Ziel) zurück, das vom aktuellen [WeakReference](../weakreference/) Objekt referenziert wird. |
| [set_Target](./set_target/)(const SmartPtr\<Object\>\&) | Setzt das Objekt (das Ziel), das vom aktuellen [WeakReference](../weakreference/) Objekt referenziert wird. |
| [WeakReference](./weakreference/)() | Standardkonstruktor. |
| [WeakReference](./weakreference/)(std::nullptr_t) | Konstruktor von nullptr. |
| [WeakReference](./weakreference/)(const SmartPtr\<Object\>\&) | Initialisiert eine neue Instanz der [WeakReference](../weakreference/) Klasse, die das angegebene Objekt referenziert. |
| [WeakReference](./weakreference/)(const SmartPtr\<Object\>\&, bool) | Initialisiert eine neue Instanz der [WeakReference](../weakreference/) Klasse, die das angegebene Objekt referenziert. |
## Siehe auch

* Class [WeakReference](../weakreference/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
