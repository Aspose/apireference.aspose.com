---
title: Create
second_title: Aspose.GIS لمرجع .NET API
description: ينشئ الطبقة ويفتحها لإضافة ميزات جديدة.
type: docs
weight: 10
url: /ar/net/aspose.gis/vectorlayer/create/
---
## Create(string, FileDriver) {#create_4}

ينشئ الطبقة ويفتحها لإضافة ميزات جديدة.

```csharp
public static VectorLayer Create(string path, FileDriver driver)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| path | String | مسار الملف. |
| driver | FileDriver | سائق للاستخدام. |

### قيمة الإرجاع

طبقة للكتابة فقط.

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الطريق`null`. |
| ArgumentException | كائن الخيارات له نوع غير صحيح لبرنامج التشغيل هذا. |
| [GisException](../../gisexception) | خطأ في كتابة الميزة في الملف. |
| IOException | حدث خطأ في الإدخال / الإخراج. |

### أنظر أيضا

* class [FileDriver](../../filedriver)
* class [VectorLayer](../../vectorlayer)
* مساحة الاسم [Aspose.Gis](../../vectorlayer)
* المجسم [Aspose.GIS](../../../)

---

## Create(string, FileDriver, DriverOptions) {#create_5}

ينشئ الطبقة ويفتحها لإضافة ميزات جديدة.

```csharp
public static VectorLayer Create(string path, FileDriver driver, DriverOptions options)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| path | String | مسار الملف. |
| driver | FileDriver | سائق للاستخدام. |
| options | DriverOptions | خيارات خاصة بالسائق. |

### قيمة الإرجاع

طبقة للكتابة فقط.

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الطريق`null`. |
| ArgumentException | كائن الخيارات له نوع غير صحيح لبرنامج التشغيل هذا. |
| [GisException](../../gisexception) | خطأ في كتابة الميزة في الملف. |
| IOException | حدث خطأ في الإدخال / الإخراج. |

### أنظر أيضا

* class [FileDriver](../../filedriver)
* class [DriverOptions](../../driveroptions)
* class [VectorLayer](../../vectorlayer)
* مساحة الاسم [Aspose.Gis](../../vectorlayer)
* المجسم [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver) {#create}

ينشئ الطبقة ويفتحها لإضافة ميزات جديدة.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| path | AbstractPath | مسار الملف. |
| driver | FileDriver | سائق للاستخدام. |

### قيمة الإرجاع

طبقة للكتابة فقط.

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الطريق`null`. |
| ArgumentException | كائن الخيارات له نوع غير صحيح لبرنامج التشغيل هذا. |
| [GisException](../../gisexception) | خطأ في كتابة الميزة في الملف. |
| IOException | حدث خطأ في الإدخال / الإخراج. |

### أنظر أيضا

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [VectorLayer](../../vectorlayer)
* مساحة الاسم [Aspose.Gis](../../vectorlayer)
* المجسم [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, DriverOptions) {#create_1}

ينشئ الطبقة ويفتحها لإضافة ميزات جديدة.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver, DriverOptions options)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| path | AbstractPath | مسار الملف. |
| driver | FileDriver | سائق للاستخدام. |
| options | DriverOptions | خيارات خاصة بالسائق. |

### قيمة الإرجاع

طبقة للكتابة فقط.

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الطريق`null`. |
| ArgumentException | كائن الخيارات له نوع غير صحيح لبرنامج التشغيل هذا. |
| [GisException](../../gisexception) | خطأ في كتابة الميزة في الملف. |
| IOException | حدث خطأ في الإدخال / الإخراج. |

### أنظر أيضا

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [DriverOptions](../../driveroptions)
* class [VectorLayer](../../vectorlayer)
* مساحة الاسم [Aspose.Gis](../../vectorlayer)
* المجسم [Aspose.GIS](../../../)

---

## Create(string, FileDriver, SpatialReferenceSystem) {#create_7}

ينشئ الطبقة ويفتحها للإلحاق.

```csharp
public static VectorLayer Create(string path, FileDriver driver, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| path | String | مسار الملف. |
| driver | FileDriver | سائق للاستخدام. |
| spatialReferenceSystem | SpatialReferenceSystem | نظام الإسناد المكاني. |

### قيمة الإرجاع

مثال على[`VectorLayer`](../../vectorlayer).

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الطريق`null`. |
| [GisException](../../gisexception) | خطأ في قراءة أو كتابة الميزة إلى / من الملف. |
| IOException | حدث خطأ في الإدخال / الإخراج. |
| NotSupportedException | لا يدعم برنامج التشغيل نظام الإسناد المكاني. الاستخدام[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem) للتحقق مما إذا كان نظام الإسناد المكاني مدعومًا. |

### أنظر أيضا

* class [FileDriver](../../filedriver)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [VectorLayer](../../vectorlayer)
* مساحة الاسم [Aspose.Gis](../../vectorlayer)
* المجسم [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, SpatialReferenceSystem) {#create_3}

ينشئ الطبقة ويفتحها للإلحاق.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| path | AbstractPath | مسار الملف. |
| driver | FileDriver | سائق للاستخدام. |
| spatialReferenceSystem | SpatialReferenceSystem | نظام الإسناد المكاني. |

### قيمة الإرجاع

مثال على[`VectorLayer`](../../vectorlayer).

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الطريق`null`. |
| [GisException](../../gisexception) | خطأ في قراءة أو كتابة الميزة إلى / من الملف. |
| IOException | حدث خطأ في الإدخال / الإخراج. |
| NotSupportedException | لا يدعم برنامج التشغيل نظام الإسناد المكاني. الاستخدام[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem) للتحقق مما إذا كان نظام الإسناد المكاني مدعومًا. |

### أنظر أيضا

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [VectorLayer](../../vectorlayer)
* مساحة الاسم [Aspose.Gis](../../vectorlayer)
* المجسم [Aspose.GIS](../../../)

---

## Create(string, FileDriver, DriverOptions, SpatialReferenceSystem) {#create_6}

ينشئ الطبقة ويفتحها للإلحاق.

```csharp
public static VectorLayer Create(string path, FileDriver driver, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| path | String | مسار الملف. |
| driver | FileDriver | سائق للاستخدام. |
| options | DriverOptions | خيارات خاصة بالسائق. |
| spatialReferenceSystem | SpatialReferenceSystem | نظام الإسناد المكاني. |

### قيمة الإرجاع

مثال على[`VectorLayer`](../../vectorlayer).

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الطريق`null`. |
| ArgumentException | كائن الخيارات له نوع غير صحيح لبرنامج التشغيل هذا. |
| [GisException](../../gisexception) | خطأ في قراءة أو كتابة الميزة إلى / من الملف. |
| IOException | حدث خطأ في الإدخال / الإخراج. |
| NotSupportedException | لا يدعم برنامج التشغيل نظام الإسناد المكاني. الاستخدام[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem) للتحقق مما إذا كان نظام الإسناد المكاني مدعومًا. |

### أنظر أيضا

* class [FileDriver](../../filedriver)
* class [DriverOptions](../../driveroptions)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [VectorLayer](../../vectorlayer)
* مساحة الاسم [Aspose.Gis](../../vectorlayer)
* المجسم [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, DriverOptions, SpatialReferenceSystem) {#create_2}

ينشئ الطبقة ويفتحها للإلحاق.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| path | AbstractPath | مسار الملف. |
| driver | FileDriver | سائق للاستخدام. |
| options | DriverOptions | خيارات خاصة بالسائق. |
| spatialReferenceSystem | SpatialReferenceSystem | نظام الإسناد المكاني. |

### قيمة الإرجاع

مثال على[`VectorLayer`](../../vectorlayer).

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الطريق`null`. |
| ArgumentException | كائن الخيارات له نوع غير صحيح لبرنامج التشغيل هذا. |
| [GisException](../../gisexception) | خطأ في قراءة أو كتابة الميزة إلى / من الملف. |
| IOException | حدث خطأ في الإدخال / الإخراج. |
| NotSupportedException | لا يدعم برنامج التشغيل نظام الإسناد المكاني. الاستخدام[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem) للتحقق مما إذا كان نظام الإسناد المكاني مدعومًا. |

### أنظر أيضا

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [DriverOptions](../../driveroptions)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [VectorLayer](../../vectorlayer)
* مساحة الاسم [Aspose.Gis](../../vectorlayer)
* المجسم [Aspose.GIS](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
