---
title: FeaturesSequence.SaveTo
second_title: Aspose.GIS لمرجع .NET API
description: FeaturesSequence طريقة. يحفظ تسلسل المعالم إلى طبقة.
type: docs
weight: 50
url: /ar/net/aspose.gis/featuressequence/saveto/
---
## SaveTo(string, FileDriver) {#saveto_2}

يحفظ تسلسل المعالم إلى طبقة.

```csharp
public void SaveTo(string destinationPath, FileDriver destinationDriver)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| destinationPath | String | المسار إلى طبقة الإخراج. |
| destinationDriver | FileDriver | برنامج تشغيل التنسيق لطبقة الإخراج. |

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | أي حجة`null`. |
| [GisException](../../gisexception/) | خطأ في قراءة أو كتابة الميزة إلى / من الملف. |
| IOException | حدث خطأ في الإدخال / الإخراج. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | فشل تحويل هندسة المعالم من نظام الإسناد المكاني المصدر إلى نظام الإسناد المكاني المستهدف. |

### أنظر أيضا

* class [FileDriver](../../filedriver/)
* class [FeaturesSequence](../)
* مساحة الاسم [Aspose.Gis](../../featuressequence/)
* المجسم [Aspose.GIS](../../../)

---

## SaveTo(AbstractPath, FileDriver) {#saveto}

يحفظ تسلسل المعالم إلى طبقة.

```csharp
public void SaveTo(AbstractPath destinationPath, FileDriver destinationDriver)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| destinationPath | AbstractPath | المسار إلى طبقة الإخراج. |
| destinationDriver | FileDriver | برنامج تشغيل التنسيق لطبقة الإخراج. |

### استثناءات

| استثناء | حالة |
| --- | --- |
| [GisException](../../gisexception/) | خطأ في قراءة أو كتابة الميزة إلى / من الملف. |
| IOException | حدث خطأ في الإدخال / الإخراج. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | فشل تحويل هندسة المعالم من نظام الإسناد المكاني المصدر إلى نظام الإسناد المكاني المستهدف. |

### أنظر أيضا

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [FeaturesSequence](../)
* مساحة الاسم [Aspose.Gis](../../featuressequence/)
* المجسم [Aspose.GIS](../../../)

---

## SaveTo(string, FileDriver, SavingOptions) {#saveto_3}

يحفظ تسلسل المعالم إلى طبقة.

```csharp
public void SaveTo(string destinationPath, FileDriver destinationDriver, SavingOptions options)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| destinationPath | String | المسار إلى طبقة الإخراج. |
| destinationDriver | FileDriver | برنامج تشغيل التنسيق لطبقة الإخراج. |
| options | SavingOptions | خيارات لإجراء الحفظ. |

### استثناءات

| استثناء | حالة |
| --- | --- |
| [GisException](../../gisexception/) | خطأ في قراءة أو كتابة الميزة إلى / من الملف. |
| IOException | حدث خطأ في الإدخال / الإخراج. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | فشل تحويل هندسة المعالم من نظام الإسناد المكاني المصدر إلى نظام الإسناد المكاني المستهدف. |
| NotSupportedException | نظام الإسناد المكاني المحدد في*options* لا يدعمه*destinationDriver* . |

### أنظر أيضا

* class [FileDriver](../../filedriver/)
* class [SavingOptions](../../savingoptions/)
* class [FeaturesSequence](../)
* مساحة الاسم [Aspose.Gis](../../featuressequence/)
* المجسم [Aspose.GIS](../../../)

---

## SaveTo(AbstractPath, FileDriver, SavingOptions) {#saveto_1}

يحفظ تسلسل المعالم إلى طبقة.

```csharp
public void SaveTo(AbstractPath destinationPath, FileDriver destinationDriver, 
    SavingOptions options)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| destinationPath | AbstractPath | المسار إلى طبقة الإخراج. |
| destinationDriver | FileDriver | برنامج تشغيل التنسيق لطبقة الإخراج. |
| options | SavingOptions | خيارات لإجراء الحفظ. |

### استثناءات

| استثناء | حالة |
| --- | --- |
| [GisException](../../gisexception/) | خطأ في قراءة أو كتابة الميزة إلى / من الملف. |
| IOException | حدث خطأ في الإدخال / الإخراج. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | فشل تحويل هندسة المعالم من نظام الإسناد المكاني المصدر إلى نظام الإسناد المكاني المستهدف. |
| NotSupportedException | نظام الإسناد المكاني المحدد في*options* لا يدعمه*destinationDriver* . |

### أنظر أيضا

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [SavingOptions](../../savingoptions/)
* class [FeaturesSequence](../)
* مساحة الاسم [Aspose.Gis](../../featuressequence/)
* المجسم [Aspose.GIS](../../../)


