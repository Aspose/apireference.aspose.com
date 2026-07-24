---
title: "System::With method"
linktitle: "Con"
second_title: "Aspose.Page para C++"
description: "System::With method. Clona el registro de referencia y aplica el functor inicializador a él en C++."
type: docs
weight: 40100
url: /es/cpp/system/with/
---
## System::With(const SharedPtr\<T\>\&, const A\&) method


Clona el registro de referencia y aplica el functor inicializador a él.

```cpp
template<typename T,typename A> SharedPtr<T> System::With(const SharedPtr<T> &record, const A &initializer)
```


| Parámetro | Descripción |
| --- | --- |
| T | Tipo de registro a clonar. |
| A | Tipo de functor de inicialización. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| registro | const SharedPtr\<T\>\& | Puntero compartido al objeto a clonar e inicializar. |
| inicializador | const A\& | Functor de inicialización aplicado al clon del registro. |

### ReturnValue

Puntero compartido al registro clonado.

## Ver también

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::With(const T\&, const A\&) method


Copia el registro de la estructura y le aplica el functor inicializador.

```cpp
template<typename T,typename A> T System::With(const T &record, const A &initializer)
```


| Parámetro | Descripción |
| --- | --- |
| T | Tipo de registro a copiar. |
| A | Tipo de functor de inicialización. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| registro | const T\& | Registro a copiar e inicializar. |
| inicializador | const A\& | Functor de inicialización aplicado a la copia del registro. |

### ReturnValue

Registro copiado.

## Ver también

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
