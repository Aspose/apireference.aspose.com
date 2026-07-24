---
title: "System::IO::Path::CheckPath طريقة"
linktitle: "CheckPath"
second_title: "Aspose.Page لـ C++"
description: "System::IO::Path::CheckPath طريقة. يحدد ما إذا كان المسار المحدد صالحًا عن طريق التحقق مما إذا كان يحتوي على أحرف غير صالحة. يتم رمي استثناء إذا كان المسار يحتوي على أحرف غير صالحة في C++."
type: docs
weight: 200
url: /ar/cpp/system.io/path/checkpath/
---
## Path::CheckPath method


يحدد ما إذا كان المسار المحدد صالحًا عن طريق التحقق من احتوائه على أحرف غير صالحة. يتم إلقاء استثناء إذا كان المسار يحتوي على أحرف غير صالحة.

```cpp
static void System::IO::Path::CheckPath(const String &path, const String &msg=s_msg_path, bool allow_empty=true)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المسار | const String\& | المسار للتحقق منه |
| msg | const String\& | الرسالة لتمريرها إلى مُنشئ كائن الاستثناء |
| allow_empty | bool | يحدد ما إذا كان يجب اعتبار سلسلة فارغة أو null مسارًا صحيحًا (true) أم لا (false)؛ إذا كانت هذه المعلمة false وكان **path** فارغًا يتم رمي ArgumentException؛ إذا كانت هذه المعلمة false وكان **path** null يتم رمي ArgumentNullException |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [Path](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
