---
title: "System::DoTryFinally метод"
linktitle: "DoTryFinally"
second_title: "Aspose.Font для C++"
description: "System::DoTryFinally метод. Одна функция, эмулирующая поведение оператора C#''s try[-catch]-finally. При переводе оператора C#''s try[-catch]-finally с опцией translator''s finally_statement_as_lambda, установленной в true, оператор переводится в вызов этого метода в C++."
type: docs
weight: 16600
url: /ru/cpp/system/dotryfinally/
---
## System::DoTryFinally(T\&&, F\&&) method


Одна функция, эмулирующая поведение оператора C#'s try[-catch]-finally. При переводе оператора C#'s try[-catch]-finally с опцией translator's finally_statement_as_lambda, установленной в true, оператор переводится в вызов этого метода.

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_void_void<T>::value> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| Параметр | Описание |
| --- | --- |
| T | Тип объект‑функции, реализующей часть try[-catch] оператора try[-catch]-finally, который эмулируется. |
| F | Тип объект‑функции, реализующей часть finally оператора try[-catch]-finally, который эмулируется. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| tryBlock | T\&& | Объект‑функция, тело которого содержит реализацию части try[-catch] оператора try[-catch]-finally, который эмулируется. |
| finallyBlock | F\&& | Объект‑функция, тело которого содержит реализацию части finally оператора try[-catch]-finally, который эмулируется. |

## См. также

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DoTryFinally(T\&&, F\&&) method


Единственная функция, эмулирующая поведение оператора try[-catch]-finally в C#. При переводе оператора try[-catch]-finally C# с опцией переводчика finally_statement_as_lambda, установленной в true, оператор переводится в вызов этого метода. Эта перегрузка обрабатывает случай, когда возвращаемое значение объектом функции, реализующей часть try[-catch] оператора try[-catch]-finally, имеет тип bool.

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_void_boolref<T>::value, bool> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| Параметр | Описание |
| --- | --- |
| T | Тип объект‑функции, реализующей часть try[-catch] оператора try[-catch]-finally, который эмулируется. |
| F | Тип объект‑функции, реализующей часть finally оператора try[-catch]-finally, который эмулируется. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| tryBlock | T\&& | Объект‑функция, тело которого содержит реализацию части try[-catch] оператора try[-catch]-finally, который эмулируется. |
| finallyBlock | F\&& | Объект‑функция, тело которого содержит реализацию части finally оператора try[-catch]-finally, который эмулируется. |

## См. также

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DoTryFinally(T\&&, F\&&) method


Единственная функция, эмулирующая поведение оператора try[-catch]-finally в C#. При переводе оператора try[-catch]-finally C# с опцией переводчика finally_statement_as_lambda, установленной в true, оператор переводится в вызов этого метода. Эта перегрузка обрабатывает случай, когда возвращаемое значение объектом функции, реализующей часть try[-catch] оператора try[-catch]-finally, имеет тип bool&.

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_nonovoid_boolref<T>::value, std::optional<Details::ResultOf<T, bool &>>> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| Параметр | Описание |
| --- | --- |
| T | Тип объект‑функции, реализующей часть try[-catch] оператора try[-catch]-finally, который эмулируется. |
| F | Тип объект‑функции, реализующей часть finally оператора try[-catch]-finally, который эмулируется. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| tryBlock | T\&& | Объект‑функция, тело которого содержит реализацию части try[-catch] оператора try[-catch]-finally, который эмулируется. |
| finallyBlock | F\&& | Объект‑функция, тело которого содержит реализацию части finally оператора try[-catch]-finally, который эмулируется. |

## См. также

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
