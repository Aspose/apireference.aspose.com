---
title: "System::Threading namespace"
linktitle: "System::Threading"
second_title: "Aspose.Page لـ C++"
description: "كيفية استخدام مساحة الاسم System::Threading في C++."
type: docs
weight: 6500
url: /ar/cpp/system.threading/
---



## الفئات

| فئة | الوصف |
| --- | --- |
| [AutoResetEvent](./autoresetevent/) | [Event](../system/event/) لإشعار الخيط المنتظر بإعادة الضبط تلقائيًا. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [CancellationToken](./cancellationtoken/) | ينقل إشعارًا بأن العمليات يجب إلغاؤها. توفر هذه الفئة آلية للإلغاء التعاوني بين الخيوط، مما يسمح لخيط واحد بإشعار الآخرين بأن العملية يجب إلغاؤها. |
| [CancellationTokenRegistration](./cancellationtokenregistration/) | يمثل تسجيلًا لاستدعاء رد نداء رمز الإلغاء. |
| [CancellationTokenSource](./cancellationtokensource/) | مصدر رمز إلغاء يمكن استخدامه لإطلاق إشعارات الإلغاء. |
| [EventWaitHandle](./eventwaithandle/) | [Event](../system/event/) يمكن إرساله إلى الخيط المنتظر. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [Interlocked](./interlocked/) | يوفر API للعمليات الآمنة عبر الخيوط. هذا نوع ثابت لا يحتوي على خدمات مثيلات. يجب ألا تقوم بإنشاء مثيلات له بأي وسيلة. |
| [ManualResetEvent](./manualresetevent/) | [Event](../system/event/) لإخطار الخيط المنتظر الذي لا يعيد الضبط تلقائيًا. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم أبدًا بإنشاء مثيل لهذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [Monitor](./monitor/) | الفئة [Monitor](./monitor/) توفر آلية تُزامن الوصول إلى الكائنات. |
| [Mutex](./mutex/) | [Mutex](./mutex/) تنفيذ. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم أبدًا بإنشاء مثيل لهذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [Semaphore](./semaphore/) | [Semaphore](./semaphore/) تنفيذ. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم أبدًا بإنشاء مثيل لهذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [SynchronizationContext](./synchronizationcontext/) | يوفر الوظيفة الأساسية لنشر سياق المزامنة عبر عمليات المزامنة المختلفة. |
| [Thread](./thread/) | [Thread](./thread/) تنفيذ. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم أبدًا بإنشاء مثيل لهذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [ThreadPool](./threadpool/) | [Thread](./thread/) مجموعة API تسمح بدفع الوظائف إلى الطابور لتُقرأ بواسطة مجموعة من خيوط العاملين. هذا نوع ثابت لا يحتوي على خدمات مثيلات. يجب ألا تقوم بإنشاء مثيلات له بأي وسيلة. |
| [ThreadPoolImpl](./threadpoolimpl/) | [Thread](./thread/) بيانات داخلية للمجموعة. هذا نوع مفرد (Singleton) تُدار ذاكرته بواسطة دوال الوصول. يجب ألا تقوم بإنشاء مثيلات له مباشرة. |
| [Timer](./timer/) | [Timer](./timer/) فئة تنفّذ عنصر وظيفة في خيط منفصل بعد تأخير. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم أبدًا بإنشاء مثيل لهذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [TimerQueue](./timerqueue/) | طابور يتعامل مع كائنات [Timer](./timer/). هذه مجرد تنفيذ. كائنات [Timer](./timer/) تسجل نفسها هناك تلقائيًا، لا تحتاج إلى القيام بذلك لاستخدامها - استخدم API فئة [Timer](./timer/) بدلاً من ذلك. هذا نوع مفرد تُدار ذاكرته بواسطة دوال الوصول. يجب ألا تقوم بإنشاء مثيلات له مباشرة. |
| [WaitHandle](./waithandle/) | الفئة الأساسية للبدائل الانتظارية. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم أبدًا بإنشاء مثيل لهذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
## Enums

| تعداد | الوصف |
| --- | --- |
| [ApartmentState](./apartmentstate/) | يضبط حالة الـ apartment للخيط. |
| [EventResetMode](./eventresetmode/) | يحدد كيفية إعادة ضبط حالة الحدث. |
| [ThreadState](./threadstate/) | حالة الخيط. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [ParameterizedThreadStart](./parameterizedthreadstart/) | دالة [Thread](./thread/) ذات معلمة واحدة. |
| [SendOrPostCallback](./sendorpostcallback/) |  |
| [ThreadStart](./threadstart/) | دالة [Thread](./thread/) بدون معلمات. |
| [TimerCallback](./timercallback/) | دالة رد نداء تُستدعى بواسطة المؤقت. |
| [wait_handle_t](./wait_handle_t/) | نوع المقبض. |
| [WaitCallback](./waitcallback/) | عنصر رد نداء يُنفّذ بمجرد توفر مساحة. |
