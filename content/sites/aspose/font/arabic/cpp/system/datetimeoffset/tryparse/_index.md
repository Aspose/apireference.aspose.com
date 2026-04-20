---
title: "طريقة System::DateTimeOffset::TryParse"
linktitle: "TryParse"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::DateTimeOffset::TryParse. تحاول تحويل السلسلة المحددة إلى كائن DateTimeOffset باستخدام موفر التنسيق المحدد ونمط التنسيق في C++."
type: docs
weight: 5700
url: /ar/cpp/system/datetimeoffset/tryparse/
---
## DateTimeOffset::TryParse(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) method


تحاول تحويل السلسلة المحددة إلى كائن [DateTimeOffset](../) باستخدام موفر التنسيق المحدد ونمط التنسيق.

```cpp
static bool System::DateTimeOffset::TryParse(const String &input, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTimeOffset &result)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| input | const String\& | [String](../../string/) للتحويل. |
| المزود | const SharedPtr\<IFormatProvider\>\& | مزوّد الصيغة. |
| الأنماط | Globalization::DateTimeStyles | أنماط تنسيق التاريخ والوقت. |
| result | DateTimeOffset\& | [DateTimeOffset](../) الذي يعادل **input**. |

### ReturnValue

صحيح إذا تم تحويل **input** بنجاح، وإلا - false.

## انظر أيضًا

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTimeOffset::TryParse(const String\&, DateTimeOffset\&) method


تحاول تحويل السلسلة المحددة إلى كائن [DateTimeOffset](../).

```cpp
static bool System::DateTimeOffset::TryParse(const String &input, DateTimeOffset &result)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| input | const String\& | [String](../../string/) للتحويل. |
| result | DateTimeOffset\& | [DateTimeOffset](../) الذي يعادل **input**. |

### ReturnValue

صحيح إذا تم تحويل **input** بنجاح، وإلا - false.

## انظر أيضًا

* Class [String](../../string/)
* Class [DateTimeOffset](../)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
