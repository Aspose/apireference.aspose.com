---
title: "Метод System::Is"
linktitle: "Is"
second_title: "Aspose.Font для C++"
description: "Метод System::Is. Функция сопоставления верхнего уровня. Применяет шаблон к значению в C++."
type: docs
weight: 22000
url: /ru/cpp/system/is/
---
## System::Is(const E\&, const A\&) method


Функция сопоставления верхнего уровня. Применяет шаблон к значению.

```cpp
template<typename A,typename E> std::enable_if_t<std::is_base_of<Details::Pattern, A>::value, bool> System::Is(const E &e, const A &a)
```


| Параметр | Описание |
| --- | --- |
| A | Тип шаблона (должен наследоваться от Details::Pattern). |
| E | Тип значения для сопоставления. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| e | const E\\& | Значение для сопоставления. |
| a | const A\\& | Шаблон для применения. |

### ReturnValue

true, если шаблон соответствует значению.

## См. также

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Is(const ExpressionT\&, const ConstantT\&) method


Реализует перевод константного шаблона 'is'.

```cpp
template<class ExpressionT,class ConstantT> std::enable_if_t<!std::is_base_of<Details::Pattern, ConstantT>::value, bool> System::Is(const ExpressionT &left, const ConstantT &constant)
```


| Параметр | Описание |
| --- | --- |
| ExpressionT | тип левого выражения. |
| ConstantT | тип константного выражения. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| лево | const ExpressionT\& | выражение, которое будет проверяться. |
| константа | const ConstantT\& | выражение, которое будет сравниваться с левым. |

### ReturnValue

true, если проверка типа прошла успешно, иначе false.

## См. также

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Is(const ExpressionT\&, ResultT\&) method


Реализует перевод шаблона объявления 'is'.

```cpp
template<class PatternT,class ExpressionT,class ResultT> bool System::Is(const ExpressionT &left, ResultT &result)
```


| Параметр | Описание |
| --- | --- |
| PatternT | тип для проверки. |
| ExpressionT | тип левого выражения. |
| ResultT | тип выражения результата. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| лево | const ExpressionT\& | выражение, которое будет проверяться. |
| result | ResultT\& | переменная, которой будет присвоен проверенный тип. |

### ReturnValue

true, если проверка типа прошла успешно, иначе false.

## См. также

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
