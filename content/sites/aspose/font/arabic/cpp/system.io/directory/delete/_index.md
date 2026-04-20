---
title: "طريقة System::IO::Directory::Delete"
linktitle: "حذف"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::IO::Directory::Delete. تزيل الملف أو الدليل المحدد. لا تُطلق استثناءً في C++."
type: docs
weight: 200
url: /ar/cpp/system.io/directory/delete/
---
## Directory::Delete method


يزيل الملف أو الدليل المحدد. لا يطرح استثناء.

```cpp
static void System::IO::Directory::Delete(const String &path, bool recursive=false)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| مسار | const String\& | المسار إلى الدليل أو الملف الذي سيتم إزالته |
| متكرر | bool | إذا كان **path** يحدد دليلًا غير فارغ، فإن **recursive** يحدد ما إذا كان يجب إزالة جميع محتويات الدليل بشكل متكرر؛ إذا كان الدليل المحدد بواسطة **path** غير فارغ وكانت قيمة **recursive** هي 'false' فإن العملية تفشل |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
