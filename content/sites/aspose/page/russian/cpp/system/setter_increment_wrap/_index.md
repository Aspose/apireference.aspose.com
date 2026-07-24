---
title: "Метод System::setter_increment_wrap"
linktitle: "setter_increment_wrap"
second_title: "Aspose.Page для C++"
description: "Метод System::setter_increment_wrap. Переводчик переводит инкрементные выражения C#''s, направленные на class'' property, у которого определены сеттер и геттер, в вызов этой функции в C++."
type: docs
weight: 37400
url: /ru/cpp/system/setter_increment_wrap/
---
## System::setter_increment_wrap(Host *const, T(HostGet::*)(), void(HostSet::*)(T)) method


Переводчик переводит инкрементные выражения C#'s, направленные на class' property, у которого определены сеттер и геттер, в вызов этой функции.

```cpp
template<typename T,typename Host,typename HostGet,typename HostSet> std::enable_if<std::is_base_of<HostGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_increment_wrap(Host *const host, T(HostGet::*pGetter)(), void(HostSet::*pSetter)(T))
```


| Параметр | Описание |
| --- | --- |
| T | Тип свойства |
| Host | - класс экземпляра, который будет изменён |
| HostGet | - Сам Host или его базовый тип, где определён геттер свойства |
| HostSet | - Сам Host или его базовый тип, где определён сеттер свойства |

| Параметр | Тип | Описание |
| --- | --- | --- |
| host | Host *const | Указатель на объект, свойство которого должно быть инкрементировано. |
| pGetter | T(HostGet::*)() | Указатель на функцию, указывающий на геттер свойства. |
| pSetter | void(HostSet::*)(T) | Указатель на функцию, указывающий на сеттер свойства. |

### ReturnValue

Инкрементированное значение свойства.

## См. также

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::setter_increment_wrap(T(*)(), void(*)(T)) method


Переводчик переводит инкрементные выражения C#'s, направленные на class' property, у которого определены сеттер и геттер, в вызов этой функции.

```cpp
template<typename T> T System::setter_increment_wrap(T(*pGetter)(), void(*pSetter)(T))
```


| Параметр | Описание |
| --- | --- |
| T | Тип свойства |

| Параметр | Тип | Описание |
| --- | --- | --- |
| pGetter | T(*)() | Указатель на функцию, указывающий на свободную функцию‑геттер свойства |
| pSetter | void(*)(T) | Указатель на функцию, указывающий на свободную функцию‑сеттер свойства |

### ReturnValue

Инкрементированное значение свойства.

## См. также

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
