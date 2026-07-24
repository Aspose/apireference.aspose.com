---
title: "Метод System::DoTryFinally"
linktitle: "DoTryFinally"
second_title: "Aspose.Page для C++"
description: "Метод System::DoTryFinally. Одиночная функция, эмулирующая поведение оператора try[-catch]-finally языка C#''s. При переводе оператора try[-catch]-finally языка C#''s с параметром translator''s option finally_statement_as_lambda, установленным в true, оператор переводится в вызов этого метода в C++."
type: docs
weight: 16500
url: /ru/cpp/system/dotryfinally/
---
## System::DoTryFinally(T\&&, F\&&) method


Одиночная функция, эмулирующая поведение оператора try[-catch]-finally языка C#'s. При переводе оператора try[-catch]-finally языка C#'s с параметром translator's option finally_statement_as_lambda, установленным в true, оператор переводится в вызов этого метода.

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_void_void<T>::value> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| Параметр | Описание |
| --- | --- |
| T | Тип объектной функции, реализующей часть try[-catch] оператора try[-catch]-finally, который эмулируется. |
| F | Тип объектной функции, реализующей часть finally оператора try[-catch]-finally, который эмулируется. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| tryBlock | T\&& | Объект функции, тело которой содержит реализацию части try[-catch] оператора try[-catch]-finally, который эмулируется. |
| finallyBlock | F\&& | Объект функции, тело которой содержит реализацию части finally оператора try[-catch]-finally, который эмулируется. |

## См. также

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DoTryFinally(T\&&, F\&&) method


Одиночная функция, эмулирующая поведение оператора try[-catch]-finally языка C#'s. При переводе оператора try[-catch]-finally языка C#'s с параметром translator's option finally_statement_as_lambda, установленным в true, оператор переводится в вызов этого метода. Эта перегрузка обрабатывает случай, когда возвращаемое значение объектной функции, реализующей часть try[-catch] оператора try[-catch]-finally, имеет тип bool.

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_void_boolref<T>::value, bool> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| Параметр | Описание |
| --- | --- |
| T | Тип объектной функции, реализующей часть try[-catch] оператора try[-catch]-finally, который эмулируется. |
| F | Тип объектной функции, реализующей часть finally оператора try[-catch]-finally, который эмулируется. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| tryBlock | T\&& | Объект функции, тело которой содержит реализацию части try[-catch] оператора try[-catch]-finally, который эмулируется. |
| finallyBlock | F\&& | Объект функции, тело которой содержит реализацию части finally оператора try[-catch]-finally, который эмулируется. |

## См. также

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DoTryFinally(T\&&, F\&&) method


Единственная функция, имитирующая поведение оператора try[-catch]-finally в C#. При переводе оператора try[-catch]-finally C# с опцией переводчика finally_statement_as_lambda, установленной в true, оператор переводится в вызов этого метода. Эта перегрузка обрабатывает случай, когда возвращаемое значение объект‑функции, реализующей часть try[-catch] оператора try[-catch]-finally, имеет тип bool&.

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_nonovoid_boolref<T>::value, std::optional<Details::ResultOf<T, bool &>>> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| Параметр | Описание |
| --- | --- |
| T | Тип объектной функции, реализующей часть try[-catch] оператора try[-catch]-finally, который эмулируется. |
| F | Тип объектной функции, реализующей часть finally оператора try[-catch]-finally, который эмулируется. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| tryBlock | T\&& | Объект функции, тело которой содержит реализацию части try[-catch] оператора try[-catch]-finally, который эмулируется. |
| finallyBlock | F\&& | Объект функции, тело которой содержит реализацию части finally оператора try[-catch]-finally, который эмулируется. |

## См. также

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
