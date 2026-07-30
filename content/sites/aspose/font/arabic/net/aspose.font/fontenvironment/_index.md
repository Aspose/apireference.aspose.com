---
title: "فئة FontEnvironment"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "فئة Aspose.Font.FontEnvironment. توفر معلومات حول البيئة الحالية والمنصة."
type: docs
weight: 290
url: /ar/net/aspose.font/fontenvironment/
---
## FontEnvironment class

يوفر معلومات حول البيئة الحالية والمنصة.

```csharp
public class FontEnvironment
```

## الخصائص

| الاسم | الوصف |
| --- | --- |
| static [Current](../../aspose.font/fontenvironment/current/) { get; } | يحصل على البيئة الحالية. |
| [CurrentPlatformId](../../aspose.font/fontenvironment/currentplatformid/) { get; } | يحصل على معرّف المنصة الحالي. |
| [FontSpecificEncodings](../../aspose.font/fontenvironment/fontspecificencodings/) { get; } | يخزن ترميزات محددة للخطوط المتوافقة مع المستهلك. على سبيل المثال، تستخدم مستندات PDF ترميزات Adobe Symbol وZapfDingbats المحددة. |
| [Strictness](../../aspose.font/fontenvironment/strictness/) { get; set; } | قد تحتوي بعض الخطوط على بيانات غير متوقعة، أو ميزات غير محددة، أو قد تكون مقطوعة بشكل غير دقيق. يُنصح باستخدام الإعداد المتسامح للمستهلكين الذين يرغبون في فتح أي خط بغض النظر عن احتمالية عدم كفاءة الخط. لا يُضمن أن تكون الهياكل الداخلية للخط متسقة. يُنصح باستخدام الإعداد الصارم للمستهلكين الذين يرغبون في فتح خطوط صالحة وصلبة في معظمها. |
| static [CffCommonFontsSettings](../../aspose.font/fontenvironment/cffcommonfontssettings/) { get; } | الإعدادات المشتركة لخطوط CFF. |

### انظر أيضاً

* namespace [Aspose.Font](../../aspose.font/)
* assembly [Aspose.Font](../../)


