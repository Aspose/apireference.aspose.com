---
title: "Метод System::Default"
linktitle: "Default"
second_title: "Aspose.Font для C++"
description: "Метод System::Default. Возвращает ссылку на единственный экземпляр типа исключения, созданный конструктором по умолчанию, в C++."
type: docs
weight: 16300
url: /ru/cpp/system/default/
---
## System::Default() method


Возвращает ссылку на единственный экземпляр типа исключения, созданный конструктором по умолчанию.

```cpp
template<typename T> std::enable_if<IsExceptionWrapper<T>::value, constT &>::type System::Default()
```


| Параметр | Описание |
| --- | --- |
| T | Тип, экземпляр которого возвращается |

## См. также

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Default() method


Возвращает ссылку на единственный экземпляр не-исключительного типа, созданный конструктором по умолчанию.

```cpp
template<typename T> std::enable_if<!IsExceptionWrapper<T>::value, constT &>::type System::Default()
```


| Параметр | Описание |
| --- | --- |
| T | Тип, экземпляр которого возвращается |

## См. также

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
