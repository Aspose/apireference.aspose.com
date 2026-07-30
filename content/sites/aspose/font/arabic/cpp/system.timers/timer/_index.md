---
title: "فئة System::Timers::Timer"
linktitle: "Timer"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Timers::Timer. مؤقت يستدعي التفويض في حلقة في C++."
type: docs
weight: 200
url: /ar/cpp/system.timers/timer/
---
## Timer class


[Timer](./) that calls delegate in a loop.

```cpp
class Timer : public System::ComponentModel::Component
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Close](./close/)() | يوقف المؤقت، يحرر الموارد المخصصة. |
| [Dispose](./dispose/)() | يوقف المؤقت، يحرر الموارد المخصصة. |
| [get_AutoReset](./get_autoreset/)() const | يتحقق مما إذا كان المؤقت في وضع إعادة الضبط التلقائي. |
| [get_Enabled](./get_enabled/)() const | يتحقق مما إذا كان المؤقت نشطًا. |
| [get_Interval](./get_interval/)() const | يحصل على فترة المؤقت. |
| [get_IsStopped](./get_isstopped/)() const | يتحقق مما إذا كان المؤقت متوقفًا. |
| [set_AutoReset](./set_autoreset/)(bool) | يضبط المؤقت في وضع إعادة الضبط التلقائي أو خارجه. |
| [set_Enabled](./set_enabled/)(bool) | يبدأ أو يوقف المؤقت. بدء المؤقت لا يعيد بدء عد الوقت إذا كان المؤقت قيد التنفيذ بالفعل. |
| [set_Interval](./set_interval/)(double) | يضبط فترة المؤقت. |
| [Start](./start/)() | يبدأ المؤقت. لا يعيد بدء عد الوقت إذا كان المؤقت قيد التنفيذ بالفعل. |
| [Stop](./stop/)() | يوقف المؤقت. |
| [Timer](./timer/)() | معلومات RTTI. |
| [Timer](./timer/)(double) | ينشئ مؤقتًا متوقفًا بالفترة المحددة. |
## انظر أيضًا

* Class [Component](../../system.componentmodel/component/)
* Namespace [System::Timers](../)
* Library [Aspose.Font for C++](../../)
