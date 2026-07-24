---
title: "System::DateTimeOffset::TryParseExact method"
linktitle: "TryParseExact"
second_title: "Aspose.Page لـ C++"
description: "System::DateTimeOffset::TryParseExact method. يحاول تحويل السلسلة المحددة إلى كائن DateTimeOffset باستخدام الصيغ المحددة ومزود الصيغة ونمط التنسيق في C++."
type: docs
weight: 5800
url: /ar/cpp/system/datetimeoffset/tryparseexact/
---
## DateTimeOffset::TryParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) method


يحاول تحويل السلسلة المحددة إلى كائن [DateTimeOffset](../) باستخدام الصيغ المحددة ومزود الصيغة ونمط التنسيق.

```cpp
static bool System::DateTimeOffset::TryParseExact(const String &input, const ArrayPtr<String> &formats, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTimeOffset &result)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| input | const String\& | [String](../../string/) للتحويل. |
| الصيغ | const ArrayPtr\<String\>\& | مصفوفات من سلاسل الصيغ. |
| مزود | const SharedPtr\<IFormatProvider\>\& | مزود الصيغة. |
| styles | Globalization::DateTimeStyles | أنماط تنسيق التاريخ والوقت. |
| result | DateTimeOffset\& | [DateTimeOffset](../) الذي يعادل **input**. |

### ReturnValue

true إذا تم تحويل **input** بنجاح، وإلا - false.

## انظر أيضًا

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTimeOffset::TryParseExact(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) method


يحاول تحويل السلسلة المحددة إلى كائن [DateTimeOffset](../) باستخدام الصيغة المحددة ومزود الصيغة ونمط التنسيق.

```cpp
static bool System::DateTimeOffset::TryParseExact(const String &input, const String &format, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTimeOffset &result)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| input | const String\& | [String](../../string/) للتحويل. |
| تنسيق | const String\& | سلسلة التنسيق. |
| مزود | const SharedPtr\<IFormatProvider\>\& | مزود الصيغة. |
| styles | Globalization::DateTimeStyles | أنماط تنسيق التاريخ والوقت. |
| result | DateTimeOffset\& | [DateTimeOffset](../) الذي يعادل **input**. |

### ReturnValue

true إذا تم تحويل **input** بنجاح، وإلا - false.

## انظر أيضًا

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
