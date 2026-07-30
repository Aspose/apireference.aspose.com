---
title: "Метод System::Ref"
linktitle: "Ref"
second_title: "Aspose.Font для C++"
description: "Метод System::Ref. Обёртка, обеспечивающая работу Ref(std::ref(DynamicWeakPtr)) в C++."
type: docs
weight: 36700
url: /ru/cpp/system/ref/
---
## System::Ref(const std::reference_wrapper\<T\>\&) method


Обёртка, обеспечивающая работу Ref(std::ref(DynamicWeakPtr)).

```cpp
template<typename T> decltype(Ref(std::declval<T &>())) System::Ref(const std::reference_wrapper<T> &wrapper)
```


| Параметр | Описание |
| --- | --- |
| T | Ссылаемый тип. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| обёртка | const std::reference_wrapper\<T\>\& | std-обёртка для развёртывания. |

### ReturnValue

Тип ссылки, определённый в [System](../)::, а не в std.

## См. также

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Ref(DynamicWeakPtr\<T, trunkMode, weakLeafs...\>\&) method


Создаёт ссылку на объект [DynamicWeakPtr](../dynamicweakptr/). Используется транслятором при передаче аргументов функции по ссылке.

```cpp
template<typename T,SmartPtrMode,unsigned int ...> DynamicWeakPtr<T, trunkMode, weakLeafs...>::Reference System::Ref(DynamicWeakPtr<T, trunkMode, weakLeafs...> &ptr)
```


| Параметр | Описание |
| --- | --- |
| T | Тип указателя. |
| trunkMode | Режим самого smart pointer. |
| weakLeafs | Индексы параметров шаблона, для которых необходимо вызвать метод SetTemplateWeakPtr. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| ptr | DynamicWeakPtr\<T, trunkMode, weakLeafs...\>\& | Smart pointer для создания ссылки на. |

### ReturnValue

Ссылка smart pointer.

## См. также

* Class [DynamicWeakPtr](../dynamicweakptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Ref(T\&) method


Вспомогательная функция для получения ссылок на объекты. Используется для гарантии того, что [System::DynamicWeakPtr](../dynamicweakptr/) обновляет ссылочный объект после присваиваний.

```cpp
template<typename T> T & System::Ref(T &value)
```


| Параметр | Описание |
| --- | --- |
| T | Тип для создания ссылки на. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | T\& | Значение для создания ссылки на. |

### ReturnValue

Ссылка на значение, переданное в эту функцию.

## См. также

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
