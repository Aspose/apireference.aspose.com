---
title: "فئة System::IO::FileSystemInfo"
linktitle: "FileSystemInfo"
second_title: "Aspose.Page لـ C++"
description: "فئة System::IO::FileSystemInfo. الفئة الأساسية لـ FileInfo و DirectoryInfo. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1600
url: /ar/cpp/system.io/filesysteminfo/
---
## FileSystemInfo class


الفئة الأساسية لـ [FileInfo](../fileinfo/) و [DirectoryInfo](../directoryinfo/). يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class FileSystemInfo : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Delete](./delete/)() | يحذف الكيان الممثل بواسطة الكائن الحالي. |
| virtual [Finalize](./finalize/)() | لا يفعل شيئًا. |
| [get_Attributes](./get_attributes/)() | يعيد سمات الكيان الممثل بواسطة الكائن الحالي. |
| [get_CreationTime](./get_creationtime/)() | يعيد وقت إنشاء الكيان الممثل بواسطة الكائن الحالي كتوقيت محلي. |
| [get_CreationTimeUtc](./get_creationtimeutc/)() | يعيد وقت إنشاء الكيان الممثل بواسطة الكائن الحالي كتوقيت عالمي (UTC). |
| virtual [get_Exists](./get_exists/)() | يحدد ما إذا كان الكيان المشار إليه بالمسار الممثل بواسطة الكائن الحالي موجودًا. |
| [get_Extension](./get_extension/)() | يعيد امتداد الملف الممثل بواسطة الكائن الحالي. |
| virtual [get_FullName](./get_fullname/)() | يعيد الاسم الكامل (بما في ذلك المسار) للكيان الممثل بواسطة الكائن الحالي. |
| [get_LastAccessTime](./get_lastaccesstime/)() | يعيد وقت الوصول الأخير للكيان الممثل بواسطة الكائن الحالي كوقت محلي. |
| [get_LastAccessTimeUtc](./get_lastaccesstimeutc/)() | يعيد وقت الوصول الأخير للكيان الممثل بواسطة الكائن الحالي كوقت UTC. |
| [get_LastWriteTime](./get_lastwritetime/)() | يعيد وقت الكتابة الأخير للكيان الممثل بواسطة الكائن الحالي كوقت محلي. |
| [get_LastWriteTimeUtc](./get_lastwritetimeutc/)() | يعيد وقت الكتابة الأخير للكيان الممثل بواسطة الكائن الحالي كوقت UTC. |
| virtual [get_Name](./get_name/)() | يعيد اسمًا للكيان الممثل بواسطة الكائن الحالي. |
| [Refresh](./refresh/)() | يقوم بتحديث حالة الكائن الحالي. |
| [set_Attributes](./set_attributes/)(FileAttributes) | يضبط السمات المحددة على الكيان الممثل بواسطة الكائن الحالي. |
| [set_CreationTime](./set_creationtime/)(DateTime) | يضبط وقت الإنشاء للكيان الممثل بواسطة الكائن الحالي كوقت محلي. |
| [set_CreationTimeUtc](./set_creationtimeutc/)(DateTime) | يضبط وقت الإنشاء للكيان الممثل بواسطة الكائن الحالي كوقت UTC. |
| [set_LastAccessTime](./set_lastaccesstime/)(DateTime) | يضبط وقت الوصول الأخير للكيان الممثل بواسطة الكائن الحالي كوقت محلي. |
| [set_LastAccessTimeUtc](./set_lastaccesstimeutc/)(DateTime) | يضبط وقت الوصول الأخير للكيان الممثل بواسطة الكائن الحالي كوقت UTC. |
| [set_LastWriteTime](./set_lastwritetime/)(DateTime) | يضبط وقت الكتابة الأخير للكيان الممثل بواسطة الكائن الحالي كوقت محلي. |
| [set_LastWriteTimeUtc](./set_lastwritetimeutc/)(DateTime) | يضبط وقت الكتابة الأخير للكيان الممثل بواسطة الكائن الحالي كوقت UTC. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
