---
title: "Metodo System::ObjectExt::Equals"
linktitle: "Uguali"
second_title: "Aspose.Font per C++"
description: "Metodo System::ObjectExt::Equals. Sostituzione delle chiamate C# Object.Equals funzionante per qualsiasi tipo in C++. Sovraccarico per i literal stringa con confronto di stringhe in C++."
type: docs
weight: 800
url: /it/cpp/system/objectext/equals/
---
## ObjectExt::Equals(const char_t(&), String) method


Sostituzione delle chiamate C# [Object.Equals](../../object/equals/) funzionante per qualsiasi tipo in C++. Sovraccarico per i literal stringa con confronto di stringhe.

```cpp
template<size_t> static bool System::ObjectExt::Equals(const char_t(&obj)[N], String another)
```


| Parametro | Descrizione |
| --- | --- |
| N | [String](../../string/) dimensione letterale. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const char_t(&) | [String](../../string/) letterale. |
| another | String | [String](../../string/). |

### ReturnValue

Vero se le stringhe corrispondono, falso altrimenti.

## Vedi anche

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Equals(const double\&, const double\&) method


Emula il confronto in virgola mobile in stile C# dove due NaN sono considerati uguali anche se, secondo IEC 60559:1989, NaN non è uguale a nessun valore, incluso NaN.

```cpp
bool System::ObjectExt::Equals(const double &obj, const double &another)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const double\& | Valore a virgola mobile LHS. |
| un altro | const double\& | Valore a virgola mobile RHS. |

### ReturnValue

Vero se **obj** e **another** sono entrambi NaN o uguali, falso altrimenti.

## Vedi anche

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Equals(const float\&, const float\&) method


Emula il confronto in virgola mobile in stile C# dove due NaN sono considerati uguali anche se, secondo IEC 60559:1989, NaN non è uguale a nessun valore, incluso NaN.

```cpp
bool System::ObjectExt::Equals(const float &obj, const float &another)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const float\& | Valore a virgola mobile LHS. |
| un altro | const float\& | Valore a virgola mobile RHS. |

### ReturnValue

Vero se **obj** e **another** sono entrambi NaN o uguali, falso altrimenti.

## Vedi anche

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Equals(const T\&, const T2\&) method




```cpp
template<typename T,typename T2> static std::enable_if<IsExceptionWrapper<T>::value, bool>::type System::ObjectExt::Equals(const T &obj, const T2 &another)
```

## Vedi anche

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Equals(const T\&, const T2\&) method


Sostituzione per le chiamate C# [Object.Equals](../../object/equals/) che funzionano per qualsiasi tipo in C++. Sovraccarico per tipi di puntatore intelligente.

```cpp
template<typename T,typename T2> static std::enable_if<IsSmartPtr<T>::value, bool>::type System::ObjectExt::Equals(const T &obj, const T2 &another)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo del primo oggetto. |
| T2 | Tipo del secondo oggetto. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const T\& | Primo oggetto. |
| un altro | const T2\& | Secondo oggetto. |

### ReturnValue

Vero se gli oggetti sono considerati uguali, falso altrimenti.

## Vedi anche

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Equals(const T\&, const T2\&) method


Sostituzione per le chiamate C# [Object.Equals](../../object/equals/) che funzionano per qualsiasi tipo in C++. Sovraccarico per tipi scalari.

```cpp
template<typename T,typename T2> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value, bool>::type System::ObjectExt::Equals(const T &obj, const T2 &another)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo del primo oggetto. |
| T2 | Tipo del secondo oggetto. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | const T\& | Primo oggetto. |
| un altro | const T2\& | Secondo oggetto. |

### ReturnValue

Vero se gli oggetti sono considerati uguali, falso altrimenti.

## Vedi anche

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Equals(T, const T2\&) method


Sostituzione per le chiamate C# [Object.Equals](../../object/equals/) che funzionano per qualsiasi tipo in C++. Sovraccarico per tipi di struttura.

```cpp
template<typename T,typename T2> static std::enable_if<!IsExceptionWrapper<T>::value &&!IsSmartPtr<T>::value &&!std::is_scalar<T>::value, bool>::type System::ObjectExt::Equals(T obj, const T2 &another)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo del primo oggetto. |
| T2 | Tipo del secondo oggetto. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | T | Primo oggetto. |
| un altro | const T2\& | Secondo oggetto. |

### ReturnValue

Vero se gli oggetti sono considerati uguali, falso altrimenti.

## Vedi anche

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
