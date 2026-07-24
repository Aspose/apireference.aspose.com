---
title: "طريقة System::DateTimeOffset::Parse"
linktitle: "تحليل"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::DateTimeOffset::Parse. يحول السلسلة المحددة إلى ما يعادل DateTimeOffset في C++."
type: docs
weight: 5500
url: /ar/cpp/system/datetimeoffset/parse/
---
## DateTimeOffset::Parse(const String\&) method


يحوِّل السلسلة المحددة إلى ما يعادل [DateTimeOffset](../).

```cpp
static DateTimeOffset System::DateTimeOffset::Parse(const String &input)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| input | const String\& | [String](../../string/) للتحويل. |

### ReturnValue

[DateTimeOffset](../) that is equivalent to the **input**.

## انظر أيضًا

* Class [DateTimeOffset](../)
* Class [String](../../string/)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTimeOffset::Parse(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


يحوِّل السلسلة المحددة إلى كائن [DateTimeOffset](../) باستخدام موفر الصيغة المحدد ونمط التنسيق.

```cpp
static DateTimeOffset System::DateTimeOffset::Parse(const String &input, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| input | const String\& | [String](../../string/) للتحويل. |
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
