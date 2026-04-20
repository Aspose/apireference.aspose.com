---
title: "System::Char::TryParse طريقة"
linktitle: "TryParse"
second_title: "Aspose.Font لـ C++"
description: "System::Char::TryParse طريقة. يحاول تحويل سلسلة مكوّنة من حرف واحد إلى حرف UTF-16. تنجح الدالة فقط عندما لا تكون السلسلة المدخلة فارغة وتكون طولها حرفًا واحدًا بالضبط في C++."
type: docs
weight: 2600
url: /ar/cpp/system/char/tryparse/
---
## Char::TryParse method


يحاول تحويل سلسلة تتكوّن من حرف واحد إلى حرف UTF-16. تنجح الدالة فقط عندما لا تكون السلسلة المدخلة فارغة وتكون طولها حرفًا واحدًا بالضبط.

```cpp
static bool System::Char::TryParse(const System::String &s, char_t &result)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| s | const System::String\& | [String](../../string/) للتحويل |
| result | char_t\& | متغيّر الإخراج الذي سيحتوي على نتيجة التحويل إذا نجح التحويل |

### ReturnValue

صحيح إذا نجح التحويل، وإلا - خطأ

## انظر أيضًا

* Class [String](../../string/)
* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
