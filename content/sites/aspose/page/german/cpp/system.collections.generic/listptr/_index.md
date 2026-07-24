---
title: "System::Collections::Generic::ListPtr Klasse"
linktitle: "ListPtr"
second_title: "Aspose.Page für C++"
description: "System::Collections::Generic::ListPtr Klasse. Listen‑Zeiger mit Zugriffsoperatoren. Dieser Typ ist ein Zeiger, um die Löschung anderer Objekte zu verwalten. Er sollte auf dem Stack alloziert werden und an Funktionen entweder per Wert oder per const‑Referenz in C++ übergeben werden."
type: docs
weight: 3500
url: /de/cpp/system.collections.generic/listptr/
---
## ListPtr class


[List](../list/) pointer with access operators. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T>class ListPtr : public System::SmartPtr<List<T>>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [ListPtr](./listptr/)(std::nullptr_t) | Initialisiert Null‑Zeiger. |
| [ListPtr](./listptr/)(const SharedPtr\<List\<T\>\>\&) | Initialisiert Zeiger auf die angegebene Liste. |
| [operator==](./operator==/)(std::nullptr_t) const | Prüft, ob der [List](../list/) Zeiger null ist. |
| [operator[]](./operator[]/)(int) | Zugriffsmethode. |
| [operator[]](./operator[]/)(int) const | Zugriffsmethode. |
## Siehe auch

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
