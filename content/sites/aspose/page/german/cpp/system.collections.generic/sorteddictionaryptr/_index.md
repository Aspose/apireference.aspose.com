---
title: "System::Collections::Generic::SortedDictionaryPtr Klasse"
linktitle: "SortedDictionaryPtr"
second_title: "Aspose.Page für C++"
description: "System::Collections::Generic::SortedDictionaryPtr Klasse. Sortierter Wörterbuchzeiger mit Zugriffsoperatoren. Dieser Typ ist ein Zeiger, um die Löschung anderer Objekte zu verwalten. Er sollte auf dem Stack alloziert und an Funktionen entweder per Wert oder per const‑Referenz in C++ übergeben werden."
type: docs
weight: 4100
url: /de/cpp/system.collections.generic/sorteddictionaryptr/
---
## SortedDictionaryPtr class


Zeiger auf sortiertes Wörterbuch mit Zugriffsoperatoren. Dieser Typ ist ein Zeiger zur Verwaltung der Löschung anderer Objekte. Er sollte auf dem Stack alloziert und an Funktionen entweder per Wert oder per const‑Referenz übergeben werden.

```cpp
template<typename T,typename V>class SortedDictionaryPtr : public System::SmartPtr<SortedDictionary<T, V>>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [operator[]](./operator[]/)(const T\&) const | Accessor-Funktion. |
| [SortedDictionaryPtr](./sorteddictionaryptr/)() | Konstruiert einen Nullzeiger. |
| [SortedDictionaryPtr](./sorteddictionaryptr/)(const SharedPtr\<SortedDictionary\<T, V\>\>\&) | Konstruiert einen Zeiger auf das angegebene sortierte Wörterbuch. |
## Siehe auch

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
