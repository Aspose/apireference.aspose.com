---
title: "طريقة System::DoTryFinally"
linktitle: "DoTryFinally"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::DoTryFinally. الدالة الوحيدة التي تحاكي سلوك جملة try[-catch]-finally في C#''. أثناء ترجمة جملة try[-catch]-finally في C#'' باستخدام خيار المترجم finally_statement_as_lambda المضبوط على true، يتم ترجمة الجملة إلى استدعاء هذه الطريقة في C++."
type: docs
weight: 16500
url: /ar/cpp/system/dotryfinally/
---
## System::DoTryFinally(T\&&, F\&&) method


الدالة الوحيدة التي تحاكي سلوك جملة try[-catch]-finally في C#'. أثناء ترجمة جملة try[-catch]-finally في C# باستخدام خيار المترجم finally_statement_as_lambda المضبوط على true، يتم ترجمة الجملة إلى استدعاء هذه الطريقة.

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_void_void<T>::value> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع كائن الدالة الذي ينفّذ الجزء try[-catch] من جملة try[-catch]-finally التي يتم محاكاتها |
| F | نوع كائن الدالة الذي ينفّذ جزء finally من جملة try[-catch]-finally التي يتم محاكاتها |

| Parameter | Type | الوصف |
| --- | --- | --- |
| tryBlock | T\&& | كائن الدالة الذي يحتوي جسمه على تنفيذ الجزء try[-catch] من جملة try[-catch]-finally التي يتم محاكاتها |
| finallyBlock | F\&& | كائن الدالة الذي يحتوي جسمه على تنفيذ جزء finally من جملة try[-catch]-finally التي يتم محاكاتها |

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DoTryFinally(T\&&, F\&&) method


الدالة الوحيدة التي تحاكي سلوك جملة try[-catch]-finally في C#'. أثناء ترجمة جملة try[-catch]-finally في C# باستخدام خيار المترجم finally_statement_as_lambda المضبوط على true، يتم ترجمة الجملة إلى استدعاء هذه الطريقة. هذا التحميل الزائد يتعامل مع الحالة التي تكون فيها قيمة الإرجاع لكائن الدالة الذي ينفّذ الجزء try[-catch] من جملة try[-catch]-finally من نوع bool.

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_void_boolref<T>::value, bool> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع كائن الدالة الذي ينفّذ الجزء try[-catch] من جملة try[-catch]-finally التي يتم محاكاتها |
| F | نوع كائن الدالة الذي ينفّذ جزء finally من جملة try[-catch]-finally التي يتم محاكاتها |

| Parameter | Type | الوصف |
| --- | --- | --- |
| tryBlock | T\&& | كائن الدالة الذي يحتوي جسمه على تنفيذ الجزء try[-catch] من جملة try[-catch]-finally التي يتم محاكاتها |
| finallyBlock | F\&& | كائن الدالة الذي يحتوي جسمه على تنفيذ جزء finally من جملة try[-catch]-finally التي يتم محاكاتها |

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DoTryFinally(T\&&, F\&&) method


الدالة الوحيدة التي تحاكي سلوك عبارة try[-catch]-finally في C#. أثناء ترجمة عبارة try[-catch]-finally في C# باستخدام خيار المترجم finally_statement_as_lambda مضبوطًا على true، يتم ترجمة العبارة إلى استدعاء هذه الطريقة. هذا التحميل الزائد يتعامل مع الحالة التي تكون فيها قيمة الإرجاع لكائن الدالة الذي ينفذ جزء try[-catch] من عبارة try[-catch]-finally هي bool&.

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_nonovoid_boolref<T>::value, std::optional<Details::ResultOf<T, bool &>>> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع كائن الدالة الذي ينفّذ الجزء try[-catch] من جملة try[-catch]-finally التي يتم محاكاتها |
| F | نوع كائن الدالة الذي ينفّذ جزء finally من جملة try[-catch]-finally التي يتم محاكاتها |

| Parameter | Type | الوصف |
| --- | --- | --- |
| tryBlock | T\&& | كائن الدالة الذي يحتوي جسمه على تنفيذ الجزء try[-catch] من جملة try[-catch]-finally التي يتم محاكاتها |
| finallyBlock | F\&& | كائن الدالة الذي يحتوي جسمه على تنفيذ جزء finally من جملة try[-catch]-finally التي يتم محاكاتها |

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
