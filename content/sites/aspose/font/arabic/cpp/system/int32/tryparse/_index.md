---
title: "طريقة System::Int32::TryParse"
linktitle: "TryParse"
second_title: "Aspose.Font لـ C++"
description: "كيفية استخدام طريقة TryParse في فئة System::Int32 في C++."
type: docs
weight: 200
url: /ar/cpp/system/int32/tryparse/
---
## Int32::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, int32_t\&) method




```cpp
static bool System::Int32::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::CultureInfo> &culture, int32_t &result)
```

## انظر أيضًا

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Int32::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, int32_t\&) method




```cpp
static bool System::Int32::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::NumberFormatInfo> &nfi, int32_t &result)
```

## انظر أيضًا

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Int32::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, int32_t\&) method


يحوّل السلسلة المحددة التي تحتوي على تمثيل عدد إلى عدد صحيح موقع 32‑بت مكافئ باستخدام معلومات التنسيق المقدمة ونمط الرقم.

```cpp
static bool System::Int32::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, int32_t &result)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | const String\& | السلسلة للتحويل. |
| الأنماط | Globalization::NumberStyles | تركيبة بتية من قيم تعداد NumberStyles تحدد النمط المسموح به لتمثيل السلسلة للعدد. |
| المزود | const SharedPtr\<IFormatProvider\>\& | مؤشر إلى كائن يحتوي على معلومات تنسيق السلسلة. |
| result | int32_t\& | المرجع إلى متغيّر صحيح موقع 32-بت حيث يتم وضع نتيجة التحويل. |

### ReturnValue

صحيح إذا نجح التحويل، وإلا - خطأ.

## انظر أيضًا

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Int32::TryParse(const String\&, Globalization::NumberStyles, std::nullptr_t, int32_t\&) method




```cpp
static bool System::Int32::TryParse(const String &value, Globalization::NumberStyles styles, std::nullptr_t, int32_t &result)
```

## انظر أيضًا

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Int32::TryParse(const String\&, int32_t\&) method


يحوّل السلسلة المحددة التي تحتوي على تمثيل عدد إلى عدد صحيح موقع 32‑بت مكافئ.

```cpp
static bool System::Int32::TryParse(const String &value, int32_t &result)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | const String\& | السلسلة للتحويل. |
| result | int32_t\& | المرجع إلى متغيّر صحيح موقع 32-بت حيث يتم وضع نتيجة التحويل. |

### ReturnValue

صحيح إذا نجح التحويل، وإلا - خطأ.

## انظر أيضًا

* Class [String](../../string/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
