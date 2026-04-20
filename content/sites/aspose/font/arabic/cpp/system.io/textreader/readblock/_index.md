---
title: "طريقة System::IO::TextReader::ReadBlock"
linktitle: "ReadBlock"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::IO::TextReader::ReadBlock. تقرأ الحد الأقصى المحدد لعدد الأحرف من قارئ النص الحالي وتكتب البيانات إلى مخزن مؤقت، بدءًا من الفهرس المحدد في C++."
type: docs
weight: 500
url: /ar/cpp/system.io/textreader/readblock/
---
## TextReader::ReadBlock method


يقرأ الحد الأقصى المحدد لعدد الأحرف من القارئ النصي الحالي ويكتب البيانات إلى مخزن مؤقت، بدءًا من الفهرس المحدد.

```cpp
virtual int System::IO::TextReader::ReadBlock(ArrayPtr<char_t> buffer, int index, int count)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | ArrayPtr\<char_t\> | مخزن مؤقت من الأحرف لكتابة البيانات المقروءة إليه |
| الفهرس | int | فهرس يبدأ من الصفر في **buffer** للبدء بالكتابة عنده |
| count | int | الحد الأقصى لعدد الأحرف التي سيتم قراءتها |

### ReturnValue

العدد الفعلي للأحرف المقروءة

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
