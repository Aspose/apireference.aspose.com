---
title: "فئة System::IO::Directory"
linktitle: "دليل"
second_title: "Aspose.Font لـ C++"
description: "فئة System::IO::Directory. تحتوي على طرق للتعامل مع الأدلة. هذا نوع ثابت لا يقدم خدمات للنسخ. يجب ألا تنشئ أي نسخ منه بأي وسيلة في C++."
type: docs
weight: 1100
url: /ar/cpp/system.io/directory/
---
## Directory class


يحتوي على طرق لمعالجة الأدلة. هذا نوع ثابت دون خدمات مثيل. لا يجب عليك أبدًا إنشاء مثيلات له بأي طريقة.

```cpp
class Directory
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [CreateDirectory_](./createdirectory_/)(const String\&) | ينشئ جميع الأدلة في المسار المحدد إذا لم تكن موجودة. |
| static [Delete](./delete/)(const String\&, bool) | يزيل الملف أو الدليل المحدد. لا يطرح استثناء. |
| static [EnumerateDirectories](./enumeratedirectories/)(const String\&, const String\&, SearchOption) | يبحث عن الأدلة التي تلبي معايير البحث المحددة إما في الدليل المحدد أو في شجرة الأدلة الكاملة المتجذرة في الدليل المحدد. |
| static [EnumerateFiles](./enumeratefiles/)(const String\&, const String\&, SearchOption) | يبحث عن الملفات التي تلبي معايير البحث المحددة إما في الدليل المحدد أو في شجرة الأدلة الكاملة المتجذرة في الدليل المحدد. |
| static [EnumerateFileSystemEntries](./enumeratefilesystementries/)(const String\&, const String\&, SearchOption) | يبحث عن الملفات والأدلة التي تلبي معايير البحث المحددة إما في الدليل المحدد أو في شجرة الأدلة الكاملة المتجذرة في الدليل المحدد. |
| static [Exists](./exists/)(const String\&) | يحدد ما إذا كان المسار المحدد يشير إلى دليل موجود. |
| static [GetCreationTime](./getcreationtime/)(const String\&) | يعيد وقت الإنشاء للكيان المحدد بالتوقيت المحلي. |
| static [GetCreationTimeUtc](./getcreationtimeutc/)(const String\&) | يعيد وقت الإنشاء للكيان المحدد بتوقيت UTC. |
| static [GetCurrentDirectory](./getcurrentdirectory/)() | يعيد الاسم الكامل (بما في ذلك المسار) للدليل الحالي. |
| static [GetDirectories](./getdirectories/)(const String\&, const String\&, SearchOption) | يبحث عن الأدلة التي تلبي معايير البحث المحددة إما في الدليل المحدد أو في شجرة الأدلة الكاملة المتجذرة في الدليل المحدد. |
| static [GetDirectoryRoot](./getdirectoryroot/)(const String\&) | يعيد الدليل الجذر للمسار المحدد. |
| static [GetFiles](./getfiles/)(const String\&, const String\&, SearchOption) | يبحث عن الملفات التي تلبي معايير البحث المحددة إما في الدليل المحدد أو في شجرة الأدلة الكاملة المتجذرة في الدليل المحدد. |
| static [GetFileSystemEntries](./getfilesystementries/)(const String\&, const String\&, SearchOption) | يبحث عن الملفات والأدلة التي تلبي معايير البحث المحددة إما في الدليل المحدد أو في شجرة الأدلة الكاملة المتجذرة في الدليل المحدد. |
| static [GetLastAccessTime](./getlastaccesstime/)(const String\&) | يعيد وقت آخر وصول للكيان المحدد بالتوقيت المحلي. |
| static [GetLastAccessTimeUtc](./getlastaccesstimeutc/)(const String\&) | يعيد وقت آخر وصول للكيان المحدد بتوقيت UTC. |
| static [GetLastWriteTime](./getlastwritetime/)(const String\&) | يعيد وقت الكتابة الأخير للكيان المحدد كوقت محلي. |
| static [GetLastWriteTimeUtc](./getlastwritetimeutc/)(const String\&) | يعيد وقت الكتابة الأخير للكيان المحدد كوقت UTC. |
| static [GetLogicalDrives](./getlogicaldrives/)() | غير مُنفّذ. |
| static [GetParent](./getparent/)(const String\&) | يعيد مؤشرًا مشتركًا إلى كائن [DirectoryInfo](../directoryinfo/) الذي يمثل الدليل الأب للكيان المحدد. |
| static [Move](./move/)(const String\&, const String\&) | ينقل الكيان المحدد إلى الموقع الجديد. إذا كان الكيان المراد نقله دليلًا، يتم نقله مع جميع محتوياته. |
| static [SetCreationTime](./setcreationtime/)(const String\&, DateTime) | يضبط وقت الإنشاء للكيان المحدد كوقت محلي. |
| static [SetCreationTimeUtc](./setcreationtimeutc/)(const String\&, DateTime) | يضبط وقت الإنشاء للكيان المحدد كوقت UTC. |
| static [SetCurrentDirectory](./setcurrentdirectory/)(const String\&) | يضبط الدليل الحالي. |
| static [SetLastAccessTime](./setlastaccesstime/)(const String\&, DateTime) | يضبط وقت الوصول الأخير للكيان المحدد كوقت محلي. |
| static [SetLastAccessTimeUtc](./setlastaccesstimeutc/)(const String\&, DateTime) | يضبط وقت الوصول الأخير للكيان المحدد كوقت UTC. |
| static [SetLastWriteTime](./setlastwritetime/)(const String\&, DateTime) | يضبط وقت الكتابة الأخير للكيان المحدد كوقت محلي. |
| static [SetLastWriteTimeUtc](./setlastwritetimeutc/)(const String\&, DateTime) | يضبط وقت الكتابة الأخير للكيان المحدد كوقت UTC. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [StringEnumerablePtr](./stringenumerableptr/) | اسم مستعار لمؤشر مشترك إلى كائن IEnumerable يُعدّ مجموعة من كائنات [String](../../system/string/). |
## ملاحظات



```cpp
#include "system/io/directory.h"
#include "system/io/path.h"
#include "system/string.h"
#include <iostream>

void PrintMessage(const System::String &path)
{
  std::cout << "Directory '" << path << (System::IO::Directory::Exists(path) ? "' exists." : "' doesn't exist.") << std::endl;
}

int main()
{
  // إنشاء سلاسل تحتوي على مسارات إلى الأدلة.
  System::String discPath(u"C:\\");
  System::String directoryPath(u"C:\\Some directory");
  auto tempPath = System::IO::Path::GetTempPath();

  // التحقق مما إذا كانت الأدلة موجودة.
  PrintMessage(discPath);
  PrintMessage(directoryPath);
  PrintMessage(tempPath);

  // طباعة معلومات دليل المؤقت.
  std::cout <<
    "Creation Time: " << System::IO::Directory::GetCreationTime(tempPath) << std::endl <<
    "Last Access Time: " << System::IO::Directory::GetLastAccessTime(tempPath) << std::endl <<
    "Last Write Time: " << System::IO::Directory::GetLastWriteTime(tempPath) << std::endl;

  return 0;
}
/*
This code example produces the following output:
Directory 'C:\' exists.
Directory 'C:\Some directory' doesn't exist.
Directory 'C:\Users\lanor\AppData\Local\Temp\' exists.
Creation Time: 27.08.2021 14:21:42
Last Access Time: 07.10.2021 12:16:41
Last Write Time: 07.10.2021 12:16:41
*/
```

## انظر أيضًا

* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
