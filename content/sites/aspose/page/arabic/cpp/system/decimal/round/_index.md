---
title: "طريقة System::Decimal::Round"
linktitle: "تقريب"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Decimal::Round. تقوم بتقريب القيمة المحددة إلى أقرب قيمة مع عدد الأرقام العشرية المحدد. يحدد معلمة سلوك الدالة إذا كانت القيمة المحددة متقاربة بالتساوي من رقمين أقرب في C++."
type: docs
weight: 4400
url: /ar/cpp/system/decimal/round/
---
## Decimal::Round(const Decimal\&, int, MidpointRounding) method


يقرب القيمة المحددة إلى أقرب قيمة بعدد الأرقام العشرية المحدد. يحدد معلمة سلوك الدالة إذا كانت القيمة المحددة متساوية القرب من أقرب عددين.

```cpp
static Decimal System::Decimal::Round(const Decimal &d, int digits, MidpointRounding mode=MidpointRounding::ToEven)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| d | const Decimal\& | القيمة المراد تقريبها |
| أرقام | int | عدد الأرقام العشرية في القيمة المقربة |
| mode | MidpointRounding | يحدد كيفية إجراء التقريب إذا كانت **value** متقاربة بالتساوي من رقمين أقرب. |

### ReturnValue

العدد بعدد الأرقام المحدد الأقرب إلى **value**

## انظر أيضًا

* Class [Decimal](../)
* Enum [MidpointRounding](../../midpointrounding/)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Decimal::Round(const Decimal\&, MidpointRounding) method


يقوم بتقريب القيمة المحددة إلى أقرب عدد صحيح. يحدد معلمة سلوك الدالة إذا كانت القيمة المحددة متساوية القرب من أقرب عددين.

```cpp
static Decimal System::Decimal::Round(const Decimal &d, MidpointRounding mode=MidpointRounding::ToEven)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| d | const Decimal\& | القيمة المراد تقريبها |
| mode | MidpointRounding | يحدد كيفية إجراء التقريب إذا كانت **value** متقاربة بالتساوي من رقمين أقرب. |

### ReturnValue

**d** rounded to the nearest integral value

## انظر أيضًا

* Class [Decimal](../)
* Enum [MidpointRounding](../../midpointrounding/)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
