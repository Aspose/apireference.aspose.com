---
title: "طريقة System::Is"
linktitle: "هل"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Is. دالة مطابقة على المستوى الأعلى. تطبق نمطًا على قيمة في C++."
type: docs
weight: 21900
url: /ar/cpp/system/is/
---
## System::Is(const E\&, const A\&) method


دالة مطابقة على المستوى الأعلى. تطبق نمطًا على قيمة.

```cpp
template<typename A,typename E> std::enable_if_t<std::is_base_of<Details::Pattern, A>::value, bool> System::Is(const E &e, const A &a)
```


| Parameter | الوصف |
| --- | --- |
| A | نوع النمط (يجب أن يرث من Details::Pattern). |
| E | نوع القيمة التي سيتم مطابقتها. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| e | const E\& | القيمة للمطابقة ضدها. |
| a | const A\& | النمط لتطبيقه. |

### ReturnValue

صحيح إذا كان النمط يطابق القيمة.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Is(const ExpressionT\&, const ConstantT\&) method


ينفذ ترجمة نمط ثابت 'is'.

```cpp
template<class ExpressionT,class ConstantT> std::enable_if_t<!std::is_base_of<Details::Pattern, ConstantT>::value, bool> System::Is(const ExpressionT &left, const ConstantT &constant)
```


| Parameter | الوصف |
| --- | --- |
| ExpressionT | نوع التعبير الأيسر. |
| ConstantT | نوع التعبير الثابت. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| يسار | const ExpressionT\& | التعبير الذي سيتم فحصه. |
| ثابت | const ConstantT\& | التعبير الذي سيتم مقارنته بالجانب الأيسر. |

### ReturnValue

true إذا كان فحص النوع ناجحًا، false وإلا.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Is(const ExpressionT\&, ResultT\&) method


ينفذ ترجمة نمط إعلان 'is'.

```cpp
template<class PatternT,class ExpressionT,class ResultT> bool System::Is(const ExpressionT &left, ResultT &result)
```


| Parameter | الوصف |
| --- | --- |
| PatternT | النوع للتحقق منه. |
| ExpressionT | نوع التعبير الأيسر. |
| ResultT | نوع تعبير النتيجة. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| يسار | const ExpressionT\& | التعبير الذي سيتم فحصه. |
| النتيجة | ResultT\& | المتغيّر الذي سيُعيّن إلى النوع المفحوص. |

### ReturnValue

true إذا كان فحص النوع ناجحًا، false وإلا.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
