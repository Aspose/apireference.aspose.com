---
title: "System::ObjectExt::UnknownIsNull metodo"
linktitle: "UnknownIsNull"
second_title: "Aspose.Page per C++"
description: "System::ObjectExt::UnknownIsNull metodo. Verifica se l'oggetto di tipo sconosciuto è nullptr. Sovraccarico per tipi non scalari in C++."
type: docs
weight: 1700
url: /it/cpp/system/objectext/unknownisnull/
---
## ObjectExt::UnknownIsNull(T) method


Verifica se l'oggetto di tipo sconosciuto è nullptr. Sovraccarico per tipi non scalari.

```cpp
template<typename T> static std::enable_if<!std::is_scalar<T>::value, bool>::type System::ObjectExt::UnknownIsNull(T obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | [Object](../../object/) tipo. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | T | [Object](../../object/) da verificare. |

### ReturnValue

Vero se 'obj == nullptr' è vero, falso altrimenti.

## Vedi anche

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::UnknownIsNull(T) method


Verifica se l'oggetto di tipo sconosciuto è nullptr. Sovraccarico per tipi scalari.

```cpp
template<typename T> static std::enable_if<std::is_scalar<T>::value, bool>::type System::ObjectExt::UnknownIsNull(T obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | [Object](../../object/) tipo. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | T | [Object](../../object/) da verificare. |

### ReturnValue

Restituisce sempre false.

## Vedi anche

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
