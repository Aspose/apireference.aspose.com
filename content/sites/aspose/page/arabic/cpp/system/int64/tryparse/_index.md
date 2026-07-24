---
title: "System::Int64::TryParse method"
linktitle: "TryParse"
second_title: "Aspose.Page لـ C++"
description: "كيفية استخدام طريقة TryParse من فئة System::Int64 في C++."
type: docs
weight: 200
url: /ar/cpp/system/int64/tryparse/
---
## Int64::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, int64_t\&) method




```cpp
static bool System::Int64::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::CultureInfo> &culture, int64_t &result)
```

## انظر أيضًا

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int64::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, int64_t\&) method




```cpp
static bool System::Int64::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::NumberFormatInfo> &nfi, int64_t &result)
```

## انظر أيضًا

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int64::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, int64_t\&) method


يحوّل السلسلة المحددة التي تحتوي على تمثيل نصي لعدد إلى عدد صحيح موقع 64‑بت مكافئ باستخدام معلومات التنسيق المقدمة ونمط الرقم.

```cpp
static bool System::Int64::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, int64_t &result)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const String\& | السلسلة للتحويل. |
| styles | Globalization::NumberStyles | تركيبة بتية من قيم تعداد NumberStyles التي تحدد النمط المسموح به لتمثيل العدد كنص. |
| مزود | const SharedPtr\<IFormatProvider\>\& | مؤشر إلى كائن يحتوي على معلومات تنسيق السلسلة. |
| النتيجة | int64_t\& | المرجع إلى متغيّر عدد صحيح موقع 64-بت حيث يتم وضع نتيجة التحويل. |

### ReturnValue

صحيح إذا نجحت عملية التحويل، وإلا - خطأ.

## انظر أيضًا

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int64::TryParse(const String\&, Globalization::NumberStyles, std::nullptr_t, int64_t\&) method




```cpp
static bool System::Int64::TryParse(const String &value, Globalization::NumberStyles styles, std::nullptr_t, int64_t &result)
```

## انظر أيضًا

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int64::TryParse(const String\&, int64_t\&) method


يحوّل السلسلة المحددة التي تحتوي على تمثيل نصي لعدد إلى عدد صحيح موقع 64‑بت مكافئ.

```cpp
static bool System::Int64::TryParse(const String &value, int64_t &result)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const String\& | السلسلة للتحويل. |
| النتيجة | int64_t\& | المرجع إلى متغيّر عدد صحيح موقع 64-بت حيث يتم وضع نتيجة التحويل. |

### ReturnValue

صحيح إذا نجحت عملية التحويل، وإلا - خطأ.

## انظر أيضًا

* Class [String](../../string/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
