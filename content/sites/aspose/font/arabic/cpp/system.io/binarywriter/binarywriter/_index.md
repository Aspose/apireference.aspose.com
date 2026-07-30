---
title: "System::IO::BinaryWriter::BinaryWriter مُنشئ"
linktitle: "BinaryWriter"
second_title: "Aspose.Font لـ C++"
description: "System::IO::BinaryWriter::BinaryWriter مُنشئ. ينشئ مثالًا من فئة BinaryWriter التي تكتب البيانات إلى الدفق المحدد باستخدام الترميز المحدد في C++."
type: docs
weight: 100
url: /ar/cpp/system.io/binarywriter/binarywriter/
---
## BinaryWriter::BinaryWriter constructor


ينشئ مثالًا من فئة [BinaryWriter](../) التي تكتب البيانات إلى الدفق المحدد باستخدام الترميز المحدد.

```cpp
System::IO::BinaryWriter::BinaryWriter(const StreamPtr &stream, const EncodingPtr &encoding=System::Text::Encoding::get_UTF8Unmarked(), bool leaveopen=false)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| دفق | const StreamPtr\& | دفق الإخراج |
| encoding | const EncodingPtr\& | الترميز المراد استخدامه |
| leaveopen | bool | يحدد ما إذا كان يجب ترك الدفق **stream** مفتوحًا (true) بعد التخلص من الكائن الحالي أم لا (false) |

## انظر أيضًا

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
