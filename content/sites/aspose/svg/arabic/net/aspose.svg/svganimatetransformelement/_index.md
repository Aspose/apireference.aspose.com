---
title: Class SVGAnimateTransformElement
second_title: Aspose.SVG لمرجع .NET API
description: Aspose.Svg.SVGAnimateTransformElement فصل. تتوافق واجهة SVGAnimateTransformElement مع عنصر animateTransform. لا يتوفر الوصول الموجه للكائنات إلى سمات عنصر animateTransform عبر SVG DOM.
type: docs
weight: 3110
url: /ar/net/aspose.svg/svganimatetransformelement/
---
## SVGAnimateTransformElement class

تتوافق واجهة SVGAnimateTransformElement مع عنصر "animateTransform". لا يتوفر الوصول الموجه للكائنات إلى سمات عنصر "animateTransform" عبر SVG DOM.

```csharp
public class SVGAnimateTransformElement : SVGAnimationElement
```

## الخصائص

| اسم | وصف |
| --- | --- |
| override [Attributes](../../aspose.svg.dom/element/attributes/) { get; } | خريطة NamedNodeMap تحتوي على سمات هذه العقدة (إذا كانت عنصرًا) أو خالية بخلاف ذلك. |
| virtual [BaseURI](../../aspose.svg.dom/node/baseuri/) { get; } | URI الأساسي المطلق لهذه العقدة أو فارغ إذا لم يتمكن التطبيق من الحصول على URI مطلق. |
| [ChildElementCount](../../aspose.svg.dom/element/childelementcount/) { get; } | إرجاع العدد الحالي لعقد العناصر التي هي عناصر فرعية لهذا العنصر. 0 إذا كان هذا العنصر لا يحتوي على عقد فرعية من نوع العقدة 1. |
| [ChildNodes](../../aspose.svg.dom/node/childnodes/) { get; } | قائمة NodeList التي تحتوي على كافة توابع هذه العقدة. إذا لم يكن هناك أطفال ، فهذه قائمة NodeList لا تحتوي على عقد .. |
| [Children](../../aspose.svg.dom/element/children/) { get; } | إرجاع العناصر الفرعية للعنصر الحالي. |
| [ClassList](../../aspose.svg.dom/element/classlist/) { get; } | إرجاع قائمة DOMTokenList الحية التي تحتوي على الرموز المميزة المستلمة من تحليل سمة "class" . |
| [ClassName](../../aspose.svg/svgelement/classname/) { get; } | يتوافق مع السمة "class" في العنصر المحدد. |
| [ClassName](../../aspose.svg.dom/element/classname/) { get; set; } | سمة الفئة الخاصة بالعنصر. تمت إعادة تسمية هذه السمة due لتعارضها مع الكلمة الأساسية "class" التي تعرضها العديد من اللغات. راجع تعريف سمة الفئة في HTML 4.01. |
| [FirstChild](../../aspose.svg.dom/node/firstchild/) { get; } | الطفل الأول لهذه العقدة. إذا لم يكن هناك مثل هذه العقدة ، فإن هذا يعيد قيمة خالية. |
| [FirstElementChild](../../aspose.svg.dom/element/firstelementchild/) { get; } | إرجاع أول عقدة عنصر فرعي لهذا العنصر. خالية إذا كان هذا العنصر لا يحتوي على عناصر فرعية. |
| [Id](../../aspose.svg/svgelement/id/) { get; set; } | قيمة سمة "id" في العنصر المحدد ، أو السلسلة الفارغة إذا لم يكن "id" موجودًا . |
| [InnerHTML](../../aspose.svg.dom/element/innerhtml/) { get; set; } | إرجاع جزء من HTML أو XML يمثل محتويات العنصر. يمكن تعيينه لاستبدال محتويات العنصر بالعقد التي تم تحليلها من السلسلة المحددة. |
| [LastChild](../../aspose.svg.dom/node/lastchild/) { get; } | آخر تابع لهذه العقدة. إذا لم يكن هناك مثل هذه العقدة ، فإن هذا يعيد قيمة خالية. |
| [LastElementChild](../../aspose.svg.dom/element/lastelementchild/) { get; } | إرجاع آخر عقدة عنصر فرعي لهذا العنصر. خالية إذا كان هذا العنصر لا يحتوي على عناصر فرعية. |
| override [LocalName](../../aspose.svg.dom/element/localname/) { get; } | إرجاع الجزء المحلي من الاسم المؤهل لهذه العقدة . بالنسبة للعقد من أي نوع بخلاف ELEMENT_NODE و ATTRIBUTE_NODE والعقد التي تم إنشاؤها باستخدام طريقة DOM من المستوى 1 ، مثل Document.createElement () ، يكون هذا دائمًا فارغًا. |
| override [NamespaceURI](../../aspose.svg.dom/element/namespaceuri/) { get; } | معرف مساحة الاسم لهذه العقدة ، أو فارغ إذا كانت غير محددة. |
| [NextElementSibling](../../aspose.svg.dom/element/nextelementsibling/) { get; } | إرجاع عقدة العنصر الشقيقة التالية لهذا العنصر. خالية إذا كان هذا العنصر لا يحتوي على عقد شقيقة لعنصر تأتي بعد هذا في شجرة المستند. |
| [NextSibling](../../aspose.svg.dom/node/nextsibling/) { get; } | العقدة التي تلي هذه العقدة مباشرة. إذا لم يكن هناك مثل هذه العقدة ، فإن هذا يعيد قيمة خالية. |
| override [NodeName](../../aspose.svg.dom/element/nodename/) { get; } | اسم هذه العقدة حسب نوعها. |
| override [NodeType](../../aspose.svg.dom/element/nodetype/) { get; } | رمز يمثل نوع الكائن الأساسي. |
| virtual [NodeValue](../../aspose.svg.dom/node/nodevalue/) { get; set; } | قيمة هذه العقدة حسب نوعها. |
| [OuterHTML](../../aspose.svg.dom/element/outerhtml/) { get; set; } | إرجاع جزء من HTML أو XML يمثل العنصر ومحتوياته. يمكن تعيينه لاستبدال العنصر بالعقد التي تم تحليلها من السلسلة المحددة. |
| virtual [OwnerDocument](../../aspose.svg.dom/node/ownerdocument/) { get; } | كائن المستند المرتبط بهذه العقدة. هذا هو أيضًا كائن المستند المستخدم لإنشاء عقد جديدة. عندما تكون هذه العقدة عبارة عن مستند أو نوع مستند لم يتم استخدامه مع أي مستند حتى الآن ، يكون هذا فارغًا. |
| [OwnerSVGElement](../../aspose.svg/svgelement/ownersvgelement/) { get; } | أقرب عنصر "svg" للأصل. لاغية إذا كان العنصر المحدد هو العنصر الأبعد svg . |
| [ParentElement](../../aspose.svg.dom/node/parentelement/) { get; } | يحصل على الوالد[`Element`](../../aspose.svg.dom/element/) من هذه العقدة. |
| [ParentNode](../../aspose.svg.dom/node/parentnode/) { get; } | أصل هذه العقدة. قد يكون لجميع العقد ، باستثناء Attr و Document و DocumentFragment و Entity و Notation ، أصل. ومع ذلك ، إذا تم إنشاء عقدة للتو ولم تتم إضافتها بعد إلى الشجرة ، أو إذا تمت إزالتها من الشجرة ، فسيكون ذلك فارغًا. |
| override [Prefix](../../aspose.svg.dom/element/prefix/) { get; } | بادئة مساحة الاسم لهذه العقدة ، أو فارغة إذا كانت غير محددة. عندما يتم تعريفه على أنه فارغ ، فإن الإعداد ليس له تأثير |
| [PreviousElementSibling](../../aspose.svg.dom/element/previouselementsibling/) { get; } | إرجاع عقدة العنصر الشقيقة السابقة لهذا العنصر. خالية إذا كان هذا العنصر لا يحتوي على عقد شقيقة لعنصر تأتي قبل هذا في شجرة الوثيقة. |
| [PreviousSibling](../../aspose.svg.dom/node/previoussibling/) { get; } | العقدة التي تسبق هذه العقدة مباشرة. إذا لم يكن هناك مثل هذه العقدة ، فإن هذا يعيد قيمة خالية. |
| [RequiredExtensions](../../aspose.svg/svganimationelement/requiredextensions/) { get; } | يتوافق مع السمة "requiredExtensions" في العنصر المحدد. |
| [RequiredFeatures](../../aspose.svg/svganimationelement/requiredfeatures/) { get; } | يتوافق مع السمة "requiredFeatures" في العنصر المحدد . |
| [SchemaTypeInfo](../../aspose.svg.dom/element/schematypeinfo/) { get; } | نوع المعلومات المرتبطة بهذا العنصر . |
| [ShadowRoot](../../aspose.svg.dom/element/shadowroot/) { get; } | تُرجع shadowRoot المخزنة في هذا العنصر أو تُرجع فارغة إذا كان مغلقًا. |
| [Style](../../aspose.svg/svgelement/style/) { get; } | يتوافق مع السمة "النمط" على العنصر المحدد. إذا كان وكيل المستخدم لا يدعم التصميم باستخدام CSS ، فيجب أن يكون لهذه السمة دائمًا قيمة خالية. |
| [SystemLanguage](../../aspose.svg/svganimationelement/systemlanguage/) { get; } | يتوافق مع السمة "systemLanguage" على العنصر المحدد. |
| [TagName](../../aspose.svg.dom/element/tagname/) { get; } | اسم العنصر . |
| [TargetElement](../../aspose.svg/svganimationelement/targetelement/) { get; } | العنصر الذي يتم تحريكه . |
| override [TextContent](../../aspose.svg.dom/element/textcontent/) { get; set; } | تقوم هذه السمة بإرجاع المحتوى النصي لهذه العقدة وتوابعها. عندما يتم تعريفه على أنه فارغ ، فإن تعيينه ليس له أي تأثير. عند الإعداد ، تتم إزالة أي أطفال محتملين قد تكون هذه العقدة لديهم ، وإذا لم تكن السلسلة الجديدة فارغة أو فارغة ، فسيتم استبدالها بعقدة نصية واحدة تحتوي على السلسلة التي تم تعيين هذه السمة عليها. |
| [ViewportElement](../../aspose.svg/svgelement/viewportelement/) { get; } | العنصر الذي أنشأ إطار العرض الحالي. في كثير من الأحيان ، أقرب عنصر "svg" سلف. لاغية إذا كان العنصر المحدد هو العنصر الأبعد svg . |

## طُرق

| اسم | وصف |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, IEventListener) | تسمح هذه الطريقة بتسجيل مستمعي الحدث على هدف الحدث. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, DOMEventHandler, bool) | تسمح هذه الطريقة بتسجيل مستمعي الحدث على هدف الحدث. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, IEventListener, bool) | تسمح هذه الطريقة بتسجيل مستمعي الحدث على هدف الحدث. |
| [AppendChild](../../aspose.svg.dom/node/appendchild/)(Node) | يضيف العقدة newChild إلى نهاية قائمة العناصر الفرعية لهذه العقدة. إذا كان الطفل الجديد موجودًا بالفعل في الشجرة ، فسيتم إزالته أولاً. |
| [AttachShadow](../../aspose.svg.dom/element/attachshadow/)(ShadowRootMode) | لإنشاء جذر الظل وإرفاقه بالعنصر الحالي. |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)() | إرجاع نسخة مكررة من هذه العقدة ، على سبيل المثال ، بمثابة مُنشئ نسخة عام للعقد. لا تحتوي العقدة المكررة على أصل (العقدة الأم خالية) ولا توجد بيانات مستخدم. |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)(bool) | إرجاع نسخة مكررة من هذه العقدة ، على سبيل المثال ، بمثابة مُنشئ نسخة عام للعقد. لا تحتوي العقدة المكررة على أصل (العقدة الأم خالية) ولا توجد بيانات مستخدم. |
| [DispatchEvent](../../aspose.svg.dom/eventtarget/dispatchevent/)(Event) | تسمح هذه الطريقة بإرسال الأحداث إلى نموذج حدث عمليات التنفيذ. |
| [Dispose](../../aspose.svg.dom/eventtarget/dispose/)() | تنفيذ مهام محددة بواسطة التطبيق مرتبطة بتحرير الموارد غير المُدارة أو تحريرها أو إعادة تعيينها. |
| [GetAttribute](../../aspose.svg.dom/element/getattribute/)(string) | استرداد قيمة سمة بالاسم. |
| [GetAttributeNode](../../aspose.svg.dom/element/getattributenode/)(string) | استرداد عقدة سمة بالاسم. |
| [GetAttributeNodeNS](../../aspose.svg.dom/element/getattributenodens/)(string, string) | استرداد عقدة Attr بالاسم المحلي ومساحة URI. |
| [GetAttributeNS](../../aspose.svg.dom/element/getattributens/)(string, string) | استرداد قيمة سمة حسب الاسم المحلي ومساحة URI. |
| [GetElementsByClassName](../../aspose.svg.dom/element/getelementsbyclassname/)(string) | إرجاع كائن NodeList مباشر يحتوي على جميع العناصر في المستند التي تحتوي على جميع الفئات المحددة في الوسيطة . http://www.w3.org/TR/dom/ |
| [GetElementsByTagName](../../aspose.svg.dom/element/getelementsbytagname/)(string) | إرجاع NodeList لجميع العناصر التابعة مع اسم علامة محدد ، بترتيب المستند. |
| [GetElementsByTagNameNS](../../aspose.svg.dom/element/getelementsbytagnamens/)(string, string) | إرجاع NodeList لجميع العناصر التابعة مع اسم محلي محدد ومساحة URI بترتيب المستند. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | تُستخدم هذه الطريقة لاسترداد كائن ECMAScriptType . |
| [HasAttribute](../../aspose.svg.dom/element/hasattribute/)(string) | إرجاع صحيح عندما يتم تحديد سمة تحمل اسمًا معينًا في هذا العنصر أو عندما تكون لها قيمة افتراضية ، أو خطأ بخلاف ذلك. |
| [HasAttributeNS](../../aspose.svg.dom/element/hasattributens/)(string, string) | إرجاع صحيح عندما يتم تحديد سمة ذات اسم محلي ومساحة اسم URI على هذا العنصر أو لها قيمة افتراضية ، خطأ بخلاف ذلك. |
| override [HasAttributes](../../aspose.svg.dom/element/hasattributes/)() | إرجاع ما إذا كانت هذه العقدة (إذا كانت عنصرًا) لها أي سمات |
| [HasChildNodes](../../aspose.svg.dom/node/haschildnodes/)() | إرجاع ما إذا كان لهذه العقدة أي توابع. |
| [InsertBefore](../../aspose.svg.dom/node/insertbefore/)(Node, Node) | يقوم بإدراج العقدة قبل تابع العقدة الفرعية الموجودة. إذا كان الطفل فارغًا ، فقم بإدراج العقدة في نهاية قائمة العناصر الفرعية . إذا كان الكائن الفرعي عبارة عن كائن DocumentFragment ، فسيتم إدراج جميع توابعه ، بالترتيب نفسه ، قبل التابع. إذا كان الطفل موجودًا بالفعل في الشجرة ، فسيتم إزالته أولاً. |
| [IsDefaultNamespace](../../aspose.svg.dom/node/isdefaultnamespace/)(string) | يتحقق هذا الأسلوب مما إذا كانت مساحة الاسم المحددة هي مساحة الاسم الافتراضية أم لا. |
| [IsEqualNode](../../aspose.svg.dom/node/isequalnode/)(Node) | اختبار ما إذا كانت العقدتان متساويتان. تختبر هذه الطريقة المساواة بين العقد ، وليس التماثل (أي ما إذا كانت العقدتان مرجعيتان لنفس الكائن) والتي يمكن اختبارها باستخدام Node.isSameNode (). جميع العقد التي هي نفسها ستكون متساوية أيضًا ، على الرغم من أن العكس قد لا يكون صحيحًا. |
| [IsSameNode](../../aspose.svg.dom/node/issamenode/)(Node) | إرجاع ما إذا كانت هذه العقدة هي نفس العقدة المحددة. توفر هذه الطريقة طريقة لتحديد ما إذا كان مرجعان للعقدة يتم إرجاعهما بواسطة مرجع التطبيق نفس الكائن. عندما يكون مراجعان للعقدة مراجع لنفس الكائن ، حتى لو كان ذلك من خلال وكيل ، يمكن استخدام المراجع بشكل تبادلي تمامًا ، بحيث يكون لجميع السمات نفس القيم واستدعاء نفس طريقة DOM على أي مرجع يكون له نفس التأثير دائمًا. |
| [LookupNamespaceURI](../../aspose.svg.dom/node/lookupnamespaceuri/)(string) | ابحث عن مساحة الاسم URI المرتبطة بالبادئة المحددة ، بدءًا من هذه العقدة. |
| [LookupPrefix](../../aspose.svg.dom/node/lookupprefix/)(string) | ابحث عن البادئة المرتبطة بمساحة الاسم المحددة URI ، بدءًا من هذه العقدة. يتم تجاهل تعريفات مساحة الاسم الافتراضية بهذه الطريقة. راجع بحث بادئة مساحة الاسم للحصول على تفاصيل حول الخوارزمية المستخدمة بواسطة هذه الطريقة. |
| [Normalize](../../aspose.svg.dom/node/normalize/)() | وضع جميع العقد النصية في العمق الكامل للشجرة الفرعية أسفل هذه العقدة ، بما في ذلك عقد السمات ، في نموذج "عادي" حيث تفصل البنية فقط (على سبيل المثال ، العناصر والتعليقات وتعليمات المعالجة وأقسام CDATA ومراجع الكيانات) النص العقد ، أي لا توجد عقد نصية متجاورة ولا عقد نصية فارغة. يمكن استخدام هذا للتأكد من أن عرض DOM للمستند هو نفسه كما لو تم حفظه وإعادة تحميله ، ويكون مفيدًا عندما تكون العمليات (مثل عمليات بحث XPointer [XPointer]) التي تعتمد على بنية شجرة وثيقة معينة يستخدم. إذا كانت المعلمة "تطبيع الأحرف" لكائن DOMConfiguration المرفقة بـ Node.ownerDocument صحيحة ، فإن هذه الطريقة ستعمل أيضًا على تسوية أحرف العقد النصية بشكل كامل. |
| [QuerySelector](../../aspose.svg.dom/element/queryselector/)(string) | إرجاع العنصر الأول في المستند الذي يتطابق مع selector |
| [QuerySelectorAll](../../aspose.svg.dom/element/queryselectorall/)(string) | إرجاع قائمة NodeList لجميع العناصر الموجودة في المستند ، والتي تطابق selector |
| [Remove](../../aspose.svg.dom/element/remove/)() | يزيل هذا المثيل. |
| [RemoveAttribute](../../aspose.svg.dom/element/removeattribute/)(string) | يزيل سمة بالاسم . |
| [RemoveAttributeNode](../../aspose.svg.dom/element/removeattributenode/)(Attr) | يزيل عقدة السمة المحددة. |
| [RemoveAttributeNS](../../aspose.svg.dom/element/removeattributens/)(string, string) | يزيل سمة حسب الاسم المحلي ومساحة URI. |
| [RemoveChild](../../aspose.svg.dom/node/removechild/)(Node) | يزيل العقدة الفرعية التي أشار إليها oldChild من قائمة الأطفال ، ويعيدها . |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, IEventListener) | تسمح هذه الطريقة بإزالة مستمعي الحدث من هدف الحدث. إذا كان[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) تمت إزالته من ملف[`EventTarget`](../../aspose.svg.dom/eventtarget/) أثناء معالجة حدث ، لن يتم تشغيله من خلال الإجراءات الحالية. لا يمكن استدعاء مستمعي الأحداث بعد إزالتها. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, DOMEventHandler, bool) | تسمح هذه الطريقة بإزالة مستمعي الحدث من هدف الحدث. إذا كان[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) تمت إزالته من ملف[`EventTarget`](../../aspose.svg.dom/eventtarget/) أثناء معالجة حدث ، لن يتم تشغيله من خلال الإجراءات الحالية. لا يمكن استدعاء مستمعي الأحداث بعد إزالتها. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, IEventListener, bool) | تسمح هذه الطريقة بإزالة مستمعي الحدث من هدف الحدث. إذا كان[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) تمت إزالته من ملف[`EventTarget`](../../aspose.svg.dom/eventtarget/) أثناء معالجة حدث ، لن يتم تشغيله من خلال الإجراءات الحالية. لا يمكن استدعاء مستمعي الأحداث بعد إزالتها. |
| [ReplaceChild](../../aspose.svg.dom/node/replacechild/)(Node, Node) | يستبدل العقدة الفرعية oldChild بـ newChild في قائمة الأطفال ، ويعيد العقدة oldChild. إذا كان newChild هو كائن DocumentFragment ، فسيتم استبدال oldChild بكافة العناصر الفرعية DocumentFragment ، والتي يتم إدراجها بنفس الترتيب. إذا كان الطفل الجديد موجودًا بالفعل في الشجرة ، فسيتم إزالته أولاً. |
| [SetAttribute](../../aspose.svg.dom/element/setattribute/)(string, string) | إضافة سمة جديدة. إذا كانت السمة التي تحمل هذا الاسم موجودة بالفعل في العنصر ، فسيتم تغيير قيمتها لتصبح قيمة معلمة القيمة |
| [SetAttributeNode](../../aspose.svg.dom/element/setattributenode/)(Attr) | إضافة عقدة سمة جديدة. إذا كانت السمة بهذا الاسم (nodeName) موجودة بالفعل في العنصر ، فسيتم استبدالها بالسمة الجديدة. |
| [SetAttributeNodeNS](../../aspose.svg.dom/element/setattributenodens/)(Attr) | إضافة سمة جديدة. إذا كانت هناك سمة بهذا الاسم المحلي ومساحة URI موجودة بالفعل في العنصر ، فسيتم استبدالها بالسمة الجديدة. |
| [SetAttributeNS](../../aspose.svg.dom/element/setattributens/)(string, string, string) | إضافة سمة جديدة. إذا كانت سمة تحمل نفس الاسم المحلي ومساحة URI موجودة بالفعل على العنصر ، فسيتم تغيير بادئتها لتكون جزء البادئة من الاسم المؤهل ، ويتم تغيير قيمتها لتكون معلمة القيمة. |
| [SetIdAttribute](../../aspose.svg.dom/element/setidattribute/)(string, bool) | إذا كانت المعلمة isId صحيحة ، فإن هذه الطريقة تعلن أن السمة المحددة هي سمة معرف يحددها المستخدم. |
| [SetIdAttributeNode](../../aspose.svg.dom/element/setidattributenode/)(Attr, bool) | إذا كانت المعلمة isId صحيحة ، فإن هذه الطريقة تعلن أن السمة المحددة هي سمة معرف يحددها المستخدم. |
| [SetIdAttributeNS](../../aspose.svg.dom/element/setidattributens/)(string, string, bool) | إذا كانت المعلمة isId صحيحة ، فإن هذه الطريقة تعلن أن السمة المحددة هي سمة معرف يحددها المستخدم. |
| override [ToString](../../aspose.svg.dom/node/tostring/)() | إرجاع أString الذي يمثل هذا المثال. |

### أنظر أيضا

* class [SVGAnimationElement](../svganimationelement/)
* مساحة الاسم [Aspose.Svg](../../aspose.svg/)
* المجسم [Aspose.SVG](../../)


