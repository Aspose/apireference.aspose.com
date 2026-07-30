---
title: "System::setter_post_increment_wrap method"
linktitle: "setter_post_increment_wrap"
second_title: "Aspose.Font для C++"
description: "System::setter_post_increment_wrap method. Переводчик переводит постинкрементные выражения C#''s, направленные на свойство экземпляра, у которого определены сеттер и геттер, в вызов этой функции (перегрузка для const getter) в C++."
type: docs
weight: 38000
url: /ru/cpp/system/setter_post_increment_wrap/
---
## System::setter_post_increment_wrap(Host *const, T(HostConstGet::*)() const, void(HostSet::*)(T)) method


Переводчик переводит постинкрементные выражения C#'s, направленные на свойство экземпляра, у которого определены сеттер и геттер, в вызов этой функции (перегрузка для const getter).

```cpp
template<typename T,typename Host,typename HostConstGet,typename HostSet> std::enable_if<std::is_base_of<HostConstGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_post_increment_wrap(Host *const host, T(HostConstGet::*pGetter)() const, void(HostSet::*pSetter)(T))
```


| Параметр | Описание |
| --- | --- |
| T | Тип свойства. |
| Host | - класс экземпляра, который будет изменён |
| HostConstGet | - Сам хост или его базовый тип, где определён геттер свойства |
| HostSet | - Сам хост или его базовый тип, где определён сеттер свойства |

| Параметр | Тип | Описание |
| --- | --- | --- |
| host | Host *const | Экземпляр, для которого вызываются геттеры и сеттеры. |
| pGetter | T(HostConstGet::*)() const | Указатель на функцию, указывающий на геттер свойства |
| pSetter | void(HostSet::*)(T) | Указатель на функцию, указывающий на сеттер свойства |

### ReturnValue

Значение свойства до инкремента

## См. также

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::setter_post_increment_wrap(Host *const, T(HostGet::*)(), void(HostSet::*)(T)) method


Переводчик переводит постинкрементные выражения C#'s, направленные на свойство экземпляра, у которого определены сеттер и геттер, в вызов этой функции (перегрузка для non-const getter).

```cpp
template<typename T,typename Host,typename HostGet,typename HostSet> std::enable_if<std::is_base_of<HostGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_post_increment_wrap(Host *const host, T(HostGet::*pGetter)(), void(HostSet::*pSetter)(T))
```


| Параметр | Описание |
| --- | --- |
| T | Тип свойства. |
| Host | - класс экземпляра, который будет изменён |
| HostGet | - Сам хост или его базовый тип, где определён геттер свойства |
| HostSet | - Сам хост или его базовый тип, где определён сеттер свойства |

| Параметр | Тип | Описание |
| --- | --- | --- |
| host | Host *const | Экземпляр, для которого вызываются геттеры и сеттеры. |
| pGetter | T(HostGet::*)() | Указатель на функцию, указывающий на геттер свойства |
| pSetter | void(HostSet::*)(T) | Указатель на функцию, указывающий на сеттер свойства |

### ReturnValue

Значение свойства до инкремента

## См. также

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::setter_post_increment_wrap(T(*)(), void(*)(T)) method


Переводчик преобразует постинкрементные выражения C#, направленные на свойство класса, у которого определены сеттер и геттер, в вызов этой функции.

```cpp
template<typename T> T System::setter_post_increment_wrap(T(*pGetter)(), void(*pSetter)(T))
```


| Параметр | Описание |
| --- | --- |
| T | Тип свойства |

| Параметр | Тип | Описание |
| --- | --- | --- |
| pGetter | T(*)() | Указатель на функцию, указывающий на свободную функцию геттера свойства |
| pSetter | void(*)(T) | Указатель на функцию, указывающий на свободную функцию сеттера свойства |

### ReturnValue

Значение свойства до инкремента

## См. также

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
