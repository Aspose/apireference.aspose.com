---
title: "طريقة System::Is"
linktitle: "هو"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Is. دالة مطابقة على المستوى الأعلى. تطبق نمطًا على قيمة في C++."
type: docs
weight: 22000
url: /ar/cpp/system/is/
---
## System::Is(const E\&, const A\&) method


دالة مطابقة على المستوى الأعلى. تطبق نمطًا على قيمة.

```cpp
template<typename A,typename E> std::enable_if_t<std::is_base_of<Details::Pattern, A>::value, bool> System::Is(const E &e, const A &a)
```


| معامل | الوصف |
| --- | --- |
| A | نوع النمط (يجب أن يرث من Details::Pattern). |
| E | نوع القيمة التي سيتم مطابقتها. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| e | const E\& | القيمة للمطابقة ضدها. |
| أ | const A\& | النمط لتطبيقه. |

### ReturnValue

صحيح إذا كان النمط يطابق القيمة.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Is(const ExpressionT\&, const ConstantT\&) method


ينفّذ ترجمة نمط ثابت 'is'.

```cpp
template<class ExpressionT,class ConstantT> std::enable_if_t<!std::is_base_of<Details::Pattern, ConstantT>::value, bool> System::Is(const ExpressionT &left, const ConstantT &constant)
```


| معامل | الوصف |
| --- | --- |
| ExpressionT | نوع التعبير الأيسر. |
| ConstantT | نوع التعبير الثابت. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| يسار | const ExpressionT\& | التعبير الذي سيتم فحصه. |
| ثابت | const ConstantT\& | التعبير الذي سيتم مقارنته بالجانب الأيسر. |

### ReturnValue

صحيح إذا نجح فحص النوع، خطأ خلاف ذلك.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Is(const ExpressionT\&, ResultT\&) method


ينفّذ ترجمة نمط إعلان 'is'.

```cpp
template<class PatternT,class ExpressionT,class ResultT> bool System::Is(const ExpressionT &left, ResultT &result)
```


| معامل | الوصف |
| --- | --- |
| PatternT | النوع للتحقق منه. |
| ExpressionT | نوع التعبير الأيسر. |
| ResultT | نوع تعبير النتيجة. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| يسار | const ExpressionT\& | التعبير الذي سيتم فحصه. |
| result | ResultT\& | المتغيّر الذي سيُعيّن إلى النوع المفحوص. |

### ReturnValue

صحيح إذا نجح فحص النوع، خطأ خلاف ذلك.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
