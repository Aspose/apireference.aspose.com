---
title: Comment
second_title: مرجع واجهة برمجة تطبيقات Aspose.Finance لـ .NET
description: تورث من CharacterData وتمثل محتوى التعليق.
type: docs
weight: 6680
url: /ar/net/aspose.finance.xbrl.dom/comment/
---
## Comment class

تورث من CharacterData وتمثل محتوى التعليق.

```csharp
public class Comment : CharacterData
```

## الخصائص

| الاسم | الوصف |
| --- | --- |
| virtual [BaseURI](../../aspose.finance.xbrl.dom/node/baseuri) { get; } | يحصل على عنوان URI الأساسي المطلق لهذه العقدة أو null إذا لم يتمكن التنفيذ من الحصول على عنوان URI مطلق. |
| [ChildNodes](../../aspose.finance.xbrl.dom/node/childnodes) { get; } | يحصل على العقد الفرعية. |
| [Data](../../aspose.finance.xbrl.dom/characterdata/data) { get; set; } | يحصل أو يضبط بيانات الأحرف للعقدة التي تنفذ هذه الواجهة. |
| [FirstChild](../../aspose.finance.xbrl.dom/node/firstchild) { get; } | يحصل على العنصر الفرعي الأول لهذه العقدة. إذا لم توجد مثل هذه العقدة، فإنها تُعيد null. |
| [HasChildNodes](../../aspose.finance.xbrl.dom/node/haschildnodes) { get; } | يحصل على ما إذا كانت هذه العقدة لديها أي أبناء. |
| [LastChild](../../aspose.finance.xbrl.dom/node/lastchild) { get; } | يحصل على العنصر الفرعي الأخير لهذه العقدة. إذا لم توجد مثل هذه العقدة، فإنها تُعيد null. |
| [Length](../../aspose.finance.xbrl.dom/characterdata/length) { get; } | يحصل على عدد الوحدات ذات 16 بت المتاحة عبر البيانات. قد تكون القيمة صفر، أي أن عقد CharacterData قد تكون فارغة. |
| virtual [LocalName](../../aspose.finance.xbrl.dom/node/localname) { get; } | يحصل على الجزء المحلي من الاسم المؤهل لهذه العقدة. |
| virtual [NamespaceURI](../../aspose.finance.xbrl.dom/node/namespaceuri) { get; } | يحصل على URI مساحة الاسم لهذه العقدة. |
| [NextSibling](../../aspose.finance.xbrl.dom/node/nextsibling) { get; } | يحصل على العقدة التي تلي هذه العقدة مباشرة. إذا لم توجد مثل هذه العقدة، فإنها تُعيد null. |
| override [NodeName](../../aspose.finance.xbrl.dom/comment/nodename) { get; } | يحصل على اسم العقدة للتعليق. |
| [NodeType](../../aspose.finance.xbrl.dom/node/nodetype) { get; } | يحصل على نوع العقدة. |
| virtual [NodeValue](../../aspose.finance.xbrl.dom/node/nodevalue) { get; set; } | يحصل أو يعيّن قيمة هذه العقدة، حسب نوعها. |
| [OwnerDocument](../../aspose.finance.xbrl.dom/node/ownerdocument) { get; } | يحصل على كائن المستند المرتبط بهذه العقدة. |
| [ParentNode](../../aspose.finance.xbrl.dom/node/parentnode) { get; } | يحصل على العقدة الأب. |
| virtual [Prefix](../../aspose.finance.xbrl.dom/node/prefix) { get; set; } | يحصل أو يضبط بادئة مساحة الاسم لهذه العقدة. |
| [PreviousSibling](../../aspose.finance.xbrl.dom/node/previoussibling) { get; } | يحصل على العقدة التي تسبق هذه العقدة مباشرةً. إذا لم توجد مثل هذه العقدة، فإنها تُعيد null. |
| virtual [TextContent](../../aspose.finance.xbrl.dom/node/textcontent) { get; set; } | يحصل أو يضبط محتوى النص لهذه العقدة وفروعها. |

## الطرق

| الاسم | الوصف |
| --- | --- |
| [AppendChild](../../aspose.finance.xbrl.dom/node/appendchild)(Node) | يضيف العقدة newChild إلى نهاية قائمة الأطفال لهذه العقدة. |
| virtual [AppendData](../../aspose.finance.xbrl.dom/characterdata/appenddata)(string) | يضيف السلسلة إلى نهاية بيانات الأحرف للعقدة. |
| virtual [DeleteData](../../aspose.finance.xbrl.dom/characterdata/deletedata)(int, int) | يزيل نطاقًا من المحتوى من العقدة. |
| virtual [InsertData](../../aspose.finance.xbrl.dom/characterdata/insertdata)(int, string) | يدرج سلسلة في الموضع المحدد. |
| [RemoveChild](../../aspose.finance.xbrl.dom/node/removechild)(Node) | يزيل عقدة الطفل المشار إليها بـ old child من قائمة الأطفال. |
| [ReplaceChild](../../aspose.finance.xbrl.dom/node/replacechild)(Node, Node) | يستبدل عقدة الطفل old child بـ new child في قائمة الأطفال، ويُعيد عقدة الطفل القديمة. |
| virtual [ReplaceData](../../aspose.finance.xbrl.dom/characterdata/replacedata)(int, int, string) | يستبدل الأحرف التي تبدأ من الموضع المحدد بالسلسلة المحددة. |
| virtual [Substring](../../aspose.finance.xbrl.dom/characterdata/substring)(int, int) | يستخرج نطاقًا من البيانات من العقدة. |

### انظر أيضًا

* class [CharacterData](../characterdata)
* namespace [Aspose.Finance.Xbrl.Dom](../../aspose.finance.xbrl.dom)
* assembly [Aspose.Finance](../../)

<!-- لا تقم بالتعديل: تم إنشاؤه بواسطة xmldocmd لـ Aspose.Finance.dll -->
