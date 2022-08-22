---
title: Aspose.ThreeD.Entities
second_title: Aspose.3D لمرجع .NET API
description: يتم تحديد جميع الأشكال الهندسية والكيانات في مساحة الاسم هذه
type: docs
weight: 40
url: /ar/net/aspose.threed.entities/
---
يتم تحديد جميع الأشكال الهندسية والكيانات في مساحة الاسم هذه

## الطبقات

| فصل | وصف |
| --- | --- |
| [Box](./box) | صندوق . |
| [Camera](./camera) | تصف الكاميرا نقطة عين المشاهد عند النظر إلى المشهد. |
| [Circle](./circle) | أ[`Circle`](../aspose.threed.entities/circle) يتكون المنحنى من مجموعة من النقاط في حافة شكل الدائرة . |
| [CompositeCurve](./compositecurve) | أ[`CompositeCurve`](../aspose.threed.entities/compositecurve) يتكون من عدة مقاطع منحنى. |
| [Curve](./curve) | الفئة الأساسية لجميع تطبيقات المنحنى . |
| [Cylinder](./cylinder) | أسطوانة ذات معلمة . يمكن استخدامها أيضًا لتمثيل المخروط عندما يكون أحد نصف القطر أعلى / نصف قطر أسفل صفر . |
| [Dish](./dish) | طبق ذو معايير . |
| [Ellipse](./ellipse) | أن[`Ellipse`](../aspose.threed.entities/ellipse)يحدد مجموعة من النقاط التي تشكل شكل القطع الناقص. |
| [Frustum](./frustum) | الفئة الأساسية لـ[`Camera`](../aspose.threed.entities/camera) و[`Light`](../aspose.threed.entities/light) |
| [Geometry](./geometry) | الفئة الأساسية لجميع الكائنات الهندسية القابلة للعرض (مثل[`Mesh`](../aspose.threed.entities/mesh) و[`NurbsSurface`](../aspose.threed.entities/nurbssurface) و[`Patch`](../aspose.threed.entities/patch) وما إلى ذلك) . |
| [Light](./light) | يضيء الضوء المشهد . |
| [Line](./line) | الخط متعدد الخطوط هو مسار محدد بمجموعة من النقاط ذات[`ControlPoints`](../aspose.threed.entities/geometry/controlpoints) ، ومتصل بواسطة[`Segments`](../aspose.threed.entities/line/segments) ، مما يعني أنه يمكن أيضًا أن يكون مجموعة من مقاطع الخط المتصلة.[`NurbsCurve`](../aspose.threed.entities/nurbscurve) . |
| [LinearExtrusion](./linearextrusion) | يأخذ البثق الخطي شكلًا ثنائي الأبعاد كمدخل ويمتد الشكل في البعد الثالث. |
| [Mesh](./mesh) | شبكة مكونة من العديد من المضلعات n-sided . |
| [NurbsCurve](./nurbscurve) | [منحنى NURBS](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline) هو منحنى يمثله NURBS (شريحة أساس منطقي غير موحد) ، يتم تعريف منحنى NURBS من خلال[`Order`](../aspose.threed.entities/nurbscurve/order) ، مجموعة مرجحة[`ControlPoints`](../aspose.threed.entities/geometry/controlpoints) و أ[`KnotVectors`](../aspose.threed.entities/nurbscurve/knotvectors) يتم استخدام المكون w في نقطة التحكم كوزن لنقطة التحكم ، مهما كانTwoDimensional أوThreeDimensional |
| [NurbsDirection](./nurbsdirection) | ثلاثي الأبعاد[`NurbsSurface`](../aspose.threed.entities/nurbssurface) له اتجاهين ، و[`U`](../aspose.threed.entities/nurbssurface/u) و[`V`](../aspose.threed.entities/nurbssurface/v) ، ال[`NurbsDirection`](../aspose.threed.entities/nurbsdirection) يحدد البيانات لكل اتجاه. الاتجاه هو في الواقع منحنى NURBS ، وهذا يعني أنه يتم تعريفه أيضًا من خلال[`Order`](../aspose.threed.entities/nurbsdirection/order) ، أ[`KnotVectors`](../aspose.threed.entities/nurbsdirection/knotvectors) ، ومجموعة من نقاط التحكم الموزونة (المحددة في[`NurbsSurface`](../aspose.threed.entities/nurbssurface) ) . |
| [NurbsSurface](./nurbssurface) | [`NurbsSurface`](../aspose.threed.entities/nurbssurface) هو سطح يمثله[NURBS (خدد أساس عقلاني غير موحد)](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline)، أ[`NurbsSurface`](../aspose.threed.entities/nurbssurface) يتم تعريفه من قبل اثنين[`NurbsDirection`](../aspose.threed.entities/nurbsdirection)[`U`](../aspose.threed.entities/nurbssurface/u) و[`V`](../aspose.threed.entities/nurbssurface/v) . يتم استخدام المكون w في نقطة التحكم كوزن لنقطة التحكم بغض النظر عن نوع الاتجاهTwoDimensional أوThreeDimensional |
| [Patch](./patch) | أ[`Patch`](../aspose.threed.entities/patch) هو سطح نمذجة حدودي ، مشابه لـ[`NurbsSurface`](../aspose.threed.entities/nurbssurface) ، يتم تعريفه أيضًا بواسطة اثنين [`PatchDirection`](../aspose.threed.entities/patchdirection) ، ال[`U`](../aspose.threed.entities/patch/u) و[`V`](../aspose.threed.entities/patch/v) . لكن الفرق بين[`Patch`](../aspose.threed.entities/patch) و[`NurbsSurface`](../aspose.threed.entities/nurbssurface) هل هذا هو[`PatchDirection`](../aspose.threed.entities/patchdirection) منحنى يمكن أن يكون واحدًا منBezier وQuadraticBezier وBasisSpline وCardinalSpline وLinear |
| [PatchDirection](./patchdirection) | اتجاه التصحيح U و V . |
| [Plane](./plane) | طائرة ذات معلمات . |
| [PointCloud](./pointcloud) | لا تحتوي سحابة النقاط على معلومات هيكل ولكن فقط نقاط التحكم وعناصر الرأس. |
| [PolygonBuilder](./polygonbuilder) | صنف مساعد لبناء المضلع من أجله[`Mesh`](../aspose.threed.entities/mesh) |
| [PolygonModifier](./polygonmodifier) | أدوات لتعديل المضلعات |
| [Primitive](./primitive) | الفئة الأساسية لجميع الأوليات |
| [Pyramid](./pyramid) | هرم ذو معلمات . |
| [RectangularTorus](./rectangulartorus) | حلقة مستطيلة ذات معلمات. |
| [RevolvedAreaSolid](./revolvedareasolid) | تمثل هذه الفئة نموذجًا صلبًا من خلال تدوير مقطع عرضي يوفره ملف تعريف حول محور. |
| [Shape](./shape) | يصف الشكل التشوه في مجموعة من نقاط التحكم ، وهو مشابه لمشوه الكتلة في Maya . على سبيل المثال ، يمكننا إضافة شكل إلى هندسة تم إنشاؤها. والشكل والهندسة لهما نفس المعلومات الطوبولوجية لكنهما يختلفان في موضع نقاط التحكم. مع كميات مختلفة من التأثير ، تؤدي الهندسة تأثير تشوه. |
| [Skeleton](./skeleton) | ملف[`Skeleton`](../aspose.threed.entities/skeleton)يتم استخدامه بشكل أساسي بواسطة برنامج CAD لمساعدة المصمم على معالجة تحول الهيكل العظمي ، وعادة ما يكون غير مفيد خارج برامج CAD.[`Skeleton`](../aspose.threed.entities/skeleton) العقدة كجذر واحد من خلال الإعداد[`Type`](../aspose.threed.entities/skeleton/type) إلىSkeleton و وجميع الأطفال مضبوطين علىBone |
| [Sphere](./sphere) | المجال ذي المعلمات . |
| [SweptAreaSolid](./sweptareasolid) | أ[`SweptAreaSolid`](../aspose.threed.entities/sweptareasolid) يُنشئ هندسة عن طريق مسح ملف تعريف على طول دليل. |
| [Torus](./torus) | حلقة معلمة . |
| [TransformedCurve](./transformedcurve) | أ[`TransformedCurve`](../aspose.threed.entities/transformedcurve) يعطي منحنى موضعًا باستخدام مصفوفة التحويل . هذا يسمح بإجراء تحويل داخل[`TrimmedCurve`](../aspose.threed.entities/trimmedcurve) أو[`CompositeCurve`](../aspose.threed.entities/compositecurve) . |
| [TriMesh](./trimesh) | يحتوي TriMesh على بيانات أولية يمكن استخدامها بواسطة وحدة معالجة الرسومات مباشرةً. |
| [TriMesh&lt;T&gt;](./trimesh-1) | نسخة عامة من[`TriMesh`](../aspose.threed.entities/trimesh) لنوع قمة الرأس المحددة الثابتة للمستخدم |
| [TrimmedCurve](./trimmedcurve) | منحنى محدد قام بقص منحنى الأساس عند كلا الطرفين. |
| [VertexElement](./vertexelement) | الفئة الأساسية لعناصر الرأس . يتم تحديد نوع عنصر الرأس بواسطة VertexElementType. يصف VertexElement كيف يتم تعيين عنصر الرأس إلى سطح هندسي وكيف يتم ترتيب معلومات التعيين في الذاكرة. يحتوي VertexElement على معلومات قياسية أو UV أو أي نوع آخر من المعلومات. |
| [VertexElementBinormal](./vertexelementbinormal) | يحدد المتجهات ثنائية الشكل للمكونات المحددة. |
| [VertexElementDoublesTemplate](./vertexelementdoublestemplate) | صنف مساعد لتعريف الخرسانة[`VertexElement`](../aspose.threed.entities/vertexelement) تطبيقات . |
| [VertexElementEdgeCrease](./vertexelementedgecrease) | يحدد تجعد الحافة لمكونات محددة |
| [VertexElementHole](./vertexelementhole) | يحدد ما إذا كان المضلع المحدد هو hole |
| [VertexElementIntsTemplate](./vertexelementintstemplate) | صنف مساعد لتعريف الخرسانة[`VertexElement`](../aspose.threed.entities/vertexelement) تطبيقات . |
| [VertexElementMaterial](./vertexelementmaterial) | يحدد فهرس المواد للمكونات المحددة. يمكن أن تحتوي العقدة على مواد متعددة ،[`VertexElementMaterial`](../aspose.threed.entities/vertexelementmaterial) يستخدم لتقديم جزء مختلف من الهندسة في مواد مختلفة. |
| [VertexElementNormal](./vertexelementnormal) | يحدد المتجهات العادية للمكونات المحددة. |
| [VertexElementPolygonGroup](./vertexelementpolygongroup) | تحدد مجموعة المضلعات للمكونات المحددة لتجميع المضلعات ذات الصلة معًا. |
| [VertexElementSmoothingGroup](./vertexelementsmoothinggroup) | مجموعة التنعيم هي مجموعة من المضلعات في شبكة مضلعة والتي يجب أن تظهر لتشكل سطحًا أملسًا. بعض برامج النمذجة ثلاثية الأبعاد المبكرة مثل 3D studio max for DOS تستخدم مجموعة تجانس لإلغاء تخزين المتجه العادي لكل قمة شبكة. |
| [VertexElementSpecular](./vertexelementspecular) | يحدد لونًا مميزًا للمكونات المحددة. |
| [VertexElementTangent](./vertexelementtangent) | يحدد موجهات الظل للمكونات المحددة. |
| [VertexElementTemplate&lt;T&gt;](./vertexelementtemplate-1) | صنف مساعد لتعريف الخرسانة[`VertexElement`](../aspose.threed.entities/vertexelement) تطبيقات . |
| [VertexElementUserData](./vertexelementuserdata) | يحدد بيانات المستخدم المخصصة لمكونات محددة . عادةً ما تكون بيانات خاصة بالتطبيق لأغراض خاصة . |
| [VertexElementUV](./vertexelementuv) | يحدد إحداثيات الأشعة فوق البنفسجية للمكونات المحددة . يمكن أن يكون للشكل الهندسي عدة مكونات[`VertexElementUV`](../aspose.threed.entities/vertexelementuv) العناصر ، ولكل عنصر مختلف[`TextureMapping`](../aspose.threed.entities/texturemapping) s. |
| [VertexElementVector4](./vertexelementvector4) | صنف مساعد لتعريف الخرسانة[`VertexElement`](../aspose.threed.entities/vertexelement) تطبيقات . |
| [VertexElementVertexColor](./vertexelementvertexcolor) | يحدد لون الرأس للمكونات المحددة |
| [VertexElementVertexCrease](./vertexelementvertexcrease) | يحدد تجعيد الرأس للمكونات المحددة |
| [VertexElementVisibility](./vertexelementvisibility) | يحدد ما إذا كانت المكونات المحددة مرئية |
| [VertexElementWeight](./vertexelementweight) | يحدد وزن المزج للمكونات المحددة. |
## واجهات

| واجهه المستخدم | وصف |
| --- | --- |
| [IIndexedVertexElement](./iindexedvertexelement) | VertexElement مع بيانات المؤشرات . |
| [IMeshConvertible](./imeshconvertible) | يمكن تحويل الكيانات التي طبقت هذه الواجهة إليها[`Mesh`](../aspose.threed.entities/mesh) |
| [IOrientable](./iorientable) | يجب على الكيانات القابلة للتوجيه تنفيذ هذه الواجهة. |
## تعداد

| تعداد | وصف |
| --- | --- |
| [ApertureMode](./aperturemode) | أوضاع فتحة الكاميرا . يحدد وضع الفتحة القيم التي تدفع فتحة الكاميرا. إذا كان وضع الفتحة هو HorizAndVert أو Horizontal أو Vertical ، فسيتم استخدام مجال الرؤية. إذا كان وضع الفتحة هو FocalLength ، فسيتم استخدام البعد البؤري. |
| [CurveDimension](./curvedimension) | أبعاد المنحنيات. |
| [LightType](./lighttype) | أنواع الإضاءة . |
| [MappingMode](./mappingmode) | يحدد كيفية تعيين العنصر إلى السطح. ملف[`MappingMode`](../aspose.threed.entities/mappingmode) عرفت كيف[`VertexElement`](../aspose.threed.entities/vertexelement) تم تعيينه على سطح الهندسة . |
| [NurbsType](./nurbstype) | أنواع NURBS . |
| [PatchDirectionType](./patchdirectiontype) | أنواع اتجاهات التصحيح . |
| [ProjectionType](./projectiontype) | أنواع عرض الكاميرا . |
| [ReferenceMode](./referencemode) | [`ReferenceMode`](../aspose.threed.entities/referencemode) يحدد كيفية تخزين معلومات التعيين والإشارة إليها بواسطة. |
| [RotationMode](./rotationmode) | وضع دوران frustum |
| [SkeletonType](./skeletontype) | [`Skeleton`](../aspose.threed.entities/skeleton) أنواع الصورة. |
| [SplitMeshPolicy](./splitmeshpolicy) | مشاركة بيانات نقطة الرأس / التحكم بين الشبكات الفرعية أو تحتوي كل شبكة فرعية على بياناتها المضغوطة . |
| [TextureMapping](./texturemapping) | نوع تعيين النسيج لـ[`VertexElementUV`](../aspose.threed.entities/vertexelementuv) يصف نوع تعيين النسيج المستخدم. |
| [VertexElementType](./vertexelementtype) | نوع عنصر الرأس ، حدد كيف سيتم استخدامه في النمذجة. |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
