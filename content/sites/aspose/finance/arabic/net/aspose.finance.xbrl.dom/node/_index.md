---
title: عقدة
second_title: مرجع واجهة برمجة تطبيقات Aspose.Finance لـ .NET
description: فئة Node هي نوع البيانات الأساسي لنموذج كائن Document بالكامل. تمثل عقدة واحدة في شجرة المستند.
type: docs
weight: 7460
url: /ar/net/aspose.finance.xbrl.dom/node/
---
## Node class

فئة Node هي نوع البيانات الأساسي لنموذج كائن Document بالكامل. تمثل عقدة واحدة في شجرة المستند.

```csharp
public abstract class Node
```

## الخصائص

| الاسم | الوصف |
| --- | --- |
| virtual [BaseURI](../../aspose.finance.xbrl.dom/node/baseuri) { get; } | يحصل على عنوان URI الأساسي المطلق لهذه العقدة أو null إذا لم يتمكن التنفيذ من الحصول على عنوان URI مطلق. |
| [ChildNodes](../../aspose.finance.xbrl.dom/node/childnodes) { get; } | يحصل على العقد الفرعية. |
| [FirstChild](../../aspose.finance.xbrl.dom/node/firstchild) { get; } | يحصل على العنصر الفرعي الأول لهذه العقدة. إذا لم توجد مثل هذه العقدة، فإنها تُعيد null. |
| [HasChildNodes](../../aspose.finance.xbrl.dom/node/haschildnodes) { get; } | يحصل على ما إذا كانت هذه العقدة لديها أي أبناء. |
| [LastChild](../../aspose.finance.xbrl.dom/node/lastchild) { get; } | يحصل على العنصر الفرعي الأخير لهذه العقدة. إذا لم توجد مثل هذه العقدة، فإنها تُعيد null. |
| virtual [LocalName](../../aspose.finance.xbrl.dom/node/localname) { get; } | يحصل على الجزء المحلي من الاسم المؤهل لهذه العقدة. |
| virtual [NamespaceURI](../../aspose.finance.xbrl.dom/node/namespaceuri) { get; } | يحصل على URI مساحة الاسم لهذه العقدة. |
| [NextSibling](../../aspose.finance.xbrl.dom/node/nextsibling) { get; } | يحصل على العقدة التي تلي هذه العقدة مباشرة. إذا لم توجد مثل هذه العقدة، فإنها تُعيد null. |
| abstract [NodeName](../../aspose.finance.xbrl.dom/node/nodename) { get; } | يحصل على اسم العقدة حسب نوعها. |
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
| [RemoveChild](../../aspose.finance.xbrl.dom/node/removechild)(Node) | يزيل عقدة الطفل المشار إليها بـ old child من قائمة الأطفال. |
| [ReplaceChild](../../aspose.finance.xbrl.dom/node/replacechild)(Node, Node) | يستبدل عقدة الطفل old child بـ new child في قائمة الأطفال، ويُعيد عقدة الطفل القديمة. |

## حقول

| الاسم | الوصف |
| --- | --- |
| const [COMMENT_NODE](../../aspose.finance.xbrl.dom/node/comment_node) | نوع عقدة التعليق. |
| const [DOCUMENT_NODE](../../aspose.finance.xbrl.dom/node/document_node) | نوع عقدة المستند. |
| const [DOCUMENT_TYPE_NODE](../../aspose.finance.xbrl.dom/node/document_type_node) | نوع عقدة نوع المستند. |
| const [ELEMENT_NODE](../../aspose.finance.xbrl.dom/node/element_node) | نوع عقدة العنصر. |
| const [PROCESSING_INSTRUCTION_NODE](../../aspose.finance.xbrl.dom/node/processing_instruction_node) | نوع عقدة تعليمات المعالجة. |
| const [TEXT_NODE](../../aspose.finance.xbrl.dom/node/text_node) | نوع عقدة النص. |

### انظر أيضًا

* namespace [Aspose.Finance.Xbrl.Dom](../../aspose.finance.xbrl.dom)
* assembly [Aspose.Finance](../../)

<!-- لا تقم بالتعديل: تم إنشاؤه بواسطة xmldocmd لـ Aspose.Finance.dll -->
