---
title: "System::Collections::Generic::StackPtr Klasse"
linktitle: "StackPtr"
second_title: "Aspose.Page für C++"
description: "System::Collections::Generic::StackPtr Klasse. Stack‑Zeiger. Dieser Typ ist ein Zeiger, um die Löschung anderer Objekte zu verwalten. Er sollte auf dem Stack alloziert werden und an Funktionen entweder per Wert oder per const‑Referenz in C++ übergeben werden."
type: docs
weight: 4700
url: /de/cpp/system.collections.generic/stackptr/
---
## StackPtr class


[Stack](../stack/) pointer. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T>class StackPtr : public System::SmartPtr<Stack<T>>
```


| Parameter | Beschreibung |
| --- | --- |
| T | Elementtyp. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [StackPtr](./stackptr/)() | Konstruiert einen Nullzeiger. |
| [StackPtr](./stackptr/)(const SharedPtr\<Stack\<T\>\>\&) | Konstruiert einen Zeiger, der auf einen bestimmten Stack verweist. |

## Siehe auch

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
