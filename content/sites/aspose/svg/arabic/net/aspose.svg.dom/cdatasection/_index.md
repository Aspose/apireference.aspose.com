---
title: CDATASection
second_title: Aspose.SVG لمرجع .NET API
description: يتم استخدام أقسام CDATA للتخلص من كتل النص التي تحتوي على أحرف يمكن اعتبارها ترميزًا.
type: docs
weight: 440
url: /ar/net/aspose.svg.dom/cdatasection/
---
## CDATASection class

يتم استخدام أقسام CDATA للتخلص من كتل النص التي تحتوي على أحرف يمكن اعتبارها ترميزًا.

```csharp
public class CDATASection : Text
```

## الخصائص

| اسم | وصف |
| --- | --- |
| virtual [Attributes](../../aspose.svg.dom/node/attributes) { get; } | خريطة NamedNodeMap تحتوي على سمات هذه العقدة (إذا كانت عنصرًا) أو خالية بخلاف ذلك. |
| virtual [BaseURI](../../aspose.svg.dom/node/baseuri) { get; } | URI الأساسي المطلق لهذه العقدة أو فارغ إذا لم يتمكن التطبيق من الحصول على URI مطلق. |
| [ChildNodes](../../aspose.svg.dom/node/childnodes) { get; } | قائمة NodeList التي تحتوي على كافة توابع هذه العقدة. إذا لم يكن هناك أطفال ، فهذه قائمة NodeList لا تحتوي على عقد .. |
| virtual [Data](../../aspose.svg.dom/characterdata/data) { get; set; } | بيانات الأحرف الخاصة بالعقدة التي تنفذ هذه الواجهة. |
| [FirstChild](../../aspose.svg.dom/node/firstchild) { get; } | الطفل الأول لهذه العقدة. إذا لم يكن هناك مثل هذه العقدة ، فإن هذا يعيد قيمة خالية. |
| [IsElementContentWhitespace](../../aspose.svg.dom/text/iselementcontentwhitespace) { get; } | يعرض ما إذا كانت عقدة النص هذه تحتوي على مسافة بيضاء لمحتوى عنصر ، وغالبًا ما يطلق عليها بشكل مسيء "مسافة بيضاء يمكن تجاهلها" . |
| [LastChild](../../aspose.svg.dom/node/lastchild) { get; } | آخر تابع لهذه العقدة. إذا لم يكن هناك مثل هذه العقدة ، فإن هذا يعيد قيمة خالية. |
| [Length](../../aspose.svg.dom/characterdata/length) { get; } | عدد وحدات 16 بت المتوفرة من خلال البيانات وطريقة substringData أدناه. قد يكون لهذا القيمة صفر ، أي أن عُقد CharacterData قد تكون فارغة. |
| virtual [LocalName](../../aspose.svg.dom/node/localname) { get; } | إرجاع الجزء المحلي من الاسم المؤهل لهذه العقدة . بالنسبة للعقد من أي نوع بخلاف ELEMENT_NODE و ATTRIBUTE_NODE والعقد التي تم إنشاؤها باستخدام طريقة DOM من المستوى 1 ، مثل Document.createElement () ، يكون هذا دائمًا فارغًا. |
| virtual [NamespaceURI](../../aspose.svg.dom/node/namespaceuri) { get; } | معرف مساحة الاسم لهذه العقدة ، أو فارغ إذا كانت غير محددة. |
| [NextSibling](../../aspose.svg.dom/node/nextsibling) { get; } | العقدة التي تلي هذه العقدة مباشرة. إذا لم يكن هناك مثل هذه العقدة ، فإن هذا يعيد قيمة خالية. |
| override [NodeName](../../aspose.svg.dom/cdatasection/nodename) { get; } | اسم هذه العقدة حسب نوعها. |
| override [NodeType](../../aspose.svg.dom/cdatasection/nodetype) { get; } | رمز يمثل نوع الكائن الأساسي. |
| override [NodeValue](../../aspose.svg.dom/text/nodevalue) { get; set; } | قيمة هذه العقدة حسب نوعها. |
| virtual [OwnerDocument](../../aspose.svg.dom/node/ownerdocument) { get; } | كائن المستند المرتبط بهذه العقدة. هذا هو أيضًا كائن المستند المستخدم لإنشاء عقد جديدة. عندما تكون هذه العقدة عبارة عن مستند أو نوع مستند لم يتم استخدامه مع أي مستند حتى الآن ، يكون هذا فارغًا. |
| [ParentElement](../../aspose.svg.dom/node/parentelement) { get; } | يحصل على الوالد[`Element`](../element) من هذه العقدة. |
| [ParentNode](../../aspose.svg.dom/node/parentnode) { get; } | أصل هذه العقدة. قد يكون لجميع العقد ، باستثناء Attr و Document و DocumentFragment و Entity و Notation ، أصل. ومع ذلك ، إذا تم إنشاء عقدة للتو ولم تتم إضافتها بعد إلى الشجرة ، أو إذا تمت إزالتها من الشجرة ، فسيكون ذلك فارغًا. |
| virtual [Prefix](../../aspose.svg.dom/node/prefix) { get; set; } | بادئة مساحة الاسم لهذه العقدة ، أو فارغة إذا كانت غير محددة. عندما يتم تعريفه على أنه فارغ ، فإن الإعداد ليس له تأثير |
| [PreviousSibling](../../aspose.svg.dom/node/previoussibling) { get; } | العقدة التي تسبق هذه العقدة مباشرة. إذا لم يكن هناك مثل هذه العقدة ، فإن هذا يعيد قيمة خالية. |
| override [TextContent](../../aspose.svg.dom/text/textcontent) { get; set; } | تقوم هذه السمة بإرجاع المحتوى النصي لهذه العقدة وتوابعها. عندما يتم تعريفه على أنه فارغ ، فإن تعيينه ليس له أي تأثير. عند الإعداد ، تتم إزالة أي أطفال محتملين قد تكون هذه العقدة لديهم ، وإذا لم تكن السلسلة الجديدة فارغة أو فارغة ، فسيتم استبدالها بعقدة نصية واحدة تحتوي على السلسلة التي تم تعيين هذه السمة عليها. |
| [WholeText](../../aspose.svg.dom/text/wholetext) { get; } | إرجاع كل نص العقد النصية المتجاورة منطقيًا إلى هذه العقدة ، متسلسلة بترتيب المستند. |

## طُرق

| اسم | وصف |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener)(string, IEventListener) | تسمح هذه الطريقة بتسجيل مستمعي الحدث على هدف الحدث. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener)(string, DOMEventHandler, bool) | تسمح هذه الطريقة بتسجيل مستمعي الحدث على هدف الحدث. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener)(string, IEventListener, bool) | تسمح هذه الطريقة بتسجيل مستمعي الحدث على هدف الحدث. |
| [AppendChild](../../aspose.svg.dom/node/appendchild)(Node) | يضيف العقدة newChild إلى نهاية قائمة العناصر الفرعية لهذه العقدة. إذا كان الطفل الجديد موجودًا بالفعل في الشجرة ، فسيتم إزالته أولاً. |
| virtual [AppendData](../../aspose.svg.dom/characterdata/appenddata)(string) | قم بإلحاق السلسلة بنهاية بيانات الأحرف الخاصة بالعقدة. |
| [CloneNode](../../aspose.svg.dom/node/clonenode)() | إرجاع نسخة مكررة من هذه العقدة ، على سبيل المثال ، بمثابة مُنشئ نسخة عام للعقد. لا تحتوي العقدة المكررة على أصل (العقدة الأم خالية) ولا توجد بيانات مستخدم. |
| [CloneNode](../../aspose.svg.dom/node/clonenode)(bool) | إرجاع نسخة مكررة من هذه العقدة ، على سبيل المثال ، بمثابة مُنشئ نسخة عام للعقد. لا تحتوي العقدة المكررة على أصل (العقدة الأم خالية) ولا توجد بيانات مستخدم. |
| virtual [DeleteData](../../aspose.svg.dom/characterdata/deletedata)(int, int) | قم بإزالة نطاق من وحدات 16 بت من العقدة. |
| [DispatchEvent](../../aspose.svg.dom/eventtarget/dispatchevent)(Event) | تسمح هذه الطريقة بإرسال الأحداث إلى نموذج حدث عمليات التنفيذ. |
| [Dispose](../../aspose.svg.dom/eventtarget/dispose)() | تنفيذ مهام محددة بواسطة التطبيق مرتبطة بتحرير الموارد غير المُدارة أو تحريرها أو إعادة تعيينها. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype)() | تُستخدم هذه الطريقة لاسترداد كائن ECMAScriptType . |
| virtual [HasAttributes](../../aspose.svg.dom/node/hasattributes)() | إرجاع ما إذا كانت هذه العقدة (إذا كانت عنصرًا) لها أي سمات |
| [HasChildNodes](../../aspose.svg.dom/node/haschildnodes)() | إرجاع ما إذا كان لهذه العقدة أي توابع. |
| [InsertBefore](../../aspose.svg.dom/node/insertbefore)(Node, Node) | يقوم بإدراج العقدة قبل تابع العقدة الفرعية الموجودة. إذا كان الطفل فارغًا ، فقم بإدراج العقدة في نهاية قائمة العناصر الفرعية . إذا كان الكائن الفرعي عبارة عن كائن DocumentFragment ، فسيتم إدراج جميع توابعه ، بالترتيب نفسه ، قبل التابع. إذا كان الطفل موجودًا بالفعل في الشجرة ، فسيتم إزالته أولاً. |
| virtual [InsertData](../../aspose.svg.dom/characterdata/insertdata)(int, string) | أدخل سلسلة في إزاحة وحدة 16 بت المحددة. |
| [IsDefaultNamespace](../../aspose.svg.dom/node/isdefaultnamespace)(string) | يتحقق هذا الأسلوب مما إذا كانت مساحة الاسم المحددة هي مساحة الاسم الافتراضية أم لا. |
| [IsEqualNode](../../aspose.svg.dom/node/isequalnode)(Node) | اختبار ما إذا كانت العقدتان متساويتان. تختبر هذه الطريقة المساواة بين العقد ، وليس التماثل (أي ما إذا كانت العقدتان مرجعيتان لنفس الكائن) والتي يمكن اختبارها باستخدام Node.isSameNode (). جميع العقد التي هي نفسها ستكون متساوية أيضًا ، على الرغم من أن العكس قد لا يكون صحيحًا. |
| [IsSameNode](../../aspose.svg.dom/node/issamenode)(Node) | إرجاع ما إذا كانت هذه العقدة هي نفس العقدة المحددة. توفر هذه الطريقة طريقة لتحديد ما إذا كان مرجعان للعقدة يتم إرجاعهما بواسطة مرجع التطبيق نفس الكائن. عندما يكون مراجعان للعقدة مراجع لنفس الكائن ، حتى لو كان ذلك من خلال وكيل ، يمكن استخدام المراجع بشكل تبادلي تمامًا ، بحيث يكون لجميع السمات نفس القيم واستدعاء نفس طريقة DOM على أي مرجع يكون له نفس التأثير دائمًا. |
| [LookupNamespaceURI](../../aspose.svg.dom/node/lookupnamespaceuri)(string) | ابحث عن مساحة الاسم URI المرتبطة بالبادئة المحددة ، بدءًا من هذه العقدة. |
| [LookupPrefix](../../aspose.svg.dom/node/lookupprefix)(string) | ابحث عن البادئة المرتبطة بمساحة الاسم المحددة URI ، بدءًا من هذه العقدة. يتم تجاهل تعريفات مساحة الاسم الافتراضية بهذه الطريقة. راجع بحث بادئة مساحة الاسم للحصول على تفاصيل حول الخوارزمية المستخدمة بواسطة هذه الطريقة. |
| [Normalize](../../aspose.svg.dom/node/normalize)() | وضع جميع العقد النصية في العمق الكامل للشجرة الفرعية أسفل هذه العقدة ، بما في ذلك عقد السمات ، في نموذج "عادي" حيث تفصل البنية فقط (على سبيل المثال ، العناصر والتعليقات وتعليمات المعالجة وأقسام CDATA ومراجع الكيانات) النص العقد ، أي لا توجد عقد نصية متجاورة ولا عقد نصية فارغة. يمكن استخدام هذا للتأكد من أن عرض DOM للمستند هو نفسه كما لو تم حفظه وإعادة تحميله ، ويكون مفيدًا عندما تكون العمليات (مثل عمليات بحث XPointer [XPointer]) التي تعتمد على بنية شجرة وثيقة معينة يستخدم. إذا كانت المعلمة "تطبيع الأحرف" لكائن DOMConfiguration المرفقة بـ Node.ownerDocument صحيحة ، فإن هذه الطريقة ستعمل أيضًا على تسوية أحرف العقد النصية بشكل كامل. |
| [RemoveChild](../../aspose.svg.dom/node/removechild)(Node) | يزيل العقدة الفرعية التي أشار إليها oldChild من قائمة الأطفال ، ويعيدها . |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener)(string, IEventListener) | تسمح هذه الطريقة بإزالة مستمعي الحدث من هدف الحدث. إذا كان[`IEventListener`](../../aspose.svg.dom.events/ieventlistener) تمت إزالته من ملف[`EventTarget`](../eventtarget) أثناء معالجة حدث ، لن يتم تشغيله من خلال الإجراءات الحالية. لا يمكن استدعاء مستمعي الأحداث بعد إزالتها. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener)(string, DOMEventHandler, bool) | تسمح هذه الطريقة بإزالة مستمعي الحدث من هدف الحدث. إذا كان[`IEventListener`](../../aspose.svg.dom.events/ieventlistener) تمت إزالته من ملف[`EventTarget`](../eventtarget) أثناء معالجة حدث ، لن يتم تشغيله من خلال الإجراءات الحالية. لا يمكن استدعاء مستمعي الأحداث بعد إزالتها. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener)(string, IEventListener, bool) | تسمح هذه الطريقة بإزالة مستمعي الحدث من هدف الحدث. إذا كان[`IEventListener`](../../aspose.svg.dom.events/ieventlistener) تمت إزالته من ملف[`EventTarget`](../eventtarget) أثناء معالجة حدث ، لن يتم تشغيله من خلال الإجراءات الحالية. لا يمكن استدعاء مستمعي الأحداث بعد إزالتها. |
| [ReplaceChild](../../aspose.svg.dom/node/replacechild)(Node, Node) | يستبدل العقدة الفرعية oldChild بـ newChild في قائمة الأطفال ، ويعيد العقدة oldChild. إذا كان newChild هو كائن DocumentFragment ، فسيتم استبدال oldChild بكافة العناصر الفرعية DocumentFragment ، والتي يتم إدراجها بنفس الترتيب. إذا كان الطفل الجديد موجودًا بالفعل في الشجرة ، فسيتم إزالته أولاً. |
| virtual [ReplaceData](../../aspose.svg.dom/characterdata/replacedata)(int, int, string) | استبدل الأحرف التي تبدأ من إزاحة وحدة 16 بت المحددة بالسلسلة المحددة. |
| [ReplaceWholeText](../../aspose.svg.dom/text/replacewholetext)(string) | يستبدل نص العقدة الحالية وكل عقد النص المتجاورة منطقيًا بالنص المحدد. تتم إزالة جميع العقد النصية المتجاورة منطقيًا بما في ذلك العقدة الحالية ما لم تكن مستلم النص البديل. |
| [SplitText](../../aspose.svg.dom/text/splittext)(int) | يكسر هذه العقدة إلى عقدتين عند الإزاحة المحددة ، مع الاحتفاظ بكل منهما في الشجرة كأشقاء . |
| virtual [SubstringData](../../aspose.svg.dom/characterdata/substringdata)(int, int) | استخراج نطاق من البيانات من العقدة . |
| override [ToString](../../aspose.svg.dom/characterdata/tostring)() | إرجاع أString الذي يمثل هذا المثال. |

### أنظر أيضا

* class [Text](../text)
* مساحة الاسم [Aspose.Svg.Dom](../../aspose.svg.dom)
* المجسم [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
