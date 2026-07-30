---
title: "الفئة System::IO::Path"
linktitle: "المسار"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::IO::Path. توفر طرقًا لمعالجة المسارات. هذا نوع ثابت لا يحتوي على خدمات مثيل. يجب ألا تنشئ أي مثيلات لها بأي وسيلة في C++."
type: docs
weight: 1900
url: /ar/cpp/system.io/path/
---
## Path class


يوفر طرقًا لمعالجة المسارات. هذا نوع ثابت دون خدمات مثيل. لا يجب عليك أبدًا إنشاء مثيلات له بأي طريقة.

```cpp
class Path
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [ChangeExtension](./changeextension/)(const String\&, const String\&) | يغيّر الامتداد في مسار الملف المحدد. |
| static [CheckPath](./checkpath/)(const String\&, const String\&, bool) | يحدد ما إذا كان المسار المحدد صالحًا عن طريق التحقق مما إذا كان يحتوي على أحرف غير صالحة. تُرمى استثناء إذا كان المسار يحتوي على أحرف غير صالحة. |
| static [Combine](./combine/)(const ArrayPtr\<String\>\&) | يجمع أجزاء المسار المحددة في مسار واحد مع إدراج فواصل الأدلة بين الأجزاء إذا لزم الأمر. |
| static [Combine](./combine/)(const String\&, const String\&) | يجمع جزئين محددين من المسار في مسار واحد مع إدراج فاصل دليل بين الجزأين إذا لزم الأمر. |
| static [Combine](./combine/)(const String\&, const String\&, const String\&) | يجمع ثلاثة أجزاء محددة من المسار في مسار واحد مع إدراج فواصل الأدلة بين الأجزاء إذا لزم الأمر. |
| static [Combine](./combine/)(const String\&, const String\&, const String\&, const String\&) | يجمع أربعة أجزاء محددة من المسار في مسار واحد مع إدراج فواصل الأدلة بين الأجزاء إذا لزم الأمر. |
| static [GetDirectoryName](./getdirectoryname/)(const String\&) | يعيد اسم الدليل المشار إليه بالمسار المحدد. |
| static [GetExtension](./getextension/)(const String\&) | يعيد امتداد الملف المشار إليه بالمسار المحدد. |
| static [GetFileName](./getfilename/)(const String\&) | يعيد اسم الملف المشار إليه بالمسار المحدد. |
| static [GetFileNameWithoutExtension](./getfilenamewithoutextension/)(const String\&) | يعيد اسم الملف بدون امتداد للملف المشار إليه بالمسار المحدد. |
| static [GetFullPath](./getfullpath/)(const String\&) | يحوّل المسار المحدد إلى مسار مطلق. |
| static [GetInvalidFileNameChars](./getinvalidfilenamechars/)() | يعيد مصفوفة تحتوي على أحرف غير مسموح بها في أسماء الملفات. |
| static [GetInvalidPathChars](./getinvalidpathchars/)() | يعيد مصفوفة تحتوي على أحرف غير مسموح بها في أسماء المسارات. |
| static [GetPathRoot](./getpathroot/)(const String\&) | يعيد الدليل الجذر للمسار المحدد. |
| static [GetRandomFileName](./getrandomfilename/)() | يعيد اسم ملف تم إنشاؤه عشوائيًا. |
| static [GetTempFileName_](./gettempfilename_/)() | ينشئ ملفًا جديدًا باسم فريد ويعيد مسارًا كاملاً إليه. |
| static [GetTempFileNameSafe](./gettempfilenamesafe/)() | ينشئ ملفًا جديدًا باسم فريد ويعيد مسارًا كاملاً إليه. وهو مرادف لطريقة [GetTempFileName_()](./gettempfilename_/). |
| static [GetTempPath](./gettemppath/)() | يعيد مسار دليل المؤقت للمستخدم الحالي. |
| static [HasExtension](./hasextension/)(const String\&) | يحدد ما إذا كان المسار المحدد يشير إلى ملف بامتداد. |
| static [IsPathRooted](./ispathrooted/)(const String\&) | يحدد ما إذا كان المسار المحدد يحتوي على جذر. |
| static [NormalizePath](./normalizepath/)(const String\&) | يقوم بتطبيع المسار المحدد. |
| static [ToBoost](./toboost/)(const String\&) | يعيد مثالًا من الفئة boost::filesystem::path التي تمثل المسار المحدد. |
| static [ToString](./tostring/)(const boost::filesystem::path\&) | يعيد تمثيلًا نصيًا لكائن المسار الخاص بـ Boost المحدد. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [AltDirectorySeparatorChar](./altdirectoryseparatorchar/) | حرف بديل يُستخدم لفصل مستويات الدليل في المسار. |
| static [DirectorySeparatorChar](./directoryseparatorchar/) | حرف يُستخدم لفصل مستويات الدليل في المسار. |
| static [PathSeparator](./pathseparator/) | حرف فاصل يُستخدم لفصل سلاسل المسارات في متغيرات البيئة. |
| static [VolumeSeparatorChar](./volumeseparatorchar/) | حرف فاصل للقرص. |
## ملاحظات



```cpp
#include "system/io/path.h"
#include <iostream>

int main()
{
  using namespace System::IO;

  // إنشاء اسم ملف عشوائي.
  auto filename = Path::GetRandomFileName();

  // طباعة معلومات حول اسم الملف.
  std::cout <<
    "Filename: " << Path::GetFileName(filename) << std::endl <<
    "Filename w/o an extension: " << Path::GetFileNameWithoutExtension(filename) << std::endl <<
    "Extension: " << Path::GetExtension(filename) << std::endl;

  return 0;
}
/*
This code example produces the following output:
Filename: qhuzkyqv.y6p
Filename w/o an extension: qhuzkyqv
Extension: .y6p
*/
```

## انظر أيضًا

* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
