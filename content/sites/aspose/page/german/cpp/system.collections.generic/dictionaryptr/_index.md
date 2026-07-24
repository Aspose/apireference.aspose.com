---
title: "System::Collections::Generic::DictionaryPtr Klasse"
linktitle: "DictionaryPtr"
second_title: "Aspose.Page für C++"
description: "System::Collections::Generic::DictionaryPtr Klasse. Dictionary‑Zeiger‑Klasse mit Operator‑Überladungen. Dieser Typ ist ein Zeiger, um die Löschung anderer Objekts'' zu verwalten. Er sollte auf dem Stack alloziert und an Funktionen entweder per Wert oder per const‑Referenz in C++ übergeben werden."
type: docs
weight: 1300
url: /de/cpp/system.collections.generic/dictionaryptr/
---
## DictionaryPtr class


[Dictionary](../dictionary/) pointer class with operator overloads. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T,typename V>class DictionaryPtr : public System::SmartPtr<Dictionary<T, V>>
```


| Parameter | Beschreibung |
| --- | --- |
| T | Schlüsseltyp. |
| V | Werttyp. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [DictionaryPtr](./dictionaryptr/)() | Initialisiert Nullzeiger. |
| [DictionaryPtr](./dictionaryptr/)(const SharedPtr\<Dictionary\<T, V\>\>\&) | Konvertiert Zeigertyp. |
| [operator[]](./operator[]/)(const X\&) const | Zugriffsoperator zur Arbeit mit Schlüsseltyp‑Konvertierung. |
| [operator[]](./operator[]/)(const T\&) const | Zugriffsoperator. |

## Siehe auch

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
