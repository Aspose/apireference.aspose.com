---
title: "طريقة System::operator-"
linktitle: "operator-"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::operator- . تُعيد نسخة جديدة من فئة Decimal تمثل قيمة هي نتيجة طرح القيمة التي يمثلها كائن Decimal المحدد من القيمة المحددة في C++."
type: docs
weight: 28100
url: /ar/cpp/system/operator-/
---
## System::operator-(const T\&, const Decimal\&) method


تُعيد نسخة جديدة من فئة [Decimal](../decimal/) تمثل قيمة هي نتيجة طرح القيمة التي يمثلها كائن [Decimal](../decimal/) المحدد من القيمة المحددة.

```cpp
template<typename T,typename _> Decimal System::operator-(const T &x, const Decimal &d)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| x | const T\& | القيمة التي يُطرح منها |
| d | const Decimal\& | الكائن [Decimal](../decimal/) الذي يمثل القيمة المخصومة |

### ReturnValue

مثال جديد من فئة [Decimal](../decimal/) التي تمثل قيمة هي نتيجة طرح القيمة الممثلة بـ **d** من **x**.

## انظر أيضًا

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator-(const T1\&, const Nullable\<T2\>\&) method


يطرح القيم غير القابلة للفراغ والقابلة للفراغ.

```cpp
template<typename T1,typename T2,typename> System::Nullable<decltype(some - other.get_Value())> System::operator-(const T1 &some, const Nullable<T2> &other)
```


| Parameter | الوصف |
| --- | --- |
| T1 | نوع العامل الأيسر. |
| T2 | نوع العامل الأيمن. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| بعض | const T1\& | العامل الأيسر. |
| آخر | const Nullable\<T2\>\& | العامل الأيمن. |

### ReturnValue

نتيجة الطرح.

## انظر أيضًا

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator-(DayOfWeek, DayOfWeek) method


يحسب عدد الأيام بين يومين من أيام الأسبوع.

```cpp
auto System::operator-(DayOfWeek a, DayOfWeek b)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| a | DayOfWeek | المُطرح منه |
| b | DayOfWeek | المُطرح |

### ReturnValue

عدد الأيام بين أيام الأسبوع **a** و **b**؛ القيمة المرجعة هي عدد سالب إذا *goes* بعد ****

## انظر أيضًا

* Enum [DayOfWeek](../dayofweek/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator-(MulticastDelegate\<T\>, MulticastDelegate\<T\>) method


يفصل جميع ردود النداء في delegate اليمنى من نهاية قائمة ردود النداء للdelegate اليسرى.

```cpp
template<typename T> MulticastDelegate<T> System::operator-(MulticastDelegate<T> lhv, MulticastDelegate<T> rhv)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| lhv | MulticastDelegate\<T\> | الـ delegate الذي ستُزال منه ردود النداء. |
| rhv | MulticastDelegate\<T\> | الـ delegate الذي ستُزال منه ردود النداء. |

### ReturnValue

يرجع delegate يحتوي على ردود النداء للقيمة اليسرى، ولكن بدون ردود النداء الخاصة بالقيمة اليمنى.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
