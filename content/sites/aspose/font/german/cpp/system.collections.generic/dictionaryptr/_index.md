---
title: "System::Collections::Generic::DictionaryPtr Klasse"
linktitle: "DictionaryPtr"
second_title: "Aspose.Font für C++"
description: "System::Collections::Generic::DictionaryPtr Klasse. Dictionary‑Zeigerklasse mit Operator‑Überladungen. Dieser Typ ist ein Zeiger, um die Löschung anderer Objekte zu verwalten. Er sollte auf dem Stack alloziert und an Funktionen entweder per Wert oder per const‑Referenz in C++ übergeben werden."
type: docs
weight: 1300
url: /de/cpp/system.collections.generic/dictionaryptr/
---
## DictionaryPtr class


[Dictionary](../dictionary/) pointer class with operator overloads. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T,typename V>class DictionaryPtr : public System::SmartPtr<T0>
```


| Parameter | Beschreibung |
| --- | --- |
| T | Schlüsseltyp. |
| V | Werttyp. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [DictionaryPtr](./dictionaryptr/)() | Initialisiert Nullzeiger. |
| [DictionaryPtr](./dictionaryptr/)(const SharedPtr\<Dictionary\<T, V\>\>\&) | Konvertiert den Zeigertyp. |
| [operator[]](./operator[]/)(const X\&) const | Zugriffsoperator, um mit der Schlüsseltyp‑Konvertierung zu arbeiten. |
| [operator[]](./operator[]/)(const T\&) const | Zugriffsoperator. |

## Siehe auch

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
