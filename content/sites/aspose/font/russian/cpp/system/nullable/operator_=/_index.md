---
title: "System::Nullable::operator<= метод"
linktitle: "operator<="
second_title: "Aspose.Font для C++"
description: "System::Nullable::operator<= метод. Определяет, меньше ли или равно значение, представленное текущим объектом, значению, представленному указанным объектом Nullable, путем применения operator<=() к этим значениям в C++."
type: docs
weight: 1700
url: /ru/cpp/system/nullable/operator_=/
---
## Nullable::operator<=(const Nullable\<T1\>\&) const method


Определяет, меньше ли или равно значение, представленное текущим объектом, значению, представленному указанным объектом [Nullable](../), путем применения [operator<=()](./) к этим значениям.

```cpp
template<typename T1> bool System::Nullable<T>::operator<=(const Nullable<T1> &other) const
```


| Параметр | Описание |
| --- | --- |
| T1 | Базовый тип объекта [Nullable](../) для сравнения |

| Параметр | Тип | Описание |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Константная ссылка на объект [Nullable](../) для сравнения |

### ReturnValue

Истина, если значение, представленное текущим объектом, меньше или равно значению, представленному указанным объектом [Nullable](../), иначе — ложь

## См. также

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator<=(const T1\&) const method


Определяет, меньше ли или равно значение, представленное текущим объектом, указанному значению, применяя [operator<=()](./) к этим значениям.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator<=(const T1 &other) const
```


| Параметр | Описание |
| --- | --- |
| T1 | Тип значения для сравнения |

| Параметр | Тип | Описание |
| --- | --- | --- |
| другой | const T1\& | Константная ссылка на значение для сравнения |

### ReturnValue

Истина, если значение, представленное текущим объектом, меньше или равно указанному значению, иначе — ложь.

## См. также

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator<=(std::nullptr_t) const method


Всегда возвращает false.

```cpp
bool System::Nullable<T>::operator<=(std::nullptr_t) const
```

## См. также

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
---
title: System::Nullable::operator>= method
заголовок ссылки: operator>=
второй_заголовок: Aspose.Font для C++
description: 'System::Nullable::operator>= method. Определяет, больше ли или равно значение, представленное текущим объектом, значению, представленному указанным объектом Nullable, применяя operator>=() к этим значениям в C++.'
тип: docs
weight: 2100
url: /cpp/system/nullable/operator_=/
---
## Nullable::operator>=(const Nullable\<T1\>\&) const method


Определяет, больше ли или равно значение, представленное текущим объектом, значению, представленному указанным объектом [Nullable](../), применяя [operator>=()](./) к этим значениям.

```cpp
template<typename T1> bool System::Nullable<T>::operator>=(const Nullable<T1> &other) const
```


| Параметр | Описание |
| --- | --- |
| T1 | Базовый тип объекта [Nullable](../) для сравнения |

| Параметр | Тип | Описание |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Константная ссылка на объект [Nullable](../) для сравнения |

### ReturnValue

Истина, если значение, представленное текущим объектом, больше или равно значению, представленному указанным объектом [Nullable](../), иначе — ложь.

## См. также

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator>=(const T1\&) const method


Определяет, больше ли или равно значение, представленное текущим объектом, значению, представленному указанным объектом, применяя [operator>=()](./) к этим значениям.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator>=(const T1 &other) const
```


| Параметр | Описание |
| --- | --- |
| T1 | Базовый тип значения, с которым сравнивается значение, представленное текущим объектом. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| другой | const T1\& | Константная ссылка на объект, с которым сравнивается текущий объект. |

### ReturnValue

Истина, если значение, представленное текущим объектом, больше или равно значению, представленному указанным объектом, иначе — ложь.

## См. также

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator>=(std::nullptr_t) const method


Всегда возвращает false.

```cpp
bool System::Nullable<T>::operator>=(std::nullptr_t) const
```


### ReturnValue

Всегда — ложь.

## См. также

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
---
title: System::Nullable::operator|= method
linktitle: operator|=
второй_заголовок: Aspose.Font для C++
description: 'System::Nullable::operator|= method. Применяет operator|=() к значению, представленному текущим объектом, используя указанное значение в качестве аргумента справа в C++.'
тип: docs
weight: 2200
url: /cpp/system/nullable/operator_=/
---
## Nullable::operator|= method


Применяет [operator|=()](./) к значению, представленному текущим объектом, используя указанное значение в качестве аргумента справа.

```cpp
template<typename T1> std::enable_if<std::is_same<T1, bool>::value, Nullable<T>>::type System::Nullable<T>::operator|=(bool other)
```


| Параметр | Описание |
| --- | --- |
| T1 | Параметр шаблона, необходимый для работы SFINAE. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| другой | bool | Булево значение, которое используется в качестве правого аргумента [operator | =()](./) применяемого к значению, представленному текущим объектом. |

### ReturnValue

Ссылка на себя.

## См. также

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
