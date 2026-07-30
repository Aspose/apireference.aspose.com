---
title: "System::Ref Methode"
linktitle: "Ref"
second_title: "Aspose.Font für C++"
description: "System::Ref Methode. Wrapper, um sicherzustellen, dass Ref(std::ref(DynamicWeakPtr)) in C++ funktioniert."
type: docs
weight: 36700
url: /de/cpp/system/ref/
---
## System::Ref(const std::reference_wrapper\<T\>\&) method


Wrapper, um sicherzustellen, dass Ref(std::ref(DynamicWeakPtr)) funktioniert.

```cpp
template<typename T> decltype(Ref(std::declval<T &>())) System::Ref(const std::reference_wrapper<T> &wrapper)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Referenzierter Typ. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wrapper | const std::reference_wrapper\<T\>\& | std Wrapper zum Entpacken. |

### ReturnValue

Referenztyp, definiert in [System](../):: statt in std.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Ref(DynamicWeakPtr\<T, trunkMode, weakLeafs...\>\&) method


Erstellt eine Referenz zu einem [DynamicWeakPtr](../dynamicweakptr/)-Objekt. Wird vom Übersetzer verwendet, wenn Funktionsargumente per Referenz übergeben werden.

```cpp
template<typename T,SmartPtrMode,unsigned int ...> DynamicWeakPtr<T, trunkMode, weakLeafs...>::Reference System::Ref(DynamicWeakPtr<T, trunkMode, weakLeafs...> &ptr)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Typ des Zeigenden. |
| trunkMode | Modus des Smart‑Pointers selbst. |
| weakLeafs | Indizes der Template‑Argumente, für die die SetTemplateWeakPtr‑Methode aufgerufen werden muss. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| ptr | DynamicWeakPtr\<T, trunkMode, weakLeafs...\>\& | Smart‑Pointer, um eine Referenz zu erstellen. |

### ReturnValue

Smart‑Pointer‑Referenz.

## Siehe auch

* Class [DynamicWeakPtr](../dynamicweakptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Ref(T\&) method


Hilfsfunktion zum Erhalten von Referenzen auf Objekte. Wird verwendet, um sicherzustellen, dass [System::DynamicWeakPtr](../dynamicweakptr/) das referenzierte Objekt nach Zuweisungen aktualisiert.

```cpp
template<typename T> T & System::Ref(T &value)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Typ, zu dem eine Referenz erstellt werden soll. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | T\& | Wert, zu dem eine Referenz erstellt werden soll. |

### ReturnValue

Referenz auf den an diese Funktion übergebenen Wert.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
