---
title: Aspose.Gis.SpatialReferencing
second_title: Aspose.GIS لمرجع .NET API
description: Aspose.Gis. المكانية المرجعية توفر مساحة الاسم فئات للعمل مع المراجع المكانية إحداثيات الأنظمة المرجعية.
type: docs
weight: 370
url: /ar/net/aspose.gis.spatialreferencing/
---
`Aspose.Gis. المكانية المرجعية` توفر مساحة الاسم فئات للعمل مع المراجع المكانية (إحداثيات الأنظمة المرجعية).

## الطبقات

| فصل | وصف |
| --- | --- |
| [Axis](./axis/) | يصف المحور بعدًا واحدًا من SRS . |
| [BursaWolfParameters](./bursawolfparameters/) | فئة تحتوي على معلمات صيغة Bursa-Wolf للتحويل إلى مرجع آخر. |
| [CompoundSpatialReferenceSystem](./compoundspatialreferencesystem/) | يوحد مركب SRS اثنين من SRS الأساسيين ، ولا يمكن أن يكون أي منهما مركبًا. |
| [Ellipsoid](./ellipsoid/) | يمثل Ellipsoid شكل بيضاوي ، والذي يقترب من الأرض. |
| [GeocentricSpatialReferenceSystem](./geocentricspatialreferencesystem/) | إن مركزية الأرض SRS عبارة عن SRS ديكارتية ثلاثية الأبعاد أصلها في مركز الأرض. |
| [GeocentricSpatialReferenceSystemParameters](./geocentricspatialreferencesystemparameters/) | معلمات لإنشاء SRS مركزية الأرض. تحتوي المعلمات على قيم افتراضية معقولة ، لذلك سيتعين عليك تعيين بعضها فقط. إذا قمت بتعيين`null` إلى أي معلمة ، سيتم استخدام قيمة افتراضية. |
| [GeographicDatum](./geographicdatum/) | المسند الجغرافي يربط خطوط الطول والعرض بمكان معين على الأرض. |
| [GeographicSpatialReferenceSystem](./geographicspatialreferencesystem/) | SRS الجغرافي هو SRS الذي يعتمد على خطوط الطول والعرض . يمكن أن يكون SRS الجغرافي ثنائي الأبعاد أو ثلاثي الأبعاد . إذا كان SRS الجغرافي ثلاثي الأبعاد ، فهو في الواقع SRS مركب ثنائي الأبعاد SRS و SRS عمودي. |
| [GeographicSpatialReferenceSystemParameters](./geographicspatialreferencesystemparameters/) | معلمات لإنشاء SRS الجغرافي . تحتوي المعلمات على قيم افتراضية معقولة ، لذلك سيتعين عليك تعيين بعضها فقط. إذا قمت بتعيين`null` إلى أي معلمة ، سيتم استخدام قيمة افتراضية. |
| [IdentifiableObject](./identifiableobject/) | يمثل كائنًا قد يحتوي على اسم ورمز EPSG. |
| [Identifier](./identifier/) | يمثل معرّفًا - مرجعًا للوصف الخارجي لكائن . إذا قمت بإنشاء SRS من WKT ،[`Identifier`](../aspose.gis.spatialreferencing/identifier/) يتوافق مع الكلمة الرئيسية "AUTHORITY" . |
| [LocalDatum](./localdatum/) | يشير إلى الطريقة المستخدمة للقياسات في نظام الإسناد المكاني المحلي. |
| [LocalSpatialReferenceSystem](./localspatialreferencesystem/) | إحداثيات SRS المحلية ذات الصلة ببعض الأشياء ، وليس الأرض. |
| [PrimeMeridian](./primemeridian/) | يمثل PrimeMeridian خط الزوال الذي عنده يتم تعريف خط الطول ليكون 0. |
| [ProjectedSpatialReferenceSystem](./projectedspatialreferencesystem/) | SRS المتوقع هو نتيجة لتطبيق إسقاط على SRS الجغرافي . يمكن أن يكون SRS المسقط ثنائي الأبعاد أو ثلاثي الأبعاد . إذا كان SRS المسقط ثلاثي الأبعاد ، فهو في الواقع SRS مركب من ثنائي الأبعاد مسقط SRS وبُعد رأسي أحادي البعد SRS. |
| [ProjectedSpatialReferenceSystemParameters](./projectedspatialreferencesystemparameters/) | معلمات لإنشاء SRS المتوقع. تحتوي بعض المعلمات على قيم افتراضية . بعض المعلمات لها قيم افتراضية معقولة ، لذلك لا يتعين عليك تعيينها فقط.`null` لهذه المعلمات ، سيتم استخدام قيمة افتراضية.[`ProjectionMethodName`](../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/projectionmethodname/) و[`Base`](../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/base/) ليس لديك افتراضيات - عليك تعيين بعض غير`null` قيمة لهذه الخصائص . |
| [Projection](./projection/) | يمثل طريقة الإسقاط مع المعلمات التي تحول (خط الطول وخط العرض) إلى (س ، ص) . |
| [SpatialReferenceSystem](./spatialreferencesystem/) | إحداثيات خرائط نظام الإسناد المكاني إلى أماكن على الأرض . هناك أنواع مختلفة من SRS ، راجع[`Type`](../aspose.gis.spatialreferencing/spatialreferencesystem/type/) . ما هو أكثر من ذلك ، إذا كان نوع SRS هوGeographic أو _Projected، يمكن أن تكون SRS مركبة أو مفردة ، انظر[`IsCompound`](../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) . |
| [SpatialReferenceSystemTransformation](./spatialreferencesystemtransformation/) | تحويل نظام الإسناد المكاني يحول الأشكال الهندسية من نظام الإسناد المكاني المصدر إلى نظام الإسناد المكاني المستهدف. |
| [TransformationException](./transformationexception/) | تم طرح استثناء التحويل عند حدوث خطأ أثناء تحويل الإحداثي أو أثناء إنشاء التحويل. |
| [Unit](./unit/) | تمثل وحدة القياس . |
| [VerticalDatum](./verticaldatum/) | يشير إلى الطريقة المستخدمة للقياسات الرأسية . |
| [VerticalSpatialReferenceSystem](./verticalspatialreferencesystem/) | SRS العمودي عبارة عن SRS أحادي البعد يصف إحداثيات الارتفاع. |
## تعداد

| تعداد | وصف |
| --- | --- |
| [AxisDirection](./axisdirection/) | يحدد اتجاه المحور الاتجاه الذي يشير إليه المحور . |
| [GeocentricAxisesOrder](./geocentricaxisesorder/) | يمثل ترتيب المحاور في SRS . |
| [GeographicAxisesOrder](./geographicaxisesorder/) | يمثل ترتيب المحاور في SRS الجغرافي . |
| [ParameterType](./parametertype/) | تحديد نوع المعلمة بتنسيق[`Projection`](../aspose.gis.spatialreferencing/projection/) . |
| [ProjectedAxisesOrder](./projectedaxisesorder/) | يمثل ترتيب المحاور في SRS الجغرافي . |
| [SpatialReferenceSystemType](./spatialreferencesystemtype/) | يمثل نوع نظام الإسناد المكاني. |


