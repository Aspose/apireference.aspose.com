---
title: Class CSSPrimitiveValue
second_title: Aspose.SVG لمرجع .NET API
description: Aspose.Svg.Dom.Css.CSSPrimitiveValue فصل. تمثل واجهة CSSPrimitiveValue قيمة CSS واحدة. يمكن استخدام هذه الواجهة لتحديد قيمة خاصية نمط معينة تم تعيينها حاليًا في كتلة أو لتعيين خاصية نمط معينة بشكل صريح داخل الكتلة. يمكن الحصول على مثيل لهذه الواجهة من طريقة getPropertyCSSValue لواجهة CSSStyleDeclusion. لا يحدث كائن CSSPrimitiveValue إلا في سياق خاصية CSS.
type: docs
weight: 480
url: /ar/net/aspose.svg.dom.css/cssprimitivevalue/
---
## CSSPrimitiveValue class

تمثل واجهة CSSPrimitiveValue قيمة CSS واحدة. يمكن استخدام هذه الواجهة لتحديد قيمة خاصية نمط معينة تم تعيينها حاليًا في كتلة أو لتعيين خاصية نمط معينة بشكل صريح داخل الكتلة. يمكن الحصول على مثيل لهذه الواجهة من طريقة getPropertyCSSValue لواجهة CSSStyleDeclusion. لا يحدث كائن CSSPrimitiveValue إلا في سياق خاصية CSS.

```csharp
public abstract class CSSPrimitiveValue : CSSValue
```

## الخصائص

| اسم | وصف |
| --- | --- |
| abstract [CSSText](../../aspose.svg.dom.css/cssvalue/csstext/) { get; set; } | تمثيل سلسلة للقيمة الحالية. |
| [CSSValueType](../../aspose.svg.dom.css/cssvalue/cssvaluetype/) { get; } | كود يحدد نوع القيمة. |
| [PrimitiveType](../../aspose.svg.dom.css/cssprimitivevalue/primitivetype/) { get; } | نوع القيمة كما حددتها الثوابت المحددة أعلاه. |

## طُرق

| اسم | وصف |
| --- | --- |
| override [Equals](../../aspose.svg.dom.css/cssvalue/equals/)(object) | تحديد ما إذا كان الملف المحددObject يساوي هذا المثال. |
| abstract [GetCounterValue](../../aspose.svg.dom.css/cssprimitivevalue/getcountervalue/)() | تُستخدم هذه الطريقة للحصول على قيمة العداد. إذا كانت قيمة CSS هذه لا تحتوي على قيمة عداد ، فسيتم رفع DOMException. يمكن إجراء التعديل على خاصية النمط المقابلة باستخدام واجهة العداد. |
| abstract [GetFloatValue](../../aspose.svg.dom.css/cssprimitivevalue/getfloatvalue/)(ushort) | تُستخدم هذه الطريقة للحصول على قيمة عائمة في وحدة محددة. إذا كانت قيمة CSS هذه لا تحتوي على قيمة عائمة أو لا يمكن تحويلها إلى الوحدة المحددة ، فسيتم رفع استثناء DOM. |
| override [GetHashCode](../../aspose.svg.dom.css/cssvalue/gethashcode/)() | إرجاع رمز تجزئة لهذا المثال. |
| abstract [GetIntValue](../../aspose.svg.dom.css/cssprimitivevalue/getintvalue/)(ushort) | تُستخدم هذه الطريقة للحصول على قيمة int في وحدة محددة. إذا كانت قيمة CSS هذه لا تحتوي على قيمة int أو لا يمكن تحويلها إلى الوحدة المحددة ، فسيتم رفع استثناء DOM. |
| override [GetPlatformType](../../aspose.svg.dom.css/cssvalue/getplatformtype/)() | تُستخدم هذه الطريقة لاسترداد كائن ECMAScriptType . |
| abstract [GetRectValue](../../aspose.svg.dom.css/cssprimitivevalue/getrectvalue/)() | تُستخدم هذه الطريقة للحصول على قيمة Rect. إذا كانت قيمة CSS هذه لا تحتوي على قيمة مستقيمة ، فسيتم رفع DOMException. يمكن إجراء التعديل على خاصية النمط المقابلة باستخدام واجهة Rect. |
| abstract [GetRGBColorValue](../../aspose.svg.dom.css/cssprimitivevalue/getrgbcolorvalue/)() | تستخدم هذه الطريقة للحصول على لون RGB. إذا كانت قيمة CSS هذه لا تحتوي على قيمة ألوان RGB ، فسيتم رفع DOMException. يمكن إجراء التعديل على خاصية النمط المقابلة باستخدام واجهة RGBColor. |
| abstract [GetStringValue](../../aspose.svg.dom.css/cssprimitivevalue/getstringvalue/)() | تُستخدم هذه الطريقة للحصول على قيمة السلسلة. إذا كانت قيمة CSS لا تحتوي على قيمة سلسلة ، فسيتم رفع استثناء DOM. |
| abstract [SetFloatValue](../../aspose.svg.dom.css/cssprimitivevalue/setfloatvalue/)(ushort, float) | طريقة لتعيين قيمة عائمة بوحدة محددة. إذا كانت الخاصية المرفقة بهذه القيمة لا تقبل الوحدة المحددة أو القيمة العائمة ، فلن تتغير القيمة وسيتم رفع استثناء DOM. |
| abstract [SetIntValue](../../aspose.svg.dom.css/cssprimitivevalue/setintvalue/)(ushort, int) | طريقة لتعيين قيمة int بوحدة محددة. إذا كانت الخاصية المرفقة بهذه القيمة لا تقبل الوحدة المحددة أو القيمة int ، فلن تتغير القيمة وسيتم رفع استثناء DOM. |
| abstract [SetStringValue](../../aspose.svg.dom.css/cssprimitivevalue/setstringvalue/)(ushort, string) | طريقة لضبط قيمة السلسلة بالوحدة المحددة. إذا كانت الخاصية المرفقة بهذه القيمة لا تقبل الوحدة المحددة أو قيمة السلسلة ، فلن تتغير القيمة وسيتم رفع استثناء DOM. |
| override [ToString](../../aspose.svg.dom.css/cssvalue/tostring/)() | إرجاع أString الذي يمثل هذا المثال. |

## مجالات

| اسم | وصف |
| --- | --- |
| const [CSS_ATTR](../../aspose.svg.dom.css/cssprimitivevalue/css_attr/) | القيمة هي دالة سمة. يمكن الحصول على القيمة باستخدام طريقة getStringValue. |
| const [CSS_CH](../../aspose.svg.dom.css/cssprimitivevalue/css_ch/) | القيمة طول (ch). يمكن الحصول على القيمة باستخدام طريقة getFloatValue. |
| const [CSS_CM](../../aspose.svg.dom.css/cssprimitivevalue/css_cm/) | القيمة طول (سم). يمكن الحصول على القيمة باستخدام طريقة getFloatValue. |
| const [CSS_COUNTER](../../aspose.svg.dom.css/cssprimitivevalue/css_counter/) | القيمة هي عداد أو دالة عدادات. يمكن الحصول على القيمة باستخدام طريقة GetCounterValue. |
| const [CSS_DEG](../../aspose.svg.dom.css/cssprimitivevalue/css_deg/) | القيمة هي زاوية (درجة). يمكن الحصول على القيمة باستخدام طريقة getFloatValue. |
| const [CSS_DIMENSION](../../aspose.svg.dom.css/cssprimitivevalue/css_dimension/) | القيمة هي رقم ذو بُعد غير معروف. يمكن الحصول على القيمة باستخدام طريقة getFloatValue. |
| const [CSS_DPCM](../../aspose.svg.dom.css/cssprimitivevalue/css_dpcm/) | القيمة هي نقطة لكل سنتيمتر (dpcm) . |
| const [CSS_DPI](../../aspose.svg.dom.css/cssprimitivevalue/css_dpi/) | القيمة هي نقطة في البوصة (dpi) . |
| const [CSS_DPPX](../../aspose.svg.dom.css/cssprimitivevalue/css_dppx/) | القيمة عبارة عن نقاط لكل وحدة "بكسل" (dppx) . |
| const [CSS_EMS](../../aspose.svg.dom.css/cssprimitivevalue/css_ems/) | القيمة طول (ems). يمكن الحصول على القيمة باستخدام طريقة getFloatValue. |
| const [CSS_EXS](../../aspose.svg.dom.css/cssprimitivevalue/css_exs/) | القيمة عبارة عن طول (exs). يمكن الحصول على القيمة باستخدام طريقة getFloatValue. |
| const [CSS_GRAD](../../aspose.svg.dom.css/cssprimitivevalue/css_grad/) | القيمة هي زاوية (غراد). يمكن الحصول على القيمة باستخدام طريقة getFloatValue. |
| const [CSS_HZ](../../aspose.svg.dom.css/cssprimitivevalue/css_hz/) | القيمة هي تردد (هرتز). يمكن الحصول على القيمة باستخدام طريقة getFloatValue. |
| const [CSS_IDENT](../../aspose.svg.dom.css/cssprimitivevalue/css_ident/) | القيمة معرّف. يمكن الحصول على القيمة باستخدام طريقة getStringValue. |
| const [CSS_IN](../../aspose.svg.dom.css/cssprimitivevalue/css_in/) | القيمة طول (بوصة). يمكن الحصول على القيمة باستخدام طريقة getFloatValue. |
| const [CSS_KHZ](../../aspose.svg.dom.css/cssprimitivevalue/css_khz/) | القيمة هي تردد (كيلو هرتز). يمكن الحصول على القيمة باستخدام طريقة getFloatValue. |
| const [CSS_MM](../../aspose.svg.dom.css/cssprimitivevalue/css_mm/) | القيمة طول (مم). يمكن الحصول على القيمة باستخدام طريقة getFloatValue. |
| const [CSS_MS](../../aspose.svg.dom.css/cssprimitivevalue/css_ms/) | القيمة وقت (مللي ثانية). يمكن الحصول على القيمة باستخدام طريقة getFloatValue. |
| const [CSS_NUMBER](../../aspose.svg.dom.css/cssprimitivevalue/css_number/) | القيمة هي رقم بسيط. يمكن الحصول على القيمة باستخدام طريقة getFloatValue. |
| const [CSS_PC](../../aspose.svg.dom.css/cssprimitivevalue/css_pc/) | القيمة طول (كمبيوتر). يمكن الحصول على القيمة باستخدام طريقة getFloatValue. |
| const [CSS_PERCENTAGE](../../aspose.svg.dom.css/cssprimitivevalue/css_percentage/) | القيمة هي نسبة مئوية. يمكن الحصول على القيمة باستخدام طريقة getFloatValue. |
| const [CSS_PT](../../aspose.svg.dom.css/cssprimitivevalue/css_pt/) | القيمة طول (نقطة). يمكن الحصول على القيمة باستخدام طريقة getFloatValue. |
| const [CSS_PX](../../aspose.svg.dom.css/cssprimitivevalue/css_px/) | القيمة طول (بكسل). يمكن الحصول على القيمة باستخدام طريقة getFloatValue. |
| const [CSS_RAD](../../aspose.svg.dom.css/cssprimitivevalue/css_rad/) | القيمة هي زاوية (rad). يمكن الحصول على القيمة باستخدام طريقة getFloatValue. |
| const [CSS_RECT](../../aspose.svg.dom.css/cssprimitivevalue/css_rect/) | القيمة هي دالة مستقيمة. يمكن الحصول على القيمة باستخدام طريقة GetRectValue. |
| const [CSS_REM](../../aspose.svg.dom.css/cssprimitivevalue/css_rem/) | القيمة طول (ريم). يمكن الحصول على القيمة باستخدام طريقة getFloatValue. |
| const [CSS_RGBCOLOR](../../aspose.svg.dom.css/cssprimitivevalue/css_rgbcolor/) | القيمة هي لون RGB. يمكن الحصول على القيمة باستخدام طريقة GetRGBColorValue. |
| const [CSS_S](../../aspose.svg.dom.css/cssprimitivevalue/css_s/) | القيمة هي الوقت (الأوقات). يمكن الحصول على القيمة باستخدام طريقة getFloatValue. |
| const [CSS_STRING](../../aspose.svg.dom.css/cssprimitivevalue/css_string/) | القيمة هي STRING. يمكن الحصول على القيمة باستخدام طريقة getStringValue. |
| const [CSS_UNKNOWN](../../aspose.svg.dom.css/cssprimitivevalue/css_unknown/) | القيمة ليست قيمة CSS2 معروفة. لا يمكن الحصول على القيمة إلا باستخدام السمة cssText. |
| const [CSS_URI](../../aspose.svg.dom.css/cssprimitivevalue/css_uri/) | القيمة هي URI. يمكن الحصول على القيمة باستخدام طريقة getStringValue. |
| const [CSS_VH](../../aspose.svg.dom.css/cssprimitivevalue/css_vh/) | القيمة هي نسبة مئوية من الارتفاع الكامل لإطار العرض . |
| const [CSS_VMAX](../../aspose.svg.dom.css/cssprimitivevalue/css_vmax/) | القيمة هي نسبة مئوية من عرض أو ارتفاع منفذ العرض ، أيهما أكبر. |
| const [CSS_VMIN](../../aspose.svg.dom.css/cssprimitivevalue/css_vmin/) | القيمة هي نسبة مئوية من عرض أو ارتفاع منفذ العرض ، أيهما أصغر. |
| const [CSS_VW](../../aspose.svg.dom.css/cssprimitivevalue/css_vw/) | القيمة هي نسبة مئوية من العرض الكامل لإطار العرض . |

### أنظر أيضا

* class [CSSValue](../cssvalue/)
* مساحة الاسم [Aspose.Svg.Dom.Css](../../aspose.svg.dom.css/)
* المجسم [Aspose.SVG](../../)


