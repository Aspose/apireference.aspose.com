---
title: "طريقة System::DateTimeOffset::ParseExact"
linktitle: "ParseExact"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::DateTimeOffset::ParseExact. يحول السلسلة المحددة إلى كائن DateTimeOffset باستخدام الصيغ المحددة، ومزود الصيغة، ونمط التنسيق في C++."
type: docs
weight: 5600
url: /ar/cpp/system/datetimeoffset/parseexact/
---
## DateTimeOffset::ParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


يحول السلسلة المحددة إلى كائن [DateTimeOffset](../) باستخدام الصيغ المحددة، ومزود الصيغة، ونمط التنسيق.

```cpp
static DateTimeOffset System::DateTimeOffset::ParseExact(const String &input, const ArrayPtr<String> &formats, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| input | const String\& | [String](../../string/) للتحويل. |
| formats | const ArrayPtr\<String\>\& | [Array](../../array/) من سلاسل الصيغ. |
| مزود | const SharedPtr\<IFormatProvider\>\& | مزود الصيغة. |
| styles | Globalization::DateTimeStyles | أنماط تنسيق التاريخ والوقت. |

### ReturnValue

[DateTimeOffset](../) that is equivalent to the **input**.

## انظر أيضًا

* Class [DateTimeOffset](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTimeOffset::ParseExact(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


يقوم بتحويل السلسلة المحددة إلى كائن [DateTimeOffset](../) باستخدام التنسيق المحدد، ومزود التنسيق، ونمط التنسيق.

```cpp
static DateTimeOffset System::DateTimeOffset::ParseExact(const String &input, const String &format, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| input | const String\& | [String](../../string/) للتحويل. |
| تنسيق | const String\& | سلسلة التنسيق. |
| مزود | const SharedPtr\<IFormatProvider\>\& | مزود الصيغة. |
| styles | Globalization::DateTimeStyles | أنماط تنسيق التاريخ والوقت. |

### ReturnValue

[DateTimeOffset](../) that is equivalent to the **input**.

## انظر أيضًا

* Class [DateTimeOffset](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
