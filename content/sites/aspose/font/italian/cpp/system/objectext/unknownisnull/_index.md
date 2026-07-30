---
title: "System::ObjectExt::UnknownIsNull method"
linktitle: "UnknownIsNull"
second_title: "Aspose.Font per C++"
description: "Metodo System::ObjectExt::UnknownIsNull. Verifica se l'oggetto di tipo sconosciuto è nullptr. Sovraccarico per tipi non scalari in C++."
type: docs
weight: 1800
url: /it/cpp/system/objectext/unknownisnull/
---
## ObjectExt::UnknownIsNull(T) method


Verifica se l'oggetto di tipo sconosciuto è nullptr. Sovraccarico per tipi non scalari.

```cpp
template<typename T> static std::enable_if<!std::is_scalar<T>::value, bool>::type System::ObjectExt::UnknownIsNull(T obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | tipo [Object](../../object/). |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | T | [Object](../../object/) da verificare. |

### ReturnValue

Vero se 'obj == nullptr' è vero, falso altrimenti.

## Vedi anche

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::UnknownIsNull(T) method


Verifica se l'oggetto di tipo sconosciuto è nullptr. Sovraccarico per tipi scalari.

```cpp
template<typename T> static std::enable_if<std::is_scalar<T>::value, bool>::type System::ObjectExt::UnknownIsNull(T obj)
```


| Parametro | Descrizione |
| --- | --- |
| T | tipo [Object](../../object/). |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | T | [Object](../../object/) da verificare. |

### ReturnValue

Restituisce sempre false.

## Vedi anche

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
