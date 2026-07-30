---
title: "System::DynamicWeakPtr::operator= method"
linktitle: "operator="
second_title: "Aspose.Font для C++"
description: "System::DynamicWeakPtr::operator= method. Копирующее присваивание умного указателя в C++."
type: docs
weight: 200
url: /ru/cpp/system/dynamicweakptr/operator=/
---
## DynamicWeakPtr::operator=(const SmartPtr\<Q\>\&) method


Копирующе присваивает smart pointer.

```cpp
template<typename Q> DynamicWeakPtr_ & System::DynamicWeakPtr<T, trunkMode, weakLeafs>::operator=(const SmartPtr<Q> &x)
```


| Параметр | Описание |
| --- | --- |
| Q | Тип исходного объекта, на который указывает указатель. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| x | const SmartPtr\<Q\>\& | Указатель, из которого копировать значение. |

### ReturnValue

Самоссылка.

## См. также

* Typedef [DynamicWeakPtr_](../dynamicweakptr_/)
* Class [SmartPtr](../../smartptr/)
* Class [DynamicWeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DynamicWeakPtr::operator=(const SmartPtr_\&) method


Копирующе присваивает smart pointer.

```cpp
DynamicWeakPtr_ & System::DynamicWeakPtr<T, trunkMode, weakLeafs>::operator=(const SmartPtr_ &x)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| x | const SmartPtr_\& | Указатель, из которого копировать значение. |

### ReturnValue

Самоссылка.

## См. также

* Typedef [DynamicWeakPtr_](../dynamicweakptr_/)
* Typedef [SmartPtr_](../smartptr_/)
* Class [DynamicWeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DynamicWeakPtr::operator=(SmartPtr_\&&) method


Перемещающе присваивает smart pointer.

```cpp
DynamicWeakPtr_ & System::DynamicWeakPtr<T, trunkMode, weakLeafs>::operator=(SmartPtr_ &&x)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| x | SmartPtr_\&& | Указатель, из которого перемещать значение. |

### ReturnValue

Самоссылка.

## См. также

* Typedef [DynamicWeakPtr_](../dynamicweakptr_/)
* Typedef [SmartPtr_](../smartptr_/)
* Class [DynamicWeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DynamicWeakPtr::operator=(std::nullptr_t) method


Устанавливает smart pointer в null.

```cpp
DynamicWeakPtr_ & System::DynamicWeakPtr<T, trunkMode, weakLeafs>::operator=(std::nullptr_t)
```


### ReturnValue

Самоссылка.

## См. также

* Typedef [DynamicWeakPtr_](../dynamicweakptr_/)
* Class [DynamicWeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DynamicWeakPtr::operator=(typename SmartPtr_::Pointee_ *) method


Присваивает smart pointer.

```cpp
DynamicWeakPtr_ & System::DynamicWeakPtr<T, trunkMode, weakLeafs>::operator=(typename SmartPtr_::Pointee_ *p)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| p | typename SmartPtr_::Pointee_ * | Значение указателя. |

### ReturnValue

Самоссылка.

## См. также

* Typedef [DynamicWeakPtr_](../dynamicweakptr_/)
* Typedef [Pointee_](../../smartptr/pointee_/)
* Class [DynamicWeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
