---
title: "طريقة System::operator-"
linktitle: "operator-"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::operator-. تُرجع نسخة جديدة من فئة Decimal تمثل قيمة هي نتيجة طرح القيمة التي يمثلها كائن Decimal المحدد من القيمة المحددة في C++."
type: docs
weight: 28200
url: /ar/cpp/system/operator-/
---
## System::operator-(const T\&, const Decimal\&) method


يعيد مثيلاً جديدًا من الفئة [Decimal](../decimal/) التي تمثل قيمة هي نتيجة طرح القيمة الممثلة بواسطة كائن [Decimal](../decimal/) المحدد من القيمة المحددة.

```cpp
template<typename T,typename _> Decimal System::operator-(const T &x, const Decimal &d)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| x | const T\& | القيمة التي سيتم الطرح منها |
| d | const Decimal\& | كائن [Decimal](../decimal/) الذي يمثل القيمة المطروحة |

### ReturnValue

مثيل جديد من الفئة [Decimal](../decimal/) التي تمثل قيمة هي نتيجة طرح القيمة الممثلة بواسطة **d** من **x**.

## انظر أيضًا

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator-(const T1\&, const Nullable\<T2\>\&) method


يطرح القيم غير القابلة للفراغ والقابلة للفراغ.

```cpp
template<typename T1,typename T2,typename> System::Nullable<decltype(some - other.get_Value())> System::operator-(const T1 &some, const Nullable<T2> &other)
```


| معامل | الوصف |
| --- | --- |
| T1 | نوع العامل الأيسر. |
| T2 | نوع العامل الأيمن. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| بعض | const T1\& | العامل الأيسر. |
| أخرى | const Nullable\<T2\>\& | العامل الأيمن. |

### ReturnValue

نتيجة الطرح.

## انظر أيضًا

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator-(DayOfWeek, DayOfWeek) method


يحسب عدد الأيام بين يومين من أيام الأسبوع.

```cpp
auto System::operator-(DayOfWeek a, DayOfWeek b)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| أ | DayOfWeek | المُطرح منه |
| b | DayOfWeek | المُطرح |

### ReturnValue

عدد الأيام بين أيام الأسبوع **a** و **b**؛ القيمة المرجعة هي عدد سالب إذا *goes* after ****

## انظر أيضًا

* Enum [DayOfWeek](../dayofweek/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator-(MulticastDelegate\<T\>, MulticastDelegate\<T\>) method


يفصل جميع ردود النداء في المفوضية اليمنى من نهاية قائمة ردود النداء في المفوضية اليسرى.

```cpp
template<typename T> MulticastDelegate<T> System::operator-(MulticastDelegate<T> lhv, MulticastDelegate<T> rhv)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| lhv | MulticastDelegate\<T\> | المفوضية التي ستُزال منها ردود النداء. |
| rhv | MulticastDelegate\<T\> | المفوضية التي ستُزال ردود النداء الخاصة بها. |

### ReturnValue

يعيد مفوضية تحتوي على ردود النداء للقيمة اليسرى، ولكن بدون ردود النداء للقيمة اليمنى.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
