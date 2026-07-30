---
title: "طريقة System::IO::Path::CheckPath"
linktitle: "CheckPath"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::IO::Path::CheckPath. تحدد ما إذا كان المسار المحدد صالحًا عن طريق التحقق مما إذا كان يحتوي على أحرف غير صالحة. يُرمى استثناء إذا كان المسار يحتوي على أحرف غير صالحة في C++."
type: docs
weight: 200
url: /ar/cpp/system.io/path/checkpath/
---
## Path::CheckPath method


يحدد ما إذا كان المسار المحدد صالحًا عن طريق التحقق مما إذا كان يحتوي على أحرف غير صالحة. تُرمى استثناء إذا كان المسار يحتوي على أحرف غير صالحة.

```cpp
static void System::IO::Path::CheckPath(const String &path, const String &msg=s_msg_path, bool allow_empty=true)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| مسار | const String\& | المسار للتحقق منه |
| msg | const String\& | الرسالة التي تُمرّر إلى مُنشئ كائن الاستثناء |
| allow_empty | bool | يحدد ما إذا كان يجب اعتبار سلسلة فارغة أو null مسارًا صحيحًا (true) أم لا (false)؛ إذا كان هذا المعامل false وكان **path** فارغًا يُرمى ArgumentException؛ إذا كان هذا المعامل false وكان **path** null يُرمى ArgumentNullException |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [Path](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
