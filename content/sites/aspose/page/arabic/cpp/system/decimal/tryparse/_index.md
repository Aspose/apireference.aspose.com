---
title: "طريقة System::Decimal::TryParse"
linktitle: "TryParse"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Decimal::TryParse. تقوم بتحويل السلسلة المحددة التي تحتوي على تمثيل عدد إلى قيمة Decimal مكافئة في C++."
type: docs
weight: 5800
url: /ar/cpp/system/decimal/tryparse/
---
## Decimal::TryParse(const String\&, Decimal\&) method


يقوم بتحويل السلسلة المحددة التي تحتوي على تمثيل عدد إلى قيمة [Decimal](../) مكافئة.

```cpp
static bool System::Decimal::TryParse(const String &value, Decimal &result)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const String\& | السلسلة المراد تحويلها |
| result | Decimal\& | المرجع إلى متغيّر [Decimal](../) حيث يتم وضع نتيجة التحويل |

### ReturnValue

صحيح إذا نجح التحويل، وإلا - خطأ

## انظر أيضًا

* Class [String](../../string/)
* Class [Decimal](../)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Decimal::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, Decimal\&) method


يقوم بتحويل السلسلة المحددة التي تحتوي على تمثيل عدد إلى قيمة [Decimal](../) مكافئة باستخدام معلومات التنسيق المقدمة ونمط الرقم.

```cpp
static bool System::Decimal::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, Decimal &result)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const String\& | السلسلة المراد تحويلها |
| styles | Globalization::NumberStyles | تركيبة بتية من قيم تعداد NumberStyles التي تحدد النمط المسموح به لتمثيل السلسلة لعدد. |
| مزود | const SharedPtr\<IFormatProvider\>\& | مؤشر إلى كائن يحتوي على معلومات تنسيق السلسلة |
| النتيجة | Decimal\\& | معامل إخراج؛ يحتوي على نتيجة التحويل |

### ReturnValue

صحيح إذا نجح التحويل، وإلا - خطأ

## انظر أيضًا

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Decimal](../)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
