---
title: Save
second_title: Aspose.SVG لمرجع .NET API
description: يحفظ المستند في الملف المحلي المحدد بواسطةعنوان url . سيتم حفظ جميع الموارد المستخدمة في هذا المستند في إلى المجلد المجاور  والذي سيتم إنشاء اسمه على النحو التالي output_file_name  _files .
type: docs
weight: 90
url: /ar/net/aspose.svg/svgdocument/save/
---
## Save(Url) {#save_3}

يحفظ المستند في الملف المحلي المحدد بواسطة`عنوان url` . سيتم حفظ جميع الموارد المستخدمة في هذا المستند في إلى المجلد المجاور ، والذي سيتم إنشاء اسمه على النحو التالي: output_file_name + "_files" .

```csharp
public void Save(Url url)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| url | Url | URL المحلي لملف الإخراج. |

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentException | أثار إذا كان المحدد`عنوان url` ليس عنوان URL صالحًا للملف المحلي. |

### أنظر أيضا

* class [Url](../../url)
* class [SVGDocument](../../svgdocument)
* مساحة الاسم [Aspose.Svg](../../svgdocument)
* المجسم [Aspose.SVG](../../../)

---

## Save(string) {#save_6}

يحفظ المستند في الملف المحلي المحدد بواسطة`طريق` . سيتم حفظ جميع الموارد المستخدمة في هذا المستند في إلى المجلد المجاور ، والذي سيتم إنشاء اسمه على النحو التالي: output_file_name + "_files" .

```csharp
public void Save(string path)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| path | String | المسار المحلي لملف الإخراج. |

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentException | أثار إذا كان المحدد`طريق` ليس مسار ملف محلي صالحًا. |

### أنظر أيضا

* class [SVGDocument](../../svgdocument)
* مساحة الاسم [Aspose.Svg](../../svgdocument)
* المجسم [Aspose.SVG](../../../)

---

## Save(IOutputStorage) {#save}

يحفظ محتوى الوثيقة والموارد في تخزين المخرجات.

```csharp
public void Save(IOutputStorage outputStorage)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| outputStorage | IOutputStorage | تخزين الإخراج[`IOutputStorage`](../../../aspose.svg.io/ioutputstorage). |

### أنظر أيضا

* interface [IOutputStorage](../../../aspose.svg.io/ioutputstorage)
* class [SVGDocument](../../svgdocument)
* مساحة الاسم [Aspose.Svg](../../svgdocument)
* المجسم [Aspose.SVG](../../../)

---

## Save(string, SVGSaveFormat) {#save_7}

يحفظ المستند في الملف المحلي المحدد بواسطة`طريق` . سيتم حفظ جميع الموارد المستخدمة في هذا المستند في إلى المجلد المجاور ، والذي سيتم إنشاء اسمه على النحو التالي: output_file_name + "_files" .

```csharp
public void Save(string path, SVGSaveFormat saveFormat)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| path | String | المسار المحلي لملف الإخراج. |
| saveFormat | SVGSaveFormat | التنسيق الذي يتم حفظ المستند به. |

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentException | أثار إذا كان المحدد`طريق` ليس مسار ملف محلي صالحًا. |

### أنظر أيضا

* enum [SVGSaveFormat](../../../aspose.svg.saving/svgsaveformat)
* class [SVGDocument](../../svgdocument)
* مساحة الاسم [Aspose.Svg](../../svgdocument)
* المجسم [Aspose.SVG](../../../)

---

## Save(IOutputStorage, SVGSaveFormat) {#save_1}

يحفظ محتوى الوثيقة والموارد في تخزين المخرجات.

```csharp
public void Save(IOutputStorage outputStorage, SVGSaveFormat saveFormat)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| outputStorage | IOutputStorage | تخزين الإخراج[`IOutputStorage`](../../../aspose.svg.io/ioutputstorage). |
| saveFormat | SVGSaveFormat | التنسيق الذي يتم حفظ المستند به. |

### أنظر أيضا

* interface [IOutputStorage](../../../aspose.svg.io/ioutputstorage)
* enum [SVGSaveFormat](../../../aspose.svg.saving/svgsaveformat)
* class [SVGDocument](../../svgdocument)
* مساحة الاسم [Aspose.Svg](../../svgdocument)
* المجسم [Aspose.SVG](../../../)

---

## Save(string, SVGSaveOptions) {#save_8}

يحفظ المستند في الملف المحلي المحدد بواسطة`طريق` . سيتم حفظ جميع الموارد المستخدمة في هذا المستند في إلى المجلد المجاور ، والذي سيتم إنشاء اسمه على النحو التالي: output_file_name + "_files" .

```csharp
public void Save(string path, SVGSaveOptions saveOptions)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| path | String | المسار المحلي لملف الإخراج. |
| saveOptions | SVGSaveOptions | خيارات حفظ SVG. |

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentException | أثار إذا كان المحدد`طريق` ليس مسار ملف محلي صالحًا. |

### أنظر أيضا

* class [SVGSaveOptions](../../../aspose.svg.saving/svgsaveoptions)
* class [SVGDocument](../../svgdocument)
* مساحة الاسم [Aspose.Svg](../../svgdocument)
* المجسم [Aspose.SVG](../../../)

---

## Save(IOutputStorage, SVGSaveOptions) {#save_2}

يحفظ محتوى الوثيقة والموارد في تخزين المخرجات.

```csharp
public void Save(IOutputStorage outputStorage, SVGSaveOptions saveOptions)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| outputStorage | IOutputStorage | تخزين الإخراج[`IOutputStorage`](../../../aspose.svg.io/ioutputstorage). |
| saveOptions | SVGSaveOptions | خيارات حفظ SVG. |

### أنظر أيضا

* interface [IOutputStorage](../../../aspose.svg.io/ioutputstorage)
* class [SVGSaveOptions](../../../aspose.svg.saving/svgsaveoptions)
* class [SVGDocument](../../svgdocument)
* مساحة الاسم [Aspose.Svg](../../svgdocument)
* المجسم [Aspose.SVG](../../../)

---

## Save(Url, SVGSaveFormat) {#save_4}

يحفظ المستند في الملف المحلي المحدد بواسطة`عنوان url` . سيتم حفظ جميع الموارد المستخدمة في هذا المستند في إلى المجلد المجاور ، والذي سيتم إنشاء اسمه على النحو التالي: output_file_name + "_files" .

```csharp
public void Save(Url url, SVGSaveFormat saveFormat)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| url | Url | URL المحلي لملف الإخراج. |
| saveFormat | SVGSaveFormat | التنسيق الذي يتم حفظ المستند به. |

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentException | أثار إذا كان المحدد`عنوان url` ليس عنوان URL صالحًا للملف المحلي. |

### أنظر أيضا

* class [Url](../../url)
* enum [SVGSaveFormat](../../../aspose.svg.saving/svgsaveformat)
* class [SVGDocument](../../svgdocument)
* مساحة الاسم [Aspose.Svg](../../svgdocument)
* المجسم [Aspose.SVG](../../../)

---

## Save(Url, SVGSaveOptions) {#save_5}

يحفظ المستند في الملف المحلي المحدد بواسطة`عنوان url` . سيتم حفظ جميع الموارد المستخدمة في هذا المستند في إلى المجلد المجاور ، والذي سيتم إنشاء اسمه على النحو التالي: output_file_name + "_files" .

```csharp
public void Save(Url url, SVGSaveOptions saveOptions)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| url | Url | URL المحلي لملف الإخراج. |
| saveOptions | SVGSaveOptions | خيارات حفظ SVG. |

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentException | أثار إذا كان المحدد`عنوان url` ليس عنوان URL صالحًا للملف المحلي. |

### أنظر أيضا

* class [Url](../../url)
* class [SVGSaveOptions](../../../aspose.svg.saving/svgsaveoptions)
* class [SVGDocument](../../svgdocument)
* مساحة الاسم [Aspose.Svg](../../svgdocument)
* المجسم [Aspose.SVG](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
