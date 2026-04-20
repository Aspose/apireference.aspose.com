---
title: "مساحة الأسماء System::Threading"
linktitle: "System::Threading"
second_title: "Aspose.Font لـ C++"
description: "كيفية استخدام مساحة الأسماء System::Threading في C++."
type: docs
weight: 6900
url: /ar/cpp/system.threading/
---



## الفئات

| الفئة | الوصف |
| --- | --- |
| [AutoResetEvent](./autoresetevent/) | [Event](../system/event/) لإشعار الخيط المنتظر الذي يعيد الضبط تلقائيًا. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [CancellationToken](./cancellationtoken/) | ينشر إشعارًا بأن العمليات يجب إلغاؤها. توفر هذه الفئة آلية للإلغاء التعاوني بين الخيوط، مما يسمح لخيط واحد بإشعار الآخرين بأن العملية يجب إلغاؤها. |
| [CancellationTokenRegistration](./cancellationtokenregistration/) | يمثل تسجيلًا لاستدعاء رد نداء رمز الإلغاء. |
| [CancellationTokenSource](./cancellationtokensource/) | مصدر رمز إلغاء يمكن استخدامه لإطلاق إشعارات الإلغاء. |
| [EventWaitHandle](./eventwaithandle/) | [Event](../system/event/) يمكن إرساله إلى الخيط المنتظر. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [Interlocked](./interlocked/) | يوفر واجهة برمجة تطبيقات للعمليات الآمنة من الخيوط. هذا نوع ثابت لا يحتوي على خدمات مثيل. يجب ألا تنشئ أي مثيلات له بأي وسيلة. |
| [ManualResetEvent](./manualresetevent/) | [Event](../system/event/) لإشعار الخيط المنتظر الذي لا يعيد الضبط تلقائيًا. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [Monitor](./monitor/) | الفئة [Monitor](./monitor/) توفر آلية تُزامن الوصول إلى الكائنات. |
| [Mutex](./mutex/) | [Mutex](./mutex/) تنفيذ. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [Semaphore](./semaphore/) | [Semaphore](./semaphore/) تنفيذ. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [SynchronizationContext](./synchronizationcontext/) | يوفر الوظيفة الأساسية لنشر سياق المزامنة عبر عمليات المزامنة المختلفة. |
| [Thread](./thread/) | [Thread](./thread/) تنفيذ. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [ThreadPool](./threadpool/) | [Thread](./thread/) مجموعة API تسمح بدفع الوظائف إلى قائمة الانتظار لتُقرأ بواسطة مجموعة من خيوط العامل. هذا نوع ثابت لا يحتوي على خدمات مثيل. يجب ألا تنشئ أي مثيلات له بأي وسيلة. |
| [ThreadPoolImpl](./threadpoolimpl/) | [Thread](./thread/) بيانات داخلية للمجموعة. هذا نوع مفرد (Singleton) يتم إدارة ذاكرته عبر دوال الوصول. يجب ألا تنشئ أي مثيلات له مباشرة. |
| [Timer](./timer/) | [Timer](./timer/) فئة تنفّذ عنصر وظيفة في خيط منفصل بعد تأخير. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [TimerQueue](./timerqueue/) | قائمة انتظار تتعامل مع كائنات [Timer](./timer/). هذه مجرد تنفيذ. كائنات [Timer](./timer/) تسجل نفسها هناك تلقائيًا، لا تحتاج إلى القيام بذلك لاستخدامها - استخدم واجهة برمجة تطبيقات فئة [Timer](./timer/) بدلاً من ذلك. هذا نوع مفرد (Singleton) يتم إدارة ذاكرته عبر دوال الوصول. يجب ألا تنشئ أي مثيلات له مباشرة. |
| [WaitHandle](./waithandle/) | فئة أساسية بدائية للانتظار. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
## Enums

| تعداد | الوصف |
| --- | --- |
| [ApartmentState](./apartmentstate/) | يضبط حالة الشقة للخلية. |
| [EventResetMode](./eventresetmode/) | يشير إلى كيفية إعادة ضبط حالة الحدث. |
| [ThreadState](./threadstate/) | حالة الخلية. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [ParameterizedThreadStart](./parameterizedthreadstart/) | دالة [Thread](./thread/) بمعامل واحد. |
| [SendOrPostCallback](./sendorpostcallback/) |  |
| [ThreadStart](./threadstart/) | دالة [Thread](./thread/) بدون معاملات. |
| [TimerCallback](./timercallback/) | دالة رد الاتصال التي يستدعيها المؤقت. |
| [wait_handle_t](./wait_handle_t/) | نوع المقبض. |
| [WaitCallback](./waitcallback/) | عنصر رد الاتصال الذي يُنفّذ بمجرد توفر مساحة. |
