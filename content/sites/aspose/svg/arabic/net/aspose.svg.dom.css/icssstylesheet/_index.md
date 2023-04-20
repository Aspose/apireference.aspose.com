---
title: Interface ICSSStyleSheet
second_title: Aspose.SVG لمرجع .NET API
description: Aspose.Svg.Dom.Css.ICSSStyleSheet واجهه المستخدم. واجهة CSSStyleSheet هي واجهة ملموسة تستخدم لتمثيل ورقة أنماط CSS  أي ورقة أنماط يكون نوع محتواها text / css .
type: docs
weight: 660
url: /ar/net/aspose.svg.dom.css/icssstylesheet/
---
## ICSSStyleSheet interface

واجهة CSSStyleSheet هي واجهة ملموسة تستخدم لتمثيل ورقة أنماط CSS ، أي ورقة أنماط يكون نوع محتواها "text / css" .

```csharp
public interface ICSSStyleSheet : IStyleSheet
```

## الخصائص

| اسم | وصف |
| --- | --- |
| [CSSRules](../../aspose.svg.dom.css/icssstylesheet/cssrules/) { get; } | قائمة بجميع قواعد CSS المضمنة في ورقة الأنماط. يتضمن هذا كلاً من مجموعات القواعد والقواعد. |
| [OwnerRule](../../aspose.svg.dom.css/icssstylesheet/ownerrule/) { get; } | إذا كانت ورقة الأنماط هذه من قاعدةimport ، فستحتوي السمة ownerRule على CSSImportRule. في هذه الحالة ، ستكون السمة ownerNode في واجهة StyleSheet خالية. إذا كانت ورقة الأنماط تأتي من عنصر أو تعليمات معالجة ، فستكون سمة ownerRule فارغة وستحتوي السمة ownerNode على العقدة. |

## طُرق

| اسم | وصف |
| --- | --- |
| [DeleteRule](../../aspose.svg.dom.css/icssstylesheet/deleterule/)(int) | يستخدم لحذف قاعدة من ورقة الأنماط. |
| [InsertRule](../../aspose.svg.dom.css/icssstylesheet/insertrule/)(string, int) | تُستخدم لإدراج قاعدة جديدة في ورقة الأنماط. أصبحت القاعدة الجديدة الآن جزءًا من التسلسل. |

### أنظر أيضا

* interface [IStyleSheet](../istylesheet/)
* مساحة الاسم [Aspose.Svg.Dom.Css](../../aspose.svg.dom.css/)
* المجسم [Aspose.SVG](../../)


