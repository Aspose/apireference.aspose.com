---
title: "Metodo System::CastEnumerableTo"
linktitle: "CastEnumerableTo"
second_title: "Aspose.Page per C++"
description: "Metodo System::CastEnumerableTo. Esegue il casting esplicito degli elementi dell'oggetto enumerable specificato a un tipo diverso in C++."
type: docs
weight: 15500
url: /it/cpp/system/castenumerableto/
---
## System::CastEnumerableTo(const From\&) method


Esegue il casting esplicito degli elementi dell'oggetto enumerable specificato a un tipo diverso.

```cpp
template<class To,class From> std::enable_if<!System::detail::has_method_get_Count<From>::value, Collections::Generic::ListPtr<To>>::type System::CastEnumerableTo(const From &enumerable)
```


| Parametro | Descrizione |
| --- | --- |
| A | Il tipo a cui castare staticamente gli elementi dell'oggetto enumerable |
| From | Il tipo dell'oggetto enumerable |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| enumerable | const From\& | Oggetto Enumerable contenente gli elementi da castare |

### ReturnValue

Un puntatore a una nuova collezione contenente elementi di tipo **To** equivalenti agli elementi di **enumerable**

## Vedi anche

* Class [ListPtr](../../system.collections.generic/listptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::CastEnumerableTo(const From\&) method


Esegue il casting esplicito degli elementi dell'oggetto enumerable specificato a un tipo diverso.

```cpp
template<class To,class From> std::enable_if<System::detail::has_method_get_Count<From>::value, Collections::Generic::ListPtr<To>>::type System::CastEnumerableTo(const From &enumerable)
```


| Parametro | Descrizione |
| --- | --- |
| A | Il tipo a cui castare staticamente gli elementi dell'oggetto enumerable |
| From | Il tipo dell'oggetto enumerable |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| enumerable | const From\& | è erede dell'oggetto Enumerable con il metodo get_Count definito e contenente gli elementi da castare |

### ReturnValue

Un puntatore a una nuova collezione contenente elementi di tipo **To** equivalenti agli elementi di **enumerable**

## Vedi anche

* Class [ListPtr](../../system.collections.generic/listptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
