---
title: "System::MakeObject method"
linktitle: "MakeObject"
second_title: "Aspose.Font для C++"
description: "Метод System::MakeObject. Создает объект в куче и возвращает shared pointer на него в C++."
type: docs
weight: 24600
url: /ru/cpp/system/makeobject/
---
## System::MakeObject(Args\&&...) method


Создает объект в куче и возвращает shared pointer на него.

```cpp
template<class T,class ...> std::enable_if<!IsSmartPtr<T>::value, SmartPtr<T>>::type System::MakeObject(Args &&... args)
```


| Параметр | Описание |
| --- | --- |
| T | Класс для создания экземпляра. |
| Аргументы | Типы аргументов конструктора. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| args | Args\&&... | Аргументы конструктора. |

### ReturnValue

[SmartPtr](../smartptr/) to newly created object, always in shared mode.

## См. также

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::MakeObject(Args\&&...) method


Создает объект в куче и возвращает shared pointer на него.

```cpp
template<class T,class ...> std::enable_if<IsSmartPtr<T>::value, T>::type System::MakeObject(Args &&... args)
```


| Параметр | Описание |
| --- | --- |
| T | [SmartPtr](../smartptr/) к классу для создания экземпляра. |
| Аргументы | Типы аргументов конструктора. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| args | Args\&&... | Аргументы конструктора. |

### ReturnValue

[SmartPtr](../smartptr/) to newly created object, always in shared mode.

## См. также

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
