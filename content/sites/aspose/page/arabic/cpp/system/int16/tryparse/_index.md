---
title: "طريقة System::Int16::TryParse"
linktitle: "TryParse"
second_title: "Aspose.Page لـ C++"
description: "كيفية استخدام طريقة TryParse من فئة System::Int16 في C++."
type: docs
weight: 200
url: /ar/cpp/system/int16/tryparse/
---
## Int16::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, int16_t\&) method




```cpp
static bool System::Int16::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::CultureInfo> &culture, int16_t &result)
```

## انظر أيضًا

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int16::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, int16_t\&) method




```cpp
static bool System::Int16::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::NumberFormatInfo> &nfi, int16_t &result)
```

## انظر أيضًا

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int16::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, int16_t\&) method


يحوّل السلسلة المحددة التي تحتوي على تمثيل نصي لعدد إلى عدد صحيح موقع 16‑بت مكافئ باستخدام معلومات التنسيق المقدمة ونمط الرقم.

```cpp
static bool System::Int16::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, int16_t &result)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const String\& | السلسلة للتحويل. |
| styles | Globalization::NumberStyles | تركيبة بتية من قيم تعداد NumberStyles التي تحدد النمط المسموح به لتمثيل العدد كنص. |
| مزود | const SharedPtr\<IFormatProvider\>\& | مؤشر إلى كائن يحتوي على معلومات تنسيق السلسلة. |
| النتيجة | int16_t\& | المرجع إلى متغيّر عدد صحيح موقع 16‑بت حيث يُوضع نتيجة التحويل. |

### ReturnValue

صحيح إذا نجحت عملية التحويل، وإلا - خطأ.

## انظر أيضًا

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int16::TryParse(const String\&, Globalization::NumberStyles, std::nullptr_t, int16_t\&) method




```cpp
static bool System::Int16::TryParse(const String &value, Globalization::NumberStyles styles, std::nullptr_t, int16_t &result)
```

## انظر أيضًا

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int16::TryParse(const String\&, int16_t\&) method


يحوّل السلسلة المحددة التي تحتوي على تمثيل نصي لعدد إلى عدد صحيح موقع 16‑بت مكافئ.

```cpp
static bool System::Int16::TryParse(const String &value, int16_t &result)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const String\& | السلسلة للتحويل. |
| النتيجة | int16_t\& | المرجع إلى متغيّر عدد صحيح موقع 16‑بت حيث يُوضع نتيجة التحويل. |

### ReturnValue

صحيح إذا نجحت عملية التحويل، وإلا - خطأ.

## انظر أيضًا

* Class [String](../../string/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
