---
title: "System::Diagnostics::Process فئة"
linktitle: "Process"
second_title: "Aspose.Font لـ C++"
description: "System::Diagnostics::Process فئة. تغلف معلومات العملية وتتيح التلاعب بها. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء مثيل من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 300
url: /ar/cpp/system.diagnostics/process/
---
## Process class


تغلف معلومات العملية وتتيح التلاعب بها. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيل من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class Process : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_EnableRaisingEvents](./get_enableraisingevents/)() const | يحصل على ما إذا كان يجب رفع الحدث Exited عند انتهاء العملية. |
| [get_ExitCode](./get_exitcode/)() const | يحصل على رمز خروج العملية. |
| [get_PrivateMemorySize64](./get_privatememorysize64/)() const | يحصل على حجم مجموعة الذاكرة الخاصة بالعملية. |
| [get_ProcessName](./get_processname/)() const | يحصل على اسم العملية. |
| [get_StandardError](./get_standarderror/)() const | يوفر قارئًا لقراءة مخرجات الخطأ للعملية. غير مُنفّذ. |
| [get_StandardOutput](./get_standardoutput/)() const | يوفر قارئًا لقراءة مخرجات العملية القياسية. غير مُنفَّذ. |
| [get_StartInfo](./get_startinfo/)() const | يحصل على معلومات بدء العملية. |
| [get_WorkingSet64](./get_workingset64/)() const | يحصل على حجم مجموعة عمل ذاكرة العملية. |
| static [GetCurrentProcess](./getcurrentprocess/)() | يحصل على معلومات حول العملية الحالية. فقط [Windows](../../system.windows/). |
| [GetOutputText](./getoutputtext/)() const | يحصل على نص مخرجات العملية. |
| [set_EnableRaisingEvents](./set_enableraisingevents/)(bool) | يضبط ما إذا كان يجب إطلاق الحدث Exited عند انتهاء العملية. |
| [Start](./start/)() | يبدأ العملية بمعلمات مُحددة مسبقًا. |
| static [Start](./start/)(const String\&, const String\&) | يبدأ العملية بالمسار المحدد والوسائط. |
| static [Start](./start/)(const SharedPtr\<ProcessStartInfo\>\&) | يبدأ العملية بالمسار المحدد والوسائط. |
| [WaitForExit](./waitforexit/)(int) | ينتظر انتهاء العملية. غير مُنفَّذ. |
| [WaitForExit](./waitforexit/)() | ينتظر انتهاء العملية، ولا يعود حتى ينتهي. |
| virtual [~Process](./~process/)() | المدمر. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Font for C++](../../)
