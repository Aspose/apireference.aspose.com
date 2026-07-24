---
title: "طريقة System::Equals< float, float >"
linktitle: "يساوي< float, float >"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Equals< float, float >. تخصيص لقيم الفاصلة العائمة ذات الدقة المفردة. على الرغم من أن قيم NaN ذات الفاصلة العائمة تُعرّف وفقًا للمعيار IEC 60559:1989 بأنها دائمًا لا تُقارن كمتساوية، فإن العقد الخاص بـ System.Object.Equals يتطلب أن تتوافق عمليات التجاوز مع متطلبات عامل التكافؤ. لذلك، تُعيد System.Double.Equals و System.Single.Equals القيمة True عند مقارنة قيمتين NaN، بينما يُعيد عامل المساواة القيمة False في تلك الحالة، كما هو مطلوب وفقًا للمعيار في C++."
type: docs
weight: 18400
url: /ar/cpp/system/equals_float,float_/
---
## System::Equals< float, float > method


تخصيص لقيم الفاصلة العائمة ذات الدقة المفردة. على الرغم من أن قيم NaN ذات الفاصلة العائمة تُعرّف وفقًا للمعيار IEC 60559:1989 بأنها دائمًا لا تُقارن كمتساوية، فإن العقد الخاص بـ [System.Object.Equals](../object/equals/) يتطلب أن تتوافق عمليات التجاوز مع متطلبات عامل التكافؤ. لذلك، تُعيد System.Double.Equals و System.Single.Equals القيمة True عند مقارنة قيمتين NaN، بينما يُعيد عامل المساواة القيمة False في تلك الحالة، كما هو مطلوب وفقًا للمعيار.

```cpp
bool System::Equals<float, float>(const float &a, const float &b)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| a | const float\& | المقارنة الأولى |
| b | const float\& | المقارنة الثانية |

### ReturnValue

صحيح إذا كانت القيمتين NaN أو متساويتين، وإلا - خطأ

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
