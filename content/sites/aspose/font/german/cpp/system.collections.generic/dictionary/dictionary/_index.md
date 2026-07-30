---
title: "System::Collections::Generic::Dictionary::Dictionary Konstruktor"
linktitle: "Dictionary"
second_title: "Aspose.Font für C++"
description: "System::Collections::Generic::Dictionary::Dictionary Konstruktor. Erstellt ein leeres Wörterbuch in C++."
type: docs
weight: 100
url: /de/cpp/system.collections.generic/dictionary/dictionary/
---
## Dictionary::Dictionary() constructor


Erstellt ein leeres Wörterbuch.

```cpp
System::Collections::Generic::Dictionary<TKey, TValue>::Dictionary()
```

## Siehe auch

* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## Dictionary::Dictionary(const map_t\&) constructor


Kopiert Daten von einer Map.

```cpp
System::Collections::Generic::Dictionary<TKey, TValue>::Dictionary(const map_t &map)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Map | const map_t\& | Map, aus der Daten kopiert werden sollen. |

## Siehe auch

* Typedef [map_t](../map_t/)
* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## Dictionary::Dictionary(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) constructor


Kopierkonstruktor.

```cpp
System::Collections::Generic::Dictionary<TKey, TValue>::Dictionary(const SharedPtr<IDictionary<TKey, TValue>> &src)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| src | const SharedPtr\<IDictionary\<TKey, TValue\>\>\& | [Dictionary](../) zum Kopieren von Daten. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../idictionary/)
* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## Dictionary::Dictionary(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&, const SharedPtr\<IEqualityComparer\<TKey\>\>\&) constructor


Kopierkonstruktor.

```cpp
System::Collections::Generic::Dictionary<TKey, TValue>::Dictionary(const SharedPtr<IDictionary<TKey, TValue>> &src, const SharedPtr<IEqualityComparer<TKey>> &comparer)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| src | const SharedPtr\<IDictionary\<TKey, TValue\>\>\& | Quellwörterbuch. |
| comparer | const SharedPtr\<IEqualityComparer\<TKey\>\>\& | [Comparer](../../comparer/) zu verwendendes Objekt. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../idictionary/)
* Class [IEqualityComparer](../../iequalitycomparer/)
* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## Dictionary::Dictionary(const SharedPtr\<IEqualityComparer\<TKey\>\>\&) constructor


Erstellt ein leeres Wörterbuch.

```cpp
System::Collections::Generic::Dictionary<TKey, TValue>::Dictionary(const SharedPtr<IEqualityComparer<TKey>> &comparer)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| comparer | const SharedPtr\<IEqualityComparer\<TKey\>\>\& | [Comparer](../../comparer/) zu verwenden. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEqualityComparer](../../iequalitycomparer/)
* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## Dictionary::Dictionary(int) constructor


Überladung, die dem Erstellen eines vorab zugewiesenen Wörterbuchs entspricht; führt tatsächlich keine Zuweisung durch.

```cpp
System::Collections::Generic::Dictionary<TKey, TValue>::Dictionary(int capacity)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Kapazität | int | Kapazität zum Zuweisen; ignoriert. |

## Siehe auch

* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## Dictionary::Dictionary(int, const SharedPtr\<IEqualityComparer\<TKey\>\>\&) constructor


Erstellt ein leeres Wörterbuch.

```cpp
System::Collections::Generic::Dictionary<TKey, TValue>::Dictionary(int capacity, const SharedPtr<IEqualityComparer<TKey>> &comparer)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| capacity | int | [Dictionary](../) Kapazität nach Erstellung; ignoriert. |
| comparer | const SharedPtr\<IEqualityComparer\<TKey\>\>\& | [Comparer](../../comparer/) zu verwenden. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEqualityComparer](../../iequalitycomparer/)
* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
