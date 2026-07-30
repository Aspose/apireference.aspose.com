---
title: "الفئة NameIndexDataProvider"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "الفئة Aspose.Font.CffDataProviders.NameIndexDataProvider. تعلن عن الوظيفة للوصول إلى بنية CFF Name INDEX"
type: docs
weight: 90
url: /ar/net/aspose.font.cffdataproviders/nameindexdataprovider/
---
## NameIndexDataProvider class

يعلن عن وظيفة للوصول إلى بنية CFF Name INDEX.

```csharp
public abstract class NameIndexDataProvider : ICffIndexDataProvider
```

## الخصائص

| الاسم | الوصف |
| --- | --- |
| abstract [Count](../../aspose.font.cffdataproviders/nameindexdataprovider/count/) { get; } | عدد الكائنات في بنية CFF INDEX. |
| abstract [Item](../../aspose.font.cffdataproviders/nameindexdataprovider/item/) { get; set; } | يحصل/يضبط اسم الخط في الفهرس المحدد. |

## الطرق

| الاسم | الوصف |
| --- | --- |
| abstract [AddName](../../aspose.font.cffdataproviders/nameindexdataprovider/addname/)(string) | يضيف اسم خط إلى بنية Name INDEX. استخدم هذه الطريقة بحذر لأن كل اسم خط في بنية CFF Name INDEX يجب أن يكون له بنية DICT مطابقة في فهرس Top DICT وفقًا لمواصفة CFF. |
| abstract [GetName](../../aspose.font.cffdataproviders/nameindexdataprovider/getname/)(int) | يحصل على اسم الخط في الفهرس المحدد. |
| abstract [GetRawBytes](../../aspose.font.cffdataproviders/nameindexdataprovider/getrawbytes/)() | يحصل على جميع بايتات بنية CFF INDEX. |
| abstract [RemoveName](../../aspose.font.cffdataproviders/nameindexdataprovider/removename/)(int) | يزيل الاسم في الفهرس المحدد. استخدم هذه الطريقة بحذر لأن كل اسم خط في بنية CFF Name INDEX يجب أن يكون له بنية DICT مطابقة في فهرس Top DICT وفقًا لمواصفة CFF. |
| abstract [SetName](../../aspose.font.cffdataproviders/nameindexdataprovider/setname/)(string, int) | يضبط اسم الخط في الفهرس المحدد. |

### انظر أيضاً

* interface [ICffIndexDataProvider](../icffindexdataprovider/)
* namespace [Aspose.Font.CffDataProviders](../../aspose.font.cffdataproviders/)
* assembly [Aspose.Font](../../)


