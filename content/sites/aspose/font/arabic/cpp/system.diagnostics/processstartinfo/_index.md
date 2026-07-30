---
title: "فئة System::Diagnostics::ProcessStartInfo"
linktitle: "ProcessStartInfo"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Diagnostics::ProcessStartInfo. تصف معلمات بدء العملية. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 400
url: /ar/cpp/system.diagnostics/processstartinfo/
---
## ProcessStartInfo class


يصف معلمات بدء العملية. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class ProcessStartInfo : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Arguments](./get_arguments/)() const | يحصل على معلمات العملية. |
| [get_CreateNoWindow](./get_createnowindow/)() const | يحصل على خاصية NoWindow. |
| [get_EnvironmentVariables](./get_environmentvariables/)() const | يحصل على متغيرات بيئة العملية. |
| [get_FileName](./get_filename/)() const | يحصل على اسم ملف العملية. |
| [get_RedirectStandardError](./get_redirectstandarderror/)() const | يحصل على خاصية RedirectStandardError. |
| [get_RedirectStandardInput](./get_redirectstandardinput/)() const | يحصل على خاصية RedirectStandardInput. |
| [get_RedirectStandardOutput](./get_redirectstandardoutput/)() const | يحصل على خاصية RedirectStandardOutput. |
| [get_UseShellExecute](./get_useshellexecute/)() const | يحصل على خاصية UseShellExecute. |
| [get_WindowStyle](./get_windowstyle/)() const | يحصل على نمط النافذة. |
| [get_WorkingDirectory](./get_workingdirectory/)() const | يحصل على دليل العمل للعملية. |
| [ProcessStartInfo](./processstartinfo/)() | ينشئ كائن معلومات بدء فارغ. |
| [ProcessStartInfo](./processstartinfo/)(const String\&) | ينشئ كائن معلومات بدء. |
| [ProcessStartInfo](./processstartinfo/)(const String\&, const String\&) | ينشئ كائن معلومات بدء. |
| [set_Arguments](./set_arguments/)(const String\&) | يضبط معلمات العملية. |
| [set_CreateNoWindow](./set_createnowindow/)(bool) | يضبط خاصية NoWindow. |
| [set_FileName](./set_filename/)(const String\&) | يضبط اسم ملف العملية. |
| [set_RedirectStandardError](./set_redirectstandarderror/)(bool) | يضبط خاصية RedirectStandardError. |
| [set_RedirectStandardInput](./set_redirectstandardinput/)(bool) | يضبط خاصية RedirectStandardInput. |
| [set_RedirectStandardOutput](./set_redirectstandardoutput/)(bool) | يضبط خاصية RedirectStandardOutput. |
| [set_UseShellExecute](./set_useshellexecute/)(bool) | يضبط خاصية UseShellExecute. |
| [set_WindowStyle](./set_windowstyle/)(ProcessWindowStyle) | يضبط نمط النافذة. |
| [set_WorkingDirectory](./set_workingdirectory/)(const String\&) | يضبط دليل العمل للعملية. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Font for C++](../../)
