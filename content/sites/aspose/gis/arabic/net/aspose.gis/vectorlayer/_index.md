---
title: Class VectorLayer
second_title: Aspose.GIS لمرجع .NET API
description: Aspose.Gis.VectorLayer فصل. يمثل طبقة متجه . الطبقة المتجهة هي مجموعة من المعالم الجغرافية  مخزنة في ملف.
type: docs
weight: 2320
url: /ar/net/aspose.gis/vectorlayer/
---
## VectorLayer class

يمثل طبقة متجه . الطبقة المتجهة هي مجموعة من المعالم الجغرافية ، مخزنة في ملف.

```csharp
public abstract class VectorLayer : FeaturesSequence, IDisposable
```

## الخصائص

| اسم | وصف |
| --- | --- |
| override [Attributes](../../aspose.gis/vectorlayer/attributes/) { get; } | يحصل على مجموعة السمات المخصصة للميزات الموجودة في هذا`VectorLayer` . |
| virtual [Count](../../aspose.gis/vectorlayer/count/) { get; } | الحصول على عدد المعالم في هذه الطبقة . |
| abstract [Driver](../../aspose.gis/vectorlayer/driver/) { get; } | يحصل على ملف[`Driver`](./driver/) الذي أدى إلى إنشاء هذه الطبقة. |
| abstract [GeometryType](../../aspose.gis/vectorlayer/geometrytype/) { get; } | يحصل على نوع الشكل الهندسي للطبقة. |
| virtual [Item](../../aspose.gis/vectorlayer/item/) { get; } | يحصل على ملف[`Feature`](../feature/) في الفهرس المحدد. |
| abstract [SpatialReferenceSystem](../../aspose.gis/featuressequence/spatialreferencesystem/) { get; } | يحصل على نظام الإسناد المكاني لتسلسل الميزات هذا. |

## طُرق

| اسم | وصف |
| --- | --- |
| static [Create](../../aspose.gis/vectorlayer/create/#create)(AbstractPath, FileDriver) | ينشئ الطبقة ويفتحها لإضافة ميزات جديدة. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_4)(string, FileDriver) | ينشئ الطبقة ويفتحها لإضافة ميزات جديدة. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_1)(AbstractPath, FileDriver, DriverOptions) | ينشئ الطبقة ويفتحها لإضافة ميزات جديدة. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_3)(AbstractPath, FileDriver, SpatialReferenceSystem) | ينشئ الطبقة ويفتحها للإلحاق. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_5)(string, FileDriver, DriverOptions) | ينشئ الطبقة ويفتحها لإضافة ميزات جديدة. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_7)(string, FileDriver, SpatialReferenceSystem) | ينشئ الطبقة ويفتحها للإلحاق. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_2)(AbstractPath, FileDriver, DriverOptions, SpatialReferenceSystem) | ينشئ الطبقة ويفتحها للإلحاق. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_6)(string, FileDriver, DriverOptions, SpatialReferenceSystem) | ينشئ الطبقة ويفتحها للإلحاق. |
| static [Open](../../aspose.gis/vectorlayer/open/#open)(AbstractPath, FileDriver) | افتح الطبقة للقراءة . |
| static [Open](../../aspose.gis/vectorlayer/open/#open_2)(string, FileDriver) | افتح الطبقة للقراءة . |
| static [Open](../../aspose.gis/vectorlayer/open/#open_1)(AbstractPath, FileDriver, DriverOptions) | افتح الطبقة للقراءة . |
| static [Open](../../aspose.gis/vectorlayer/open/#open_3)(string, FileDriver, DriverOptions) | افتح الطبقة للقراءة . |
| [Add](../../aspose.gis/vectorlayer/add/#add)(Feature) | يضيف معلمًا جديدًا إلى الطبقة ، إذا كان مدعومًا من قبل`VectorLayer` س[`Driver`](./driver/) . |
| virtual [Add](../../aspose.gis/vectorlayer/add/#add_1)(Feature, IFeatureStyle) | يضيف معلمًا جديدًا بالنمط المحدد إلى الطبقة ، إذا كان مدعومًا من قبل`VectorLayer` س[`Driver`](./driver/) . |
| [AsInMemory](../../aspose.gis/vectorlayer/asinmemory/)() | قم بإنشاء نسخة طبق الأصل بتنسيق InMemory. |
| [ConstructFeature](../../aspose.gis/vectorlayer/constructfeature/)() | ينشئ (لكن لا يضيف إلى الطبقة) معلمًا جديدًا بسمات تطابق مجموعة سمات هذه الطبقة . عند الانتهاء من إعداد البيانات للمعلم ، استخدم[`Add`](./add/) لإضافة الميزة إلى الطبقة. |
| [CopyAttributes](../../aspose.gis/vectorlayer/copyattributes/#copyattributes)(FeaturesSequence) | نسخ سمات أخرى`VectorLayer` لهذا واحد . |
| [CopyAttributes](../../aspose.gis/vectorlayer/copyattributes/#copyattributes_1)(FeaturesSequence, IAttributesConverter) | نسخ سمات أخرى`VectorLayer` لهذا واحد . |
| [Dispose](../../aspose.gis/vectorlayer/dispose/)() | يقوم بإصدار الموارد المستخدمة بواسطة ملف`VectorLayer` . |
| override [Equals](../../aspose.gis/vectorlayer/equals/)(object) | تحديد ما إذا كان الكائن المحدد يساوي الكائن الحالي. |
| abstract [GetEnumerator](../../aspose.gis/featuressequence/getenumerator/)() | إرجاع عداد يتكرر خلال المجموعة. |
| virtual [GetExtent](../../aspose.gis/featuressequence/getextent/)() | يحصل على المدى المكاني لهذه الطبقة. |
| [Join](../../aspose.gis/vectorlayer/join/)(VectorLayer, JoinOptions) | تربط طبقة بالطبقة الحالية. |
| [NearestTo](../../aspose.gis/vectorlayer/nearestto/#nearestto)(IPoint) | يحصل على أقرب ميزة إلى النقطة المتوفرة. |
| [NearestTo](../../aspose.gis/vectorlayer/nearestto/#nearestto_1)(double, double) | يحصل على أقرب ميزة إلى الإحداثي المقدم. |
| virtual [RemoveAt](../../aspose.gis/vectorlayer/removeat/)(int) | قم بإزالة ملف[`Feature`](../feature/) في الفهرس المحدد. |
| virtual [ReplaceAt](../../aspose.gis/vectorlayer/replaceat/)(int, Feature) | استبدل ملف[`Feature`](../feature/) في الفهرس المحدد. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(AbstractPath, FileDriver) | يحفظ تسلسل المعالم إلى طبقة. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(string, FileDriver) | يحفظ تسلسل المعالم إلى طبقة. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(AbstractPath, FileDriver, SavingOptions) | يحفظ تسلسل المعالم إلى طبقة. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(string, FileDriver, SavingOptions) | يحفظ تسلسل المعالم إلى طبقة. |
| [SplitTo](../../aspose.gis/featuressequence/splitto/)() | تقسيم الميزات حسب النوع الهندسي. |
| virtual [UseAttributesIndex](../../aspose.gis/vectorlayer/useattributesindex/#useattributesindex)(AbstractPath, string, bool) | يتم تحميل فهرس السمات لتسريع التصفية حسب قيمة السمات في طرق التصفية مثل[`WhereGreater`](../featuressequence/wheregreater/). في حالة عدم وجود الفهرس يقوم بإنشائه أولاً. يستخدم*forceRebuild* لفرض إعادة إنشاء الفهرس. |
| [UseAttributesIndex](../../aspose.gis/vectorlayer/useattributesindex/#useattributesindex_1)(string, string, bool) | يتم تحميل فهرس السمات لتسريع التصفية حسب قيمة السمات في طرق التصفية مثل[`WhereGreater`](../featuressequence/wheregreater/). في حالة عدم وجود الفهرس يقوم بإنشائه أولاً. يستخدم*forceRebuild* لفرض إعادة إنشاء الفهرس. |
| virtual [UseSpatialIndex](../../aspose.gis/vectorlayer/usespatialindex/#usespatialindex)(AbstractPath, bool) | يتم تحميل الفهرس المكاني لتسريع التصفية حسب قيمة السمات في طرق التصفية مثل[`WhereIntersects`](../featuressequence/whereintersects/) و[`NearestTo`](./nearestto/). في حالة عدم وجود الفهرس يقوم بإنشائه أولاً. يستخدم*forceRebuild* لفرض إعادة إنشاء الفهرس. |
| [UseSpatialIndex](../../aspose.gis/vectorlayer/usespatialindex/#usespatialindex_1)(string, bool) | يتم تحميل الفهرس المكاني لتسريع التصفية حسب قيمة السمات في طرق التصفية مثل[`WhereIntersects`](../featuressequence/whereintersects/) و[`NearestTo`](./nearestto/). في حالة عدم وجود الفهرس يقوم بإنشائه أولاً. يستخدم*forceRebuild* لفرض إعادة إنشاء الفهرس. |
| virtual [WhereEqual&lt;T&gt;](../../aspose.gis/featuressequence/whereequal/)(string, T) | يختار المعالم ذات قيمة السمة التي تساوي القيمة المقدمة. |
| virtual [WhereGreater&lt;T&gt;](../../aspose.gis/featuressequence/wheregreater/)(string, T) | يختار المعالم ذات قيمة السمة أكبر من القيمة المقدمة. |
| virtual [WhereGreaterOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheregreaterorequal/)(string, T) | يختار المعالم ذات قيمة السمة أكبر من أو تساوي القيمة المقدمة. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/)(Extent) | ترشيح الميزات على أساس المدى. |
| [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/)(FeaturesSequence) | ترشيح المعالم بناءً على اتحاد كل الأشكال الهندسية في تسلسل المعالم الأخرى. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/)(IGeometry) | ترشيح الميزات بناءً على الهندسة المتوفرة. |
| virtual [WhereNotEqual&lt;T&gt;](../../aspose.gis/featuressequence/wherenotequal/)(string, T) | يختار المعالم ذات قيمة السمة التي لا تساوي القيمة المقدمة. |
| virtual [WhereNotNull](../../aspose.gis/featuressequence/wherenotnull/)(string) | يختار المعالم ذات السمة لا تساوي قيمة خالية. |
| virtual [WhereNull](../../aspose.gis/featuressequence/wherenull/)(string) | يختار الميزات ذات السمة التي تساوي قيمة خالية. |
| virtual [WhereSet](../../aspose.gis/featuressequence/whereset/)(string) | يختار الميزات مع مجموعة السمات. |
| virtual [WhereSmaller&lt;T&gt;](../../aspose.gis/featuressequence/wheresmaller/)(string, T) | يختار المعالم ذات قيمة السمة أصغر من القيمة المقدمة. |
| virtual [WhereSmallerOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheresmallerorequal/)(string, T) | يختار المعالم ذات قيمة السمة الأصغر أو المساوية للقيمة المقدمة. |
| virtual [WhereUnset](../../aspose.gis/featuressequence/whereunset/)(string) | يختار الميزات حيث لم يتم تعيين السمة المحددة. |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert)(AbstractPath, FileDriver, AbstractPath, FileDriver) | تحويل طبقة إلى تنسيق مختلف. |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert_2)(string, FileDriver, string, FileDriver) | تحويل طبقة إلى تنسيق مختلف. |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert_1)(AbstractPath, FileDriver, AbstractPath, FileDriver, ConversionOptions) | تحويل طبقة إلى تنسيق مختلف. |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert_3)(string, FileDriver, string, FileDriver, ConversionOptions) | تحويل طبقة إلى تنسيق مختلف. |

### أنظر أيضا

* class [FeaturesSequence](../featuressequence/)
* مساحة الاسم [Aspose.Gis](../../aspose.gis/)
* المجسم [Aspose.GIS](../../)


