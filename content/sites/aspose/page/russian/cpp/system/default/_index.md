---
title: "System::Default метод"
linktitle: "Default"
second_title: "Aspose.Page для C++"
description: "System::Default метод. Возвращает ссылку на единственный экземпляр, созданный конструктором по умолчанию, типа исключения в C++."
type: docs
weight: 16200
url: /ru/cpp/system/default/
---
## System::Default() method


Возвращает ссылку на единственный экземпляр, созданный конструктором по умолчанию, типа исключения.

```cpp
template<typename T> std::enable_if<IsExceptionWrapper<T>::value, constT &>::type System::Default()
```


| Параметр | Описание |
| --- | --- |
| T | Тип, экземпляр которого возвращается |

## См. также

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Default() method


Возвращает ссылку на единственный экземпляр, созданный конструктором по умолчанию, неисключительного типа.

```cpp
template<typename T> std::enable_if<!IsExceptionWrapper<T>::value, constT &>::type System::Default()
```


| Параметр | Описание |
| --- | --- |
| T | Тип, экземпляр которого возвращается |

## См. также

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
