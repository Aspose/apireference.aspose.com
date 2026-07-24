---
title: "System::SafeInvoke method"
linktitle: "SafeInvoke"
second_title: "Aspose.Page для C++"
description: "System::SafeInvoke method. Реализация перевода оператора ''?.'' в C++."
type: docs
weight: 36900
url: /ru/cpp/system/safeinvoke/
---
## System::SafeInvoke method


Реализация перевода оператора '?.'.

```cpp
template<typename T0,typename T1> static auto System::SafeInvoke(T0 expr, T1 func)
```


| Параметр | Описание |
| --- | --- |
| T0 | тип выражения. |
| T1 | Тип лямбда-выражения, инкапсулирующего выражение 'WhenTrue'. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| expr | T0 | значение выражения. |
| func | T1 | Выражение 'WhenTrue', привязанное к функциональному объекту. |

### ReturnValue

Если значение expr не равно null, возвращает func, вызываемый с его значением в качестве первого аргумента, иначе возвращает null.

## См. также

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
