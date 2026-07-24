---
title: "نطاق System::IO"
linktitle: "System::IO"
second_title: "Aspose.Page لـ C++"
description: "كيفية استخدام نطاق System::IO في C++."
type: docs
weight: 3900
url: /ar/cpp/system.io/
---



## الفئات

| فئة | الوصف |
| --- | --- |
| [BasicSTDIOStreamWrapper](./basicstdiostreamwrapper/) | يمثل غلافًا شبيهًا بـ [System.IO.Stream](./stream/) لـ std::basic_iostream والكائنات المشتقة منه. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/) . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [BasicSTDIStreamWrapper](./basicstdistreamwrapper/) | يمثل غلافًا شبيهًا بـ [System.IO.Stream](./stream/) لـ std::basic_istream والكائنات المشتقة منه. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/) . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [BasicSTDOStreamWrapper](./basicstdostreamwrapper/) | يمثل غلافًا شبيهًا بـ [System.IO.Stream](./stream/) لـ std::basic_ostream والكائنات المشتقة منه. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/) . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [BasicSystemIOStreamBuf](./basicsystemiostreambuf/) | يمثل مخزنًا يلتف حول تدفقات شبيهة بـ [System::IO::Stream](./stream/) ويسمح باستخدامها كمخزن داخلي لتدفقات شبيهة بـ std::iostream. |
| [BasicSystemIOStreamWrapper](./basicsystemiostreamwrapper/) | يمثل غلافًا شبيهًا بـ std::iostream يستخدم [BasicSystemIOStreamBuf](./basicsystemiostreambuf/) كمخزن داخلي. |
| [BasicSystemIStreamWrapper](./basicsystemistreamwrapper/) | يمثل غلافًا شبيهًا بـ std::istream يستخدم [BasicSystemIOStreamBuf](./basicsystemiostreambuf/) كمخزن داخلي. |
| [BasicSystemOStreamWrapper](./basicsystemostreamwrapper/) | يمثل غلافًا شبيهًا بـ std::ostream يستخدم [BasicSystemIOStreamBuf](./basicsystemiostreambuf/) كمخزن داخلي. |
| [BinaryReader](./binaryreader/) | يمثل قارئًا يقرأ الأنواع الأولية للبيانات كبيانات ثنائية بترميز معين. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/) . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [BinaryWriter](./binarywriter/) | يمثل كاتبًا يكتب قيم الأنواع الأولية إلى تدفق بايتات. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/) . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [BufferedStream](./bufferedstream/) | يضيف طبقة تخزين مؤقت فوق تدفق آخر. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/) . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [Directory](./directory/) | يحتوي على طرق للتعامل مع الأدلة. هذا نوع ثابت لا يقدم خدمات كائنات. يجب ألا تنشئ أي نسخ منه بأي وسيلة. |
| [DirectoryInfo](./directoryinfo/) | يمثل مسار نظام ملفات، ودليلًا يُشار إليه بهذا المسار، ويوفر طرقًا كائنية للتعامل مع الأدلة. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/) . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [File](./file/) | يوفر طرقًا للتعامل مع الملفات. هذا نوع ثابت لا يقدم خدمات كائنات. يجب ألا تنشئ أي نسخ منه بأي وسيلة. |
| [FileInfo](./fileinfo/) | يمثل مسارًا إلى ملف والملف المشار إليه بهذا المسار، ويوفر طرقًا للتعامل معه. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/) . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [FileStream](./filestream/) | يمثل تدفق ملف يدعم عمليات القراءة والكتابة المتزامنة وغير المتزامنة. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/) . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [FileSystemInfo](./filesysteminfo/) | الفئة الأساسية لـ [FileInfo](./fileinfo/) و [DirectoryInfo](./directoryinfo/). يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/) . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [FileSystemInfoStat](./filesysteminfostat/) | يمثل معلومات حول ملف أو دليل. |
| [MemoryStream](./memorystream/) | يمثل تدفقًا يقرأ من الذاكرة ويكتب إليها. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [Path](./path/) | يوفر طرقًا للتعامل مع المسارات. هذا نوع ثابت لا يحتوي على خدمات كائنات. لا ينبغي لك أبدًا إنشاء مثيلات له بأي وسيلة. |
| [STDIOStreamWrapperBase](./stdiostreamwrapperbase/) | يمثل فئة أساسية لأغلفة شبيهة بـ [System.IO.Stream](./stream/). يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [Stream](./stream/) | فئة أساسية لمجموعة متنوعة من تطبيقات التدفق. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [StreamReader](./streamreader/) | يمثل قارئًا يقرأ الأحرف من تدفق بايت. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [StreamWriter](./streamwriter/) | يمثل كاتبًا يكتب الأحرف إلى تدفق بايت. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [StringReader](./stringreader/) | يمثل قارئًا يقرأ الأحرف من سلسلة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [StringWriter](./stringwriter/) | ينفّذ [TextWriter](./textwriter/) يكتب المعلومات إلى سلسلة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [TextReader](./textreader/) | فئة أساسية للفئات التي تمثل قرّاء يقرؤون تسلسلات من الأحرف من مصادر مختلفة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [TextWriter](./textwriter/) | فئة أساسية للفئات التي تمثل كُتابًا يكتبون تسلسلات من الأحرف إلى وجهات مختلفة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [UnmanagedMemoryStream](./unmanagedmemorystream/) | يوفر وصولًا إلى الذاكرة غير المُدارة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل. |
## Enums

| تعداد | الوصف |
| --- | --- |
| [FileAccess](./fileaccess/) | يحدد نوع الوصول عند فتح الملف. |
| [FileAttributes](./fileattributes/) | يمثل سمات دليل أو ملف. |
| [FileMode](./filemode/) | يحدد كيفية فتح الملف. |
| [FileOptions](./fileoptions/) | يمثل خيارات متقدمة لإنشاء كائن [FileStream](./filestream/). |
| [FileShare](./fileshare/) | يحدد نوع الوصول الذي يمكن لكائنات [FileStream](./filestream/) الأخرى أن تحصل عليه للملف المفتوح. |
| [SearchOption](./searchoption/) | يحدد ما إذا كان يجب إجراء البحث فقط في الدليل الحالي، أو في الدليل الحالي وجميع الأدلة الفرعية. |
| [SeekOrigin](./seekorigin/) | يحدد موضع الإشارة في التدفق الذي يُحدّد بناءً عليه الموضع المطلوب السعي إليه. |
| [STDIOStreamPositionPreference](./stdiostreampositionpreference/) | يحدد أي موضع في التدفق يفضَّل كموضع قراءة وكتابة مشترك عندما يكون لدى std::basic_iostream وسلالتها مواضع قراءة وكتابة مختلفة عند إنشاء الغلاف. |
| [STDIOStreamWrappingMode](./stdiostreamwrappingmode/) | يحدد وضع عمليات الإدخال/الإخراج التي ستقوم بها الأغلفة على تدفقات شبيهة بـ std::iostreams. |
| [SystemIOStreamWrappingMode](./systemiostreamwrappingmode/) | يحدد وضع عمليات الإدخال/الإخراج التي ستقوم بها الأغلفة على تدفقات شبيهة بـ [System::IO::Stream](./stream/). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [BinaryWriterPtr](./binarywriterptr/) | اسم مستعار لمؤشر مشترك إلى هذه الفئة. |
| [FileNotFoundException](./filenotfoundexception/) | الاستثناء الذي يُرمى عندما يفشل محاولة الوصول إلى ملف غير موجود على القرص. لا تقم أبدًا بتغليف كائنات الفئة [FileNotFoundException](./filenotfoundexception/) في [System::SmartPtr](../system/smartptr/). |
| [IsTemplateBaseOf](./istemplatebaseof/) | يمثل نظير std::is_base_of<Base, Derived> الذي يحدد وراثة فئة القالب Base غير المُنشأة من فئة القالب Derived المُنشأة. سيفشل في حالة الوراثة المتعددة أو الوراثة غير العامة من Base. |
| [STDIOStreamWrapper](./stdiostreamwrapper/) | تخصصات [BasicSTDIOStreamWrapper](./basicstdiostreamwrapper/) لأنواع الأحرف char. |
| [STDIStreamWrapper](./stdistreamwrapper/) | تخصصات [BasicSTDIStreamWrapper](./basicstdistreamwrapper/) لأنواع الأحرف char. |
| [STDOStreamWrapper](./stdostreamwrapper/) | تخصصات [BasicSTDOStreamWrapper](./basicstdostreamwrapper/) لأنواع الأحرف char. |
| [STDWIOStreamWrapper](./stdwiostreamwrapper/) | تخصصات [BasicSTDIOStreamWrapper](./basicstdiostreamwrapper/) لأنواع الأحرف wchar_t. |
| [STDWIStreamWrapper](./stdwistreamwrapper/) | تخصصات [BasicSTDIStreamWrapper](./basicstdistreamwrapper/) لأنواع الأحرف wchar_t. |
| [STDWOStreamWrapper](./stdwostreamwrapper/) | تخصصات [BasicSTDOStreamWrapper](./basicstdostreamwrapper/) لأنواع الأحرف wchar_t. |
| [SystemIOStreamWrapper](./systemiostreamwrapper/) | تخصصات [BasicSystemIOStreamWrapper](./basicsystemiostreamwrapper/) لأنواع الأحرف char. |
| [SystemIStreamWrapper](./systemistreamwrapper/) | تخصصات [BasicSystemIStreamWrapper](./basicsystemistreamwrapper/) لأنواع الأحرف char. |
| [SystemOStreamWrapper](./systemostreamwrapper/) | تخصصات [BasicSystemOStreamWrapper](./basicsystemostreamwrapper/) لأنواع الأحرف char. |
| [SystemWIOStreamWrapper](./systemwiostreamwrapper/) | تخصصات [BasicSystemIOStreamWrapper](./basicsystemiostreamwrapper/) لأنواع الأحرف wchar_t. |
| [SystemWIStreamWrapper](./systemwistreamwrapper/) | تخصصات [BasicSystemIStreamWrapper](./basicsystemistreamwrapper/) لأنواع الأحرف wchar_t. |
| [SystemWOStreamWrapper](./systemwostreamwrapper/) | تخصصات [BasicSystemOStreamWrapper](./basicsystemostreamwrapper/) لأنواع الأحرف wchar_t. |
## Functions

| دالة | الوصف |
| --- | --- |
| WrapSTDIOStream | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| WrapSTDIOStream | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| WrapSTDIOStream | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
