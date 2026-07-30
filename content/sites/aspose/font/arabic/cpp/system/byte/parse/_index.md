---
title: "طريقة System::Byte::Parse"
linktitle: "تحليل"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Byte::Parse. تُحوِّل السلسلة المحددة التي تحتوي على تمثيل نصي لعدد إلى عدد صحيح غير موقع 8‑بت مكافئ في C++."
type: docs
weight: 100
url: /ar/cpp/system/byte/parse/
---
## Byte::Parse(const String\&) method


يحوّل السلسلة المحددة التي تحتوي على تمثيل عدد إلى عدد صحيح غير موقع 8‑بت مكافئ.

```cpp
static uint8_t System::Byte::Parse(const String &value)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | const String\& | السلسلة للتحويل. |

### ReturnValue

عدد صحيح غير موقع 8‑بت يساوي العدد الممثَّل بالسلسلة المحددة.

## انظر أيضًا

* Class [String](../../string/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Byte::Parse(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) method




```cpp
static uint8_t System::Byte::Parse(const String &value, const SharedPtr<Globalization::CultureInfo> &culture)
```

## انظر أيضًا

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Byte::Parse(const String\&, const SharedPtr\<Globalization::NumberFormatInfo\>\&) method




```cpp
static uint8_t System::Byte::Parse(const String &value, const SharedPtr<Globalization::NumberFormatInfo> &nfi)
```

## انظر أيضًا

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Byte::Parse(const String\&, const SharedPtr\<IFormatProvider\>\&) method


يحوّل السلسلة المحددة التي تحتوي على تمثيل عدد إلى عدد صحيح غير موقع 8‑بت مكافئ باستخدام معلومات التنسيق المقدمة.

```cpp
static uint8_t System::Byte::Parse(const String &value, const SharedPtr<IFormatProvider> &provider)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | const String\& | السلسلة للتحويل. |
| المزود | const SharedPtr\<IFormatProvider\>\& | مؤشر إلى كائن يحتوي على معلومات تنسيق السلسلة. |

### ReturnValue

عدد صحيح غير موقع 8‑بت يساوي العدد الممثَّل بالسلسلة المحددة.

## انظر أيضًا

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Byte::Parse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&) method




```cpp
static uint8_t System::Byte::Parse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::CultureInfo> &culture)
```

## انظر أيضًا

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Byte::Parse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&) method




```cpp
static uint8_t System::Byte::Parse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::NumberFormatInfo> &nfi)
```

## انظر أيضًا

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Byte::Parse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&) method


يحوّل السلسلة المحددة التي تحتوي على تمثيل عدد إلى عدد صحيح غير موقع 8‑بت مكافئ باستخدام معلومات التنسيق المقدمة ونمط الرقم.

```cpp
static uint8_t System::Byte::Parse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | const String\& | السلسلة للتحويل. |
| الأنماط | Globalization::NumberStyles | تركيبة بتية من قيم تعداد NumberStyles تحدد النمط المسموح به لتمثيل السلسلة للعدد. |
| المزود | const SharedPtr\<IFormatProvider\>\& | مؤشر إلى كائن يحتوي على معلومات تنسيق السلسلة. |

### ReturnValue

عدد صحيح غير موقع 8‑بت يساوي العدد الممثَّل بالسلسلة المحددة.

## انظر أيضًا

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Byte::Parse(const String\&, Globalization::NumberStyles, std::nullptr_t) method




```cpp
static uint8_t System::Byte::Parse(const String &value, Globalization::NumberStyles styles, std::nullptr_t=nullptr)
```

## انظر أيضًا

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Byte::Parse(const String\&, std::nullptr_t) method




```cpp
static uint8_t System::Byte::Parse(const String &value, std::nullptr_t)
```

## انظر أيضًا

* Class [String](../../string/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
