---
title: "Метод System::SmartPtr::Cast"
linktitle: "Cast"
second_title: "Aspose.Font для C++"
description: "Метод System::SmartPtr::Cast. Приводит указатель к его собственному типу в C++."
type: docs
weight: 400
url: /ru/cpp/system/smartptr/cast/
---
## SmartPtr::Cast() const method


Преобразует указатель к его собственному типу.

```cpp
template<class Y,typename Check> std::enable_if_t<std::is_same<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| Параметр | Описание |
| --- | --- |
| Y | Целевой тип указываемого объекта. |
| Проверка | Флаги для выброса исключения, если приведение недоступно. |

### ReturnValue

Указатель изменённого типа, который всегда находится в режиме shared.

## См. также

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::Cast() const method


Преобразует указатель к базовому типу с помощью static_cast.

```cpp
template<class Y,typename Check> std::enable_if_t<!std::is_same<Y, T>::value &&std::is_base_of<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| Параметр | Описание |
| --- | --- |
| Y | Целевой тип указываемого объекта. |
| Проверка | Флаги для выброса исключения, если приведение недоступно. |

### ReturnValue

Указатель изменённого типа, который всегда находится в режиме shared.

## См. также

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::Cast() const method


Преобразует указатель к производному типу с помощью dynamic_cast.

```cpp
template<class Y,typename Check> std::enable_if_t<Check::value &&!std::is_same<Y, T>::value &&!std::is_base_of<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| Параметр | Описание |
| --- | --- |
| Y | Целевой тип указываемого объекта. |
| Проверка | Флаги для выброса исключения, если приведение недоступно. |

### ReturnValue

Указатель изменённого типа, который всегда находится в режиме совместного доступа. Выбрасывает InvalidCastException, если преобразование недоступно.

## См. также

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::Cast() const method


Преобразует указатель к производному типу с помощью dynamic_cast.

```cpp
template<class Y,typename Check> std::enable_if_t<!Check::value &&!std::is_same<Y, T>::value &&!std::is_base_of<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| Параметр | Описание |
| --- | --- |
| Y | Целевой тип указываемого объекта. |
| Проверка | Флаги для выброса исключения, если приведение недоступно. |

### ReturnValue

Указатель изменённого типа, который всегда находится в режиме совместного доступа. Возвращает nullptr, если преобразование недоступно.

## См. также

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
