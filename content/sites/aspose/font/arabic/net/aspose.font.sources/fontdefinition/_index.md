---
title: "الفئة FontDefinition"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "الفئة Aspose.Font.Sources.FontDefinition. تمثل تعريف مجموعة ملفات الخط. تحتوي هذه الفئة على حقول لا تتعلق ببيانات الخط الداخلية. تصف هذه الحقول موضع الخط وبيانات أخرى ضرورية لتحميل الخط من بعض ملفات المصدر أو الذاكرة وما إلى ذلك."
type: docs
weight: 730
url: /ar/net/aspose.font.sources/fontdefinition/
---
## FontDefinition class

يمثل تعريف مجموعة ملفات Font. تحتوي هذه الفئة على حقول لا تتعلق ببيانات Font الداخلية. تصف هذه الحقول موضع Font وبيانات أخرى ضرورية لتحميل Font من مصدر Font معين (ملف، ذاكرة، إلخ).

```csharp
public class FontDefinition
```

## المنشئات

| الاسم | الوصف |
| --- | --- |
| [FontDefinition](fontdefinition/#constructor)(FontType, FontFileDefinition) | ينشئ تعريف خط بملف واحد. |
| [FontDefinition](fontdefinition/#constructor_1)(FontType, FontFileDefinition[]) | ينشئ تعريف خط متعدد الملفات. |
| [FontDefinition](fontdefinition/#constructor_2)(FontType, StreamSource) | ينشئ تعريف خط بملف واحد. |
| [FontDefinition](fontdefinition/#constructor_3)(FontType, string, StreamSource) | ينشئ تعريف خط بملف واحد. |
| [FontDefinition](fontdefinition/#constructor_6)(string, FontType, FontFileDefinition) | ينشئ تعريف خط بملف واحد. |
| [FontDefinition](fontdefinition/#constructor_4)(MultiLanguageString, MultiLanguageString, FontType, FontFileDefinition) | ينشئ تعريف خط متعدد الملفات. |
| [FontDefinition](fontdefinition/#constructor_5)(MultiLanguageString, MultiLanguageString, FontType, FontFileDefinition[]) | ينشئ تعريف خط متعدد الملفات. |
| [FontDefinition](fontdefinition/#constructor_7)(string, FontType, string, StreamSource) | ينشئ تعريف خط بملف واحد. |
| [FontDefinition](fontdefinition/#constructor_8)(string, string, FontType, FontFileDefinition) | ينشئ تعريف خط بملف واحد. |
| [FontDefinition](fontdefinition/#constructor_9)(string, string, FontType, FontFileDefinition[]) | ينشئ تعريف خط متعدد الملفات. |

## الخصائص

| الاسم | الوصف |
| --- | --- |
| [FileDefinitions](../../aspose.font.sources/fontdefinition/filedefinitions/) { get; } | يحصل على مجموعة تعريفات الملفات. |
| virtual [FontName](../../aspose.font.sources/fontdefinition/fontname/) { get; } | يرجع اسم الخط. |
| virtual [FontNames](../../aspose.font.sources/fontdefinition/fontnames/) { get; } | يحصل على أسماء الخط كـ [`MultiLanguageString`](../../aspose.font/multilanguagestring/). |
| [FontType](../../aspose.font.sources/fontdefinition/fonttype/) { get; } | يحصل على نوع الخط. |
| virtual [PostscriptName](../../aspose.font.sources/fontdefinition/postscriptname/) { get; } | يحصل على اسم خط PostScript. |
| [PostscriptNames](../../aspose.font.sources/fontdefinition/postscriptnames/) { get; } | يحصل على أسماء خط PostScript كـ [`MultiLanguageString`](../../aspose.font/multilanguagestring/). |

## الطرق

| الاسم | الوصف |
| --- | --- |
| static [Open](../../aspose.font.sources/fontdefinition/open/#open)(StreamSource, FontType) | يرجع FontDefinition لمصدر تدفق الخط ونوع الخط. |
| static [Open](../../aspose.font.sources/fontdefinition/open/#open_1)(string, FontType) | يرجع FontDefinition لملف الخط ونوع الخط. |

### انظر أيضاً

* namespace [Aspose.Font.Sources](../../aspose.font.sources/)
* assembly [Aspose.Font](../../)


