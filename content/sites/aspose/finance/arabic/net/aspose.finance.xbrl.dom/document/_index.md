---
title: المستند
second_title: مرجع واجهة برمجة تطبيقات Aspose.Finance لـ .NET
description: يمثل المستند المستند الكامل xbrl المضمن. من الناحية المفاهيمية هو جذر شجرة المستند ويوفر الوصول الأساسي إلى بيانات المستند.
type: docs
weight: 6690
url: /ar/net/aspose.finance.xbrl.dom/document/
---
## Document class

تمثل Document المستند xbrl المضمن بالكامل. مفهومياً، هي جذر شجرة المستند، وتوفر الوصول الأساسي إلى بيانات المستند.

```csharp
public class Document : Node
```

## المنشئات

| الاسم | الوصف |
| --- | --- |
| [Document](document)() | المُنشئ الافتراضي. |

## الخصائص

| الاسم | الوصف |
| --- | --- |
| virtual [BaseURI](../../aspose.finance.xbrl.dom/node/baseuri) { get; } | يحصل على عنوان URI الأساسي المطلق لهذه العقدة أو null إذا لم يتمكن التنفيذ من الحصول على عنوان URI مطلق. |
| [CharacterSet](../../aspose.finance.xbrl.dom/document/characterset) { get; } | يحصل على ترميز المستند. |
| [ChildElements](../../aspose.finance.xbrl.dom/document/childelements) { get; } | يحصل على العناصر الفرعية. |
| [ChildNodes](../../aspose.finance.xbrl.dom/node/childnodes) { get; } | يحصل على العقد الفرعية. |
| [ContentType](../../aspose.finance.xbrl.dom/document/contenttype) { get; } | يحصل على نوع محتوى المستند. |
| [DocumentElement](../../aspose.finance.xbrl.dom/document/documentelement) { get; } | هذه سمة ملائمة تسمح بالوصول المباشر إلى العقدة الفرعية التي هي عنصر المستند للمستند. |
| [DocumentURI](../../aspose.finance.xbrl.dom/document/documenturi) { get; } | يحصل على URI المستند. |
| [FirstChild](../../aspose.finance.xbrl.dom/node/firstchild) { get; } | يحصل على العنصر الفرعي الأول لهذه العقدة. إذا لم توجد مثل هذه العقدة، فإنها تُعيد null. |
| [HasChildNodes](../../aspose.finance.xbrl.dom/node/haschildnodes) { get; } | يحصل على ما إذا كانت هذه العقدة لديها أي أبناء. |
| [LastChild](../../aspose.finance.xbrl.dom/node/lastchild) { get; } | يحصل على العنصر الفرعي الأخير لهذه العقدة. إذا لم توجد مثل هذه العقدة، فإنها تُعيد null. |
| virtual [LocalName](../../aspose.finance.xbrl.dom/node/localname) { get; } | يحصل على الجزء المحلي من الاسم المؤهل لهذه العقدة. |
| virtual [NamespaceURI](../../aspose.finance.xbrl.dom/node/namespaceuri) { get; } | يحصل على URI مساحة الاسم لهذه العقدة. |
| [NextSibling](../../aspose.finance.xbrl.dom/node/nextsibling) { get; } | يحصل على العقدة التي تلي هذه العقدة مباشرة. إذا لم توجد مثل هذه العقدة، فإنها تُعيد null. |
| override [NodeName](../../aspose.finance.xbrl.dom/document/nodename) { get; } | يحصل على اسم العقدة للمستند. |
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

### انظر أيضًا

* class [Node](../node)
* namespace [Aspose.Finance.Xbrl.Dom](../../aspose.finance.xbrl.dom)
* assembly [Aspose.Finance](../../)

<!-- لا تقم بالتعديل: تم إنشاؤه بواسطة xmldocmd لـ Aspose.Finance.dll -->
