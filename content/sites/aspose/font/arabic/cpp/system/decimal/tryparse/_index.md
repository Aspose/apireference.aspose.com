---
title: "System::Decimal::TryParse طريقة"
linktitle: "TryParse"
second_title: "Aspose.Font لـ C++"
description: "System::Decimal::TryParse طريقة. يقوم بتحويل السلسلة المحددة التي تحتوي على تمثيل عدد إلى القيمة العشرية المكافئة في C++."
type: docs
weight: 5800
url: /ar/cpp/system/decimal/tryparse/
---
## Decimal::TryParse(const String\&, Decimal\&) method


يقوم بتحويل السلسلة المحددة التي تحتوي على تمثيل عدد إلى القيمة المكافئة من نوع [Decimal](../).

```cpp
static bool System::Decimal::TryParse(const String &value, Decimal &result)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | const String\& | السلسلة المراد تحويلها |
| result | Decimal\& | المرجع إلى متغير [Decimal](../) حيث يتم وضع نتيجة التحويل |

### ReturnValue

صحيح إذا نجحت عملية التحويل، وإلا - خطأ

## انظر أيضًا

* Class [String](../../string/)
* Class [Decimal](../)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Decimal::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, Decimal\&) method


يقوم بتحويل السلسلة المحددة التي تحتوي على تمثيل عدد إلى القيمة المكافئة من نوع [Decimal](../) باستخدام معلومات التنسيق المقدمة ونمط الرقم.

```cpp
static bool System::Decimal::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, Decimal &result)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | const String\& | السلسلة المراد تحويلها |
| الأنماط | Globalization::NumberStyles | تركيبة بتية من قيم تعداد NumberStyles التي تحدد النمط المسموح به لتمثيل السلسلة لعدد. |
| المزود | const SharedPtr\<IFormatProvider\>\& | مؤشر إلى كائن يحتوي على معلومات تنسيق السلسلة |
| result | Decimal\& | معامل إخراج؛ يحتوي على نتيجة التحويل |

### ReturnValue

صحيح إذا نجحت عملية التحويل، وإلا - خطأ

## انظر أيضًا

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Decimal](../)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
