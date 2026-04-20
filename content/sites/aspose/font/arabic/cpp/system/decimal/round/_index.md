---
title: "طريقة System::Decimal::Round"
linktitle: "تقريب"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Decimal::Round. تقوم بتقريب القيمة المحددة إلى أقرب قيمة مع عدد الأرقام العشرية المحدد. يحدد معامل سلوك الدالة إذا كانت القيمة المحددة متساوية القرب من رقمين أقرب في C++."
type: docs
weight: 4400
url: /ar/cpp/system/decimal/round/
---
## Decimal::Round(const Decimal\&, int, MidpointRounding) method


يقرب القيمة المحددة إلى أقرب قيمة بعدد محدد من الأرقام العشرية. يحدد معامل سلوك الدالة إذا كانت القيمة المحددة متساوية القرب من عددين أقرب.

```cpp
static Decimal System::Decimal::Round(const Decimal &d, int digits, MidpointRounding mode=MidpointRounding::ToEven)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| d | const Decimal\& | القيمة المراد تقريبها |
| الأرقام | int | عدد الأرقام العشرية في القيمة المقربة |
| mode | MidpointRounding | يحدد كيفية إجراء التقريب إذا كانت **value** متساوية القرب من رقمين أقرب. |

### ReturnValue

العدد بعدد الأرقام المحدد الأقرب إلى **value**

## انظر أيضًا

* Class [Decimal](../)
* Enum [MidpointRounding](../../midpointrounding/)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Decimal::Round(const Decimal\&, MidpointRounding) method


يقرب القيمة المحددة إلى أقرب عدد صحيح. يحدد معامل سلوك الدالة إذا كانت القيمة المحددة متساوية القرب من عددين أقرب.

```cpp
static Decimal System::Decimal::Round(const Decimal &d, MidpointRounding mode=MidpointRounding::ToEven)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| d | const Decimal\& | القيمة المراد تقريبها |
| mode | MidpointRounding | يحدد كيفية إجراء التقريب إذا كانت **value** متساوية القرب من رقمين أقرب. |

### ReturnValue

**d** rounded to the nearest integral value

## انظر أيضًا

* Class [Decimal](../)
* Enum [MidpointRounding](../../midpointrounding/)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
