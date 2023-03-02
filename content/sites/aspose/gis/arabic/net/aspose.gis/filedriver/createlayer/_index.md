---
title: FileDriver.CreateLayer
second_title: Aspose.GIS لمرجع .NET API
description: FileDriver طريقة. ينشئ الطبقة ويفتحها للإلحاق.
type: docs
weight: 60
url: /ar/net/aspose.gis/filedriver/createlayer/
---
## CreateLayer(string) {#createlayer_4}

ينشئ الطبقة ويفتحها للإلحاق.

```csharp
public VectorLayer CreateLayer(string path)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| path | String | مسار الملف. |

### قيمة الإرجاع

مثال على[`VectorLayer`](../../vectorlayer/).

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الطريق`null`. |
| [GisException](../../gisexception/) | خطأ في كتابة الميزة في الملف. |
| IOException | حدث خطأ في الإدخال / الإخراج. |
| NotSupportedException | لا يمكن للسائق إنشاء طبقات متجهة (انظر[`CanCreateLayers`](../cancreatelayers/)). |

### أنظر أيضا

* class [VectorLayer](../../vectorlayer/)
* class [FileDriver](../)
* مساحة الاسم [Aspose.Gis](../../filedriver/)
* المجسم [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath) {#createlayer}

ينشئ الطبقة ويفتحها للإلحاق.

```csharp
public VectorLayer CreateLayer(AbstractPath path)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| path | AbstractPath | مسار الملف. |

### قيمة الإرجاع

مثال على[`VectorLayer`](../../vectorlayer/).

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الطريق`null`. |
| [GisException](../../gisexception/) | خطأ في كتابة الميزة في الملف. |
| IOException | حدث خطأ في الإدخال / الإخراج. |
| NotSupportedException | لا يمكن للسائق إنشاء طبقات متجهة (انظر[`CanCreateLayers`](../cancreatelayers/)). |

### أنظر أيضا

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../)
* مساحة الاسم [Aspose.Gis](../../filedriver/)
* المجسم [Aspose.GIS](../../../)

---

## CreateLayer(string, DriverOptions) {#createlayer_5}

ينشئ الطبقة ويفتحها للإلحاق.

```csharp
public VectorLayer CreateLayer(string path, DriverOptions options)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| path | String | مسار الملف. |
| options | DriverOptions | خيارات خاصة بالسائق. |

### قيمة الإرجاع

مثال على[`VectorLayer`](../../vectorlayer/).

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الطريق`null`. |
| ArgumentException | كائن الخيارات له نوع غير صحيح لبرنامج التشغيل هذا. |
| [GisException](../../gisexception/) | خطأ في كتابة الميزة في الملف. |
| IOException | حدث خطأ في الإدخال / الإخراج. |
| NotSupportedException | لا يمكن للسائق إنشاء طبقات متجهة (انظر[`CanCreateLayers`](../cancreatelayers/)). |

### أنظر أيضا

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* مساحة الاسم [Aspose.Gis](../../filedriver/)
* المجسم [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, DriverOptions) {#createlayer_1}

ينشئ الطبقة ويفتحها للإلحاق.

```csharp
public VectorLayer CreateLayer(AbstractPath path, DriverOptions options)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| path | AbstractPath | مسار الملف. |
| options | DriverOptions | خيارات خاصة بالسائق. |

### قيمة الإرجاع

مثال على[`VectorLayer`](../../vectorlayer/).

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الطريق`null`. |
| ArgumentException | كائن الخيارات له نوع غير صحيح لبرنامج التشغيل هذا. |
| [GisException](../../gisexception/) | خطأ في كتابة الميزة في الملف. |
| IOException | حدث خطأ في الإدخال / الإخراج. |
| NotSupportedException | لا يمكن للسائق إنشاء طبقات متجهة (انظر[`CanCreateLayers`](../cancreatelayers/)). |

### أنظر أيضا

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* مساحة الاسم [Aspose.Gis](../../filedriver/)
* المجسم [Aspose.GIS](../../../)

---

## CreateLayer(string, SpatialReferenceSystem) {#createlayer_7}

ينشئ الطبقة ويفتحها للإلحاق.

```csharp
public VectorLayer CreateLayer(string path, SpatialReferenceSystem spatialReferenceSystem)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| path | String | مسار الملف. |
| spatialReferenceSystem | SpatialReferenceSystem | نظام الإسناد المكاني. |

### قيمة الإرجاع

مثال على[`VectorLayer`](../../vectorlayer/).

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الطريق`null`. |
| [GisException](../../gisexception/) | خطأ في كتابة الميزة في الملف. |
| IOException | حدث خطأ في الإدخال / الإخراج. |
| NotSupportedException | لا يدعم برنامج التشغيل نظام الإسناد المكاني. الاستخدام[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem/) للتحقق مما إذا كان نظام الإسناد المكاني مدعومًا. |

### أنظر أيضا

* class [VectorLayer](../../vectorlayer/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* مساحة الاسم [Aspose.Gis](../../filedriver/)
* المجسم [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, SpatialReferenceSystem) {#createlayer_3}

ينشئ الطبقة ويفتحها للإلحاق.

```csharp
public VectorLayer CreateLayer(AbstractPath path, SpatialReferenceSystem spatialReferenceSystem)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| path | AbstractPath | مسار الملف. |
| spatialReferenceSystem | SpatialReferenceSystem | نظام الإسناد المكاني. |

### قيمة الإرجاع

مثال على[`VectorLayer`](../../vectorlayer/).

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الطريق`null`. |
| [GisException](../../gisexception/) | خطأ في كتابة الميزة في الملف. |
| IOException | حدث خطأ في الإدخال / الإخراج. |
| NotSupportedException | لا يدعم برنامج التشغيل نظام الإسناد المكاني. الاستخدام[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem/) للتحقق مما إذا كان نظام الإسناد المكاني مدعومًا. |

### أنظر أيضا

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* مساحة الاسم [Aspose.Gis](../../filedriver/)
* المجسم [Aspose.GIS](../../../)

---

## CreateLayer(string, DriverOptions, SpatialReferenceSystem) {#createlayer_6}

ينشئ الطبقة ويفتحها للإلحاق.

```csharp
public VectorLayer CreateLayer(string path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| path | String | مسار الملف. |
| options | DriverOptions | خيارات خاصة بالسائق. |
| spatialReferenceSystem | SpatialReferenceSystem | نظام الإسناد المكاني. |

### قيمة الإرجاع

مثال على[`VectorLayer`](../../vectorlayer/).

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الطريق`null`. |
| ArgumentException | كائن الخيارات له نوع غير صحيح لبرنامج التشغيل هذا. |
| [GisException](../../gisexception/) | خطأ في كتابة الميزة في الملف. |
| IOException | حدث خطأ في الإدخال / الإخراج. |
| NotSupportedException | لا يدعم برنامج التشغيل نظام الإسناد المكاني. الاستخدام[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem/) للتحقق مما إذا كان نظام الإسناد المكاني مدعومًا. |
| NotSupportedException | لا يمكن للسائق إنشاء طبقات متجهة (انظر[`CanCreateLayers`](../cancreatelayers/)). |

### أنظر أيضا

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* مساحة الاسم [Aspose.Gis](../../filedriver/)
* المجسم [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, DriverOptions, SpatialReferenceSystem) {#createlayer_2}

ينشئ الطبقة ويفتحها للإلحاق.

```csharp
public abstract VectorLayer CreateLayer(AbstractPath path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| path | AbstractPath | مسار الملف. |
| options | DriverOptions | خيارات خاصة بالسائق. |
| spatialReferenceSystem | SpatialReferenceSystem | نظام الإسناد المكاني. |

### قيمة الإرجاع

مثال على[`VectorLayer`](../../vectorlayer/).

### استثناءات

| استثناء | حالة |
| --- | --- |
| ArgumentNullException | الطريق`null`. |
| ArgumentException | كائن الخيارات له نوع غير صحيح لبرنامج التشغيل هذا. |
| [GisException](../../gisexception/) | خطأ في كتابة الميزة في الملف. |
| IOException | حدث خطأ في الإدخال / الإخراج. |
| NotSupportedException | لا يدعم برنامج التشغيل نظام الإسناد المكاني. الاستخدام[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem/) للتحقق مما إذا كان نظام الإسناد المكاني مدعومًا. |
| NotSupportedException | لا يمكن للسائق إنشاء طبقات متجهة (انظر[`CanCreateLayers`](../cancreatelayers/)). |

### أنظر أيضا

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* مساحة الاسم [Aspose.Gis](../../filedriver/)
* المجسم [Aspose.GIS](../../../)


