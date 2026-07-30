---
title: "النطاق System::IO"
linktitle: "System::IO"
second_title: "Aspose.Font لـ C++"
description: "كيفية استخدام النطاق System::IO في C++."
type: docs
weight: 4300
url: /ar/cpp/system.io/
---



## الفئات

| الفئة | الوصف |
| --- | --- |
| [BasicSTDIOStreamWrapper](./basicstdiostreamwrapper/) | يمثّل غلافًا شبيهًا بـ [System.IO.Stream](./stream/)-like لـ std::basic_iostream والكائنات المشتقة منه. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/) . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاءً وقت التشغيل أو أعطال تأكيدية. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [BasicSTDIStreamWrapper](./basicstdistreamwrapper/) | يمثّل غلافًا شبيهًا بـ [System.IO.Stream](./stream/)-like لـ std::basic_istream والكائنات المشتقة منه. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/) . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاءً وقت التشغيل أو أعطال تأكيدية. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [BasicSTDOStreamWrapper](./basicstdostreamwrapper/) | يمثّل غلافًا شبيهًا بـ [System.IO.Stream](./stream/)-like لـ std::basic_ostream والكائنات المشتقة منه. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/) . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاءً وقت التشغيل أو أعطال تأكيدية. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [BasicSystemIOStreamBuf](./basicsystemiostreambuf/) | يمثّل مخزنًا يلف تدفقات شبيهة بـ [System::IO::Stream](./stream/)-like ويسمح باستخدامها كدفق داخلي شبيه بـ std::iostream. |
| [BasicSystemIOStreamWrapper](./basicsystemiostreamwrapper/) | يمثّل غلافًا شبيهًا بـ std::iostream يستخدم [BasicSystemIOStreamBuf](./basicsystemiostreambuf/) كمخزن داخلي. |
| [BasicSystemIStreamWrapper](./basicsystemistreamwrapper/) | يمثّل غلافًا شبيهًا بـ std::istream يستخدم [BasicSystemIOStreamBuf](./basicsystemiostreambuf/) كمخزن داخلي. |
| [BasicSystemOStreamWrapper](./basicsystemostreamwrapper/) | يمثّل غلافًا شبيهًا بـ std::ostream يستخدم [BasicSystemIOStreamBuf](./basicsystemiostreambuf/) كمخزن داخلي. |
| [BinaryReader](./binaryreader/) | يمثّل قارئًا يقرأ الأنواع الأولية للبيانات كبيانات ثنائية بترميز معين. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/) . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاءً وقت التشغيل أو أعطال تأكيدية. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [BinaryWriter](./binarywriter/) | يمثّل كاتبًا يكتب قيم الأنواع الأولية إلى تدفق بايت. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/) . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاءً وقت التشغيل أو أعطال تأكيدية. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [BufferedStream](./bufferedstream/) | يضيف طبقة تخزين مؤقت فوق تدفق آخر. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/) . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاءً وقت التشغيل أو أعطال تأكيدية. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [Directory](./directory/) | يحتوي على طرق لمعالجة الأدلة. هذا نوع ثابت دون خدمات مثيل. لا يجب عليك أبدًا إنشاء مثيلات له بأي طريقة. |
| [DirectoryInfo](./directoryinfo/) | يمثّل مسار نظام ملفات، دليلًا يُشار إليه بهذا المسار، ويوفر طرقًا مثيلية لمعالجة الأدلة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/) . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاءً وقت التشغيل أو أعطال تأكيدية. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [File](./file/) | يوفر طرقًا لمعالجة الملفات. هذا نوع ثابت دون خدمات مثيل. لا يجب عليك أبدًا إنشاء مثيلات له بأي طريقة. |
| [FileInfo](./fileinfo/) | يمثّل مسارًا إلى ملف وملفًا يُشار إليه بهذا المسار، ويوفر طرقًا لمعالجة ذلك. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/) . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاءً وقت التشغيل أو أعطال تأكيدية. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [FileStream](./filestream/) | يمثّل تدفق ملف يدعم عمليات القراءة والكتابة المتزامنة وغير المتزامنة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/) . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاءً وقت التشغيل أو أعطال تأكيدية. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [FileSystemInfo](./filesysteminfo/) | الفئة الأساسية لـ [FileInfo](./fileinfo/) و [DirectoryInfo](./directoryinfo/). يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/) . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاءً وقت التشغيل أو أعطال تأكيدية. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [FileSystemInfoStat](./filesysteminfostat/) | يمثّل معلومات حول ملف أو دليل. |
| [MemoryStream](./memorystream/) | يمثّل تدفقًا يقرأ من الذاكرة ويكتب إليها. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/) . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاءً وقت التشغيل أو أعطال تأكيدية. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [Path](./path/) | يوفر طرقًا لمعالجة المسارات. هذا نوع ثابت دون خدمات مثيل. لا يجب عليك أبدًا إنشاء مثيلات له بأي طريقة. |
| [STDIOStreamWrapperBase](./stdiostreamwrapperbase/) | يمثّل فئة أساسية لـ [System.IO.Stream](./stream/)-like للأغلفة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/) . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاءً وقت التشغيل أو أعطال تأكيدية. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [Stream](./stream/) | فئة أساسية لمجموعة متنوعة من تطبيقات التدفق. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/) . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاءً وقت التشغيل أو أعطال تأكيدية. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [StreamReader](./streamreader/) | يمثل قارئًا يقرأ الأحرف من تدفق بايت. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء التأكيد. دائمًا قم بلف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [StreamWriter](./streamwriter/) | يمثل كاتبًا يكتب الأحرف إلى تدفق بايت. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء التأكيد. دائمًا قم بلف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [StringReader](./stringreader/) | يمثل قارئًا يقرأ الأحرف من سلسلة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء التأكيد. دائمًا قم بلف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [StringWriter](./stringwriter/) | ينفّذ كائنًا من نوع [TextWriter](./textwriter/) يكتب المعلومات إلى سلسلة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء التأكيد. دائمًا قم بلف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [TextReader](./textreader/) | فئة أساسية للفئات التي تمثل قرّاء يقرأون تسلسلات من الأحرف من مصادر مختلفة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء التأكيد. دائمًا قم بلف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [TextWriter](./textwriter/) | فئة أساسية للفئات التي تمثل كُتابًا يكتبون تسلسلات من الأحرف إلى وجهات مختلفة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء التأكيد. دائمًا قم بلف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [UnmanagedMemoryStream](./unmanagedmemorystream/) | يوفر وصولًا إلى الذاكرة غير المُدارة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء التأكيد. دائمًا قم بلف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل. |
## Enums

| تعداد | الوصف |
| --- | --- |
| [FileAccess](./fileaccess/) | يحدد نوع الوصول عند فتح الملف. |
| [FileAttributes](./fileattributes/) | يمثل سمات دليل أو ملف. |
| [FileMode](./filemode/) | يحدد كيفية فتح الملف. |
| [FileOptions](./fileoptions/) | يمثل خيارات متقدمة لإنشاء كائن [FileStream](./filestream/). |
| [FileShare](./fileshare/) | يحدد نوع الوصول الذي يمكن لكائنات [FileStream](./filestream/) الأخرى أن تحصل عليه لملف يتم فتحه. |
| [SearchOption](./searchoption/) | يحدد ما إذا كان يجب إجراء البحث فقط في الدليل الحالي، أو في الدليل الحالي وجميع الأدلة الفرعية. |
| [SeekOrigin](./seekorigin/) | يحدد موضع المرجع في التدفق الذي يُحدد بناءً عليه موضع السعي. |
| [STDIOStreamPositionPreference](./stdiostreampositionpreference/) | يحدد أي موضع في التدفق يُفضَّل كموضع قراءة وكتابة مشترك عندما يكون لدى std::basic_iostream وسلالته مواضع قراءة وكتابة مختلفة عند إنشاء الغلاف. |
| [STDIOStreamWrappingMode](./stdiostreamwrappingmode/) | يحدد وضع عمليات الإدخال/الإخراج التي سيقوم بها الأغلفة على تدفقات شبيهة بـ std::iostreams. |
| [SystemIOStreamWrappingMode](./systemiostreamwrappingmode/) | يحدد وضع عمليات الإدخال/الإخراج التي سيقوم بها الأغلفة على تدفقات شبيهة بـ [System::IO::Stream](./stream/). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [BinaryWriterPtr](./binarywriterptr/) | اسم مستعار لمؤشر مشترك إلى هذه الفئة. |
| [FileNotFoundException](./filenotfoundexception/) | الاستثناء الذي يُرمى عندما يفشل محاولة الوصول إلى ملف غير موجود على القرص. لا تقم أبدًا بلف مثيلات فئة [FileNotFoundException](./filenotfoundexception/) في [System::SmartPtr](../system/smartptr/). |
| [IsTemplateBaseOf](./istemplatebaseof/) | يمثل النظير لـ std::is_base_of<Base, Derived> الذي يحدد وراثة فئة القالب Base غير المُنشأة من فئة القالب Derived المُنشأة. سيفشل في حالة الوراثة المتعددة أو الوراثة غير العامة من Base. |
| [STDIOStreamWrapper](./stdiostreamwrapper/) | تخصصات [BasicSTDIOStreamWrapper](./basicstdiostreamwrapper/) لأنواع الأحرف char. |
| [STDIStreamWrapper](./stdistreamwrapper/) | تخصصات [BasicSTDIStreamWrapper](./basicstdistreamwrapper/) لأنواع الأحرف char. |
| [STDOStreamWrapper](./stdostreamwrapper/) | تخصصات [BasicSTDOStreamWrapper](./basicstdostreamwrapper/) لأنواع الأحرف char. |
| [STDWIOStreamWrapper](./stdwiostreamwrapper/) | تخصصات [BasicSTDIOStreamWrapper](./basicstdiostreamwrapper/) لأنواع الأحرف wchar_t. |
| [STDWIStreamWrapper](./stdwistreamwrapper/) | تخصصات [BasicSTDIStreamWrapper](./basicstdistreamwrapper/) لأنواع الأحرف wchar_t. |
| [STDWOStreamWrapper](./stdwostreamwrapper/) | تخصيصات [BasicSTDOStreamWrapper](./basicstdostreamwrapper/) لأنواع الأحرف wchar_t. |
| [SystemIOStreamWrapper](./systemiostreamwrapper/) | تخصيصات [BasicSystemIOStreamWrapper](./basicsystemiostreamwrapper/) لأنواع الأحرف char. |
| [SystemIStreamWrapper](./systemistreamwrapper/) | تخصيصات [BasicSystemIStreamWrapper](./basicsystemistreamwrapper/) لأنواع الأحرف char. |
| [SystemOStreamWrapper](./systemostreamwrapper/) | تخصيصات [BasicSystemOStreamWrapper](./basicsystemostreamwrapper/) لأنواع الأحرف char. |
| [SystemWIOStreamWrapper](./systemwiostreamwrapper/) | تخصيصات [BasicSystemIOStreamWrapper](./basicsystemiostreamwrapper/) لأنواع الأحرف wchar_t. |
| [SystemWIStreamWrapper](./systemwistreamwrapper/) | تخصيصات [BasicSystemIStreamWrapper](./basicsystemistreamwrapper/) لأنواع الأحرف wchar_t. |
| [SystemWOStreamWrapper](./systemwostreamwrapper/) | تخصيصات [BasicSystemOStreamWrapper](./basicsystemostreamwrapper/) لأنواع الأحرف wchar_t. |
## Functions

| دالة | الوصف |
| --- | --- |
| WrapSTDIOStream | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| WrapSTDIOStream | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| WrapSTDIOStream | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
