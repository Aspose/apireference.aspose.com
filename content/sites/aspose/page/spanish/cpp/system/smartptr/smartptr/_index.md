---
title: "System::SmartPtr::SmartPtr constructor"
linktitle: "SmartPtr"
second_title: "Aspose.Page para C++"
description: "System::SmartPtr::SmartPtr constructor. Convierte el tipo de la matriz referenciada creando una nueva matriz de tipo diferente. Útil si en C# hay una conversión de tipo de matriz que no es compatible en C++."
type: docs
weight: 100
url: /es/cpp/system/smartptr/smartptr/
---
## SmartPtr::SmartPtr(const SmartPtr\<Array\<Y\>\>\&, SmartPtrMode) constructor


Convierte el tipo del arreglo referenciado creando un nuevo arreglo de tipo diferente. Útil si en C# hay una conversión de tipo de arreglo que no es compatible en C++.

```cpp
template<typename Y> System::SmartPtr<T>::SmartPtr(const SmartPtr<Array<Y>> &src, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parámetro | Descripción |
| --- | --- |
| Y | Tipo de la matriz origen. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| src | const SmartPtr\<Array\<Y\>\>\& | Puntero a la matriz para crear una copia, pero con un tipo de elementos diferente. |
| mode | SmartPtrMode | Modo de puntero. |

## Ver también

* Class [SmartPtr](../)
* Class [Array](../../array/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(const SmartPtr\<P\>\&, Pointee_ *, SmartPtrMode) constructor


Construye un [SmartPtr](../) que comparte la información de propiedad con el valor inicial de ptr, pero mantiene un puntero p no relacionado y no administrado.

```cpp
template<typename P> System::SmartPtr<T>::SmartPtr(const SmartPtr<P> &ptr, Pointee_ *p, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| ptr | const SmartPtr\<P\>\& | Otro puntero inteligente para compartir la propiedad con la del origen. |
| p | Pointee_ * | Puntero a un objeto para gestionar. |
| mode | SmartPtrMode | Modo de puntero. |

## Ver también

* Class [SmartPtr](../)
* Typedef [Pointee_](../pointee_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(const SmartPtr\<Q\>\&, SmartPtrMode) constructor


Copia construye el objeto [SmartPtr](../). Ambos punteros apuntan al mismo objeto después. Realiza conversión de tipo si está permitida.

```cpp
template<class Q,typename> System::SmartPtr<T>::SmartPtr(const SmartPtr<Q> &x, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parámetro | Descripción |
| --- | --- |
| Q | Tipo del objeto apuntado por x. |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| x | const SmartPtr\<Q\>\& | Puntero para copiar. |
| mode | SmartPtrMode | Modo de puntero. |

## Ver también

* Class [SmartPtr](../)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(const SmartPtr_\&, SmartPtrMode) constructor


Copia construye el objeto [SmartPtr](../). Ambos punteros apuntan al mismo objeto después.

```cpp
System::SmartPtr<T>::SmartPtr(const SmartPtr_ &ptr, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| ptr | const SmartPtr_\& | Puntero para copiar. |
| mode | SmartPtrMode | Modo de puntero. |

## Ver también

* Typedef [SmartPtr_](../smartptr_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(const Y\&) constructor


Inicializa un arreglo vacío. Utilizado para traducir algunas construcciones de código C#.

```cpp
template<typename Y,typename> System::SmartPtr<T>::SmartPtr(const Y &)
```


| Parámetro | Descripción |
| --- | --- |
| Y | Marcador de posición del tipo EmptyArrayInitializer. |

## Ver también

* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(Pointee_ *, SmartPtrMode) constructor


Crea un [SmartPtr](../) que apunta al objeto especificado, o convierte un puntero crudo a [SmartPtr](../).

```cpp
System::SmartPtr<T>::SmartPtr(Pointee_ *object, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| objeto | Pointee_ * | Apuntado. |
| mode | SmartPtrMode | Modo de puntero. |

## Ver también

* Typedef [Pointee_](../pointee_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(SmartPtr_\&&, SmartPtrMode) constructor


Mueve construye el objeto [SmartPtr](../). Efectivamente, intercambia dos punteros, si ambos están en el mismo modo. x puede quedar inutilizable después de la llamada.

```cpp
System::SmartPtr<T>::SmartPtr(SmartPtr_ &&x, SmartPtrMode mode=SmartPtrMode::Shared) noexcept
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| x | SmartPtr_\&& | Puntero para mover. |
| mode | SmartPtrMode | Modo de puntero. |

## Ver también

* Typedef [SmartPtr_](../smartptr_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(SmartPtrMode) constructor


Crea un objeto [SmartPtr](../) del modo requerido.

```cpp
System::SmartPtr<T>::SmartPtr(SmartPtrMode mode)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| mode | SmartPtrMode | Modo de puntero. |

## Ver también

* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(std::nullptr_t, SmartPtrMode) constructor


Crea un objeto [SmartPtr](../) nulo del modo requerido.

```cpp
System::SmartPtr<T>::SmartPtr(std::nullptr_t=nullptr, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| mode | std::nullptr_t | Modo de puntero. |

## Ver también

* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
