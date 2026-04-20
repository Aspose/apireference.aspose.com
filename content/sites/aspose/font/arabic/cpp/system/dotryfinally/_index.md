---
title: "طريقة System::DoTryFinally"
linktitle: "نفذ محاولة أخيرًا"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::DoTryFinally. الدالة الوحيدة التي تحاكي سلوك بيان try[-catch]-finally في C#''. أثناء ترجمة بيان try[-catch]-finally في C#'' باستخدام خيار translator'' finally_statement_as_lambda المُعيَّن إلى true، يتم ترجمة البيان إلى استدعاء هذه الطريقة في C++."
type: docs
weight: 16600
url: /ar/cpp/system/dotryfinally/
---
## System::DoTryFinally(T\&&, F\&&) method


الدالة الوحيدة التي تحاكي سلوك بيان try[-catch]-finally في C#'s. أثناء ترجمة بيان try[-catch]-finally في C#'s باستخدام خيار translator's finally_statement_as_lambda المُعيَّن إلى true، يتم ترجمة البيان إلى استدعاء هذه الطريقة.

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_void_void<T>::value> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| معامل | الوصف |
| --- | --- |
| T | نوع كائن الدالة الذي ينفّذ الجزء try[-catch] من بيان try[-catch]-finally الذي يتم محاكاته |
| F | نوع كائن الدالة الذي ينفّذ الجزء finally من بيان try[-catch]-finally الذي يتم محاكاته |

| معامل | نوع | الوصف |
| --- | --- | --- |
| tryBlock | T\&& | كائن الدالة الذي يحتوي جسمه على تنفيذ الجزء try[-catch] من بيان try[-catch]-finally الذي يتم محاكاته |
| finallyBlock | F\&& | كائن الدالة الذي يحتوي جسمه على تنفيذ الجزء finally من بيان try[-catch]-finally الذي يتم محاكاته |

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DoTryFinally(T\&&, F\&&) method


الدالة الوحيدة التي تحاكي سلوك عبارة try[-catch]-finally في C#. أثناء ترجمة عبارة try[-catch]-finally في C# باستخدام خيار المترجم finally_statement_as_lambda مضبوطًا على true، يتم ترجمة العبارة إلى استدعاء هذه الطريقة. هذا التحميل الزائد يتعامل مع الحالة التي تكون فيها قيمة الإرجاع لكائن الدالة الذي ينفذ جزء try[-catch] من عبارة try[-catch]-finally هي bool.

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_void_boolref<T>::value, bool> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| معامل | الوصف |
| --- | --- |
| T | نوع كائن الدالة الذي ينفّذ الجزء try[-catch] من بيان try[-catch]-finally الذي يتم محاكاته |
| F | نوع كائن الدالة الذي ينفّذ الجزء finally من بيان try[-catch]-finally الذي يتم محاكاته |

| معامل | نوع | الوصف |
| --- | --- | --- |
| tryBlock | T\&& | كائن الدالة الذي يحتوي جسمه على تنفيذ الجزء try[-catch] من بيان try[-catch]-finally الذي يتم محاكاته |
| finallyBlock | F\&& | كائن الدالة الذي يحتوي جسمه على تنفيذ الجزء finally من بيان try[-catch]-finally الذي يتم محاكاته |

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DoTryFinally(T\&&, F\&&) method


الدالة الوحيدة التي تحاكي سلوك عبارة try[-catch]-finally في C#. أثناء ترجمة عبارة try[-catch]-finally في C# باستخدام خيار المترجم finally_statement_as_lambda مضبوطًا على true، يتم ترجمة العبارة إلى استدعاء هذه الطريقة. هذا التحميل الزائد يتعامل مع الحالة التي تكون فيها قيمة الإرجاع لكائن الدالة الذي ينفذ جزء try[-catch] من عبارة try[-catch]-finally هي bool&.

```cpp
template<typename T,typename F> std::enable_if_t<Details::is_lambda_nonovoid_boolref<T>::value, std::optional<Details::ResultOf<T, bool &>>> System::DoTryFinally(T &&tryBlock, F &&finallyBlock)
```


| معامل | الوصف |
| --- | --- |
| T | نوع كائن الدالة الذي ينفّذ الجزء try[-catch] من بيان try[-catch]-finally الذي يتم محاكاته |
| F | نوع كائن الدالة الذي ينفّذ الجزء finally من بيان try[-catch]-finally الذي يتم محاكاته |

| معامل | نوع | الوصف |
| --- | --- | --- |
| tryBlock | T\&& | كائن الدالة الذي يحتوي جسمه على تنفيذ الجزء try[-catch] من بيان try[-catch]-finally الذي يتم محاكاته |
| finallyBlock | F\&& | كائن الدالة الذي يحتوي جسمه على تنفيذ الجزء finally من بيان try[-catch]-finally الذي يتم محاكاته |

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
