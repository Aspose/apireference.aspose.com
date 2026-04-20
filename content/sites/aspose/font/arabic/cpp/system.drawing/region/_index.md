---
title: "System::Drawing::Region فئة"
linktitle: "Region"
second_title: "Aspose.Font لـ C++"
description: "System::Drawing::Region فئة. تمثل داخل الشكل الرسومي. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2100
url: /ar/cpp/system.drawing/region/
---
## Region class


تمثل داخل الشكل الرسومي. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class Region : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clone](./clone/)() const | يعيد نسخة من الكائن الحالي. |
| [Complement](./complement/)(const RectangleF\&) | يستبدل المنطقة التي يمثلها الكائن الحالي بالجزء من المنطقة المحددة بواسطة المستطيل المحدد والذي لا يتقاطع مع هذه المنطقة. |
| [Complement](./complement/)(const Rectangle\&) | يستبدل المنطقة التي يمثلها الكائن الحالي بالجزء من المنطقة المحددة بواسطة المستطيل المحدد والذي لا يتقاطع مع هذه المنطقة. |
| [Complement](./complement/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | يستبدل المنطقة التي يمثلها الكائن الحالي بالجزء من المنطقة المحددة بواسطة المسار المحدد والذي لا يتقاطع مع هذه المنطقة. |
| [Complement](./complement/)(const SharedPtr\<Region\>\&) | يستبدل المنطقة التي يمثلها الكائن الحالي بالجزء من المنطقة المحددة التي لا تتقاطع مع هذه المنطقة. |
| [Dispose](./dispose/)() | يطلق جميع موارد نظام التشغيل التي حصل عليها الكائن الحالي. |
| [Equals](./equals/)(const SharedPtr\<Region\>\&, const SharedPtr\<Graphics\>\&) | يحدد ما إذا كانت المنطقة المحددة مطابقة للمنطقة التي يمثلها الكائن الحالي على سطح الرسم المحدد. |
| [Exclude](./exclude/)(const RectangleF\&) | يستبدل المنطقة التي يمثلها الكائن الحالي بنتيجة استبعاد المنطقة المحددة بواسطة المستطيل المحدد منها. |
| [Exclude](./exclude/)(const Rectangle\&) | يستبدل المنطقة التي يمثلها الكائن الحالي بنتيجة استبعاد المنطقة المحددة بواسطة المستطيل المحدد منها. |
| [Exclude](./exclude/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | يستبدل المنطقة التي يمثلها الكائن الحالي بنتيجة استبعاد المنطقة المحددة بواسطة المسار المحدد منها. |
| [Exclude](./exclude/)(const SharedPtr\<Region\>\&) | يستبدل المنطقة التي يمثلها الكائن الحالي بنتيجة استبعاد المنطقة المحددة منها. |
| [GetBounds](./getbounds/)(const SharedPtr\<Graphics\>\&) const | يحصل على بنية [RectangleF](../rectanglef/) التي تمثل مستطيلًا يحد هذه [Region](./) على سطح الرسم لكائن [Graphics](../graphics/). |
| [GetRegionData](./getregiondata/)() const | يعيد كائن RegionData يحتوي على البيانات التي تُعرّف المنطقة التي يمثلها الكائن الحالي. |
| [GetRegionScans](./getregionscans/)(const SharedPtr\<Drawing2D::Matrix\>\&) const | يعيد مصفوفة من بنى [RectangleF](../rectanglef/) التي تقرب هذه [Region](./) بعد تطبيق التحويل المصفوفي المحدد. |
| [Intersect](./intersect/)(const RectangleF\&) | يستبدل المنطقة التي يمثلها الكائن الحالي بنتيجة تقاطع هذه المنطقة مع منطقة محددة بواسطة المستطيل المحدد. |
| [Intersect](./intersect/)(const Rectangle\&) | يستبدل المنطقة التي يمثلها الكائن الحالي بنتيجة تقاطع هذه المنطقة مع منطقة محددة بواسطة المستطيل المحدد. |
| [Intersect](./intersect/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | يستبدل المنطقة التي يمثلها الكائن الحالي بنتيجة تقاطع هذه المنطقة ومنطقة معرفة بالمسار المحدد. |
| [Intersect](./intersect/)(const SharedPtr\<Region\>\&) | يستبدل المنطقة التي يمثلها الكائن الحالي بنتيجة تقاطع هذه المنطقة والمنطقة المحددة. |
| [IsEmpty](./isempty/)(const SharedPtr\<Graphics\>\&) const | يحدد ما إذا كانت المنطقة التي يمثلها الكائن الحالي ذات داخلية فارغة على سطح الرسم المحدد. |
| [IsInfinite](./isinfinite/)(const SharedPtr\<Graphics\>\&) const | يحدد ما إذا كانت المنطقة التي يمثلها الكائن الحالي ذات داخلية لا نهائية على سطح الرسم المحدد. |
| [IsVisible](./isvisible/)(const Point\&) const | يحدد ما إذا كانت النقطة المحددة موجودة داخل المنطقة التي يمثلها الكائن الحالي. |
| [IsVisible](./isvisible/)(const PointF\&) const | يحدد ما إذا كانت النقطة المحددة موجودة داخل المنطقة التي يمثلها الكائن الحالي. |
| [IsVisible](./isvisible/)(const Rectangle\&) | يحدد ما إذا كان أي جزء من المستطيل المحدد موجودًا داخل المنطقة التي يمثلها الكائن الحالي. |
| [IsVisible](./isvisible/)(const RectangleF\&) | يحدد ما إذا كان أي جزء من المستطيل المحدد موجودًا داخل المنطقة التي يمثلها الكائن الحالي. |
| [IsVisible](./isvisible/)(const Point\&, const SharedPtr\<Graphics\>\&) const | يحدد ما إذا كانت النقطة المحددة موجودة داخل المنطقة التي يمثلها الكائن الحالي باستخدام الرسومات المحددة. |
| [IsVisible](./isvisible/)(const PointF\&, const SharedPtr\<Graphics\>\&) const | يحدد ما إذا كانت النقطة المحددة موجودة داخل المنطقة التي يمثلها الكائن الحالي باستخدام الرسومات المحددة. |
| [IsVisible](./isvisible/)(const Rectangle\&, const SharedPtr\<Graphics\>\&) | يحدد ما إذا كان أي جزء من المستطيل المحدد موجودًا داخل المنطقة التي يمثلها الكائن الحالي باستخدام الرسومات المحددة. |
| [IsVisible](./isvisible/)(const RectangleF\&, const SharedPtr\<Graphics\>\&) | يحدد ما إذا كان أي جزء من المستطيل المحدد موجودًا داخل المنطقة التي يمثلها الكائن الحالي باستخدام الرسومات المحددة. |
| [IsVisible](./isvisible/)(float, float) const | يحدد ما إذا كانت النقطة المحددة موجودة داخل المنطقة التي يمثلها الكائن الحالي. |
| [IsVisible](./isvisible/)(float, float, const SharedPtr\<Graphics\>\&) const | يحدد ما إذا كانت النقطة المحددة موجودة داخل المنطقة التي يمثلها الكائن الحالي باستخدام الرسومات المحددة. |
| [MakeEmpty](./makeempty/)() | يُهيئ الكائن الحالي ليكون ذا داخلية فارغة. |
| [MakeInfinite](./makeinfinite/)() | يُهيئ كائن المنطقة هذا ليكون ذا داخلية لا نهائية. |
| [Region](./region/)() | ينشئ مثيلاً جديدًا من الفئة [Region](./). |
| [Region](./region/)(const RectangleF\&) | ينشئ مثيلاً جديدًا من الفئة [Region](./) التي تمثل منطقة معرفة بالمستطيل المحدد. |
| [Region](./region/)(const Rectangle\&) | ينشئ مثيلاً جديدًا من الفئة [Region](./) التي تمثل منطقة معرفة بالمستطيل المحدد. |
| [Region](./region/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | ينشئ مثيلاً جديدًا من الفئة [Region](./) التي تمثل منطقة معرفة بالمسار المحدد. |
| [Region](./region/)(const SkPath\&) |  |
| [Region](./region/)(const SharedPtr\<Drawing2D::RegionData\>\&) | ينشئ مثيلاً جديدًا من الفئة [Region](./) التي تمثل منطقة معرفة بكائن RegionData المحدد. |
| [Transform](./transform/)(const SharedPtr\<Drawing2D::Matrix\>\&) | يحوّل هذه المنطقة بالمصفوفة المحددة. |
| [Transform](./transform/)(const SkMatrix\&) | يحوّل هذه المنطقة بالمصفوفة المحددة. |
| [Translate](./translate/)(int, int) | ينقل إحداثيات المنطقة بالمقدار المحدد. |
| [Translate](./translate/)(float, float) | ينقل إحداثيات المنطقة بالمقدار المحدد. |
| [Union](./union/)(const RectangleF\&) | يستبدل المنطقة التي يمثلها الكائن الحالي بنتيجة عملية الاتحاد بين هذه المنطقة ومنطقة معرفة بالمستطيل المحدد. |
| [Union](./union/)(const Rectangle\&) | يستبدل المنطقة التي يمثلها الكائن الحالي بنتيجة اتحاد هذه المنطقة ومنطقة معرفة بالمستطيل المحدد. |
| [Union](./union/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | يستبدل المنطقة التي يمثلها الكائن الحالي بنتيجة اتحاد هذه المنطقة ومنطقة معرفة بالمسار المحدد. |
| [Union](./union/)(const SharedPtr\<Region\>\&) | يستبدل المنطقة التي يمثلها الكائن الحالي بنتيجة اتحاد هذه المنطقة والمنطقة المحددة. |
| [Xor](./xor/)(const RectangleF\&) | يستبدل المنطقة التي يمثلها الكائن الحالي بأجزاء هذه المنطقة والمنطقة المعرفة بالمستطيل المحدد التي لا تتقاطع. |
| [Xor](./xor/)(const Rectangle\&) | يستبدل المنطقة التي يمثلها الكائن الحالي بأجزاء هذه المنطقة والمنطقة المعرفة بالمستطيل المحدد التي لا تتقاطع. |
| [Xor](./xor/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | يستبدل المنطقة التي يمثلها الكائن الحالي بأجزاء هذه المنطقة والمنطقة المعرفة بالمسار المحدد التي لا تتقاطع. |
| [Xor](./xor/)(const SharedPtr\<Region\>\&) | يستبدل المنطقة التي يمثلها الكائن الحالي بأجزاء هذه المنطقة والمنطقة المحددة التي لا تتقاطع. |
| virtual [~Region](./~region/)() | المدمر. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
