---
title: Aspose.Finance.Xbrl
second_title: مرجع واجهة برمجة تطبيقات Aspose.Finance لـ .NET
description: 
type: docs
weight: 210
url: /ar/net/aspose.finance.xbrl/
---


## الفئات

| الفئة | الوصف |
| --- | --- |
| [Arc](./arc) | الفئة الأساسية المجردة لـ Xlink بنوع Arc. |
| [ArcroleReference](./arcrolereference) | هذه الفئة تُستخدم لحل قيم arcrole المخصصة التي تُستعمل في Linkbase أو XBRL Instance. |
| [ArcroleType](./arcroletype) | هذه الفئة تُستخدم لتعريف نوع arc role المخصص. |
| [CalculationArc](./calculationarc) | هذه الفئة هي [`Xlink`](../aspose.finance.xbrl/xlink) بنوع Arc. إنها تحدد كيف ترتبط المفاهيم ببعضها لبعض لأغراض الحساب. |
| [CalculationLink](./calculationlink) | هذه الفئة تصف علاقات الحساب بين المفاهيم في التصنيفات. |
| [CalculationLinkbaseRef](./calculationlinkbaseref) | هذه الفئة تُستخدم لإشارة linkbase الحساب. |
| [Concept](./concept) | يتم تعريف المفاهيم بطريقتين مكافئتين. من الناحية التركيبية، المفهوم هو تعريف عنصر XML Schema، يحدد أن يكون العنصر في مجموعة استبدال عنصر item أو في مجموعة استبدال عنصر tuple. على المستوى الدلالي، المفهوم هو تعريف لنوع من الحقائق يمكن الإبلاغ عنها حول أنشطة أو طبيعة نشاط تجاري. |
| [Context](./context) | هذه الفئة تحتوي على الكيان والفترة والسيناريو الذين يوفّرون معًا السياق المناسب لفهم قيم العناصر. |
| [ContextEntity](./contextentity) | الكيان الخاص بـ [`Context`](../aspose.finance.xbrl/context). |
| [ContextPeriod](./contextperiod) | الفترة الخاصة بـ [`Context`](../aspose.finance.xbrl/context). |
| [ContextSenario](./contextsenario) | السيناريو الخاص بـ [`Context`](../aspose.finance.xbrl/context). |
| [DefinitionArc](./definitionarc) | هذه الفئة هي [`Xlink`](../aspose.finance.xbrl/xlink) بنوع Arc. إنها تحدد أنواعًا مختلفة من العلاقات بين المفاهيم. |
| [DefinitionLink](./definitionlink) | هذه الفئة مُصممة لاحتواء مجموعة متنوعة من العلاقات المتنوعة بين المفاهيم في التصنيفات. |
| [DefinitionLinkbaseRef](./definitionlinkbaseref) | هذه الفئة تُستخدم لتعريف مرجع قاعدة الروابط. |
| [DimensionMember](./dimensionmember) | الفئة تمثل عضو البُعد. تم تعريفها في https://www.xbrl.org/specification/dimensions/rec-2012-01-25/dimensions-rec-2006-09-18+corrected-errata-2012-01-25-clean.html. |
| [Fact](./fact) | يمكن أن تكون الحقيقة بسيطة، وفي هذه الحالة يجب التعبير عن قيمها كمحتوى بسيط، ويمكن أن تكون الحقائق مركبة، وفي هذه الحالة تُكوَّن قيمتها من حقائق بسيطة و/أو مركبة أخرى. تُعبّر الحقائق البسيطة باستخدام [`Item`](../aspose.finance.xbrl/item). تُعبّر الحقائق المركبة باستخدام [`Tuple`](../aspose.finance.xbrl/tuple)tuple. |
| [Footnote](./footnote) | هذه الفئة هي [`Xlink`](../aspose.finance.xbrl/xlink) من نوع Resource. إنها المورد الوحيد المسموح به في [`FootnoteLink`](../aspose.finance.xbrl/footnotelink). |
| [FootnoteArc](./footnotearc) | هذه الفئة هي [`Xlink`](../aspose.finance.xbrl/xlink) من نوع Arc. وهي موجودة في FootnoteLink. |
| [FootnoteLink](./footnotelink) | هذه الفئة تحتوي على Locators وresources وarcs التي تصف العلاقات غير المنتظمة بين الحقائق في مثال XBRL. |
| [IOConfig](./ioconfig) |  |
| [Item](./item) | العنصر هو عنصر في مجموعة الاستبدال لعنصر عنصر XBRL. يحتوي على قيمة الحقيقة البسيطة وإشارة إلى السياق (والوحدة للعناصر الرقمية) اللازمة لتفسير تلك الحقيقة بشكل صحيح. |
| [Label](./label) | هذه الفئة هي [`Xlink`](../aspose.finance.xbrl/xlink) من نوع Resource. على الرغم من أن كل تصنيف يحدد مجموعة واحدة من العناصر التي تمثل مجموعة من مفاهيم التقارير التجارية، فإن وثائق XBRL القابلة للقراءة البشرية لتلك المفاهيم، بما في ذلك التسميات (السلاسل المستخدمة كأسماء قابلة للقراءة البشرية لكل مفهوم) وغيرها من الوثائق التوضيحية، موجودة في عنصر مورد في قاعدة روابط التسميات. |
| [LabelArc](./labelarc) | هذه الفئة هي [`Xlink`](../aspose.finance.xbrl/xlink) من نوع Arc. إنها تربط المفاهيم بموارد [`Label`](../aspose.finance.xbrl/label). |
| [LabelLink](./labellink) | هذه الفئة مُصممة لاحتواء العلاقات بين المفاهيم والوثائق النصية والتسميات لتلك المفاهيم. |
| [LabelLinkbaseRef](./labellinkbaseref) | هذه الفئة تُستخدم لتسمية مرجع قاعدة الروابط. |
| [LinkbaseRef](./linkbaseref) | هذه الفئة تُستخدم لمرجع قاعدة الروابط. |
| [LinkbaseRefCollection](./linkbaserefcollection) | مجموعة من مراجع قاعدة الروابط للمخطط. |
| [LoadOptions](./loadoptions) | الفئة الأساسية لتكوين الخيارات في تحميل الملفات للأنواع المختلفة |
| [Loc](./loc) | هذه الفئة هي [`Xlink`](../aspose.finance.xbrl/xlink) من نوع Locator. |
| [LocalCacheService](./localcacheservice) | هذه الفئة هي خدمة ذاكرة تخزين مؤقت محلية لملفات المخطط و قاعدة الروابط الخارجية. |
| [Locator](./locator) | الفئة الأساسية المجردة لـ Xlink من نوع Locator. |
| [PresentationArc](./presentationarc) | هذه الفئة هي [`Xlink`](../aspose.finance.xbrl/xlink) من نوع Arc. إنها تحدد كيف ترتبط المفاهيم ببعضها لتقديم العرض. |
| [PresentationLink](./presentationlink) | هذه الفئة مُصممة لوصف العلاقات التقديمية بين المفاهيم في التصنيفات. |
| [PresentationLinkbaseRef](./presentationlinkbaseref) | هذه الفئة تُستخدم لمرجع قاعدة الروابط التقديمية. |
| [QualifiedName](./qualifiedname) | نوع مخطط XML "QName" كما هو معرف في مساحة الاسم http://www.w3.org/2001/XMLSchema. |
| [Reference](./reference) | هذه الفئة هي [`Xlink`](../aspose.finance.xbrl/xlink) من نوع Resource. إنها تمكّن تصنيفات XBRL من ربط تعريفات المفاهيم ببيانات موثوقة في الأدبيات التجارية والمالية والمحاسبية المنشورة. |
| [ReferenceArc](./referencearc) | هذه الفئة هي [`Xlink`](../aspose.finance.xbrl/xlink) من نوع Arc. إنها تربط المفاهيم بموارد المراجع. |
| [ReferenceLink](./referencelink) | هذه الفئة مُصممة لاحتواء العلاقات بين المفاهيم والمراجع إلى البيانات الموثوقة في الأدبيات التجارية والمالية والمحاسبية المنشورة التي تعطي معنى للمفاهيم. |
| [ReferenceLinkbaseRef](./referencelinkbaseref) | هذه الفئة تُستخدم لمرجع قاعدة الروابط. |
| [ReferencePart](./referencepart) | العضو الفرعي لـ [`Reference`](../aspose.finance.xbrl/reference). |
| [Resource](./resource) | الفئة الأساسية المجردة لـ Xlink من نوع Resource. |
| [RoleReference](./rolereference) | يُستخدم هذا الصنف في نسخة XBRL للإشارة إلى تعريفات أي قيم سمات دور مخصصة تُستَخدم في روابط الحواشي السفلية في نسخة XBRL. |
| [RoleType](./roletype) | يُستخدم هذا الصنف لتحديد نوع الدور المخصص. |
| [SaveOptions](./saveoptions) | يمثل خيارات الحفظ. |
| [SchemaRef](./schemaref) | هذا الصنف هو إشارة إلى مخطط تصنيف يصبح جزءًا من نظام DTS الداعم لنسخة XBRL. |
| [SchemaRefCollection](./schemarefcollection) | مجموعة من مراجع المخطط. |
| [SecHtmlReportSaveOption](./sechtmlreportsaveoption) | يمثل الخيارات لحفظ تقرير sec html. |
| [SimpleLink](./simplelink) | نوع بسيط Xlink. |
| [Tuple](./tuple) | المجموعة (tuple) هي عنصر في مجموعة الاستبدال لعنصر مجموعة XBRL. تُستخدم المجموعات لربط أجزاء حقيقة مركبة معًا. تلك الأجزاء المكوّنة هي في حد ذاتها حقائق ولكن يجب تفسيرها في ضوء بعضها البعض. على سبيل المثال، يجب تجميع الاسم والعمر والتعويض لمدير شركة معًا لتُفهم بشكل صحيح. |
| [Unit](./unit) | يُستخدم هذا الصنف لتحديد الوحدات التي تم قياس العنصر الرقمي بها. |
| [XbrlDocument](./xbrldocument) | مستند XBRL يحتوي على نسخة XBRL واحدة أو أكثر. |
| [XbrlException](./xbrlexception) | الاستثناء الذي يُرمى عندما يحدث خطأ محدد في Aspose.Finance.Xbrl. |
| [XbrlInstance](./xbrlinstance) | نسخة XBRL هي جزء XML يحتوي على عنصر جذر يحمل وسم xbrl. تحتوي نسخة XBRL على حقائق تقرير الأعمال، حيث يتطابق كل حقيقة مع [`Concept`](../aspose.finance.xbrl/concept) معرف في نظام DTS الداعم لها. كما تحتوي نسخة XBRL على سياقات ووحدات توفر معلومات إضافية ضرورية لتفسير الحقائق في النسخة. |
| [XbrlInstanceCollection](./xbrlinstancecollection) | مجموعة من نسخ XBRL. |
| [Xlink](./xlink) | فئة مجردة لجميع أنواع الروابط في XBRL، مثل الرابط البسيط، الرابط الموسع، وما إلى ذلك. |
## تعداد

| تعداد | الوصف |
| --- | --- |
| [ArcUse](./arcuse) | تعداد استخدام القوس. |
| [ContextPeriodType](./contextperiodtype) | تعداد نوع [`ContextPeriod`](../aspose.finance.xbrl/contextperiod). |
| [ElementBalanceType](./elementbalancetype) | تعداد نوع التوازن لـ [`Concept`](../aspose.finance.xbrl/concept). |
| [ElementPeriodType](./elementperiodtype) | تعداد نوع الفترة لـ [`Concept`](../aspose.finance.xbrl/concept). |
| [ElementSubstitutionGroup](./elementsubstitutiongroup) | تعداد نوع الاستبدال لـ [`Concept`](../aspose.finance.xbrl/concept). |
| [ReferenceRole](./referencerole) | تعداد دور المرجع. |
| [SaveFormat](./saveformat) |  |
| [UnitType](./unittype) | تعداد نوع الوحدة. |
| [XbrlExceptionType](./xbrlexceptiontype) | يمثل رمز نوع الاستثناء المخصص. |
| [XlinkType](./xlinktype) | تعداد نوع Xlink. |

<!-- لا تقم بالتعديل: تم إنشاؤه بواسطة xmldocmd لـ Aspose.Finance.dll -->
