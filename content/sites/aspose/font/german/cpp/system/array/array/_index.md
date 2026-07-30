---
title: "System::Array::Array Konstruktor"
linktitle: "Array"
second_title: "Aspose.Font für C++"
description: "System::Array::Array Konstruktor. Erstellt ein leeres Array in C++."
type: docs
weight: 100
url: /de/cpp/system/array/array/
---
## Array::Array() constructor


Konstruiert ein leeres Array.

```cpp
System::Array<T>::Array()
```

## Siehe auch

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(const std::array\<UnderlyingType, InitArraySize\>\&) constructor


Konstruiert ein [Array](../)-Objekt und füllt es mit Werten aus dem angegebenen Array, das Elemente vom Typ **[UnderlyingType](../underlyingtype/)** enthält.

```cpp
template<std::size_t> System::Array<T>::Array(const std::array<UnderlyingType, InitArraySize> &init)
```


| Parameter | Beschreibung |
| --- | --- |
| InitArraySize | Anzahl der Elemente des **init** Arrays. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| init | const std::array\<UnderlyingType, InitArraySize\>\& | [Array](../) zum Kopieren in das zu konstruierende Array. |

## Siehe auch

* Typedef [UnderlyingType](../underlyingtype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(const std::vector\<Q\>\&) constructor


Konstruiert ein [Array](../)-Objekt und füllt es mit Werten, die aus einem std::vector-Objekt kopiert wurden, dessen Werttyp derselbe ist wie **T**, aber sich von **[UnderlyingType](../underlyingtype/)** unterscheidet.

```cpp
template<typename Q,typename> System::Array<T>::Array(const std::vector<Q> &value)
```


| Parameter | Beschreibung |
| --- | --- |
| Q | Der Typ der Elemente des std::vector-Objekts, aus dem die Elemente kopiert werden sollen |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | const std::vector\<Q\>\& | std::vector, aus dem die Werte kopiert werden |

## Siehe auch

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(const vector_t\&) constructor


Kopierkonstruktor.

```cpp
System::Array<T>::Array(const vector_t &assgn)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| assgn | const vector_t\& | std::vector, aus dem Werte kopiert werden |

## Siehe auch

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(int, const T\&) constructor


Füllkonstruktor.

```cpp
System::Array<T>::Array(int count, const T &init=T())
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| count | int | Initiale Größe des Arrays |
| init | const T\& | Der Anfangswert, mit dem das Array gefüllt wird |

## Siehe auch

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(int, const T) constructor


Füllkonstruktor.

```cpp
System::Array<T>::Array(int count, const T inits[])
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| count | int | Initiale Größe des Arrays |
| initialisiert | const T | Werte, mit denen das Array gefüllt wird |

## Siehe auch

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(std::initializer_list\<bool\>, int) constructor


Konstruiert ein [Array](../)-Objekt und füllt es mit Werten aus der angegebenen Initialisierungsliste, die Elemente vom Typ bool enthält.

```cpp
System::Array<T>::Array(std::initializer_list<bool> init, int=0)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| init | std::initializer_list\<bool\> | Initialisierungsliste, die Elemente zum Befüllen des Arrays enthält |

## Siehe auch

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(std::initializer_list\<UnderlyingType\>) constructor


Konstruiert ein [Array](../)-Objekt und füllt es mit Werten aus der angegebenen Initialisierungsliste, die Elemente vom Typ **[UnderlyingType](../underlyingtype/)** enthält.

```cpp
System::Array<T>::Array(std::initializer_list<UnderlyingType> init)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| init | std::initializer_list\<UnderlyingType\> | Initialisierungsliste, die Elemente zum Befüllen des Arrays enthält |

## Siehe auch

* Typedef [UnderlyingType](../underlyingtype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(std::vector\<Q\>\&&) constructor


Konstruiert ein [Array](../)-Objekt und füllt es mit Werten, die aus einem std::vector-Objekt verschoben wurden, dessen Werttyp derselbe ist wie **T**, aber sich von **[UnderlyingType](../underlyingtype/)** unterscheidet.

```cpp
template<typename Q,typename> System::Array<T>::Array(std::vector<Q> &&value)
```


| Parameter | Beschreibung |
| --- | --- |
| Q | Der Typ der Elemente des std::vector-Objekts, aus dem die Elemente verschoben werden sollen. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | std::vector\<Q\>\&& | std::vector, aus dem die Werte kopiert werden |

## Siehe auch

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(typename std::enable_if\<std::is_arithmetic\<T\>::value\&&std::is_arithmetic\<ValueType\>::value\&&std::is_convertible\<ValueType, T\>::value, int\>::type, ValueType) constructor


Füllkonstruktor.

```cpp
template<typename ValueType> System::Array<T>::Array(typename std::enable_if<std::is_arithmetic<T>::value &&std::is_arithmetic<ValueType>::value &&std::is_convertible<ValueType, T>::value, int>::type count, ValueType init)
```


| Parameter | Beschreibung |
| --- | --- |
| ValueType | Typ des Anfangswerts |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| count | typename std::enable_if\<std::is_arithmetic\<T\>::value\&&std::is_arithmetic\<ValueType\>::value\&&std::is_convertible\<ValueType, T\>::value, int\>::type | Initiale Größe des Arrays |
| init | ValueType | Der Anfangswert, mit dem das Array gefüllt wird |

## Siehe auch

* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Array(vector_t\&&) constructor


Move-Konstruktor.

```cpp
System::Array<T>::Array(vector_t &&value)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | vector_t\&& | std::vector, dessen Elemente vom Array übernommen werden |

## Siehe auch

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
