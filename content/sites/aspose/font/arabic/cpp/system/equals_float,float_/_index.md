---
title: "طريقة System::Equals< float, float >"
linktitle: "يساوي< float, float >"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Equals< float, float >. تخصيص للقيم العائمة ذات الدقة المفردة. على الرغم من أن قيم NaN العائمة تُعرّف وفقًا لـ IEC 60559:1989 بأنها دائمًا لا تُقارن كمتساوية، فإن العقدة الخاصة بـ System.Object.Equals تتطلب أن تُلبي التجاوزات متطلبات عامل التكافؤ. لذلك، تُعيد System.Double.Equals و System.Single.Equals القيمة True عند مقارنة قيمتين NaN، بينما يُعيد عامل المساواة القيمة False في تلك الحالة، كما هو مطلوب في المعيار في C++."
type: docs
weight: 18500
url: /ar/cpp/system/equals_float,float_/
---
## System::Equals< float, float > method


تخصيص للقيم العائمة ذات الدقة المفردة. على الرغم من أن قيم NaN العائمة تُعرّف وفقًا لـ IEC 60559:1989 بأنها دائمًا لا تُقارن كمتساوية، فإن العقدة الخاصة بـ [System.Object.Equals](../object/equals/) تتطلب أن تُلبي التجاوزات متطلبات عامل التكافؤ. لذلك، تُعيد System.Double.Equals و System.Single.Equals القيمة True عند مقارنة قيمتين NaN، بينما يُعيد عامل المساواة القيمة False في تلك الحالة، كما هو مطلوب في المعيار.

```cpp
bool System::Equals<float, float>(const float &a, const float &b)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| أ | const float\& | المقارن الأول |
| b | const float\& | المقارن الثاني |

### ReturnValue

True إذا كانت القيمتين NaN أو متساويتين، وإلا - false

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
