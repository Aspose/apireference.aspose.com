---
title: GenerateTemplate
second_title: Aspose.OMR لمرجع .NET API
description: إنشاء قالب .omr وصورة نموذج بناءً على MemoryStream
type: docs
weight: 40
url: /ar/net/aspose.omr.api/omrengine/generatetemplate/
---
## GenerateTemplate(MemoryStream, GlobalPageSettings, ImageCollection) {#generatetemplate_2}

إنشاء قالب (.omr) وصورة نموذج بناءً على MemoryStream

```csharp
public GenerationResult GenerateTemplate(MemoryStream stream, GlobalPageSettings settings, 
    ImageCollection userImages = null)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| stream | MemoryStream | الدفق الذي يحتوي على خطوط الترميز |
| settings | GlobalPageSettings | الإعدادات العامة المطبقة على جميع عناصر الصفحة |
| userImages | ImageCollection | مجموعة من الصور التي يمكن استخدامها لإنشاء قالب. السماح باستخدام الصور من MemoryStream بدلاً من نظام الملفات |

### قيمة الإرجاع

نتيجة التوليد

### أنظر أيضا

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings)
* class [ImageCollection](../../imagecollection)
* class [OmrEngine](../../omrengine)
* مساحة الاسم [Aspose.OMR.Api](../../omrengine)
* المجسم [Aspose.OMR](../../../)

---

## GenerateTemplate(MemoryStream, ImageCollection) {#generatetemplate_1}

إنشاء قالب (.omr) وصورة نموذج بناءً على MemoryStream

```csharp
public GenerationResult GenerateTemplate(MemoryStream stream, ImageCollection userImages = null)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| stream | MemoryStream | الدفق الذي يحتوي على خطوط الترميز |
| userImages | ImageCollection | مجموعة من الصور التي يمكن استخدامها لإنشاء قالب. السماح باستخدام الصور من MemoryStream بدلاً من نظام الملفات |

### قيمة الإرجاع

نتيجة التوليد

### أنظر أيضا

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [ImageCollection](../../imagecollection)
* class [OmrEngine](../../omrengine)
* مساحة الاسم [Aspose.OMR.Api](../../omrengine)
* المجسم [Aspose.OMR](../../../)

---

## GenerateTemplate(string[], GlobalPageSettings, ImageCollection) {#generatetemplate_7}

إنشاء قالب (.omr) وصورة نموذج بناءً على مصفوفة من خطوط الترميز

```csharp
public GenerationResult GenerateTemplate(string[] markupLines, GlobalPageSettings settings, 
    ImageCollection userImages = null)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| markupLines | String[] | صفيف خطوط الترميز |
| settings | GlobalPageSettings | الإعدادات العامة المطبقة على جميع عناصر الصفحة |
| userImages | ImageCollection | مجموعة من الصور التي يمكن استخدامها لإنشاء قالب. السماح باستخدام الصور من MemoryStream بدلاً من نظام الملفات |

### قيمة الإرجاع

نتيجة التوليد

### أنظر أيضا

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings)
* class [ImageCollection](../../imagecollection)
* class [OmrEngine](../../omrengine)
* مساحة الاسم [Aspose.OMR.Api](../../omrengine)
* المجسم [Aspose.OMR](../../../)

---

## GenerateTemplate(string[], ImageCollection) {#generatetemplate_6}

إنشاء قالب (.omr) وصورة نموذج بناءً على مصفوفة من خطوط الترميز

```csharp
public GenerationResult GenerateTemplate(string[] markupLines, ImageCollection userImages = null)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| markupLines | String[] | صفيف خطوط الترميز |
| userImages | ImageCollection | مجموعة من الصور التي يمكن استخدامها لإنشاء قالب. السماح باستخدام الصور من MemoryStream بدلاً من نظام الملفات |

### قيمة الإرجاع

نتيجة التوليد

### أنظر أيضا

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [ImageCollection](../../imagecollection)
* class [OmrEngine](../../omrengine)
* مساحة الاسم [Aspose.OMR.Api](../../omrengine)
* المجسم [Aspose.OMR](../../../)

---

## GenerateTemplate(string, GlobalPageSettings) {#generatetemplate_4}

إنشاء قالب (.omr) وصورة نموذج بناءً على ترميز النص

```csharp
public GenerationResult GenerateTemplate(string markupPath, GlobalPageSettings settings)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| markupPath | String | المسار إلى ملف تعليم النص |
| settings | GlobalPageSettings | الإعدادات العامة المطبقة على جميع عناصر الصفحة |

### قيمة الإرجاع

نتيجة التوليد

### أنظر أيضا

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings)
* class [OmrEngine](../../omrengine)
* مساحة الاسم [Aspose.OMR.Api](../../omrengine)
* المجسم [Aspose.OMR](../../../)

---

## GenerateTemplate(string) {#generatetemplate_3}

إنشاء قالب (.omr) وصورة نموذج بناءً على ترميز النص

```csharp
public GenerationResult GenerateTemplate(string markupPath)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| markupPath | String | المسار إلى ملف تعليم النص |

### قيمة الإرجاع

نتيجة التوليد

### أنظر أيضا

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [OmrEngine](../../omrengine)
* مساحة الاسم [Aspose.OMR.Api](../../omrengine)
* المجسم [Aspose.OMR](../../../)

---

## GenerateTemplate(string, string[]) {#generatetemplate_5}

إنشاء قالب (.omr) وصورة نموذج بناءً على ترميز النص

```csharp
public GenerationResult GenerateTemplate(string markupPath, string[] imagesPaths)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| markupPath | String | المسار إلى ملف تعليم النص |
| imagesPaths | String[] | مسارات كاملة للصور المستخدمة في الجيل |

### قيمة الإرجاع

نتيجة التوليد

### أنظر أيضا

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [OmrEngine](../../omrengine)
* مساحة الاسم [Aspose.OMR.Api](../../omrengine)
* المجسم [Aspose.OMR](../../../)

---

## GenerateTemplate(TemplateConfig, GlobalPageSettings, ImageCollection) {#generatetemplate}

إنشاء قالب (.omr) وصورة نموذج بناءً على كائن النموذج

```csharp
public GenerationResult GenerateTemplate(TemplateConfig config, GlobalPageSettings settings, 
    ImageCollection userImages = null)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| config | TemplateConfig | كائن القالب الذي يمثل جميع العناصر |
| settings | GlobalPageSettings | الإعدادات العامة المستخدمة في جميع عمليات إنشاء القوالب |
| userImages | ImageCollection | مجموعة من الصور التي يمكن استخدامها لإنشاء قالب. السماح باستخدام الصور من MemoryStream بدلاً من نظام الملفات |

### قيمة الإرجاع

نتيجة التوليد

### أنظر أيضا

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [TemplateConfig](../../../aspose.omr.generation.config/templateconfig)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings)
* class [ImageCollection](../../imagecollection)
* class [OmrEngine](../../omrengine)
* مساحة الاسم [Aspose.OMR.Api](../../omrengine)
* المجسم [Aspose.OMR](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.OMR.dll -->
