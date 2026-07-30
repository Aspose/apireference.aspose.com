---
title: "Метод System::setter_wrap"
linktitle: "setter_wrap"
second_title: "Aspose.Font для C++"
description: "Метод System::setter_wrap. Перегрузка для функций-сеттеров экземпляра с преобразованием типов в C++."
type: docs
weight: 38300
url: /ru/cpp/system/setter_wrap/
---
## System::setter_wrap(Host *const, void(HostSet::*)(T2), T) method


Перегрузка для функций-сеттеров экземпляра с преобразованием типов.

```cpp
template<typename T,typename T2,typename Host,typename HostSet> std::enable_if<std::is_base_of<HostSet, Host>::value, T>::type System::setter_wrap(Host *const host, void(HostSet::*pSetter)(T2), T value)
```


| Параметр | Описание |
| --- | --- |
| T | Тип значения. |
| T2 | Тип, ожидаемый функцией-сеттером. |
| Host | Тип экземпляра. |
| HostSet | - Сам хост или его базовый тип, где определён сеттер свойства. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| host | Host *const | [Object](../object/) для вызова функции‑сеттера для. |
| pSetter | void(HostSet::*)(T2) | Ссылка на функцию‑сеттер. |
| значение | T | Значение для установки. |

### ReturnValue

установить значение.

## См. также

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::setter_wrap(void(*)(T2), T) method


Перегрузка для статических функций‑сеттеров с преобразованием типов.

```cpp
template<typename T,typename T2> T System::setter_wrap(void(*pSetter)(T2), T value)
```


| Параметр | Описание |
| --- | --- |
| T | Тип значения. |
| T2 | Тип, ожидаемый функцией-сеттером. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| pSetter | void(*)(T2) | Ссылка на статическую функцию‑сеттер. |
| значение | T | Значение для установки. |

### ReturnValue

установить значение.

## См. также

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
